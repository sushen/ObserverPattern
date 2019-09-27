package blog.biswas.video.observerpattern;

import android.widget.TextView;

public abstract class Observer {
    protected Subject subject;
    public TextView textView;
    public abstract void update();
}
