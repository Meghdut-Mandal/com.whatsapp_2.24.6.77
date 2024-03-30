package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.dialogs.PromptDialogFragment;

/* renamed from: X.3Ls  reason: invalid class name and case insensitive filesystem */
public class C63863Ls implements DialogInterface.OnShowListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C63863Ls(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        switch (this.A02) {
            case 0:
                FingerprintBottomSheet.A06(dialogInterface, (Bundle) this.A00, (FingerprintBottomSheet) this.A01);
                return;
            case 1:
                Object obj = this.A00;
                View findViewById = ((Dialog) this.A01).findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    BottomSheetBehavior A022 = BottomSheetBehavior.A02(findViewById);
                    A022.A0h = true;
                    C89194Vp.A00(A022, obj, 3);
                    return;
                }
                return;
            default:
                PromptDialogFragment promptDialogFragment = (PromptDialogFragment) this.A00;
                TextView textView = (TextView) ((Dialog) this.A01).getWindow().findViewById(16908299);
                C36331k8.A10(textView, promptDialogFragment.A02);
                C36371kC.A1I(textView, promptDialogFragment.A00);
                return;
        }
    }
}
