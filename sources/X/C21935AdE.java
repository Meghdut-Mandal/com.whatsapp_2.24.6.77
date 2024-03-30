package X;

import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager", f = "ArEffectsFlmConsentManager.kt", i = {0, 0, 1, 1}, l = {110, 123}, m = "setConsentResult", n = {"this", "result", "this", "result"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.AdE  reason: case insensitive filesystem */
public final class C21935AdE extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ArEffectsFlmConsentManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21935AdE(ArEffectsFlmConsentManager arEffectsFlmConsentManager, C023509x r2) {
        super(r2);
        this.this$0 = arEffectsFlmConsentManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((Boolean) null, this);
    }
}
