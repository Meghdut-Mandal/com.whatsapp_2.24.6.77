package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass1DX;
import X.AnonymousClass1GX;
import X.AnonymousClass1QW;
import X.AnonymousClass3UF;
import X.AnonymousClass4RX;
import X.C18800tq;
import X.C18830tt;
import X.C25851Hx;
import X.C26861Lu;
import X.C27261Nn;
import X.C29151Vn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C47052cj;
import X.C603437m;
import X.C89354Wf;
import X.C89644Xi;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;

public class ContactQrActivity extends C47052cj implements AnonymousClass4RX {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r2 = A0B.A00;
            C36321k7.A0X(A0B, r2, this, C36321k7.A05(A0B, r2, this));
            this.A0K = C36351kA.A0g(A0B);
            this.A03 = C36401kF.A0J(A0B);
            this.A06 = C36371kC.A0R(A0B);
            this.A09 = C36341k9.A0R(A0B);
            this.A0U = (AnonymousClass1GX) A0B.A4k.get();
            this.A0C = C36341k9.A0S(A0B);
            this.A05 = (C26861Lu) A0B.A2c.get();
            this.A0O = C36381kD.A0f(A0B);
            this.A0D = C36411kG.A0b(A0B);
            this.A04 = C36351kA.A0K(A0B);
            this.A0L = C36361kB.A0c(A0B);
            this.A0H = C36341k9.A0T(A0B);
            this.A0J = (AnonymousClass1DX) A0B.AFJ.get();
            this.A0B = C36371kC.A0U(A0B);
            this.A0G = C36351kA.A0X(A0B);
            this.A0E = C36401kF.A0V(A0B);
            this.A0N = C36371kC.A0h(A0B);
            this.A0M = (AnonymousClass1QW) r2.A0Z.get();
            this.A0P = (C29151Vn) A0B.AVb.get();
            this.A0A = (C27261Nn) A0B.AQN.get();
            this.A0I = (C25851Hx) A0B.AGV.get();
            this.A08 = (C603437m) r2.A5d.get();
            this.A0F = C36411kG.A0c(A0B);
        }
    }

    public ContactQrActivity(int i) {
        this.A00 = false;
        C89354Wf.A00(this, 38);
    }

    public void A3j() {
        super.A3j();
        if (getResources().getBoolean(R.bool.f5nameremoved)) {
            setRequestedOrientation(1);
        }
        this.A0V = C36371kC.A0t(C36331k8.A06(this), "contact_qr_code");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass3UF.A09(this, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_contactqr_share) {
            A3i();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_contactqr_revoke) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A39(new C89644Xi(this, 5), new C89644Xi(this, 4), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
            return true;
        }
    }

    public ContactQrActivity() {
        this(0);
    }
}
