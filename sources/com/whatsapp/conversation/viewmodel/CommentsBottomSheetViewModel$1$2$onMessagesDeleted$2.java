package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3J2;
import X.C009003v;
import X.C023509x;
import X.C18010sR;
import X.C40001uV;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C40001uV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(C40001uV r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18010sR r2 = this.this$0.A0J;
            AnonymousClass3J2 r0 = new AnonymousClass3J2((Integer) null, (Integer) null, true);
            this.label = 1;
            if (r2.Bpf(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
