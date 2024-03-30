package X;

/* renamed from: X.6o4  reason: invalid class name and case insensitive filesystem */
public class C141936o4 implements AnonymousClass7fB {
    public final /* synthetic */ AnonymousClass6Um A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;

    public C141936o4(AnonymousClass6Um r1, Integer num, Integer num2, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = num;
        this.A01 = num2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BxL(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 35
            if (r7 == r0) goto L_0x02b0
            r0 = 36
            if (r7 == r0) goto L_0x0274
            r0 = 38
            if (r7 == r0) goto L_0x025c
            r0 = 63
            if (r7 == r0) goto L_0x0244
            java.lang.String r1 = "auto"
            switch(r7) {
                case 40: goto L_0x0199;
                case 41: goto L_0x01b1;
                case 42: goto L_0x01c9;
                case 43: goto L_0x020b;
                case 44: goto L_0x0223;
                case 45: goto L_0x022e;
                case 46: goto L_0x0239;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r7) {
                case 48: goto L_0x0089;
                case 49: goto L_0x0093;
                case 50: goto L_0x009e;
                case 51: goto L_0x00a9;
                case 52: goto L_0x00e5;
                case 53: goto L_0x0121;
                case 54: goto L_0x015d;
                default: goto L_0x0018;
            }
        L_0x0018:
            switch(r7) {
                case 65: goto L_0x028d;
                case 66: goto L_0x005d;
                case 67: goto L_0x0073;
                case 68: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r0 = 0
            return r0
        L_0x001d:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.C90514aH.A1Z(r8)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x003e
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A00(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 7
            goto L_0x02a5
        L_0x003e:
            boolean r0 = r8.equals(r1)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A01(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 6
            goto L_0x02a5
        L_0x005d:
            boolean r0 = r6.A03     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x006b
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = r6.A02     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A06(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x006b:
            java.lang.String r1 = "Ignoring 'start' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.AnonymousClass6RS.A01(r0, r1)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x0073:
            boolean r0 = r6.A03     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x0081
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A06(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x0081:
            java.lang.String r1 = "Ignoring 'top' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.AnonymousClass6RS.A01(r0, r1)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x0089:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A05(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x0093:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = r6.A02     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A05(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x009e:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A05(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x00a9:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.C90514aH.A1Z(r8)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x00cb
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A00(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 19
            goto L_0x02a5
        L_0x00cb:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A01(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 18
            goto L_0x02a5
        L_0x00e5:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.C90514aH.A1Z(r8)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x0107
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A00(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 12
            goto L_0x02a5
        L_0x0107:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A01(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 11
            goto L_0x02a5
        L_0x0121:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.C90514aH.A1Z(r8)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x0143
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A00(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 17
            goto L_0x02a5
        L_0x0143:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A01(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 16
            goto L_0x02a5
        L_0x015d:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.C90514aH.A1Z(r8)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x017f
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A00(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 10
            goto L_0x02a5
        L_0x017f:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A01(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 9
            goto L_0x02a5
        L_0x0199:
            boolean r0 = r6.A03     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x01a8
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = r6.A01     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A06(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x01a8:
            java.lang.String r1 = "Ignoring 'end' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.AnonymousClass6RS.A01(r0, r1)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x01b1:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.C36441kJ.A03(r8)     // Catch:{ 5R5 -> 0x0314 }
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 1
            goto L_0x02a5
        L_0x01c9:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.C90514aH.A1Z(r8)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x01eb
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A00(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 14
            goto L_0x02a5
        L_0x01eb:
            boolean r0 = r8.equals(r1)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.AnonymousClass6Y7.A01(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 13
            goto L_0x02a5
        L_0x020b:
            boolean r0 = r6.A03     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x021a
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A06(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x021a:
            java.lang.String r1 = "Ignoring 'left' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.AnonymousClass6RS.A01(r0, r1)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x0223:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = X.C023109s.A0G     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A05(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x022e:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = r6.A01     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A05(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x0239:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A05(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x0244:
            boolean r0 = r6.A03     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x0253
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A06(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x0253:
            java.lang.String r1 = "Ignoring 'right' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.AnonymousClass6RS.A01(r0, r1)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x025c:
            boolean r0 = r6.A03     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x026b
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.Integer r0 = X.C023109s.A0G     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            X.C133296Xs.A06(r1, r0, r8)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x026b:
            java.lang.String r1 = "Ignoring 'bottom' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.AnonymousClass6RS.A01(r0, r1)     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x0274:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.C36441kJ.A03(r8)     // Catch:{ 5R5 -> 0x0314 }
            boolean r0 = X.AnonymousClass6Um.A01(r5)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.AnonymousClass6Um.A02(r1)     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
            r0 = 22
            goto L_0x02a5
        L_0x028d:
            X.6Um r1 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            float r5 = X.C36441kJ.A03(r8)     // Catch:{ 5R5 -> 0x0314 }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x001b
            r0 = 2
            X.AnonymousClass6Um.A00(r1, r0)     // Catch:{ 5R5 -> 0x0314 }
            float[] r4 = r1.A01     // Catch:{ 5R5 -> 0x0314 }
            int r3 = r1.A00     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 5R5 -> 0x0314 }
        L_0x02a5:
            float r0 = (float) r0     // Catch:{ 5R5 -> 0x0314 }
            r4[r3] = r0     // Catch:{ 5R5 -> 0x0314 }
            int r0 = r2 + 1
            r1.A00 = r0     // Catch:{ 5R5 -> 0x0314 }
            r4[r2] = r5     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x02b0:
            X.6Um r4 = r6.A00     // Catch:{ 5R5 -> 0x0314 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 5R5 -> 0x0314 }
            int r0 = r8.hashCode()     // Catch:{ 5R5 -> 0x0314 }
            switch(r0) {
                case -1881872635: goto L_0x02dd;
                case -1720785339: goto L_0x02e8;
                case -1364013995: goto L_0x02f3;
                case 1384876188: goto L_0x02fe;
                case 1744442261: goto L_0x0309;
                default: goto L_0x02bb;
            }     // Catch:{ 5R5 -> 0x0314 }
        L_0x02bb:
            X.5So r5 = X.C108195So.AUTO     // Catch:{ 5R5 -> 0x0314 }
        L_0x02bd:
            X.5So r0 = X.AnonymousClass6Um.A02     // Catch:{ 5R5 -> 0x0314 }
            if (r5 == r0) goto L_0x001b
            float[] r3 = X.AnonymousClass6Um.A02(r4)     // Catch:{ 5R5 -> 0x0314 }
            int r2 = r4.A00     // Catch:{ 5R5 -> 0x0314 }
            int r1 = r2 + 1
            r4.A00 = r1     // Catch:{ 5R5 -> 0x0314 }
            r0 = 20
            float r0 = (float) r0     // Catch:{ 5R5 -> 0x0314 }
            r3[r2] = r0     // Catch:{ 5R5 -> 0x0314 }
            int r0 = r1 + 1
            r4.A00 = r0     // Catch:{ 5R5 -> 0x0314 }
            int r0 = r5.ordinal()     // Catch:{ 5R5 -> 0x0314 }
            float r0 = (float) r0     // Catch:{ 5R5 -> 0x0314 }
            r3[r1] = r0     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x001b
        L_0x02dd:
            java.lang.String r0 = "stretch"
            boolean r0 = r8.equals(r0)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x02bb
            X.5So r5 = X.C108195So.STRETCH     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x02bd
        L_0x02e8:
            java.lang.String r0 = "baseline"
            boolean r0 = r8.equals(r0)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x02bb
            X.5So r5 = X.C108195So.BASELINE     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x02bd
        L_0x02f3:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x02bb
            X.5So r5 = X.C108195So.CENTER     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x02bd
        L_0x02fe:
            java.lang.String r0 = "flex_start"
            boolean r0 = r8.equals(r0)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x02bb
            X.5So r5 = X.C108195So.FLEX_START     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x02bd
        L_0x0309:
            java.lang.String r0 = "flex_end"
            boolean r0 = r8.equals(r0)     // Catch:{ 5R5 -> 0x0314 }
            if (r0 == 0) goto L_0x02bb
            X.5So r5 = X.C108195So.FLEX_END     // Catch:{ 5R5 -> 0x0314 }
            goto L_0x02bd
        L_0x0314:
            r3 = move-exception
            java.lang.String r2 = "Error parsing flexbox style value"
            java.lang.String r1 = "BloksFlexLayoutProvider"
            r0 = 0
            X.AnonymousClass6RS.A00(r0, r1, r2, r3)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141936o4.BxL(int, java.lang.Object):boolean");
    }
}
