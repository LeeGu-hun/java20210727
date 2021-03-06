package date;

import java.util.Calendar;

public class MyDate {
  public static String getDate(){
    Calendar cal = Calendar.getInstance();
    return cal.get(Calendar.YEAR)+"-"
           +twoDigit(cal.get(Calendar.MONTH)+1)+"-"
           +twoDigit(cal.get(Calendar.DATE));
  }

  public static String getDate(Calendar cal){
    return cal.get(Calendar.YEAR)+"-"
           +twoDigit(cal.get(Calendar.MONTH)+1)+"-"
           +twoDigit(cal.get(Calendar.DATE));
  }

  public static String twoDigit(int num) {
    return num<10?"0"+num:num+"";
  }

  public static String getWeek(int week) {
    String[] arr = {"","일", "월", "화", "수", "목", "금", "토"};
    return arr[week];
  }
  public static String getAmPm(int ap){
    String[] tmp = {"AM","PM"};
    return tmp[ap];
//    return new String[]{"오전","오후"}[ap];
  }
  public static String getTime(){
    Calendar cal = Calendar.getInstance();
    return cal.get(Calendar.HOUR_OF_DAY)+":"
                    +twoDigit(cal.get(Calendar.MINUTE))+":"
                    +twoDigit(cal.get(Calendar.SECOND));
  }
  public static String getFullTime(){
    return getDate()+" "
            +getAmPm(Calendar.getInstance().get(Calendar.AM_PM))
            +" "+getTime();
  }
}
