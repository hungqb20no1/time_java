class Run {
	public static void main(String[] args) {
		Time t = new Time(24, 1, 1);
		t.display();
		t.setTime(21, 59, 59);
		t.display();
		t.nextSecond();
		t.display();
		t.nextSecond();
		t.display();
		t.setTime(12, 0, 0);
		t.display();
		t.previousSecond();
		t.display();
	}
}