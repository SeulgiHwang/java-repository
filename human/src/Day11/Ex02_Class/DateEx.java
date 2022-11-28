package Day11.Ex02_Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) throws ParseException {
		//Date객체는 시스템에서 현재 날짜를 가져온 정보를 가지고 있다
		Date now = new Date();
		System.out.println("now: "+now);
	
		String dateStr = now.toString();
		System.out.println("Date 문자열 기본 포맷: "+dateStr);
		
		//날짜/시간 형식문자
		//yyyy: 년도, MM:월, dd:일
		//hh :시간, mm: 분, ss:초
		String dateFormat = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf =new SimpleDateFormat(dateFormat);
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
		
		String dateFormat2 = "yyyy/MM/dd hh:mm:ss";
		SimpleDateFormat sdf2 =new SimpleDateFormat(dateFormat2);
		String nowStr2 = sdf2.format(now);
		System.out.println(nowStr2);
		
		System.out.println("======================================");
		String day1 = "2022/11/25";
		String day2 = "2022/12/05";
		
		//파싱(Parsing): 구문분석 
		//->구분문자나 형식을 가진 데이터(문자열)을 구성성분 분석하는과정
		//->데이터를 다루기 쉬운 형태로 바꾸는 과정
		//->데이터를 가공하기쉬운 상태로 추출하는 과정
		//구분문자 : / , . - 외
		
		//date1에 객체를 생성해서 parse 메소드로 date를 끌어오는것
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(day1);
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(day2);
		
		//Date.getTime()
		//:1970년1월1일0시0분0초0ms 부터 Date에 지정된 날짜/시간 까지의 ms 누적 값
		long gapDays = (date2.getTime()-date1.getTime()) / (1000*60*60*24);
		long gapHours = (date2.getTime()-date1.getTime()) / (1000*60*60);
		long gapMin = (date2.getTime()-date1.getTime()) / (1000*60);
		long gapSec = (date2.getTime()-date1.getTime()) / (1000);
		
		System.out.println("1970/01/01 00:00:00 00ms~ date1까지");
		System.out.println(date1.getTime());
		System.out.println(date1.getTime()/1000);
		System.out.println(date1.getTime()/1000/60);
		System.out.println(date1.getTime()/1000/60/60);
		System.out.println(date1.getTime()/1000/60/60/24);
		System.out.println("======================================");

		System.out.println("1970/01/01 00:00:00 00ms~ date2까지");
		System.out.println(date2.getTime());
		System.out.println(date2.getTime()/1000);
		System.out.println(date2.getTime()/1000/60);
		System.out.println(date2.getTime()/1000/60/60);
		System.out.println(date2.getTime()/1000/60/60/24);
		System.out.println("======================================");

		System.out.println("시험 D-day: "+gapDays);
		System.out.println("시험까지 남은시간(/시): "+gapHours);
		System.out.println("시험까지 남은시간(/분): "+gapMin);
		System.out.println("시험까지 남은시간(/초): "+gapSec);
		
		//Date객체는 getxxx()메소는 deprecated(더이상사용불가) 
		//-->날짜의 년/월/일을 추출하는 기능은 calender 클래스에서 다룬다
		System.out.println("Today(년): "+date1.getYear());
		System.out.println("Today(월): "+(date1.getMonth()+1));
		System.out.println("Today(일): "+date1.getDay());
		System.out.println("======================================");

		//년/월/일은 Calendar로 추출
		//Date를 Calendar로 변환하여 년/월/일 을 추출
		
		Calendar calendar = Calendar.getInstance();
		//Calendar객체.setTime(Date객체);
		calendar.setTime(date1);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Today(년): "+year);
		System.out.println("Today(월): "+month);
		System.out.println("Today(일): "+day);
		System.out.println("======================================");

//		2022/11/25 : 5일후
//		2022/11/25 : 10일후
//		2022/11/25 : 100일후
		System.out.println(date1.getTime());
		int dayTime = (1000*60*60*24); //ms단위로 1일을 환산한 값
		int day5TimeValue = 5* dayTime;
		int day10TimeValue = 10* dayTime;
		int day100TimeValue = 100* dayTime;
		
		//5일후
		Date after5Days = new Date();
		after5Days.setTime(date1.getTime() + day5TimeValue);
		String after5DaysStr = sdf.format(after5Days);
		System.out.println(after5DaysStr);

		//10일후
		Date after10Days = new Date();
		after10Days.setTime(date1.getTime() + day10TimeValue);
		String after10DaysStr = sdf.format(after10Days);
		System.out.println(after10DaysStr);
		
		//올바르지않은 결과가 나온다
		//날짜를 계산하는 경우는 Calendar클래스를 사용할 것을 권장
		//100일후
		Date after100Days = new Date();
		after100Days.setTime(date1.getTime() + day100TimeValue);
		String after100DaysStr = sdf.format(after100Days);
		System.out.println(after100DaysStr);
		
	}
}
