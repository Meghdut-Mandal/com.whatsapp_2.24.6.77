package X;

import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;

/* renamed from: X.7NL  reason: invalid class name */
public final class AnonymousClass7NL extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AccountLinkingNativeAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NL(AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity) {
        super(0);
        this.this$0 = accountLinkingNativeAuthActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        TextView A0H = C36401kF.A0H(this.this$0, R.id.fb_user_full_name);
        C134716bU r0 = this.this$0.A05;
        if (r0 == null) {
            throw C36331k8.A0d("fb4aUserEntityForNativeAuth");
        }
        A0H.setText((CharSequence) r0.A01.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_UI"));
        return AnonymousClass0AJ.A00;
    }
}
