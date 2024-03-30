package X;

import android.text.TextUtils;

/* renamed from: X.9Tj  reason: invalid class name and case insensitive filesystem */
public final class C195259Tj {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != C195259Tj.class) {
                return false;
            }
            C195259Tj r5 = (C195259Tj) obj;
            if (!TextUtils.equals(this.A00, r5.A00) || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((this.A00.hashCode() + 31) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + 1237;
    }

    public C195259Tj(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
