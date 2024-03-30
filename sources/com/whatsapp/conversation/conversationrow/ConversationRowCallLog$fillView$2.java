package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C106265Iz;
import X.C174918Yy;
import X.C36381kD;
import X.C36441kJ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2", f = "ConversationRowCallLog.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$fillView$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C106265Iz $fMessage;
    public int label;
    public final /* synthetic */ C174918Yy this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2$1", f = "ConversationRowCallLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(r2, r3, A0Q, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                C174918Yy r0 = r3;
                r0.A08.setText(r0.getCallingMessageUtil().A07(C36441kJ.A0J(r3), r2, A0Q));
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$fillView$2(C106265Iz r2, C174918Yy r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$fMessage = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ConversationRowCallLog$fillView$2(this.$fMessage, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass16D r1 = this.this$0.A0l;
            AnonymousClass11F r0 = this.$fMessage.A1J.A00;
            if (r0 != null) {
                final String A0Q = this.this$0.A0n.A0Q(r1.A0D(r0), 7);
                C005502l mainDispatcher = this.this$0.getMainDispatcher();
                final C174918Yy r3 = this.this$0;
                final C106265Iz r2 = this.$fMessage;
                AnonymousClass1 r02 = new AnonymousClass1((C023509x) null);
                this.label = 1;
                if (AnonymousClass0A2.A00(this, mainDispatcher, r02) == r6) {
                    return r6;
                }
            } else {
                throw C36381kD.A0k();
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowCallLog$fillView$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
