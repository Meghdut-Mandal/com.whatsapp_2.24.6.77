package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass56Q;
import X.C009003v;
import X.C023509x;
import X.C1034755o;
import X.C110725b8;
import X.C90464aC;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onAvatarUpsellCloseTap$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onAvatarUpsellCloseTap$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onAvatarUpsellCloseTap$1(StickerExpressionsViewModel stickerExpressionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new StickerExpressionsViewModel$onAvatarUpsellCloseTap$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerExpressionsViewModel$onAvatarUpsellCloseTap$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A0P.A03((Boolean) null, 11);
            this.this$0.A0O.A02();
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C110725b8 r4 = (C110725b8) stickerExpressionsViewModel.A0h.getValue();
            if (r4 instanceof AnonymousClass56Q) {
                AnonymousClass56Q r42 = (AnonymousClass56Q) r4;
                List list = r42.A01;
                int i = 0;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next() instanceof C1034755o) {
                        C90464aC.A16(stickerExpressionsViewModel, r42, list, i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
