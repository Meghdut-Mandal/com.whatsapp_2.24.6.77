package X;

import android.graphics.Insets;

/* renamed from: X.09T  reason: invalid class name */
public final class AnonymousClass09T {
    public static final AnonymousClass09T A04 = new AnonymousClass09T(0, 0, 0, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass09T r5 = (AnonymousClass09T) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass09T A00(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return A04;
        }
        return new AnonymousClass09T(i, i2, i3, i4);
    }

    public static AnonymousClass09T A01(Insets insets) {
        return A00(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static AnonymousClass09T A02(AnonymousClass09T r5, AnonymousClass09T r6) {
        return A00(Math.max(r5.A01, r6.A01), Math.max(r5.A03, r6.A03), Math.max(r5.A02, r6.A02), Math.max(r5.A00, r6.A00));
    }

    public Insets A03() {
        return AnonymousClass09V.A00(this.A01, this.A03, this.A02, this.A00);
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Insets{left=");
        sb.append(this.A01);
        sb.append(", top=");
        sb.append(this.A03);
        sb.append(", right=");
        sb.append(this.A02);
        sb.append(", bottom=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass09T(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
