package X;

import com.whatsapp.comments.MessageCommentsManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.MessageCommentsManager", f = "MessageCommentsManager.kt", i = {0, 0}, l = {162}, m = "ensureMessageCommentInfoLoadedForComment", n = {"this", "updatedCommentInfo"}, s = {"L$0", "L$1"})
/* renamed from: X.3zE  reason: invalid class name and case insensitive filesystem */
public final class C82763zE extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MessageCommentsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82763zE(MessageCommentsManager messageCommentsManager, C023509x r2) {
        super(r2);
        this.this$0 = messageCommentsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass3T1) null, this);
    }
}
