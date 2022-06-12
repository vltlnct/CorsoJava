package com.example.servingwebcontent;
import com.example.servingwebcontent.entity.User;
import org.springframework.stereotype.Component;

@Component
public class Incontro {

    User u1;
    User u2;
    Integer numberOfPlayer = 0;
    Integer lastButtonPressedU1 = 0;
    Integer lastButtonPressedU2 = 0;
    Integer playerTurn = 0;

    StatusGame statusGame;

    String[][] board = new String[3][3];
    private static final int rows = 3;
    private static final int columns = 3;

    public void resetGame(){
        numberOfPlayer = 0;
        lastButtonPressedU1 = 0;
        lastButtonPressedU2 = 0;
        playerTurn = 0;
        resetBoard();
        setU1(null);
        setU2(null);
    }

    public StatusGame getStatusGame() {
        return statusGame;
    }
    public void setStatusGame(StatusGame status) {
        this.statusGame = status;
    }

    public void resetBoard() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                board[i][j] = " ";
    }
    public String getBoard() {
        String r = "";
        for(int i=0; i<rows; i++)
        {
            r = r + " ";
            for (int j=0; j<columns ; j++)
                r= r + "|" + board[i][j] ;
            r = r + " \n";
        }
        return r;
    }
    public void setBoard(Integer userId, Integer pulsante)
    {
        int i=0;
        int j=0;
        if (pulsante > 6) {i = 2;}
        if ((pulsante <= 6) && (pulsante >= 4) ) {i = 1;}
        if (pulsante < 4) {i = 0;}

        j = (pulsante-1)%3;
        String symbol;

        if (getU1().getId() == userId)
            symbol = "X";
        else
            symbol = "O";

        if(board[i][j] != " ")
        {
            throw new IllegalArgumentException("Posizione occupata");
        }
        board[i][j] = symbol;

    }



    public Integer getLastButtonPressedU1() {
        return lastButtonPressedU1;
    }
    public void setLastButtonPressedU1(Integer lastButtonPressedU1) {
        this.lastButtonPressedU1 = lastButtonPressedU1;
    }

    public Integer getLastButtonPressedU2() {
        return lastButtonPressedU2;
    }
    public void setLastButtonPressedU2(Integer lastButtonPressedU2) {
        this.lastButtonPressedU2 = lastButtonPressedU2;
    }

    public Integer getNumberOfPlayer() {
        return numberOfPlayer;
    }
    public void setNumberOfPlayer(Integer numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public Integer getPlayerTurn() {
        return playerTurn;
    }
    public void setPlayerTurn(Integer playerTurn) {
        this.playerTurn = playerTurn;
    }

    public User getU1() {
        return u1;
    }
    public void setU1(User u1) {
        this.u1 = u1;
    }

    public User getU2() {
        return u2;
    }
    public void setU2(User u2) {
        this.u2 = u2;
    }

    public void analyzeGame()
    {
        int k = 0;
        int h = 0;
        // Verifico se il tris è presente in una riga
        for(int i=0; i<rows; i++)
        {
            for (int j=0; j<columns ; j++)
            {
                if(board[i][j]== "X")
                {
                    k++;
                    if(k==3){ setStatusGame(StatusGame.WINPLAYER1); }
                }
                else
                {
                    if(board[i][j] == "O")
                    {
                        h++;
                        if(h==3){ setStatusGame(StatusGame.WINPLAYER2); }
                    }
                }
            }
            k=0;
            h=0;
        }
        // Verifico se il tris è presente in una colonna
        for(int i=0; i<columns; i++)
        {
            for (int j=0; j<rows ; j++)
            {
                if(board[j][i]== "X")
                {
                    k++;
                    if(k==3){ setStatusGame(StatusGame.WINPLAYER1); }
                }
                else
                {
                    if(board[j][i] == "O")
                    {
                        h++;
                        if(h==3){ setStatusGame(StatusGame.WINPLAYER2); }
                    }
                }
            }
            k=0;
            h=0;
        }

        // Verifico se il tris è presente in una diagonale
        for(int i=0; i<rows; i++)
        {
            int j = i;
            if(board[i][j]== "X")
            {
                k++;
                if(k==3){ setStatusGame(StatusGame.WINPLAYER1); }
            }
            else
            {
                if(board[i][j] == "O")
                {
                    h++;
                    if(h==3){ setStatusGame(StatusGame.WINPLAYER2); }
                }
            }
        }
        k=0;
        h=0;
        int j = 2;
        for(int i=0; i<rows; i++)
        {
            if(board[i][j] == "X")
            {
                k++;
                if(k==3){ setStatusGame(StatusGame.WINPLAYER1); }
            }
            else
            {
                if(board[i][j] == "O")
                {
                    h++;
                    if(h==3){ setStatusGame(StatusGame.WINPLAYER2); }
                }
            }
            j--;
        }

        int contaCelleVuote = 0;
        for(int i=0; i<rows; i++) {
            for (j = 0; j < columns; j++) {
                if (board[i][j] == " ") {
                    contaCelleVuote++;
                }
            }
        }
        if (contaCelleVuote==0)
            setStatusGame(StatusGame.EVENGAME);
        else
            setStatusGame(StatusGame.TOBECONTINUE);
    }
}
