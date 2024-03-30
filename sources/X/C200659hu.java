package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet;
import com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInNewsletterBottomSheet;

/* renamed from: X.9hu  reason: invalid class name and case insensitive filesystem */
public final class C200659hu {
    public static final /* synthetic */ C200659hu A00 = new C200659hu();

    public static final void A00(C225314u r4, C20780y9 r5, C28981Uw r6, boolean z) {
        DialogFragment phoneNumberHiddenInNewsletterBottomSheet;
        C36321k7.A0w(r4, r5);
        AnonymousClass00C.A0D(r6, 3);
        r5.A01(C20150x6.class);
        if (z) {
            phoneNumberHiddenInNewsletterBottomSheet = new CreatorPrivacyNewsletterBottomSheet();
            String rawString = r6.getRawString();
            Bundle A07 = AnonymousClass001.A07();
            A07.putString("jid", rawString);
            phoneNumberHiddenInNewsletterBottomSheet.A17(A07);
        } else {
            phoneNumberHiddenInNewsletterBottomSheet = new PhoneNumberHiddenInNewsletterBottomSheet();
        }
        r4.Btl(phoneNumberHiddenInNewsletterBottomSheet, "PhoneNumberHiddenInNewsletterSheet");
    }
}
