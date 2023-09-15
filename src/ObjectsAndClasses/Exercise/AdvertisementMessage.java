package ObjectsAndClasses.Exercise;

import java.util.Random;
import java.util.Scanner;

class AdvertisementMessage {
    Random random = new Random();

    private int getRandom(int size) {
        return random.nextInt(size);
    }
    private String getPhases() {
        String[] phrases = new String[] {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };

        return phrases[getRandom(phrases.length)];
    }
    private String getEvents() {
        String[] events = new String[] {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };
        return events[getRandom(events.length)];
    }
    private String getAuthors() {
        String[] authors = new String[] {
                "Diana",
                "Mary",
                "Linda",
                "Susan",
                "Sarah",
                "Lisa",
                "Annie",
                "Emily"
        };
        return authors[getRandom(authors.length)];
    }
    private String getCity() {
        String[] cities = new String[]{
                "London",
                "Rome",
                "New York",
                "Paris",
                "Berlin"
        };
        return cities[getRandom(cities.length)];
    }

    private void printAdvertisementMessage(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%s %s %s - %s%n",
                    getPhases(),
                    getEvents(),
                    getAuthors(),
                    getCity());
        }
    }

    public static void main(String[] args) {
        AdvertisementMessage message = new AdvertisementMessage();
        message.printAdvertisementMessage(new Scanner(System.in).nextInt());
    }
}
