package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import java.util.LinkedList;

/* renamed from: X.8i1  reason: invalid class name and case insensitive filesystem */
public abstract class C178868i1 extends C179218jR {
    public C20310xM A00;
    public C29221Vu A01;
    public AnonymousClass1YK A02;
    public C24601Db A03;
    public C29121Vk A04;
    public C202939my A05;
    public AnonymousClass1XA A06;
    public AnonymousClass6PS A07;
    public AnonymousClass646 A08;
    public C93084fb A09;
    public C166377ve A0A;
    public C29131Vl A0B;
    public FrameLayout A0C;
    public final C24611Dc A0D = C165607th.A0c("PaymentCardDetailsActivity", "payment-settings");

    public void A3l() {
        A07(this, 1);
        if (this.A09 != null) {
            boolean A0E = this.A0D.A0E(1927);
            C93084fb r3 = this.A09;
            String str = this.A04.A0A;
            int i = 17;
            if (A0E) {
                i = 16;
            }
            r3.setAlertButtonClickListener(new AnonymousClass9v1(i, str, this));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            this.A0D.A06("onActivityResult 1");
            AVY.A00(this.A0D, this, 30);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public static void A07(C178868i1 r2, int i) {
        r2.A09 = new C93084fb(r2);
        r2.A0C.removeAllViews();
        r2.A0C.addView(r2.A09);
        C166377ve r0 = r2.A0A;
        if (r0 != null) {
            r0.setBottomDividerSpaceVisibility(8);
            r2.A09.setTopDividerVisibility(8);
        }
        r2.A09.setAlertType(i);
    }

    public void A3m(AnonymousClass1XD r5, String str, String str2) {
        C29121Vk r3 = this.A04;
        LinkedList A0l = C90524aI.A0l();
        C36381kD.A1M("action", "edit-default-credential", A0l);
        C36381kD.A1M("credential-id", str, A0l);
        C36381kD.A1M("version", "2", A0l);
        if (!TextUtils.isEmpty(str2)) {
            C36381kD.A1M("payment-type", C165617ti.A0Z(str2), A0l);
        }
        r3.A0C(r5, C203399nx.A06(A0l));
    }

    public void A3j(C207249un r4, boolean z) {
        super.A3j(r4, z);
        C175798b4 r2 = (C175798b4) r4;
        C18740tg.A06(r2);
        this.A0G.setText(C203449o2.A02(this, r2));
        C175898bF r0 = r2.A08;
        if (r0 != null) {
            boolean A092 = r0.A09();
            CopyableTextView copyableTextView = this.A0H;
            if (!A092) {
                copyableTextView.setText(R.string.f12nameremoved);
                this.A0H.A03 = null;
                A3l();
            } else {
                copyableTextView.setVisibility(8);
            }
        }
        C175898bF r02 = r4.A08;
        C18740tg.A06(r02);
        if (r02.A09()) {
            C93084fb r03 = this.A09;
            if (r03 != null) {
                r03.setVisibility(8);
                C166377ve r1 = this.A0A;
                if (r1 != null) {
                    r1.setBottomDividerSpaceVisibility(0);
                }
            }
            this.A0H.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(R.string.f12nameremoved);
            boolean z = this instanceof BrazilPaymentCardDetailsActivity;
            AnonymousClass07B supportActionBar2 = getSupportActionBar();
            if (z) {
                if (supportActionBar2 != null) {
                    supportActionBar2.A0U(true);
                    int currentContentInsetRight = this.A0C.getCurrentContentInsetRight();
                    this.A0C.A0H(C178888i4.A0F(this, R.style.f13nameremoved), currentContentInsetRight);
                }
                i = C178888i4.A0F(this, R.style.f13nameremoved);
            } else {
                if (supportActionBar2 != null) {
                    supportActionBar2.A0U(true);
                    int currentContentInsetRight2 = this.A0C.getCurrentContentInsetRight();
                    this.A0C.A0H(C178888i4.A0F(this, R.style.f13nameremoved), currentContentInsetRight2);
                }
                i = 0;
            }
            this.A0C.A0H(this.A0C.getCurrentContentInsetLeft(), i);
        }
        this.A0C = (FrameLayout) findViewById(R.id.method_details_alert_container);
    }
}
