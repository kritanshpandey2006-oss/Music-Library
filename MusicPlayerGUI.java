import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Song {
    private String title;
    private String artist;
    private String filePath;

    public Song(String title, String artist, String filePath) {
        this.title = title;
        this.artist = artist;
        this.filePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getFilePath() {
        return filePath;
    }
}

class Playlist {
    private String name;
    private ArrayList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
}

class MusicLibrary {
    private ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}

public class MusicPlayerGUI extends JFrame {

    JButton playBtn, pauseBtn, stopBtn;
    JList<String> songList;

    public MusicPlayerGUI() {

        setTitle("Music Player");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] songs = {
            "Shape of You",
            "Believer",
            "Perfect",
            "Blinding Lights"
        };

        songList = new JList<>(songs);
        add(new JScrollPane(songList), BorderLayout.CENTER);

        playBtn = new JButton("Play");
        pauseBtn = new JButton("Pause");
        stopBtn = new JButton("Stop");

        JPanel panel = new JPanel();

        panel.add(playBtn);
        panel.add(pauseBtn);
        panel.add(stopBtn);

        add(panel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MusicPlayerGUI();
    }
}