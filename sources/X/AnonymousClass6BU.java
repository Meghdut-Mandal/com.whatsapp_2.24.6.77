package X;

import android.graphics.Bitmap;

/* renamed from: X.6BU  reason: invalid class name */
public final class AnonymousClass6BU {
    public Bitmap A00 = null;
    public final int A01;
    public final Integer A02;

    public AnonymousClass6BU(int i, Integer num) {
        this.A01 = i;
        this.A02 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BU) {
                AnonymousClass6BU r5 = (AnonymousClass6BU) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, this.A01 * 31) + C36411kG.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RowData(textRes=");
        A0u.append(this.A01);
        A0u.append(", titleTextRes=");
        A0u.append(this.A02);
        A0u.append(", bitmap=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
