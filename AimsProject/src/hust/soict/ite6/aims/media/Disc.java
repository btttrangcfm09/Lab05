package hust.soict.ite6.aims.media;

public class Disc extends Media{
    private String director;
    private int length;

    public Disc() {
        super();
    }

    //Getter and Setter 
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //Constructor 
    public Disc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public Disc(String title) {
        super(title);
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }


    public Disc(String title, String director, int length) {
        super(title);
        this.director = director;
        this.length = length;
    }

    public Disc(int id, String title, String category, String director, float cost, int length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
