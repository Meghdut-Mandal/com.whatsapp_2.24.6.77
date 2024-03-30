package com.whatsapp.status.playback.widget;

import X.AnonymousClass00C;
import X.C138746id;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.collections.MarginCorrectedViewPager;

public final class StatusPlaybackPager extends MarginCorrectedViewPager {
    public boolean A00;
    public boolean A01;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AnonymousClass00C.A0D(motionEvent, 0);
        if (this.A01 && (motionEvent.getPointerCount() <= 1 || motionEvent.getActionMasked() != 2)) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass00C.A0D(motionEvent, 0);
        if (!this.A01) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public StatusPlaybackPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A0O();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            if (i3 != 0 || i4 != 0) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    getChildAt(i5).setRotation(0.0f);
                }
            }
        }
    }

    public void setScrollEnabled(boolean z) {
        this.A01 = z;
    }

    public StatusPlaybackPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0O();
        this.A01 = true;
        A0L(C138746id.A00, true);
    }

    public StatusPlaybackPager(Context context) {
        super(context, (AttributeSet) null);
        A0O();
        this.A01 = true;
        A0L(C138746id.A00, true);
    }
}
