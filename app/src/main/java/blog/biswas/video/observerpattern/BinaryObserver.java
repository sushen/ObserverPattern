package blog.biswas.video.observerpattern;

import android.widget.TextView;

public class BinaryObserver extends Observer {


    public BinaryObserver(Subject subject, TextView textView) {
        this.subject = subject;
        this.textView = textView;
    }


    @Override
    public void update() {
        textView.setText("B :" + Integer.toBinaryString(subject.getValue()));

    }
}
