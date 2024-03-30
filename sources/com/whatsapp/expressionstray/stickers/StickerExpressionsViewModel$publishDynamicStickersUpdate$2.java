package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass040;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass56P;
import X.AnonymousClass56R;
import X.C009003v;
import X.C009403z;
import X.C023409w;
import X.C023509x;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$publishDynamicStickersUpdate$2", f = "StickerExpressionsViewModel.kt", i = {}, l = {703, 712}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$publishDynamicStickersUpdate$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $giphyTenorResult;
    public final /* synthetic */ List $localResults;
    public final /* synthetic */ List $whatsAppStoreResult;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$publishDynamicStickersUpdate$2(StickerExpressionsViewModel stickerExpressionsViewModel, List list, List list2, List list3, C023509x r6) {
        super(2, r6);
        this.$whatsAppStoreResult = list;
        this.this$0 = stickerExpressionsViewModel;
        this.$giphyTenorResult = list2;
        this.$localResults = list3;
    }

    public final C023509x create(Object obj, C023509x r8) {
        StickerExpressionsViewModel$publishDynamicStickersUpdate$2 stickerExpressionsViewModel$publishDynamicStickersUpdate$2 = new StickerExpressionsViewModel$publishDynamicStickersUpdate$2(this.this$0, this.$whatsAppStoreResult, this.$giphyTenorResult, this.$localResults, r8);
        stickerExpressionsViewModel$publishDynamicStickersUpdate$2.L$0 = obj;
        return stickerExpressionsViewModel$publishDynamicStickersUpdate$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass05L r2;
        Object obj2;
        List list;
        List list2;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass040 r3 = (AnonymousClass040) this.L$0;
            List list3 = this.$whatsAppStoreResult;
            if (list3 != null) {
                this.this$0.A04 = list3;
            }
            List list4 = this.$giphyTenorResult;
            if (list4 != null) {
                this.this$0.A02 = list4;
            }
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            stickerExpressionsViewModel.A03 = this.$localResults;
            StickerExpressionsViewModel.A09(stickerExpressionsViewModel, (Long) null);
            if (!C009403z.A04(r3) || (this.$localResults.isEmpty() && (list = this.this$0.A04) != null && list.isEmpty() && (list2 = this.this$0.A02) != null && list2.isEmpty())) {
                r2 = this.this$0.A0h;
                obj2 = AnonymousClass56R.A00;
                this.label = 1;
            } else {
                StickerExpressionsViewModel stickerExpressionsViewModel2 = this.this$0;
                List list5 = this.$localResults;
                List list6 = stickerExpressionsViewModel2.A04;
                if (list6 == null) {
                    list6 = C023409w.A00;
                }
                List list7 = stickerExpressionsViewModel2.A02;
                if (list7 == null) {
                    list7 = C023409w.A00;
                }
                ArrayList A07 = StickerExpressionsViewModel.A07(stickerExpressionsViewModel2, list5, list6, list7);
                r2 = this.this$0.A0h;
                obj2 = new AnonymousClass56P(A07);
                this.label = 2;
            }
            if (r2.B6N(obj2, this) == r4) {
                return r4;
            }
        } else if (i == 1 || i == 2) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$publishDynamicStickersUpdate$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
