package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C05560Qe;
import X.C106535Kb;
import X.C111625ca;
import X.C164567s1;
import X.C23871Ae;
import X.C36321k7;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C90484aE;
import X.C90494aF;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$2", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$2(StickerPackFlow stickerPackFlow, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerPackFlow;
    }

    public final C023509x create(Object obj, C023509x r4) {
        StickerPackFlow$packFlow$2 stickerPackFlow$packFlow$2 = new StickerPackFlow$packFlow$2(this.this$0, r4);
        stickerPackFlow$packFlow$2.L$0 = obj;
        return stickerPackFlow$packFlow$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C111625ca r2 = (C111625ca) this.L$0;
            if (this.this$0.A01.A0E(6970) && (r2 instanceof C106535Kb)) {
                Map A00 = C05560Qe.A00(new C164567s1(((C106535Kb) r2).A00, 3));
                LinkedHashMap A1G = C36431kI.A1G();
                Iterator A0y = AnonymousClass000.A0y(A00);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    if (C90484aE.A0G(A11) > 1) {
                        C36411kG.A1T(A1G, A11);
                    }
                }
                if (!A1G.isEmpty()) {
                    StickerPackFlow stickerPackFlow = this.this$0;
                    Iterator A0y2 = AnonymousClass000.A0y(A1G);
                    while (A0y2.hasNext()) {
                        Map.Entry A112 = AnonymousClass000.A11(A0y2);
                        String A0f = C90494aF.A0f(A112);
                        int A0G = C90484aE.A0G(A112);
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Duplicate sticker pack ID detected: ");
                        A0u.append(A0f);
                        C90494aF.A1K(A0u, A0G);
                        C36321k7.A1Z(A0u, " x)");
                        C23871Ae r3 = stickerPackFlow.A02;
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("Duplicates: ");
                        r3.A02(2, "duplicate_sticker_pack", C36381kD.A10(A0u2, A1G.size()));
                    }
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$packFlow$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
