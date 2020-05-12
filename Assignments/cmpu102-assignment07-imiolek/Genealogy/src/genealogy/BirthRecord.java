package genealogy;

public class BirthRecord implements Comparable<BirthRecord>{
    private String name;
    private int birthYear;
    
    public BirthRecord(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getBirthYear() {
        return this.birthYear;
    }
    
    public int compareTo(BirthRecord other) {
        if(this.birthYear > other.getBirthYear()) {
            return -1;
        }
        else if(this.birthYear < other.getBirthYear()) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public String toString() {
        return this.name + " " + this.birthYear;
    }
}