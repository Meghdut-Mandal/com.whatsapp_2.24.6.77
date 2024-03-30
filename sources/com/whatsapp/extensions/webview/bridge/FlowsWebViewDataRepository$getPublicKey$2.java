package com.whatsapp.extensions.webview.bridge;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1KR;
import X.AnonymousClass570;
import X.AnonymousClass6DY;
import X.C009003v;
import X.C023509x;
import X.C12600iM;
import X.C165227t5;
import X.C36411kG;
import com.whatsapp.jid.UserJid;
import javax.crypto.SecretKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2", f = "FlowsWebViewDataRepository.kt", i = {}, l = {382, 384}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsWebViewDataRepository$getPublicKey$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ boolean $forceRefresh;
    public int label;
    public final /* synthetic */ FlowsWebViewDataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsWebViewDataRepository$getPublicKey$2(FlowsWebViewDataRepository flowsWebViewDataRepository, UserJid userJid, C023509x r4, boolean z) {
        super(2, r4);
        this.$forceRefresh = z;
        this.this$0 = flowsWebViewDataRepository;
        this.$bizJid = userJid;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new FlowsWebViewDataRepository$getPublicKey$2(this.this$0, this.$bizJid, r6, this.$forceRefresh);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.$forceRefresh || this.this$0.A08.A04(this.$bizJid)) {
                FlowsWebViewDataRepository flowsWebViewDataRepository = this.this$0;
                AnonymousClass6DY r0 = flowsWebViewDataRepository.A00;
                if (r0 != null) {
                    flowsWebViewDataRepository.A0A.A04(r0.A02.hashCode(), "fetch_key_cache_hit", false);
                }
                boolean A0E = this.this$0.A0B.A0E(7351);
                FlowsWebViewDataRepository flowsWebViewDataRepository2 = this.this$0;
                UserJid userJid = this.$bizJid;
                if (A0E) {
                    this.label = 1;
                    obj = FlowsWebViewDataRepository.A02(flowsWebViewDataRepository2, userJid, this);
                } else {
                    this.label = 2;
                    C12600iM A16 = C36411kG.A16(this);
                    AnonymousClass1KR r4 = flowsWebViewDataRepository2.A03;
                    C165227t5 r5 = new C165227t5(flowsWebViewDataRepository2, A16, userJid, 1);
                    AnonymousClass6DY r02 = flowsWebViewDataRepository2.A00;
                    if (r02 != null) {
                        i = r02.A02.hashCode();
                    } else {
                        i = -1;
                    }
                    r4.A01(r5, userJid, (String) null, (SecretKey) null, (byte[]) null, i, true, false);
                    obj = A16.A00();
                }
                if (obj == r2) {
                    return r2;
                }
            } else {
                FlowsWebViewDataRepository flowsWebViewDataRepository3 = this.this$0;
                AnonymousClass6DY r03 = flowsWebViewDataRepository3.A00;
                if (r03 != null) {
                    flowsWebViewDataRepository3.A0A.A04(r03.A02.hashCode(), "fetch_key_cache_hit", true);
                }
                return new AnonymousClass570(this.this$0.A07.A01(this.$bizJid.user));
            }
        } else if (i2 == 1 || i2 == 2) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsWebViewDataRepository$getPublicKey$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
