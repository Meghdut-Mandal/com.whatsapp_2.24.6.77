package X;

import android.os.Bundle;
import com.whatsapp.accountswitching.ui.AddAccountBottomSheet;

/* renamed from: X.2qz  reason: invalid class name and case insensitive filesystem */
public abstract class C53232qz {
    public static final AddAccountBottomSheet A00(String str, int i) {
        AddAccountBottomSheet addAccountBottomSheet = new AddAccountBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("source", i);
        if (!(str == null || str.length() == 0)) {
            A07.putString("landing_screen", str);
        }
        addAccountBottomSheet.A17(A07);
        return addAccountBottomSheet;
    }
}
