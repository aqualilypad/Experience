package sample;

import javafx.scene.control.ProgressBar;

public class happycount {

	private double happyness = 100; 
	ProgressBar pb = new ProgressBar(happyness);

	public void happyDec(boolean a) {
		if(!a&& happyness!=0) {
			happyness -= 10;
			pb.setProgress(happyness);
		}
	}
}
