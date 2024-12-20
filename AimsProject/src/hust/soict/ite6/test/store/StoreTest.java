package hust.soict.ite6.test.store;

import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.CompactDisc;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.media.Track;
import hust.soict.ite6.aims.store.Store;

import java.util.ArrayList;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {
        //Add DVD
        Track track1 = new Track("track1", 1);
        Track track2 = new Track("track2", 2);
        Track track3 = new Track("track3", 3);

        List<String> authors = new ArrayList<>();
        ArrayList<Track> tracks= new ArrayList<>();
        DigitalVideoDisc dvd =
                new DigitalVideoDisc("The Lion King", "animation",
                        "Roger Allers", 87, 19.95f);
        CompactDisc cd =
                new CompactDisc("Star wars", "Science Fiction",
                        24.95f, tracks , "George Lucas");
        Book book =
                new Book("Aladin", "fairytail", 18.99f, authors );

        Store store = new Store();
        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);

        book.addAuthor("Christian");

        store.addMedia(dvd);
        store.addMedia(cd);
        store.addMedia(book);

        System.out.println();

        //Remove DVD
        store.removeMedia(cd);
        store.removeMedia(cd);
    }
}
