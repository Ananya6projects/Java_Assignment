package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Board;

public class BoardUser {

    private Board board;

    public BoardUser(Board board) {
        this.board = board;
        System.out.println("Using Board in BoardUser class");
    }

    public void execute() {
        System.out.println("Executing Board in BoardUser...");
        if (this.board != null) {
            this.board.operateBoard();
        } else {
            System.err.println("Board is null");
        }
    }
}
