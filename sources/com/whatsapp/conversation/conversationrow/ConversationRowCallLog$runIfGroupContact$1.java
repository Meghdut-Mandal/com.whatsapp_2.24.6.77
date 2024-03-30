package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass141;
import X.AnonymousClass3UL;
import X.C005502l;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C107265Nh;
import X.C174918Yy;
import com.whatsapp.jid.GroupJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1", f = "ConversationRowCallLog.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$runIfGroupContact$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $block;
    public final /* synthetic */ C107265Nh $callLog;
    public int label;
    public final /* synthetic */ C174918Yy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$runIfGroupContact$1(C174918Yy r2, C107265Nh r3, C023509x r4, C006302t r5) {
        super(2, r4);
        this.$callLog = r3;
        this.this$0 = r2;
        this.$block = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ConversationRowCallLog$runIfGroupContact$1(this.this$0, this.$callLog, r6, this.$block);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            boolean A1S = AnonymousClass000.A1S(this.$callLog.A08, 2);
            GroupJid groupJid = this.$callLog.A0D;
            C174918Yy r0 = this.this$0;
            AnonymousClass141 A01 = AnonymousClass3UL.A01(r0.A0l, r0.A1Q, groupJid, r0.A1u, A1S);
            if (A01 == null) {
                return null;
            }
            C174918Yy r02 = this.this$0;
            C006302t r2 = this.$block;
            C005502l mainDispatcher = r02.getMainDispatcher();
            ConversationRowCallLog$runIfGroupContact$1$1$1 conversationRowCallLog$runIfGroupContact$1$1$1 = new ConversationRowCallLog$runIfGroupContact$1$1$1(A01, (C023509x) null, r2);
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, mainDispatcher, conversationRowCallLog$runIfGroupContact$1$1$1);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowCallLog$runIfGroupContact$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
