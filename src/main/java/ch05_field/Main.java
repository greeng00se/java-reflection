package ch05_field;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
//        printDeclaredFieldsInfo(Category.class);
        Movie movie = new Movie(
                "Avatar",
                2022,
                true,
                Category.ADVENTURE,
                12.99
        );

        printDeclaredFieldsInfo(movie.getClass(), movie);

        Field minPriceStaticField = Movie.class.getDeclaredField("MINIMUM_PRICE");

        System.out.println(String.format("static MINIMUM_PRICE value :%f", minPriceStaticField.get(null)));
    }

    public static <T> void printDeclaredFieldsInfo(Class<? extends T> clazz, T instance) throws IllegalAccessException {
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(String.format("Field name :%s type : %s",
                    field.getName(),
                    field.getType().getName()
            ));

            System.out.println(String.format("Is synthetic field :%s", field.isSynthetic()));
            System.out.println(String.format("Field value is : %s", field.get(instance)));
            System.out.println();
        }
    }

    public static class Movie extends Product {
        public static final double MINIMUM_PRICE = 10.99;

        private boolean isReleased;
        private Category category;
        private double actualPrice;

        public Movie(String name, int year, boolean isReleased, Category category, double actualPrice) {
            super(name, year);
            this.isReleased = isReleased;
            this.category = category;
            this.actualPrice = actualPrice;
        }

        public class MovieStats {
            private double timesWatched;

            public MovieStats(double timesWatched) {
                this.timesWatched = timesWatched;
            }

            public double getRevenue() {
                return timesWatched * actualPrice;
            }
        }
    }

    public static class Product {
        protected String name;
        protected int year;
        protected double actualPrice;

        public Product(String name, int year) {
            this.name = name;
            this.year = year;
        }
    }

    public enum Category {
        ADVENTURE,
        ACTION,
        COMEDY
    }
}
