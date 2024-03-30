package X;

import com.whatsapp.suggestions.SuggestionsEngine;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.suggestions.SuggestionsEngine", f = "SuggestionsEngine.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {64}, m = "getLandingScreenSuggestionsAndWhatsAppContacts", n = {"this", "excludedJids", "signalStrength", "allWaContacts", "favoritedContactsOnWhatsApp", "serverSignals", "suggestionsCount"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
/* renamed from: X.3zJ  reason: invalid class name and case insensitive filesystem */
public final class C82813zJ extends AnonymousClass0A0 {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SuggestionsEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82813zJ(SuggestionsEngine suggestionsEngine, C023509x r2) {
        super(r2);
        this.this$0 = suggestionsEngine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((C159717jo) null, (String) null, (Set) null, this, 0);
    }
}
