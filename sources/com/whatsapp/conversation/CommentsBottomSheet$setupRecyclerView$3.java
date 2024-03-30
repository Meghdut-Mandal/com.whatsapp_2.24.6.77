package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import com.whatsapp.mentions.MentionableEntry;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$setupRecyclerView$3", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$setupRecyclerView$3 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$setupRecyclerView$3(CommentsBottomSheet commentsBottomSheet, C023509x r3) {
        super(2, r3);
        this.this$0 = commentsBottomSheet;
    }

    public final C023509x create(Object obj, C023509x r4) {
        CommentsBottomSheet$setupRecyclerView$3 commentsBottomSheet$setupRecyclerView$3 = new CommentsBottomSheet$setupRecyclerView$3(this.this$0, r4);
        commentsBottomSheet$setupRecyclerView$3.Z$0 = AnonymousClass000.A1X(obj);
        return commentsBottomSheet$setupRecyclerView$3;
    }

    public final Object invokeSuspend(Object obj) {
        MentionableEntry mentionableEntry;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.Z$0 && (mentionableEntry = (MentionableEntry) this.this$0.A0X.getValue()) != null) {
                mentionableEntry.setText("");
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheet$setupRecyclerView$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
