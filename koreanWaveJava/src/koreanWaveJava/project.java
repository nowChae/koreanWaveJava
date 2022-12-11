package koreanWaveJava;
import java.util.*;
import java.io.*;


public class project {//File입출력 시 IOExcption이 발생할 수 있으니 throws 처리
	public static void main(String[] args)throws IOException {
		
		File file = new File("test.txt");
        if(!file.exists()) //파일이 존재하지 않으면 
            file.createNewFile(); //생성
         
        FileWriter fw = new FileWriter(file);
        char []buf= {'s','t','a','r','t','\n'}; //start 문자열 기록
        //write를 통해서 char 배열의 문자열을 하나씩 기록
        for(int i=0;i<buf.length;i++) 
            fw.write(buf[i]);
        fw.close(); //스트림 닫기 
         
        //파일의 끝은 -1 따라서 -1을 만날 때 까지 한문자 한문자 출력
        FileReader fr=new FileReader(file);
        int EOF=-1;
        int c;
        while((c=fr.read())!=EOF) {
            System.out.print((char)c);
        }
                fr.close();
    

		//리스트 컬렉션 프레임워크를 통해 국가(권역) 종류 저장 
		List<String> list = new ArrayList<String>();
		//생성한 리스트에 국가(권역) 추가
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
		//조사한 권역을 줄글로 소개 ( 부모 클래스의 print_nation() 사용)
		totalCountry Total = new totalCountry();
		Total.print_nation();
		//보고싶은 국가의 번호를 입력
		System.out.print("나라 번호를 입력하세요:");
		
		Scanner sc = new Scanner(System.in);

		//숫자가 아닌 값을 입력하면 예외 처리
		try {
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
			
			
			//입력받은 수를 통해 그에 맞는 코드 실행 (국가(권역)별로 출력 값 다름)
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
				Asia.end();
				//아시아,오세아니아에 해당하는 국가들 출력
				Asia.print_nation();
				break;
			case 2:
				countryn = CountryList.MIDDLE_EAST;
				System.out.println("선택 국가: "+countryn);
				//middleEast class
				middleEast Middle_East = new middleEast("중동");
				
				Middle_East.trends();			
				Middle_East.start();
				Middle_East.countryName();
				//순위에 맞게 한국의 이미지 출력 
				Middle_East.result(korean[1],korean[0],korean[2],korean[3],korean[6]);
				Middle_East.end();
				//1위 한 한국의 이미지 출력 
				Middle_East.winner(korean[1]);
				Middle_East.end();
				//중동에 해당하는 국가들 출력
				Middle_East.print_nation();
				break;
			case 3:
				countryn = CountryList.AMERICA;
				System.out.println("선택 국가: "+countryn);
				//America class
				america America = new america("미주");
				
				America.trends();			
				America.start();
				America.countryName();
				//순위에 맞게 한국의 이미지 출력 
				America.result(korean[0], korean[4], korean[1], korean[3], korean[5]);
				America.end();
				//1위 한 한국의 이미지 출력 
				America.winner(korean[0]);
				America.end();
				//미주에 해당하는 국가들 출력
				America.print_nation();
				break;
			case 4:
				countryn = CountryList.EUROPE;
				System.out.println("선택 국가: "+countryn);
				//Europe class
				europe Europe = new europe("유럽");
				
				Europe.trends();			
				Europe.start();
				Europe.countryName();
				//순위에 맞게 한국의 이미지 출력 
				Europe.result(korean[0],korean[1], korean[4], korean[6], korean[5]);
				Europe.end();
				//1위 한 한국의 이미지 출력 
				Europe.winner(korean[0]);
				Europe.end();
				//유럽에 해당하는 국가들 출력
				Europe.print_nation();
				break;
			case 5:
				countryn = CountryList.AFRICA;
				System.out.println("선택 국가: "+countryn);
				//Africa class
				africa Africa = new africa("아프리카");
				
				Africa.trends();			
				Africa.start();
				Africa.countryName();
				//순위에 맞게 한국의 이미지 출력 
				Africa.result(korean[4],korean[1], korean[7], korean[8], korean[0]);
				Africa.end();
				//1위 한 한국의 이미지 출력 
				Africa.winner(korean[4]);
				Africa.end();
				//아프리카에 해당하는 국가들 출력
				Africa.print_nation();
				break;
			default: //1~5번을 제외한 다른 숫자 입력 시 출력
				System.out.println("다른 숫자를 입력해주세요");
			}
			}catch(InputMismatchException ime) { //오류 발생 시 잘못된 입력이라고 출력해줌
				System.out.println("잘못된 입력");
				System.out.println("1~5 사이의 정수만 입력하세요");
			}
    
		sc.close();
		
		
	
	}
}
