package X;

import android.text.TextUtils;

/* renamed from: X.9U4  reason: invalid class name */
public final class AnonymousClass9U4 {
    public final int A00;
    public final int A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9U4 r5 = (AnonymousClass9U4) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && TextUtils.equals(this.A02, r5.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + C165577te.A06(this.A02);
    }

    public AnonymousClass9U4(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
