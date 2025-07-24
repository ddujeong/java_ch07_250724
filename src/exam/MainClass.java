package exam;

public class MainClass {
	
	public static void main(String[] args) {
	Truck truck =  new Truck("트럭", "6륜", "red", 6 , 2, "offload");
	SportsCar sportsCar = new SportsCar("스포츠카", "4륜", "yellow", 4, 2, 2);
	Bus bus = new Bus("관광 버스","4륜 " ,"white", 4, 1 , 44);

	truck.carType();
	sportsCar.carType();
	bus.carType();
	
	System.out.println("=======================================");

	Rectangle rectangle = new Rectangle(10, 10, "red", 4, 4);
	Triangle triangle = new Triangle(10, 10, "blue", 3, 3);
	Circle circle = new Circle(5, 5, "yellow", 0);
	
	System.out.println("사각형의 넓이 : " + rectangle.area());
	System.out.println("삼각형의 넓이 : " + triangle.area());
	System.out.println("원의 넓이 : " + circle.area());
	
	System.out.println("=======================================");
	
	Student student = new Student("김철수","학생", "공부");
	Solider solider = new Solider("홍길동", "군인", "군사 업무");
	Employee employee = new Employee("김미영","공무원"," 행정업무");
	
	student.job();
	solider.job();
	employee.job();
	
	System.out.println("=======================================");
	
	Dog dog = new Dog("강아지", "멍멍이", "검은색","멍멍");
	Cat cat = new Cat("고양이", "냐옹이", "치즈색", "야옹");
	Tiger tiger = new Tiger("호랑이", "tiger", "백호", "어흥", true);
	
	dog.ani();
	dog.bark();
	cat.ani();
	cat.bark();
	tiger.ani();
	tiger.bark();
	
	
	}
	
}