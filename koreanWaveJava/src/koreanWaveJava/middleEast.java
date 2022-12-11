package koreanWaveJava;

public class middleEast extends totalCountry{
	String name;
	
	
	
	middleEast(String name){
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
		System.out.println("중동 권역에 해당하는 국가는 UAE이다. ");
	}
}