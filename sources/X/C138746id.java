package X;

import android.view.View;

/* renamed from: X.6id  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C138746id implements C16750q2 {
    public static final /* synthetic */ C138746id A00 = new C138746id();

    public final void Bw5(View view, float f) {
        if (f >= -1.0f && f <= 1.0f) {
            view.setPivotX(C36441kJ.A01(view) * 0.5f);
            view.setPivotY(C36441kJ.A02(view));
            view.setRotation(f * 18.75f);
        }
    }
}
