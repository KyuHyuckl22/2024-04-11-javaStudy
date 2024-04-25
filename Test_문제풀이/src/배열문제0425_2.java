/*
 * 2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. (실적 0~100)1) 
 * 사번별 실적을 출력하시오.사원(1) 50..2)
 *  1월 실적의 총점과 평균을 출력하시오.3) 
 * 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오
 */
public class 배열문제0425_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {50,45,35,12,70};
		int sum=0;
		double avg=0.0;
		int max=arr[0];
		int min=arr[0];
				
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
			
			
			System.out.println("사원("+(i+1)+")"+arr[i]);
		}
		System.out.println("총 점 : "+ sum);
		System.out.printf("평 균 : %.2f\n",sum/(double)arr.length);
//	                                 |	정수 => %d , 실수 => %f , 문자 => %c , 문자열 => %s
		System.out.println("실적이 가장 높은 수:"+max);
		System.out.println("실적이 가장 낮은 수:"+min);
	}

}
