package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass141;
import X.AnonymousClass3QM;
import X.C009003v;
import X.C023509x;
import X.C40001uV;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$refreshSendPermission$1$1", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$refreshSendPermission$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass141 $groupContact;
    public int label;
    public final /* synthetic */ C40001uV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheetViewModel$refreshSendPermission$1$1(C40001uV r2, AnonymousClass141 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$groupContact = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommentsBottomSheetViewModel$refreshSendPermission$1$1(this.this$0, this.$groupContact, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        AnonymousClass3QM r0;
        int A01;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C40001uV r4 = this.this$0;
            AnonymousClass05L r3 = r4.A0Q;
            AnonymousClass141 r2 = this.$groupContact;
            do {
                value = r3.getValue();
                r0 = (AnonymousClass3QM) value;
                A01 = C40001uV.A01(r4, r2);
            } while (!r3.B3B(value, new AnonymousClass3QM(r0.A01, r0.A02, r0.A03, r0.A04, A01, r0.A05)));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheetViewModel$refreshSendPermission$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
