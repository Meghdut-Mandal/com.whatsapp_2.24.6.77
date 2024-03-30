package com.whatsapp.group.iq;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass17X;
import X.AnonymousClass19A;
import X.C005502l;
import X.C19700wN;
import X.C20810yC;
import X.C220412q;
import X.C230717b;
import java.util.concurrent.TimeUnit;

public final class GetGroupInfoProtocolHelper {
    public static final long A09 = TimeUnit.SECONDS.toMillis(30);
    public final C19700wN A00;
    public final C220412q A01;
    public final AnonymousClass17X A02;
    public final C20810yC A03;
    public final C230717b A04;
    public final AnonymousClass19A A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass040 A07;
    public final C005502l A08;

    public GetGroupInfoProtocolHelper(C19700wN r2, C220412q r3, AnonymousClass17X r4, C20810yC r5, C230717b r6, AnonymousClass19A r7, AnonymousClass005 r8, C005502l r9, AnonymousClass040 r10) {
        AnonymousClass00C.A0D(r10, 1);
        AnonymousClass00C.A0D(r9, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r2, 4);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r6, 6);
        AnonymousClass00C.A0D(r7, 7);
        AnonymousClass00C.A0D(r8, 8);
        AnonymousClass00C.A0D(r4, 9);
        this.A07 = r10;
        this.A08 = r9;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.group.iq.GetGroupInfoProtocolHelper r6, X.AnonymousClass147 r7, java.lang.String r8, java.lang.String r9, X.C023509x r10, int r11) {
        /*
            boolean r0 = r10 instanceof X.C82413yf
            if (r0 == 0) goto L_0x0039
            r4 = r10
            X.3yf r4 = (X.C82413yf) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0039
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x003f
            X.AnonymousClass0AN.A00(r3)
        L_0x0020:
            X.0AK r3 = (X.AnonymousClass0AK) r3
            java.lang.Object r0 = r3.value
            return r0
        L_0x0025:
            X.AnonymousClass0AN.A00(r3)
            X.02l r0 = r6.A08
            r10 = 0
            com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3 r5 = new com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.label = r1
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0039:
            X.3yf r4 = new X.3yf
            r4.<init>(r6, r10)
            goto L_0x0012
        L_0x003f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.iq.GetGroupInfoProtocolHelper.A00(com.whatsapp.group.iq.GetGroupInfoProtocolHelper, X.147, java.lang.String, java.lang.String, X.09x, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(X.AnonymousClass147 r11, java.lang.String r12, X.C023509x r13, int r14) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C82403ye
            r4 = r10
            if (r0 == 0) goto L_0x003b
            r8 = r13
            X.3ye r8 = (X.C82403ye) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003b
            int r2 = r2 - r1
            r8.label = r2
        L_0x0013:
            java.lang.Object r3 = r8.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r1 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r1) goto L_0x0041
            X.AnonymousClass0AN.A00(r3)
            X.0AK r3 = (X.AnonymousClass0AK) r3
            java.lang.Object r0 = r3.value
        L_0x0025:
            return r0
        L_0x0026:
            X.AnonymousClass0AN.A00(r3)
            X.19A r0 = r10.A05
            java.lang.String r6 = r0.A09()
            r8.label = r1
            r5 = r11
            r7 = r12
            r9 = r14
            java.lang.Object r0 = A00(r4, r5, r6, r7, r8, r9)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x003b:
            X.3ye r8 = new X.3ye
            r8.<init>(r10, r13)
            goto L_0x0013
        L_0x0041:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.iq.GetGroupInfoProtocolHelper.A01(X.147, java.lang.String, X.09x, int):java.lang.Object");
    }
}
