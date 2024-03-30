package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass17Y;
import X.AnonymousClass3J2;
import X.C009003v;
import X.C023509x;
import X.C36321k7;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$onViewCreated$2", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$onViewCreated$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$onViewCreated$2(CommentsBottomSheet commentsBottomSheet, C023509x r3) {
        super(2, r3);
        this.this$0 = commentsBottomSheet;
    }

    public final C023509x create(Object obj, C023509x r4) {
        CommentsBottomSheet$onViewCreated$2 commentsBottomSheet$onViewCreated$2 = new CommentsBottomSheet$onViewCreated$2(this.this$0, r4);
        commentsBottomSheet$onViewCreated$2.L$0 = obj;
        return commentsBottomSheet$onViewCreated$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3J2 r4 = (AnonymousClass3J2) this.L$0;
            if (r4.A02) {
                this.this$0.A1b();
            } else {
                CommentsBottomSheet commentsBottomSheet = this.this$0;
                Integer num = r4.A01;
                if (num != null) {
                    int intValue = num.intValue();
                    AnonymousClass17Y r0 = commentsBottomSheet.A02;
                    if (r0 != null) {
                        r0.A06(intValue, 1);
                    } else {
                        throw C36321k7.A06();
                    }
                }
                Integer num2 = r4.A00;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    AnonymousClass17Y r02 = commentsBottomSheet.A02;
                    if (r02 != null) {
                        r02.A06(intValue2, 1);
                    } else {
                        throw C36321k7.A06();
                    }
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheet$onViewCreated$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
