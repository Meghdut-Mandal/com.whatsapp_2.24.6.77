package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass3Y9;
import X.C21060yb;
import X.C32681e1;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C81073wQ;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealBannedDecisionFragment extends Hilt_BanAppealBannedDecisionFragment {
    public C21060yb A00;
    public BanAppealViewModel A01;
    public C32681e1 A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.A1G(bundle, layoutInflater, viewGroup);
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        this.A01 = C36351kA.A0o(this);
        BanAppealViewModel.A02(A0i(), false);
        C36401kF.A0G(view, R.id.ban_icon).setImageDrawable(C36341k9.A0G(this).getDrawable(R.drawable.icon_banned));
        C36391kE.A0O(view, R.id.heading).setText(R.string.f12nameremoved);
        TextEmojiLabel A0O = C36401kF.A0O(view, R.id.sub_heading);
        SpannableString A012 = this.A02.A01(A0O.getContext(), A0n(R.string.f12nameremoved), new Runnable[]{C81073wQ.A00}, new String[]{"terms-of-service-link"}, new String[]{"https://www.whatsapp.com/legal/updates/terms-of-service"});
        C36331k8.A16(A0O, this.A00);
        C36331k8.A1A(this.A05, A0O);
        A0O.setText(A012);
        TextView A0O2 = C36391kE.A0O(view, R.id.action_button);
        A0O2.setText(R.string.f12nameremoved);
        AnonymousClass3Y9.A00(A0O2, this, 40);
    }
}
