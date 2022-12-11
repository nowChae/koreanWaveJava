package koreanWaveJava;

public class europe extends totalCountry{
	String name;
	
	
	
	europe(String name){
		this.name = name;
	}
	
	void countryName() {
		System.out.println(this.name+"의 한국 연상 이미지");
		System.out.println("------------------------------");		
	} 
	//totalCountry의 winner override
	@Override
	public void winner(String first) {
		System.out.println(this.name+"에서 " + first+"(이)가 1등을 차지했다.");
	}
	//totalCountry의 print_nation override
	@Override
	public void print_nation() {
		System.out.println("유럽 권역에 해당하는 국가는 프랑스, 영국, 러시아, 튀르키예이다. ");
	}
}
