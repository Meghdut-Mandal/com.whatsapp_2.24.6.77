package X;

import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;
import java.text.DateFormat;

/* renamed from: X.7Me  reason: invalid class name and case insensitive filesystem */
public final class C152877Me extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ IndiaUpiDobPickerBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152877Me(IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet) {
        super(0);
        this.this$0 = indiaUpiDobPickerBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C18820ts r0 = this.this$0.A00;
        if (r0 != null) {
            return DateFormat.getDateInstance(2, C36401kF.A0x(r0));
        }
        throw C36321k7.A09();
    }
}
