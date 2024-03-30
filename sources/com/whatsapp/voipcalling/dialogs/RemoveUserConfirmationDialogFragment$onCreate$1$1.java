package com.whatsapp.voipcalling.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.C009003v;
import X.C023509x;
import X.C18740tg;
import X.C36331k8;
import X.C36381kD;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.voipcalling.dialogs.RemoveUserConfirmationDialogFragment$onCreate$1$1", f = "RemoveUserConfirmationDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RemoveUserConfirmationDialogFragment$onCreate$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $it;
    public int label;
    public final /* synthetic */ RemoveUserConfirmationDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoveUserConfirmationDialogFragment$onCreate$1$1(UserJid userJid, RemoveUserConfirmationDialogFragment removeUserConfirmationDialogFragment, C023509x r4) {
        super(2, r4);
        this.this$0 = removeUserConfirmationDialogFragment;
        this.$it = userJid;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new RemoveUserConfirmationDialogFragment$onCreate$1$1(this.$it, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass16D r1 = this.this$0.A00;
            if (r1 != null) {
                AnonymousClass141 A0D = r1.A0D(this.$it);
                RemoveUserConfirmationDialogFragment removeUserConfirmationDialogFragment = this.this$0;
                AnonymousClass171 r0 = removeUserConfirmationDialogFragment.A01;
                if (r0 != null) {
                    String A0v = C36381kD.A0v(r0, A0D);
                    C18740tg.A06(A0v);
                    removeUserConfirmationDialogFragment.A02 = A0v;
                    return AnonymousClass0AJ.A00;
                }
                throw C36331k8.A0c();
            }
            throw C36331k8.A0Z();
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RemoveUserConfirmationDialogFragment$onCreate$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
