package _04_Snake;

public class Location {
private int x;
private int y;

public Location(int x, int y) {
this.x = x;
this.y = y;
}

public boolean sameLoc(int a, int b) {
	if (x == a && y == b) {
		return true;
	}
	return false;
}

void setX(int i) {
	x = i;
}

void setY(int i) {
	y = i;
}

int getX(){
	return x;
}

int getY() {
	return y;
}
}
