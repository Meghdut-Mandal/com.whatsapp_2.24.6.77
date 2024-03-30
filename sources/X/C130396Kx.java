package X;

import android.graphics.BitmapFactory;

/* renamed from: X.6Kx  reason: invalid class name and case insensitive filesystem */
public class C130396Kx {
    public final int A00;
    public final int A01;
    public final long A02;
    public final BitmapFactory.Options A03;
    public final boolean A04;

    public C130396Kx(int i, int i2) {
        this((BitmapFactory.Options) null, (Long) null, i, i2, false);
    }

    public C130396Kx(BitmapFactory.Options options, Long l, int i, int i2, boolean z) {
        boolean z2;
        if (i < 2 || i2 < 2 || ((l != null && l.longValue() <= 0) || (z && i != i2))) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("bitmaputils/bitmapspec/wrong/ ");
        A0u.append(i);
        A0u.append(",");
        A0u.append(i2);
        A0u.append(",");
        A0u.append(l);
        C18740tg.A0D(z2, C36371kC.A0z(",", A0u, z));
        long j = 25000000;
        if (!z2) {
            this.A01 = Integer.MAX_VALUE;
            this.A00 = Integer.MAX_VALUE;
            this.A02 = 25000000;
            this.A04 = false;
        } else {
            this.A01 = i;
            this.A00 = i2;
            this.A02 = l != null ? Math.min(l.longValue(), 25000000) : j;
            this.A04 = z;
        }
        this.A03 = options == null ? new BitmapFactory.Options() : options;
    }
}
