package List_Test.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        while (true) {

            String[] command = scanner.nextLine().split(":");

            if (command[0].equals("course start")) break;

            String lessonTitle = command[1];

            switch (command[0]) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(Integer.parseInt(command[2]), lessonTitle);
                    }
                    break;
                case "Remove":
                    schedule.remove(lessonTitle);
                    schedule.remove(lessonTitle+"-Exercise");
                    break;
                case "Swap":
                    String secondLessonTitle = command[2];
                    swapLessons(schedule, lessonTitle,secondLessonTitle );
                    break;
                case "Exercise":
                    addExercise(schedule, lessonTitle);
                    break;
            }
        }

        printCourseSchedule(schedule);
    }
    private static void swapLessons(List<String> schedule, String firstLesson, String secondLesson) {
        int firstIndex = schedule.indexOf(firstLesson);
        int secondIndex = schedule.indexOf(secondLesson);

        if (firstIndex != -1 && secondIndex != -1) {
            Collections.swap(schedule, firstIndex, secondIndex);

            if (schedule.contains(firstLesson + "-Exercise")) {
                schedule.remove(firstLesson + "-Exercise");
                 schedule.add(secondIndex+1,firstLesson + "-Exercise" );
            } else if (schedule.contains(secondLesson + "-Exercise")) {
                schedule.remove(secondLesson + "-Exercise");
                schedule.add(firstIndex+1,secondLesson + "-Exercise" );
            }
        }
    }
    private static void addExercise(List<String> schedule, String lesson) {
        if (schedule.contains(lesson)) {
            int lessonIndex = schedule.indexOf(lesson);
            if (!schedule.contains(lesson + "-Exercise")) {
                schedule.add(lessonIndex + 1, lesson + "-Exercise");
            }
        } else {
            schedule.add(lesson);
            schedule.add(lesson + "-Exercise");
        }
    }
    private static void printCourseSchedule(List<String> schedule) {
        for (int i = 0; i < schedule.size(); i++) {
            System.out.println((i + 1) + "." + schedule.get(i));
        }
    }
}
