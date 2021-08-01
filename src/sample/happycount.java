package sample;

import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class happycount {

	private int happyness = 100; 
	ProgressBar pb = new ProgressBar(happyness);
	ProgressIndicator pi = new ProgressIndicator(happyness);
	
	public void happyDec(boolean a) {
		if(!a&& happyness!=0) {
			happyness -= 10;
			pb.setProgress(happyness);
		}
	}
}
