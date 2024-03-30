package com.whatsapp.protocol;

import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.C005502l;
import X.C19730wQ;
import X.C19970wo;
import X.C20510xg;
import X.C24381Cf;
import X.C36321k7;

public final class SetGroupDescriptionProtocolHelper {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C24381Cf A02;
    public final C20510xg A03;
    public final AnonymousClass040 A04;
    public final C005502l A05;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass147 r12, java.lang.String r13, java.lang.String r14, X.C023509x r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C82493yn
            r7 = r11
            if (r0 == 0) goto L_0x003d
            r4 = r15
            X.3yn r4 = (X.C82493yn) r4
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
            X.02l r0 = r11.A05
            r10 = 0
            com.whatsapp.protocol.SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2 r5 = new com.whatsapp.protocol.SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2
            r6 = r12
            r9 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.label = r1
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003d:
            X.3yn r4 = new X.3yn
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.SetGroupDescriptionProtocolHelper.A00(X.147, java.lang.String, java.lang.String, X.09x):java.lang.Object");
    }

    public SetGroupDescriptionProtocolHelper(C19730wQ r2, C19970wo r3, C24381Cf r4, C20510xg r5, C005502l r6, AnonymousClass040 r7) {
        C36321k7.A1B(r3, r2, r5, r4, r6);
        AnonymousClass00C.A0D(r7, 6);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r6;
        this.A04 = r7;
    }
}
