package innerClassBuilder;

public class Drink {
    private String name;
    private String price;
    private String kcal;
    private boolean sparkling;
    private String description;
    private String capacity;
    private String productionCountry;

    private Drink(DrinkBuilder drinkBuilder) {
        this.name = drinkBuilder.name;
        this.price = drinkBuilder.price;
        this.kcal = drinkBuilder.kcal;
        this.sparkling = drinkBuilder.sparkling;
        this.description = drinkBuilder.description;
        this.capacity = drinkBuilder.capacity;
        this.productionCountry = drinkBuilder.productionCountry;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getKcal() {
        return kcal;
    }

    public boolean isSparkling() {
        return sparkling;
    }

    public String getDescription() {
        return description;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public String toString() {
        return "innerClassBuilder.Drink{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", kcal='" + kcal + '\'' +
                ", sparkling=" + sparkling +
                ", description='" + description + '\'' +
                ", capacity='" + capacity + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }

    public static class DrinkBuilder {
        private String name;
        private String price;
        private String kcal;
        private boolean sparkling;
        private String description;
        private String capacity;
        private String productionCountry;

        public DrinkBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public DrinkBuilder buildPrice(String price) {
            this.price = price;
            return this;
        }

        public DrinkBuilder buildKcal(String kcal) {
            this.kcal = kcal;
            return this;
        }

        public DrinkBuilder buildSparkling(boolean sparkling) {
            this.sparkling = sparkling;
            return this;
        }

        public DrinkBuilder buildDescription(String description) {
            this.description = description;
            return this;
        }

        public DrinkBuilder buildCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }

        public DrinkBuilder buildProductionCountry(String productionCountry) {
            this.productionCountry = productionCountry;
            return this;
        }

        public Drink build() {
            return new Drink(this);
        }
    }
}
