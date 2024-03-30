package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1B5;
import X.AnonymousClass68B;
import X.C009003v;
import X.C023509x;
import X.C106535Kb;
import X.C106545Kf;
import X.C1268665y;
import X.C18000sQ;
import X.C36321k7;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C18000sQ $$this$callbackFlow;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1(StickerPackFlow stickerPackFlow, C023509x r3, C18000sQ r4) {
        super(2, r3);
        this.this$0 = stickerPackFlow;
        this.$$this$callbackFlow = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1(this.this$0, r5, this.$$this$callbackFlow);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            StickerPackFlow stickerPackFlow = this.this$0;
            List<C1268665y> list = stickerPackFlow.A00.A00;
            ArrayList A0J = C36321k7.A0J(list);
            for (C1268665y r3 : list) {
                if (!(r3 instanceof C106545Kf)) {
                    AnonymousClass68B A00 = r3.A00();
                    if (!A00.A08) {
                        AnonymousClass1B5 r1 = stickerPackFlow.A07;
                        String str = A00.A0F;
                        AnonymousClass00C.A08(str);
                        A00.A00 = r1.A01(str);
                    }
                }
                A0J.add(r3);
            }
            StickerPackFlow.A00(new C106535Kb(A0J), this.this$0, this.$$this$callbackFlow);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
