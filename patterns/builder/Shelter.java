public class Shelter {
    private String roof;
    private String structure;
    private String floor;

    public void setRoof(String newRoof) {
        roof = newRoof;
    }

    public void setStructure(String newStructure) {
        structure = newStructure;
    }

    public void setFloor(String newFloor) {
        floor = newFloor;
    }

    public String toString() {
        return new String("roof: " + roof + " | floor: " + floor + " | structure: " + structure);
    }
}