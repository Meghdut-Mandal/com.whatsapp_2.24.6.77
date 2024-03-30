package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopLoadingStickers$1$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {532, 534, 535}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$stopLoadingStickers$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $isRequestCancelled;
    public final /* synthetic */ C007403e $it;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$stopLoadingStickers$1$1(SearchFunStickersViewModel searchFunStickersViewModel, C023509x r3, C007403e r4, boolean z) {
        super(2, r3);
        this.$isRequestCancelled = z;
        this.this$0 = searchFunStickersViewModel;
        this.$it = r4;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new SearchFunStickersViewModel$stopLoadingStickers$1$1(this.this$0, r6, this.$it, this.$isRequestCancelled);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r2) goto L_0x0028
            if (r0 == r3) goto L_0x0036
            if (r0 != r4) goto L_0x0044
            X.AnonymousClass0AN.A00(r7)
        L_0x0012:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0015:
            X.AnonymousClass0AN.A00(r7)
            boolean r0 = r6.$isRequestCancelled
            if (r0 == 0) goto L_0x002b
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = r6.this$0
            r6.label = r2
            r0 = 6
            java.lang.Object r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A06(r1, r6, r0)
            if (r0 != r5) goto L_0x002b
            return r5
        L_0x0028:
            X.AnonymousClass0AN.A00(r7)
        L_0x002b:
            X.03e r0 = r6.$it
            r6.label = r3
            java.lang.Object r0 = X.C07570Yj.A00(r6, r0)
            if (r0 != r5) goto L_0x0039
            return r5
        L_0x0036:
            X.AnonymousClass0AN.A00(r7)
        L_0x0039:
            r0 = 150(0x96, double:7.4E-322)
            r6.label = r4
            java.lang.Object r0 = X.C07330Xf.A00(r6, r0)
            if (r0 != r5) goto L_0x0012
            return r5
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopLoadingStickers$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$stopLoadingStickers$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
