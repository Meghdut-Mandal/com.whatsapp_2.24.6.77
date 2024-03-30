package com.whatsapp.biz.commerce;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1KR;
import X.AnonymousClass6CL;
import X.C009003v;
import X.C023509x;
import X.C26601Ku;
import X.C90524aI;
import com.whatsapp.extensions.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.commerce.FlowsBusinessDataCryptoProcessorDelegate$fetchFlowsBusinessPublicKeyMetadataGraphQl$1", f = "FlowsBusinessDataCryptoProcessorDelegate.kt", i = {0}, l = {60}, m = "invokeSuspend", n = {"instanceKey"}, s = {"I$0"})
public final class FlowsBusinessDataCryptoProcessorDelegate$fetchFlowsBusinessPublicKeyMetadataGraphQl$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $bizJid;
    public int I$0;
    public int label;
    public final /* synthetic */ AnonymousClass1KR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsBusinessDataCryptoProcessorDelegate$fetchFlowsBusinessPublicKeyMetadataGraphQl$1(AnonymousClass1KR r2, UserJid userJid, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$bizJid = userJid;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FlowsBusinessDataCryptoProcessorDelegate$fetchFlowsBusinessPublicKeyMetadataGraphQl$1(this.this$0, this.$bizJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        int A0B;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            A0B = this.this$0.A04.A0B(this.$bizJid, "prefetch_conversation");
            C26601Ku r5 = this.this$0.A01;
            Integer A0a = C90524aI.A0a(A0B);
            UserJid userJid = this.$bizJid;
            this.I$0 = A0B;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r5.A06, new FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2(r5, userJid, A0a, (String) null, (C023509x) null, false));
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            A0B = this.I$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.this$0.A04.A0D(C90524aI.A0a(A0B), ((AnonymousClass6CL) obj).A00);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsBusinessDataCryptoProcessorDelegate$fetchFlowsBusinessPublicKeyMetadataGraphQl$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
