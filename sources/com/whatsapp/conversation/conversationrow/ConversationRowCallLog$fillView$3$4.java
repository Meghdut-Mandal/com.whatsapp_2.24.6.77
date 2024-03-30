package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass141;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C106265Iz;
import X.C107265Nh;
import X.C174918Yy;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$4", f = "ConversationRowCallLog.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$fillView$3$4 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C107265Nh $callLog;
    public final /* synthetic */ int $dialogShowLimit;
    public final /* synthetic */ C106265Iz $fMessage;
    public final /* synthetic */ int $shownTime;
    public int label;
    public final /* synthetic */ C174918Yy this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$4$1", f = "ConversationRowCallLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$4$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r11) {
            int i = i2;
            int i2 = i3;
            return new AnonymousClass1(r4, A0D, r6, A0Q, r11, i, i2, A0B);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                int i = i2;
                if (i < 0 || (i != 0 && i3 >= i)) {
                    return new Integer(r4.getCallsManager().Bua(r4.getContext(), A0D, A0B, r6.A0K));
                }
                CallConfirmationFragment.A06(r4.A0R, A0D, new Integer(A0B), A0Q, i2, r6.A0K);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$fillView$3$4(C106265Iz r2, C174918Yy r3, C107265Nh r4, C023509x r5, int i, int i2) {
        super(2, r5);
        this.this$0 = r3;
        this.$callLog = r4;
        this.$fMessage = r2;
        this.$dialogShowLimit = i;
        this.$shownTime = i2;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new ConversationRowCallLog$fillView$3$4(this.$fMessage, this.this$0, this.$callLog, r9, this.$dialogShowLimit, this.$shownTime);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final AnonymousClass141 A0D = this.this$0.A0l.A0D(this.$callLog.A04.A01);
            final int A0B = C174918Yy.A0B(this.$fMessage);
            final String A0Q = this.this$0.A0n.A0Q(A0D, 7);
            C005502l mainDispatcher = this.this$0.getMainDispatcher();
            final int i2 = this.$dialogShowLimit;
            final int i3 = this.$shownTime;
            final C174918Yy r4 = this.this$0;
            final C107265Nh r6 = this.$callLog;
            AnonymousClass1 r3 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, mainDispatcher, r3);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowCallLog$fillView$3$4) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
