package X;

import android.os.Bundle;
import com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet;

/* renamed from: X.2qy  reason: invalid class name and case insensitive filesystem */
public abstract class C53222qy {
    public static final AccountSwitchingBottomSheet A00(String str, int i) {
        AccountSwitchingBottomSheet accountSwitchingBottomSheet = new AccountSwitchingBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("source", i);
        if (!(str == null || str.length() == 0)) {
            A07.putString("landing_screen", str);
        }
        accountSwitchingBottomSheet.A17(A07);
        return accountSwitchingBottomSheet;
    }
}
