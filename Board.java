public class Board {
    
    Tile[][] representation = new Tile[8][8];

    public Board() {

    }


    public String toString() {
        String board="";
        StringBuilder sB = new StringBuilder(board);
        for(int i=0;i<8;i++)
        {
            for(int b=0;b<8;b++)
            {
                if(representation[i][b]==null)
                {
                    sB.append("□");
                }
                else {
                    if (representation[i][b].piece.color == Color.BLACK) {
                        if (representation[i][b].piece.type == Type.KING)
                            sB.append("\u001b[38;2;0;0;0m♚");
                        if (representation[i][b].piece.type == Type.BISHOP)
                            sB.append("\u001b[38;2;0;0;0m♝");
                        if (representation[i][b].piece.type == Type.ROOK)
                            sB.append("\u001b[38;2;0;0;0m♜");
                        if (representation[i][b].piece.type == Type.QUEEN)
                            sB.append("\u001b[38;2;0;0;0m♛");
                        if (representation[i][b].piece.type == Type.KNIGHT)
                            sB.append("\u001b[38;2;0;0;0m♞");
                        if (representation[i][b].piece.type == Type.PAWN)
                            sB.append("\u001b[38;2;0;0;0m♟");
                    }
                    if (representation[i][b].piece.color == Color.WHITE) {
                        if (representation[i][b].piece.type == Type.KING)
                            sB.append("\u001b[38;2;255;255;255m♚");
                        if (representation[i][b].piece.type == Type.BISHOP)
                            sB.append("\u001b[38;2;255;255;255m♝");
                        if (representation[i][b].piece.type == Type.ROOK)
                            sB.append("\u001b[38;2;255;255;255m♜");
                        if (representation[i][b].piece.type == Type.QUEEN)
                            sB.append("\u001b[38;2;255;255;255m♛");
                        if (representation[i][b].piece.type == Type.KNIGHT)
                            sB.append("\u001b[38;2;255;255;255m♞");
                        if (representation[i][b].piece.type == Type.PAWN)
                            sB.append("\u001b[38;2;255;255;255m♟");

                    }
                }
            }
            sB.append("\n");
        }
        board=sB.toString();
        return board;
    }
}
