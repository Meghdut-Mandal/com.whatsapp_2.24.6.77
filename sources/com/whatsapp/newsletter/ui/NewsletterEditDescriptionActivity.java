package com.whatsapp.newsletter.ui;

import X.AnonymousClass1N6;
import X.B7Y;
import X.C03570Gk;
import X.C165567td;
import X.C173848Tj;
import X.C178248fc;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C44072La;
import X.C90504aG;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.WaEditText;

public final class NewsletterEditDescriptionActivity extends C178248fc {
    public AnonymousClass1N6 A00;
    public boolean A01;

    public boolean A2g() {
        return true;
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A08 = C36351kA.A0a(r2);
            C173848Tj.A01(A0L, r2, this);
            this.A00 = C90504aG.A0V(r2);
        }
    }

    public void A2X() {
        AnonymousClass1N6 r2 = this.A00;
        if (r2 != null) {
            r2.A03(this.A0B, 32);
            super.A2X();
            return;
        }
        throw C36331k8.A0d("navigationTimeSpentManager");
    }

    public NewsletterEditDescriptionActivity(int i) {
        this.A01 = false;
        B7Y.A00(this, 21);
    }

    public void A3s() {
        super.A3s();
        ((TextView) C03570Gk.A0B(this, R.id.newsletter_save_button)).setText(R.string.f12nameremoved);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String A0y;
        super.onCreate(bundle);
        if (this.A0B == null) {
            finish();
            return;
        }
        C44072La A3k = A3k();
        if (A3k != null) {
            WaEditText A3j = A3j();
            String str2 = A3k.A0K;
            String str3 = "";
            if (str2 == null || (str = C36371kC.A0y(str2)) == null) {
                str = str3;
            }
            A3j.setText(str);
            WaEditText A3i = A3i();
            String str4 = A3k.A0H;
            if (!(str4 == null || (A0y = C36371kC.A0y(str4)) == null)) {
                str3 = A0y;
            }
            A3i.setText(str3);
            ImageView imageView = this.A00;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            throw C36331k8.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        }
    }

    public NewsletterEditDescriptionActivity() {
        this(0);
    }
}
