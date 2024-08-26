package pm;

public class ExceptionExam {
	
	public void shouldBeRun() {
		System.out.println("ok thanks...");
	}

	public static void main(String[] args) {
		
		ExceptionExam exceptionExam = new ExceptionExam();
		
		int c;
		
		try { 
			c = 4 / 0;
		} catch(ArithmeticException e) {
			c = -1;
		} finally {  //finally 는 에러 발생 유무와 상관 없이 실행된다. 
			exceptionExam.shouldBeRun();
		}
	}
}
