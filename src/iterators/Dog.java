package iterators;

public class Dog implements Comparable<Dog>{
	public String name;
	public boolean isMale;
	public int age;
	
	public Dog(String name, boolean isMale, int age) {
		this.name = name;
		this.isMale = isMale;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Dog dog1) {
		if (this.getAge() - dog1.getAge() > 0) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
