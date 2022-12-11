package koreanWaveJava;

public interface Country {
	//상수
	public int YEAR = 2022;
	
	//추상 메소드
	public void trends();
	public void end();
	public void result(String first, String second, String third, String fourth, String fifth);
	public void winner(String first);
}
