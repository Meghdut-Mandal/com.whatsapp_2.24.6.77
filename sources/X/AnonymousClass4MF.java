package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment;

/* renamed from: X.4MF  reason: invalid class name */
public final class AnonymousClass4MF extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ View $dialogView;
    public final /* synthetic */ PinInChatExpirationDialogFragment $this_run;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MF(View view, PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment) {
        super(1);
        this.$this_run = pinInChatExpirationDialogFragment;
        this.$dialogView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        AnonymousClass00C.A0B(bool);
        if (bool.booleanValue()) {
            C36341k9.A0X(this.$dialogView, R.id.pin_messages_ephemeral_message_disclaimer_view_stub).A01().setVisibility(0);
        }
        return AnonymousClass0AJ.A00;
    }
}
