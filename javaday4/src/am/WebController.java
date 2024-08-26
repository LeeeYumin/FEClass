package am;

//@Controller
public class WebController {
	
	//@Autowired
	//private WebService webService;
	//웹 개발시에는 위와 같은 방법으로 객체를 생성한다.또 다른 방법도 사용

	WebService webService = new WebService();
	
	// 입력 창을 띄워 주는 용도
	void create() {
		
	}
	// 그 입력 창에서 입력한 값을 받아주는 용도
	void create(String title, String content) {
		/*
		 * String data = "웹 테스트"; System.out.println("컨트롤러에 데이터 확인 : " + data);
		 * 
		 * webService.create(data);
		 */
	}

	
	
	public static void main(String[] args) {
		
		WebController webController = new WebController();
		webController.create();
	}
	
}
