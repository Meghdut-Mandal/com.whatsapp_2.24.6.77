package X;

import com.whatsapp.R;
import com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity;

/* renamed from: X.4Io  reason: invalid class name and case insensitive filesystem */
public final class C85824Io extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ChatLockConfirmSecretCodeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85824Io(ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity) {
        super(1);
        this.this$0 = chatLockConfirmSecretCodeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity;
        int i;
        C53522rS r6 = (C53522rS) obj;
        AnonymousClass00C.A0D(r6, 0);
        int i2 = 0;
        if (r6.equals(AnonymousClass2Ec.A00)) {
            this.this$0.setResult(-1);
            ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity2 = this.this$0;
            if (chatLockConfirmSecretCodeActivity2.A00 != 2) {
                i2 = 1;
            }
            AnonymousClass3L5 r2 = chatLockConfirmSecretCodeActivity2.A02;
            if (r2 != null) {
                r2.A05(2, Integer.valueOf(i2));
                this.this$0.finish();
            } else {
                throw C36331k8.A0d("chatLockLogger");
            }
        } else {
            if (!r6.equals(AnonymousClass2Eb.A00)) {
                if (r6 instanceof AnonymousClass2Ea) {
                    int i3 = ((AnonymousClass2Ea) r6).A00;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            chatLockConfirmSecretCodeActivity = this.this$0;
                            i = R.string.f12nameremoved;
                        } else if (i3 != 3) {
                            chatLockConfirmSecretCodeActivity = this.this$0;
                            i = R.string.f12nameremoved;
                        }
                        chatLockConfirmSecretCodeActivity.A3n(i);
                    }
                }
            }
            ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity3 = this.this$0;
            chatLockConfirmSecretCodeActivity3.A3i().setError(chatLockConfirmSecretCodeActivity3.getString(R.string.f12nameremoved));
        }
        return AnonymousClass0AJ.A00;
    }
}
