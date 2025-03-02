package MiscDSA.PlayList;

public class PlayList {
    private Song head, tail;
    private double totalDuration;
    private int no_of_songs;
    PlayList(){
        totalDuration = 0.0;
        no_of_songs = 0;
    }
    public void add(String title, String artist, double duration){
        Song song = new Song(title, artist, duration);
        totalDuration+=duration;
        no_of_songs ++;
        if(head == null)
            head = tail = song;
        else{
            tail.next = song;
            song.previous = tail;
            tail = song;
            tail.next = head;
            head.previous = tail;
        }
    }
    public Song remove(String title){
        Song curr = head;
        if(curr == null){
            System.out.println("Playlist is empty...");
            return null;
        }
        while(curr.next != null){
            if(curr.title.equalsIgnoreCase(title)){
                curr.previous.next = curr.next;
                curr.next.previous = curr.previous;
                totalDuration -= curr.duration;
                no_of_songs --;
                return curr;
            }
            curr = curr.next;
        }
        System.out.println("No song with title "+title+" found");
        return null;
    }
    public double getTotalDuration(){
        return Double.parseDouble(String.format("%.2f", totalDuration));
    }
    public void displayPlaylist(){
        if(head == null)
            System.out.println("Playlist is empty...");
        else{
            Song curr = head;
            int count = no_of_songs;
            while(count > 0) {
                System.out.println(curr);
                curr = curr.next;
                count --;
            }
        }
    }

}
