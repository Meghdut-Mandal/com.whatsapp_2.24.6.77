package X;

import java.util.Objects;

/* renamed from: X.9UX  reason: invalid class name */
public final class AnonymousClass9UX {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9UX) {
                AnonymousClass9UX r5 = (AnonymousClass9UX) obj;
                if (this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A00 == r5.A00) {
                    String str = this.A05;
                    Objects.requireNonNull(str);
                    if (str.equals(r5.A05)) {
                        String str2 = this.A04;
                        String str3 = r5.A04;
                        if (str2 != null) {
                            return !str2.equals(str3);
                        }
                        if (str3 != null) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.A05;
        Objects.requireNonNull(str);
        int A08 = ((C36381kD.A08(str, ((this.A02 * 31) + this.A01) * 31) + this.A03) * 31) + this.A00;
        String str2 = this.A04;
        if (str2 != null) {
            return C90504aG.A0B(str2, A08 * 31);
        }
        return A08;
    }

    public AnonymousClass9UX(String str, String str2, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = i3;
        this.A00 = i4;
    }
}
