package X;

import android.view.View;

/* renamed from: X.3bf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68293bf implements C16750q2 {
    public static final /* synthetic */ C68293bf A00 = new C68293bf();

    public final void Bw5(View view, float f) {
        boolean z = true;
        if (f != 0.0f) {
            if (f == 1.0f || f == -1.0f) {
                z = false;
            } else {
                return;
            }
        }
        C011004s.A09(view, z);
        view.requestLayout();
    }
}
