package classes;

public class ClassAdapterDriver {
    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg();
        SquarePeg squarePeg = new SquarePeg();

        squarePeg.insertIntoSquareHole("called from square peg object");
        roundPeg.insertIntoRoundHole("called from round peg object");

        ISquarePeg wannaBeRound = new PegAdapter(roundPeg);
        wannaBeRound.insertIntoSquareHole("called from squarePeg");

        IRoundPeg wannaBeSquare = new PegAdapter(squarePeg);
        wannaBeSquare.insertIntoRoundHole("called from round peg");
    }
}