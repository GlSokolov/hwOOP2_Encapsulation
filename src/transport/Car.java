package transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car {
    private String brand;
    private String model;
    double engineVolume;
    String color;
    private int year;
    private String country;

    String transmission;
    private String bodyType;
    String number;
    private int numberOfSeats;
    String wheel;

    String season = "Лето";

    public class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key (String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "<Информация недоступна>";
            }else{this.remoteEngineStart = remoteEngineStart;}
            if (keylessAccess == null || keylessAccess.isEmpty() || keylessAccess.isBlank()) {
                this.keylessAccess = "<Информация недоступна>";
            }else{this.keylessAccess = keylessAccess;}

        }
    }
    public class Insurance {
        private LocalDate srokDeystviya;
        private int cost;
        private String number;

        public Insurance(LocalDate srokDeystviya, int cost, String number) {
            this.srokDeystviya = srokDeystviya;
            if (cost <= 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }
            if (number == null || number.isEmpty() || number.isBlank()) {
                this.number = "<Введите номер страховки>";
            } else {
                this.number = number;
            }
        }

        public String checkCorrectNumber (String number) {
            if (Pattern.matches("[0-9]{9}", number)) {
                return number;
            } else {return "Номер страховки некорректный";}
        }
        public LocalDate checkSrokDeystviya (LocalDate srokDeystviya) {
            if (srokDeystviya.isBefore(LocalDate.now()) || srokDeystviya.isEqual(LocalDate.now())) {
                System.out.println("Срок действия страховки кончился");
            }
            return srokDeystviya;
        }


    }
    public Car (String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String number, int numberOfSeats, String wheel, String season) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "<Информация не указана>";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "<Информация не указана>";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0 || Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = color;
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "<Информация не указана>";
        } else {
            this.country = model;
        }

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "<Информация не указана>";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "<Информация не указана>"; }else {this.bodyType = bodyType;}
        if (wheel == null || wheel.isEmpty() || wheel.isBlank()) {
            this.wheel = "<Информация не указана>";} else {
            this.wheel = wheel;
        }
        if (number == null || number.isEmpty() || number.isBlank()) {
            this.number = "<Информация не указана>";
        } else {this.number = number;}
        if (numberOfSeats >= 0) {
            this.numberOfSeats = numberOfSeats;
        }
    }
/*        if (season == null || season.isEmpty() || season.isBlank()) {
            this.season = season;
        } else {this.season = "Ошибка, укажите сезон (Лето/Зима)";}
    }
    public static void wheelSeasonChange() {
      if (!season.equals(wheel)) {
      Sout ("Смените резину на сезонную")
      }
    }
*/
    // Немного некорректный код, надо сделать проверку через сезон и колеса.
    public String wheelSeasonChange() {
    if (LocalDate.now().getMonthValue() >= 4 && LocalDate.now().getMonthValue() <= 10){
        return "Смените резину на лето";}
    else {return "Смените резину на зиму";}
    }

    public String checkNumberCorrect(String number) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", number)) {
            return number;
        } else {return "некорректный номер";}
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public String getNumber() {
        return number;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public int getYear() {
        return year;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public String getCountry() {
        return country;
    }
    public String getModel() {
        return model;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getWheel() {
        return wheel;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = "<Информация не указана>";
        } else {this.brand = brand; }
    }
    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = "<Информация не указана>";
        } else {this.model = model; }
    }
    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = "<Информация не указана>";
        } else {this.country = country; }
    }
    public void setYear(int year) {
        if (year <= 0) {
            this.year = 2000;
        } else {this.year = year; }
    }
    public void setBodyType(String bodyType) {
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = "<Информация не указана>";
        } else {this.bodyType = bodyType; }
    }
    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 0;
        } else {this.numberOfSeats = numberOfSeats; }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", number='" + checkNumberCorrect(getNumber()) + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", wheel='" + wheel + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
