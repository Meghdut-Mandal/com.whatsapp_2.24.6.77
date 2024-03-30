package com.whatsapp.contact.picker.nativecontacts;

import X.AnonymousClass001;
import X.AnonymousClass00E;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.C18800tq;
import X.C18830tt;
import X.C20380xT;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36431kI;
import X.C66943Xx;
import X.C80223v3;
import X.C89324Wc;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

public final class NativeContactsOptInActivity extends AnonymousClass155 {
    public AnonymousClass190 A00;
    public C20380xT A01;
    public C32681e1 A02;
    public boolean A03;

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36351kA.A0h(A0B);
            this.A02 = C36351kA.A0p(r1);
            this.A01 = C36331k8.A0I(A0B);
        }
    }

    public NativeContactsOptInActivity(int i) {
        this.A03 = false;
        C89324Wc.A00(this, 39);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        setTitle("");
        Toolbar toolbar = (Toolbar) C36361kB.A0D(this, R.id.toolbar);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, toolbar);
        if (A0Q != null) {
            A0Q.A0U(true);
            Drawable A002 = AnonymousClass00E.A00(this, R.drawable.ic_backup_cancel);
            if (A002 != null) {
                toolbar.setNavigationIcon(A002);
            }
            View A0D = C36361kB.A0D(this, R.id.continue_button);
            View A0D2 = C36361kB.A0D(this, R.id.skip_button);
            TextView textView = (TextView) C36361kB.A0D(this, R.id.disclaimer_text);
            String A0x = C36351kA.A0x(this, "12345", AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
            C32681e1 r5 = this.A02;
            if (r5 != null) {
                textView.setText(r5.A03(textView.getContext(), C80223v3.A00(this, 9), A0x, "12345", C36341k9.A05(textView.getContext())));
                C36331k8.A0z(textView, this, this.A0D);
                C66943Xx.A00(A0D, this, 48);
                C66943Xx.A00(A0D2, this, 49);
                return;
            }
            throw C36331k8.A0b();
        }
        throw C36381kD.A0l();
    }

    public NativeContactsOptInActivity() {
        this(0);
    }
}
