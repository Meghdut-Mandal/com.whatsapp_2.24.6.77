package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2Dz  reason: invalid class name */
public class AnonymousClass2Dz extends C50052k7 {
    public final AnonymousClass17Y A00;
    public final AnonymousClass16D A01;
    public final C19970wo A02;
    public final AnonymousClass1PB A03;
    public final AnonymousClass147 A04;
    public final WeakReference A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2Dz(X.AnonymousClass17Y r14, X.AnonymousClass16D r15, X.C19970wo r16, X.AnonymousClass3D9 r17, X.AnonymousClass1PB r18, X.AnonymousClass34X r19, X.C64613Or r20, X.AnonymousClass1DF r21, X.AnonymousClass1NO r22, X.C29541Xa r23, X.AnonymousClass2EH r24, X.AnonymousClass147 r25, X.AnonymousClass1EV r26, X.AnonymousClass1EU r27) {
        /*
            r13 = this;
            r10 = r25
            r12 = r27
            r2 = r14
            r1 = r13
            r11 = r26
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r3 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r16
            r13.A02 = r0
            r13.A00 = r14
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r3)
            r13.A05 = r0
            r13.A01 = r15
            r13.A04 = r10
            r0 = r18
            r13.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Dz.<init>(X.17Y, X.16D, X.0wo, X.3D9, X.1PB, X.34X, X.3Or, X.1DF, X.1NO, X.1Xa, X.2EH, X.147, X.1EV, X.1EU):void");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass2EH r0 = (AnonymousClass2EH) this.A05.get();
        if (r0 != null) {
            r0.A02.A0D(AnonymousClass0AJ.A00);
        }
    }

    public Void A0G(Void... voidArr) {
        super.A08(voidArr);
        if (C36431kI.A1Y(this)) {
            return null;
        }
        ArrayList A002 = this.A03.A00(this.A04, C36371kC.A09(this.A02));
        HashSet A16 = C36441kJ.A16();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            AnonymousClass2bQ r2 = (AnonymousClass2bQ) it.next();
            AnonymousClass11F r1 = r2.A1J.A00;
            if (r1 != null && !A16.contains(r1)) {
                A16.add(r1);
                AnonymousClass141 A08 = this.A01.A08(r1);
                if (A08 != null) {
                    A0I.add(new C596534t(A08, r2));
                }
            }
        }
        this.A00.A0H(new C80293vA(this, A0I, 10));
        return null;
    }
}
