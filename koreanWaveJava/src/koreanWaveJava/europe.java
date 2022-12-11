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
	@Override
	public void winner(String first) {
		System.out.println(this.name+"에서 " + first+"(이)가 1등을 차지했다.");
	}
}
