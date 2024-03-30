package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass14B;
import X.AnonymousClass17Y;
import X.AnonymousClass1N2;
import X.AnonymousClass1N3;
import X.AnonymousClass3Y9;
import X.AnonymousClass4VZ;
import X.C012005e;
import X.C19420v0;
import X.C20810yC;
import X.C21060yb;
import X.C32691e2;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36441kJ;
import X.C429721s;
import X.C65563So;
import X.C65943Ub;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public class BanAppealFormFragment extends Hilt_BanAppealFormFragment {
    public EditText A00;
    public AnonymousClass17Y A01;
    public C32691e2 A02;
    public AnonymousClass1N3 A03;
    public C21060yb A04;
    public C20810yC A05;
    public BanAppealViewModel A06;
    public AnonymousClass1N2 A07;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A10(true);
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1K() {
        super.A1K();
        String A0n = C36361kB.A0n(this.A00);
        C65563So r1 = this.A06.A08;
        Log.i("BanAppealRepository/storeFormReviewDraft");
        C36341k9.A0x(C19420v0.A00(r1.A06), "support_ban_appeal_form_review_draft", A0n);
    }

    public void A1L() {
        super.A1L();
        C65563So r1 = this.A06.A08;
        Log.i("BanAppealRepository/getFormReviewDraft");
        String A0t = C36371kC.A0t(C36341k9.A0E(r1.A06), "support_ban_appeal_form_review_draft");
        if (A0t != null) {
            this.A00.setText(A0t);
        }
    }

    public void A1S(Bundle bundle, View view) {
        this.A06 = C36351kA.A0o(this);
        BanAppealViewModel.A02(A0i(), true);
        this.A00 = (EditText) C012005e.A02(view, R.id.form_appeal_reason);
        AnonymousClass3Y9.A00(C012005e.A02(view, R.id.submit_button), this, 41);
        this.A06.A02.A08(A0i(), new C65943Ub(this, 2));
        TextEmojiLabel A0O = C36401kF.A0O(view, R.id.heading);
        C36331k8.A1A(this.A05, A0O);
        C36331k8.A16(A0O, this.A04);
        SpannableStringBuilder A0P = C36441kJ.A0P(AnonymousClass14B.A01(A1D(), new Object[]{this.A03.A00("https://www.whatsapp.com/legal/terms-of-service#terms-of-service-acceptable-use-of-our-services").toString()}, R.string.f12nameremoved));
        URLSpan[] A1a = C36381kD.A1a(A0P, 0);
        if (A1a != null) {
            for (URLSpan uRLSpan : A1a) {
                A0P.setSpan(C429721s.A00(A1D(), uRLSpan, this.A02, this.A01, this.A04), A0P.getSpanStart(uRLSpan), A0P.getSpanEnd(uRLSpan), A0P.getSpanFlags(uRLSpan));
                A0P.removeSpan(uRLSpan);
            }
        }
        A0O.setText(A0P);
        A0i().A05.A01(new AnonymousClass4VZ(this, 3), A0m());
    }

    public boolean A1X(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A06.A0T();
        return true;
    }
}
