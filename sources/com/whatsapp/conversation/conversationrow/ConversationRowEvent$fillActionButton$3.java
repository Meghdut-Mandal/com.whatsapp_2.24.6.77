package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass2I7;
import X.AnonymousClass2bT;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillActionButton$3", f = "ConversationRowEvent.kt", i = {}, l = {327}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowEvent$fillActionButton$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass2bT $eventMessage;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass2I7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowEvent$fillActionButton$3(AnonymousClass2I7 r2, AnonymousClass2bT r3, C023509x r4) {
        super(2, r4);
        this.$eventMessage = r3;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ConversationRowEvent$fillActionButton$3(this.this$0, this.$eventMessage, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass2bT r5 = this.$eventMessage;
            AnonymousClass11F r4 = r5.A1J.A00;
            if (r4 != null) {
                AnonymousClass2I7 r3 = this.this$0;
                AnonymousClass141 A0D = r3.A0l.A0D(r4);
                if (r5.A1J.A02 && r3.getGroupChatUtils().A04(A0D, r4)) {
                    C005502l mainDispatcher = r3.getMainDispatcher();
                    ConversationRowEvent$fillActionButton$3$1$1 conversationRowEvent$fillActionButton$3$1$1 = new ConversationRowEvent$fillActionButton$3$1$1(r3, r5, (C023509x) null);
                    this.L$0 = r4;
                    this.label = 1;
                    if (AnonymousClass0A2.A00(this, mainDispatcher, conversationRowEvent$fillActionButton$3$1$1) == r6) {
                        return r6;
                    }
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowEvent$fillActionButton$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
