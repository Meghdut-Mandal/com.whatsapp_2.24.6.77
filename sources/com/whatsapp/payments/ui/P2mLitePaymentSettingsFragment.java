package com.whatsapp.payments.ui;

import X.AF6;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass155;
import X.AnonymousClass1XA;
import X.C012005e;
import X.C165567td;
import X.C167677yY;
import X.C180238lQ;
import X.C194209On;
import X.C194509Pz;
import X.C20310xM;
import X.C207249un;
import X.C29131Vl;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.List;

public final class P2mLitePaymentSettingsFragment extends Hilt_P2mLitePaymentSettingsFragment {
    public View A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public C20310xM A04;
    public AnonymousClass1XA A05;
    public AF6 A06;
    public C194509Pz A07;
    public C180238lQ A08;
    public C194209On A09;
    public C29131Vl A0A;

    public void A1J() {
        this.A08 = null;
        this.A02 = null;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        super.A1J();
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C012005e.A02(view, R.id.payment_methods_container).setVisibility(8);
        C36351kA.A1A(view, R.id.payment_history_separator, 8);
        this.A00 = view.findViewById(R.id.payment_settings_row_separator);
        LinearLayout A0U = C36441kJ.A0U(view, R.id.payment_settings_row_remove_method);
        this.A02 = A0U;
        if (A0U != null) {
            C36421kH.A13(A0U, this, 23);
        }
        Context A1D = A1D();
        if (A1D != null) {
            int A002 = AnonymousClass00F.A00(A1D, R.color.f6nameremoved);
            if (Integer.valueOf(A002) != null) {
                C165567td.A0n(view, R.id.delete_payments_account_icon, A002);
            }
        }
        C36391kE.A0P(view, R.id.delete_payments_account_label).setText(R.string.f12nameremoved);
        Context A1D2 = A1D();
        if (A1D2 != null) {
            int A003 = AnonymousClass00F.A00(A1D2, R.color.f6nameremoved);
            if (Integer.valueOf(A003) != null) {
                C165567td.A0n(view, R.id.request_dyi_report_icon, A003);
            }
        }
        LinearLayout A0U2 = C36441kJ.A0U(view, R.id.request_dyi_report_button);
        this.A03 = A0U2;
        if (A0U2 != null) {
            C36421kH.A13(A0U2, this, 24);
        }
        LinearLayout A0U3 = C36441kJ.A0U(view, R.id.payment_support_container);
        this.A01 = A0U3;
        if (A0U3 != null) {
            C36421kH.A13(A0U3, this, 25);
        }
        C36341k9.A0Y(view, R.id.payment_support_section_separator).A03(8);
        C36391kE.A18(A0a(), C36391kE.A0N(view, R.id.payment_support_icon), R.drawable.ic_help);
        C165567td.A0n(view, R.id.payment_support_icon, AnonymousClass00F.A00(A0a(), R.color.f6nameremoved));
        C36391kE.A0P(view, R.id.payment_support_title).setText(R.string.f12nameremoved);
        this.A19.A00 = 3;
        AnonymousClass01I A0h = A0h();
        AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        this.A07 = new C194509Pz((AnonymousClass155) A0h);
    }

    public void BQr(boolean z) {
    }

    public void BcR(C207249un r1) {
    }

    public boolean BtK() {
        return false;
    }

    public static final void A03(P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        boolean z = p2mLitePaymentSettingsFragment.A0Z.A03().getBoolean("has_p2mlite_account", false);
        int i = 8;
        LinearLayout linearLayout = p2mLitePaymentSettingsFragment.A02;
        if (z) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            View view = p2mLitePaymentSettingsFragment.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            if (p2mLitePaymentSettingsFragment.A02.A0E(2727)) {
                i = 0;
            }
        } else {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            View view2 = p2mLitePaymentSettingsFragment.A00;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        LinearLayout linearLayout2 = p2mLitePaymentSettingsFragment.A03;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(i);
        }
    }

    public void Bx7(List list) {
        super.Bx7(list);
        C180238lQ r0 = this.A08;
        if (r0 != null) {
            r0.A04 = list;
        }
        C167677yY r2 = this.A0m;
        if (r2 != null) {
            r2.A0X(this.A0h, this.A0n);
        }
        A03(this);
    }
}
