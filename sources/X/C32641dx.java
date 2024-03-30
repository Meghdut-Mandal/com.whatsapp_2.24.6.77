package X;

import com.whatsapp.push.RegistrationIntentService;
import java.util.Set;

/* renamed from: X.1dx  reason: invalid class name and case insensitive filesystem */
public final class C32641dx {
    public final C25791Hr A00;
    public final AnonymousClass196 A01;
    public final C19970wo A02;
    public final C19630wG A03;
    public final AnonymousClass1CR A04;
    public final AnonymousClass1AO A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass17X A07;
    public final C20500xf A08;
    public final C21010yW A09;
    public final C32651dy A0A;

    public C32641dx(C25791Hr r2, AnonymousClass1AO r3, AnonymousClass196 r4, AnonymousClass16D r5, C19970wo r6, C19630wG r7, AnonymousClass17X r8, C20500xf r9, C21010yW r10, C32651dy r11, AnonymousClass1CR r12) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r12, 4);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r2, 6);
        AnonymousClass00C.A0D(r11, 7);
        AnonymousClass00C.A0D(r8, 8);
        AnonymousClass00C.A0D(r5, 9);
        AnonymousClass00C.A0D(r10, 10);
        AnonymousClass00C.A0D(r9, 11);
        this.A01 = r4;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = r12;
        this.A05 = r3;
        this.A00 = r2;
        this.A0A = r11;
        this.A07 = r8;
        this.A06 = r5;
        this.A09 = r10;
        this.A08 = r9;
    }

    public final void A01(AnonymousClass11F r5, C51992oi r6) {
        AnonymousClass00C.A0D(r5, 0);
        A00(r5, r6, this, 0);
        AnonymousClass196 r2 = this.A01;
        Set A032 = r2.A03(r5, 0, false);
        AnonymousClass00C.A08(A032);
        if (this.A04.A0i(r5)) {
            r2.A0Q(A032);
        } else {
            r2.A0P(A032);
        }
        if (AnonymousClass143.A0G(r5)) {
            RegistrationIntentService.A04(this.A03.A00);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.2OB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.2NJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.2OB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.2OB} */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0111, code lost:
        if (r4 == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0188, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass11F r24, X.C51992oi r25, X.C32641dx r26, long r27) {
        /*
            r0 = 0
            r6 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            int r10 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            r15 = 0
            r22 = 3
            if (r10 == 0) goto L_0x0011
            r15 = 1
            r22 = 2
        L_0x0011:
            r7 = r26
            X.1Hr r9 = r7.A00
            int r4 = r25.ordinal()
            r3 = 0
            r21 = 4
            r8 = 2
            r2 = 3
            if (r4 == r3) goto L_0x0061
            if (r4 == r6) goto L_0x005e
            if (r4 == r2) goto L_0x005e
            if (r4 == r8) goto L_0x0028
            r21 = 3
        L_0x0028:
            r18 = 0
            r20 = r18
            r23 = 0
            r8 = r24
            r19 = r18
            r17 = r8
            r16 = r9
            r16.A02(r17, r18, r19, r20, r21, r22, r23)
            if (r10 == 0) goto L_0x0064
            r0 = -1
            int r2 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0064
            long r0 = java.lang.System.currentTimeMillis()
            long r27 = r27 - r0
            java.lang.System.currentTimeMillis()
            int[] r13 = X.C56522wQ.A00
            r12 = 0
            r11 = 3
        L_0x004e:
            r0 = r13[r12]
            long r0 = (long) r0
            r9 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 * r9
            int r2 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0064
            int r12 = r12 + 1
            if (r12 >= r11) goto L_0x0064
            goto L_0x004e
        L_0x005e:
            r21 = 2
            goto L_0x0028
        L_0x0061:
            r21 = 0
            goto L_0x0028
        L_0x0064:
            X.1AO r9 = r7.A05
            r9.A03 = r0
            X.2Ra r12 = new X.2Ra
            r12.<init>()
            X.0xf r2 = r7.A08
            boolean r2 = X.AnonymousClass3M3.A01(r2, r8)
            if (r2 == 0) goto L_0x007d
            r2 = 0
            switch(r4) {
                case 0: goto L_0x0185;
                case 1: goto L_0x0187;
                case 2: goto L_0x0183;
                default: goto L_0x0079;
            }
        L_0x0079:
            r12.A03 = r2
            r12.A04 = r5
        L_0x007d:
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r12.A05 = r10
            r11 = 2
            if (r15 == 0) goto L_0x017d
            r2 = r5
        L_0x0087:
            r12.A00 = r2
            if (r15 == 0) goto L_0x008d
            r12.A01 = r5
        L_0x008d:
            r12.A02 = r5
            boolean r14 = X.AnonymousClass143.A0G(r8)
            if (r14 == 0) goto L_0x017a
            X.17X r5 = r7.A07
            r4 = r8
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            boolean r2 = r5.A0C(r4)
            if (r2 == 0) goto L_0x017a
            r13 = 1
            X.17r r2 = r5.A07
            X.6X6 r2 = r2.A0C(r4)
            java.util.Map r2 = r2.A08
            int r2 = r2.size()
            long r4 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r12.A06 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r12.A02 = r2
        L_0x00ba:
            boolean r2 = r8 instanceof X.C28981Uw
            if (r2 == 0) goto L_0x00c5
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.A02 = r2
        L_0x00c5:
            X.0yW r11 = r7.A09
            r11.Blv(r12)
            if (r13 == 0) goto L_0x0178
            X.17X r5 = r7.A07
            android.os.Parcelable$Creator r2 = X.AnonymousClass147.CREATOR
            X.147 r4 = X.C65533Sl.A03(r8)
            X.C18740tg.A06(r4)
            X.17r r2 = r5.A07
            X.6X6 r2 = r2.A0C(r4)
            java.util.ArrayList r2 = r2.A0F()
            java.util.Iterator r12 = r2.iterator()
        L_0x00e5:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0178
            java.lang.Object r2 = r12.next()
            X.6PM r2 = (X.AnonymousClass6PM) r2
            X.16D r4 = r5.A03
            com.whatsapp.jid.UserJid r2 = r2.A03
            X.141 r2 = r4.A08(r2)
            if (r2 == 0) goto L_0x00e5
            boolean r2 = r2.A0C()
            if (r2 == 0) goto L_0x00e5
            r5 = 1
        L_0x0102:
            if (r14 != 0) goto L_0x0113
            X.16D r2 = r7.A06
            X.141 r2 = r2.A08(r8)
            if (r2 == 0) goto L_0x0113
            boolean r4 = r2.A0C()
            r2 = 1
            if (r4 != 0) goto L_0x0114
        L_0x0113:
            r2 = 0
        L_0x0114:
            if (r5 != 0) goto L_0x0118
            if (r2 == 0) goto L_0x012c
        L_0x0118:
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x016a
            X.2NJ r1 = new X.2NJ
            r1.<init>()
            java.lang.String r0 = r8.getRawString()
            r1.A00 = r0
        L_0x0129:
            r11.Blw(r1)
        L_0x012c:
            if (r15 == 0) goto L_0x0168
            if (r14 == 0) goto L_0x0162
            X.1dy r5 = r7.A0A
            r4 = r8
            X.147 r4 = (X.AnonymousClass147) r4
            X.AnonymousClass00C.A0D(r4, r3)
            X.0yC r2 = r5.A01
            r1 = 5245(0x147d, float:7.35E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0162
            X.2Of r1 = new X.2Of
            r1.<init>()
            java.lang.String r0 = r4.getRawString()
            r1.A01 = r0
            X.1LW r0 = r5.A00
            com.whatsapp.jid.UserJid r0 = r0.A01(r4)
            if (r0 == 0) goto L_0x0166
            java.lang.String r0 = r0.getRawString()
        L_0x015b:
            r1.A00 = r0
            X.0yW r0 = r5.A02
            r0.Bly(r1)
        L_0x0162:
            r9.A00(r8, r6)
            return
        L_0x0166:
            r0 = 0
            goto L_0x015b
        L_0x0168:
            r6 = 2
            goto L_0x0162
        L_0x016a:
            X.2OB r1 = new X.2OB
            r1.<init>()
            r1.A00 = r10
            java.lang.String r0 = r8.getRawString()
            r1.A01 = r0
            goto L_0x0129
        L_0x0178:
            r5 = 0
            goto L_0x0102
        L_0x017a:
            r13 = 0
            goto L_0x00ba
        L_0x017d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x0087
        L_0x0183:
            r2 = 3
            goto L_0x0188
        L_0x0185:
            r2 = 1
            goto L_0x0188
        L_0x0187:
            r2 = 2
        L_0x0188:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32641dx.A00(X.11F, X.2oi, X.1dx, long):void");
    }
}
