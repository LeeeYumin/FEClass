package am;

//@Service
public class WebService {
	
	//@Autowired
	//private WebRepository webRepository;
	//웹 개발시에는 위와 같은 방법으로 객체를 생성한다.또 다른 방법도 사용
	
	
	WebRepository webRepository = new WebRepository();
	
	void create(String data) {
		System.out.println("서비스에 넘어온 데이터 확인 : " + data);
		webRepository.create(data);
	}
}
