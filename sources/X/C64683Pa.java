package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3Pa  reason: invalid class name and case insensitive filesystem */
public class C64683Pa {
    public static final int A06 = ((int) TimeUnit.DAYS.toHours(7));
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final C605438g A05;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !(obj instanceof C64683Pa)) {
                return false;
            }
            C64683Pa r9 = (C64683Pa) obj;
            C605438g r6 = this.A05;
            int i = r6.A00;
            C605438g r5 = r9.A05;
            if (!(i == r5.A00 && r6.A03.equals(r5.A03) && r6.A02.equals(r5.A02) && this.A02 == r9.A02 && this.A03 == r9.A03 && this.A01 == r9.A01 && this.A00 == r9.A00 && r6.A01.equals(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    static {
        TimeUnit.DAYS.toMillis(90);
    }

    public C64683Pa(C131506Pi r2, String str, String str2, int i, int i2, int i3, int i4, long j, long j2) {
        C605438g r0 = new C605438g(r2, str, str2, i);
        this.A02 = j;
        this.A03 = j2;
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = r0;
        this.A04 = i4;
    }

    public final int hashCode() {
        return this.A05.A00;
    }
}
