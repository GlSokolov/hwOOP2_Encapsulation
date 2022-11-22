public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;
    private String name1;

    public Human (String name, String town, int yearOfBirth, String jobTitle) {


        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {this.name = "default";}

        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {this.town = "default";}

        if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else {this.jobTitle = "Безработный";}
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public String getName() {
        return name;
    }
    public String getTown() {
        return town;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {this.name = "Информация недоступна";}
    }
    public void setJobTitle(String jobTitle) {
        if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else {this.jobTitle = "Информация недоступна";}
    }
    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {this.yearOfBirth = 2000;}
    }
    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {this.town = "Информация недоступна";}
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году." +
                " Я работаю на должности " + jobTitle +
                ". Будем знакомы!";
    }
}
