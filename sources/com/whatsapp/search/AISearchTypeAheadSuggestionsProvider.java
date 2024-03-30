package com.whatsapp.search;

import X.AnonymousClass040;
import X.AnonymousClass08S;
import X.AnonymousClass7TS;
import X.C001600r;
import X.C005502l;
import X.C165187t1;
import X.C36321k7;
import com.whatsapp.data.repository.MetaAISearchRepository;

public final class AISearchTypeAheadSuggestionsProvider {
    public final AnonymousClass08S A00 = new AnonymousClass08S();
    public final C005502l A01;
    public final AnonymousClass040 A02;
    public final C001600r A03;
    public final MetaAISearchRepository A04;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r6, X.C023509x r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1514979u
            if (r0 == 0) goto L_0x0033
            r4 = r7
            X.79u r4 = (X.C1514979u) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0033
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x0039
            X.AnonymousClass0AN.A00(r3)
        L_0x0020:
            X.6bE r3 = (X.C134556bE) r3
            java.util.List r0 = r3.A00
            return r0
        L_0x0025:
            X.AnonymousClass0AN.A00(r3)
            com.whatsapp.data.repository.MetaAISearchRepository r0 = r5.A04
            r4.label = r1
            java.lang.Object r3 = r0.A00(r6, r4)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0033:
            X.79u r4 = new X.79u
            r4.<init>(r5, r7)
            goto L_0x0012
        L_0x0039:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.AISearchTypeAheadSuggestionsProvider.A00(java.lang.String, X.09x):java.lang.Object");
    }

    public AISearchTypeAheadSuggestionsProvider(C001600r r4, MetaAISearchRepository metaAISearchRepository, C005502l r6, AnonymousClass040 r7) {
        C36321k7.A11(metaAISearchRepository, r6, r7);
        this.A04 = metaAISearchRepository;
        this.A01 = r6;
        this.A02 = r7;
        this.A03 = r4;
        r4.A0A(new C165187t1(new AnonymousClass7TS(this), 38));
    }
}
