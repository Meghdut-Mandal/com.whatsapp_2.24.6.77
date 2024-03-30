package com.whatsapp.camera.recording;

import X.C012005e;
import X.C36391kE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;

public class RecordingView extends RelativeLayout {
    public TextView A00;
    public CircularProgressBar A01;
    public final Context A02;

    public RecordingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = context;
        A00();
    }

    public void A00() {
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A01 = (CircularProgressBar) C012005e.A02(this, R.id.recording_progress);
        this.A00 = C36391kE.A0O(this, R.id.recording_time);
        this.A01.setMax(100);
    }

    public RecordingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A02 = context;
        A00();
    }

    public RecordingView(Context context) {
        super(context, (AttributeSet) null);
        this.A02 = context;
        A00();
    }
}
