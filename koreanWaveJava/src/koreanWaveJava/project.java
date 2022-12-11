package koreanWaveJava;
import java.util.*;



public class project {
	public static void main(String[] args) {

		//리스트 컬렉션 프레임워크를 통해 국가 종류 저장 
		List<String> list = new ArrayList<String>();
		//생성한 리스트에 국가 추가
		list.add("아시아, 오세아니아");
		list.add("중동");
		list.add("미주");
		list.add("유럽");
		list.add("아프리카");
		
		//번호를 입력하기 위해 해당 국가의 번호를 출력
		System.out.println("------------------------------");
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+1 + "번: "+ str);
		}
		System.out.println("------------------------------");
		//보고싶은 국가의 번호를 입력
		System.out.print("나라 번호를 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();
		
		CountryList countryn = null; 
		// 배열 속에 한국의 이미지들의 종류를 담아둠
		String[] korean = new String[9];
		korean[0] = "K-Pop";
		korean[1] = "한식";
		korean[2] = "드라마";
		korean[3] = "힌류스타";
		korean[4] = "IT제품/브랜드";
		korean[5] = "한국전쟁, 북한";
		korean[6] = "뷰티제품";
		korean[7] = "영화";
		korean[8] = "태권도";
		
		//입력받은 수를 통해 그에 맞는 코드 실행 
		switch(number) {
		case 1:
			countryn = CountryList.ASIA;//열거타입에 저장된 국가 이름
			System.out.println("선택 국가: "+countryn);
			//Asia class 
			asia Asia = new asia("아시아");
			
			Asia.trends();			
			Asia.start();
			Asia.countryName();
			//순위에 맞게 한국의 이미지 출력 
			Asia.result(korean[0],korean[1],korean[2],korean[3],korean[4]);
			Asia.end();
			//1위 한 한국의 이미지 출력 
			Asia.winner(korean[0]);
			break;
		case 2:
			countryn = CountryList.MIDDLE_EAST;
			System.out.println("선택 국가: "+countryn);
			//middleEast class
			middleEast Middle_East = new middleEast("중동");
			
			Middle_East.trends();			
			Middle_East.start();
			Middle_East.countryName();
			Middle_East.result(korean[1],korean[0],korean[2],korean[3],korean[6]);
			Middle_East.end();
			Middle_East.winner(korean[1]);
			break;
		case 3:
			countryn = CountryList.AMERICA;
			System.out.println("선택 국가: "+countryn);
			//America class
			america America = new america("미주");
			
			America.trends();			
			America.start();
			America.countryName();
			America.result(korean[0], korean[4], korean[1], korean[3], korean[5]);
			America.end();
			America.winner(korean[0]);
			break;
		case 4:
			countryn = CountryList.EUROPE;
			System.out.println("선택 국가: "+countryn);
			//Europe class
			europe Europe = new europe("유럽");
			
			Europe.trends();			
			Europe.start();
			Europe.countryName();
			Europe.result(korean[0],korean[1], korean[4], korean[6], korean[5]);
			Europe.end();
			Europe.winner(korean[0]);
			break;
		case 5:
			countryn = CountryList.AFRICA;
			System.out.println("선택 국가: "+countryn);
			//Africa class
			africa Africa = new africa("아프리카");
			
			Africa.trends();			
			Africa.start();
			Africa.countryName();
			Africa.result(korean[4],korean[1], korean[7], korean[8], korean[0]);
			Africa.end();
			Africa.winner(korean[4]);
			break;
		}
    
		sc.close();
	
	}
}
