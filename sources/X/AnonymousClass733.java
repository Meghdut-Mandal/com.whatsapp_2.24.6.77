package X;

import android.location.Address;
import android.text.TextUtils;

/* renamed from: X.733  reason: invalid class name */
public class AnonymousClass733 implements Runnable {
    public double A00;
    public double A01;
    public Object A02;
    public final int A03;

    public AnonymousClass733(C133586Zc r1, double d, double d2, int i) {
        this.A03 = i;
        this.A02 = r1;
        this.A00 = d;
        this.A01 = d2;
    }

    public void run() {
        AnonymousClass17Y r4;
        Runnable r3;
        int i = this.A03;
        C133586Zc r42 = (C133586Zc) this.A02;
        double d = this.A00;
        double d2 = this.A01;
        if (i != 0) {
            Address A002 = C133586Zc.A00(r42, d, d2);
            String A032 = C133586Zc.A03(A002, r42);
            if (A002 != null && !TextUtils.isEmpty(A032)) {
                r4 = r42.A10;
                r3 = new C1503274v(2, A032, this);
            } else {
                return;
            }
        } else {
            Address A003 = C133586Zc.A00(r42, d, d2);
            String A033 = C133586Zc.A03(A003, r42);
            r4 = r42.A10;
            r3 = new C1502374m(this, A003, A033, 0);
        }
        r4.A0H(r3);
    }
}
