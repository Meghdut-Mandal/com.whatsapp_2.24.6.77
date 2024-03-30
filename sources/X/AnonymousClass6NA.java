package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6NA  reason: invalid class name */
public class AnonymousClass6NA {
    public static final AtomicInteger A05 = C90484aE.A0v();
    public Integer A00 = C023109s.A00;
    public boolean A01;
    public final int A02;
    public final AnonymousClass62U A03;
    public final C135056c3 A04;

    public void A00(Integer num) {
        Integer num2 = this.A00;
        if (num != num2) {
            int intValue = num2.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Already finished, cannot change to ");
                        throw AnonymousClass000.A0c(AnonymousClass5YB.A00(num), A0u);
                    } else if (intValue == 4) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("Already cancelled, cannot change to ");
                        throw AnonymousClass000.A0c(AnonymousClass5YB.A00(num), A0u2);
                    }
                } else if (num == C023109s.A0G) {
                    throw new IllegalArgumentException();
                }
            } else if (num == C023109s.A0G || num == C023109s.A0C) {
                throw new IllegalArgumentException();
            }
            this.A00 = num;
            return;
        }
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("Already in state: ");
        throw AnonymousClass000.A0c(AnonymousClass5YB.A00(num), A0u3);
    }

    public AnonymousClass6NA(AnonymousClass62U r2, C135056c3 r3, boolean z) {
        this.A01 = z;
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = A05.incrementAndGet();
    }
}
