package lec30;

public class person_client {
    public static void main(String[] args) {
        person p = new person("Kunal", 21);
		// p.setAge(90);
	//	p.setName("Kumar");
		p.setAge2(-19);
		System.out.println(p.getAge());
		System.out.println("Ka haal ba");
    }
}
