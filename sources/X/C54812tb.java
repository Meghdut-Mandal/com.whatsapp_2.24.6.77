package X;

import android.os.Bundle;
import com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog;
import java.util.List;

/* renamed from: X.2tb  reason: invalid class name and case insensitive filesystem */
public abstract class C54812tb {
    public static final AdminInviteErrorDialog A00(C51872oW r4, String str, String str2, List list) {
        AnonymousClass00C.A0D(list, 1);
        AdminInviteErrorDialog adminInviteErrorDialog = new AdminInviteErrorDialog();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("arg_dialog_message", str);
        A07.putStringArrayList("invitee_jids", AnonymousClass143.A07(list));
        A07.putString("arg_caption", str2);
        A07.putString("arg_action", r4.toString());
        adminInviteErrorDialog.A17(A07);
        return adminInviteErrorDialog;
    }
}
