package Day11.Ex02_Class;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		 
		//정렬되징낳은 배열요소들
		int[] arr = {5,3,4,1,2};
		
		//배열을 정렬(sort)
		//5 3 4 1 2 -> 1 2 3 4 5
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"");
		}
		System.out.println();
		
		//100개의 랜덤수를 배열요소로 갖는 배열
		int[]random = new int[100];
		
		//1~100사의 랜덤수 100개를 배열에 넣는다
		for(int i=0; i<random.length; i++) {
			random[i] = (int)(Math.random()*100+1);
		}
		//random배열도 정렬함
		Arrays.sort(random);
		
		for(int i=0; i<random.length; i++) {
			System.out.print(random[i]+" ");
		}
		System.out.println();
		
		//이진검색(탐색) 알고리즘을 사용하여 검색한 후, 
		//해당값이 있으면, 그 위치(index)를 반환
		//찾지못했으면 ( -(insertion point) -1)음수를 반환
		if(Arrays.binarySearch(random, 10)<0) {
			System.out.println("랜덤수 10이 없습니다");
		}else {
			System.out.println("index:"+Arrays.binarySearch(random, 10));
		}
		//Arrays.fill(값) : 값으로 모든 배열요소를 채우는 메소드
		int fill[] = new int[10];
		
		Arrays.fill(fill, 6);
		//66666 66666
		
		for(int i=0; i<fill.length; i++) {
			System.out.print(fill[i]);
		}
		System.out.println();
	
		//Arrays.copy Of(배열,길이);
		//:배열을 앞에서 부터 (길이)개의 요소를 복사하여 배열로 반환
		int copy[] = Arrays.copyOf(fill, 3);
		//66666 66666
		//666을 복사해옴
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		
		//Arrays.copyOfRange(배열, 시작index, 끝index+1까지)
		//                          3             5(4에서)
		int copyRange[] = Arrays.copyOfRange(arr, 2, 4);
		//1 2 3 4 5
		//3 4를 복사해옴
				
		for(int i=0; i<copyRange.length; i++) {
			System.out.println(copyRange[i]+ " ");
		}
		System.out.println();
	}
	
	
}
