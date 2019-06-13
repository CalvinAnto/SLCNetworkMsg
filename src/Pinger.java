import java.awt.Color;

public class Pinger implements Runnable {

	int num = 0;
	
	public Pinger(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		
		if (Main.Ping(String.format("%s%02d", Main.baseIp, num))) {
			Main.listB[num].setBackground(Color.white);
		} else {
			Main.listB[num].setBackground(Color.black);
		}
		
	}

}
