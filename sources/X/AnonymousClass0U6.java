package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0U6  reason: invalid class name */
public class AnonymousClass0U6 {
    public AnonymousClass01Y A00;
    public C02740Bs A01;
    public C06560Ub A02;
    public ViewPager2 A03;
    public long A04 = -1;
    public final /* synthetic */ AnonymousClass0Hz A05;

    public AnonymousClass0U6(AnonymousClass0Hz r3) {
        this.A05 = r3;
    }

    public void A00(boolean z) {
        int i;
        AnonymousClass02E r0;
        AnonymousClass0Hz r2 = this.A05;
        AnonymousClass01z r6 = r2.A06;
        if (!r6.A0r() && this.A03.A06.A02 == 0) {
            C000700i r7 = r2.A03;
            if (r7.A00() != 0 && r2.A0J() != 0 && (i = this.A03.A00) < r2.A0J()) {
                long j = (long) i;
                if ((j != this.A04 || z) && (r0 = (AnonymousClass02E) r7.A05(j)) != null && r0.A12()) {
                    this.A04 = j;
                    AnonymousClass09Y r5 = new AnonymousClass09Y(r6);
                    AnonymousClass02E r62 = null;
                    for (int i2 = 0; i2 < r7.A00(); i2++) {
                        long A022 = r7.A02(i2);
                        AnonymousClass02E r3 = (AnonymousClass02E) r7.A04(i2);
                        if (r3.A12()) {
                            if (A022 != this.A04) {
                                r5.A0C(r3, AnonymousClass01P.STARTED);
                            } else {
                                r62 = r3;
                            }
                            r3.A11(AnonymousClass000.A1Q((A022 > this.A04 ? 1 : (A022 == this.A04 ? 0 : -1))));
                        }
                    }
                    if (r62 != null) {
                        r5.A0C(r62, AnonymousClass01P.RESUMED);
                    }
                    if (!r5.A0C.isEmpty()) {
                        r5.A03();
                    }
                }
            }
        }
    }
}
