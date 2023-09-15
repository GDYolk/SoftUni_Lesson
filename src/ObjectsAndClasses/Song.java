package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
    private String typeList;
    private String name;
    private String time;

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSongs = Integer.parseInt(sc.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numSongs; i++) {
            String[] data = sc.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song1 = new Song();

            song1.setTypeList(type);
            song1.setName(name);
            song1.setTime(time);

            songs.add(song1);
        }

        String typeList = sc.nextLine();

        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName() + " continue time : " + song.getTime());
            }
        } else {
            List<Song> filterSong = songs.stream()
                    .filter(e -> e.getTypeList().equals(typeList)).toList();
            filterSong.forEach(e -> System.out.println(e.getName()));
        }

    }
}