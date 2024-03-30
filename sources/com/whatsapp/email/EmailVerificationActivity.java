package com.whatsapp.email;

import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1DZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass3LN;
import X.AnonymousClass3LW;
import X.AnonymousClass3Y0;
import X.C18800tq;
import X.C18830tt;
import X.C194349Pi;
import X.C19650wI;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C39001qm;
import X.C81113wU;
import X.C89334Wd;
import X.C90074Yz;
import android.app.Dialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class EmailVerificationActivity extends AnonymousClass155 {
    public int A00;
    public View A01;
    public WaTextView A02;
    public C194349Pi A03;
    public AnonymousClass1DZ A04;
    public AnonymousClass190 A05;
    public C19650wI A06;
    public AnonymousClass1RJ A07;
    public String A08;
    public boolean A09;

    public Dialog onCreateDialog(int i) {
        C39001qm r2;
        int i2;
        int i3;
        if (i == 1) {
            r2 = AnonymousClass3LW.A00(this);
            r2.A0c(R.string.f12nameremoved);
            i2 = R.string.f12nameremoved;
            i3 = 1;
        } else if (i != 2) {
            return super.onCreateDialog(i);
        } else {
            r2 = C39001qm.A00(this);
            i2 = R.string.f12nameremoved;
            i3 = 0;
        }
        C39001qm.A0B(r2, this, i3, i2);
        return r2.create();
    }

    public static final void A01(EmailVerificationActivity emailVerificationActivity) {
        AnonymousClass1RJ A0X;
        AnonymousClass1RJ A0X2 = C36341k9.A0X(emailVerificationActivity.A00, R.id.email_row_view_stub);
        View A0F = C36361kB.A0F(C36391kE.A0L(A0X2, 0), R.id.email_row_layout);
        TextView A0F2 = C36351kA.A0F(A0X2.A01(), R.id.email_row);
        ((WaImageView) C36361kB.A0F(A0X2.A01(), R.id.email_row_icon)).A01 = C36401kF.A1X(emailVerificationActivity.A00);
        AnonymousClass3Y0.A01(A0F, emailVerificationActivity, 24);
        if (emailVerificationActivity.A09.A0i() != null) {
            A0F2.setText(emailVerificationActivity.A09.A0i());
            boolean z = C36331k8.A06(emailVerificationActivity).getBoolean("settings_verification_email_address_verified", false);
            View view = emailVerificationActivity.A00;
            if (z) {
                A0X = C36341k9.A0X(view, R.id.verified_state_view_stub);
            } else {
                A0X = C36341k9.A0X(view, R.id.unverified_state_view_stub);
                TextEmojiLabel A0R = C36361kB.A0R(A0X.A01(), R.id.email_verification_text);
                C36331k8.A1A(emailVerificationActivity.A0D, A0R);
                A0R.setText(AnonymousClass3LN.A01(new C81113wU((Object) emailVerificationActivity, 41), C36361kB.A0m(emailVerificationActivity, R.string.f12nameremoved), "verify-email"));
            }
            A0X.A03(0);
            return;
        }
        throw C36381kD.A0l();
    }

    public static final void A07(EmailVerificationActivity emailVerificationActivity) {
        AnonymousClass1RJ r1 = emailVerificationActivity.A07;
        if (r1 == null) {
            throw C36331k8.A0d("emailVerificationShimmerViewStub");
        }
        r1.A03(8);
        View view = emailVerificationActivity.A01;
        if (view == null) {
            throw C36331k8.A0d("emailVerificationLayout");
        }
        view.setVisibility(0);
    }

    public static final void A0F(EmailVerificationActivity emailVerificationActivity, int i, int i2) {
        C194349Pi r2 = emailVerificationActivity.A03;
        if (r2 != null) {
            C36401kF.A1G(r2, emailVerificationActivity.A08, emailVerificationActivity.A00, i, i2);
            return;
        }
        throw C36331k8.A0d("emailVerificationLogger");
    }

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A05 = C36351kA.A0h(A0B);
            this.A06 = C36411kG.A0q(A0B);
            this.A03 = C36411kG.A0f(r1);
            this.A04 = A0B.A9B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r4 = this;
            X.0v0 r0 = r4.A09
            java.lang.String r0 = r0.A0i()
            if (r0 == 0) goto L_0x000f
            int r0 = r0.length()
            r2 = 0
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            r1 = 7
            r0 = 7
            if (r2 == 0) goto L_0x0015
            r0 = 5
        L_0x0015:
            A0F(r4, r0, r1)
            X.1Dv r3 = r4.A01
            X.190 r0 = r4.A05
            if (r0 == 0) goto L_0x003e
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsAccount"
            r2.setClassName(r1, r0)
            java.lang.String r1 = "is_companion"
            r0 = 0
            r2.putExtra(r1, r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r0 = r2.addFlags(r0)
            r3.A06(r4, r0)
            r4.finish()
            return
        L_0x003e:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.email.EmailVerificationActivity.onBackPressed():void");
    }

    public EmailVerificationActivity(int i) {
        this.A09 = false;
        C89334Wd.A00(this, 19);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        setTitle(R.string.f12nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
        }
        this.A02 = C36341k9.A0Q(this.A00, R.id.email_verification_description);
        this.A01 = C36361kB.A0G(this.A00, R.id.email_verification_layout);
        this.A07 = C36341k9.A0X(this.A00, R.id.email_verification_shimmer_view_stub);
        this.A00 = C36431kI.A02(getIntent(), "entrypoint");
        this.A08 = C36391kE.A0u(this);
        WaTextView waTextView = this.A02;
        if (waTextView == null) {
            throw C36331k8.A0d("description");
        }
        waTextView.setText(R.string.f12nameremoved);
        String A0i = this.A09.A0i();
        if (A0i == null || A0i.length() == 0) {
            AnonymousClass1RJ r2 = this.A07;
            if (r2 == null) {
                throw C36331k8.A0d("emailVerificationShimmerViewStub");
            }
            r2.A03(0);
            AnonymousClass1RJ r0 = this.A07;
            if (r0 == null) {
                throw C36331k8.A0d("emailVerificationShimmerViewStub");
            }
            ((ShimmerFrameLayout) r0.A01()).A03();
            View view = this.A01;
            if (view == null) {
                throw C36331k8.A0d("emailVerificationLayout");
            }
            view.setVisibility(8);
            AnonymousClass1DZ r22 = this.A04;
            if (r22 != null) {
                r22.A01(new C90074Yz(this, 0));
                return;
            }
            throw C36331k8.A0d("emailVerificationXmppMethods");
        }
        A0F(this, 7, 8);
        A01(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public EmailVerificationActivity() {
        this(0);
    }
}
