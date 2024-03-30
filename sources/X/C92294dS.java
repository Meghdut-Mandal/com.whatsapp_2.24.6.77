package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.4dS  reason: invalid class name and case insensitive filesystem */
public class C92294dS extends View {
    public final int[] A00 = new int[2];
    public final int[] A01 = new int[2];
    public final /* synthetic */ AnonymousClass6YT A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92294dS(Context context, AnonymousClass6YT r4) {
        super(context);
        this.A02 = r4;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass6YT r2 = this.A02;
        View view = r2.A08;
        if (view == null) {
            return super.onTouchEvent(motionEvent);
        }
        view.getLocationOnScreen(this.A00);
        getLocationOnScreen(this.A01);
        return r2.A08.dispatchTouchEvent(motionEvent);
    }
}
