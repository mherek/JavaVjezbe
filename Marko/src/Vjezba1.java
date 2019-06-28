package src;

public class Vjezba1 {

	public static void main(String[] args) {

int x = 1, y = 2, z = 3; 
x = ++x - z-- + x;//x=1,z=2
y += y + --z; //y=6 z=1
z = y-- - z++; //y=4 z=4
x = z++ - --y + ++x + x;//z=5 y=3 x=5
z -= --z + ++x - --y;//z=-3 x=6 y=2
z++;--z;++x;x++;//z=-3, x=8
System.out.println("X =" + x + "Y ="  + y + "Z =" + z);

	}

}
