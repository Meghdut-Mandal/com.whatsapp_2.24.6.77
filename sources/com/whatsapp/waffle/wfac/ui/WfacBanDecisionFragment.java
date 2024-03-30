package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass00C;
import X.AnonymousClass0BN;
import X.C135596cx;
import X.C20810yC;
import X.C21060yb;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C80353vG;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class WfacBanDecisionFragment extends Hilt_WfacBanDecisionFragment {
    public WfacBanViewModel A00;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        A10(false);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        WfacBanViewModel wfacBanViewModel = (WfacBanViewModel) C36381kD.A0P(this).A00(WfacBanViewModel.class);
        AnonymousClass00C.A0D(wfacBanViewModel, 0);
        this.A00 = wfacBanViewModel;
        WfacBanViewModel.A02(A0i());
        WfacBanViewModel wfacBanViewModel2 = this.A00;
        if (wfacBanViewModel2 != null) {
            int A0S = wfacBanViewModel2.A0S();
            WfacBanViewModel wfacBanViewModel3 = this.A00;
            if (wfacBanViewModel3 != null) {
                int i = wfacBanViewModel3.A00;
                C36391kE.A18(A0a(), C36341k9.A0L(view, R.id.ban_icon), R.drawable.icon_banned);
                C36341k9.A0M(view, R.id.heading).setText(R.string.f12nameremoved);
                TextEmojiLabel A0O = C36351kA.A0O(view, R.id.sub_heading);
                C32681e1 r6 = this.A03;
                if (r6 != null) {
                    SpannableString A01 = r6.A01(A0O.getContext(), A0n(R.string.f12nameremoved), new Runnable[]{new C80353vG(this, A0S, i, 8)}, new String[]{"terms-of-service-link"}, new String[]{"https://www.whatsapp.com/legal/updates/terms-of-service"});
                    Rect rect = AnonymousClass0BN.A0A;
                    C21060yb r0 = this.A01;
                    if (r0 != null) {
                        C36331k8.A16(A0O, r0);
                        C20810yC r02 = this.A02;
                        if (r02 != null) {
                            C36331k8.A1A(r02, A0O);
                            A0O.setText(A01);
                            TextView A0M = C36341k9.A0M(view, R.id.action_button);
                            A0M.setText(R.string.f12nameremoved);
                            A0M.setOnClickListener(new C135596cx((Object) this, A0S, i, 0));
                            A1Z().A01("show_ban_decision_screen", A0S, i);
                            return;
                        }
                        throw C36321k7.A07();
                    }
                    throw C36331k8.A0W();
                }
                throw C36331k8.A0d("linkifier");
            }
            throw C36331k8.A0a();
        }
        throw C36331k8.A0a();
    }
}
