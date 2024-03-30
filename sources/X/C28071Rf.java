package X;

import android.os.Handler;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.1Rf  reason: invalid class name and case insensitive filesystem */
public final class C28071Rf {
    public Handler A00;
    public Runnable A01;
    public final AnonymousClass16D A02;
    public final C220412q A03;
    public final AnonymousClass17X A04;
    public final C21010yW A05;
    public final AnonymousClass17V A06;
    public final C20350xQ A07;
    public final AnonymousClass19W A08;
    public final C19970wo A09;

    public C28071Rf(AnonymousClass16D r2, C19970wo r3, C220412q r4, AnonymousClass17X r5, C21010yW r6, AnonymousClass17V r7, C20350xQ r8, AnonymousClass19W r9) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r2, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r5, 7);
        AnonymousClass00C.A0D(r9, 8);
        this.A09 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r2;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
    }

    public void A01(AnonymousClass3T1 r9, int i, boolean z) {
        int i2;
        boolean z2;
        AnonymousClass2RL r2 = new AnonymousClass2RL();
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        r2.A03 = i2;
        AnonymousClass11F r5 = r9.A1J.A00;
        if (r5 != null) {
            C220412q r0 = this.A03;
            AnonymousClass16D r6 = this.A02;
            r2.A05 = Long.valueOf((long) AnonymousClass3TD.A00(r6, r0, r5));
            boolean z3 = false;
            if (AnonymousClass143.A0G(r5)) {
                GroupJid groupJid = (GroupJid) r5;
                AnonymousClass17X r02 = this.A04;
                boolean A0C = r02.A0C(groupJid);
                boolean A0D = r02.A0D(groupJid);
                if (A0C && A0D) {
                    z3 = true;
                }
                r2.A02 = Boolean.valueOf(z3);
                z2 = true;
            } else {
                z2 = false;
            }
            r2.A01 = z2;
            AnonymousClass141 A082 = r6.A08(r5);
            if ((r5 instanceof AnonymousClass147) && A082 != null) {
                r2.A00 = Boolean.valueOf(this.A07.A0n(A082, (AnonymousClass147) r5));
            }
        }
        r2.A04 = Integer.valueOf(C65453Sc.A00(i, z));
        this.A05.Bly(r2);
    }

    public void A00(AnonymousClass1A6 r8, AnonymousClass11F r9, int i, int i2) {
        if (r9 != null) {
            AnonymousClass2QJ r2 = new AnonymousClass2QJ();
            r2.A00 = Integer.valueOf(i);
            int i3 = 7;
            if (i2 == 1) {
                i3 = 4;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    i3 = 2;
                } else if (i2 == 4) {
                    i3 = 5;
                } else if (i2 != 6) {
                    i3 = 6;
                    if (i2 != 7) {
                        i3 = 1;
                    }
                } else {
                    i3 = 3;
                }
            }
            r2.A01 = Integer.valueOf(i3);
            r2.A03 = this.A06.A03(r9.getRawString());
            C220412q r0 = r8.A02;
            C220412q.A00(r0);
            r2.A02 = Long.valueOf((long) r0.A03(r9));
            this.A05.Bly(r2);
        }
    }
}
