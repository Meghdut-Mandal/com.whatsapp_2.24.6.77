package X;

import java.util.Arrays;

/* renamed from: X.9Wn  reason: invalid class name */
public final class AnonymousClass9Wn {
    public final String A00;
    public final String A01;
    public final AnonymousClass9X1 A02;
    public final Object[] A03;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9Wn)) {
            return false;
        }
        AnonymousClass9Wn r4 = (AnonymousClass9Wn) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A02.equals(r4.A02) && Arrays.equals(this.A03, r4.A03);
    }

    public int hashCode() {
        return ((this.A01.hashCode() ^ Integer.rotateLeft(this.A00.hashCode(), 8)) ^ Integer.rotateLeft(this.A02.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.A03), 24);
    }

    public AnonymousClass9Wn(String str, String str2, AnonymousClass9X1 r3, Object... objArr) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = r3;
        this.A03 = objArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        A0u.append(" : ");
        A0u.append(this.A00);
        A0u.append(' ');
        A0u.append(this.A02);
        A0u.append(' ');
        C90514aH.A1T(A0u, this.A03);
        return A0u.toString();
    }
}
