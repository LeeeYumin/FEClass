package pm.javaStudy;

public class ReferenceTypeExam {

	public static void main(String[] args) {

		ReferenceTypeExam exam = new ReferenceTypeExam();
		
		int value = 10; // int 참조형이 아니라 기본형이다.  
		exam.addOne(value);
		System.out.println("기본형 변수의 값을 다른 메서드에서 변경한 결과: " + value);
	
	
		int[] arr = {10}; // 배열은 참조형이다. 
		exam.addOne(arr);
		System.out.println("참조형 변수의 값을 다른 메서드에서 변경한 결과: " + arr[0]);
	}
	
	public void addOne(int value) {
		value++;
	}
	
	public void addOne(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i]++;
		}
	}
}

// 기본형 변수에서는 값을 메서드에 전달할때 복사본을 전달한다. 따라서 원본 변수에도 원래 값이 있고 
// 복사한 변수에도 같은 값이 있다. 따라서 1을 증가 시켜도 원본 값이 증가되는 것이 아니라 복사본 값이
// 증가 되기 때문에 최종값은 그대로 10이 출력 된다. 

// 반면에 참조형 변수는 변수 자체에 값이 들어 있는 것이라. 값의 주소가 들어 있다. 따라서 원본 값의
//주소가 매서드에 전달된다. 따라서 그 주소의 값을 하나 증가 시켰기 때문에 원본이 가리키는 그 주소의
// 값이 바뀌었기 때문에 최종 결과 값이 1 증가된 11이 출력되는 것이다. 

// 기본형은 그 값 자체를 가지고 있고 참조형은 그 값이 취치한 주소값을 가리킨다. 
