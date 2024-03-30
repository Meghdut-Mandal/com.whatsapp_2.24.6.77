package X;

import android.text.TextUtils;

/* renamed from: X.28U  reason: invalid class name */
public class AnonymousClass28U extends C145166tS {
    public AnonymousClass3BG A00;
    public boolean A01;

    public boolean A0I() {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass28U(X.C20050ww r2, X.AnonymousClass1DU r3, X.AnonymousClass3BG r4) {
        /*
            r1 = this;
            java.lang.String r0 = r4.A08
            r1.<init>(r2, r3, r0)
            r1.A09 = r0
            r1.A0M(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28U.<init>(X.0ww, X.1DU, X.3BG):void");
    }

    public void A0M(AnonymousClass3BG r4) {
        this.A00 = r4;
        this.A0F = r4.A0A;
        this.A0C = r4.A02;
        this.A09 = r4.A08;
        this.A0Q = r4.A0F;
        byte[] bArr = r4.A00;
        if (bArr == null || bArr.length <= 0) {
            String str = r4.A09;
            if (str != null) {
                C36341k9.A1H(str, C36381kD.A0m(), this.A0K);
            }
        } else {
            this.A0Q = bArr;
        }
        String str2 = r4.A04;
        if (!TextUtils.isEmpty(str2)) {
            this.A06 = new AnonymousClass5BJ(str2, -1, -1);
        }
    }

    public boolean A0J() {
        return this.A01;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass28U(X.C20050ww r2, X.AnonymousClass398 r3, X.AnonymousClass1DU r4) {
        /*
            r1 = this;
            java.lang.String r0 = r3.A02
            r1.<init>(r2, r4, r0)
            r1.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28U.<init>(X.0ww, X.398, X.1DU):void");
    }
}
