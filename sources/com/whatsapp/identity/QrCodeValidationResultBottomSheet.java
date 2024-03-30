package com.whatsapp.identity;

import X.AnonymousClass00C;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public final class QrCodeValidationResultBottomSheet extends WDSBottomSheetDialogFragment {
    public View.OnClickListener A00;
    public View.OnClickListener A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        TextView A0F = C36351kA.A0F(view, R.id.qr_validation_result_message);
        Bundle bundle2 = this.A0A;
        if (bundle2 == null || !bundle2.getBoolean("is_valid")) {
            A0F.setText(R.string.f12nameremoved);
            i = R.id.qr_validation_failure_icon;
        } else {
            A0F.setText(R.string.f12nameremoved);
            i = R.id.qr_validation_success_icon_animation;
        }
        C36341k9.A10(view, i, 0);
        View findViewById = view.findViewById(R.id.done_button);
        View.OnClickListener onClickListener = this.A01;
        if (onClickListener != null) {
            findViewById.setOnClickListener(onClickListener);
            return;
        }
        throw C36331k8.A0d("doneButtonClickListener");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(this.A0F);
            return;
        }
        throw C36331k8.A0d("dismissClickListener");
    }
}
