package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass3U8;
import X.AnonymousClass4RO;
import X.C012005e;
import X.C131606Ps;
import X.C19730wQ;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SubscriptionInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

public class IndiaUpiSimPickerDialogFragment extends Hilt_IndiaUpiSimPickerDialogFragment {
    public C19730wQ A00;
    public AF7 A01;
    public AnonymousClass4RO A02;
    public List A03;

    public void A1S(Bundle bundle, View view) {
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            this.A03 = bundle2.getParcelableArrayList("extra_subscriptions");
        }
        View view2 = view;
        C36381kD.A1E(C36391kE.A0O(view2, R.id.title), this, new Object[]{AnonymousClass3U8.A04(C36351kA.A0j(C36381kD.A0T(this.A00)))}, R.string.f12nameremoved);
        ViewGroup A0O = C36411kG.A0O(view2, R.id.radio_group);
        A0O.removeAllViews();
        C131606Ps r12 = new C131606Ps(new C131606Ps[0]);
        if (this.A03 != null) {
            int i = 0;
            while (i < this.A03.size()) {
                SubscriptionInfo subscriptionInfo = (SubscriptionInfo) this.A03.get(i);
                TextView textView = (TextView) LayoutInflater.from(A1D()).inflate(R.layout.f9nameremoved, A0O, false);
                textView.setId(i);
                int i2 = i + 1;
                if (Build.VERSION.SDK_INT < 22 || TextUtils.isEmpty(subscriptionInfo.getDisplayName())) {
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1L(objArr, i2, 0);
                    C36381kD.A1E(textView, this, objArr, R.string.f12nameremoved);
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1L(objArr2, i2, 0);
                    A0u.append(A0o(R.string.f12nameremoved, objArr2));
                    A0u.append(" - ");
                    textView.setText(AnonymousClass000.A0o(subscriptionInfo.getDisplayName(), A0u));
                    r12.A03(AnonymousClass000.A0r("SIM_", AnonymousClass000.A0u(), i), String.valueOf(subscriptionInfo.getDisplayName()));
                }
                A0O.addView(textView);
                i = i2;
            }
            if (A0O.getChildCount() > 0) {
                ((CompoundButton) A0O.getChildAt(0)).setChecked(true);
            }
        }
        this.A01.BOp(r12, 0, (Integer) null, "payments_device_binding_sim_picker", "payments_device_binding_precheck");
        C36421kH.A13(C012005e.A02(view2, R.id.cancel_button), this, 19);
        C36371kC.A1F(C012005e.A02(view2, R.id.confirm_button), this, A0O, 35);
    }

    public void A19() {
        super.A19();
        this.A02 = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1M() {
        super.A1M();
        Dialog dialog = this.A02;
        if (dialog != null && dialog.getWindow() != null) {
            this.A02.getWindow().setLayout(-1, -2);
        }
    }

    public void A1O(Context context) {
        super.A1O(context);
        try {
            this.A02 = (AnonymousClass4RO) A0h();
        } catch (ClassCastException e) {
            C36321k7.A1W("onAttach:", AnonymousClass000.A0u(), e);
        }
    }

    public /* synthetic */ void A1k(RadioGroup radioGroup) {
        List list;
        A1b();
        if (this.A02 != null && (list = this.A03) != null) {
            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) list.get(radioGroup.getCheckedRadioButtonId());
            C131606Ps r4 = new C131606Ps(new C131606Ps[0]);
            r4.A03("sim_slot_picked", String.valueOf(radioGroup.getCheckedRadioButtonId()));
            if (Build.VERSION.SDK_INT >= 22 && !TextUtils.isEmpty(subscriptionInfo.getDisplayName())) {
                r4.A03("sim_carrier_picked", String.valueOf(subscriptionInfo.getDisplayName()));
            }
            this.A01.BOp(r4, C36361kB.A0i(), (Integer) null, "payments_device_binding_sim_picker", "payments_device_binding_precheck");
            this.A02.Bgk(subscriptionInfo);
        }
    }
}
