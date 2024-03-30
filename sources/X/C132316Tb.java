package X;

import java.util.Set;

/* renamed from: X.6Tb  reason: invalid class name and case insensitive filesystem */
public final class C132316Tb {
    public static final C132316Tb A08 = new C132316Tb(C023109s.A00, C004702c.A00, -1, -1, false, false, false, false);
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final Set A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C132316Tb(Integer num, Set set, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass00C.A0D(set, 8);
        this.A02 = num;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A07 = z4;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = set;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C36381kD.A1Y(this, obj)) {
            return false;
        }
        C132316Tb r7 = (C132316Tb) obj;
        if (this.A05 == r7.A05 && this.A06 == r7.A06 && this.A04 == r7.A04 && this.A07 == r7.A07 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A02 == r7.A02) {
            return AnonymousClass00C.A0J(this.A03, r7.A03);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.A02;
        long j = this.A01;
        long j2 = this.A00;
        return C36401kF.A02(this.A03, (((((((((((((C109395Xk.A00(num).hashCode() + num.intValue()) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final boolean A00() {
        return this.A06;
    }

    public C132316Tb() {
        this(C023109s.A00, C004702c.A00, -1, -1, false, false, false, false);
    }
}
