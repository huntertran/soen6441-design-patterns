package classes;

public class PegAdapter implements ISquarePeg, IRoundPeg {

    private RoundPeg roundPeg;
    private SquarePeg squarePeg;

    public PegAdapter(RoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    public PegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public void insertIntoRoundHole(String message) {
        squarePeg.insertIntoSquareHole(message);

    }

    @Override
    public void insertIntoSquareHole(String message) {
        roundPeg.insertIntoRoundHole(message);
    }

}