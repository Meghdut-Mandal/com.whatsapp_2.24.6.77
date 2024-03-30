package X;

import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4kp  reason: invalid class name and case insensitive filesystem */
public final class C95404kp extends AnonymousClass08X implements C160627lJ, C159287j7, C159297j8 {
    public int A00;
    public Bundle A01;
    public C001700s A02;
    public C134996bx A03;
    public C135016bz A04;
    public AnonymousClass6QG A05;
    public AnonymousClass6DV A06;
    public C144426sA A07;
    public C132426To A08;
    public String A09;
    public ArrayList A0A;
    public HashSet A0B;
    public List A0C;
    public boolean A0D;
    public final AnonymousClass08S A0E;
    public final AnonymousClass08S A0F;
    public final C001700s A0G;
    public final AnonymousClass08M A0H;
    public final AnonymousClass17Y A0I;
    public final C142646pD A0J;
    public final C1272067j A0K;
    public final C129006Eo A0L;
    public final C130846Mq A0M;
    public final AnonymousClass6QK A0N;
    public final C134986bw A0O;
    public final C19630wG A0P;
    public final C20830yE A0Q;
    public final C18820ts A0R;
    public final AnonymousClass1QW A0S;
    public final C28201Rs A0T;
    public final C28201Rs A0U;
    public final C28201Rs A0V;
    public final C28201Rs A0W;
    public final C19770wU A0X;
    public final C001600r A0Y;
    public final C145896uh A0Z;
    public final AnonymousClass7g3 A0a;
    public final C143516qg A0b;
    public final AnonymousClass7gA A0c;
    public final List A0d;

    public static final void A05(C95404kp r10) {
        String str;
        r10.A07 = null;
        r10.A08.A02();
        C36341k9.A16(r10.A0W, 12);
        C143516qg r0 = r10.A0b;
        r0.A0D((String) null);
        C125025zC r2 = r0.A09;
        r2.A0I = false;
        r2.A0G = AnonymousClass001.A0I();
        r2.A02 = 0;
        r2.A03 = 9;
        AnonymousClass08S r22 = r10.A0F;
        AnonymousClass6QK r1 = r10.A0N;
        r22.A0D(AnonymousClass6QK.A00(r1, r10, 77));
        C145896uh r23 = r10.A0Z;
        C134986bw r6 = r10.A0O;
        AnonymousClass6QG r5 = r10.A05;
        if (r1.A0B()) {
            str = "all_descendents";
        } else {
            str = "current";
        }
        r23.A02(new C119215pS(150, (String) null), r1.A02(), r5, r6, str, (String) null, "map_view_serp");
        C36341k9.A16(r10.A02, 2);
    }

    public void BSN(int i, List list) {
        this.A00 = 3;
    }

    public void BSO(Map map) {
        AnonymousClass011 r0;
        C144426sA r02;
        AnonymousClass00C.A0D(map, 0);
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            C144406s8 r1 = ((C144426sA) it.next()).A0B;
            C144416s9 r03 = (C144416s9) map.get(r1.A0A);
            if (r03 != null) {
                r1.A03 = r03;
            }
        }
        List list = this.A0C;
        if (!(list == null || (r0 = this.A08.A06) == null || (r02 = (C144426sA) r0.first) == null)) {
            A04(r02, this, list);
        }
        this.A08.A03();
        this.A00 = 2;
    }

    public void BZ6(C1261662u r1, int i) {
    }

    public static Integer A01(C95404kp r0) {
        return Integer.valueOf(r0.A05.A02());
    }

    public static final Set A02(C95404kp r6) {
        ArrayList arrayList = r6.A0A;
        if (arrayList.isEmpty()) {
            return C004702c.A00;
        }
        if (arrayList.size() > 1) {
            AnonymousClass03X.A08(arrayList, new C163907qx(10));
        }
        float f = ((C144426sA) C36441kJ.A12(arrayList)).A06;
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            C144426sA r1 = (C144426sA) next;
            if (i >= 30 && r1.A06 != f) {
                break;
            }
            i++;
            A0I2.add(next);
        }
        return C007103b.A0f(A0I2);
    }

    public static final void A03(C144426sA r10, C97674q5 r11, C95404kp r12, Integer num) {
        int i = r11.A00;
        int i2 = 67;
        if (i == 1) {
            i2 = 66;
        }
        C142646pD r6 = r12.A0J;
        C144406s8 r0 = r10.A0B;
        int i3 = r0.A01;
        boolean z = r10.A0A;
        int i4 = r0.A02;
        float A002 = C134996bx.A00(r12.A08.A08);
        boolean z2 = r10.A09;
        Integer A012 = A01(r12);
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put("ranked_position", Integer.valueOf(i3));
        A1G.put("has_title", Boolean.valueOf(z));
        A1G.put("is_selected", Boolean.valueOf(z2));
        A1G.put("segment_index", C90514aH.A0l("zoom_level", Float.valueOf(A002), A1G, i4));
        r6.A08(A012, num, A1G, 11, i2, 1);
    }

    public static final void A06(C95404kp r4) {
        int i = r4.A00;
        if (i == 0 || i == 3) {
            C145896uh r3 = r4.A0Z;
            ArrayList arrayList = r4.A0A;
            ArrayList A0J2 = C36321k7.A0J(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0J2.add(((C144426sA) it.next()).A0B.A0A);
            }
            r3.A06(A0J2, r4.A0d);
            r4.A00 = 1;
        }
    }

    public void A0R() {
        AnonymousClass6DV r1 = this.A06;
        if (r1 != null) {
            r1.A00 = true;
        }
        this.A08.A02();
        this.A0b.A09();
        C145896uh r12 = this.A0Z;
        r12.A07 = null;
        r12.A08 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r10.A02() == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass51N A0S(X.C144426sA r9, X.C144416s9 r10, int r11) {
        /*
            r8 = this;
            X.6qu r3 = new X.6qu
            r3.<init>(r8, r11)
            X.6QG r0 = r8.A05
            int r6 = r0.A02()
            boolean r0 = r0.A06()
            r5 = r10
            if (r0 == 0) goto L_0x0019
            boolean r0 = r10.A02()
            r7 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r7 = 0
        L_0x001a:
            X.6QG r0 = r8.A05
            java.lang.Double r0 = r0.A03
            X.AnonymousClass00C.A0B(r0)
            double r0 = r0.doubleValue()
            X.6QG r2 = r8.A05
            java.lang.Double r2 = r2.A04
            X.AnonymousClass00C.A0B(r2)
            com.google.android.gms.maps.model.LatLng r2 = X.C90484aE.A0S(r2, r0)
            X.6qy r4 = X.C143696qy.A00
            X.51N r1 = new X.51N
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.A00 = r9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95404kp.A0S(X.6sA, X.6s9, int):X.51N");
    }

    public final void A0T(boolean z) {
        C28201Rs r1;
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            C20830yE r12 = this.A0Q;
            if (r12.A05() && r12.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                r1 = this.A0W;
                i = 8;
                C36341k9.A16(r1, i);
            }
        }
        r1 = this.A0W;
        i = 1;
        if (z) {
            i = 3;
        }
        C36341k9.A16(r1, i);
    }

    public void BTD() {
        C119305pb A042 = this.A0N.A04();
        if (A042 != null) {
            this.A0V.A0C(A042);
        }
    }

    public void BTa() {
        this.A0N.A07();
        this.A0J.A03((Boolean) null, this.A0L.A03(), (String) null, 76);
        A05(this);
    }

    public void BVy(boolean z) {
        this.A0N.A02 = z;
        A05(this);
    }

    public void BYq(boolean z) {
        this.A0N.A03 = z;
        this.A0J.A03(Boolean.valueOf(z), this.A0L.A03(), (String) null, 77);
        A05(this);
    }

    public void BZ7(AnonymousClass6QG r1) {
        this.A05 = r1;
        A05(this);
    }

    public void Bbt(boolean z) {
        this.A0N.A04 = z;
        this.A0J.A03(Boolean.valueOf(z), this.A0L.A03(), (String) null, 74);
        A05(this);
    }

    public static final void A04(C144426sA r11, C95404kp r12, List list) {
        Object A0S2;
        Object A0S3;
        ArrayList A0J2 = C36321k7.A0J(list);
        int i = -1;
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw C36351kA.A0v();
            }
            C144426sA r5 = (C144426sA) next;
            C144406s8 r0 = r5.A0B;
            C144416s9 r2 = r0.A03;
            if (r2 == null) {
                A0S3 = new AnonymousClass5E9(r5);
            } else {
                if (AnonymousClass00C.A0J(r0.A0A, r11.A0B.A0A)) {
                    i = i2;
                }
                A0S3 = r12.A0S(r5, r2, i2);
            }
            A0J2.add(A0S3);
            i2 = i3;
        }
        ArrayList A0u = C90504aG.A0u(A0J2);
        if (i == -1 || !C36411kG.A1a(A0u)) {
            C144416s9 r02 = r11.A0B.A03;
            if (r02 != null) {
                A0S2 = r12.A0S(r11, r02, 0);
            }
            r12.A0J.A05(A01(r12), 1, A0u.size(), AnonymousClass000.A1V(r11.A0B.A03));
            r12.A0G.A0C(A0u);
        }
        A0S2 = A0u.remove(i);
        A0u.add(0, A0S2);
        r12.A0J.A05(A01(r12), 1, A0u.size(), AnonymousClass000.A1V(r11.A0B.A03));
        r12.A0G.A0C(A0u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95404kp(android.app.Application r36, android.os.Bundle r37, X.AnonymousClass08M r38, X.AnonymousClass60b r39, X.AnonymousClass17Y r40, X.C142616pA r41, X.C142646pD r42, X.C135016bz r43, X.AnonymousClass6QG r44, X.C145896uh r45, X.C129006Eo r46, X.C130846Mq r47, X.AnonymousClass7g3 r48, X.AnonymousClass7gA r49, X.C132426To r50, X.C134986bw r51, X.C19630wG r52, X.C20830yE r53, X.C18820ts r54, X.AnonymousClass1QW r55, X.C142606p9 r56, X.C19770wU r57, java.lang.String r58, java.util.ArrayList r59) {
        /*
            r35 = this;
            r8 = 1
            r9 = r40
            r0 = r57
            int r16 = X.C36361kB.A04(r9, r0, r8)
            r7 = 3
            r5 = r52
            X.AnonymousClass00C.A0D(r5, r7)
            r6 = 4
            r3 = r54
            r10 = r36
            X.C36421kH.A1J(r10, r6, r3)
            r32 = 11
            r1 = 13
            r15 = r55
            X.AnonymousClass00C.A0D(r15, r1)
            r1 = 14
            r4 = r53
            X.AnonymousClass00C.A0D(r4, r1)
            r1 = 16
            r11 = r49
            X.AnonymousClass00C.A0D(r11, r1)
            r2 = 17
            r33 = r46
            r1 = r33
            X.AnonymousClass00C.A0D(r1, r2)
            r2 = 19
            r34 = r42
            r1 = r34
            X.AnonymousClass00C.A0D(r1, r2)
            r18 = r48
            r12 = r47
            r13 = r41
            r1 = r56
            r2 = r18
            X.C90464aC.A1B(r12, r2, r13, r1)
            r2 = 24
            r14 = r39
            X.AnonymousClass00C.A0D(r14, r2)
            r2 = r35
            r2.<init>(r10)
            r2.A0I = r9
            r2.A0X = r0
            r2.A0P = r5
            r2.A0R = r3
            r0 = r58
            r2.A09 = r0
            r0 = r37
            r2.A01 = r0
            r0 = r43
            r2.A04 = r0
            r0 = r44
            r2.A05 = r0
            r17 = r51
            r0 = r17
            r2.A0O = r0
            r10 = r38
            r2.A0H = r10
            r9 = r45
            r2.A0Z = r9
            r2.A0S = r15
            r2.A0Q = r4
            r0 = r50
            r2.A08 = r0
            r2.A0c = r11
            r0 = r33
            r2.A0L = r0
            r0 = r59
            r2.A0A = r0
            r0 = r34
            r2.A0J = r0
            r2.A0M = r12
            r0 = r18
            r2.A0a = r0
            X.67j r0 = r14.A00(r1, r13)
            r2.A0K = r0
            java.lang.String r0 = "arg_business_marker_data"
            java.util.Map r1 = r10.A03
            java.lang.Object r0 = r1.get(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x00af
            r2.A0A = r0
        L_0x00af:
            java.lang.String r0 = "arg_filter_state"
            java.lang.Object r0 = r1.get(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L_0x00bb
            r2.A01 = r0
        L_0x00bb:
            X.1Rs r0 = X.C36441kJ.A0t()
            r2.A0T = r0
            X.6To r0 = r2.A08
            X.00s r0 = r0.A07
            r2.A02 = r0
            X.00s r0 = X.C36431kI.A0S()
            r2.A0G = r0
            java.util.HashSet r3 = X.C36441kJ.A16()
            java.util.Set r0 = A02(r2)
            r3.addAll(r0)
            r2.A0B = r3
            java.lang.String r0 = "arg_business_info_state"
            java.lang.Number r0 = X.C90524aI.A0b(r0, r1)
            r5 = 0
            int r0 = X.C90484aE.A0B(r0)
            r2.A00 = r0
            X.08S r3 = new X.08S
            r3.<init>()
            java.util.ArrayList r0 = r2.A0A
            r3.A0D(r0)
            r2.A0E = r3
            X.1Rs r0 = X.C36441kJ.A0t()
            r2.A0U = r0
            X.1Rs r0 = X.C36441kJ.A0t()
            r2.A0W = r0
            X.1Rs r0 = X.C36441kJ.A0t()
            r2.A0V = r0
            X.6qr r0 = X.C143626qr.A00
            X.6QK r0 = r11.B3u(r0)
            android.os.Bundle r4 = r2.A01
            r0.A08(r4)
            r2.A0N = r0
            r21 = 0
            X.7sP r11 = new X.7sP
            r11.<init>(r2, r8)
            X.7qb r4 = new X.7qb
            r4.<init>(r2, r5)
            X.6qo r23 = X.C143596qo.A00
            X.6qq r26 = X.C143616qq.A00
            X.6r1 r30 = new X.6r1
            r30.<init>()
            r22 = r18
            r24 = r11
            r25 = r4
            r27 = r0
            r28 = r21
            r29 = r2
            r31 = r16
            X.6qg r12 = r22.B4C(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.A0b = r12
            X.00s r4 = r12.A06
            X.AnonymousClass00C.A08(r4)
            r2.A0Y = r4
            android.app.Application r11 = r2.A00
            android.content.Context r11 = r11.getApplicationContext()
            android.content.res.Resources r13 = r11.getResources()
            r11 = 2131166268(0x7f07043c, float:1.7946777E38)
            int r11 = r13.getDimensionPixelSize(r11)
            X.5zk[] r6 = new X.C125335zk[r6]
            X.50x r13 = new X.50x
            r13.<init>(r11, r11)
            r6[r5] = r13
            java.lang.String r13 = "description"
            X.50z r5 = new X.50z
            r5.<init>(r13)
            r6[r8] = r5
            X.50w r5 = new X.50w
            r5.<init>(r11, r11)
            r6[r16] = r5
            java.lang.String r8 = "full_details"
            X.50y r5 = new X.50y
            r5.<init>(r8)
            r6[r7] = r5
            java.util.ArrayList r5 = X.AnonymousClass03T.A03(r6)
            r2.A0d = r5
            java.lang.String r5 = "saved_selected_multiple_choice_category"
            java.lang.Object r5 = r1.get(r5)
            if (r5 == 0) goto L_0x0186
            r0.A09(r10)
        L_0x0186:
            r9.A07 = r2
            r9.A08 = r12
            java.util.List r7 = X.C36401kF.A0w(r3)
            if (r7 == 0) goto L_0x01e3
            X.6To r6 = r2.A08
            X.6QG r5 = r2.A05
            r6.A04(r5, r7)
            X.6To r5 = r2.A08
            r5.A06(r7)
            X.6To r5 = r2.A08
            X.6jV r5 = r5.A08
            float r27 = X.C134996bx.A00(r5)
            r5 = r17
            java.lang.String r7 = r5.A00
            java.lang.String r24 = r0.A06()
            X.0yC r6 = r15.A03
            r5 = 4461(0x116d, float:6.251E-42)
            java.lang.String r25 = X.C36431kI.A19(r6, r5)
            X.6To r5 = r2.A08
            int r6 = r5.A01
            int r5 = r5.A00
            boolean r8 = r0.A04
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r19 = r0.A05()
            boolean r8 = r0.A03
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r8)
            java.lang.Integer r8 = r33.A03()
            int r30 = r8.intValue()
            r31 = 65
            r26 = r21
            r22 = r21
            r23 = r7
            r28 = r6
            r29 = r5
            r17 = r34
            r17.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x01e3:
            r5 = 15
            X.5X0 r6 = X.AnonymousClass5X0.A02(r2, r5)
            r5 = 46
            X.C165157sy.A01(r4, r3, r6, r5)
            int r4 = r2.A00
            r3 = r16
            if (r4 == r3) goto L_0x01f7
            A06(r2)
        L_0x01f7:
            java.lang.String r3 = "arg_should_animate_on_gps_change"
            java.lang.Object r1 = r1.get(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0207
            boolean r1 = r1.booleanValue()
            r2.A0D = r1
        L_0x0207:
            X.08S r3 = new X.08S
            r3.<init>()
            r1 = 77
            X.5Dw r0 = X.AnonymousClass6QK.A00(r0, r2, r1)
            r3.A0D(r0)
            r2.A0F = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95404kp.<init>(android.app.Application, android.os.Bundle, X.08M, X.60b, X.17Y, X.6pA, X.6pD, X.6bz, X.6QG, X.6uh, X.6Eo, X.6Mq, X.7g3, X.7gA, X.6To, X.6bw, X.0wG, X.0yE, X.0ts, X.1QW, X.6p9, X.0wU, java.lang.String, java.util.ArrayList):void");
    }
}
