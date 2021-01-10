import java.awt.Color;

public class Board {
    Tile[][] representation = new Tile[8][8];

    public Board() {

    }

 /*   for(int i=0;i<8;i++)
    {
        for(int b=0;b<8;b++)
        {
            if(representation[i][b].piece.color==Color.BLACK)
            {
                if(representation[i][b].piece.type==Type.KING)
                    System.out.print("\u001b[38;2;0;0;0m♚");
                if(representation[i][b].piece.type==Type.BISHOP)
                    System.out.print("\u001b[38;2;0;0;0m♝");
                if(representation[i][b].piece.type==Type.ROOK)
                    System.out.print("\u001b[38;2;0;0;0m♜");
                if(representation[i][b].piece.type==Type.QUEEN)
                    System.out.print("\u001b[38;2;0;0;0m♛");
                if(representation[i][b].piece.type==Type.KNIGHT)
                    System.out.print("\u001b[38;2;0;0;0m♞");
                if(representation[i][b].piece.type==Type.PAWN)
                    System.out.print("\u001b[38;2;0;0;0m♟");
            }
            if(representation[i][b].piece.color == Color.WHITE)
            {
                if(representation[i][b].piece.type==Type.KING)
                    System.out.print("\u001b[38;2;255;255;255m♚");
                if(representation[i][b].piece.type==Type.BISHOP)
                    System.out.print("\u001b[38;2;255;255;255m♝");
                if(representation[i][b].piece.type==Type.ROOK)
                    System.out.print("\u001b[38;2;255;255;255m♜");
                if(representation[i][b].piece.type==Type.QUEEN)
                    System.out.print("\u001b[38;2;255;255;255m♛");
                if(representation[i][b].piece.type==Type.KNIGHT)
                    System.out.print("\u001b[38;2;255;255;255m♞");
                if(representation[i][b].piece.type==Type.PAWN)
                    System.out.print("\u001b[38;2;255;255;255m♟");

            }
            else
                System.out.print("puste pole");
        }
        System.out.println();
    }

  */
    public String toString() {
        return ("\u001b[48;2;255;255;255m\u001b[38;2;0;0;0m♚");
    }
}

