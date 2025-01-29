import java.time.LocalDate;
public class DateArithmetic{
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2025, 1, 29);
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Original Date: " + date);
        System.out.println("Resulting Date: " + result);
    }
}
