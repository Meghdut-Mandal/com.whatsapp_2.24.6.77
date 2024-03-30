package X;

import com.whatsapp.util.Log;

/* renamed from: X.1iK  reason: invalid class name and case insensitive filesystem */
public class C35211iK implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;

    public C35211iK(Object obj, int i, int i2, long j) {
        this.A03 = i2;
        this.A02 = obj;
        this.A01 = j;
        this.A00 = i;
    }

    public final void run() {
        if (this.A03 != 0) {
            AnonymousClass1VR r4 = (AnonymousClass1VR) this.A02;
            int i = this.A00;
            long j = this.A01;
            C45302Qv r7 = new C45302Qv();
            r7.A00 = Integer.valueOf(i);
            r7.A04 = r4.A01;
            long A002 = C19970wo.A00(r4.A03) / 1000;
            r7.A03 = Long.valueOf(A002);
            r7.A01 = Long.valueOf(A002 - r4.A00);
            r7.A02 = Long.valueOf(j);
            r4.A04.Bly(r7);
            if (r4.A01 == null) {
                Log.w("CompanionRegistrationLogger/logEvent MD session ID is null");
            }
            r4.A01 = null;
            r4.A00 = 0;
            return;
        }
        C34671hS r5 = (C34671hS) this.A02;
        long j2 = this.A01;
        int i2 = this.A00;
        C34621hN r1 = r5.A00;
        r1.A09.A0H(new C35261iP((Object) r5, i2, 4, (Object) r1.A0J.A01(j2)));
    }
}
