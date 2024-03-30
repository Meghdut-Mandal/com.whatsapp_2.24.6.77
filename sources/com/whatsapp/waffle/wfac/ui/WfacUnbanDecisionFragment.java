package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass00C;
import X.AnonymousClass0BN;
import X.C135596cx;
import X.C20380xT;
import X.C20810yC;
import X.C21060yb;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C80353vG;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class WfacUnbanDecisionFragment extends Hilt_WfacUnbanDecisionFragment {
    public C20380xT A00;
    public WfacBanViewModel A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        A10(true);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        WfacBanViewModel wfacBanViewModel = (WfacBanViewModel) C36381kD.A0P(this).A00(WfacBanViewModel.class);
        this.A01 = wfacBanViewModel;
        if (wfacBanViewModel == null) {
            throw C36331k8.A0d("viewModel");
        }
        WfacBanViewModel.A02(A0i());
        WfacBanViewModel wfacBanViewModel2 = this.A01;
        if (wfacBanViewModel2 == null) {
            throw C36331k8.A0d("viewModel");
        }
        int A0S = wfacBanViewModel2.A0S();
        WfacBanViewModel wfacBanViewModel3 = this.A01;
        if (wfacBanViewModel3 == null) {
            throw C36331k8.A0d("viewModel");
        }
        int i = wfacBanViewModel3.A00;
        C36391kE.A18(A0a(), C36341k9.A0L(view, R.id.ban_icon), R.drawable.icon_unbanned);
        C36341k9.A0M(view, R.id.heading).setText(R.string.f12nameremoved);
        TextEmojiLabel A0O = C36351kA.A0O(view, R.id.sub_heading);
        C32681e1 r7 = this.A03;
        if (r7 != null) {
            Context context = A0O.getContext();
            String A0n = A0n(R.string.f12nameremoved);
            String[] strArr = {"using-whatsapp-responsibly-link"};
            String[] strArr2 = new String[1];
            C20380xT r5 = this.A00;
            if (r5 != null) {
                strArr2[0] = r5.A04("security-and-privacy", "how-to-use-whatsapp-responsibly").toString();
                SpannableString A012 = r7.A01(context, A0n, new Runnable[]{new C80353vG(this, A0S, i, 10)}, strArr, strArr2);
                Rect rect = AnonymousClass0BN.A0A;
                C21060yb r0 = this.A01;
                if (r0 != null) {
                    C36331k8.A16(A0O, r0);
                    C20810yC r02 = this.A02;
                    if (r02 != null) {
                        C36331k8.A1A(r02, A0O);
                        A0O.setText(A012);
                        C36361kB.A0G(view, R.id.action_button).setVisibility(8);
                        TextView A0M = C36341k9.A0M(view, R.id.action_button_2);
                        A0M.setVisibility(0);
                        A0M.setText(R.string.f12nameremoved);
                        A0M.setOnClickListener(new C135596cx((Object) this, A0S, i, 3));
                        A1Z().A01("show_ban_decision_screen", A0S, i);
                        return;
                    }
                    throw C36321k7.A07();
                }
                throw C36331k8.A0W();
            }
            throw C36331k8.A0d("faqLinkFactory");
        }
        throw C36331k8.A0d("linkifier");
    }
}
