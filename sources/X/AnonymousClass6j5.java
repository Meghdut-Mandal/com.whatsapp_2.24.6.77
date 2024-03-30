package X;

import android.view.View;

/* renamed from: X.6j5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6j5 implements AnonymousClass7eE {
    public static final /* synthetic */ AnonymousClass6j5 A00 = new AnonymousClass6j5();

    public final int BG2(View view, int i) {
        int measuredHeight;
        if (view == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        return Math.min(measuredHeight, i);
    }
}
