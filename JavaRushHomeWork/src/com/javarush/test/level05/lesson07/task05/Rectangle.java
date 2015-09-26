package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
	private int top;
	private int left;
	private int width;
	private int height;
	
	public void initialize (int left, int top, int width, int height){
		this.top = top;
		this.left = left;
		this.width = width;
		this.height = height;
	}

	public void initialize (int left, int top) {
		this.left = left;
		this.top = top;
		this.width = 0;
		this.height = 0;
	}

	public void initialize (int left, int top, int width) {
		this.left = left;
		this.top = top;
		this.height = this.width = width;
	}

	public void initialize (Rectangle rectangle) {

		this.left = rectangle.left;
		this.top = rectangle.top;
		this.height = rectangle.height;
		this.width = rectangle.width;


	}
	
//	public static void main (String[] args){
//
//		Rectangle rectangle = new Rectangle();
//		rectangle.initialize(0, 0, 10, 20);
//		System.out.println((rectangle.left + " " + rectangle.top + " " + rectangle.height + " " + rectangle.width));
//
//		Rectangle rectangle1 = new Rectangle();
//		rectangle1.initialize(10, 20);
//		System.out.println((rectangle1.left + " " + rectangle1.top + " " + rectangle1.height + " " + rectangle1.width));
//
//		Rectangle rectangle2 = new Rectangle();
//		rectangle2.initialize(11, 12, 20);
//		System.out.println((rectangle2.left + " " + rectangle2.top + " " + rectangle2.height + " " + rectangle2.width));
//
//		Rectangle rectangle3 = new Rectangle();
//		rectangle3.initialize(rectangle2);
//		assert(rectangle3.equals(rectangle2));
//		System.out.println((rectangle3.left + " " + rectangle3.top + " " + rectangle3.height + " " + rectangle3.width));
//
////		rectangle1 = rectangle2;
////		System.out.println((rectangle1.left + " " + rectangle1.top + " " + rectangle1.width + " " + rectangle1.height));
//	}

}
