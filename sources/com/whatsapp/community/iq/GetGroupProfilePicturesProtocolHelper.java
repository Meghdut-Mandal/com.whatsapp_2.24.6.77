package com.whatsapp.community.iq;

import X.AnonymousClass040;
import X.AnonymousClass19A;
import X.C005502l;
import X.C20810yC;
import X.C36321k7;
import java.util.concurrent.TimeUnit;

public final class GetGroupProfilePicturesProtocolHelper {
    public static final long A04 = TimeUnit.SECONDS.toMillis(30);
    public final C20810yC A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass040 A02;
    public final C005502l A03;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A00(X.AnonymousClass147 r7, X.AnonymousClass147 r8, java.lang.String r9, java.util.Map r10, X.C023509x r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C21923Acx
            if (r0 == 0) goto L_0x0039
            r4 = r11
            X.Acx r4 = (X.C21923Acx) r4
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
            X.02l r0 = r6.A03
            r11 = 0
            com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3 r5 = new com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.label = r1
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0039:
            X.Acx r4 = new X.Acx
            r4.<init>(r6, r11)
            goto L_0x0012
        L_0x003f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper.A00(X.147, X.147, java.lang.String, java.util.Map, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(X.AnonymousClass147 r11, X.AnonymousClass147 r12, java.util.Map r13, X.C023509x r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C21922Acw
            r4 = r10
            if (r0 == 0) goto L_0x003b
            r9 = r14
            X.Acw r9 = (X.C21922Acw) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003b
            int r2 = r2 - r1
            r9.label = r2
        L_0x0013:
            java.lang.Object r3 = r9.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r9.label
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
            X.19A r0 = r10.A01
            java.lang.String r7 = r0.A09()
            r9.label = r1
            r5 = r11
            r6 = r12
            r8 = r13
            java.lang.Object r0 = r4.A00(r5, r6, r7, r8, r9)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x003b:
            X.Acw r9 = new X.Acw
            r9.<init>(r10, r14)
            goto L_0x0013
        L_0x0041:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper.A01(X.147, X.147, java.util.Map, X.09x):java.lang.Object");
    }

    public GetGroupProfilePicturesProtocolHelper(C20810yC r1, AnonymousClass19A r2, C005502l r3, AnonymousClass040 r4) {
        C36321k7.A18(r4, r3, r1, r2);
        this.A02 = r4;
        this.A03 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
