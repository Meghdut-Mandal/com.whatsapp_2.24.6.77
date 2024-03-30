package X;

import android.text.TextUtils;

/* renamed from: X.1Dh  reason: invalid class name and case insensitive filesystem */
public class C24661Dh implements C24651Dg {
    public final C21100yf A00;
    public final C19420v0 A01;
    public final C18820ts A02;
    public final C20810yC A03;
    public final C19890wg A04;

    public String BAI() {
        C19420v0 r0 = this.A01;
        String A0f = r0.A0f();
        String A0h = r0.A0h();
        if (TextUtils.isEmpty(A0f) || TextUtils.isEmpty(A0h)) {
            return this.A02.A05();
        }
        return AnonymousClass1M4.A01(A0f, A0h);
    }

    public C24661Dh(C21100yf r1, C19420v0 r2, C18820ts r3, C20810yC r4, C19890wg r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }
}
