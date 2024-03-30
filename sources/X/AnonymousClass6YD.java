package X;

import android.location.LocationManager;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6YD  reason: invalid class name */
public final class AnonymousClass6YD {
    public static final AnonymousClass6TR A0P = new AnonymousClass6TR();
    public int A00 = Integer.MAX_VALUE;
    public int A01 = -1;
    public final C001600r A02;
    public final C001600r A03;
    public final C001600r A04;
    public final C001600r A05;
    public final AnonymousClass08S A06;
    public final AnonymousClass08S A07;
    public final C001700s A08 = C36431kI.A0S();
    public final AnonymousClass04S A09;
    public final AnonymousClass17Y A0A;
    public final AnonymousClass67J A0B;
    public final C20810yC A0C;
    public final AnonymousClass1S3 A0D;
    public final C19930wk A0E;
    public final AnonymousClass005 A0F;
    public final AnonymousClass005 A0G;
    public final AnonymousClass004 A0H;
    public final AnonymousClass00S A0I;
    public final C006302t A0J;
    public final C006302t A0K;
    public final boolean A0L;
    public final C001600r A0M;
    public final C001600r A0N;
    public final C19970wo A0O;

    public static C131436Pa A00(AnonymousClass6YD r0) {
        return (C131436Pa) r0.A0G.get();
    }

    public static C142626pB A01(AnonymousClass6YD r0) {
        return (C142626pB) r0.A0F.get();
    }

    public static final void A06(AnonymousClass6YD r2, AnonymousClass11F r3, String str) {
        if (r2.A0C.A0E(7212)) {
            C131436Pa A002 = A00(r2);
            AnonymousClass51l r22 = new AnonymousClass51l(str, r3.getRawString());
            AnonymousClass6SP r4 = A002.A06;
            List list = r4.A00;
            AnonymousClass00C.A07(list);
            synchronized (list) {
                if (list.isEmpty()) {
                    AnonymousClass6SP.A01(r4);
                }
                list.remove(r22);
                r22.A00 = C90484aE.A0g();
                list.add(0, r22);
                if (list.size() > r4.A03.A07(7262)) {
                    AnonymousClass03Y.A0A(list);
                }
                C1497172m.A00(r4.A04, r4, 35);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.AnonymousClass6YD r25, java.util.List r26) {
        /*
            r5 = r25
            X.0yC r6 = r5.A0C
            r0 = 7533(0x1d6d, float:1.0556E-41)
            boolean r0 = r6.A0E(r0)
            r4 = r26
            if (r0 == 0) goto L_0x0073
            X.6Pa r0 = A00(r5)
            X.69q r0 = r0.A02()
            if (r0 == 0) goto L_0x0073
            java.util.List r1 = r0.A01
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x0073
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r1.iterator()
        L_0x0028:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r2.next()
            X.69p r0 = (X.C1277769p) r0
            X.13q r1 = X.AnonymousClass11F.A00
            java.lang.String r0 = r0.A00
            X.11F r1 = r1.A02(r0)
            X.141 r0 = new X.141
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0028
        L_0x0045:
            X.5Jm r0 = new X.5Jm
            r0.<init>(r3)
            r4.add(r0)
            X.6pB r2 = A01(r5)
            X.0yC r0 = r2.A01
            boolean r0 = X.AnonymousClass6TR.A01(r0)
            if (r0 == 0) goto L_0x0083
            X.2RY r1 = new X.2RY
            r1.<init>()
            java.lang.Integer r0 = X.C36421kH.A0U()
            r1.A00 = r0
            java.lang.Integer r0 = X.C36361kB.A0i()
            r1.A01 = r0
            X.C142626pB.A01(r2, r1)
            X.0yW r0 = r2.A02
            r0.Bly(r1)
            goto L_0x0083
        L_0x0073:
            boolean r0 = r5.A0L
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 30
            X.5Jo r0 = new X.5Jo
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x0083:
            X.005 r2 = r5.A0G
            java.lang.Object r0 = r2.get()
            X.6Pa r0 = (X.C131436Pa) r0
            X.6SP r1 = r0.A06
            java.util.List r3 = r1.A00
            X.AnonymousClass00C.A07(r3)
            boolean r0 = X.C36401kF.A1a(r3)
            if (r0 != 0) goto L_0x009b
            X.AnonymousClass6SP.A01(r1)
        L_0x009b:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x017f
            r0 = 7212(0x1c2c, float:1.0106E-41)
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x017f
            X.7Jt r1 = new X.7Jt
            r1.<init>(r5)
            X.5Jn r0 = new X.5Jn
            r0.<init>(r1)
            r4.add(r0)
            monitor-enter(r3)
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x017c }
        L_0x00bb:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x0141
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x017c }
            X.60m r11 = (X.C1255960m) r11     // Catch:{ all -> 0x017c }
            boolean r0 = r11 instanceof X.AnonymousClass51l     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r8 = r2.get()     // Catch:{ all -> 0x017c }
            X.6Pa r8 = (X.C131436Pa) r8     // Catch:{ all -> 0x017c }
            X.51l r11 = (X.AnonymousClass51l) r11     // Catch:{ all -> 0x017c }
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)     // Catch:{ all -> 0x017c }
            X.1KK r1 = r8.A02     // Catch:{ all -> 0x017c }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x017c }
            java.lang.String r7 = r11.A01     // Catch:{ all -> 0x017c }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A01(r7)     // Catch:{ all -> 0x017c }
            X.9uZ r6 = r1.A07(r0)     // Catch:{ all -> 0x017c }
            X.185 r1 = r8.A08     // Catch:{ all -> 0x017c }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A01(r7)     // Catch:{ all -> 0x017c }
            X.3L0 r10 = r1.A01(r0)     // Catch:{ all -> 0x017c }
            if (r6 == 0) goto L_0x00bb
            if (r10 == 0) goto L_0x00bb
            int r1 = r10.A03     // Catch:{ all -> 0x017c }
            r0 = 3
            if (r1 != r0) goto L_0x013b
            r9 = 2
            java.util.List r8 = r6.A0O     // Catch:{ all -> 0x017c }
            java.lang.String r6 = ", "
            X.7Xa r1 = X.C155687Xa.A00     // Catch:{ all -> 0x017c }
            java.lang.String r0 = ""
            java.lang.String r6 = X.C007103b.A0Q(r6, r0, r0, r8, r1)     // Catch:{ all -> 0x017c }
        L_0x0105:
            java.lang.String r1 = r11.A00     // Catch:{ all -> 0x017c }
            java.lang.String r0 = r10.A08     // Catch:{ all -> 0x017c }
            X.AnonymousClass00C.A07(r0)     // Catch:{ all -> 0x017c }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x017c }
            r14 = 0
            X.09w r25 = X.C023409w.A00     // Catch:{ all -> 0x017c }
            X.6E6 r13 = new X.6E6     // Catch:{ all -> 0x017c }
            r17 = r14
            r18 = r14
            r22 = r14
            r24 = r14
            r26 = 0
            r15 = r14
            r19 = r1
            r20 = r7
            r21 = r0
            r23 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x017c }
            java.lang.String r1 = "business_search"
            r0 = 41
            X.5Jr r1 = A02(r5, r13, r1, r4, r0)     // Catch:{ all -> 0x017c }
            X.7SO r0 = new X.7SO     // Catch:{ all -> 0x017c }
            r0.<init>(r5)     // Catch:{ all -> 0x017c }
            r1.A00 = r0     // Catch:{ all -> 0x017c }
            goto L_0x00bb
        L_0x013b:
            r9 = 1
            X.3XS r0 = r6.A07     // Catch:{ all -> 0x017c }
            java.lang.String r6 = r0.A03     // Catch:{ all -> 0x017c }
            goto L_0x0105
        L_0x0141:
            X.6pB r4 = A01(r5)     // Catch:{ all -> 0x017c }
            int r1 = r3.size()     // Catch:{ all -> 0x017c }
            X.0yC r0 = r4.A01     // Catch:{ all -> 0x017c }
            boolean r0 = X.AnonymousClass6TR.A01(r0)     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x017a
            X.2RY r2 = new X.2RY     // Catch:{ all -> 0x017c }
            r2.<init>()     // Catch:{ all -> 0x017c }
            java.lang.Integer r0 = X.C36401kF.A0i()     // Catch:{ all -> 0x017c }
            r2.A00 = r0     // Catch:{ all -> 0x017c }
            java.lang.Integer r0 = X.C36361kB.A0i()     // Catch:{ all -> 0x017c }
            r2.A01 = r0     // Catch:{ all -> 0x017c }
            X.C142626pB.A01(r4, r2)     // Catch:{ all -> 0x017c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "recent_search_size"
            java.util.Map r0 = X.C36391kE.A11(r0, r1)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = X.C90474aD.A0k(r0)     // Catch:{ all -> 0x017c }
            r2.A04 = r0     // Catch:{ all -> 0x017c }
            X.0yW r0 = r4.A02     // Catch:{ all -> 0x017c }
            r0.Bly(r2)     // Catch:{ all -> 0x017c }
        L_0x017a:
            monitor-exit(r3)
            return
        L_0x017c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YD.A07(X.6YD, java.util.List):void");
    }

    public static final boolean A08(AnonymousClass6YD r1) {
        C001600r r12 = r1.A05;
        if (r12.A04() == null) {
            return true;
        }
        Number A0z = C36441kJ.A0z(r12);
        if (A0z == null || A0z.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(C132056Ry r2, String str) {
        if ((r2 instanceof C106475Jv) && AnonymousClass00C.A0J(((C106475Jv) r2).A00, C36421kH.A0N(str))) {
            return true;
        }
        if ((r2 instanceof C106455Jt) && AnonymousClass00C.A0J(((C106455Jt) r2).A00.A0H, C36421kH.A0N(str))) {
            return true;
        }
        if (!(r2 instanceof C106435Jr) || !AnonymousClass00C.A0J(((C106435Jr) r2).A02.A07, str)) {
            return false;
        }
        return true;
    }

    public final void A0C(AnonymousClass11F r26, String str, int i, boolean z) {
        List<C132056Ry> A0w = C36401kF.A0w(this.A06);
        if (A0w != null) {
            int i2 = 3;
            if (i == 28) {
                i2 = 2;
            }
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (C132056Ry r1 : A0w) {
                if (A0A(r1, r26.getRawString())) {
                    if (r1 instanceof C106455Jt) {
                        i2 = 0;
                    } else if (r1 instanceof C106475Jv) {
                        i2 = 1;
                    }
                    i3 = i5 + 1;
                }
                if ((r1 instanceof C106455Jt) || (r1 instanceof C106475Jv)) {
                    i4++;
                } else if (!(r1 instanceof C106435Jr)) {
                }
                i5++;
            }
            C142626pB A012 = A01(this);
            AnonymousClass1S3 r3 = this.A0D;
            boolean A1S = AnonymousClass000.A1S(r3.A02, 98);
            String A022 = r3.A02();
            int length = r3.A02().length();
            String A0B2 = A0B();
            if (AnonymousClass6TR.A01(A012.A01)) {
                AnonymousClass2RY r9 = new AnonymousClass2RY();
                C90514aH.A1L(r9, C36361kB.A0j(), A1S ? 1 : 0);
                r9.A02 = Integer.valueOf(i2);
                C142626pB.A01(A012, r9);
                C142626pB.A02(r9, (Boolean) null, Integer.valueOf(length), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), (Integer) null, (Long) null, A0B2, (List) null);
                A012.A02.Bly(r9);
            }
            C142626pB r16 = A012;
            r16.A03(Boolean.valueOf(z), Integer.valueOf(i2), A022, str, (String) null, (String) null, 1, A1S ? 1 : 0);
        }
    }

    public final boolean A0D(AnonymousClass11F r5) {
        List<C132056Ry> A0w = C36401kF.A0w(this.A06);
        if (A0w != null && (!(A0w instanceof Collection) || !A0w.isEmpty())) {
            for (C132056Ry r1 : A0w) {
                if ((r1 instanceof C106435Jr) && AnonymousClass00C.A0J(((C106435Jr) r1).A02.A07, C36381kD.A0w(r5))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final C106435Jr A02(AnonymousClass6YD r7, AnonymousClass6E6 r8, String str, List list, int i) {
        AnonymousClass6Th r1 = A00(r7).A05.A02;
        if (r1.A00 == null) {
            r1.A00();
        }
        AnonymousClass6QG r12 = r1.A00;
        AnonymousClass00C.A08(r12);
        boolean A1S = AnonymousClass000.A1S(i, 41);
        C106435Jr r0 = new C106435Jr(r12, r8, new C153197Nk(r7, r8), new AnonymousClass7V9(r7, r8, str, i), i, A1S);
        list.add(r0);
        return r0;
    }

    public static final C106425Jq A03(AnonymousClass6YD r5) {
        boolean z;
        C143636qs r3 = A00(r5).A05;
        AnonymousClass6Th r2 = r3.A02;
        if (r2.A00 == null) {
            r2.A00();
        }
        AnonymousClass6QG r4 = r2.A00;
        AnonymousClass00C.A08(r4);
        AnonymousClass6QG r1 = r2.A00;
        if (!r2.A03() || r1 == null || r1.A04()) {
            z = true;
        } else {
            z = r3.A00;
        }
        return new C106425Jq(r4, new C152267Jv(r5), r5.A0L, z);
    }

    public static final ArrayList A04(AnonymousClass6YD r10, C598735p r11) {
        AnonymousClass11F A0j;
        ArrayList A0I2 = AnonymousClass001.A0I();
        C02680Bk r6 = r11.A00;
        r6.A04();
        AnonymousClass005 r8 = r10.A0G;
        C131436Pa r5 = (C131436Pa) r8.get();
        AnonymousClass1S3 r112 = (AnonymousClass1S3) r11.A01;
        ArrayList A0I3 = AnonymousClass001.A0I();
        ArrayList A032 = AnonymousClass03T.A03(r5.A03);
        if (C36401kF.A1a(r112.A03())) {
            AnonymousClass1S0 r1 = r5.A0C;
            List A033 = r112.A03();
            AnonymousClass00C.A08(A033);
            A032.add(r1.B42(A033));
        }
        Iterator it = r5.A0A.A04().iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            r6.A04();
            AnonymousClass00C.A0B(A0a);
            if ((!r5.A07.A0P(A0a)) && AnonymousClass1A5.A00(A0a, A032)) {
                r6.A04();
                A0I3.add(A0a);
            }
        }
        if (C36411kG.A1a(A0I3)) {
            A0I2.add(new C106405Jo(Integer.valueOf(R.string.f12nameremoved), 37));
            ArrayList A0z = C36351kA.A0z(A0I3);
            Iterator it2 = A0I3.iterator();
            while (it2.hasNext()) {
                A0z.add(new C106475Jv(C36401kF.A0a(it2), 2));
            }
            A0I2.addAll(A0z);
        }
        r6.A04();
        C131436Pa r82 = (C131436Pa) r8.get();
        ArrayList A0I4 = AnonymousClass001.A0I();
        ArrayList A034 = AnonymousClass03T.A03(r82.A03);
        if (C36401kF.A1a(r112.A03())) {
            C230116v r102 = r82.A0D;
            A034.add(new C70983g2(r82.A09, r82.A0B, r102, r112.A03()));
        }
        Iterator it3 = r82.A0B.A03().iterator();
        while (it3.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it3);
            r6.A04();
            if (A0f.A0F != null && (A0j = C36351kA.A0j(A0f)) != null && (!r82.A07.A0P(A0j)) && !r82.A0A.A04().contains(A0j) && AnonymousClass1A5.A00(A0j, A034)) {
                r6.A04();
                A0I4.add(A0f);
            }
        }
        if (C36411kG.A1a(A0I4)) {
            A0I2.add(new C106405Jo(Integer.valueOf(R.string.f12nameremoved), 37));
            ArrayList A0z2 = C36351kA.A0z(A0I4);
            Iterator it4 = A0I4.iterator();
            while (it4.hasNext()) {
                A0z2.add(new C106455Jt(C36391kE.A0f(it4)));
            }
            A0I2.addAll(A0z2);
        }
        return A0I2;
    }

    public static final void A05(AnonymousClass6YD r4) {
        String str;
        A01(r4).A04(r4.A0B());
        C143636qs r1 = A00(r4).A05;
        C21430zE r3 = r1.A05;
        r3.markerStart(207368785);
        AnonymousClass6Th r42 = r1.A02;
        if (!r42.A03()) {
            if (!r42.A03()) {
                C36341k9.A17(r42.A04, 3);
            }
            str = "location_permission_request_start";
        } else if (!((LocationManager) r1.A04.A00.getSystemService("location")).isProviderEnabled("gps")) {
            if (r42.A03()) {
                C36341k9.A17(r42.A04, 4);
            }
            str = "turn_on_gps_setting_request_start";
        } else {
            r42.A02();
            str = "fetch_user_location_request_start";
        }
        r3.markerPoint(207368785, str);
    }

    public static final boolean A09(AnonymousClass6YD r2) {
        if (A08(r2)) {
            Object A042 = r2.A02.A04();
            Boolean A0j = C36381kD.A0j();
            if (!AnonymousClass00C.A0J(A042, A0j) || !AnonymousClass00C.A0J(r2.A03.A04(), A0j)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String A0B() {
        AnonymousClass6Th r1 = A00(this).A05.A02;
        if (r1.A00 == null) {
            r1.A00();
        }
        String str = r1.A00.A08;
        AnonymousClass00C.A08(str);
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00b9, code lost:
        if ((!X.AnonymousClass6TR.A00(r7).contains(((X.C131436Pa) r5.get()).A00)) == false) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6YD(X.C001600r r21, X.C001600r r22, X.C001600r r23, X.C001600r r24, X.C001600r r25, X.C001600r r26, X.C001600r r27, X.C001600r r28, X.AnonymousClass17Y r29, X.AnonymousClass67J r30, X.C19970wo r31, X.C18820ts r32, X.C20810yC r33, X.C28271Rz r34, X.C19770wU r35, X.AnonymousClass005 r36, X.AnonymousClass005 r37, X.AnonymousClass004 r38, X.AnonymousClass00S r39, X.C006302t r40, X.C006302t r41) {
        /*
            r20 = this;
            r2 = 1
            r0 = r31
            X.AnonymousClass00C.A0D(r0, r2)
            r8 = r32
            r7 = r33
            r16 = r35
            r17 = r29
            r3 = r16
            r1 = r17
            X.C36321k7.A19(r7, r3, r8, r1)
            r15 = r30
            r6 = r34
            r5 = r36
            r4 = r37
            r3 = r38
            X.C36321k7.A1C(r6, r15, r5, r4, r3)
            r19 = r21
            r14 = r22
            r13 = r23
            r1 = r19
            X.C36321k7.A15(r1, r14, r13)
            r9 = 14
            r18 = r25
            r11 = r26
            r12 = r24
            r1 = r18
            X.C90494aF.A12(r12, r1, r11, r9)
            r1 = 20
            r10 = r27
            X.AnonymousClass00C.A0D(r10, r1)
            r1 = 21
            r9 = r28
            X.AnonymousClass00C.A0D(r9, r1)
            r1 = r20
            r1.<init>()
            r1.A0O = r0
            r1.A0C = r7
            r0 = r17
            r1.A0A = r0
            r1.A0B = r15
            r1.A0G = r5
            r1.A0F = r4
            r1.A0H = r3
            r1.A05 = r14
            r1.A0M = r13
            r1.A0N = r12
            r0 = r40
            r1.A0K = r0
            r0 = r41
            r1.A0J = r0
            r0 = r39
            r1.A0I = r0
            r1.A02 = r11
            r1.A04 = r10
            r1.A03 = r9
            X.00s r0 = X.C36431kI.A0S()
            r1.A08 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.A00 = r0
            r0 = -1
            r1.A01 = r0
            X.08S r3 = new X.08S
            r3.<init>()
            r1.A07 = r3
            X.08S r4 = new X.08S
            r4.<init>()
            r1.A06 = r4
            X.1S3 r0 = new X.1S3
            r0.<init>(r8)
            r1.A0D = r0
            X.0wk r0 = X.C36411kG.A0r(r16)
            r1.A0E = r0
            r0 = 6743(0x1a57, float:9.449E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r5.get()
            X.6Pa r0 = (X.C131436Pa) r0
            java.lang.String r5 = r0.A00
            java.util.HashSet r0 = X.AnonymousClass6TR.A00(r7)
            boolean r0 = r0.contains(r5)
            r5 = r0 ^ 1
            r0 = 1
            if (r5 != 0) goto L_0x00bc
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            r1.A0L = r0
            X.7ru r0 = new X.7ru
            r0.<init>(r1, r2)
            r6.A00(r0, r3, r4)
            X.7SG r4 = new X.7SG
            r4.<init>(r1)
            r2 = 8
            r0 = r19
            X.C165167sz.A01(r0, r3, r4, r2)
            X.7SH r2 = new X.7SH
            r2.<init>(r1)
            r0 = 5
            X.C165167sz.A01(r14, r3, r2, r0)
            X.7SI r2 = new X.7SI
            r2.<init>(r1)
            r0 = 4
            X.C165167sz.A01(r13, r3, r2, r0)
            X.7SJ r2 = new X.7SJ
            r2.<init>(r1)
            r0 = 10
            X.C165167sz.A01(r10, r3, r2, r0)
            X.7SK r2 = new X.7SK
            r2.<init>(r1)
            r0 = 7
            X.C165167sz.A01(r12, r3, r2, r0)
            X.7SL r2 = new X.7SL
            r2.<init>(r1)
            r0 = 11
            X.C165167sz.A01(r11, r3, r2, r0)
            X.7SM r2 = new X.7SM
            r2.<init>(r1)
            r0 = 9
            X.C165167sz.A01(r9, r3, r2, r0)
            X.7SN r4 = new X.7SN
            r4.<init>(r1)
            r2 = 6
            r0 = r18
            X.C165167sz.A01(r0, r3, r4, r2)
            r2 = 3
            X.7sz r0 = new X.7sz
            r0.<init>(r1, r2)
            r1.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YD.<init>(X.00r, X.00r, X.00r, X.00r, X.00r, X.00r, X.00r, X.00r, X.17Y, X.67J, X.0wo, X.0ts, X.0yC, X.1Rz, X.0wU, X.005, X.005, X.004, X.00S, X.02t, X.02t):void");
    }
}
