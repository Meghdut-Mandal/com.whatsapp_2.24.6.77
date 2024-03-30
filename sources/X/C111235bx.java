package X;

import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

/* renamed from: X.5bx  reason: invalid class name and case insensitive filesystem */
public abstract class C111235bx {
    public static final IndiaUpiDobPickerBottomSheet A00(C135086c7 r4, String str, boolean z, boolean z2) {
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = new IndiaUpiDobPickerBottomSheet();
        AnonymousClass011[] r2 = new AnonymousClass011[4];
        C90464aC.A1E("BUNDLE_KEY_SHOW_TOOLBAR", Boolean.valueOf(z), r2);
        C90464aC.A1F("BUNDLE_KEY_SHOW_HANDLE", Boolean.valueOf(z2), r2);
        C90474aD.A1F("BUNDLE_KEY_CREDENTIAL", str, r2);
        C90474aD.A1G("BUNDLE_BANK_ACCOUNT", r4, r2);
        indiaUpiDobPickerBottomSheet.A17(C05430Pr.A00(r2));
        return indiaUpiDobPickerBottomSheet;
    }
}
