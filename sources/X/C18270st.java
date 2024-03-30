package X;

import android.graphics.Typeface;

/* renamed from: X.0st  reason: invalid class name and case insensitive filesystem */
public class C18270st implements C16940qS {
    public Object A00;
    public final int A01;

    public C18270st(AnonymousClass0Z1 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void B19(Typeface typeface) {
        boolean A04;
        int i = this.A01;
        AnonymousClass0Z1 r1 = (AnonymousClass0Z1) this.A00;
        if (i != 0) {
            A04 = AnonymousClass0Z1.A05(typeface, r1);
        } else {
            A04 = AnonymousClass0Z1.A04(typeface, r1);
        }
        if (A04) {
            r1.A0F(false);
        }
    }
}
