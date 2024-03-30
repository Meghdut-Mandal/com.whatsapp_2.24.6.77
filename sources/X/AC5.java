package X;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class AC5 implements C22938Ayo, C22942Ays, C22994Azk, C17740rx {
    public final ABE A00;
    public final C20810yC A01;
    public final C202029kv A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 == 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B24(X.C196159Xy r9, X.AnonymousClass3T1 r10) {
        /*
            r8 = this;
            r3 = 0
            X.C36331k8.A1I(r10, r9)
            boolean r1 = r10 instanceof X.AnonymousClass2bT
            X.Ajb r0 = X.C22274Ajb.A00
            X.C1899496f.A00(r0, r1)
            r4 = r10
            X.2bT r4 = (X.AnonymousClass2bT) r4
            java.lang.String r0 = r4.A05
            java.lang.String r0 = X.C36371kC.A0y(r0)
            r7 = 1
            if (r0 == 0) goto L_0x001e
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            r1 = r0 ^ 1
            X.Ajc r0 = X.C22275Ajc.A00
            X.C1899496f.A00(r0, r1)
            long r1 = r4.A00
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            r7 = 0
        L_0x002f:
            X.Ajd r0 = X.C22276Ajd.A00
            X.C1899496f.A00(r0, r7)
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r10.A1T(r0)
            if (r0 == 0) goto L_0x0058
            X.0yC r2 = r8.A01
            X.0yV r1 = X.C21000yV.A01
            r0 = 7357(0x1cbd, float:1.031E-41)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0053
            X.ABE r1 = r8.A00
            X.B7j r0 = new X.B7j
            r0.<init>(r8, r3)
            r1.A00(r0, r9, r10)
            return
        L_0x0053:
            X.1Fu r0 = X.C165567td.A0K(r3)
            throw r0
        L_0x0058:
            X.8NL r1 = r9.A00
            X.8Hz r0 = r1.A00
            X.8SX r0 = (X.AnonymousClass8SX) r0
            X.8RX r0 = r0.eventMessage_
            if (r0 != 0) goto L_0x0064
            X.8RX r0 = X.AnonymousClass8RX.DEFAULT_INSTANCE
        L_0x0064:
            X.8NN r0 = r0.A0q()
            X.8Ja r0 = (X.C171188Ja) r0
            X.AnonymousClass00C.A0B(r0)
            A00(r4, r8, r9, r0)
            X.8Hz r0 = r0.A0R()
            X.8RX r0 = (X.AnonymousClass8RX) r0
            X.8SX r2 = X.AnonymousClass8NN.A0F(r1, r0)
            r2.eventMessage_ = r0
            int r1 = r2.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 | r0
            r2.bitField1_ = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AC5.B24(X.9Xy, X.3T1):void");
    }

    public ArrayList BHq(AnonymousClass3T1 r6) {
        String str;
        AnonymousClass00C.A0D(r6, 0);
        if (r6.A1T(C132986Wc.A0F)) {
            str = "edit";
        } else {
            str = "creation";
        }
        C203399nx[] r2 = new C203399nx[1];
        AnonymousClass1AL[] r1 = new AnonymousClass1AL[1];
        C36341k9.A1L("event_type", str, r1, 0);
        C203399nx.A0H("meta", r1, r2, 0);
        return AnonymousClass03T.A02(r2);
    }

    public static final void A00(AnonymousClass2bT r7, AC5 ac5, C196159Xy r9, C171188Ja r10) {
        String A0y;
        String A0y2;
        String A0y3;
        String A0y4;
        String A0y5 = C36371kC.A0y(r7.A05);
        AnonymousClass8RX r1 = (AnonymousClass8RX) C90524aI.A0H(r10);
        int i = AnonymousClass8RX.CONTEXT_INFO_FIELD_NUMBER;
        A0y5.getClass();
        r1.bitField0_ |= 4;
        r1.name_ = A0y5;
        String str = r7.A03;
        if (!(str == null || (A0y4 = C36371kC.A0y(str)) == null || A0y4.length() == 0)) {
            AnonymousClass8RX r12 = (AnonymousClass8RX) C90524aI.A0H(r10);
            r12.bitField0_ |= 8;
            r12.description_ = A0y4;
        }
        String str2 = r7.A04;
        if (!(str2 == null || (A0y3 = C36371kC.A0y(str2)) == null || A0y3.length() == 0)) {
            AnonymousClass8RX r13 = (AnonymousClass8RX) C90524aI.A0H(r10);
            r13.bitField0_ |= 32;
            r13.joinLink_ = A0y3;
        }
        AnonymousClass3J7 r4 = r7.A01;
        if (r4 != null) {
            AnonymousClass8RX r0 = ((AnonymousClass8SX) r9.A00.A00).eventMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8RX.DEFAULT_INSTANCE;
            }
            C173508Ry r02 = r0.location_;
            if (r02 == null) {
                r02 = C173508Ry.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r02.A0q();
            AnonymousClass3IM r5 = r4.A00;
            if (r5 != null) {
                double d = r5.A00;
                C173508Ry r3 = (C173508Ry) C90524aI.A0H(A0q);
                int i2 = C173508Ry.ACCURACY_IN_METERS_FIELD_NUMBER;
                r3.bitField0_ |= 1;
                r3.degreesLatitude_ = d;
                double d2 = r5.A01;
                C173508Ry r32 = (C173508Ry) C90524aI.A0H(A0q);
                r32.bitField0_ |= 2;
                r32.degreesLongitude_ = d2;
            }
            String str3 = r4.A02;
            if (!(str3 == null || (A0y2 = C36371kC.A0y(str3)) == null || A0y2.length() == 0)) {
                C173508Ry r14 = (C173508Ry) C90524aI.A0H(A0q);
                int i3 = C173508Ry.ACCURACY_IN_METERS_FIELD_NUMBER;
                r14.bitField0_ |= 4;
                r14.name_ = A0y2;
            }
            String str4 = r4.A01;
            if (!(str4 == null || (A0y = C36371kC.A0y(str4)) == null || A0y.length() == 0)) {
                C173508Ry r15 = (C173508Ry) C90524aI.A0H(A0q);
                int i4 = C173508Ry.ACCURACY_IN_METERS_FIELD_NUMBER;
                r15.bitField0_ |= 8;
                r15.address_ = A0y;
            }
            C173508Ry r03 = (C173508Ry) A0q.A0R();
            AnonymousClass8RX r16 = (AnonymousClass8RX) C90524aI.A0H(r10);
            r03.getClass();
            r16.location_ = r03;
            r16.bitField0_ |= 16;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(r7.A00);
        AnonymousClass8RX r33 = (AnonymousClass8RX) C90524aI.A0H(r10);
        r33.bitField0_ |= 64;
        r33.startTime_ = seconds;
        boolean z = r7.A06;
        AnonymousClass8RX r17 = (AnonymousClass8RX) C90524aI.A0H(r10);
        r17.bitField0_ |= 2;
        r17.isCanceled_ = z;
        C80103un r2 = r9.A02;
        byte[] bArr = r9.A0B;
        if (C202029kv.A02(r2, r7, bArr)) {
            AnonymousClass8SG A002 = C196159Xy.A00(ac5.A02, r9, r2, r7, bArr);
            AnonymousClass8RX r18 = (AnonymousClass8RX) C90524aI.A0H(r10);
            A002.getClass();
            r18.contextInfo_ = A002;
            r18.bitField0_ |= 1;
        }
    }

    public AC5(ABE abe, C20810yC r2, C202029kv r3) {
        C36321k7.A0x(r2, abe);
        this.A01 = r2;
        this.A00 = abe;
        this.A02 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.3T1] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r0 > r6) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010d, code lost:
        if ((r0.bitField0_ & 8) != 0) goto L_0x010f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlH(X.AnonymousClass9YL r15) {
        /*
            r14 = this;
            X.8SX r1 = X.AnonymousClass9YL.A00(r15)
            boolean r0 = r1.A0v()
            r7 = 0
            if (r0 == 0) goto L_0x0197
            X.0yC r5 = r14.A01
            r0 = 5563(0x15bb, float:7.795E-42)
            boolean r0 = r5.A0E(r0)
            if (r0 != 0) goto L_0x001c
            r0 = 83
            X.2bK r0 = r15.A02(r0)
            return r0
        L_0x001c:
            X.8RX r2 = r1.eventMessage_
            if (r2 != 0) goto L_0x0022
            X.8RX r2 = X.AnonymousClass8RX.DEFAULT_INSTANCE
        L_0x0022:
            r0 = 6207(0x183f, float:8.698E-42)
            int r6 = r5.A07(r0)
            java.lang.String r0 = r2.name_
            if (r0 == 0) goto L_0x0030
            java.lang.String r7 = X.C36371kC.A0y(r0)
        L_0x0030:
            r9 = r7
            int r0 = r2.bitField0_
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0047
            if (r7 == 0) goto L_0x0047
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0047
            r1 = 1
            if (r0 <= r6) goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            X.Ajf r0 = X.C22278Ajf.A00
            X.C1899196c.A00(r0, r1)
            int r0 = r2.bitField0_
            r0 = r0 & 2
            boolean r1 = X.AnonymousClass000.A1P(r0)
            X.Ajg r0 = X.C22279Ajg.A00
            X.C1899196c.A00(r0, r1)
            int r0 = r2.bitField0_
            r0 = r0 & 64
            boolean r1 = X.AnonymousClass000.A1P(r0)
            X.Ajh r0 = X.C22280Ajh.A00
            X.C1899196c.A00(r0, r1)
            X.3Qa r8 = r15.A0C
            long r10 = r15.A04
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.startTime_
            long r12 = r4.toMillis(r0)
            X.2bT r7 = new X.2bT
            r7.<init>(r8, r9, r10, r12)
            r0 = 6208(0x1840, float:8.699E-42)
            int r1 = r5.A07(r0)
            int r0 = r2.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = r2.description_
            X.AnonymousClass00C.A08(r0)
            java.lang.String r0 = X.C36371kC.A0y(r0)
            int r0 = r0.length()
            if (r0 <= r1) goto L_0x0094
            r3 = 0
        L_0x0094:
            X.Aji r0 = X.C22281Aji.A00
            X.C1899196c.A00(r0, r3)
            java.lang.String r0 = r2.description_
            X.AnonymousClass00C.A08(r0)
            java.lang.String r0 = X.C36371kC.A0y(r0)
            r7.A03 = r0
        L_0x00a4:
            int r0 = r2.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r2.joinLink_
            X.AnonymousClass00C.A08(r0)
            java.lang.String r0 = X.C36371kC.A0y(r0)
            r7.A04 = r0
        L_0x00b5:
            int r0 = r2.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0184
            X.8Ry r0 = r2.location_
            r1 = r0
            if (r0 != 0) goto L_0x00c2
            X.8Ry r0 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x00c2:
            int r0 = r0.bitField0_
            boolean r3 = X.C165577te.A1W(r0)
            if (r1 != 0) goto L_0x00cc
            X.8Ry r1 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x00cc:
            int r0 = r1.bitField0_
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r1 = 0
            if (r3 != r0) goto L_0x00d8
            r1 = 1
        L_0x00d8:
            X.Aje r0 = X.C22277Aje.A00
            X.C1899196c.A00(r0, r1)
            X.8Ry r0 = r2.location_
            r4 = r0
            if (r0 != 0) goto L_0x00e4
            X.8Ry r0 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x00e4:
            int r0 = r0.bitField0_
            boolean r0 = X.C165577te.A1W(r0)
            r5 = 0
            if (r0 != 0) goto L_0x010f
            r0 = r4
            if (r4 != 0) goto L_0x00f2
            X.8Ry r0 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x00f2:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 != 0) goto L_0x010f
            r0 = r4
            if (r4 != 0) goto L_0x00fd
            X.8Ry r0 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x00fd:
            int r0 = r0.bitField0_
            r0 = r0 & 4
            if (r0 != 0) goto L_0x010f
            r0 = r4
            if (r4 != 0) goto L_0x0108
            X.8Ry r0 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x0108:
            int r0 = r0.bitField0_
            r0 = r0 & 8
            r1 = r5
            if (r0 == 0) goto L_0x0182
        L_0x010f:
            r0 = r4
            if (r4 != 0) goto L_0x0114
            X.8Ry r0 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x0114:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0195
            r0 = r4
            if (r4 != 0) goto L_0x011f
            X.8Ry r0 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x011f:
            double r0 = r0.degreesLatitude_
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
        L_0x0125:
            r0 = r4
            if (r4 != 0) goto L_0x012a
            X.8Ry r0 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x012a:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0193
            if (r4 != 0) goto L_0x0134
            X.8Ry r4 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x0134:
            double r0 = r4.degreesLongitude_
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x013a:
            if (r3 == 0) goto L_0x0191
            if (r0 == 0) goto L_0x0191
            double r3 = r3.doubleValue()
            double r0 = r0.doubleValue()
            X.3IM r6 = new X.3IM
            r6.<init>(r3, r0)
        L_0x014b:
            X.8Ry r0 = r2.location_
            r1 = r0
            if (r0 != 0) goto L_0x0152
            X.8Ry r0 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x0152:
            int r0 = r0.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x018f
            if (r1 != 0) goto L_0x015c
            X.8Ry r1 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x015c:
            java.lang.String r0 = r1.name_
            if (r0 == 0) goto L_0x018f
            java.lang.String r3 = X.C36371kC.A0y(r0)
        L_0x0164:
            X.8Ry r0 = r2.location_
            r1 = r0
            if (r0 != 0) goto L_0x016b
            X.8Ry r0 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x016b:
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x017d
            if (r1 != 0) goto L_0x0175
            X.8Ry r1 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x0175:
            java.lang.String r0 = r1.address_
            if (r0 == 0) goto L_0x017d
            java.lang.String r5 = X.C36371kC.A0y(r0)
        L_0x017d:
            X.3J7 r1 = new X.3J7
            r1.<init>(r6, r3, r5)
        L_0x0182:
            r7.A01 = r1
        L_0x0184:
            int r0 = r2.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0197
            boolean r0 = r2.isCanceled_
            r7.A06 = r0
            return r7
        L_0x018f:
            r3 = r5
            goto L_0x0164
        L_0x0191:
            r6 = r5
            goto L_0x014b
        L_0x0193:
            r0 = r5
            goto L_0x013a
        L_0x0195:
            r3 = r5
            goto L_0x0125
        L_0x0197:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AC5.BlH(X.9YL):X.3T1");
    }
}
