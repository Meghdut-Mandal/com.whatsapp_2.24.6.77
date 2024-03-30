package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity;

/* renamed from: X.8he  reason: invalid class name and case insensitive filesystem */
public abstract class C178818he extends C178968iJ {
    public C19460v5 A00;
    public C179648kT A01;
    public String A02;

    public String A47() {
        if (this instanceof IndiaUpiPaymentsValuePropsBottomSheetActivity) {
            if (this.A02 == 14) {
                return "scan_qr_code_intro_prompt";
            }
            return "payment_intro_prompt";
        } else if (this instanceof IndiaUpiPaymentsValuePropsActivity) {
            return "payment_intro_screen";
        } else {
            return "incentive_value_prop";
        }
    }

    public void A48() {
        this.A01.A00.A08("valuePropsContinue");
        A4C(this.A02);
        C19460v5 r1 = this.A00;
        if (r1.A05()) {
            r1.A02();
            AnonymousClass00C.A0D(this.A07, 0);
            Intent A0G = C165597tg.A0G(this);
            this.A0o = true;
            A42(A0G);
            A0G.putExtra("extra_previous_screen", A47());
            AnonymousClass3M9.A01(A0G, "valuePropsContinue");
            A33(A0G, true);
            return;
        }
        finish();
    }

    public void A49() {
        if (this instanceof IndiaUpiIncentivesValuePropsActivity) {
            IndiaUpiIncentivesValuePropsActivity indiaUpiIncentivesValuePropsActivity = (IndiaUpiIncentivesValuePropsActivity) this;
            indiaUpiIncentivesValuePropsActivity.A01.A00.A0C(4);
            C176658cT A04 = indiaUpiIncentivesValuePropsActivity.A0S.A04(C36361kB.A0i(), C36371kC.A0n(), "incentive_value_prop", (String) null);
            A04.A01 = Boolean.valueOf(C173858Tk.A0x(indiaUpiIncentivesValuePropsActivity));
            C173858Tk.A0r(A04, indiaUpiIncentivesValuePropsActivity);
            return;
        }
        this.A01.A00.A0C(4);
        this.A0S.A09(C36361kB.A0i(), C36371kC.A0n(), A47(), this.A02, this.A0i, this.A0h, AnonymousClass000.A1S(this.A02, 11));
    }

    public void A4A(TextSwitcher textSwitcher) {
        int i = this.A02;
        int i2 = R.string.f12nameremoved;
        if (i == 11) {
            i2 = R.string.f12nameremoved;
        }
        textSwitcher.setText(Html.fromHtml(getString(i2)));
        Context context = textSwitcher.getContext();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.f1nameremoved);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.f1nameremoved);
        textSwitcher.setInAnimation(loadAnimation);
        textSwitcher.setOutAnimation(loadAnimation2);
        C36331k8.A1F(new B7W(textSwitcher, this, 2), this.A04);
    }

    public void A4C(String str) {
        String str2 = str;
        if (this instanceof IndiaUpiIncentivesValuePropsActivity) {
            IndiaUpiIncentivesValuePropsActivity indiaUpiIncentivesValuePropsActivity = (IndiaUpiIncentivesValuePropsActivity) this;
            C176658cT A04 = indiaUpiIncentivesValuePropsActivity.A0S.A04(C36361kB.A0i(), C36371kC.A0p(), "incentive_value_prop", str);
            A04.A01 = Boolean.valueOf(C173858Tk.A0x(indiaUpiIncentivesValuePropsActivity));
            C173858Tk.A0r(A04, indiaUpiIncentivesValuePropsActivity);
            return;
        }
        this.A0S.A09(C36361kB.A0i(), 36, A47(), str2, this.A0i, this.A0h, AnonymousClass000.A1S(this.A02, 11));
    }

    public void A4B(Long l) {
        int i;
        Uri uri;
        C131606Ps r3 = null;
        if (!(getIntent() == null || (uri = (Uri) getIntent().getParcelableExtra("extra_deep_link_url")) == null)) {
            try {
                String queryParameter = uri.getQueryParameter("campaignID");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C131606Ps r1 = new C131606Ps((String) null, new C131606Ps[0]);
                    r1.A03("campaign_id", queryParameter);
                    r3 = r1;
                }
            } catch (Exception unused) {
            }
        }
        C176658cT A03 = this.A0S.A03(r3, C36381kD.A0m(), (Integer) null, A47(), this.A02, this.A0i, this.A0h, AnonymousClass000.A1S(this.A02, 11));
        if (l != null) {
            long longValue = l.longValue();
            if (longValue <= 10) {
                i = 1;
            } else if (longValue <= 15) {
                i = 2;
            } else {
                i = 4;
                if (longValue <= 20) {
                    i = 3;
                }
            }
            A03.A09 = Integer.valueOf(i);
            C36321k7.A1K(A03, "PAY: logContactBucketUserActionEvent event:", AnonymousClass000.A0u());
        }
        this.A0C.Bly(A03);
    }

    public void onBackPressed() {
        super.onBackPressed();
        A49();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02 = C165597tg.A0j(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A49();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        String str;
        super.onResume();
        this.A01.A00(getIntent());
        this.A01.A00.A08("valuePropsShown");
        C179648kT r4 = this.A01;
        int i = this.A03;
        long j = (long) this.A02;
        String str2 = this.A02;
        boolean A0x = C173858Tk.A0x(this);
        C21700zf r6 = r4.A00;
        if (i == 2) {
            str = "skip2fa";
        } else {
            str = "with2fa";
        }
        r6.A0A("setupMode", str, false);
        r6.A05.markerAnnotate(r6.A04.A06, "paymentsEntryPoint", j);
        if (str2 != null) {
            r6.A0A("referralScreen", str2, false);
        }
        r6.A0B("paymentsAccountExists", A0x, false);
    }
}
