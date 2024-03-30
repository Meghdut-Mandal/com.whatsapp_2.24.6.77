package com.whatsapp.passkey;

import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass6YV;
import X.C007403e;
import X.C18800tq;
import X.C18830tt;
import X.C20810yC;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36421kH;
import X.C61833Dp;
import X.C61943Ec;
import X.C88014Rb;
import X.C88024Rc;
import X.C89344We;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class PasskeyCreateEducationScreen extends AnonymousClass155 {
    public C61833Dp A00;
    public C88014Rb A01;
    public C61943Ec A02;
    public C88024Rc A03;
    public C007403e A04;
    public boolean A05;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        TextView A0Q = C36391kE.A0Q(this, R.id.passkey_create_screen_title);
        A0Q.setText(R.string.f12nameremoved);
        A0Q.setGravity(1);
        TextEmojiLabel A0I = C36421kH.A0I(this, R.id.passkey_create_screen_info_text);
        AnonymousClass00C.A0B(A0I);
        C20810yC r9 = this.A0D;
        AnonymousClass17Y r6 = this.A05;
        AnonymousClass6YV.A0E(this, Uri.parse("https://faq.whatsapp.com/5064231857013976"), this.A01, r6, A0I, this.A08, r9, getString(R.string.f12nameremoved), "passkeys_learn_more_uri");
        A0I.setGravity(1);
        C36391kE.A1I(C36361kB.A0D(this, R.id.passkey_create_screen_create_button), this, 1);
        C36351kA.A0r(this, R.id.passkey_create_screen_skip_button_view_stub).A03(0);
        C36391kE.A1I(C36361kB.A0D(this, R.id.skip_passkey_create_button), this, 0);
        C88024Rc r1 = this.A03;
        if (r1 != null) {
            C61943Ec B41 = r1.B41(1);
            this.A02 = B41;
            B41.A00(20, (Throwable) null);
            return;
        }
        throw C36331k8.A0d("passkeyLoggerFactory");
    }

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            String string = getString(R.string.f12nameremoved);
            ProgressDialog progressDialog = new ProgressDialog(this);
            C36331k8.A0p(progressDialog, string);
            AnonymousClass00C.A0B(progressDialog);
            return progressDialog;
        }
        Dialog onCreateDialog = super.onCreateDialog(i);
        AnonymousClass00C.A08(onCreateDialog);
        return onCreateDialog;
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A01 = (C88014Rb) A0L.A3F.get();
            this.A03 = (C88024Rc) A0L.A3G.get();
            this.A00 = C27111My.A2l(A0L);
        }
    }

    public PasskeyCreateEducationScreen(int i) {
        this.A05 = false;
        C89344We.A00(this, 35);
    }

    public PasskeyCreateEducationScreen() {
        this(0);
    }
}
