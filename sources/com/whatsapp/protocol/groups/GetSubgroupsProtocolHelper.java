package com.whatsapp.protocol.groups;

import X.AnonymousClass00C;
import X.AnonymousClass19A;
import X.C005502l;
import X.C19700wN;

public final class GetSubgroupsProtocolHelper {
    public final C19700wN A00;
    public final AnonymousClass19A A01;
    public final C005502l A02;

    public GetSubgroupsProtocolHelper(C19700wN r2, AnonymousClass19A r3, C005502l r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass147 r12, X.AnonymousClass147 r13, java.lang.String r14, X.C023509x r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C82513yp
            r8 = r11
            if (r0 == 0) goto L_0x003d
            r4 = r15
            X.3yp r4 = (X.C82513yp) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.label = r2
        L_0x0013:
            java.lang.Object r3 = r4.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r1) goto L_0x0043
            X.AnonymousClass0AN.A00(r3)
        L_0x0021:
            X.0AK r3 = (X.AnonymousClass0AK) r3
            java.lang.Object r0 = r3.value
            return r0
        L_0x0026:
            X.AnonymousClass0AN.A00(r3)
            X.02l r0 = r11.A02
            r10 = 0
            com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3 r5 = new com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3
            r6 = r12
            r7 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.label = r1
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003d:
            X.3yp r4 = new X.3yp
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0043:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper.A00(X.147, X.147, java.lang.String, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass147 r6, X.AnonymousClass147 r7, X.C023509x r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C82503yo
            if (r0 == 0) goto L_0x0037
            r4 = r8
            X.3yo r4 = (X.C82503yo) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x003d
            X.AnonymousClass0AN.A00(r3)
            X.0AK r3 = (X.AnonymousClass0AK) r3
            java.lang.Object r0 = r3.value
        L_0x0024:
            return r0
        L_0x0025:
            X.AnonymousClass0AN.A00(r3)
            X.19A r0 = r5.A01
            java.lang.String r0 = r0.A09()
            r4.label = r1
            java.lang.Object r0 = r5.A00(r6, r7, r0, r4)
            if (r0 != r2) goto L_0x0024
            return r2
        L_0x0037:
            X.3yo r4 = new X.3yo
            r4.<init>(r5, r8)
            goto L_0x0012
        L_0x003d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper.A01(X.147, X.147, X.09x):java.lang.Object");
    }
}
