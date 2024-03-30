package com.whatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import X.C29911Yl;
import X.C74413lZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1", f = "FMessageCommentInfoLazyLoader.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
public final class FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3T1 $parentCommentMessage;
    public int label;
    public final /* synthetic */ C74413lZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1(C74413lZ r2, AnonymousClass3T1 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$parentCommentMessage = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1(this.this$0, this.$parentCommentMessage, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C29911Yl r1 = this.this$0.A01;
            AnonymousClass3T1 r0 = this.$parentCommentMessage;
            this.label = 1;
            if (r1.B6f(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
