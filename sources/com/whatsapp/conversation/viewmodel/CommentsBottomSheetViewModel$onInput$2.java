package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C40001uV;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onInput$2", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$onInput$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C40001uV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheetViewModel$onInput$2(C40001uV r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CommentsBottomSheetViewModel$onInput$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommentsBottomSheetViewModel$onInput$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            if (!this.this$0.A02.getAndSet(true)) {
                C40001uV r0 = this.this$0;
                r0.A0C.A00(r0.A0B);
                this.label = 1;
                if (C07330Xf.A00(this, 2500) == r3) {
                    return r3;
                }
            }
            return AnonymousClass0AJ.A00;
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.this$0.A02.set(false);
        return AnonymousClass0AJ.A00;
    }
}
