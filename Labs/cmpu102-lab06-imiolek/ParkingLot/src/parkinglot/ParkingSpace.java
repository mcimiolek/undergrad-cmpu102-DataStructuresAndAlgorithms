package parkinglot;

public class ParkingSpace {
    public final static int SMALL = 0;
    public final static int MEDIUM = 1;
    public final static int LARGE = 2;
    protected int number;
    protected int size;
    public ParkingSpace(int s) {
        this(-1,s);
    }
    public ParkingSpace(int n, int s) {
        number = n;
        size = s;
    }
    
    public boolean equals(Object other) {
        ParkingSpace that = (ParkingSpace)other;
        return this.size == that.size;
    }
    
    public String toString() {
        String howBig = null;
        switch (size) {
            case 0 : howBig = "Small"; break;
            case 1 : howBig = "Medium"; break;
            case 2 : howBig = "Large"; break;
        }
        return "<ParkingSpace: Number: " + number + " Size: " + howBig + ">";
    }
}
