package Day11.Ex02_Class;
import java.time.DayOfWeek;
//시간변경//시간지정
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationEx {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("현재시간: "+now);
		LocalDateTime targetTime = now.plusYears(1)
									 .plusMonths(1)
									 .plusDays(1)
									 .minusHours(3)
									 .plusMinutes(20)
									 .minusSeconds(50);
		
		System.out.println("변경시간: "+ targetTime );
		
		targetTime = now.withYear(2007)
						.withMonth(8)
						.withDayOfMonth(7)
						.withHour(2)
						.withMinute(30)
						.withSecond(50);
		System.out.println("태어난시간: "+targetTime);
		
		//년도
		targetTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올해의 첫날: "+targetTime);

		targetTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해의 마지막날: "+targetTime);
		
		targetTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음해의 첫날: "+targetTime);
			
		//월
		targetTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번달의 첫날: "+targetTime);
		
		targetTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번달의 마지막날: "+targetTime);
		
		//요일
		targetTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번달의 첫번째월요일: "+targetTime);

		targetTime = now.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("다음토요일: "+targetTime);
		
		targetTime = now.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
		System.out.println("지난일요일: "+targetTime);
}
}
