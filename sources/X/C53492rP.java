package X;

import android.os.Bundle;
import com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;
import com.whatsapp.jid.Jid;

/* renamed from: X.2rP  reason: invalid class name and case insensitive filesystem */
public abstract class C53492rP {
    public static final SharePhoneNumberBottomSheet A00(Jid jid, int i) {
        SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = new SharePhoneNumberBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("arg_jid", jid.getRawString());
        A07.putInt("arg_entry_point", i);
        sharePhoneNumberBottomSheet.A17(A07);
        return sharePhoneNumberBottomSheet;
    }
}
