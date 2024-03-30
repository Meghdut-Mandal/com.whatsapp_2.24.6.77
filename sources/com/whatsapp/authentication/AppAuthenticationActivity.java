package com.whatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass18U;
import X.AnonymousClass3FW;
import X.AnonymousClass6X5;
import X.C02680Bk;
import X.C1496972k;
import X.C160387kv;
import X.C18740tg;
import X.C18800tq;
import X.C18840tu;
import X.C18950u5;
import X.C193769Mu;
import X.C19430v1;
import X.C225314u;
import X.C225714y;
import X.C26021Io;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C61963Ee;
import X.C66923Xv;
import X.C89044Va;
import X.C89294Vz;
import X.C89314Wb;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class AppAuthenticationActivity extends C225314u implements C160387kv, C225714y {
    public int A00;
    public C193769Mu A01;
    public AnonymousClass3FW A02;
    public C02680Bk A03;
    public FingerprintView A04;
    public AnonymousClass005 A05;
    public AnonymousClass005 A06;
    public Runnable A07;
    public int A08;
    public boolean A09;
    public boolean A0A;

    public static /* synthetic */ void A0G(AppAuthenticationActivity appAuthenticationActivity) {
        AnonymousClass3FW r0;
        appAuthenticationActivity.A00 = 2;
        C193769Mu r1 = appAuthenticationActivity.A01;
        if (r1 != null && (r0 = appAuthenticationActivity.A02) != null) {
            r0.A01(r1);
        }
    }

    public void BRY(int i, CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 1);
        Log.i("AppAuthenticationActivity/fingerprint-error");
        C36401kF.A0R(this).A02(true);
        if (i == 7) {
            Log.i("AppAuthenticationActivity/fingerprint-error-too-many-attempts");
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, 30, 0);
            charSequence = getString(R.string.f12nameremoved, objArr);
            AnonymousClass00C.A08(charSequence);
            FingerprintView fingerprintView = this.A04;
            if (fingerprintView == null) {
                throw C36331k8.A0d("fingerprintView");
            }
            fingerprintView.removeCallbacks(this.A07);
            FingerprintView fingerprintView2 = this.A04;
            if (fingerprintView2 == null) {
                throw C36331k8.A0d("fingerprintView");
            }
            fingerprintView2.postDelayed(this.A07, AnonymousClass6X5.A0L);
        }
        FingerprintView fingerprintView3 = this.A04;
        if (fingerprintView3 == null) {
            throw C36331k8.A0d("fingerprintView");
        }
        fingerprintView3.A02(charSequence);
    }

    public void BRb(int i, CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 1);
        Log.i("AppAuthenticationActivity/fingerprint-help");
        FingerprintView fingerprintView = this.A04;
        if (fingerprintView == null) {
            throw C36331k8.A0d("fingerprintView");
        }
        fingerprintView.A03(charSequence.toString());
    }

    /* access modifiers changed from: private */
    public final void A07() {
        if (this.A08 != 0) {
            AnonymousClass005 r0 = this.A06;
            if (r0 != null) {
                ((C26021Io) r0.get()).A01();
                Intent A0D = C36431kI.A0D();
                A0D.putExtra("appWidgetId", this.A08);
                setResult(-1, A0D);
                return;
            }
            throw C36331k8.A0d("widgetUpdaterLazy");
        }
        setResult(-1);
    }

    /* access modifiers changed from: private */
    public final void A0F() {
        Log.i("AuthenticationActivity/start-listening");
        FingerprintView fingerprintView = this.A04;
        if (fingerprintView == null) {
            throw C36331k8.A0d("fingerprintView");
        }
        fingerprintView.removeCallbacks(this.A07);
        C02680Bk r2 = new C02680Bk();
        this.A03 = r2;
        AnonymousClass18U A0R = C36401kF.A0R(this);
        C18740tg.A0C(A0R.A05());
        AnonymousClass18U.A00(A0R).B1a(r2, this);
        FingerprintView fingerprintView2 = this.A04;
        if (fingerprintView2 == null) {
            throw C36331k8.A0d("fingerprintView");
        }
        FingerprintView.A00(fingerprintView2.A05, fingerprintView2);
    }

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C36361kB.A1C(A0B, this);
            this.A06 = C18840tu.A00(A0B.Aem);
            this.A05 = C18840tu.A00(A0B.A0I);
        }
    }

    public final AnonymousClass005 A3K() {
        AnonymousClass005 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("appAuthManagerLazy");
    }

    public C18950u5 BGv() {
        C18950u5 r0 = C19430v1.A02;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public void BRZ() {
        Log.i("AppAuthenticationActivity/fingerprint-failed");
        FingerprintView fingerprintView = this.A04;
        if (fingerprintView == null) {
            throw C36331k8.A0d("fingerprintView");
        }
        fingerprintView.A03(C36361kB.A0m(fingerprintView.getContext(), R.string.f12nameremoved));
    }

    public void BRc(byte[] bArr) {
        Log.i("AppAuthenticationActivity/fingerprint-success");
        C36401kF.A0R(this).A02(false);
        FingerprintView fingerprintView = this.A04;
        if (fingerprintView == null) {
            throw C36331k8.A0d("fingerprintView");
        }
        fingerprintView.A01();
    }

    public void onBackPressed() {
        ActivityManager A042 = this.A08.A04();
        if (A042 == null || A042.getLockTaskModeState() != 2) {
            setResult(0);
            finishAffinity();
        }
    }

    public AppAuthenticationActivity(int i) {
        this.A09 = false;
        C89314Wb.A00(this, 16);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle A0H = C36371kC.A0H(this);
        if (A0H != null) {
            this.A08 = A0H.getInt("appWidgetId", 0);
        }
        if (!C36401kF.A0R(this).A04()) {
            Log.i("AppAuthenticationActivity/onCreate: setting not enabled");
            A07();
            finish();
            overridePendingTransition(0, 17432577);
            return;
        }
        this.A0A = C36421kH.A1W(C36401kF.A0R(this));
        setContentView((int) R.layout.f9nameremoved);
        C36391kE.A0Q(this, R.id.auth_title).setText(R.string.f12nameremoved);
        View findViewById = findViewById(R.id.app_unlock);
        this.A04 = (FingerprintView) C36361kB.A0H(this, R.id.fingerprint_view);
        if (this.A0A) {
            findViewById.setVisibility(0);
            FingerprintView fingerprintView = this.A04;
            if (fingerprintView == null) {
                throw C36331k8.A0d("fingerprintView");
            }
            fingerprintView.setVisibility(8);
            this.A02 = new AnonymousClass3FW(new C89044Va(this, 2), this, AnonymousClass00F.A07(this));
            C61963Ee r1 = new C61963Ee();
            r1.A03 = getString(R.string.f12nameremoved);
            r1.A00 = 33023;
            r1.A04 = false;
            this.A01 = r1.A00();
            C66923Xv.A01(findViewById, this, 37);
            return;
        }
        findViewById.setVisibility(8);
        FingerprintView fingerprintView2 = this.A04;
        if (fingerprintView2 == null) {
            throw C36331k8.A0d("fingerprintView");
        }
        fingerprintView2.setVisibility(0);
        FingerprintView fingerprintView3 = this.A04;
        if (fingerprintView3 == null) {
            throw C36331k8.A0d("fingerprintView");
        }
        fingerprintView3.A00 = new C89294Vz(this, 0);
        this.A07 = new C1496972k(this, 32);
    }

    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A04;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    public void onPause() {
        super.onPause();
        if (!this.A0A) {
            Log.i("AuthenticationActivity/stop-listening");
            FingerprintView fingerprintView = this.A04;
            if (fingerprintView == null) {
                throw C36331k8.A0d("fingerprintView");
            }
            fingerprintView.removeCallbacks(this.A07);
            C02680Bk r0 = this.A03;
            if (r0 != null) {
                try {
                    r0.A03();
                } catch (NullPointerException e) {
                    e.getMessage();
                } catch (Throwable th) {
                    this.A03 = null;
                    throw th;
                }
                this.A03 = null;
            }
        } else if (this.A00 == 3) {
            this.A00 = 1;
            AnonymousClass3FW r02 = this.A02;
            if (r02 != null) {
                r02.A00();
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.A0A) {
            A0F();
        }
    }

    public void onStart() {
        AnonymousClass3FW r0;
        super.onStart();
        if (!C36401kF.A0R(this).A03()) {
            Log.i("AppAuthenticationActivity/not-enrolled");
            C36331k8.A0m(this);
        } else if (this.A0A && this.A00 == 1) {
            this.A00 = 2;
            C193769Mu r1 = this.A01;
            if (r1 != null && (r0 = this.A02) != null) {
                r0.A01(r1);
            }
        }
    }

    public AppAuthenticationActivity() {
        this(0);
        this.A00 = 1;
    }
}
