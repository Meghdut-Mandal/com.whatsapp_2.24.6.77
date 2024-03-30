package X;

import android.view.View;

/* renamed from: X.0Tz  reason: invalid class name and case insensitive filesystem */
public class C06540Tz {
    public int A00;
    public int A01;
    public int A02;
    public final View A03;

    public void A00() {
        View view = this.A03;
        C012005e.A0Q(view, this.A02 - (view.getTop() - this.A01));
        C012005e.A0P(view, 0 - (view.getLeft() - this.A00));
    }

    public C06540Tz(View view) {
        this.A03 = view;
    }
}
