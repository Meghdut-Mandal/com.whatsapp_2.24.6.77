package X;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

/* renamed from: X.1ih  reason: invalid class name and case insensitive filesystem */
public class C35441ih implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    public C35441ih(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = z;
    }

    public final void run() {
        boolean z;
        if (this.A06 != 0) {
            AnonymousClass1ST r5 = (AnonymousClass1ST) this.A00;
            C129166Fp r7 = (C129166Fp) this.A01;
            AnonymousClass2bU r4 = (AnonymousClass2bU) this.A02;
            C160107kT r6 = (C160107kT) this.A04;
            boolean z2 = this.A05;
            AnonymousClass1ST.A02(r7, r5, r4, true);
            AnonymousClass1SU r1 = r5.A0E;
            C65013Qj r0 = r4.A01;
            HashMap hashMap = r1.A00;
            synchronized (hashMap) {
                hashMap.remove(r0);
            }
            C133136Wx A012 = r7.A01();
            C18740tg.A06(A012);
            if (r6 != null) {
                int i = A012.A01;
                if (i == 13 || i == 24) {
                    if (r7.A04() != null) {
                        z = r7.A04().booleanValue();
                    } else {
                        z = false;
                    }
                    r6.BW6(z);
                } else {
                    r6.BW7(A012, r7);
                }
            }
            AnonymousClass1ST.A05(r5, r4, A012.A01, z2);
            return;
        }
        C20300xL r2 = (C20300xL) this.A00;
        byte[] bArr = (byte[]) this.A01;
        byte[] bArr2 = (byte[]) this.A02;
        C121865tq[] r52 = (C121865tq[]) this.A03;
        C121865tq r12 = (C121865tq) this.A04;
        boolean z3 = this.A05;
        C18740tg.A01();
        if (z3) {
            C20300xL.A00(r2);
        }
        synchronized (r2) {
            r2.A01 = true;
            r2.A03 = r52;
        }
        AnonymousClass19A r3 = r2.A0D;
        Message obtain = Message.obtain((Handler) null, 0, 85, 0, new C193489Lq(r12, bArr, bArr2, r52));
        AnonymousClass00C.A0D(obtain, 0);
        AnonymousClass19A.A01(obtain, r3, (String) null, false);
    }
}
