package com.example.servingwebcontent;

public enum StatusGame {

    WINPLAYER1(1, "Vince il primo User collegato (simbolo X)"),
    WINPLAYER2(2, "Vince il secondo User collegato (simbolo O)"),
    TOBECONTINUE(3, "La partita non è terminata"),
    EVENGAME(4, "La partità è in parità "),
    ENDED(5, "La partità è terminata in parità");

    public int getId() {
        return id;
    }
    public String getMessaggio() {
        return messaggio;
    }

    private Integer id;
    private String messaggio;

    StatusGame(int i, String s) {
        this.id = id;
        this.messaggio = s;
    }
}
