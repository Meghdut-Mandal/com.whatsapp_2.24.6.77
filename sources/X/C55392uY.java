package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusConfirmMuteDialogFragment;

/* renamed from: X.2uY  reason: invalid class name and case insensitive filesystem */
public abstract class C55392uY {
    public static final StatusConfirmMuteDialogFragment A00(UserJid userJid, Long l, String str, String str2, String str3, boolean z) {
        AnonymousClass00C.A0D(userJid, 0);
        StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment = new StatusConfirmMuteDialogFragment();
        Bundle A0B = C36351kA.A0B(userJid, "jid");
        A0B.putString("message_id", str);
        A0B.putLong("status_item_index", C36371kC.A0A(l));
        A0B.putString("psa_campaign_id", str2);
        A0B.putString("psa_campaign_ids", str3);
        A0B.putBoolean("is_message_sampled", z);
        statusConfirmMuteDialogFragment.A17(A0B);
        return statusConfirmMuteDialogFragment;
    }
}
