package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.8Ev  reason: invalid class name and case insensitive filesystem */
public class C170798Ev extends C06570Uc {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;

    public void A02(View view, float f) {
    }

    public void A03(View view, int i) {
        if (i == 1) {
            this.A00.A0W(3);
        }
    }

    public C170798Ev(BottomSheetBehavior bottomSheetBehavior, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = pinBottomSheetDialogFragment;
        this.A00 = bottomSheetBehavior;
    }
}
