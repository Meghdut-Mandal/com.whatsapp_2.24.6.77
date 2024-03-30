package X;

import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager", f = "ArEffectsFlmConsentManager.kt", i = {0}, l = {147}, m = "refreshConsentResultForUSConsentType", n = {"this"}, s = {"L$0"})
/* renamed from: X.Acy  reason: case insensitive filesystem */
public final class C21924Acy extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ArEffectsFlmConsentManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21924Acy(ArEffectsFlmConsentManager arEffectsFlmConsentManager, C023509x r2) {
        super(r2);
        this.this$0 = arEffectsFlmConsentManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ArEffectsFlmConsentManager.A00(this.this$0, this);
    }
}
