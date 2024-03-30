package com.whatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C29821Yc;
import X.C52152oy;
import X.C65073Qp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.ChatOriginManager$updateChatOrigin$2", f = "ChatOriginManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatOriginManager$updateChatOrigin$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C65073Qp $chatInfo;
    public final /* synthetic */ C52152oy $chatOrigin;
    public int label;
    public final /* synthetic */ C29821Yc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatOriginManager$updateChatOrigin$2(C65073Qp r2, C52152oy r3, C29821Yc r4, C023509x r5) {
        super(2, r5);
        this.$chatInfo = r2;
        this.$chatOrigin = r3;
        this.this$0 = r4;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ChatOriginManager$updateChatOrigin$2(this.$chatInfo, this.$chatOrigin, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C65073Qp r2 = this.$chatInfo;
            C52152oy r1 = this.$chatOrigin;
            if (r2.A0Z == null) {
                r2.A0Z = r1;
            }
            return new Integer(this.this$0.A00.A06(r2));
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatOriginManager$updateChatOrigin$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
