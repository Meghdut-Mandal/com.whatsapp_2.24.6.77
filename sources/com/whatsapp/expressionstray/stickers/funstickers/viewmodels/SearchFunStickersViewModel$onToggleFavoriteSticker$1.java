package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {560}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$onToggleFavoriteSticker$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C135066c4 $sticker;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1$1", f = "SearchFunStickersViewModel.kt", i = {0, 1, 1}, l = {563, 569}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "stickerToFavorite", "stickerToastString"}, s = {"L$1", "L$0", "L$1"})
    /* renamed from: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public Object L$0;
        public Object L$1;
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(searchFunStickersViewModel, r2, r5);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x007e, code lost:
            if (r0 == r3) goto L_0x0080;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0081  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                int r0 = r6.label
                r4 = 2
                r2 = 1
                if (r0 == 0) goto L_0x003c
                if (r0 == r2) goto L_0x0030
                if (r0 != r4) goto L_0x0098
                java.lang.Object r5 = r6.L$1
                java.lang.Object r2 = r6.L$0
                X.AnonymousClass0AN.A00(r7)
            L_0x0013:
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r4
                X.1AP r3 = r0.A0N
                java.util.Set r1 = X.C36411kG.A15(r2)
                r0 = 1
                r3.A0F(r1, r0)
            L_0x001f:
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r3 = r4
                X.17Y r2 = r3.A0E
                r1 = 39
                X.3wc r0 = new X.3wc
                r0.<init>(r3, r5, r1)
                r2.A0H(r0)
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x0030:
                java.lang.Object r1 = r6.L$1
                X.6c4 r1 = (X.C135066c4) r1
                java.lang.Object r2 = r6.L$0
                X.6c4 r2 = (X.C135066c4) r2
                X.AnonymousClass0AN.A00(r7)
                goto L_0x0050
            L_0x003c:
                X.AnonymousClass0AN.A00(r7)
                X.6c4 r1 = r2
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r4
                r6.L$0 = r1
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A02(r0, r1, r6)
                if (r0 == r3) goto L_0x0080
                r2 = r1
            L_0x0050:
                r0 = 6
                java.lang.Integer r0 = X.C90524aI.A0a(r0)
                r1.A05 = r0
                X.0fE r5 = new X.0fE
                r5.<init>()
                r0 = 2131889575(0x7f120da7, float:1.9413817E38)
                r5.element = r0
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r4
                X.1AP r0 = r0.A0N
                boolean r1 = r0.A0G(r2)
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r4
                if (r1 != 0) goto L_0x0081
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A0A(r0, r2)
                com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r4
                X.6Ep r0 = r0.A0J
                r6.L$0 = r2
                r6.L$1 = r5
                r6.label = r4
                java.lang.Object r0 = r0.A00(r2, r6)
                if (r0 != r3) goto L_0x0013
            L_0x0080:
                return r3
            L_0x0081:
                X.1AP r4 = r0.A0N
                java.util.Set r3 = X.C36411kG.A15(r2)
                X.0wU r2 = r4.A0N
                r1 = 7
                X.1jE r0 = new X.1jE
                r0.<init>(r4, r3, r1)
                r2.Boy(r0)
                r0 = 2131889576(0x7f120da8, float:1.941382E38)
                r5.element = r0
                goto L_0x001f
            L_0x0098:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$onToggleFavoriteSticker$1(SearchFunStickersViewModel searchFunStickersViewModel, C135066c4 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = searchFunStickersViewModel;
        this.$sticker = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new SearchFunStickersViewModel$onToggleFavoriteSticker$1(this.this$0, this.$sticker, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            C005502l r3 = searchFunStickersViewModel.A0Q;
            final C135066c4 r2 = this.$sticker;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$onToggleFavoriteSticker$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
