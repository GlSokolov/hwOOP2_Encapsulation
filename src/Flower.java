public class Flower {
    private String flowerName;
    private String country;
    private double cost;
    private int liseSpan;
    public Flower (String flowerName, String country, double cost, int liseSpan) {
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {this.flowerName = "<Информация отсутствует>";}

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {this.country = "Россия";}

        if (cost > 0) {
            this.cost = cost;
        } else {this.cost = 1;}

        if (liseSpan > 0) {
            this.liseSpan = liseSpan;
        } else {this.liseSpan = 3;}
    }
    public String getFlowerName () {
        return flowerName;
    }
    public void setFlowerName(String flowerName) {
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {this.flowerName = "<Информация отсутствует>";}
    }

    public String getCountry () {
        return country;
    }
    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {this.country = "Россия";}
    }

    public double getCost () {
        return cost;
    }
    public void setCost(int cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {this.cost = 1;}
    }

    public int getLiseSpan () {
        return liseSpan;
    }
    public void setLiseSpan(int liseSpan) {
        if (liseSpan > 0) {
            this.liseSpan = liseSpan;
        } else {this.liseSpan = 3;}
    }

    @Override
    public String toString() {
        return  flowerName +
                ", страна " + country +
                ", стоимость штуки - " + cost +
                "руб., срок жизни - " + liseSpan + " дней.";
    }
}
