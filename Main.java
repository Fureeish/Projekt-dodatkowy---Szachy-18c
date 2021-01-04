public class Main {
    public static void main(String[] args) {
        Piece[] whitePawns = new Piece[8];
        for (int i = 0; i < whitePawns.length; i++) {
            Piece newPiece = new Piece();
            newPiece.type = Type.PAWN;
            newPiece.color = Color.WHITE;
            whitePawns[i] = newPiece;
        }
    }
}
