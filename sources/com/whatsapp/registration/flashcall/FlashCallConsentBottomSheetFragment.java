package com.whatsapp.registration.flashcall;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass155;
import X.AnonymousClass3DM;
import X.C012005e;
import X.C21520zN;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C67133Yq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public final class FlashCallConsentBottomSheetFragment extends Hilt_FlashCallConsentBottomSheetFragment {
    public C21520zN A00;
    public AnonymousClass3DM A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        AnonymousClass00C.A0B(inflate);
        C67133Yq.A00(inflate.findViewById(R.id.flash_call_consent_continue_button), this, 15);
        TextView A0P = C36391kE.A0P(inflate, R.id.flash_call_consent_not_now_button);
        C21520zN r1 = this.A00;
        if (r1 != null) {
            if (r1.A0E(6370)) {
                A0P.setText(R.string.f12nameremoved);
            }
            C67133Yq.A00(A0P, this, 13);
            AnonymousClass3DM r3 = this.A01;
            if (r3 != null) {
                AnonymousClass01I A0i = A0i();
                AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
                r3.A00(C36361kB.A0R(inflate, R.id.flash_call_consent_code_bottom_sheet_description), (AnonymousClass155) A0i, R.string.f12nameremoved);
                return inflate;
            }
            throw C36331k8.A0d("primaryFlashCallUtils");
        }
        throw C36331k8.A0d("abPreChatdProps");
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C67133Yq.A00(C012005e.A02(view, R.id.flash_call_consent_bottom_sheet_close_button), this, 14);
    }
}
