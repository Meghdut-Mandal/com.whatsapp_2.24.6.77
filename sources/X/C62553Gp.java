package X;

import android.os.Handler;

/* renamed from: X.3Gp  reason: invalid class name and case insensitive filesystem */
public class C62553Gp {
    public C49672jV A00;
    public String A01;
    public final C87644Pp A02;
    public final AnonymousClass171 A03;
    public final AnonymousClass144 A04;
    public final C19770wU A05;

    public void A00() {
        C49672jV r2 = this.A00;
        boolean z = true;
        if (r2 != null) {
            z = false;
            r2.A0D(false);
            Handler handler = r2.A00;
            if (handler != null) {
                handler.removeCallbacks(r2.A01);
            }
            r2.A00 = null;
            r2.A01 = null;
            this.A00 = null;
        }
        C49672jV r1 = new C49672jV(this.A03, this, this.A04, z);
        this.A00 = r1;
        C36391kE.A1Q(r1, this.A05);
    }

    public C62553Gp(AnonymousClass171 r1, C87644Pp r2, AnonymousClass144 r3, C19770wU r4) {
        this.A05 = r4;
        this.A03 = r1;
        this.A04 = r3;
        this.A02 = r2;
    }
}
