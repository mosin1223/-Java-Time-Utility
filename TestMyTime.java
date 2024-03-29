import java.util.*;
class MyTime{
    int hour;
    int minute;
    int second ;
    MyTime(int hour ,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    void nexthour(){

        if(this.hour == 23){
            hour=00;
        }
        else {
            hour+=1;
        }
    }
    void nextminute(){
        if(this.minute == 59){
            minute=00;
        }
        else {
            minute +=1;
        }
    }
    void nextsecond(){
        if(this.second == 59){
            second=00;
        }
        else {
            second+=1;
        }
    }
    void previoushour(){
        hour-=1;
        if(hour==-1){
            hour=23;
        }

    }
    void previousminute(){
        minute-=1;
        if(minute==-1){
            minute=59;
        }
    }
    void previoussecond(){
        second-=1;
        if(second==-1){
            second=59;
        }
    }

    String tostring (){
        return  String.format(hour +":"+minute+":"+second);

    }



}
public class TestMyTime{
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        System.out.println("Enter hour (0-23):");
        int hour = write.nextInt();

        System.out.println("Enter minute (0-59):");
        int minute = write.nextInt();

        System.out.println("Enter second (0-59):");
        int second = write.nextInt();

        if(hour > 0 && hour <= 23 && minute >0 && minute <= 59 && second >0 && second <=59){
            MyTime time = new MyTime(hour,minute,second);

            System.out.println( "initial time : " +time.tostring());

            time.nexthour();
            System.out.println( " nexthour : " +time.tostring());
            time.nextminute();
            System.out.println( " nextminute : " +time.tostring());
            time.nextsecond();

            System.out.println( " nextsecond: " +time.tostring());

            time.previoushour();
            System.out.println( " previous hour : " +time.tostring());

            time.previousminute();
            System.out.println( " previous minute: " +time.tostring());

            time.previoussecond();
            System.out.println( " previous second : " +time.tostring());
        }
        else {
            System.out.println("invalid hour and minute and second ");
        }


    }
}
