package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass68B;
import X.C009003v;
import X.C023509x;
import X.C106535Kb;
import X.C1268665y;
import X.C18000sQ;
import X.C36321k7;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1", f = "StickerPackFlow.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C18000sQ $$this$callbackFlow;
    public final /* synthetic */ AnonymousClass68B $stickerPack;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1(AnonymousClass68B r2, StickerPackFlow stickerPackFlow, C023509x r4, C18000sQ r5) {
        super(2, r4);
        this.this$0 = stickerPackFlow;
        this.$stickerPack = r2;
        this.$$this$callbackFlow = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1(this.$stickerPack, this.this$0, r6, this.$$this$callbackFlow);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            StickerPackFlow stickerPackFlow = this.this$0;
            AnonymousClass68B r0 = this.$stickerPack;
            this.label = 1;
            obj = stickerPackFlow.A02(r0, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        List<C1268665y> list = this.this$0.A00.A00;
        AnonymousClass68B r5 = this.$stickerPack;
        ArrayList A0J = C36321k7.A0J(list);
        for (C1268665y r2 : list) {
            A0J.add(AnonymousClass00C.A0J(r2.A01(), r5.A0F) ? obj : r2);
        }
        StickerPackFlow.A00(new C106535Kb(A0J), this.this$0, this.$$this$callbackFlow);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
