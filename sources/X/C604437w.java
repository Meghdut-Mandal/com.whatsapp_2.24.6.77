package X;

import android.view.View;

/* renamed from: X.37w  reason: invalid class name and case insensitive filesystem */
public final class C604437w {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass2IN A03;

    public C604437w(AnonymousClass2IN r4, int i) {
        this.A03 = r4;
        this.A00 = i;
        this.A01 = r4.getHeight();
        AnonymousClass000.A16(r4, r4.getMeasuredHeight(), 0, View.MeasureSpec.makeMeasureSpec(r4.getMeasuredWidth(), Integer.MIN_VALUE));
        this.A02 = r4.getMeasuredHeight();
    }
}
