package pm;


class FoolException extends RuntimeException{
}

public class RuntimeexceptionExam{
	public void sayNick(String nick) throws FoolException{
		//try {
			if("바보".equals(nick)) {
				throw new FoolException();
				//예외 발생	
			}
			System.out.println("당신의 별명은 " + nick + "입니다.");
		//}catch(FoolException e) {
		//	System.out.println("FoolException 이 발생했습니다. ");
		//}
	}
	
	
	public static void main(String[] args) {

		RuntimeexceptionExam sample = new RuntimeexceptionExam();
		
		try {
			sample.sayNick("바보");
			sample.sayNick("야호");
		}catch (FoolException e) {
			System.out.println("FoolException 이 발생했습니다. ");

		}
	
	}

}
