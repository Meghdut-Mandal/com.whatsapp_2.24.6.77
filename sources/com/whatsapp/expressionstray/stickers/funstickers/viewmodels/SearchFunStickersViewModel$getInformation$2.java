package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2", f = "SearchFunStickersViewModel.kt", i = {3, 4, 4, 5}, l = {452, 459, 460, 462, 467, 481}, m = "invokeSuspend", n = {"result", "response", "funStickerModel", "response"}, s = {"L$0", "L$0", "L$3", "L$0"})
public final class SearchFunStickersViewModel$getInformation$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $prompt;
    public final /* synthetic */ boolean $shouldTriggerWithDelay;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$getInformation$2(SearchFunStickersViewModel searchFunStickersViewModel, String str, C023509x r4, boolean z) {
        super(2, r4);
        this.$shouldTriggerWithDelay = z;
        this.this$0 = searchFunStickersViewModel;
        this.$prompt = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new SearchFunStickersViewModel$getInformation$2(this.this$0, this.$prompt, r6, this.$shouldTriggerWithDelay);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r15.this$0.A0A.A0C(new X.AnonymousClass56X(r15.$prompt));
        r0 = r15.this$0;
        r15.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A05(r0, r15) != r1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r8 = r15.this$0.A0L;
        r7 = r15.$prompt;
        r15.label = 3;
        r6 = X.C36411kG.A16(r15);
        r8.A01.B4Z(X.C113245fE.A00, X.C146046uw.A06, new X.C145916uj(r8, r7), (java.lang.Long) null).Blp(new X.C165557tc(r6, 1));
        r7 = r6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (r7 != r1) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        r4 = (java.util.List) r7;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if ((r4 instanceof java.util.Collection) == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        if (r4.isEmpty() == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
        r6 = r15.this$0;
        r3 = r4.size();
        r15.L$0 = r4;
        r15.label = 4;
        r9 = r6.A0M;
        r11 = (long) r3;
        r13 = (long) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r9.A04 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a6, code lost:
        if (X.AnonymousClass0A2.A00(r15, r9.A0C, new com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2(r9, (X.C023509x) null, r11, r13)) != r1) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        r6 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        if (r6.hasNext() == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r3 = X.C90524aI.A0j(((X.C134936bq) r6.next()).A06).getPath();
        X.AnonymousClass00C.A08(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cc, code lost:
        if (r3.endsWith(".webp") == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ce, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d0, code lost:
        if (r5 >= 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        throw X.C36371kC.A0s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        r1 = X.AnonymousClass001.A0I();
        r0 = r15.this$0;
        r0.A00++;
        r3 = r4.iterator();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f2, code lost:
        if (r3.hasNext() == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f4, code lost:
        r9 = (X.C134936bq) r3.next();
        r8 = r0.A0M;
        r7 = r9.A00;
        r6 = r9.A01;
        r15.L$0 = r1;
        r15.L$1 = r0;
        r15.L$2 = r3;
        r15.L$3 = r9;
        r15.label = 5;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0116, code lost:
        if (X.AnonymousClass0A2.A00(r15, r8.A0C, new com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2(r8, r7, r6, (X.C023509x) null)) != r2) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0118, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012c, code lost:
        r1.add(new X.AnonymousClass56V(r9, (X.C135066c4) null, r9.A03, r0.A00, false));
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013a, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0146, code lost:
        if (r15.this$0.A0M.A0A.A0E(7186) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0148, code lost:
        r0 = r1.isEmpty();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014c, code lost:
        if (r0 == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014e, code lost:
        r3 = r15.this$0;
        r15.L$0 = r1;
        r15.L$1 = null;
        r15.L$2 = null;
        r15.L$3 = null;
        r15.label = 6;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0163, code lost:
        if (r3.A0M.A02((java.lang.Integer) null, r15, 10) != r2) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0165, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016b, code lost:
        X.AnonymousClass6NT.A01(r15.this$0.A0M);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0172, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (X.C07330Xf.A00(r15, r3) == r1) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r7 = r16
            X.0AO r1 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r2 = r1
            int r0 = r15.label
            r5 = 2
            r6 = 1
            r10 = 0
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x002c;
                case 2: goto L_0x0048;
                case 3: goto L_0x0077;
                case 4: goto L_0x00d7;
                case 5: goto L_0x0119;
                case 6: goto L_0x0166;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r7)
            boolean r0 = r15.$shouldTriggerWithDelay
            if (r0 == 0) goto L_0x002f
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            X.0yC r3 = r0.A0I
            r0 = 4614(0x1206, float:6.466E-42)
            long r3 = X.C36441kJ.A0B(r3, r0)
            r15.label = r6
            java.lang.Object r0 = X.C07330Xf.A00(r15, r3)
            if (r0 != r1) goto L_0x002f
        L_0x002b:
            return r1
        L_0x002c:
            X.AnonymousClass0AN.A00(r7)
        L_0x002f:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            X.00s r4 = r0.A0A
            java.lang.String r3 = r15.$prompt
            X.56X r0 = new X.56X
            r0.<init>(r3)
            r4.A0C(r0)
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            r15.label = r5
            java.lang.Object r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A05(r0, r15)
            if (r0 != r1) goto L_0x004b
            return r1
        L_0x0048:
            X.AnonymousClass0AN.A00(r7)
        L_0x004b:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            X.5qA r8 = r0.A0L
            java.lang.String r7 = r15.$prompt
            r0 = 3
            r15.label = r0
            X.0iM r6 = X.C36411kG.A16(r15)
            X.1UG r5 = r8.A01
            X.6P0 r4 = X.C113245fE.A00
            X.6uj r3 = new X.6uj
            r3.<init>(r8, r7)
            X.5bS r0 = X.C146046uw.A06
            X.6uw r4 = r5.B4Z(r4, r0, r3, r10)
            r3 = 1
            X.7tc r0 = new X.7tc
            r0.<init>(r6, r3)
            r4.Blp(r0)
            java.lang.Object r7 = r6.A00()
            if (r7 != r1) goto L_0x007a
            return r1
        L_0x0077:
            X.AnonymousClass0AN.A00(r7)
        L_0x007a:
            r4 = r7
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r4 instanceof java.util.Collection
            r5 = 0
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00a9
        L_0x0088:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r6 = r15.this$0
            int r3 = r4.size()
            r15.L$0 = r4
            r0 = 4
            r15.label = r0
            X.6NT r9 = r6.A0M
            long r11 = (long) r3
            long r13 = (long) r5
            java.lang.Long r0 = r9.A04
            if (r0 == 0) goto L_0x00de
            X.02l r0 = r9.A0C
            com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2 r8 = new com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2
            r8.<init>(r9, r10, r11, r13)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r15, r0, r8)
            if (r0 != r1) goto L_0x00de
            return r1
        L_0x00a9:
            java.util.Iterator r6 = r4.iterator()
        L_0x00ad:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r6.next()
            X.6bq r0 = (X.C134936bq) r0
            java.lang.String r0 = r0.A06
            java.net.URL r0 = X.C90524aI.A0j(r0)
            java.lang.String r3 = r0.getPath()
            X.AnonymousClass00C.A08(r3)
            java.lang.String r0 = ".webp"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x00ad
            int r5 = r5 + 1
            if (r5 >= 0) goto L_0x00ad
            java.lang.RuntimeException r0 = X.C36371kC.A0s()
            throw r0
        L_0x00d7:
            java.lang.Object r4 = r15.L$0
            java.util.List r4 = (java.util.List) r4
            X.AnonymousClass0AN.A00(r7)
        L_0x00de:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            int r3 = r0.A00
            int r3 = r3 + 1
            r0.A00 = r3
            java.util.Iterator r3 = r4.iterator()
        L_0x00ee:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x013a
            java.lang.Object r9 = r3.next()
            X.6bq r9 = (X.C134936bq) r9
            X.6NT r8 = r0.A0M
            java.lang.Long r7 = r9.A00
            java.lang.Long r6 = r9.A01
            r15.L$0 = r1
            r15.L$1 = r0
            r15.L$2 = r3
            r15.L$3 = r9
            r4 = 5
            r15.label = r4
            X.02l r5 = r8.A0C
            com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2 r4 = new com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2
            r4.<init>(r8, r7, r6, r10)
            java.lang.Object r4 = X.AnonymousClass0A2.A00(r15, r5, r4)
            if (r4 != r2) goto L_0x012c
            return r2
        L_0x0119:
            java.lang.Object r9 = r15.L$3
            X.6bq r9 = (X.C134936bq) r9
            java.lang.Object r3 = r15.L$2
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r0 = r15.L$1
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = (com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r0
            java.lang.Object r1 = r15.L$0
            java.util.List r1 = (java.util.List) r1
            X.AnonymousClass0AN.A00(r7)
        L_0x012c:
            java.lang.String r11 = r9.A03
            int r12 = r0.A00
            r13 = 0
            X.56V r8 = new X.56V
            r8.<init>(r9, r10, r11, r12, r13)
            r1.add(r8)
            goto L_0x00ee
        L_0x013a:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            X.6NT r0 = r0.A0M
            X.0yC r3 = r0.A0A
            r0 = 7186(0x1c12, float:1.007E-41)
            boolean r0 = r3.A0E(r0)
            if (r0 != 0) goto L_0x002b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x002b
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r3 = r15.this$0
            r15.L$0 = r1
            r15.L$1 = r10
            r15.L$2 = r10
            r15.L$3 = r10
            r0 = 6
            r15.label = r0
            X.6NT r3 = r3.A0M
            r0 = 10
            java.lang.Object r0 = r3.A02(r10, r15, r0)
            if (r0 != r2) goto L_0x016b
            return r2
        L_0x0166:
            java.lang.Object r1 = r15.L$0
            X.AnonymousClass0AN.A00(r7)
        L_0x016b:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            X.6NT r0 = r0.A0M
            X.AnonymousClass6NT.A01(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$getInformation$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
