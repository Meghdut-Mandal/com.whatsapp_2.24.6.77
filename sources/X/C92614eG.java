package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: X.4eG  reason: invalid class name and case insensitive filesystem */
public class C92614eG extends WebView {
    public final /* synthetic */ C92804ek A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92614eG(Context context, C92804ek r3) {
        super(context, (AttributeSet) null);
        this.A00 = r3;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public boolean performClick() {
        super.performClick();
        return false;
    }
}
