package X;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.7uu  reason: invalid class name and case insensitive filesystem */
public class C166027uu extends CountDownTimer {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166027uu(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j) {
        super(j, 1000);
        this.A00 = pinBottomSheetDialogFragment;
    }

    public void onFinish() {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        pinBottomSheetDialogFragment.A01 = null;
        pinBottomSheetDialogFragment.A03.setVisibility(4);
        pinBottomSheetDialogFragment.A04.setErrorState(false);
        pinBottomSheetDialogFragment.A04.setEnabled(true);
    }

    public void onTick(long j) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        TextView textView = pinBottomSheetDialogFragment.A03;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = AnonymousClass3UY.A07(pinBottomSheetDialogFragment.A06, C36391kE.A0B(j));
        C36381kD.A1E(textView, pinBottomSheetDialogFragment, A0L, R.string.f12nameremoved);
    }
}
