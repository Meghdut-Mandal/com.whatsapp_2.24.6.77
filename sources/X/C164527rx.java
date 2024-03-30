package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar;

/* renamed from: X.7rx  reason: invalid class name and case insensitive filesystem */
public class C164527rx implements GestureDetector.OnGestureListener {
    public Object A00;
    public final int A01;

    public C164527rx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num;
        boolean z;
        boolean z2;
        if (this.A01 == 0) {
            return false;
        }
        if (f > f2) {
            if (f > 0.0f) {
                num = C023109s.A0G;
            } else {
                num = C023109s.A0C;
            }
        } else if (f2 > 0.0f) {
            num = C023109s.A01;
        } else {
            num = C023109s.A00;
        }
        AnonymousClass6OX r3 = (AnonymousClass6OX) this.A00;
        int i = r3.A05;
        if ((!AnonymousClass000.A1S(i & 4, 4) || num != C023109s.A0C) && !((i & 8) == 8 && num == C023109s.A0G)) {
            z = false;
        } else {
            z = true;
        }
        if (((i & 2) == 2 && num == C023109s.A01) || ((i & 1) == 1 && num == C023109s.A00)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        C158117fp r2 = r3.A0B;
        motionEvent2.getX();
        motionEvent2.getY();
        Integer num2 = C023109s.A00;
        WaRangeSeekBar waRangeSeekBar = (WaRangeSeekBar) r2;
        waRangeSeekBar.A06 = null;
        WaRangeSeekBar.A01(waRangeSeekBar);
        r3.A0E = num2;
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }
}
