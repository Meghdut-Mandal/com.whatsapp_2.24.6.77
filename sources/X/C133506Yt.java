package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

/* renamed from: X.6Yt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C133506Yt implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ IndiaUpiDobPickerBottomSheet A01;

    public /* synthetic */ C133506Yt(IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet, long j) {
        this.A01 = indiaUpiDobPickerBottomSheet;
        this.A00 = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = this.A01;
        long j = this.A00;
        AnonymousClass01I A0i = indiaUpiDobPickerBottomSheet.A0i();
        if (A0i instanceof AnonymousClass7hI) {
            ((AnonymousClass7hI) A0i).BVB(j, indiaUpiDobPickerBottomSheet.A0b().getString("BUNDLE_KEY_CREDENTIAL", (String) null));
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
