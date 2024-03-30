package X;

import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.whatsapp.WaEditText;

/* renamed from: X.4d5  reason: invalid class name and case insensitive filesystem */
public class C92074d5 extends GestureDetector.SimpleOnGestureListener {
    public int A00 = -1;
    public final /* synthetic */ ScrollView A01;
    public final /* synthetic */ WaEditText A02;

    public C92074d5(ScrollView scrollView, WaEditText waEditText) {
        this.A02 = waEditText;
        this.A01 = scrollView;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.A01.requestDisallowInterceptTouchEvent(true);
        return super.onDown(motionEvent);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WaEditText waEditText = this.A02;
        if (TextUtils.isEmpty(waEditText.getText())) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        int i = this.A00;
        this.A00 = waEditText.getScrollY();
        waEditText.scrollBy((int) (f + 0.5f), (int) (0.5f + f2));
        if ((f2 >= 0.0f || waEditText.getScrollY() > 0) && (f2 <= 0.0f || i != this.A00)) {
            return true;
        }
        this.A01.requestDisallowInterceptTouchEvent(false);
        this.A00 = -1;
        return true;
    }
}
