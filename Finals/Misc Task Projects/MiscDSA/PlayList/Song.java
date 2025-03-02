package MiscDSA.PlayList;

public class Song{
    String title, artist;
    double duration;
    Song next, previous;
    Song(){
        duration = 0.0;
    }
    Song(String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public String toString(){
        return "Title: "+title+" Artist: "+artist+" Duration: "+duration;
    }
}