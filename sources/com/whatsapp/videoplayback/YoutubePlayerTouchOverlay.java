package com.whatsapp.videoplayback;

import X.AnonymousClass1QZ;
import X.AnonymousClass5NK;
import X.C18700tb;
import X.C36411kG;
import X.C36441kJ;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class YoutubePlayerTouchOverlay extends RelativeLayout implements C18700tb {
    public int A00;
    public AnonymousClass5NK A01;
    public AnonymousClass1QZ A02;
    public boolean A03;

    private void A00() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        requestLayout();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A00);
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
        requestLayout();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View A0L = C36411kG.A0L(this);
        if (A0L == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (action == 3) {
            motionEvent.setAction(1);
            A0L.onTouchEvent(motionEvent);
        } else if (action != 2) {
            A0L.onTouchEvent(motionEvent);
            AnonymousClass5NK r0 = this.A01;
            if (r0 != null) {
                r0.A0D();
                return true;
            }
        }
        return true;
    }

    public void setInlineVideoPlaybackControlView(AnonymousClass5NK r1) {
        this.A01 = r1;
    }

    public void setVideoHeight(int i) {
        this.A00 = i;
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }

    public YoutubePlayerTouchOverlay(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }
}
