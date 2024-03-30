package X;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;

/* renamed from: X.7vk  reason: invalid class name and case insensitive filesystem */
public class C166407vk extends LinearLayout implements View.OnClickListener, C18700tb {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public C135086c7 A05;
    public C22830Awf A06;
    public AnonymousClass1QZ A07;
    public boolean A08;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A07;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void onClick(View view) {
        C195839Wg A012;
        String str;
        Intent A0z;
        int i;
        C175898bF r0;
        String str2;
        C175898bF r02;
        C18740tg.A06(this.A06);
        if (view.getId() == R.id.reset_upi_pin_container) {
            C22830Awf awf = this.A06;
            C135086c7 r03 = this.A05;
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) awf;
            if (r03 == null || C165577te.A1Z(r03)) {
                C175748az r2 = indiaUpiBankAccountDetailsActivity.A00;
                if (r2 == null || (r0 = r2.A08) == null) {
                    str = null;
                } else {
                    str = ((C175818b6) r0).A0A;
                }
                A0z = IndiaUpiPinPrimerFullSheetActivity.A0z(indiaUpiBankAccountDetailsActivity, r2, str, true);
                i = 1017;
            } else {
                C175748az r22 = indiaUpiBankAccountDetailsActivity.A00;
                if (r22 == null || (r02 = r22.A08) == null) {
                    str2 = null;
                } else {
                    str2 = ((C175818b6) r02).A0A;
                }
                A0z = IndiaUpiPinPrimerFullSheetActivity.A0z(indiaUpiBankAccountDetailsActivity, r22, str2, false);
                i = 1016;
            }
            indiaUpiBankAccountDetailsActivity.startActivityForResult(A0z, i);
        } else if (view.getId() == R.id.change_upi_pin_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity2 = (IndiaUpiBankAccountDetailsActivity) this.A06;
            Intent A0H = C36441kJ.A0H(indiaUpiBankAccountDetailsActivity2, IndiaUpiChangePinActivity.class);
            A0H.putExtra("extra_bank_account", indiaUpiBankAccountDetailsActivity2.A00);
            indiaUpiBankAccountDetailsActivity2.startActivity(A0H);
        } else if (view.getId() == R.id.switch_payment_provider_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity3 = (IndiaUpiBankAccountDetailsActivity) this.A06;
            AVX avx = new AVX(indiaUpiBankAccountDetailsActivity3, 32);
            C36331k8.A1F(new C183578r1(indiaUpiBankAccountDetailsActivity3, avx, 104), indiaUpiBankAccountDetailsActivity3.A0D);
        } else if (view.getId() == R.id.upi_international_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity4 = (IndiaUpiBankAccountDetailsActivity) this.A06;
            C176658cT A042 = indiaUpiBankAccountDetailsActivity4.A0D.A04(C36361kB.A0i(), 182, "payment_bank_account_details", "payment_home");
            A042.A0Y = "payment_home";
            indiaUpiBankAccountDetailsActivity4.A0D.BOl(A042);
            if (!C202809mh.A02(indiaUpiBankAccountDetailsActivity4.A0D, indiaUpiBankAccountDetailsActivity4.A06.A0B()) || (A012 = indiaUpiBankAccountDetailsActivity4.A0E.A01(indiaUpiBankAccountDetailsActivity4.A04.A0A)) == null || !A012.A02.equals("activated")) {
                Intent A0H2 = C36441kJ.A0H(indiaUpiBankAccountDetailsActivity4, IndiaUpiInternationalActivationActivity.class);
                A0H2.putExtra("extra_bank_account", indiaUpiBankAccountDetailsActivity4.A00);
                A0H2.putExtra("extra_referral_screen", "payment_bank_account_details");
                indiaUpiBankAccountDetailsActivity4.BuO(A0H2, 1019);
                return;
            }
            AnonymousClass3SJ.A01(indiaUpiBankAccountDetailsActivity4, 105);
        }
    }

    public void setInternationalActivationView(C207049uT r5) {
        View view = this.A01;
        if (view != null && this.A02 != null && r5 != null) {
            view.setOnClickListener(this);
            boolean z = r5.A02;
            View view2 = this.A02;
            if (z) {
                view2.setVisibility(0);
                this.A01.setVisibility(8);
                return;
            }
            view2.setVisibility(8);
            this.A01.setVisibility(0);
            TextView A0P = C36391kE.A0P(this, R.id.international_desc);
            if (A0P != null) {
                A0P.setText(r5.A00);
            }
        }
    }

    public C166407vk(Context context) {
        super(context);
        if (!this.A08) {
            this.A08 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        int A002 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        C165567td.A0n(this, R.id.change_icon, A002);
        C165567td.A0n(this, R.id.reset_icon, A002);
        C165567td.A0n(this, R.id.switch_payment_provider_icon, A002);
    }

    public void A00() {
        this.A05 = C165617ti.A0P(C146356vT.A00(), Boolean.class, C36371kC.A0m(), "isPinSet");
        this.A04.setText(R.string.f12nameremoved);
        this.A00.setVisibility(0);
    }
}
