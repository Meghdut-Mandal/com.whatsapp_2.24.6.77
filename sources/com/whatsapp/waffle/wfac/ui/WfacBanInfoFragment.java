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

public final class WfacBanInfoFragment extends Hilt_WfacBanInfoFragment {
    public WfacBanViewModel A00;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        A10(true);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        WfacBanViewModel wfacBanViewModel = (WfacBanViewModel) C36381kD.A0P(this).A00(WfacBanViewModel.class);
        this.A00 = wfacBanViewModel;
        if (wfacBanViewModel == null) {
            throw C36331k8.A0d("viewModel");
        }
        WfacBanViewModel.A02(A0i());
        WfacBanViewModel wfacBanViewModel2 = this.A00;
        if (wfacBanViewModel2 == null) {
            throw C36331k8.A0d("viewModel");
        }
        int A0S = wfacBanViewModel2.A0S();
        WfacBanViewModel wfacBanViewModel3 = this.A00;
        if (wfacBanViewModel3 == null) {
            throw C36331k8.A0d("viewModel");
        }
        int i2 = wfacBanViewModel3.A00;
        C36391kE.A18(A0a(), C36341k9.A0L(view, R.id.ban_icon), R.drawable.icon_banned);
        C36341k9.A0M(view, R.id.heading).setText(R.string.f12nameremoved);
        TextEmojiLabel A0O = C36351kA.A0O(view, R.id.sub_heading);
        int i3 = R.string.f12nameremoved;
        if (A0S == 1) {
            i3 = R.string.f12nameremoved;
        }
        C32681e1 r6 = this.A03;
        if (r6 != null) {
            SpannableString A01 = r6.A01(A0O.getContext(), A0n(i3), new Runnable[]{new C80353vG(this, A0S, i2, 9)}, new String[]{"terms-of-service-link"}, new String[]{"https://www.whatsapp.com/legal/updates/terms-of-service"});
            Rect rect = AnonymousClass0BN.A0A;
            C21060yb r0 = this.A01;
            if (r0 != null) {
                C36331k8.A16(A0O, r0);
                C20810yC r02 = this.A02;
                if (r02 != null) {
                    C36331k8.A1A(r02, A0O);
                    A0O.setText(A01);
                    TextView A0M = C36341k9.A0M(view, R.id.action_button);
                    if (A0S == 1) {
                        A0M.setText(R.string.f12nameremoved);
                        i = 1;
                    } else {
                        A0M.setText(R.string.f12nameremoved);
                        i = 2;
                    }
                    A0M.setOnClickListener(new C135596cx(this, A0S, i2, i));
                    A1Z().A01("show_ban_info_screen", A0S, i2);
                    return;
                }
                throw C36321k7.A07();
            }
            throw C36331k8.A0W();
        }
        throw C36331k8.A0d("linkifier");
    }
}
