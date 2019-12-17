package classes;

public class SquarePeg implements ISquarePeg {
    @Override
    public void insertIntoSquareHole(String message) {
        System.out.println("SquarePeg: insert into square hole, " + message);
    }
}