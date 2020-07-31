package Lesson10InstanceMethods;


public class Ex3Cloak {

      int hours;
      int minutes;


      Ex3Cloak(int hours, int minutes){
          this.minutes = minutes;
          this.hours = hours;
      }

    public void next(){
        this.minutes += 1;
        if (minutes == 60){
            minutes = 0;
            this.hours += 1;
        }
        System.out.println(hours + " " + minutes);
    }

    public static void main(String[] args) {

        Ex3Cloak ex3Cloak = new Ex3Cloak(11, 59);
        ex3Cloak.next();

    }
}
