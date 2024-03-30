package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass2I7;
import X.AnonymousClass2bT;
import X.C009003v;
import X.C023509x;
import android.view.View;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillActionButton$3$1$1", f = "ConversationRowEvent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowEvent$fillActionButton$3$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass2bT $eventMessage;
    public int label;
    public final /* synthetic */ AnonymousClass2I7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowEvent$fillActionButton$3$1$1(AnonymousClass2I7 r2, AnonymousClass2bT r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$eventMessage = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ConversationRowEvent$fillActionButton$3$1$1(this.this$0, this.$eventMessage, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass2I7.A0B((View.OnClickListener) null, this.this$0, this.$eventMessage.A1J.A02);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowEvent$fillActionButton$3$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
