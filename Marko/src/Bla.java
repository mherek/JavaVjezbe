package src;

public class Bla {

	public static void main(String[] args) {

int x = 1, y = 2, z = 3; 
x = ++x - z-- + x;//x=1,z=2
y += y + --z; //y=5 z=1
z = y-- - z++; //y=4 z=4
//x = z++ - --y + ++x + x;//z=5 y=3 x=3
		System.out.println(x);
	}

}
