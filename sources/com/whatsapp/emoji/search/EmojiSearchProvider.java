package com.whatsapp.emoji.search;

import X.AnonymousClass00C;
import X.AnonymousClass66P;
import X.AnonymousClass67P;
import X.C005502l;
import X.C104625Am;
import X.C36321k7;

public final class EmojiSearchProvider extends AnonymousClass67P {
    public final C005502l A00;

    public AnonymousClass66P A02(String str) {
        AnonymousClass00C.A0D(str, 0);
        return A00(str, true, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r7, X.C023509x r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1514779r
            if (r0 == 0) goto L_0x0039
            r5 = r8
            X.79r r5 = (X.C1514779r) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0039
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r3) goto L_0x003f
            X.AnonymousClass0AN.A00(r1)
        L_0x0020:
            X.0AK r1 = (X.AnonymousClass0AK) r1
            java.lang.Object r0 = r1.value
            return r0
        L_0x0025:
            X.AnonymousClass0AN.A00(r1)
            X.02l r2 = r6.A00
            r1 = 0
            com.whatsapp.emoji.search.EmojiSearchProvider$searchAwait$2 r0 = new com.whatsapp.emoji.search.EmojiSearchProvider$searchAwait$2
            r0.<init>(r6, r7, r1)
            r5.label = r3
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x0039:
            X.79r r5 = new X.79r
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x003f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.emoji.search.EmojiSearchProvider.A03(java.lang.String, X.09x):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchProvider(C104625Am r1, C005502l r2) {
        super(r1);
        C36321k7.A0x(r1, r2);
        this.A00 = r2;
    }
}
