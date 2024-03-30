package X;

import java.math.BigInteger;

public final class AUo implements Comparable {
    public static final AUo A05 = new AUo(0, 1, "", 0);
    public static final AUo A06;
    public static final AUo A07 = new AUo(0, 0, "", 0);
    public static final AUo A08;
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass00T A03 = C36431kI.A1I(new C22035Afi(this));
    public final String A04;

    static {
        AUo aUo = new AUo(1, 0, "", 0);
        A08 = aUo;
        A06 = aUo;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AUo aUo = (AUo) obj;
        AnonymousClass00C.A0D(aUo, 0);
        return ((BigInteger) C36381kD.A0p(this.A03)).compareTo((BigInteger) C36381kD.A0p(aUo.A03));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AUo)) {
            return false;
        }
        AUo aUo = (AUo) obj;
        if (this.A00 == aUo.A00 && this.A01 == aUo.A01 && this.A02 == aUo.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((C165617ti.A01(this.A00) + this.A01) * 31) + this.A02;
    }

    public String toString() {
        String str;
        String str2 = this.A04;
        if (!AnonymousClass098.A06(str2)) {
            str = C90464aC.A0f(str2, AnonymousClass000.A0u(), '-');
        } else {
            str = "";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append('.');
        A0u.append(this.A01);
        A0u.append('.');
        A0u.append(this.A02);
        return AnonymousClass000.A0q(str, A0u);
    }

    public AUo(int i, int i2, String str, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = str;
    }
}
