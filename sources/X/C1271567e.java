package X;

import android.net.Uri;

/* renamed from: X.67e  reason: invalid class name and case insensitive filesystem */
public abstract class C1271567e {
    public final Uri A00;
    public final AnonymousClass72I A01;
    public final String A02;
    public final AnonymousClass671 A03;
    public final C188598zq A04;

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        objArr[1] = this.A00;
        objArr[2] = this.A03;
        objArr[3] = this.A04;
        return AnonymousClass000.A0M(this.A01, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1271567e)) {
            return false;
        }
        C1271567e r4 = (C1271567e) obj;
        if (!this.A00.equals(r4.A00) || !this.A03.equals(r4.A03) || !this.A01.equals(r4.A01) || !this.A02.equals(r4.A02)) {
            return false;
        }
        return true;
    }

    public C1271567e(AnonymousClass72I r2, String str, String str2, AnonymousClass671 r5, C188598zq r6) {
        this.A00 = Uri.parse(str);
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = str2;
        this.A01 = r2;
    }
}
