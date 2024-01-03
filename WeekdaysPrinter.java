// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class WeekdaysPrinter {
    public static void main(String[] args) {
      String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
  
      for (int i = 0; i < days.length; i++) {
        if (i >= 5)
          break;
        System.out.println(days[i]);
  
      }
  
      // @Test
      // void addition() {
      // assertEquals(2, 1 + 1);
      // }
    }
  }