package koreanWaveJava;

public class africa extends totalCountry{
	String name; //권역 위치 이름 (아프리카)
	
	africa(String name){
		this.name = name;
	}
	
	void countryName() {
		System.out.println(this.name+"의 한국 연상 이미지"); //아프리카의 한국 연상 이미지 
		System.out.println("------------------------------");		
	} 
	//totalCountry의 winner override
	@Override
	public void winner(String first) { // 아프리카에서 한국 연상이미지로 1등을 한 항목 출력 
		System.out.println(this.name+"에서 " + first+"(이)가 1등을 차지했다.");
	}
	//totalCountry의 print_nation override
	@Override
	public void print_nation() {
		System.out.println("아프리카 권역에 해당하는 국가는 남아공이다. ");
	}
}
