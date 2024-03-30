package X;

import java.util.Arrays;

/* renamed from: X.9Tk  reason: invalid class name and case insensitive filesystem */
public final class C195269Tk {
    public int A00;
    public final B5T[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A01, ((C195269Tk) obj).A01);
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = 527 + Arrays.hashCode(this.A01);
        this.A00 = hashCode;
        return hashCode;
    }

    public C195269Tk(B5T... b5tArr) {
        this.A01 = b5tArr;
    }
}
