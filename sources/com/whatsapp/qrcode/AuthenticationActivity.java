package com.whatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass18U;
import X.AnonymousClass6X5;
import X.C02680Bk;
import X.C160387kv;
import X.C18740tg;
import X.C18800tq;
import X.C225314u;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C81133wW;
import X.C89294Vz;
import X.C89354Wf;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintView;
import com.whatsapp.util.Log;

public class AuthenticationActivity extends C225314u implements C160387kv {
    public C02680Bk A00;
    public AnonymousClass18U A01;
    public FingerprintView A02;
    public Runnable A03;
    public boolean A04;

    /* access modifiers changed from: private */
    public void A01() {
        Log.i("AuthenticationActivity/start-listening");
        this.A02.removeCallbacks(this.A03);
        C02680Bk r2 = new C02680Bk();
        this.A00 = r2;
        AnonymousClass18U r1 = this.A01;
        C18740tg.A0C(r1.A05());
        AnonymousClass18U.A00(r1).B1a(r2, this);
        FingerprintView fingerprintView = this.A02;
        FingerprintView.A00(fingerprintView.A05, fingerprintView);
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C36361kB.A1C(A0B, this);
            this.A01 = (AnonymousClass18U) A0B.A0I.get();
        }
    }

    public void BRY(int i, CharSequence charSequence) {
        Log.i("AuthenticationActivity/fingerprint-error");
        if (i == 7) {
            Log.i("AuthenticationActivity/fingerprint-error-too-many-attempts");
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, 30, 0);
            charSequence = getString(R.string.f12nameremoved, A0L);
            this.A02.removeCallbacks(this.A03);
            this.A02.postDelayed(this.A03, AnonymousClass6X5.A0L);
        }
        this.A02.A02(charSequence);
    }

    public void BRZ() {
        Log.i("AuthenticationActivity/fingerprint-failed");
        FingerprintView fingerprintView = this.A02;
        fingerprintView.A03(C36361kB.A0m(fingerprintView.getContext(), R.string.f12nameremoved));
    }

    public void BRb(int i, CharSequence charSequence) {
        Log.i("AuthenticationActivity/fingerprint-help");
        this.A02.A03(charSequence.toString());
    }

    public void BRc(byte[] bArr) {
        Log.i("AuthenticationActivity/fingerprint-success");
        this.A02.A01();
    }

    public AuthenticationActivity(int i) {
        this.A04 = false;
        C89354Wf.A00(this, 32);
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A01.A03()) {
            Log.i("AuthenticationActivity/onCreate: setting not enabled");
            C36331k8.A0m(this);
            overridePendingTransition(0, 17432577);
            return;
        }
        setContentView((int) R.layout.f9nameremoved);
        C36391kE.A0Q(this, R.id.auth_title).setText(getIntent().getStringExtra("extra_auth_title"));
        FingerprintView fingerprintView = (FingerprintView) findViewById(R.id.fingerprint_view);
        this.A02 = fingerprintView;
        fingerprintView.A00 = new C89294Vz(this, 1);
        this.A03 = new C81133wW((Object) this, 29);
    }

    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A02;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    public void onPause() {
        super.onPause();
        Log.i("AuthenticationActivity/stop-listening");
        this.A02.removeCallbacks(this.A03);
        C02680Bk r0 = this.A00;
        if (r0 != null) {
            try {
                r0.A03();
            } catch (NullPointerException e) {
                e.getMessage();
            } catch (Throwable th) {
                this.A00 = null;
                throw th;
            }
            this.A00 = null;
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.A01.A03()) {
            Log.i("AuthenticationActivity/not-enrolled");
            C36331k8.A0m(this);
            return;
        }
        A01();
    }

    public AuthenticationActivity() {
        this(0);
    }
}
