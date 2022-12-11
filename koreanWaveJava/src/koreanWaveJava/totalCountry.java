package koreanWaveJava;

public class totalCountry implements Country, Nation{
	//Country 인터페이스
	private int year;
	
	public void trends() {
		this.year = Country.YEAR;
		System.out.println(this.year+"년도 한국 연상 이미지");
	}
	public void start() {
		System.out.println("국가별 한국 연상 이미지를 출력합니다.");
	}
	public void end() {
		System.out.println("------------------------------");
	}
	public void result(String first, String second, String third, String fourth, String fifth) {
		for (int i=0; i<5; i++) {
			System.out.print(i+1 + "등: ");
			if (i == 0) {
				System.out.println(first);
			}else if(i == 1) {
				System.out.println(second);
			}else if(i == 2) {
				System.out.println(third);
			}else if(i == 3) {
				System.out.println(fourth);
			}else {
				System.out.println(fifth);
			}
		}
	}
	public void winner(String first) {
		System.out.println("중동과 아프리카를 제외한 모든 권역에서" + first+"(이)가 1등을 차지했다.");
	}
	
	//Nation 인터페이스
	public void print_nation() {
		System.out.println("아시아.오세아니아, 미주, 유럽, 중동, 아프리카 권역에서 한국 연상 이미지를 알아보았다. ");
	}
}