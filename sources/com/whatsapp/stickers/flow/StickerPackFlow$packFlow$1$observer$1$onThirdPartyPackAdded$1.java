package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1B5;
import X.AnonymousClass5Kd;
import X.AnonymousClass68B;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C106535Kb;
import X.C1268665y;
import X.C18000sQ;
import X.C36391kE;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C18000sQ $$this$callbackFlow;
    public final /* synthetic */ String $authority;
    public final /* synthetic */ String $identifier;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1(StickerPackFlow stickerPackFlow, String str, String str2, C023509x r5, C18000sQ r6) {
        super(2, r5);
        this.this$0 = stickerPackFlow;
        this.$authority = str;
        this.$identifier = str2;
        this.$$this$callbackFlow = r6;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1(this.this$0, this.$authority, this.$identifier, r8, this.$$this$callbackFlow);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass68B A00 = this.this$0.A0A.A00(this.$authority, this.$identifier);
            AnonymousClass1B5 r0 = this.this$0.A07;
            String str = A00.A0F;
            AnonymousClass00C.A08(str);
            int A01 = r0.A01(str);
            A00.A07 = true;
            A00.A00 = A01;
            List list = this.this$0.A00.A00;
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : list) {
                C36391kE.A1V(next, A0I, AnonymousClass00C.A0J(((C1268665y) next).A01(), str) ? 1 : 0);
            }
            ArrayList A0T = C007103b.A0T(new AnonymousClass5Kd(A00, str), A0I);
            AnonymousClass00C.A0D(A0T, 0);
            StickerPackFlow.A00(new C106535Kb(A0T), this.this$0, this.$$this$callbackFlow);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
