package object;

public class SquarePegToRoundPegAdapter extends SquarePeg {
    private RoundPeg roundPeg;

    public SquarePegToRoundPegAdapter(RoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    public void insert(String string) {
        this.roundPeg.insertIntoHole(string);
    }
}