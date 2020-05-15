package cookies;
//managing two fields
public class CookieOrder {
    private int numBoxes;
    private String variety;
//constructor -setting fields up
    public CookieOrder(String localVariety, int localNumBoxes) {
        this.numBoxes = localNumBoxes;
        this.variety = localVariety;
    }
//access or method 1
    public int getNumberOfBoxes() {

        return this.numBoxes;
    }
//accessor method 2
    public String getVariety() {

        return this.variety;
    }
}
