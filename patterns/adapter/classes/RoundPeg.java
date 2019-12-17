package classes;

public class RoundPeg implements IRoundPeg {

    @Override
    public void insertIntoRoundHole(String message) {
        System.out.println("RoundPeg: insert to round hole, " + message);
    }
}