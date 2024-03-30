package com.whatsapp.account.delete;

import X.AnonymousClass001;
import X.AnonymousClass155;
import X.AnonymousClass3LW;
import X.AnonymousClass3V6;
import X.AnonymousClass4XD;
import X.AnonymousClass4XL;
import X.C07200Ws;
import X.C1496972k;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C39001qm;
import X.C66923Xv;
import X.C89314Wb;
import X.C89634Xh;
import X.C89924Yk;
import X.C89974Yp;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;

public class DeleteAccountFeedback extends AnonymousClass155 {
    public static final int[] A09 = {R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved};
    public int A00;
    public int A01;
    public View A02;
    public EditText A03;
    public ScrollView A04;
    public C07200Ws A05;
    public DialogFragment A06;
    public boolean A07;
    public boolean A08;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        this.A04 = (ScrollView) findViewById(R.id.scroll_view);
        this.A03 = (EditText) findViewById(R.id.delete_reason_additional_comments_edittext);
        this.A02 = findViewById(R.id.bottom_button_container);
        TextView A0Q = C36391kE.A0Q(this, R.id.select_delete_reason);
        C36361kB.A0z(this, A0Q, this.A00, R.drawable.abc_spinner_textfield_background_material);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        if (bundle != null) {
            this.A01 = bundle.getInt("delete_reason_selected", -1);
            this.A07 = bundle.getBoolean("delete_reason_showing", false);
            EditText editText = this.A03;
            int i = this.A01;
            int i2 = R.string.f12nameremoved;
            if (i == 2) {
                i2 = R.string.f12nameremoved;
            }
            editText.setHint(i2);
        }
        int i3 = this.A01;
        int[] iArr = A09;
        if (i3 >= 6 || i3 < 0) {
            C36391kE.A1K(A0Q);
        } else {
            A0Q.setText(iArr[i3]);
        }
        this.A05 = new C07200Ws(this, findViewById(R.id.delete_reason_prompt), 0, R.attr.f4nameremoved, 0);
        int i4 = 0;
        do {
            this.A05.A03.add(0, i4, 0, iArr[i4]);
            i4++;
        } while (i4 < 6);
        C07200Ws r1 = this.A05;
        r1.A00 = new C89974Yp(this, 0);
        r1.A01 = new AnonymousClass4XD(A0Q, this, 0);
        C66923Xv.A01(A0Q, this, 23);
        C66923Xv.A01(findViewById(R.id.delete_account_submit), this, 24);
        this.A00.post(new C1496972k(this, 13));
        this.A00 = C36361kB.A02(this, R.dimen.f7nameremoved);
        C89634Xh.A00(this.A04.getViewTreeObserver(), this, 1);
        C89924Yk.A00(this.A04.getViewTreeObserver(), this, 1);
    }

    public class ChangeNumberMessageDialogFragment extends Hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment {
        public Dialog A1a(Bundle bundle) {
            int i = A0b().getInt("deleteReason", -1);
            String string = A0b().getString("additionalComments");
            C39001qm A03 = AnonymousClass3LW.A03(this);
            A03.A0Z(C36401kF.A0q(this, A0n(R.string.f12nameremoved), AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
            A03.setPositiveButton(R.string.f12nameremoved, AnonymousClass4XL.A00(this, 10));
            return C36431kI.A0R(new AnonymousClass3V6(this, string, i), A03, R.string.f12nameremoved);
        }
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("delete_reason_selected", this.A01);
        bundle.putBoolean("delete_reason_showing", this.A07);
        super.onSaveInstanceState(bundle);
    }

    public DeleteAccountFeedback(int i) {
        this.A08 = false;
        C89314Wb.A00(this, 12);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C89924Yk.A00(this.A04.getViewTreeObserver(), this, 1);
    }

    public void onStop() {
        super.onStop();
        C07200Ws r1 = this.A05;
        if (r1 != null) {
            r1.A00 = null;
            r1.A04.A01();
        }
    }

    public DeleteAccountFeedback() {
        this(0);
        this.A01 = -1;
        this.A07 = false;
    }
}
