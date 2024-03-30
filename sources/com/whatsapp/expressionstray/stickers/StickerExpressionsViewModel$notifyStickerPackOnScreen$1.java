package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass566;
import X.AnonymousClass567;
import X.AnonymousClass68B;
import X.C009003v;
import X.C023509x;
import X.C125385zp;
import X.C129156Fn;
import X.C162907pL;
import X.C18000sQ;
import X.C36361kB;
import X.C36381kD;
import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$notifyStickerPackOnScreen$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$notifyStickerPackOnScreen$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C125385zp $section;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$notifyStickerPackOnScreen$1(C125385zp r2, StickerExpressionsViewModel stickerExpressionsViewModel, C023509x r4) {
        super(2, r4);
        this.$section = r2;
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new StickerExpressionsViewModel$notifyStickerPackOnScreen$1(this.$section, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass68B r7;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C125385zp r1 = this.$section;
            if (((r1 instanceof AnonymousClass566) || (r1 instanceof AnonymousClass567)) && this.this$0.A0M.A0E(6548)) {
                C125385zp r12 = this.$section;
                if (r12 instanceof AnonymousClass566) {
                    r7 = ((AnonymousClass566) r12).A00;
                } else if (r12 instanceof AnonymousClass567) {
                    r7 = ((AnonymousClass567) r12).A00;
                }
                Iterator A0s = C36361kB.A0s(this.this$0.A0R);
                while (A0s.hasNext()) {
                    C129156Fn r13 = (C129156Fn) A0s.next();
                    if (r13 instanceof C162907pL) {
                        C162907pL r14 = (C162907pL) r13;
                        if (1 - r14.A02 == 0) {
                            StickerPackFlow stickerPackFlow = (StickerPackFlow) r14.A01;
                            C36381kD.A1R(stickerPackFlow.A0D, new StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1(r7, stickerPackFlow, (C023509x) null, (C18000sQ) r14.A00), stickerPackFlow.A0E);
                        }
                    }
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$notifyStickerPackOnScreen$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
