package X;

import android.os.SystemClock;

/* renamed from: X.3oS  reason: invalid class name and case insensitive filesystem */
public class C76183oS implements C25711Hj {
    public Object A00;
    public Object A01;
    public final int A02;

    public C76183oS(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void accept(Object obj) {
        Object obj2;
        C25901Ic r0;
        long longValue;
        switch (this.A02) {
            case 0:
                obj2 = this.A01;
                r0 = ((C608539p) this.A00).A01;
                break;
            case 1:
                obj2 = this.A01;
                r0 = ((C20260xH) this.A00).A0M;
                break;
            case 2:
                AnonymousClass2bU r4 = (AnonymousClass2bU) this.A01;
                C596834w r12 = (C596834w) obj;
                synchronized (r4) {
                    C65013Qj A002 = AnonymousClass2bU.A00(r4);
                    A002.A0V = false;
                    A002.A0f = true;
                    A002.A0E = 0;
                    A002.A0Q = true;
                    A002.A0d = r12.A00;
                    A002.A0e = r12.A01;
                }
                return;
            default:
                AnonymousClass1ST r7 = (AnonymousClass1ST) this.A00;
                AnonymousClass2bU r6 = (AnonymousClass2bU) this.A01;
                Number number = (Number) obj;
                C65013Qj A003 = AnonymousClass2bU.A00(r6);
                long j = r6.A00;
                if (j == 0) {
                    longValue = 0;
                } else {
                    longValue = (number.longValue() * 100) / j;
                }
                A003.A0E = longValue;
                A003.A0B = number.longValue();
                long uptimeMillis = SystemClock.uptimeMillis();
                long j2 = r7.A00;
                if (j2 == 0 || uptimeMillis - j2 >= 500) {
                    r7.A08.A05(r6, 8);
                    r7.A00 = uptimeMillis;
                    AnonymousClass1ST.A03(r7);
                    return;
                }
                return;
        }
        r0.unregisterObserver(obj2);
    }
}
