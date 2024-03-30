package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
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

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$executeIfInputIsValid$1", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$executeIfInputIsValid$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3J2 $currentErrorState;
    public int label;
    public final /* synthetic */ C40001uV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheetViewModel$executeIfInputIsValid$1(AnonymousClass3J2 r2, C40001uV r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$currentErrorState = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommentsBottomSheetViewModel$executeIfInputIsValid$1(this.$currentErrorState, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18010sR r1 = this.this$0.A0J;
            AnonymousClass3J2 r0 = this.$currentErrorState;
            this.label = 1;
            if (r1.Bpf(r0, this) == r3) {
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
        return ((CommentsBottomSheetViewModel$executeIfInputIsValid$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
