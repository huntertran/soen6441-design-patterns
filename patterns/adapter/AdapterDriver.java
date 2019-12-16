public class AdapterDriver {
    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg();
        SquarePeg squarePeg = new SquarePeg();

        squarePeg.insert("SquarePeg");

        SquarePeg wannaBeRound = new SquarePegToRoundPegAdapter(roundPeg);
        wannaBeRound.insert("Wanna be round");
    }
}