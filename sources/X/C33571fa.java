package X;

import android.content.SharedPreferences;
import android.widget.FrameLayout;

/* renamed from: X.1fa  reason: invalid class name and case insensitive filesystem */
public class C33571fa extends FrameLayout implements C18700tb {
    public C19460v5 A00;
    public C19460v5 A01;
    public C19460v5 A02;
    public C19460v5 A03;
    public C19460v5 A04;
    public C19460v5 A05;
    public C24801Dv A06;
    public C33631fg A07;
    public C19730wQ A08;
    public C21100yf A09;
    public C24461Cn A0A;
    public C33601fd A0B;
    public AnonymousClass3KG A0C;
    public C33001eY A0D;
    public C33581fb A0E;
    public C33591fc A0F;
    public C27661Pe A0G;
    public AnonymousClass1A6 A0H;
    public C19970wo A0I;
    public C19630wG A0J;
    public C19420v0 A0K;
    public C18820ts A0L;
    public C20810yC A0M;
    public C21010yW A0N;
    public C32901eN A0O;
    public C33651fi A0P;
    public C33661fj A0Q;
    public C33621ff A0R;
    public C33041ec A0S;
    public C29371Wj A0T;
    public C29341Wg A0U;
    public C31871cW A0V;
    public C19770wU A0W;
    public AnonymousClass1QZ A0X;
    public boolean A0Y;
    public final C33681fl A0Z;
    public final C33681fl A0a;
    public final C33681fl A0b;
    public final C33681fl A0c;
    public final C33681fl A0d;
    public final C33681fl A0e;
    public final C33931gA A0f;
    public final C33711fo A0g;
    public final C33861g3 A0h;
    public final C33871g4 A0i;
    public final C33901g7 A0j;
    public final C33691fm A0k;
    public final C33811fy A0l;
    public final C33841g1 A0m;
    public final int[] A0n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33571fa(android.content.Context r26, X.AnonymousClass01z r27) {
        /*
            r25 = this;
            r10 = 0
            r0 = 0
            r12 = r25
            r9 = r26
            r12.<init>(r9, r10, r0)
            boolean r0 = r12.A0Y
            if (r0 != 0) goto L_0x0120
            r0 = 1
            r12.A0Y = r0
            java.lang.Object r4 = r12.generatedComponent()
            X.1Qb r4 = (X.C27851Qb) r4
            X.1Qc r4 = (X.C27861Qc) r4
            X.0tq r2 = r4.A0M
            X.004 r0 = r2.A8b
            java.lang.Object r0 = r0.get()
            X.0wo r0 = (X.C19970wo) r0
            r12.A0I = r0
            X.004 r0 = r2.A02
            java.lang.Object r0 = r0.get()
            X.0yC r0 = (X.C20810yC) r0
            r12.A0M = r0
            X.004 r0 = r2.A4g
            java.lang.Object r0 = r0.get()
            X.0wQ r0 = (X.C19730wQ) r0
            r12.A08 = r0
            X.004 r0 = r2.A91
            java.lang.Object r0 = r0.get()
            X.0wG r0 = (X.C19630wG) r0
            r12.A0J = r0
            X.0v6 r1 = X.C19470v6.A00
            r12.A02 = r1
            X.004 r0 = r2.A79
            java.lang.Object r0 = r0.get()
            X.0yW r0 = (X.C21010yW) r0
            r12.A0N = r0
            X.004 r0 = r2.A7f
            java.lang.Object r0 = r0.get()
            X.0yf r0 = (X.C21100yf) r0
            r12.A09 = r0
            X.004 r0 = r2.A0D
            java.lang.Object r0 = r0.get()
            X.1Dv r0 = (X.C24801Dv) r0
            r12.A06 = r0
            X.004 r0 = r2.A9X
            java.lang.Object r0 = r0.get()
            X.0ts r0 = (X.C18820ts) r0
            r12.A0L = r0
            X.1fb r0 = X.C27861Qc.A04(r4)
            r12.A0E = r0
            X.004 r0 = r2.A8p
            java.lang.Object r0 = r0.get()
            X.1Wj r0 = (X.C29371Wj) r0
            r12.A0T = r0
            X.004 r0 = r2.A8q
            java.lang.Object r0 = r0.get()
            X.1Wg r0 = (X.C29341Wg) r0
            r12.A0U = r0
            r12.A01 = r1
            X.1My r5 = r4.A0L
            X.1eY r0 = X.C27111My.A0B(r5)
            r12.A0D = r0
            X.0tt r3 = r2.A00
            X.004 r0 = r3.A3f
            java.lang.Object r0 = r0.get()
            X.1fc r0 = (X.C33591fc) r0
            r12.A0F = r0
            X.1eN r0 = X.C27111My.A2I(r5)
            r12.A0O = r0
            X.004 r0 = r2.A9G
            java.lang.Object r0 = r0.get()
            X.0v0 r0 = (X.C19420v0) r0
            r12.A0K = r0
            X.004 r0 = r2.A2P
            java.lang.Object r0 = r0.get()
            X.1A6 r0 = (X.AnonymousClass1A6) r0
            r12.A0H = r0
            r12.A00 = r1
            X.004 r0 = r3.A4G
            java.lang.Object r0 = r0.get()
            X.1ec r0 = (X.C33041ec) r0
            r12.A0S = r0
            X.004 r0 = r2.A0c
            java.lang.Object r0 = r0.get()
            X.1Cn r0 = (X.C24461Cn) r0
            r12.A0A = r0
            X.1fd r0 = X.C27111My.A08(r5)
            r12.A0B = r0
            r12.A03 = r1
            X.004 r0 = r3.A3B
            java.lang.Object r0 = r0.get()
            X.1ff r0 = (X.C33621ff) r0
            r12.A0R = r0
            X.004 r0 = r4.A01
            java.lang.Object r0 = r0.get()
            X.1fg r0 = (X.C33631fg) r0
            r12.A07 = r0
            X.004 r0 = r2.A7T
            java.lang.Object r0 = r0.get()
            X.1cW r0 = (X.C31871cW) r0
            r12.A0V = r0
            X.004 r0 = r2.A1u
            java.lang.Object r0 = r0.get()
            X.1Pe r0 = (X.C27661Pe) r0
            r12.A0G = r0
            X.004 r0 = r3.A3D
            java.lang.Object r0 = r0.get()
            X.1fi r0 = (X.C33651fi) r0
            r12.A0P = r0
            X.004 r0 = r3.A3E
            java.lang.Object r0 = r0.get()
            X.1fj r0 = (X.C33661fj) r0
            r12.A0Q = r0
            r12.A04 = r1
            r12.A05 = r1
            X.004 r0 = r2.A9Y
            java.lang.Object r0 = r0.get()
            X.0wU r0 = (X.C19770wU) r0
            r12.A0W = r0
        L_0x0120:
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {36, 33, 12, 40, 37, 27, 1, 11, 20, 13, 14, 21, 44} // fill-array
            r12.A0n = r0
            r0 = 1
            X.1k0 r1 = new X.1k0
            r1.<init>(r12, r0)
            X.0yW r3 = r12.A0N
            X.0v0 r2 = r12.A0K
            X.1fk r0 = new X.1fk
            r0.<init>(r2, r3)
            r3 = 0
            X.1jY r2 = new X.1jY
            r2.<init>(r12, r3)
            X.C012005e.A0V(r12, r2)
            X.0yC r15 = r12.A0M
            X.0v5 r4 = r12.A01
            X.0v5 r3 = r12.A00
            X.1fm r2 = new X.1fm
            r2.<init>(r4, r3, r12, r15)
            r12.A0k = r2
            X.1eY r13 = r12.A0D
            X.0wU r2 = r12.A0W
            X.1fb r14 = r12.A0E
            X.1fo r11 = new X.1fo
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r12.A0g = r11
            X.0wo r14 = r12.A0I
            X.0yC r4 = r12.A0M
            X.0yW r3 = r12.A0N
            X.1eN r2 = r12.A0O
            X.0v0 r15 = r12.A0K
            X.1A6 r13 = r12.A0H
            X.1fr r11 = new X.1fr
            r18 = r2
            r17 = r3
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r12.A0c = r11
            X.1fg r2 = r12.A07
            X.190 r20 = new X.190
            r20.<init>()
            X.1Qd r3 = r2.A00
            X.0tq r7 = r3.A01
            X.004 r2 = r7.A02
            java.lang.Object r6 = r2.get()
            X.0yC r6 = (X.C20810yC) r6
            X.004 r2 = r7.A1x
            java.lang.Object r5 = r2.get()
            X.0wp r5 = (X.C19980wp) r5
            X.0tt r4 = r7.A00
            X.004 r2 = r4.A17
            java.lang.Object r15 = r2.get()
            X.1fs r15 = (X.C33751fs) r15
            X.004 r2 = r4.A2Y
            java.lang.Object r4 = r2.get()
            X.1e1 r4 = (X.C32681e1) r4
            X.004 r2 = r7.A4g
            java.lang.Object r13 = r2.get()
            X.0wQ r13 = (X.C19730wQ) r13
            X.004 r2 = r7.A8f
            java.lang.Object r14 = r2.get()
            X.1fu r14 = (X.C33771fu) r14
            X.1Qc r2 = r3.A02
            X.004 r2 = r2.A0H
            java.lang.Object r3 = r2.get()
            X.1fv r3 = (X.C33781fv) r3
            X.004 r2 = r7.A9G
            java.lang.Object r2 = r2.get()
            X.0v0 r2 = (X.C19420v0) r2
            X.1fw r11 = new X.1fw
            r19 = r3
            r21 = r4
            r18 = r6
            r17 = r2
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r12.A0e = r11
            X.0wo r6 = r12.A0I
            X.0yC r3 = r12.A0M
            X.0wG r8 = r12.A0J
            X.0v5 r7 = r12.A02
            X.0v0 r15 = r12.A0K
            X.0v5 r5 = r12.A03
            X.1ff r4 = r12.A0R
            X.1fy r2 = new X.1fy
            r17 = r7
            r18 = r5
            r19 = r12
            r20 = r6
            r21 = r8
            r22 = r15
            r23 = r3
            r24 = r4
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r12.A0l = r2
            X.0yW r2 = r12.A0N
            X.1Dv r11 = r12.A06
            X.1fz r4 = new X.1fz
            r16 = r4
            r17 = r11
            r18 = r12
            r19 = r15
            r20 = r3
            r21 = r2
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r12.A0d = r4
            X.0yf r5 = r12.A09
            X.1g0 r4 = new X.1g0
            r4.<init>(r12, r5, r0)
            r12.A0a = r4
            X.1Wj r7 = r12.A0T
            X.1Wg r5 = r12.A0U
            X.1ec r4 = r12.A0S
            X.1g1 r0 = new X.1g1
            r16 = r0
            r17 = r12
            r18 = r3
            r19 = r4
            r20 = r7
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r12.A0m = r0
            X.1fi r4 = r12.A0P
            X.1g3 r0 = new X.1g3
            r0.<init>(r12, r4)
            r12.A0h = r0
            X.1fj r4 = r12.A0Q
            X.1g4 r0 = new X.1g4
            r0.<init>(r12, r4)
            r12.A0i = r0
            X.1g5 r0 = new X.1g5
            r0.<init>(r15)
            X.1g6 r5 = new X.1g6
            r5.<init>(r15, r3, r2, r0)
            X.1cW r4 = r12.A0V
            X.1g7 r0 = new X.1g7
            r17 = r27
            r16 = r0
            r18 = r12
            r19 = r6
            r20 = r4
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            r12.A0j = r0
            X.0v5 r4 = r12.A04
            boolean r0 = r4.A05()
            if (r0 == 0) goto L_0x027c
            r4.A02()
            java.lang.String r1 = "create"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x027c:
            X.0v5 r4 = r12.A05
            boolean r0 = r4.A05()
            if (r0 == 0) goto L_0x028f
            r4.A02()
            java.lang.String r1 = "create"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x028f:
            X.1g8 r4 = new X.1g8
            r4.<init>(r15)
            X.1g9 r0 = new X.1g9
            r0.<init>(r12, r4, r3, r1)
            r12.A0b = r0
            X.1fc r1 = r12.A0F
            X.1gA r0 = new X.1gA
            r16 = r0
            r17 = r12
            r18 = r11
            r19 = r1
            r20 = r15
            r21 = r3
            r22 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r12.A0f = r0
            X.0ts r0 = r12.A0L
            X.1Cn r13 = r12.A0A
            X.1fd r14 = r12.A0B
            X.1gB r8 = new X.1gB
            r19 = 0
            r18 = r2
            r17 = r3
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r12.A0Z = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33571fa.<init>(android.content.Context, X.01z):void");
    }

    public static boolean A00(C19420v0 r7) {
        if (((SharedPreferences) r7.A00.get()).getInt("education_banner_count", 0) >= 3) {
            if (!r7.A2V("education_banner_timestamp", ((long) 7) * 86400000)) {
                return false;
            }
            C19420v0.A00(r7).putInt("education_banner_count", 0).apply();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x001c, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x003a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x006c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x001c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x001c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getBannerType() {
        /*
            r7 = this;
            int[] r4 = r7.A0n
            int r3 = r4.length
            r6 = 0
            r2 = 0
        L_0x0005:
            if (r2 >= r3) goto L_0x00ac
            r1 = r4[r2]
            X.0wQ r0 = r7.A08
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x001f
            r0 = 1
            if (r1 == r0) goto L_0x001f
            r0 = 44
            if (r1 == r0) goto L_0x003b
            int r1 = 11 - r1
            if (r1 == 0) goto L_0x0064
        L_0x001c:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x001f:
            r5 = 1
            if (r1 == r5) goto L_0x0061
            r5 = 20
            if (r1 == r5) goto L_0x0058
            r0 = 27
            if (r1 == r0) goto L_0x00a3
            r5 = 33
            if (r1 == r5) goto L_0x0055
            r5 = 40
            if (r1 != r5) goto L_0x003b
            X.1fl r0 = r7.A0Z
        L_0x0034:
            boolean r0 = r0.Bt0()
        L_0x0038:
            if (r0 == 0) goto L_0x001c
            return r5
        L_0x003b:
            r5 = 44
            if (r1 == r5) goto L_0x0052
            r5 = 36
            if (r1 == r5) goto L_0x004b
            r5 = 37
            if (r1 == r5) goto L_0x0092
            switch(r1) {
                case 11: goto L_0x0064;
                case 12: goto L_0x006f;
                case 13: goto L_0x007a;
                case 14: goto L_0x0085;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x001c
        L_0x004b:
            X.1gA r0 = r7.A0f
            boolean r0 = r0.A01()
            goto L_0x0038
        L_0x0052:
            X.1fl r0 = r7.A0e
            goto L_0x0034
        L_0x0055:
            X.1fl r0 = r7.A0b
            goto L_0x0034
        L_0x0058:
            X.1g3 r0 = r7.A0h
            X.1fh r0 = r0.A02
            boolean r0 = r0.A04()
            goto L_0x0038
        L_0x0061:
            X.1fl r0 = r7.A0c
            goto L_0x0034
        L_0x0064:
            X.1fl r0 = r7.A0d
            boolean r0 = r0.Bt0()
            if (r0 == 0) goto L_0x001c
            r0 = 11
            return r0
        L_0x006f:
            X.1g1 r0 = r7.A0m
            boolean r0 = r0.Bt0()
            if (r0 == 0) goto L_0x001c
            r0 = 12
            return r0
        L_0x007a:
            X.1fl r0 = r7.A0a
            boolean r0 = r0.Bt0()
            if (r0 == 0) goto L_0x001c
            r0 = 13
            return r0
        L_0x0085:
            X.1g4 r0 = r7.A0i
            X.1fh r0 = r0.A02
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x001c
            r0 = 14
            return r0
        L_0x0092:
            X.3KG r1 = r7.A0C
            if (r1 == 0) goto L_0x001c
            X.1fo r0 = r7.A0g
            X.4On r1 = r1.A00
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001c
            if (r1 == 0) goto L_0x001c
            return r5
        L_0x00a3:
            X.1g7 r0 = r7.A0j
            X.1fa r0 = r0.A02
            r0.getContext()
            goto L_0x001c
        L_0x00ac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33571fa.getBannerType():int");
    }

    public void A01(int i, int i2) {
        AnonymousClass2PD r1 = new AnonymousClass2PD();
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = Integer.valueOf(i);
        this.A0N.Blw(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        if (r2 == 33) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass3KG r13) {
        /*
            r12 = this;
            r12.A0C = r13
            X.1fy r0 = r12.A0l
            r0.BK9()
            X.1fl r6 = r12.A0c
            r6.BK9()
            X.1fl r7 = r12.A0d
            r7.BK9()
            X.1fo r11 = r12.A0g
            r11.BK9()
            X.1g1 r10 = r12.A0m
            r10.BK9()
            X.1fl r5 = r12.A0a
            r5.BK9()
            X.1g4 r4 = r12.A0i
            r4.BK9()
            X.1g3 r3 = r12.A0h
            r3.BK9()
            X.1g7 r9 = r12.A0j
            r9.BK9()
            X.1fl r8 = r12.A0e
            r8.BK9()
            X.1fl r1 = r12.A0b
            r1.BK9()
            X.1gA r0 = r12.A0f
            r0.BK9()
            int r2 = r12.getBannerType()
            X.0wQ r0 = r12.A08
            r0.A0L()
            r0 = 37
            if (r2 != r0) goto L_0x0051
            if (r13 == 0) goto L_0x00a7
            r11.A03(r13)
            return
        L_0x0051:
            r0 = 12
            if (r2 != r0) goto L_0x0059
            r10.BwS()
            return
        L_0x0059:
            r0 = 27
            if (r2 != r0) goto L_0x0068
            r9.BwS()
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0068:
            r0 = 44
            if (r2 == r0) goto L_0x0071
            r0 = 11
            if (r2 != r0) goto L_0x0075
            r8 = r7
        L_0x0071:
            r8.BwS()
            return
        L_0x0075:
            r0 = 40
            if (r2 != r0) goto L_0x007c
            X.1fl r8 = r12.A0Z
            goto L_0x0071
        L_0x007c:
            if (r2 == 0) goto L_0x0094
            r0 = 1
            if (r2 == r0) goto L_0x00a5
            r0 = 13
            if (r2 == r0) goto L_0x00a3
            r0 = 14
            if (r2 == r0) goto L_0x009f
            r0 = 20
            if (r2 == r0) goto L_0x009b
            r0 = 33
            if (r2 != r0) goto L_0x00a7
        L_0x0091:
            r1.BwS()
        L_0x0094:
            r4.A02(r2)
            r3.A02(r2)
            return
        L_0x009b:
            r3.BwS()
            goto L_0x0094
        L_0x009f:
            r4.BwS()
            goto L_0x0094
        L_0x00a3:
            r1 = r5
            goto L_0x0091
        L_0x00a5:
            r1 = r6
            goto L_0x0091
        L_0x00a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unhandled banner type: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33571fa.A02(X.3KG):void");
    }

    public boolean A03(AnonymousClass3KG r4) {
        this.A0C = r4;
        C19730wQ r1 = this.A08;
        r1.A0L();
        r1.A0L();
        if (r1.A0L() || this.A0U.A07() == null) {
            r1.A0L();
            r1.A0L();
            if (!A00(this.A0K)) {
                return false;
            }
            C19460v5 r12 = this.A02;
            if (r12.A05()) {
                r12.A02();
                throw new NullPointerException("getSmbBannerType");
            } else if (getBannerType() == 0) {
                return false;
            }
        }
        return true;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0X;
        if (r0 == null) {
            r0 = new AnonymousClass1QZ(this);
            this.A0X = r0;
        }
        return r0.generatedComponent();
    }
}
