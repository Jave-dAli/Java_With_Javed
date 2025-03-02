package MiscDSA.PlayList;

public class Main {
    public static void main(String[] args) {
        PlayList playList = new PlayList();
        playList.add("Tu Jane Na", "Atif Aslam", 4.7);
        playList.add("Tere Naam", "Salman Khan", 5.2);
        playList.add("Humnawa", "Jubin Nawtiyal", 3.9);

        System.out.println("Removing "+playList.remove("Tere Naam").title);
        System.out.println(playList.getTotalDuration());
        playList.displayPlaylist();

    }
}
