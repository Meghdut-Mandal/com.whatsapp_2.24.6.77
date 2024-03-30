package X;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentContactOmbudsmanActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportP2pActivity;
import com.whatsapp.payments.ui.BrazilPaymentDPOActivity;
import com.whatsapp.payments.ui.BrazilPaymentIntegrityAppealActivity;
import com.whatsapp.payments.ui.BrazilPaymentReportPaymentActivity;

/* renamed from: X.24a  reason: invalid class name */
public abstract class AnonymousClass24a extends AnonymousClass155 {
    public View A00;
    public Button A01;
    public EditText A02;
    public TextView A03;
    public TextView A04;
    public C39831tt A05;
    public TextView A06;
    public TextView A07;

    public void A3j() {
        C39831tt r0;
        if (this instanceof BrazilPaymentReportPaymentActivity) {
            r0 = ((BrazilPaymentReportPaymentActivity) this).A00;
        } else if (this instanceof BrazilPaymentDPOActivity) {
            r0 = ((BrazilPaymentDPOActivity) this).A00;
        } else if (this instanceof BrazilPaymentContactSupportP2pActivity) {
            r0 = ((BrazilPaymentContactSupportP2pActivity) this).A00;
        } else if (this instanceof BrazilPaymentContactSupportActivity) {
            BrazilPaymentContactSupportActivity brazilPaymentContactSupportActivity = (BrazilPaymentContactSupportActivity) this;
            if (brazilPaymentContactSupportActivity instanceof BrazilPaymentIntegrityAppealActivity) {
                r0 = ((BrazilPaymentIntegrityAppealActivity) brazilPaymentContactSupportActivity).A00;
            } else {
                r0 = brazilPaymentContactSupportActivity.A00;
            }
        } else {
            r0 = ((BrazilPaymentContactOmbudsmanActivity) this).A00;
        }
        this.A05 = r0;
        C18740tg.A06(r0.A01.A04());
        this.A05.A01.A08(this, new C65993Ug(this, 22));
        this.A05.A09.A08(this, new C65993Ug(this, 23));
    }

    public void A3i() {
        int i;
        Spanned fromHtml;
        int i2;
        int i3;
        this.A00 = findViewById(R.id.transaction_header);
        this.A07 = C36391kE.A0Q(this, R.id.describe_problem_instructions);
        this.A02 = (EditText) findViewById(R.id.describe_problem_field);
        this.A04 = C36391kE.A0Q(this, R.id.describe_problem_field_error);
        this.A01 = (Button) findViewById(R.id.contact_support_send_button);
        this.A06 = C36391kE.A0Q(this, R.id.help_center_link);
        this.A03 = C36391kE.A0Q(this, R.id.describe_contact_info);
        this.A00.setVisibility(8);
        int i4 = Build.VERSION.SDK_INT;
        Resources resources = getResources();
        boolean z = this instanceof BrazilPaymentReportPaymentActivity;
        if (z) {
            i = R.string.f12nameremoved;
        } else if (this instanceof BrazilPaymentDPOActivity) {
            i = R.string.f12nameremoved;
        } else if ((this instanceof BrazilPaymentContactSupportP2pActivity) || (this instanceof BrazilPaymentContactSupportActivity)) {
            i = R.string.f12nameremoved;
        } else {
            i = R.string.f12nameremoved;
        }
        String string = resources.getString(i);
        if (i4 >= 24) {
            fromHtml = Html.fromHtml(string, 63);
        } else {
            fromHtml = Html.fromHtml(string);
        }
        this.A07.setText(fromHtml);
        EditText editText = this.A02;
        if (z) {
            i2 = R.string.f12nameremoved;
        } else if (this instanceof BrazilPaymentDPOActivity) {
            i2 = R.string.f12nameremoved;
        } else {
            i2 = R.string.f12nameremoved;
        }
        editText.setHint(i2);
        AnonymousClass4WJ.A00(this.A02, this, 16);
        C89574Xb.A00(this.A02, this, 5);
        Button button = this.A01;
        if (z || (this instanceof BrazilPaymentDPOActivity)) {
            i3 = R.string.f12nameremoved;
        } else {
            i3 = R.string.f12nameremoved;
        }
        button.setText(i3);
        C36391kE.A1I(this.A01, this, 13);
        C36391kE.A1I(this.A06, this, 14);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            if (this instanceof BrazilPaymentReportPaymentActivity) {
                i = R.string.f12nameremoved;
            } else if (this instanceof BrazilPaymentDPOActivity) {
                i = R.string.f12nameremoved;
            } else if ((this instanceof BrazilPaymentContactSupportP2pActivity) || (this instanceof BrazilPaymentContactSupportActivity)) {
                i = R.string.f12nameremoved;
            } else {
                i = R.string.f12nameremoved;
            }
            supportActionBar.A0I(i);
        }
        A3j();
        A3i();
        if (getIntent() != null) {
            this.A05.A0X(getIntent().getStringExtra("extra_transaction_id"));
        }
        C39831tt r1 = this.A05;
        C131606Ps A002 = C203049nB.A00();
        A002.A01(r1.A06);
        r1.A07.BOp(A002, C36381kD.A0m(), (Integer) null, r1.A0T(), (String) null);
    }
}
