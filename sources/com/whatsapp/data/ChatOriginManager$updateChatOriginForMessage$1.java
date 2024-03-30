package com.whatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C223313w;
import X.C29821Yc;
import X.C36371kC;
import X.C52152oy;
import X.C65073Qp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.ChatOriginManager$updateChatOriginForMessage$1", f = "ChatOriginManager.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class ChatOriginManager$updateChatOriginForMessage$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C52152oy $chatOrigin;
    public final /* synthetic */ C223313w $jid;
    public int label;
    public final /* synthetic */ C29821Yc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatOriginManager$updateChatOriginForMessage$1(C52152oy r2, C29821Yc r3, C223313w r4, C023509x r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$jid = r4;
        this.$chatOrigin = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ChatOriginManager$updateChatOriginForMessage$1(this.$chatOrigin, this.this$0, this.$jid, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C29821Yc r5 = this.this$0;
            C223313w r1 = this.$jid;
            C52152oy r4 = this.$chatOrigin;
            this.label = 1;
            C65073Qp A0W = C36371kC.A0W(r5.A01, r1);
            if (A0W != null && AnonymousClass0A2.A00(this, r5.A03, new ChatOriginManager$updateChatOrigin$2(A0W, r4, r5, (C023509x) null)) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatOriginManager$updateChatOriginForMessage$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
