package X;

import android.graphics.Typeface;

/* renamed from: X.0Gm  reason: invalid class name and case insensitive filesystem */
public class C03590Gm extends AnonymousClass071 {
    public final /* synthetic */ AnonymousClass0YF A00;
    public final /* synthetic */ AnonymousClass0UG A01;

    public C03590Gm(AnonymousClass0YF r1, AnonymousClass0UG r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A01(int i) {
        this.A00.A03 = true;
        this.A01.A00(i);
    }

    public void A02(Typeface typeface) {
        AnonymousClass0YF r1 = this.A00;
        Typeface create = Typeface.create(typeface, r1.A08);
        r1.A02 = create;
        r1.A03 = true;
        this.A01.A01(create, false);
    }
}
