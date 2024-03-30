package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$setupRecyclerView$2", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$setupRecyclerView$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ LinearLayoutManager $layoutManager;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$setupRecyclerView$2(LinearLayoutManager linearLayoutManager, C023509x r3) {
        super(2, r3);
        this.$layoutManager = linearLayoutManager;
    }

    public final C023509x create(Object obj, C023509x r4) {
        CommentsBottomSheet$setupRecyclerView$2 commentsBottomSheet$setupRecyclerView$2 = new CommentsBottomSheet$setupRecyclerView$2(this.$layoutManager, r4);
        commentsBottomSheet$setupRecyclerView$2.Z$0 = AnonymousClass000.A1X(obj);
        return commentsBottomSheet$setupRecyclerView$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.Z$0) {
                this.$layoutManager.A17(0);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheet$setupRecyclerView$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
