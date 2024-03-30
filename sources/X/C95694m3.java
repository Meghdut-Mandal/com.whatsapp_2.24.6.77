package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.R;

/* renamed from: X.4m3  reason: invalid class name and case insensitive filesystem */
public class C95694m3 extends GridLayoutManager {
    public int A00 = 0;
    public final /* synthetic */ IntentChooserBottomSheetDialogFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95694m3(IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment) {
        super(4);
        this.A01 = intentChooserBottomSheetDialogFragment;
    }

    public void A1D(C02760Bu r5, AnonymousClass0C4 r6) {
        int dimensionPixelSize;
        int i = this.A03;
        if (i > 0 && i != this.A00) {
            this.A00 = i;
            IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = this.A01;
            if (intentChooserBottomSheetDialogFragment.A02.A0E(689) && (dimensionPixelSize = C36341k9.A0G(intentChooserBottomSheetDialogFragment).getDimensionPixelSize(R.dimen.f7nameremoved)) > 0) {
                A1o(Math.max(1, ((i - A0P()) - A0O()) / dimensionPixelSize));
            }
        }
        super.A1D(r5, r6);
    }
}
