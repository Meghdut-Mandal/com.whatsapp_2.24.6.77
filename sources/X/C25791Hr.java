package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.1Hr  reason: invalid class name and case insensitive filesystem */
public final class C25791Hr {
    public final AnonymousClass30W A00;
    public final C25801Hs A01;
    public final AnonymousClass1IQ A02;
    public final AnonymousClass1IP A03;
    public final AnonymousClass16D A04;
    public final C25271Fq A05;
    public final C19420v0 A06;
    public final C25851Hx A07;
    public final C231417i A08;
    public final C20810yC A09;
    public final C25811Ht A0A;
    public final AnonymousClass1C5 A0B;
    public final AnonymousClass1CR A0C;
    public final AnonymousClass1A1 A0D;
    public final C19970wo A0E;
    public final C24541Cv A0F;
    public final C21010yW A0G;

    public C25791Hr(AnonymousClass30W r14, C25801Hs r15, AnonymousClass1IQ r16, AnonymousClass1IP r17, AnonymousClass16D r18, C19970wo r19, C25271Fq r20, C19420v0 r21, C25851Hx r22, C24541Cv r23, C231417i r24, C20810yC r25, C25811Ht r26, C21010yW r27, AnonymousClass1C5 r28, AnonymousClass1CR r29, AnonymousClass1A1 r30) {
        C19970wo r11 = r19;
        AnonymousClass00C.A0D(r11, 1);
        C21010yW r4 = r27;
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass16D r12 = r18;
        AnonymousClass00C.A0D(r12, 3);
        C24541Cv r7 = r23;
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass1C5 r3 = r28;
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass1A1 r1 = r30;
        AnonymousClass00C.A0D(r1, 6);
        AnonymousClass1CR r2 = r29;
        AnonymousClass00C.A0D(r2, 7);
        C231417i r6 = r24;
        AnonymousClass00C.A0D(r6, 8);
        C19420v0 r9 = r21;
        AnonymousClass00C.A0D(r9, 9);
        C25271Fq r10 = r20;
        AnonymousClass00C.A0D(r10, 11);
        C25851Hx r8 = r22;
        AnonymousClass00C.A0D(r8, 12);
        C20810yC r5 = r25;
        AnonymousClass00C.A0D(r5, 15);
        AnonymousClass00C.A0D(r14, 17);
        this.A0E = r11;
        this.A0G = r4;
        this.A04 = r12;
        this.A0F = r7;
        this.A0B = r3;
        this.A0D = r1;
        this.A0C = r2;
        this.A08 = r6;
        this.A06 = r9;
        this.A01 = r15;
        this.A05 = r10;
        this.A07 = r8;
        this.A03 = r17;
        this.A02 = r16;
        this.A09 = r5;
        this.A0A = r26;
        this.A00 = r14;
    }

    public final void A02(AnonymousClass11F r24, Integer num, String str, String str2, int i, int i2, boolean z) {
        AnonymousClass3T1 r10;
        Integer num2;
        String str3;
        Long l;
        String str4;
        Boolean bool;
        Boolean bool2;
        Integer num3;
        Long l2;
        Long l3;
        C62673Hb A0Q;
        AnonymousClass11F r13 = r24;
        AnonymousClass00C.A0D(r13, 0);
        AnonymousClass141 A082 = this.A04.A08(r13);
        if (A082 != null) {
            C25801Hs r11 = this.A01;
            if (!r11.A00.A0L()) {
                int A002 = C25801Hs.A00(A082);
                C24541Cv r0 = r11.A02;
                C24541Cv r21 = r0;
                ArrayList A012 = C24541Cv.A01(r0, r13, 1, false, z);
                if (!A012.isEmpty()) {
                    r10 = (AnonymousClass3T1) A012.get(0);
                } else {
                    r10 = null;
                }
                String str5 = null;
                if (r10 != null) {
                    num2 = r11.A05(r10);
                    str3 = C25801Hs.A02(r10);
                } else {
                    num2 = null;
                    str3 = null;
                }
                Long A062 = r11.A06(r10);
                if (r10 != null) {
                    l = Long.valueOf(r11.A03(r10));
                    str4 = C25801Hs.A01(r10.A1I);
                } else {
                    l = null;
                    str4 = null;
                }
                if (A002 != 1) {
                    if (r10 == null || (A0Q = r10.A0Q()) == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(A0Q.A00);
                    }
                    AnonymousClass3L0 r02 = A082.A0E;
                    boolean z2 = true;
                    if (r02 == null || r02.A01 != 2) {
                        z2 = false;
                    }
                    AnonymousClass1IP r17 = this.A03;
                    String A072 = r11.A07(A082);
                    C45612Sa r2 = new C45612Sa();
                    Integer valueOf = Integer.valueOf(i);
                    r2.A04 = valueOf;
                    int i3 = i2;
                    Integer valueOf2 = Integer.valueOf(i3);
                    r2.A05 = valueOf2;
                    r2.A03 = num2;
                    r2.A0A = str4;
                    Integer valueOf3 = Integer.valueOf(A002);
                    r2.A02 = valueOf3;
                    r2.A0B = A072;
                    r2.A06 = A062;
                    r2.A07 = l;
                    String str6 = str;
                    r2.A08 = str6;
                    r2.A09 = str3;
                    Boolean valueOf4 = Boolean.valueOf(z2);
                    r2.A01 = valueOf4;
                    r2.A00 = bool;
                    r17.A00.A04.Bly(r2);
                    AnonymousClass1IQ r22 = this.A02;
                    if (r10 != null) {
                        bool2 = Boolean.valueOf(this.A0F.A08(r13, r10.A0I));
                    } else {
                        bool2 = null;
                    }
                    ArrayList A013 = C24541Cv.A01(r21, r13, 5, false, false);
                    if (!(!A013.isEmpty())) {
                        A013 = null;
                    }
                    if (str != null) {
                        num3 = Integer.valueOf(C65143Qx.A00(str6));
                    } else {
                        num3 = null;
                    }
                    if (r10 != null) {
                        str5 = r11.A08(r10);
                    }
                    AnonymousClass3T1 A042 = r11.A04(r13);
                    if (A042 != null) {
                        l2 = Long.valueOf(A042.A0I);
                    } else {
                        l2 = null;
                    }
                    AnonymousClass2T3 r1 = new AnonymousClass2T3();
                    r1.A08 = valueOf;
                    r1.A09 = valueOf2;
                    r1.A0E = l2;
                    r1.A0C = A062;
                    r1.A0D = l;
                    r1.A0B = C65143Qx.A02(A082);
                    r1.A01 = bool;
                    r1.A0K = str5;
                    r1.A07 = num2;
                    r1.A0J = str3;
                    r1.A06 = valueOf3;
                    r1.A02 = valueOf4;
                    Long l4 = null;
                    if (r10 != null) {
                        l3 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(r10.A0I));
                    } else {
                        l3 = null;
                    }
                    r1.A0A = l3;
                    if (r10 != null) {
                        l4 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(r10.A0G));
                    }
                    r1.A0F = l4;
                    r1.A00 = bool2;
                    r1.A03 = Boolean.valueOf(!A082.A0B());
                    if (A013 != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = A013.iterator();
                        while (it.hasNext()) {
                            AnonymousClass3T1 r9 = (AnonymousClass3T1) it.next();
                            arrayList.add(r22.A00.A08(r9));
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            arrayList2.add(Long.valueOf(timeUnit.toSeconds(r9.A0G)));
                            arrayList3.add(Long.valueOf(timeUnit.toSeconds(r9.A0I)));
                        }
                        r1.A0L = new JSONArray(arrayList).toString();
                        r1.A0G = new JSONArray(arrayList2).toString();
                        r1.A0H = new JSONArray(arrayList3).toString();
                    }
                    if (i3 == 6) {
                        r1.A05 = num3;
                        r1.A0I = str2;
                        r1.A04 = num;
                    }
                    if (r10 != null) {
                        r22.A00.A09(r1, r10);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0117, code lost:
        if (r4.A0A(r12) != false) goto L_0x0119;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass11F r30, java.util.Collection r31, int r32) {
        /*
            r29 = this;
            r0 = 0
            r6 = r30
            X.AnonymousClass00C.A0D(r6, r0)
            if (r31 == 0) goto L_0x01b1
            r5 = r29
            X.1Hs r4 = r5.A01
            X.0wQ r0 = r4.A00
            boolean r0 = r0.A0L()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01b1
            X.1C5 r0 = r4.A05
            boolean r0 = r0.A04(r6)
            if (r0 == 0) goto L_0x01b1
            X.16D r0 = r5.A04
            X.141 r3 = r0.A08(r6)
            if (r3 == 0) goto L_0x01b1
            int r25 = X.C25801Hs.A00(r3)
            r1 = 1
            r0 = r25
            if (r0 == r1) goto L_0x01b1
            X.12q r0 = r4.A01
            boolean r0 = r0.A0N(r6)
            r24 = 1
            if (r0 == 0) goto L_0x003b
            r24 = 2
        L_0x003b:
            java.lang.String r23 = r4.A07(r3)
            X.1C5 r0 = r5.A0B
            boolean r22 = r0.A04(r6)
            java.util.Iterator r21 = r31.iterator()
            r20 = 0
        L_0x004b:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r12 = r21.next()
            X.3T1 r12 = (X.AnonymousClass3T1) r12
            int r0 = r12.A1I
            java.lang.String r0 = X.C25801Hs.A01(r0)
            X.3Qa r9 = r12.A1J
            boolean r1 = r9.A02
            if (r1 != 0) goto L_0x004b
            r7 = 0
            X.AnonymousClass00C.A0D(r0, r7)
            X.0yC r2 = r4.A03
            r1 = 7224(0x1c38, float:1.0123E-41)
            java.lang.String r2 = r2.A09(r1)
            X.AnonymousClass00C.A08(r2)
            boolean r1 = X.AnonymousClass14B.A0F(r2)
            if (r1 != 0) goto L_0x007e
            boolean r1 = X.AnonymousClass099.A0O(r2, r0, r7)
            if (r1 != 0) goto L_0x004b
        L_0x007e:
            java.lang.Integer r19 = r4.A05(r12)
            java.lang.String r18 = X.C25801Hs.A02(r12)
            X.3L0 r1 = r3.A0E
            r16 = 1
            if (r1 == 0) goto L_0x01a5
            int r2 = r1.A01
            r1 = 2
            if (r2 != r1) goto L_0x01a5
        L_0x0091:
            X.3Hb r1 = r12.A0Q()
            r2 = 0
            if (r1 == 0) goto L_0x01a2
            boolean r1 = r1.A00
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
        L_0x009e:
            java.lang.Long r15 = r4.A06(r12)
            long r10 = r4.A03(r12)
            X.0yC r8 = r5.A09
            r7 = 6735(0x1a4f, float:9.438E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r1, r8, r7)
            if (r1 == 0) goto L_0x00c3
            X.1Ht r7 = r5.A0A
            java.lang.String r2 = r9.A01
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            byte[] r1 = r7.A05(r1)
            java.lang.String r2 = X.AnonymousClass17V.A00(r1, r2)
        L_0x00c3:
            X.1IP r1 = r5.A03
            r17 = r1
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.lang.String r7 = X.C25801Hs.A02(r12)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r22)
            X.2Sf r1 = new X.2Sf
            r1.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r25)
            r1.A04 = r10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r24)
            r1.A03 = r9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r32)
            r1.A06 = r8
            r1.A07 = r15
            r1.A08 = r13
            r1.A0B = r0
            r0 = r23
            r1.A0C = r0
            r0 = r19
            r1.A05 = r0
            r1.A02 = r11
            r1.A09 = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r16)
            r1.A01 = r7
            r1.A00 = r14
            r1.A0A = r2
            r0 = r17
            X.1Hs r0 = r0.A00
            X.0yW r0 = r0.A04
            r0.Bly(r1)
            if (r20 != 0) goto L_0x0119
            boolean r0 = r4.A0A(r12)
            r20 = 0
            if (r0 == 0) goto L_0x011b
        L_0x0119:
            r20 = 1
        L_0x011b:
            X.1IQ r0 = r5.A02
            r28 = r0
            java.lang.Long r17 = X.C65143Qx.A02(r3)
            java.lang.String r16 = r4.A08(r12)
            X.3T1 r0 = r4.A04(r6)
            if (r0 == 0) goto L_0x01a0
            long r0 = r0.A0I
            r26 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r26)
        L_0x0135:
            r0 = r28
            X.1Hs r0 = r0.A00
            r26 = r0
            r2 = r0
            r0 = r25
            boolean r0 = r2.A0B(r12, r0)
            if (r0 == 0) goto L_0x004b
            X.2Su r2 = new X.2Su
            r2.<init>()
            r2.A03 = r9
            r2.A0B = r1
            r2.A06 = r8
            r2.A09 = r15
            r2.A0A = r13
            r0 = r17
            r2.A08 = r0
            r0 = r16
            r2.A0F = r0
            r0 = r19
            r2.A05 = r0
            r0 = r18
            r2.A0E = r0
            r2.A02 = r11
            r2.A04 = r10
            r2.A01 = r7
            r2.A00 = r14
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r12.A0I
            long r0 = r7.toSeconds(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
            long r0 = r12.A0G
            long r0 = r7.toSeconds(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
            r0 = r28
            X.0wo r0 = r0.A02
            long r0 = X.C19970wo.A00(r0)
            long r0 = r7.toSeconds(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0D = r0
            r0 = r26
            X.0yW r0 = r0.A04
            r0.Bly(r2)
            goto L_0x004b
        L_0x01a0:
            r1 = 0
            goto L_0x0135
        L_0x01a2:
            r14 = r2
            goto L_0x009e
        L_0x01a5:
            r16 = 0
            goto L_0x0091
        L_0x01a9:
            if (r20 == 0) goto L_0x01b1
            X.0yW r1 = r5.A0G
            r0 = 1
            r1.Bph(r0)
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25791Hr.A03(X.11F, java.util.Collection, int):void");
    }

    public static final void A00(C25791Hr r12, AnonymousClass11F r13, AnonymousClass3T1 r14, AnonymousClass3T1 r15, int i, boolean z) {
        int A002;
        String A012;
        Boolean bool;
        Long l;
        Boolean bool2;
        C62673Hb A0Q;
        AnonymousClass141 A082 = r12.A04.A08(r13);
        if (A082 != null) {
            C25801Hs r3 = r12.A01;
            if ((!r3.A00.A0L()) && (A002 = C25801Hs.A00(A082)) != 1) {
                AnonymousClass3L0 r0 = A082.A0E;
                boolean z2 = true;
                if (r0 == null || r0.A01 != 2) {
                    z2 = false;
                }
                AnonymousClass1IP r7 = r12.A03;
                int i2 = 1;
                if (r3.A01.A0N(r13)) {
                    i2 = 2;
                }
                String A072 = r3.A07(A082);
                Boolean valueOf = Boolean.valueOf(z2);
                AnonymousClass3T1 r11 = r14;
                AnonymousClass2T0 r5 = new AnonymousClass2T0();
                r5.A02 = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(A002);
                r5.A03 = valueOf2;
                r5.A0F = A072;
                if (z) {
                    A012 = "reaction";
                } else {
                    A012 = C25801Hs.A01(i);
                }
                r5.A0E = A012;
                if (r15 != null) {
                    C25801Hs r8 = r7.A00;
                    r5.A08 = r8.A06(r15);
                    r5.A09 = Long.valueOf(r8.A03(r15));
                    r5.A0D = C25801Hs.A01(r15.A1I);
                    r5.A05 = r8.A05(r15);
                    r5.A0C = C25801Hs.A02(r15);
                }
                if (r14 != null) {
                    C25801Hs r82 = r7.A00;
                    r5.A04 = r82.A05(r14);
                    r5.A06 = r82.A06(r14);
                    r5.A07 = Long.valueOf(r82.A03(r14));
                    r5.A0B = C25801Hs.A01(r14.A1I);
                    r5.A0A = C25801Hs.A02(r14);
                }
                if (r15 != null) {
                    r11 = r15;
                }
                r5.A01 = valueOf;
                if (r11 == null || (A0Q = r11.A0Q()) == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(A0Q.A00);
                }
                r5.A00 = bool;
                r7.A00.A04.Bly(r5);
                AnonymousClass1IQ r52 = r12.A02;
                Long A022 = C65143Qx.A02(A082);
                AnonymousClass3T1 A042 = r3.A04(r13);
                if (A042 != null) {
                    l = Long.valueOf(A042.A0I);
                } else {
                    l = null;
                }
                if (r15 != null) {
                    r14 = r15;
                } else if (r14 == null) {
                    return;
                }
                C25801Hs r53 = r52.A00;
                if (r53.A0B(r14, A002)) {
                    AnonymousClass2SX r32 = new AnonymousClass2SX();
                    r32.A06 = r53.A06(r14);
                    r32.A07 = Long.valueOf(r53.A03(r14));
                    r32.A05 = A022;
                    r32.A0B = r53.A08(r14);
                    r32.A03 = r53.A05(r14);
                    r32.A0A = C25801Hs.A02(r14);
                    C62673Hb A0Q2 = r14.A0Q();
                    if (A0Q2 != null) {
                        bool2 = Boolean.valueOf(A0Q2.A00);
                    } else {
                        bool2 = null;
                    }
                    r32.A00 = bool2;
                    r32.A02 = valueOf2;
                    r32.A01 = valueOf;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    r32.A04 = Long.valueOf(timeUnit.toSeconds(r14.A0I));
                    r32.A09 = Long.valueOf(timeUnit.toSeconds(r14.A0G));
                    r32.A08 = l;
                    r53.A09(r32, r14);
                }
            }
        }
    }

    public final void A01(AnonymousClass11F r12, AnonymousClass3T1 r13, int i) {
        AnonymousClass141 A082;
        C25801Hs r2 = this.A01;
        if (!r2.A00.A0L()) {
            if (C20800yB.A01(C21000yV.A02, r2.A03, 7557) && (A082 = this.A04.A08(r12)) != null) {
                int A002 = C25801Hs.A00(A082);
                int i2 = 1;
                if (r2.A01.A0N(r12)) {
                    i2 = 2;
                }
                String A072 = r2.A07(A082);
                String A012 = C25801Hs.A01(r13.A1I);
                Integer A052 = r2.A05(r13);
                String A022 = C25801Hs.A02(r13);
                Long A062 = r2.A06(r13);
                long A032 = r2.A03(r13);
                AnonymousClass1IP r3 = this.A03;
                Long valueOf = Long.valueOf(A032);
                AnonymousClass2SC r1 = new AnonymousClass2SC();
                r1.A00 = Integer.valueOf(i);
                r1.A02 = Integer.valueOf(A002);
                r1.A01 = Integer.valueOf(i2);
                r1.A04 = A062;
                r1.A05 = valueOf;
                r1.A07 = A012;
                r1.A08 = A072;
                r1.A03 = A052;
                r1.A06 = A022;
                r3.A00.A04.Bly(r1);
            }
        }
    }

    public final void A04(Collection collection, int i) {
        AnonymousClass141 A082;
        Long l;
        Boolean bool;
        if (!this.A01.A00.A0L()) {
            AnonymousClass1IQ r5 = this.A02;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass3T1 r6 = (AnonymousClass3T1) it.next();
                    AnonymousClass11F r7 = r6.A1J.A00;
                    if (!(r7 == null || (A082 = r5.A01.A08(r7)) == null)) {
                        C25801Hs r4 = r5.A00;
                        int A002 = C25801Hs.A00(A082);
                        if (A002 != 1 && r4.A0B(r6, A002)) {
                            C45622Sb r3 = new C45622Sb();
                            r3.A03 = Integer.valueOf(i);
                            AnonymousClass3T1 A042 = r4.A04(r7);
                            if (A042 != null) {
                                l = Long.valueOf(A042.A0I);
                            } else {
                                l = null;
                            }
                            r3.A09 = l;
                            r3.A06 = C65143Qx.A02(A082);
                            r3.A0C = r4.A08(r6);
                            r3.A07 = r4.A06(r6);
                            r3.A04 = r4.A05(r6);
                            r3.A0B = C25801Hs.A02(r6);
                            AnonymousClass3L0 r0 = A082.A0E;
                            boolean z = true;
                            if (r0 == null || r0.A01 != 2) {
                                z = false;
                            }
                            r3.A01 = Boolean.valueOf(z);
                            C62673Hb A0Q = r6.A0Q();
                            if (A0Q != null) {
                                bool = Boolean.valueOf(A0Q.A00);
                            } else {
                                bool = null;
                            }
                            r3.A00 = bool;
                            r3.A08 = Long.valueOf(r4.A03(r6));
                            r3.A02 = Integer.valueOf(C25801Hs.A00(A082));
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            r3.A05 = Long.valueOf(timeUnit.toSeconds(r6.A0I));
                            r3.A0A = Long.valueOf(timeUnit.toSeconds(r6.A0G));
                            r4.A09(r3, r6);
                        }
                    }
                }
            }
        }
    }
}
