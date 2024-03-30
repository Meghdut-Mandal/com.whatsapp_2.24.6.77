package com.whatsapp.payments.ui.mapper.register;

import X.AE0;
import X.AF7;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass1Pp;
import X.C135086c7;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C54932tn;
import X.C89354Wf;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.Me;
import com.whatsapp.R;

public final class IndiaUpiMapperConfirmationActivity extends AnonymousClass155 {
    public ImageView A00;
    public AnonymousClass1Pp A01;
    public AE0 A02;
    public AF7 A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = (AE0) A0B.A49.get();
            this.A01 = C36361kB.A0V(A0B);
            this.A03 = C36371kC.A0i(A0B);
        }
    }

    public final AF7 A3i() {
        AF7 af7 = this.A03;
        if (af7 != null) {
            return af7;
        }
        throw C36331k8.A0d("indiaUpiFieldStatsLogger");
    }

    public IndiaUpiMapperConfirmationActivity(int i) {
        this.A04 = false;
        C89354Wf.A00(this, 6);
    }

    public void onBackPressed() {
        super.onBackPressed();
        AF7 A3i = A3i();
        Integer A0i = C36361kB.A0i();
        A3i.BOm(A0i, A0i, "alias_complete", C36331k8.A0e(this));
    }

    public void onCreate(Bundle bundle) {
        String A022;
        String str;
        String str2;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        setContentView((int) R.layout.f9nameremoved);
        C54932tn.A00(this, R.drawable.onboarding_actionbar_home_close);
        TextView A0Q = C36391kE.A0Q(this, R.id.payment_name);
        C135086c7 r0 = (C135086c7) getIntent().getParcelableExtra("extra_payment_name");
        if (r0 == null || (A022 = (String) r0.A00) == null) {
            A022 = this.A0A.A02();
        }
        A0Q.setText(A022);
        A0Q.setGravity(C36421kH.A01(C36401kF.A1X(this.A00) ? 1 : 0));
        View findViewById = findViewById(R.id.mapper_confirm_done);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.vpa_id);
        TextView A0Q3 = C36391kE.A0Q(this, R.id.vpa_alias);
        ImageView imageView = (ImageView) C36361kB.A0H(this, R.id.profile_icon_placeholder);
        AnonymousClass00C.A0D(imageView, 0);
        this.A00 = imageView;
        AnonymousClass1Pp r1 = this.A01;
        if (r1 != null) {
            r1.A06(imageView, R.drawable.avatar_contact);
            Resources resources = getResources();
            Object[] objArr = new Object[1];
            AE0 ae0 = this.A02;
            if (ae0 != null) {
                A0Q2.setText(C36411kG.A0w(resources, ae0.A08().A00, objArr, 0, R.string.f12nameremoved));
                Resources resources2 = getResources();
                Object[] objArr2 = new Object[1];
                Me A0M = C36401kF.A0M(this);
                if (A0M != null) {
                    str = A0M.number;
                } else {
                    str = null;
                }
                A0Q3.setText(C36411kG.A0w(resources2, str, objArr2, 0, R.string.f12nameremoved));
                C36421kH.A12(findViewById, this, 12);
                AF7 A3i = A3i();
                Intent intent = getIntent();
                if (intent != null) {
                    str2 = intent.getStringExtra("extra_referral_screen");
                } else {
                    str2 = null;
                }
                A3i.BOm(0, (Integer) null, "alias_complete", str2);
                return;
            }
            throw C36331k8.A0d("paymentSharedPrefs");
        }
        throw C36331k8.A0d("contactAvatars");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == 16908332) {
            A3i().BOm(C36361kB.A0i(), C36371kC.A0n(), "alias_complete", C36331k8.A0e(this));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMapperConfirmationActivity() {
        this(0);
    }
}
