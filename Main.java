public class Main {
    public static void main(String[] args) {
        Board board = new Board();
//        Board board1 = new Board();
//        Board board2 = new Board();
//        Board board3 = new Board();

//        System.out.println(board);

        Piece blackRook = new Piece();
        blackRook.color = Color.BLACK;
        blackRook.type = Type.ROOK;

        board.representation[0][0] = new Tile();
        board.representation[0][0].piece = blackRook;

        board.representation[0][7] = new Tile();
        board.representation[0][7].piece = blackRook;

        Piece blackKnight = new Piece() ;
        blackKnight.color = Color.BLACK;
        blackKnight.type = Type.KNIGHT;

        board.representation[0][1] = new Tile();
        board.representation[0][1].piece = blackKnight;

        board.representation[0][6] = new Tile();
        board.representation[0][6].piece = blackKnight;

        Piece blackBishop = new Piece();
        blackBishop.color = Color.BLACK;
        blackBishop.color = Type.BISHOP;

        board.representation[0][2] = new Tile();
        board.representation[0][2].piece = blackBishop;

        board.representation[0][5] = new Tile();
        board.representation[0][5].piece = blackBishop;

        Piece blackQueen = new Piece();
        blackQueen.color = Color.BLACK;
        blackQueen.type = Type.QUEEN;

        board.representation[0][3] = new Tile();
        board.representation[0][3].piece = blackQueen;

        Piece blackKing = new Piece();
        blackKing.color = Color.BLACK;
        blackKing.type = Type.KING;

        board.representation[0][4] = new Tile();
        board.representation[0][4].piece = blackKing;

        Piece blackPawn = new Piece();
        blackPawn.color = Color.BLACK;
        blackPawn.type = Type.PAWN;

        board.representation[1][0] = new Tile();
        board.representation[1][0].piece = blackPawn;
        board.representation[1][1] = new Tile();
        board.representation[1][1].piece = blackPawn;
        board.representation[1][2] = new Tile();
        board.representation[1][2].piece = blackPawn;
        board.representation[1][3] = new Tile();
        board.representation[1][3].piece = blackPawn;
        board.representation[1][4] = new Tile();
        board.representation[1][4].piece = blackPawn;
        board.representation[1][5] = new Tile();
        board.representation[1][5].piece = blackPawn;
        board.representation[1][6] = new Tile();
        board.representation[1][6].piece = blackPawn;
        board.representation[1][7] = new Tile();
        board.representation[1][7].piece = blackPawn;

        Piece whiteRook = new Piece();
        whiteRook.color = Color.WHITE;
        whiteRook.type = Type.ROOK;

        board.representation[7][0] = new Tile();
        board.representation[7][0].piece = whiteRook;

        board.representation[7][7] = new Tile();
        board.representation[7][7].piece = whiteRook;

        Piece whiteKnight = new Piece() ;
        whiteKnight.color = Color.WHITE;
        whiteKnight.type = Type.KNIGHT;

        board.representation[7][1] = new Tile();
        board.representation[7][1].piece = whiteKnight;

        board.representation[7][6] = new Tile();
        board.representation[7][6].piece = whiteKnight;

        Piece whiteBishop = new Piece();
        whiteBishop.color = Color.WHITE;
        whiteBishop.color = Type.BISHOP;

        board.representation[7][2] = new Tile();
        board.representation[7][2].piece = whiteBishop;

        board.representation[7][5] = new Tile();
        board.representation[7][5].piece = whiteBishop;

        Piece whiteQueen = new Piece();
        whiteQueen.color = Color.WHITE;
        whiteQueen.type = Type.QUEEN;

        board.representation[7][4] = new Tile();
        board.representation[7][4].piece = whiteQueen;

        Piece whiteKing = new Piece();
        whiteKing.color = Color.WHITE;
        whiteKing.type = Type.KING;

        board.representation[7][3] = new Tile();
        board.representation[7][3].piece = whiteKing;

        Piece whitePawn = new Piece();
        whitePawn.color = Color.WHITE;
        whitePawn.type = Type.PAWN;

        board.representation[6][0] = new Tile();
        board.representation[6][0].piece = whitePawn;
        board.representation[6][1] = new Tile();
        board.representation[6][1].piece = whitePawn;
        board.representation[6][2] = new Tile();
        board.representation[6][2].piece = whitePawn;
        board.representation[6][3] = new Tile();
        board.representation[6][3].piece = whitePawn;
        board.representation[6][4] = new Tile();
        board.representation[6][4].piece = whitePawn;
        board.representation[6][5] = new Tile();
        board.representation[6][5].piece = whitePawn;
        board.representation[6][6] = new Tile();
        board.representation[6][6].piece = whitePawn;
        board.representation[6][7] = new Tile();
        board.representation[6][7].piece = whitePawn;
    }
}
