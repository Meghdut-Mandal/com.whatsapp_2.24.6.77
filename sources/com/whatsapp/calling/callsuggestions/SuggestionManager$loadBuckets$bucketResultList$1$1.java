package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass63R;
import X.C009003v;
import X.C023509x;
import X.C159397jI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.SuggestionManager$loadBuckets$bucketResultList$1$1", f = "SuggestionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestionManager$loadBuckets$bucketResultList$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C159397jI $it;
    public int label;
    public final /* synthetic */ AnonymousClass63R this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionManager$loadBuckets$bucketResultList$1$1(AnonymousClass63R r2, C159397jI r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$it = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new SuggestionManager$loadBuckets$bucketResultList$1$1(this.this$0, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            int ordinal = this.this$0.A00.A03.ordinal();
            C159397jI r0 = this.$it;
            if (ordinal != 1) {
                return r0.BOH();
            }
            return r0.BOI();
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SuggestionManager$loadBuckets$bucketResultList$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
