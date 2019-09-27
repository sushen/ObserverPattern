package blog.biswas.video.observerpattern;

import android.widget.TextView;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject, TextView textView) {
        this.subject = subject;
        this.textView = textView;
    }

    @Override
    public void update() {
        textView.setText("B :" + Integer.toOctalString(subject.getValue()));
    }
}
