package test.mypac;

@FunctionalInterface
public interface Joinner { //두 문자열을 연결해서 리턴해주는 메서드
	public String join(String one, String two);
}
