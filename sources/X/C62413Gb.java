package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.3Gb  reason: invalid class name and case insensitive filesystem */
public class C62413Gb {
    public final Drawable A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C62413Gb r5 = (C62413Gb) obj;
            if (!this.A02.equals(r5.A02) || this.A00 != r5.A00 || !C1901797e.A00(this.A01, r5.A01) || this.A03 != r5.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        objArr[1] = this.A00;
        objArr[2] = this.A01;
        return AnonymousClass000.A0M(Boolean.valueOf(this.A03), objArr, 3);
    }

    public C62413Gb(Drawable drawable, Integer num, String str, boolean z) {
        this.A02 = str;
        this.A00 = drawable;
        this.A01 = num;
        this.A03 = z;
    }
}
