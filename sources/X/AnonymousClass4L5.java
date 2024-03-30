package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;

/* renamed from: X.4L5  reason: invalid class name */
public final class AnonymousClass4L5 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ EnforcedMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4L5(EnforcedMessagesActivity enforcedMessagesActivity) {
        super(1);
        this.this$0 = enforcedMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C64933Qa r7 = (C64933Qa) obj;
        AnonymousClass00C.A0D(r7, 0);
        DeleteEnforcedMessageDialogFragment deleteEnforcedMessageDialogFragment = new DeleteEnforcedMessageDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("message_res", R.string.f12nameremoved);
        A07.putInt("primary_action_text_id_res", R.string.f12nameremoved);
        A07.putInt("secondary_action_text_res", R.string.f12nameremoved);
        deleteEnforcedMessageDialogFragment.A17(A07);
        AnonymousClass3UJ.A08(deleteEnforcedMessageDialogFragment.A0b(), r7);
        this.this$0.Btm(deleteEnforcedMessageDialogFragment);
        return AnonymousClass0AJ.A00;
    }
}
