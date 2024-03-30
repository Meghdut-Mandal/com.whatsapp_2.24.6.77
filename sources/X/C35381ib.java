package X;

import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.1ib  reason: invalid class name and case insensitive filesystem */
public class C35381ib implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C35381ib(Object obj, Object obj2, Object obj3, Object obj4, int i, long j) {
        this.A05 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A00 = j;
    }

    public final void run() {
        AnonymousClass2bQ r2;
        boolean z;
        switch (this.A05) {
            case 0:
                C29571Xd r22 = (C29571Xd) this.A01;
                AnonymousClass11F r5 = (AnonymousClass11F) this.A02;
                Object obj = this.A03;
                C65073Qp r8 = (C65073Qp) this.A04;
                long j = this.A00;
                if (r22.A03.A00().A01(r5)) {
                    r22.A07.A01(r5, Collections.singletonList(obj), 1);
                    return;
                }
                AnonymousClass163 r7 = r22.A08;
                C65073Qp A09 = r7.A00.A09(r5, false);
                C18740tg.A06(A09);
                synchronized (A09) {
                    z = true;
                    boolean z2 = false;
                    if (j != -1) {
                        if (j > r8.A0M) {
                            r8.A0M = j;
                            z2 = true;
                        }
                        if (j <= r8.A0T) {
                            r8.A0T = j - 1;
                        } else {
                            z = z2;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    r7.A06(r8);
                    return;
                }
                return;
            case 1:
                AnonymousClass1PB r82 = (AnonymousClass1PB) this.A01;
                long j2 = this.A00;
                C207209uj r72 = (C207209uj) this.A04;
                long A012 = r82.A01.A01((AnonymousClass147) this.A02, (UserJid) this.A03);
                if (!(A012 == -1 || (r2 = (AnonymousClass2bQ) r82.A03.A01.A01(A012)) == null)) {
                    r2.A07 = true;
                    r2.A01 = j2;
                    r82.A00.A0n(r2, 21);
                }
                r82.A02.A01(r72);
                return;
            default:
                long j3 = this.A00;
                ((C232817w) this.A01).A02(C20760y7.of(this.A04), (AnonymousClass144) this.A02, (UserJid) this.A03, j3);
                return;
        }
    }
}
