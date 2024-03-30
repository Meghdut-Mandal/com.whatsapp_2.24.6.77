package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$startSearch$1", f = "SearchFunStickersViewModel.kt", i = {0, 1}, l = {231, 275}, m = "invokeSuspend", n = {"$this$launch", "finalException"}, s = {"L$0", "L$0"})
public final class SearchFunStickersViewModel$startSearch$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $prompt;
    public final /* synthetic */ boolean $shouldTriggerWithDelay;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$startSearch$1(SearchFunStickersViewModel searchFunStickersViewModel, String str, C023509x r4, boolean z) {
        super(2, r4);
        this.this$0 = searchFunStickersViewModel;
        this.$prompt = str;
        this.$shouldTriggerWithDelay = z;
    }

    public final C023509x create(Object obj, C023509x r6) {
        SearchFunStickersViewModel$startSearch$1 searchFunStickersViewModel$startSearch$1 = new SearchFunStickersViewModel$startSearch$1(this.this$0, this.$prompt, r6, this.$shouldTriggerWithDelay);
        searchFunStickersViewModel$startSearch$1.L$0 = obj;
        return searchFunStickersViewModel$startSearch$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011b, code lost:
        r5 = ((X.AnonymousClass56V) r1).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017d, code lost:
        if (r0 != r4) goto L_0x01e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b5 A[Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4 A[Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf A[Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0 A[Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0101 A[Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111 A[Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x0034
            if (r0 != r6) goto L_0x01f3
            java.lang.Object r3 = r10.L$0
            java.lang.Exception r3 = (java.lang.Exception) r3
            X.AnonymousClass0AN.A00(r11)
        L_0x0013:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r2 = r10.this$0
            X.6NT r0 = r2.A0M
            X.AnonymousClass6NT.A01(r0)
            X.00s r1 = r2.A09
            java.util.List r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A07(r2)
            r1.A0D(r0)
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0
            X.00s r2 = r0.A0A
            java.lang.String r1 = r10.$prompt
            X.56Y r0 = new X.56Y
            r0.<init>(r1, r3)
            r2.A0D(r0)
        L_0x0031:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0034:
            java.lang.Object r7 = r10.L$0
            X.040 r7 = (X.AnonymousClass040) r7
            goto L_0x00a3
        L_0x0039:
            X.AnonymousClass0AN.A00(r11)
            java.lang.Object r7 = r10.L$0
            X.040 r7 = (X.AnonymousClass040) r7
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r8 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.lang.String r0 = r10.$prompt     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r8.A04 = r0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            boolean r0 = X.C90484aE.A1T(r8)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r0 == 0) goto L_0x0089
            java.util.List r5 = r8.A05     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            boolean r0 = X.C36401kF.A1a(r5)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = X.C007103b.A0N(r5)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.5b9 r1 = (X.C110735b9) r1     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
        L_0x005a:
            boolean r0 = r1 instanceof X.AnonymousClass56W     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r0 != 0) goto L_0x0089
            boolean r0 = r1 instanceof X.AnonymousClass56V     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r0 == 0) goto L_0x0079
            X.56V r1 = (X.AnonymousClass56V) r1     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.6bq r0 = r1.A01     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.lang.String r2 = r0.A03     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r2 != 0) goto L_0x006c
            java.lang.String r2 = ""
        L_0x006c:
            int r1 = r1.A00     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.56U r0 = new X.56U     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r0.<init>(r2, r1)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r5.add(r0)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            goto L_0x0079
        L_0x0077:
            r1 = 0
            goto L_0x005a
        L_0x0079:
            r1 = 0
        L_0x007a:
            X.56W r0 = X.AnonymousClass56W.A00     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r5.add(r0)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            int r1 = r1 + 1
            r0 = 4
            if (r1 < r0) goto L_0x007a
            X.00s r0 = r8.A09     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r0.A0C(r5)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
        L_0x0089:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r9 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            boolean r8 = r10.$shouldTriggerWithDelay     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.lang.String r5 = r10.$prompt     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r10.L$0 = r7     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r10.label = r3     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.02l r2 = r9.A0Q     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r1 = 0
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2 r0 = new com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r0.<init>(r9, r5, r1, r8)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.lang.Object r11 = X.AnonymousClass0A2.A00(r10, r2, r0)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r11 != r4) goto L_0x00a6
            goto L_0x01f8
        L_0x00a3:
            X.AnonymousClass0AN.A00(r11)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
        L_0x00a6:
            java.util.List r11 = (java.util.List) r11     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.02h r0 = r7.BAE()     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.C07570Yj.A04(r0)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            boolean r0 = r11.isEmpty()     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r0 == 0) goto L_0x00c4
            r1 = 0
            java.lang.String r0 = r10.$prompt     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.56Y r2 = new X.56Y     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r2.<init>(r0, r1)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
        L_0x00bd:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            boolean r0 = X.C90484aE.A1T(r0)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            goto L_0x00cd
        L_0x00c4:
            java.lang.String r1 = r10.$prompt     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r0 = 0
            X.56Z r2 = new X.56Z     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r2.<init>(r1, r11, r0)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            goto L_0x00bd
        L_0x00cd:
            if (r0 == 0) goto L_0x00d0
            goto L_0x00de
        L_0x00d0:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.lang.String r1 = r0.A03     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r1 == 0) goto L_0x00f2
            X.5La r0 = r0.A0H     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.util.Map r0 = r0.A00     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r0.remove(r1)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            goto L_0x00f2
        L_0x00de:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.00s r1 = r0.A09     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            boolean r0 = r11.isEmpty()     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0131
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.util.List r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A08(r0, r11)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
        L_0x00ef:
            r1.A0D(r0)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
        L_0x00f2:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.00s r0 = r0.A0A     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r0.A0D(r2)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            boolean r0 = X.C90484aE.A1T(r0)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r0 == 0) goto L_0x0105
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.util.List r11 = r0.A05     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
        L_0x0105:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r9 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.util.Iterator r8 = r11.iterator()     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
        L_0x010b:
            boolean r0 = r8.hasNext()     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r0 == 0) goto L_0x0031
            java.lang.Object r1 = r8.next()     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.5b9 r1 = (X.C110735b9) r1     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            boolean r0 = r1 instanceof X.AnonymousClass56V     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r0 == 0) goto L_0x010b
            X.56V r1 = (X.AnonymousClass56V) r1     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.6bq r5 = r1.A01     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.lang.String r3 = r5.A06     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            if (r3 == 0) goto L_0x010b
            X.040 r2 = X.C109325Xd.A00(r9)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r1 = 0
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1 r0 = new com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            r0.<init>(r9, r5, r3, r1)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            X.C36331k8.A1T(r0, r2)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            goto L_0x010b
        L_0x0131:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.util.List r0 = r0.A05     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            java.util.List r0 = X.C007103b.A0Y(r0)     // Catch:{ CancellationException -> 0x0031, Exception -> 0x013a }
            goto L_0x00ef
        L_0x013a:
            r1 = move-exception
            boolean r0 = X.C009403z.A04(r7)
            if (r0 == 0) goto L_0x01e6
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0
            X.00s r0 = r0.A0A
            java.lang.Object r2 = r0.A04()
            X.56a r0 = X.C1035856a.A00
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 != 0) goto L_0x01e6
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0
            X.0wD r0 = r0.A0F
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x01e3
            X.5Ub r3 = new X.5Ub
            r3.<init>()
        L_0x0160:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r5 = r10.this$0
            r10.L$0 = r3
            r10.label = r6
            boolean r0 = r1 instanceof X.AnonymousClass5Uv
            if (r0 == 0) goto L_0x0182
            r2 = 7
            X.5Uv r1 = (X.AnonymousClass5Uv) r1
            int r0 = r1.errorCode
        L_0x016f:
            java.lang.Integer r1 = X.C90524aI.A0a(r0)
        L_0x0173:
            X.6NT r0 = r5.A0M
            java.lang.Object r0 = r0.A02(r1, r10, r2)
        L_0x0179:
            if (r0 == r4) goto L_0x017d
            X.0AJ r0 = X.AnonymousClass0AJ.A00
        L_0x017d:
            if (r0 != r4) goto L_0x01e0
        L_0x017f:
            if (r0 != r4) goto L_0x0013
            return r4
        L_0x0182:
            boolean r0 = r1 instanceof X.C108765Uu
            if (r0 == 0) goto L_0x018d
            r2 = 8
            X.5Uu r1 = (X.C108765Uu) r1
            int r0 = r1.errorCode
            goto L_0x016f
        L_0x018d:
            boolean r0 = r1 instanceof X.C108775Uw
            if (r0 == 0) goto L_0x0198
            r2 = 15
            X.5Uw r1 = (X.C108775Uw) r1
            int r0 = r1.errorCode
            goto L_0x016f
        L_0x0198:
            boolean r0 = r1 instanceof X.C108785Ux
            if (r0 == 0) goto L_0x01a3
            r2 = 12
            X.5Ux r1 = (X.C108785Ux) r1
            int r0 = r1.errorCode
            goto L_0x016f
        L_0x01a3:
            boolean r0 = r1 instanceof X.C108795Uy
            if (r0 == 0) goto L_0x01ae
            r2 = 14
            X.5Uy r1 = (X.C108795Uy) r1
            int r0 = r1.errorCode
            goto L_0x016f
        L_0x01ae:
            boolean r0 = r1 instanceof X.C108805Uz
            if (r0 == 0) goto L_0x01b9
            r2 = 13
            X.5Uz r1 = (X.C108805Uz) r1
            int r0 = r1.errorCode
            goto L_0x016f
        L_0x01b9:
            boolean r0 = r1 instanceof X.AnonymousClass5V1
            if (r0 == 0) goto L_0x01c7
            r2 = 0
            r1 = 16
            X.6NT r0 = r5.A0M
            java.lang.Object r0 = r0.A02(r2, r10, r1)
            goto L_0x0179
        L_0x01c7:
            boolean r0 = r1 instanceof X.C108755Ut
            if (r0 == 0) goto L_0x01d2
            r2 = 9
            X.5Ut r1 = (X.C108755Ut) r1
            java.lang.Integer r1 = r1.errorCode
            goto L_0x0173
        L_0x01d2:
            boolean r0 = r1 instanceof X.C108575Ub
            if (r0 != 0) goto L_0x01e0
            X.6NT r2 = r5.A0M
            r1 = 0
            r0 = 9
            java.lang.Object r0 = r2.A02(r1, r10, r0)
            goto L_0x017d
        L_0x01e0:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            goto L_0x017f
        L_0x01e3:
            r3 = r1
            goto L_0x0160
        L_0x01e6:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r10.this$0
            X.00s r1 = r0.A09
            java.util.List r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A07(r0)
            r1.A0D(r0)
            goto L_0x0031
        L_0x01f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x01f8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$startSearch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$startSearch$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
