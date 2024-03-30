package com.whatsapp.integritysignals.gpia;

import X.AnonymousClass00C;
import X.AnonymousClass12U;
import X.AnonymousClass6OK;
import X.C008903u;
import X.C023509x;
import X.C110515an;
import X.C18750th;
import X.C19710wO;
import X.C200079gZ;
import X.C21390zA;
import X.C26151Jb;
import X.C36321k7;

public final class GpiaRegClientAsyncInit implements C19710wO {
    public final C21390zA A00;
    public final C26151Jb A01;
    public final AnonymousClass6OK A02;
    public final C200079gZ A03;
    public final AnonymousClass12U A04;

    public GpiaRegClientAsyncInit(C21390zA r2, C26151Jb r3, AnonymousClass6OK r4, C200079gZ r5, AnonymousClass12U r6) {
        AnonymousClass00C.A0D(r5, 1);
        C36321k7.A17(r4, r6, r2, 2);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A00 = r2;
    }

    public String BIB() {
        return "GpiaRegClientAsyncInit";
    }

    public /* synthetic */ void BRM() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d A[Catch:{ Exception -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.integritysignals.gpia.GpiaRegClientAsyncInit r10, X.C023509x r11) {
        /*
            boolean r0 = r11 instanceof X.C151797Ay
            if (r0 == 0) goto L_0x0090
            r5 = r11
            X.7Ay r5 = (X.C151797Ay) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0090
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 == r3) goto L_0x003f
            if (r0 != r6) goto L_0x0097
            int r9 = r5.I$2
            int r8 = r5.I$1
            int r7 = r5.I$0
            java.lang.Object r10 = r5.L$0
            com.whatsapp.integritysignals.gpia.GpiaRegClientAsyncInit r10 = (com.whatsapp.integritysignals.gpia.GpiaRegClientAsyncInit) r10
            X.AnonymousClass0AN.A00(r1)
        L_0x002d:
            if (r9 != r8) goto L_0x003a
            X.1Jb r2 = r10.A01
            X.8zz r1 = X.C188648zz.A07
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r2.A00(r1, r0)
        L_0x003a:
            if (r9 == r8) goto L_0x009d
            int r9 = r9 + 1
            goto L_0x0061
        L_0x003f:
            int r9 = r5.I$2
            int r8 = r5.I$1
            int r7 = r5.I$0
            java.lang.Object r10 = r5.L$0
            com.whatsapp.integritysignals.gpia.GpiaRegClientAsyncInit r10 = (com.whatsapp.integritysignals.gpia.GpiaRegClientAsyncInit) r10
            X.AnonymousClass0AN.A00(r1)     // Catch:{ Exception -> 0x007e }
            goto L_0x009d
        L_0x004d:
            X.AnonymousClass0AN.A00(r1)
            X.6OK r1 = r10.A02
            r0 = 6376(0x18e8, float:8.935E-42)
            int r7 = r1.A01(r0)
            r0 = 6375(0x18e7, float:8.933E-42)
            int r8 = r1.A01(r0)
            if (r3 > r8) goto L_0x009d
            r9 = 1
        L_0x0061:
            X.9gZ r2 = r10.A03     // Catch:{ Exception -> 0x007e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x007e }
            java.lang.String r0 = "startup"
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r9)     // Catch:{ Exception -> 0x007e }
            r5.L$0 = r10     // Catch:{ Exception -> 0x007e }
            r5.I$0 = r7     // Catch:{ Exception -> 0x007e }
            r5.I$1 = r8     // Catch:{ Exception -> 0x007e }
            r5.I$2 = r9     // Catch:{ Exception -> 0x007e }
            r5.label = r3     // Catch:{ Exception -> 0x007e }
            java.lang.Object r0 = r2.A01(r0, r5)     // Catch:{ Exception -> 0x007e }
            if (r0 != r4) goto L_0x009d
            goto L_0x009c
        L_0x007e:
            long r0 = (long) r7
            r5.L$0 = r10
            r5.I$0 = r7
            r5.I$1 = r8
            r5.I$2 = r9
            r5.label = r6
            java.lang.Object r0 = X.C07330Xf.A00(r5, r0)
            if (r0 != r4) goto L_0x002d
            return r4
        L_0x0090:
            X.7Ay r5 = new X.7Ay
            r5.<init>(r10, r11)
            goto L_0x0012
        L_0x0097:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x009c:
            return r4
        L_0x009d:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.integritysignals.gpia.GpiaRegClientAsyncInit.A00(com.whatsapp.integritysignals.gpia.GpiaRegClientAsyncInit, X.09x):java.lang.Object");
    }

    public void BRL() {
        if (this.A00.A00 && !this.A04.A03()) {
            Boolean bool = C18750th.A01;
            C110515an.A00(C008903u.A00, new GpiaRegClientAsyncInit$onAsyncInitAnyUserState$1(this, (C023509x) null));
        }
    }
}
