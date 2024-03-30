package X;

import com.whatsapp.R;
import com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity;

/* renamed from: X.4Lr  reason: invalid class name and case insensitive filesystem */
public final class C86634Lr extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ boolean $isConfirmAction;
    public final /* synthetic */ ChatLockCreateSecretCodeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86634Lr(ChatLockCreateSecretCodeActivity chatLockCreateSecretCodeActivity, boolean z) {
        super(1);
        this.this$0 = chatLockCreateSecretCodeActivity;
        this.$isConfirmAction = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1X = AnonymousClass000.A1X(obj);
        ChatLockCreateSecretCodeActivity chatLockCreateSecretCodeActivity = this.this$0;
        if (A1X) {
            chatLockCreateSecretCodeActivity.setResult(2);
            if (this.$isConfirmAction) {
                AnonymousClass3L5 r2 = this.this$0.A03;
                if (r2 != null) {
                    r2.A05(C36371kC.A0p(), 1);
                } else {
                    throw C36331k8.A0d("chatLockLogger");
                }
            }
            this.this$0.finish();
        } else {
            chatLockCreateSecretCodeActivity.A3n(R.string.f12nameremoved);
        }
        return AnonymousClass0AJ.A00;
    }
}
