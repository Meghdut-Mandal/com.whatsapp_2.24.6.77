package com.whatsapp.migration.transfer.ui;

import X.AnonymousClass001;
import X.AnonymousClass088;
import X.C1502074j;
import X.C18800tq;
import X.C18830tt;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C47042ch;
import X.C87464Ox;
import X.C89344We;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class P2pTransferQrScannerActivity extends C47042ch implements C87464Ox {
    public C33751fs A00;
    public C32681e1 A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A03 = C36381kD.A0W(A0B);
            this.A04 = C36351kA.A0X(A0B);
            this.A01 = C36351kA.A0p(r1);
            this.A00 = C36361kB.A0X(r1);
        }
    }

    public boolean Bge() {
        Log.i("fpm/P2pTransferQrScannerActivity/logout received from the server");
        return false;
    }

    public P2pTransferQrScannerActivity(int i) {
        this.A02 = false;
        C89344We.A00(this, 16);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = C36371kC.A0H(this).getInt("hint");
        C32681e1 r5 = this.A01;
        C33751fs r4 = this.A00;
        SpannableStringBuilder A022 = r5.A02(this, new C1502074j(r4, this, 22), C36391kE.A0v(this, "learn-more", AnonymousClass001.A0L(), 0, i), "learn-more");
        AnonymousClass088.A06(this.A02, R.style.f13nameremoved);
        C36391kE.A1C(getResources(), this.A02, R.color.f6nameremoved);
        this.A02.setGravity(8388611);
        this.A02.setText(A022);
        this.A02.setVisibility(0);
        C36331k8.A10(this.A02, this.A0D);
    }

    public P2pTransferQrScannerActivity() {
        this(0);
    }
}
