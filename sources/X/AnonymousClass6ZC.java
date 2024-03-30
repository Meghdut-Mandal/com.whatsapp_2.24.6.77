package X;

import android.app.Dialog;
import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;

/* renamed from: X.6ZC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6ZC implements DialogInterface.OnShowListener {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ RoundedBottomSheetDialogFragment A01;

    public /* synthetic */ AnonymousClass6ZC(Dialog dialog, RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment) {
        this.A01 = roundedBottomSheetDialogFragment;
        this.A00 = dialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.A01.A1n(AnonymousClass0PN.A00(this.A00, R.id.design_bottom_sheet));
    }
}
