package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1ON  reason: invalid class name */
public final class AnonymousClass1ON implements AnonymousClass1OJ {
    public final C19460v5 A00;
    public final AnonymousClass1OO A01;
    public final C237819v A02;
    public final AnonymousClass1OP A03;
    public final AnonymousClass189 A04;
    public final C231517j A05;

    public AnonymousClass1ON(C19460v5 r2, AnonymousClass1OO r3, C237819v r4, AnonymousClass1OP r5, AnonymousClass189 r6, C231517j r7) {
        AnonymousClass00C.A0D(r7, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r4, 6);
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public Object Bot(C107995Rt r8, C023509x r9) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AR.A02;
        AnonymousClass0AR r3 = new AnonymousClass0AR(1, AnonymousClass0AA.A01(r9));
        r3.A0J();
        AnonymousClass1OO r6 = this.A01;
        AnonymousClass00C.A0D(r8, 0);
        int ordinal = r8.ordinal();
        int i = 2;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 3;
            } else {
                throw new C13180jS();
            }
        }
        if (C20800yB.A01(C21000yV.A02, r6.A01, 6500)) {
            C44712Oo r2 = new C44712Oo();
            r2.A00 = Integer.valueOf(i);
            r2.A01 = Long.valueOf(C19970wo.A00(r6.A00) / 1000);
            r6.A02.Bly(r2);
        }
        this.A03.A00().BOx(6, false);
        AnonymousClass189 r0 = this.A04;
        r0.A0M();
        r0.A0N();
        this.A05.A07();
        C19460v5 r1 = this.A00;
        if (r1.A05()) {
            r1.A02();
            throw new NullPointerException("removeAllAgentDevices");
        }
        r3.resumeWith(new C119485pt(C108095Sd.UNKNOWN, true));
        return r3.A0G();
    }
}
