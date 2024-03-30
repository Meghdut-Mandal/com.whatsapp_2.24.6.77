package X;

import android.os.Bundle;
import com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet;

/* renamed from: X.2rO  reason: invalid class name and case insensitive filesystem */
public abstract class C53482rO {
    public static final PhoneNumberSharedBottomSheet A00(String str, boolean z) {
        PhoneNumberSharedBottomSheet phoneNumberSharedBottomSheet = new PhoneNumberSharedBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("arg_my_phone_number", str);
        A07.putBoolean("arg_is_business", z);
        phoneNumberSharedBottomSheet.A17(A07);
        return phoneNumberSharedBottomSheet;
    }
}
