package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.9U3  reason: invalid class name */
public final class AnonymousClass9U3 {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9U3 r5 = (AnonymousClass9U3) obj;
            if (!Util.A0E(this.A01, r5.A01) || !Util.A0E(this.A02, r5.A02) || !Util.A0E(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A04 = (C36421kH.A04(this.A01) + C165577te.A06(this.A02)) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return A04 + i;
    }

    public AnonymousClass9U3(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
