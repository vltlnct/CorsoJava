package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.Incontro;
import com.example.servingwebcontent.StatusGame;
import com.example.servingwebcontent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// This means URL's start with /myapp (after Application path)
@RequestMapping(path="/myapp")
public class UserControllerREST {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public Incontro match;

    @CrossOrigin
    @GetMapping("/pressedBtn")
    public String pressedBtn(@RequestParam Integer userId, @RequestParam Integer btnId) {
        System.out.println("pressedBtn -> userId = " + userId + " btnId = "+ btnId);

        match.setBoard(userId, btnId);
        if (match.getU1().getId() == userId)
        {
            match.setLastButtonPressedU1(btnId);
            // Fisso chi è il giocatore del prossimo turno
            match.setPlayerTurn(match.getU2().getId());}
        else
        {
            match.setLastButtonPressedU2(btnId);
            // Fisso chi è il giocatore del prossimo turno
            match.setPlayerTurn(match.getU1().getId());
        }

        System.out.println("Numero di giocatori registrati : "+ match.getNumberOfPlayer() );
        System.out.println("Ultimo giocatore che ha premuto : " +  userId);
        System.out.println("pulsante premuto : " +  btnId);
        System.out.println("Prossimo giocatore che deve giocare : " +  match.getPlayerTurn());
        System.out.println("pulsante restituito : " +  btnId.toString());

        // La restituzione del pulsante premuto lo uso come ACK per confermare la reg. della mossa
        return btnId.toString();

    }

    @GetMapping("/askForAction")
    public String askForAction(@RequestParam Integer userId) {
        System.out.println("askForAction -> userId = " + userId);

        if (match.getNumberOfPlayer() < 2) {
            // il secondo giocatore deve ancora fare login
            return "wait";
        }

        match.analyzeGame();
        StatusGame statoMatch = match.getStatusGame();
        System.out.println("Stato della matrice : " + match.getBoard());

        if (statoMatch == StatusGame.WINPLAYER1) {

            if (match.getU1().getId() == userId) {
                System.out.println("winner : " + match.getU1().getName());
                match.resetGame();
                return "winner";
            } else {
                System.out.println("loser : " + match.getU2().getName());
                return "loser";
            }

        }

        if (statoMatch == StatusGame.WINPLAYER2) {
            if (match.getU2().getId() == userId) {
                System.out.println("winner : " + match.getU2().getName());
                match.resetGame();
                return "winner";
            } else {
                System.out.println("loser : " + match.getU1().getName());
                return "loser";
            }
        }

        if (statoMatch == StatusGame.EVENGAME) {
            // la partita è finita in parità
            match.setStatusGame(StatusGame.ENDED);
            return "evengame";
        }

        if (statoMatch == StatusGame.ENDED) {
            // la partita è finita in parità
            // Avverto il secondo player
            match.resetGame();
            return "evengame";
        }

        /*
         Se arrivo qui è certamente il caso in cui la partita non è terminata
         (StatoPartita.TOBECONTINUE).
         Verifico se colui che mi ha inviato "askForAction" e che chiede di giocare è
         proprio il giocatore a cui spetterebbe fare la prossima mossa
        */
        if (match.getPlayerTurn() == userId) {
            // Lo era. Allora verifico chi è, per inviargli l'ultima mossa fatta dall'avversario
            if (match.getU1().getId() == userId) {
                return match.getLastButtonPressedU2().toString();
            }
            if (match.getU2().getId() == userId) {
                return match.getLastButtonPressedU1().toString();
            }
        }
        // Non toccava a lui giocare. Allora aspetterà ancora delayTime millisec.
         return "wait";
    }
}

