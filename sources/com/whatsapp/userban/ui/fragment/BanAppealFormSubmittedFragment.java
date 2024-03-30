package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass14B;
import X.AnonymousClass17Y;
import X.AnonymousClass1N3;
import X.C21060yb;
import X.C32691e2;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C429721s;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealFormSubmittedFragment extends Hilt_BanAppealFormSubmittedFragment {
    public AnonymousClass17Y A00;
    public C32691e2 A01;
    public AnonymousClass1N3 A02;
    public C21060yb A03;
    public BanAppealViewModel A04;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A10(true);
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        if (!this.A01.A0B()) {
            C36391kE.A1F(menu, 1, R.string.f12nameremoved);
        }
        super.A1U(menu, menuInflater);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        this.A04 = C36351kA.A0o(this);
        BanAppealViewModel.A02(A0i(), true);
        TextEmojiLabel A0O = C36401kF.A0O(view, R.id.heading);
        C36331k8.A1A(this.A05, A0O);
        C36331k8.A16(A0O, this.A03);
        SpannableStringBuilder A0P = C36441kJ.A0P(AnonymousClass14B.A01(A1D(), new Object[]{this.A02.A00("https://www.whatsapp.com/legal/terms-of-service#terms-of-service-acceptable-use-of-our-services").toString()}, R.string.f12nameremoved));
        URLSpan[] A1a = C36381kD.A1a(A0P, 0);
        if (A1a != null) {
            for (URLSpan uRLSpan : A1a) {
                A0P.setSpan(C429721s.A00(A1D(), uRLSpan, this.A01, this.A00, this.A03), A0P.getSpanStart(uRLSpan), A0P.getSpanEnd(uRLSpan), A0P.getSpanFlags(uRLSpan));
                A0P.removeSpan(uRLSpan);
            }
        }
        A0O.setText(A0P);
    }

    public boolean A1X(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.A04.A0U(A0i(), false);
            return true;
        } else if (itemId != 16908332) {
            return super.A1X(menuItem);
        } else {
            C36341k9.A18(this.A04.A09, true);
            return true;
        }
    }
}
