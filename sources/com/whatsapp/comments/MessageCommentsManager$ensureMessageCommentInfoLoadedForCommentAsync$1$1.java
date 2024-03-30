package com.whatsapp.comments;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1", f = "MessageCommentsManager.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C009003v $callback;
    public final /* synthetic */ AnonymousClass3T1 $message;
    public int label;
    public final /* synthetic */ MessageCommentsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1(MessageCommentsManager messageCommentsManager, AnonymousClass3T1 r3, C023509x r4, C009003v r5) {
        super(2, r4);
        this.this$0 = messageCommentsManager;
        this.$message = r3;
        this.$callback = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1(this.this$0, this.$message, r6, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            MessageCommentsManager messageCommentsManager = this.this$0;
            AnonymousClass3T1 r0 = this.$message;
            this.label = 1;
            obj = messageCommentsManager.A00(r0, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C009003v r1 = this.$callback;
        if (r1 != null) {
            r1.invoke(this.$message, obj);
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
