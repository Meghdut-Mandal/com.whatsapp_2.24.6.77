package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass141;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1$1$1", f = "ConversationRowCallLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$runIfGroupContact$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $block;
    public final /* synthetic */ AnonymousClass141 $it;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$runIfGroupContact$1$1$1(AnonymousClass141 r2, C023509x r3, C006302t r4) {
        super(2, r3);
        this.$block = r4;
        this.$it = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ConversationRowCallLog$runIfGroupContact$1$1$1(this.$it, r5, this.$block);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return this.$block.invoke(this.$it);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowCallLog$runIfGroupContact$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
