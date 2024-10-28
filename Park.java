public class Park {

    public class Attraction {
        private String nameAttraction;
        private String schedule;
        private double value;


        public Attraction(String nameAttraction, String schedule, double value) {
            this.nameAttraction = nameAttraction;
            this.schedule = schedule;
            this.value = value;
        }


        public void displayInfo() {
            System.out.println("Аттракцион: " + nameAttraction);
            System.out.println("Время работы: " + schedule);
            System.out.println("Цена: " + value + " руб.");
            System.out.println(); // Пустая строка для удобства вывода
        }
    }


    public void showAttractions() {

        Attraction attraction1 = new Attraction("Колесо обозрения", "9:00 - 18:00", 999);
        Attraction attraction2 = new Attraction("Тир", "10:00 - 22:00", 111);
        Attraction attraction3 = new Attraction("Башня", "11:00 - 19:00", 95);

        attraction1.displayInfo();
        attraction2.displayInfo();
        attraction3.displayInfo();
    }
}