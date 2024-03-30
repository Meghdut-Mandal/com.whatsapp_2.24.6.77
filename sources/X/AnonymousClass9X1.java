package X;

/* renamed from: X.9X1  reason: invalid class name */
public final class AnonymousClass9X1 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9X1)) {
            return false;
        }
        AnonymousClass9X1 r4 = (AnonymousClass9X1) obj;
        return this.A00 == r4.A00 && this.A04 == r4.A04 && this.A03.equals(r4.A03) && this.A02.equals(r4.A02) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = 0;
        if (this.A04) {
            i2 = 64;
        }
        return i + i2 + (this.A03.hashCode() * this.A02.hashCode() * this.A01.hashCode());
    }

    public AnonymousClass9X1(String str, String str2, String str3, int i, boolean z) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = z;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A03);
        A0u.append('.');
        A0u.append(this.A02);
        A0u.append(this.A01);
        A0u.append(" (");
        A0u.append(this.A00);
        if (this.A04) {
            str = " itf";
        } else {
            str = "";
        }
        return C36321k7.A0E(str, A0u);
    }
}
