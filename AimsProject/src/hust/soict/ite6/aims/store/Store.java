package hust.soict.ite6.aims.store;

import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.media.Media;

import java.util.ArrayList;
import java.util.Collection;

public class Store {
    private ArrayList<Media> itemsInStore;

    //Constructor
    public Store(){
        itemsInStore = new ArrayList<>();
    }

    //Methods
    public void addMedia(Media media){
        itemsInStore.add(media);
        System.out.println("Media added successfully");
    }

    public void removeMedia(Media media) {
        int indexOfRemoved = itemsInStore.indexOf(media);
        if(indexOfRemoved == -1){
            System.out.println("This item is not in the store");
        } else {
            itemsInStore.remove(indexOfRemoved);
            System.out.println("Media removed successfully");
        }
    }

    public Media findMediaByTitle(String title){
        for(Media media : itemsInStore){
            if(media.getTitle().equalsIgnoreCase(title)){
                return media;
            }
        }
        return null;
    }

    //Getter and Setter
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(ArrayList<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }

    public void print(){
        System.out.println("-----------LIST-ITEMS-----------");
        for(Media media : itemsInStore){
            System.out.println(media.toString());
        }
        System.out.println("--------------------------------");
    }

}
