public class Week {
    final double PI = 3.142;

    final double GRAVITY = 9.8;
    enum DaysOfTheWeek{Sunday(950954305), Monday(8959435), Tuesday(58409594), Wednesday(89494), Thursday(494), Friday(4989), Saturday(4048);
        int id;
        DaysOfTheWeek(int id) {
            this.id = id;
        }

        int getId(){

            return id;
        }

    };
    public void updatePi(){

    }
        public static void main(String[] args) {
            for (DaysOfTheWeek daysOfTheWeek : DaysOfTheWeek.values()) {
                System.out.println(daysOfTheWeek+ " with id " +daysOfTheWeek.getId());

            }
            

        }




}
