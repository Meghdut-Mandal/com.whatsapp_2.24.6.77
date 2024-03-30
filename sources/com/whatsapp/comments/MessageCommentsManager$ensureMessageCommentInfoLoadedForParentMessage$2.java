package com.whatsapp.comments;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2", f = "MessageCommentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3T1 $parentCommentMessage;
    public int label;
    public final /* synthetic */ MessageCommentsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2(MessageCommentsManager messageCommentsManager, AnonymousClass3T1 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = messageCommentsManager;
        this.$parentCommentMessage = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2(this.this$0, this.$parentCommentMessage, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            MessageCommentsManager messageCommentsManager = this.this$0;
            Set set = MessageCommentsManager.A0D;
            messageCommentsManager.A01.A05(this.$parentCommentMessage, 40);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
