package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.1ub  reason: invalid class name and case insensitive filesystem */
public class C40021ub extends AnonymousClass04R {
    public final AnonymousClass08S A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final AnonymousClass1LV A03;
    public final C65253Ri A04;
    public final C226815j A05 = AnonymousClass4W3.A00(this, 6);
    public final AnonymousClass16I A06;
    public final AnonymousClass1NL A07 = new C90404a6(this, 0);
    public final AnonymousClass1WG A08;
    public final C220412q A09;
    public final C24521Ct A0A = new AnonymousClass4YE(this, 6);
    public final C24381Cf A0B;
    public final C24541Cv A0C;
    public final AnonymousClass191 A0D = C90394a5.A00(this, 9);
    public final AnonymousClass16J A0E;
    public final C20810yC A0F;
    public final C24511Cs A0G = new AnonymousClass4WB(this, 4);
    public final C233117z A0H;
    public final C32021cp A0I = new AnonymousClass4WC(this, 2);
    public final C26801Lo A0J;
    public final AnonymousClass1EL A0K;
    public final C34831hi A0L;
    public final C19930wk A0M;
    public final C28201Rs A0N = C36441kJ.A0t();
    public final C28201Rs A0O = C36441kJ.A0t();
    public final Comparator A0P;
    public final Comparator A0Q;
    public final Map A0R = C36431kI.A1G();
    public final Map A0S = AnonymousClass001.A0J();
    public final C006302t A0T = new C40611vp(this, 7);
    public final C006302t A0U = new C40611vp(this, 4);
    public final C006302t A0V = new C40611vp(this, 5);
    public final C34831hi A0W;

    public static ArrayList A01(C40021ub r5, C65073Qp r6, Map map) {
        HashSet A042 = r5.A03.A04(C65533Sl.A01(r6.A06()));
        if (!A042.isEmpty()) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                C220412q r0 = r5.A09;
                GroupJid groupJid = ((AnonymousClass3QK) it.next()).A02;
                C65073Qp A0W2 = C36371kC.A0W(r0, groupJid);
                if (A0W2 != null) {
                    map.put(groupJid, r6);
                    A0I2.add(A0W2);
                }
            }
            if (!A0I2.isEmpty()) {
                return A0I2;
            }
        }
        return null;
    }

    public static List A02(C40021ub r4, C65073Qp r5) {
        List<C65073Qp> list = (List) r4.A0R.remove(r5);
        if (list != null) {
            for (C65073Qp A062 : list) {
                r4.A0S.remove(C36441kJ.A0l(A062.A06()));
            }
        }
        return list;
    }

    public static boolean A04(C40021ub r5, AnonymousClass11F r6) {
        if (r6 instanceof AnonymousClass147) {
            Map map = r5.A0R;
            if (!map.isEmpty()) {
                Iterator A0y = AnonymousClass000.A0y(map);
                while (A0y.hasNext()) {
                    C65073Qp r2 = (C65073Qp) AnonymousClass000.A11(A0y).getKey();
                    AnonymousClass11F A062 = r2.A06();
                    if ((A062 instanceof AnonymousClass147) && r6.equals(A062)) {
                        A02(r5, r2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A0R() {
        this.A0B.unregisterObserver(this.A0A);
        this.A08.unregisterObserver(this.A07);
        this.A0J.unregisterObserver(this.A0I);
        this.A0E.unregisterObserver(this.A0D);
        this.A0H.unregisterObserver(this.A0G);
        this.A06.unregisterObserver(this.A05);
        C65253Ri r0 = this.A04;
        r0.A03.unregisterObserver(r0.A02);
    }

    public C40021ub(AnonymousClass17Y r6, C19730wQ r7, AnonymousClass1LV r8, AnonymousClass16I r9, AnonymousClass1WG r10, C18820ts r11, C220412q r12, C24381Cf r13, C24541Cv r14, AnonymousClass16J r15, C20810yC r16, C233117z r17, C26801Lo r18, C230917d r19, AnonymousClass1EL r20, C19770wU r21) {
        Comparator r0;
        C20810yC r3 = r16;
        this.A0F = r3;
        this.A01 = r6;
        this.A02 = r7;
        this.A09 = r12;
        this.A0M = new C19930wk(r21, false);
        this.A06 = r9;
        this.A0C = r14;
        this.A0E = r15;
        this.A0K = r20;
        this.A08 = r10;
        this.A03 = r8;
        this.A0J = r18;
        this.A0B = r13;
        this.A0H = r17;
        this.A0L = C36441kJ.A0s(AnonymousClass001.A0I());
        C34831hi A0s = C36441kJ.A0s(AnonymousClass001.A0I());
        this.A0W = A0s;
        this.A0Q = new C81773xY(r12);
        if (C20800yB.A01(C21000yV.A01, r3, 7936)) {
            r0 = new C81373wu(r11);
        } else {
            r0 = new C81443x1(r12, r19);
        }
        this.A0P = r0;
        C65253Ri r32 = new C65253Ri(r13, new C40611vp(this, 6));
        this.A04 = r32;
        AnonymousClass08S A0Y = C36441kJ.A0Y();
        this.A00 = A0Y;
        Objects.requireNonNull(A0Y);
        A0Y.A0F(A0s, new C53822rw(A0Y, 12));
        C53822rw.A02(r32.A04, A0Y, this, 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0195, code lost:
        if (r7.isEmpty() != false) goto L_0x0197;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0139 A[LOOP:1: B:45:0x0130->B:49:0x0139, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C40021ub r24, boolean r25) {
        /*
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            r8 = r24
            X.0yC r6 = r8.A0F
            r0 = 982(0x3d6, float:1.376E-42)
            boolean r0 = r6.A0E(r0)
            r15 = 7983(0x1f2f, float:1.1187E-41)
            r9 = 5543(0x15a7, float:7.767E-42)
            r5 = 0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r6.A0E(r9)
            if (r0 != 0) goto L_0x003a
            X.1LV r0 = r8.A03
            X.17d r0 = r0.A08
            r0.A03()
            java.util.Map r0 = r0.A01
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003a
            boolean r0 = r6.A0E(r15)
            if (r0 == 0) goto L_0x003a
            r0 = 6
            X.3GG r1 = new X.3GG
            r1.<init>(r5, r5, r0)
            r0 = 0
            r7.add(r0, r1)
        L_0x003a:
            java.util.Map r0 = r8.A0R
            r24 = r0
            java.util.Set r0 = r24.keySet()
            java.util.ArrayList r1 = X.C36441kJ.A15(r0)
            java.util.Comparator r0 = r8.A0P
            java.util.Collections.sort(r1, r0)
            java.util.Iterator r16 = r1.iterator()
        L_0x004f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x016d
            java.lang.Object r4 = r16.next()
            X.3Qp r4 = (X.C65073Qp) r4
            r0 = r24
            java.lang.Object r11 = r0.get(r4)
            java.util.List r11 = (java.util.List) r11
            X.11F r0 = r4.A06()
            com.whatsapp.jid.GroupJid r2 = X.C36441kJ.A0l(r0)
            if (r2 == 0) goto L_0x0075
            if (r11 == 0) goto L_0x0075
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0080
        L_0x0075:
            X.3Ri r0 = r8.A04
            java.util.Set r0 = r0.A01
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0080
            goto L_0x004f
        L_0x0080:
            X.3Ri r1 = r8.A04
            java.util.Set r0 = r1.A01
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x00c8
            X.11F r0 = r4.A06()
            com.whatsapp.jid.GroupJid r3 = X.AnonymousClass6SZ.A00(r0)
            if (r3 != 0) goto L_0x009c
            java.util.List r10 = java.util.Collections.emptyList()
        L_0x0098:
            r7.addAll(r10)
            goto L_0x004f
        L_0x009c:
            r2 = 7
            r22 = 1
            r0 = 12
            X.2qm r20 = X.C53102qm.A02(r1, r0)
            r0 = 13
            X.2qm r21 = X.C53102qm.A02(r1, r0)
            X.3I2 r0 = r1.A00
            java.util.Set r0 = r0.A00
            boolean r23 = X.C007103b.A0j(r0, r3)
            X.3K3 r1 = new X.3K3
            r17 = r1
            r18 = r4
            r19 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.3GG r0 = new X.3GG
            r0.<init>(r3, r1, r2)
            java.util.List r10 = java.util.Collections.singletonList(r0)
            goto L_0x0098
        L_0x00c8:
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            X.11F r0 = r4.A06()
            com.whatsapp.jid.GroupJid r3 = X.AnonymousClass6SZ.A00(r0)
            if (r3 == 0) goto L_0x00f6
            r2 = 7
            X.02t r12 = r8.A0U
            X.02t r1 = r8.A0V
            r22 = 0
            X.3K3 r0 = new X.3K3
            r23 = 0
            r17 = r0
            r18 = r4
            r19 = r3
            r20 = r12
            r21 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.3GG r1 = new X.3GG
            r1.<init>(r3, r0, r2)
            r10.add(r1)
        L_0x00f6:
            X.1Cv r1 = r8.A0C
            X.11F r0 = r4.A06()
            X.3T1 r13 = r1.A04(r0)
            r12 = 0
            if (r13 == 0) goto L_0x0113
            X.0wQ r0 = r8.A02
            boolean r0 = X.C66013Ui.A0U(r0, r13)
            if (r0 == 0) goto L_0x0113
            monitor-enter(r4)
            long r2 = r4.A0K     // Catch:{ all -> 0x016a }
            monitor-exit(r4)
            monitor-enter(r4)
            long r0 = r4.A0J     // Catch:{ all -> 0x016a }
            goto L_0x0115
        L_0x0113:
            r14 = 0
            goto L_0x0130
        L_0x0115:
            monitor-exit(r4)
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 < 0) goto L_0x0113
            r3 = 12
            X.02t r0 = r8.A0T
            X.3Hz r2 = new X.3Hz
            r2.<init>(r13, r0)
            X.11F r1 = r13.A0J()
            X.3GG r0 = new X.3GG
            r0.<init>(r1, r2, r3)
            r10.add(r0)
            r14 = 1
        L_0x0130:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x015a
            r13 = 3
            if (r14 >= r13) goto L_0x015a
            java.lang.Object r3 = r11.get(r12)
            X.3Qp r3 = (X.C65073Qp) r3
            X.11F r2 = r3.A06()
            r1 = 2
            X.5Jv r0 = new X.5Jv
            r0.<init>(r2, r1)
            X.11F r2 = r3.A06()
            X.3GG r1 = new X.3GG
            r1.<init>(r2, r0, r13)
            r10.add(r1)
            int r14 = r14 + 1
            int r12 = r12 + 1
            goto L_0x0130
        L_0x015a:
            r2 = 8
            X.11F r1 = r4.A06()
            X.3GG r0 = new X.3GG
            r0.<init>(r1, r4, r2)
            r10.add(r0)
            goto L_0x0098
        L_0x016a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x016d:
            int r0 = r7.size()
            if (r0 == 0) goto L_0x0197
            r0 = 982(0x3d6, float:1.376E-42)
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x0191
            boolean r0 = r6.A0E(r9)
            if (r0 != 0) goto L_0x0191
            boolean r0 = r6.A0E(r15)
            if (r0 != 0) goto L_0x0191
            r0 = 6
            X.3GG r1 = new X.3GG
            r1.<init>(r5, r5, r0)
            r0 = 0
            r7.add(r0, r1)
        L_0x0191:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x01a5
        L_0x0197:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            r1 = 9
            X.3GG r0 = new X.3GG
            r0.<init>(r5, r5, r1)
            r7.add(r0)
        L_0x01a5:
            X.1hi r0 = r8.A0L
            r0.A0C(r7)
            if (r25 == 0) goto L_0x01b1
            X.1hi r0 = r8.A0W
            r0.A0C(r7)
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40021ub.A03(X.1ub, boolean):void");
    }
}
