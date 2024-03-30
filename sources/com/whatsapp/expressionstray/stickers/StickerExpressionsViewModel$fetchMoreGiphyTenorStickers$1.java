package com.whatsapp.expressionstray.stickers;

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
import X.C07330Xf;
import X.C36321k7;
import X.C36441kJ;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {658}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $lastResult;
    public final /* synthetic */ List $localResults;
    public final /* synthetic */ String $searchText;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {660, 661}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            return new AnonymousClass1(str, list, list2, r8);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                long A0B = C36441kJ.A0B(StickerExpressionsViewModel.this.A0E.A00, 5423);
                this.label = 1;
                if (C07330Xf.A00(this, A0B) == r5) {
                    return r5;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else if (i == 2) {
                try {
                    AnonymousClass0AN.A00(obj);
                } catch (Exception e) {
                    C36321k7.A1J(e, "StickerExpressionsViewModel/fetchMoreGiphyTenorStickers/error = ", AnonymousClass000.A0u());
                }
                return AnonymousClass0AJ.A00;
            } else {
                throw AnonymousClass000.A0e();
            }
            StickerExpressionsViewModel stickerExpressionsViewModel = StickerExpressionsViewModel.this;
            List list = list;
            String str = str;
            List list2 = list2;
            this.label = 2;
            if (StickerExpressionsViewModel.A04(stickerExpressionsViewModel, str, list, list2, this) == r5) {
                return r5;
            }
            return AnonymousClass0AJ.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1(StickerExpressionsViewModel stickerExpressionsViewModel, String str, List list, List list2, C023509x r6) {
        super(2, r6);
        this.this$0 = stickerExpressionsViewModel;
        this.$localResults = list;
        this.$searchText = str;
        this.$lastResult = list2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1(this.this$0, this.$searchText, this.$localResults, this.$lastResult, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C005502l r0 = stickerExpressionsViewModel.A0c;
            final List list = this.$localResults;
            final String str = this.$searchText;
            final List list2 = this.$lastResult;
            AnonymousClass1 r3 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
