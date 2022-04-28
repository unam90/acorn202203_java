package test.main;

import test.mypac.Member;
import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.study();
		
		new Student().study();
		//student 클래스의 기본(default)생성자(constructor)를 호출해서 객체를 생성한다는 의미.
		Member m1 = new Member(1, "김구라", "노량진");
		Member m2 = new Member(2, "해골", "행신동");
		Member m3= new Member();
	}
}
