package X;

import java.util.List;
import org.json.JSONObject;

/* renamed from: X.1dD  reason: invalid class name and case insensitive filesystem */
public final class C32241dD {
    public long A00;
    public long A01;
    public final C20810yC A02;
    public final C21010yW A03;
    public final AnonymousClass1GQ A04;
    public final C28081Rg A05;
    public final C220412q A06;

    public C32241dD(C220412q r2, C20810yC r3, C21010yW r4, AnonymousClass1GQ r5, C28081Rg r6) {
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r2, 5);
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject A01(X.C52512pY r5, java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r4 = this;
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L_0x0030
            X.12q r0 = r4.A06
            java.util.Collection r1 = r0.A0F()
            if (r1 == 0) goto L_0x0034
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0056
            java.util.Iterator r2 = r1.iterator()
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = r2.next()
            X.3Qp r1 = (X.C65073Qp) r1
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x0016
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.A0M()
            if (r0 != r3) goto L_0x0016
        L_0x0030:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
        L_0x0034:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "has_followed_channels"
            r1.put(r0, r2)
            X.2pY r0 = X.C52512pY.NEWSLETTER_DIRECTORY
            if (r5 != r0) goto L_0x0048
            java.lang.String r0 = "pill_type"
            r1.put(r0, r6)
        L_0x0047:
            return r1
        L_0x0048:
            X.2pY r0 = X.C52512pY.NEWSLETTER_FORWARDED_MESSAGE
            if (r5 == r0) goto L_0x0050
            X.2pY r0 = X.C52512pY.NEWSLETTER_CHAT_LINK
            if (r5 != r0) goto L_0x0047
        L_0x0050:
            java.lang.String r0 = "thread_type"
            r1.put(r0, r7)
            return r1
        L_0x0056:
            r3 = 0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32241dD.A01(X.2pY, java.lang.String, java.lang.String, boolean):org.json.JSONObject");
    }

    public final void A0A(C28981Uw r11, C52512pY r12, C52512pY r13, Long l, String str) {
        AnonymousClass00C.A0D(r11, 0);
        A02(r11, r12, r13, l, A01(r12, (String) null, str, false), 3, -1);
    }

    public final void A0B(C28981Uw r11, C52512pY r12, C52512pY r13, Long l, String str) {
        AnonymousClass00C.A0D(r11, 0);
        A02(r11, r12, r13, l, A01(r12, (String) null, str, false), 4, -1);
    }

    public final void A0C(C28981Uw r9, C52512pY r10, C52512pY r11, Long l, String str, String str2, int i) {
        AnonymousClass00C.A0D(r9, 0);
        A02(r9, r10, r11, l, A01(r10, str, str2, true), 1, i);
    }

    public final void A0D(C28981Uw r10, C52512pY r11, C52512pY r12, Long l, String str, String str2, int i) {
        AnonymousClass00C.A0D(r10, 0);
        A02(r10, r11, r12, l, A01(r11, str, str2, false), 2, i);
    }

    public final void A0E(C28981Uw r15, C52512pY r16, List list, List list2, int i, long j) {
        int i2;
        Long l;
        List<C44072La> list3 = list;
        AnonymousClass00C.A0D(list3, 2);
        List list4 = list2;
        AnonymousClass00C.A0D(list4, 3);
        int i3 = i;
        if (list3.isEmpty()) {
            AnonymousClass2S1 r1 = new AnonymousClass2S1();
            r1.A07 = r15.user;
            r1.A00 = Integer.valueOf(i3);
            r1.A01 = 0;
            r1.A02 = Integer.valueOf(AnonymousClass3RE.A01(r16));
            r1.A06 = Long.valueOf(j);
            this.A03.Bly(r1);
            return;
        }
        long j2 = 0;
        long j3 = 0;
        for (C44072La r3 : list3) {
            AnonymousClass2S1 r4 = new AnonymousClass2S1();
            r4.A07 = r15.user;
            r4.A00 = Integer.valueOf(i3);
            if (i == 0) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            r4.A01 = i2;
            r4.A02 = Integer.valueOf(AnonymousClass3RE.A01(r16));
            r4.A06 = Long.valueOf(j);
            r4.A08 = r3.A0J().user;
            j2++;
            r4.A05 = Long.valueOf(j2);
            if (i3 == 1 || !list4.contains(r3)) {
                l = null;
            } else {
                j3++;
                l = Long.valueOf(j3);
            }
            r4.A04 = l;
            int ordinal = r3.A09.ordinal();
            int i4 = 4;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i4 = 3;
                } else if (ordinal == 2) {
                    i4 = 2;
                } else if (ordinal == 3) {
                    i4 = 1;
                } else {
                    throw new C13180jS();
                }
            }
            r4.A03 = Integer.valueOf(i4);
            this.A03.Bly(r4);
        }
    }

    public static final long A00(C32241dD r5) {
        long j = r5.A00;
        if (j != 0) {
            return j;
        }
        long A052 = AnonymousClass0XG.A00.A05(Long.MAX_VALUE);
        r5.A00 = A052;
        return A052;
    }

    private final void A02(C28981Uw r4, C52512pY r5, C52512pY r6, Long l, JSONObject jSONObject, int i, int i2) {
        AnonymousClass2SF r2 = new AnonymousClass2SF();
        r2.A00 = Integer.valueOf(i);
        r2.A01 = Integer.valueOf(AnonymousClass3RE.A00(r5));
        int i3 = 2;
        if (r5 == C52512pY.EXTERNAL_DEEPLINK) {
            i3 = 1;
        }
        r2.A02 = Integer.valueOf(i3);
        r2.A03 = AnonymousClass3RE.A02(r5);
        r2.A08 = r4.user;
        r2.A04 = Integer.valueOf(AnonymousClass3RE.A01(r6));
        if (r5 == C52512pY.NEWSLETTER_DIRECTORY || r5 == C52512pY.NEWSLETTER_DIRECTORY_SEARCH) {
            r2.A05 = Long.valueOf(A00(this));
            if (r5 == r6) {
                r2.A06 = Long.valueOf((long) i2);
            }
        }
        r2.A09 = jSONObject.toString();
        Integer num = r2.A01;
        if (num != null && num.intValue() == 13) {
            r2.A07 = l;
        }
        this.A03.Bly(r2);
    }

    public static final void A03(C28981Uw r5, C32241dD r6, int i, int i2, boolean z) {
        if (r6.A04.A06()) {
            AnonymousClass2SG r4 = new AnonymousClass2SG();
            r4.A06 = Long.valueOf(A00(r6));
            r4.A01 = Integer.valueOf(i);
            r4.A08 = r5.user;
            r4.A07 = Long.valueOf((long) i2);
            r4.A00 = Boolean.valueOf(z);
            long j = r6.A01;
            r6.A01 = 1 + j;
            r4.A05 = Long.valueOf(j);
            r6.A03.Bly(r4);
        }
    }

    public static final boolean A04(C32241dD r2) {
        C20810yC r22 = r2.A02;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r22, 4357) || !C20800yB.A01(r1, r22, 4632)) {
            return false;
        }
        return true;
    }

    public final void A06(int i) {
        if (this.A04.A06()) {
            AnonymousClass2SG r4 = new AnonymousClass2SG();
            r4.A06 = Long.valueOf(A00(this));
            r4.A01 = 1;
            r4.A02 = Integer.valueOf(i);
            long j = this.A01;
            this.A01 = 1 + j;
            r4.A05 = Long.valueOf(j);
            this.A03.Bly(r4);
        }
    }

    public final void A07(int i, boolean z) {
        if (this.A04.A04()) {
            AnonymousClass2QA r4 = new AnonymousClass2QA();
            r4.A01 = Integer.valueOf(i);
            int i2 = 2;
            if (z) {
                i2 = 1;
            }
            r4.A00 = Integer.valueOf(i2);
            r4.A03 = Long.valueOf(A00(this));
            long j = this.A01;
            this.A01 = 1 + j;
            r4.A02 = Long.valueOf(j);
            this.A03.Bly(r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r3 != 12) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C28981Uw r6, X.C52512pY r7, int r8, int r9) {
        /*
            r5 = this;
            X.0yC r2 = r5.A02
            r1 = 5491(0x1573, float:7.695E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x003e
            X.2QB r4 = new X.2QB
            r4.<init>()
            if (r6 == 0) goto L_0x0049
            java.lang.String r0 = r6.user
        L_0x0015:
            r4.A03 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4.A00 = r0
            r0 = -1
            if (r7 != 0) goto L_0x0044
            r3 = -1
        L_0x0021:
            r2 = 0
            if (r3 == r0) goto L_0x0031
            r1 = 1
            r0 = 2
            if (r3 == r0) goto L_0x003f
            r1 = 2
            r0 = 1
            if (r3 == r0) goto L_0x003f
            r1 = 3
            r0 = 12
            if (r3 == r0) goto L_0x003f
        L_0x0031:
            r4.A01 = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.A02 = r0
            X.0yW r0 = r5.A03
            r0.Bly(r4)
        L_0x003e:
            return
        L_0x003f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            goto L_0x0031
        L_0x0044:
            int r3 = r7.ordinal()
            goto L_0x0021
        L_0x0049:
            r0 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32241dD.A08(X.1Uw, X.2pY, int, int):void");
    }

    public final void A09(C28981Uw r2, C52512pY r3, int i, boolean z) {
        if (r3 == C52512pY.NEWSLETTER_DIRECTORY) {
            A03(r2, this, 5, i, z);
        }
    }

    public final void A0F(AnonymousClass3T1 r5, Integer num, int i, int i2) {
        C63393Jw A0W;
        C20810yC r3 = this.A02;
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A01(r1, r3, 5492)) {
            AnonymousClass2R1 r2 = new AnonymousClass2R1();
            r2.A01 = num;
            r2.A00 = Integer.valueOf(i);
            r2.A02 = Integer.valueOf(i2);
            if (C20800yB.A01(r1, r3, 7264) && (A0W = r5.A0W()) != null) {
                r2.A03 = A0W.A01.user;
                r2.A04 = String.valueOf(A0W.A00);
            }
            this.A03.Bly(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r6.A02, 5471) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9, int r10) {
        /*
            r6 = this;
            X.1GQ r1 = r6.A04
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x001b
            X.0yC r2 = r6.A02
            r1 = 5471(0x155f, float:7.667E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r5 = 2
            if (r0 != 0) goto L_0x003e
            java.lang.Integer[] r2 = new java.lang.Integer[r5]
            r1 = 0
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            r1 = 1
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            boolean r0 = X.AnonymousClass02R.A0F(r0, r2)
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            return
        L_0x003e:
            X.2SG r4 = new X.2SG
            r4.<init>()
            long r0 = A00(r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A06 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r4.A01 = r0
            r4.A04 = r7
            r4.A09 = r9
            r4.A03 = r8
            long r2 = r6.A01
            r0 = 1
            long r0 = r0 + r2
            r6.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A05 = r0
            X.0yW r0 = r6.A03
            r0.Bly(r4)
            if (r10 != r5) goto L_0x003d
            r0 = 0
            r6.A00 = r0
            r6.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32241dD.A0G(java.lang.Integer, java.lang.Integer, java.lang.String, int):void");
    }

    public final void A0H(boolean z) {
        if (this.A04.A04()) {
            this.A01 = 0;
            AnonymousClass2QA r4 = new AnonymousClass2QA();
            r4.A03 = Long.valueOf(A00(this));
            int i = 5;
            if (z) {
                i = 1;
            }
            r4.A01 = Integer.valueOf(i);
            long j = this.A01;
            this.A01 = 1 + j;
            r4.A02 = Long.valueOf(j);
            this.A03.Bly(r4);
        }
    }

    public final void A05(int i) {
        if (A04(this)) {
            AnonymousClass2PK r1 = new AnonymousClass2PK();
            r1.A01 = Integer.valueOf(i);
            this.A03.Bly(r1);
        }
    }
}
