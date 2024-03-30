package X;

/* renamed from: X.5af  reason: invalid class name and case insensitive filesystem */
public abstract class C110435af {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0076, code lost:
        if ((r3 & 24576) == 16384) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
        if ((r3 & 384) == 256) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a4, code lost:
        if ((r27 & 48) == 32) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C161337ma r21, X.C161267mT r22, com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r23, X.AnonymousClass1JI r24, X.AnonymousClass00S r25, X.C006302t r26, int r27, int r28, boolean r29) {
        /*
            r13 = r22
            r12 = 0
            r7 = r23
            X.AnonymousClass00C.A0D(r7, r12)
            r0 = 1
            r4 = r26
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = 2
            r5 = r25
            X.AnonymousClass00C.A0D(r5, r0)
            r0 = -2028517032(0xffffffff87174958, float:-1.1381531E-34)
            r8 = r21
            r8.Bun(r0)
            r0 = r28 & 8
            if (r0 == 0) goto L_0x0022
            X.6fu r13 = X.C161267mT.A00
        L_0x0022:
            X.00r r2 = r7.A06
            r1 = 0
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1 r0 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1
            r0.<init>(r2, r1)
            X.0nA r1 = new X.0nA
            r1.<init>(r0)
            X.09w r0 = X.C023409w.A00
            r16 = 0
            X.7n5 r11 = X.AnonymousClass5WE.A00(r8, r0, r1)
            androidx.compose.foundation.lazy.LazyListState r1 = X.C129726If.A00(r8)
            r0 = -1250452478(0xffffffffb5779c02, float:-9.224169E-7)
            r8.Bum(r0)
            r6 = r24
            if (r24 == 0) goto L_0x004c
            r2 = 12
            r0 = 560(0x230, float:7.85E-43)
            X.AnonymousClass6H0.A00(r1, r8, r6, r2, r0)
        L_0x004c:
            r10 = r8
            X.6fF r10 = (X.C136916fF) r10
            X.C136916fF.A0M(r10, r12)
            androidx.compose.foundation.layout.FillElement r0 = X.C131986Rq.A00
            X.7mT r22 = r13.Bva(r0)
            r0 = -1250452188(0xffffffffb5779d24, float:-9.224334E-7)
            r8.Bum(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r3 = r27
            r0 = r0 & r27
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r9 = 16384(0x4000, float:2.2959E-41)
            r2 = r29
            if (r0 <= r9) goto L_0x0073
            boolean r0 = r8.B2g(r2)
            if (r0 != 0) goto L_0x0078
        L_0x0073:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            r15 = 0
            if (r0 != r9) goto L_0x0079
        L_0x0078:
            r15 = 1
        L_0x0079:
            r0 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r0 <= r9) goto L_0x0087
            boolean r0 = r8.B2h(r5)
            if (r0 != 0) goto L_0x008c
        L_0x0087:
            r0 = r3 & 384(0x180, float:5.38E-43)
            r14 = 0
            if (r0 != r9) goto L_0x008d
        L_0x008c:
            r14 = 1
        L_0x008d:
            r15 = r15 | r14
            boolean r0 = r8.B2f(r11)
            r15 = r15 | r0
            r0 = r27 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r9 = 32
            if (r0 <= r9) goto L_0x00a1
            boolean r0 = r8.B2h(r4)
            if (r0 != 0) goto L_0x00a6
        L_0x00a1:
            r0 = r27 & 48
            r14 = 0
            if (r0 != r9) goto L_0x00a7
        L_0x00a6:
            r14 = 1
        L_0x00a7:
            r15 = r15 | r14
            java.lang.Object r0 = r8.BnZ()
            if (r15 != 0) goto L_0x00b2
            java.lang.Object r9 = X.C129736Ig.A00
            if (r0 != r9) goto L_0x00ba
        L_0x00b2:
            X.7VB r0 = new X.7VB
            r0.<init>(r11, r5, r4, r2)
            r10.A0R(r0)
        L_0x00ba:
            X.02t r0 = (X.C006302t) r0
            X.C136916fF.A0M(r10, r12)
            r25 = 252(0xfc, float:3.53E-43)
            r18 = r16
            r21 = r16
            r26 = 0
            r27 = 0
            r24 = 0
            r17 = r16
            r19 = r1
            r20 = r8
            r23 = r0
            X.C109025Vz.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.6fO r1 = r8.B6Z()
            if (r1 == 0) goto L_0x00f1
            X.7Z1 r0 = new X.7Z1
            r21 = r0
            r22 = r13
            r23 = r7
            r24 = r6
            r25 = r5
            r26 = r4
            r27 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r1.A06 = r0
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110435af.A00(X.7ma, X.7mT, com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel, X.1JI, X.00S, X.02t, int, int, boolean):void");
    }
}
