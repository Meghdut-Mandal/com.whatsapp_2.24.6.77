package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C36331k8;
import X.C40441vY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$onViewCreated$3", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$onViewCreated$3 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$onViewCreated$3(CommentsBottomSheet commentsBottomSheet, C023509x r3) {
        super(2, r3);
        this.this$0 = commentsBottomSheet;
    }

    public final C023509x create(Object obj, C023509x r4) {
        CommentsBottomSheet$onViewCreated$3 commentsBottomSheet$onViewCreated$3 = new CommentsBottomSheet$onViewCreated$3(this.this$0, r4);
        commentsBottomSheet$onViewCreated$3.L$0 = obj;
        return commentsBottomSheet$onViewCreated$3;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            Object obj2 = this.L$0;
            C40441vY r1 = this.this$0.A07;
            if (r1 == null) {
                throw C36331k8.A0Y();
            }
            AnonymousClass00C.A0D(obj2, 0);
            int indexOf = r1.A00.A03.indexOf(obj2);
            if (indexOf >= 0) {
                r1.A07(indexOf);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheet$onViewCreated$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
