package X;

import android.view.View;

/* renamed from: X.2g5  reason: invalid class name */
public class AnonymousClass2g5 extends C66803Xj {
    public Runnable A00;
    public final View A01;
    public final C95464l7 A02;
    public final View A03;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A03.removeCallbacks(runnable);
        }
        C80293vA r3 = new C80293vA(this, charSequence, 49);
        this.A00 = r3;
        this.A03.postDelayed(r3, 500);
    }

    public AnonymousClass2g5(View view, View view2, C95464l7 r3) {
        this.A03 = view;
        this.A01 = view2;
        this.A02 = r3;
    }
}
