package X;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1Kk  reason: invalid class name and case insensitive filesystem */
public final class C26501Kk {
    public final C26551Kp A00;
    public final C26511Kl A01;

    public C26501Kk(C26551Kp r2, C26511Kl r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final C79593ty A00(String str, int i) {
        C79593ty r3;
        this.A00.A08(Integer.valueOf(i), "psl_cache_fetch_start");
        C79593ty r5 = new C79593ty();
        C26511Kl r4 = this.A01;
        synchronized (r4) {
            r3 = new C79593ty();
            if (r4.A06) {
                byte[] bArr = (byte[]) r4.A00.get(str);
                boolean z = false;
                if (bArr != null) {
                    z = true;
                }
                r3.A0C(new AnonymousClass011(Boolean.valueOf(z), bArr));
            } else {
                C26511Kl.A00(r4, new C153357Oa(r3, r4, str));
            }
        }
        r3.A0A(new AnonymousClass70I(r5, this, i));
        return r5;
    }

    public final Object A01(String str, C023509x r7, int i) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C12600iM.A01;
        C12600iM r4 = new C12600iM(AnonymousClass0AA.A01(r7));
        C79593ty A002 = A00(str, i);
        A002.A0A(new C164987sh(A002, r4, 0));
        A002.A00.A03(new C164987sh(A002, r4, 1), (Executor) null);
        return r4.A00();
    }
}
