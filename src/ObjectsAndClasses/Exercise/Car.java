package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class VehicleCatalogue {
    static class Car {
        private String type;
        private String Model;
        private String Color;
        private int horsepower;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return Model;
        }

        public void setModel(String model) {
            Model = model;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String color) {
            Color = color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(int horsepower) {
            this.horsepower = horsepower;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();

        while (true) {
            String[] token = sc.nextLine().split(" ");

            if (Objects.equals(token[0], "End")) break;

            Car car = carList.stream().filter(s -> s.getModel().equals(token[1]))
                    .findFirst().orElse(null);

            if (car == null) {
                car = new Car();
                car.setType(Character.toUpperCase(token[0].charAt(0)) + token[0].substring(1));
                car.setModel(token[1]);
                car.setColor(token[2]);
                car.setHorsepower(Integer.parseInt(token[3]));

                carList.add(car);
            }
        }

        while (true) {
            String line = sc.nextLine();
            if (line.equals("Close the Catalogue")) break;

            carList.stream().filter(s -> s.getModel().equals(line))
                    .findFirst()
                    .ifPresent(car -> System.out.printf(
                            "Type: %s%n" +
                            "Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %d%n",
                            car.getType(),
                            car.getModel(),
                            car.getColor(),
                            car.getHorsepower()));
        }
        sc.close();

        int sumCars = carList.stream()
                .filter( s -> s.getType().equals("Car"))
                .map(Car::getHorsepower)
                .reduce(0, Integer::sum);

        int countCars = (int) carList.stream().filter(s -> s.getType().equals("Car")).count();

        int sumTrucks = carList.stream()
                .filter( s -> s.getType().equals("Truck"))
                .map(Car::getHorsepower)
                .reduce(0, Integer::sum);

        int countTrucks = (int) carList.stream().filter(s -> s.getType().equals("Truck")).count();

        double averageCars = countCars > 0 ? sumCars / (double) countCars : 0;
        double  averageTrucks = countTrucks > 0 ? sumTrucks  / (double) countTrucks : 0;

        System.out.printf("Cars have average horsepower of: %.2f.%n",averageCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n",averageTrucks);
    }
}