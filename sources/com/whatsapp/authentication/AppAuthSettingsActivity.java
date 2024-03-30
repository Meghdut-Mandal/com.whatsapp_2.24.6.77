package com.whatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass28q;
import X.AnonymousClass3FW;
import X.AnonymousClass3PI;
import X.AnonymousClass3YA;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C193769Mu;
import X.C25271Fq;
import X.C26021Io;
import X.C27111My;
import X.C28361Si;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C430728r;
import X.C61963Ee;
import X.C66923Xv;
import X.C89044Va;
import X.C89314Wb;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class AppAuthSettingsActivity extends AnonymousClass155 {
    public View A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioButton A03;
    public TextView A04;
    public TextView A05;
    public SwitchCompat A06;
    public SwitchCompat A07;
    public C193769Mu A08;
    public AnonymousClass3FW A09;
    public C26021Io A0A;
    public FingerprintBottomSheet A0B;
    public C25271Fq A0C;
    public C28361Si A0D;
    public AnonymousClass3PI A0E;
    public View A0F;
    public boolean A0G;
    public final C430728r A0H;

    public static final void A0I(AppAuthSettingsActivity appAuthSettingsActivity) {
        Log.i("AppAuthSettingsActivity/disable-setting");
        appAuthSettingsActivity.A05.A02(true);
        appAuthSettingsActivity.A09.A22(false);
        appAuthSettingsActivity.A3j().A09();
        appAuthSettingsActivity.A0Q(false);
        SwitchCompat switchCompat = appAuthSettingsActivity.A06;
        if (switchCompat == null) {
            throw C36331k8.A0d("appAuthSettingsSwitch");
        }
        switchCompat.setChecked(false);
        appAuthSettingsActivity.A3i().A01();
        appAuthSettingsActivity.A05.A01(appAuthSettingsActivity);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.whatsapp.authentication.SetupDeviceAuthDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.authentication.SetupDeviceAuthDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.authentication.SetupDeviceAuthDialog} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A0J(com.whatsapp.authentication.AppAuthSettingsActivity r3) {
        /*
            androidx.appcompat.widget.SwitchCompat r0 = r3.A06
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "appAuthSettingsSwitch"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x000b:
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0056
            X.18U r0 = r3.A05
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "AppAuthSettingsActivity/show-bottom-sheet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.18U r0 = r3.A05
            boolean r0 = X.C36421kH.A1W(r0)
            if (r0 == 0) goto L_0x003f
            X.9Mu r1 = r3.A08
            if (r1 == 0) goto L_0x0033
            X.3FW r0 = r3.A09
            if (r0 == 0) goto L_0x0033
            r0.A01(r1)
        L_0x0033:
            return
        L_0x0034:
            java.lang.String r0 = "AppAuthSettingsActivity/setup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.authentication.SetupDeviceAuthDialog r1 = new com.whatsapp.authentication.SetupDeviceAuthDialog
            r1.<init>()
            goto L_0x0050
        L_0x003f:
            r2 = 2131889603(0x7f120dc3, float:1.9413874E38)
            r1 = 2131889602(0x7f120dc2, float:1.9413872E38)
            r0 = 0
            com.whatsapp.authentication.FingerprintBottomSheet r1 = X.AnonymousClass3ON.A00(r2, r1, r0, r0)
            r3.A0B = r1
            X.28r r0 = r3.A0H
            r1.A02 = r0
        L_0x0050:
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            r3.Btm(r1)
            return
        L_0x0056:
            A0I(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.authentication.AppAuthSettingsActivity.A0J(com.whatsapp.authentication.AppAuthSettingsActivity):void");
    }

    public static /* synthetic */ void A0K(AppAuthSettingsActivity appAuthSettingsActivity) {
        SwitchCompat switchCompat = appAuthSettingsActivity.A07;
        if (switchCompat == null) {
            throw C36331k8.A0d("notificationContentSwitch");
        }
        boolean z = !switchCompat.isChecked();
        C36331k8.A0w(C36421kH.A0A(appAuthSettingsActivity), "privacy_fingerprint_show_notification_content", z);
        SwitchCompat switchCompat2 = appAuthSettingsActivity.A07;
        if (switchCompat2 == null) {
            throw C36331k8.A0d("notificationContentSwitch");
        }
        switchCompat2.setChecked(z);
        C25271Fq r1 = appAuthSettingsActivity.A0C;
        if (r1 != null) {
            r1.A03(1, "AppAuthSettingsActivity");
            appAuthSettingsActivity.A3j().A09();
            appAuthSettingsActivity.A3i().A01();
            return;
        }
        throw C36331k8.A0d("waNotificationManager");
    }

    /* access modifiers changed from: private */
    public final void A0Q(boolean z) {
        Log.i("AppAuthSettingsActivity/update-dependent-views");
        View view = this.A0F;
        if (view == null) {
            throw C36331k8.A0d("timeoutView");
        }
        int i = 0;
        view.setVisibility(C36351kA.A00(z ? 1 : 0));
        View view2 = this.A00;
        if (view2 == null) {
            throw C36331k8.A0d("notificationView");
        }
        if (!z) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    public void A2F() {
        if (!this.A0G) {
            this.A0G = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A0A = (C26021Io) r2.Aem.get();
            this.A0E = C27111My.A3F(A0L);
            this.A0D = C36371kC.A0g(r2);
            this.A0C = C36391kE.A0d(r2);
        }
    }

    public final C26021Io A3i() {
        C26021Io r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("widgetUpdater");
    }

    public final C28361Si A3j() {
        C28361Si r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("messageNotification");
    }

    public AppAuthSettingsActivity(int i) {
        this.A0G = false;
        C89314Wb.A00(this, 15);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            this.A04 = (TextView) C36361kB.A0H(this, R.id.security_settings_desc);
            this.A05 = (TextView) C36361kB.A0H(this, R.id.security_settings_title);
            if (C36421kH.A1W(this.A05)) {
                setTitle(R.string.f12nameremoved);
                TextView textView = this.A05;
                if (textView == null) {
                    throw C36331k8.A0d("settingsTitle");
                }
                textView.setText(R.string.f12nameremoved);
                TextView textView2 = this.A04;
                if (textView2 == null) {
                    throw C36331k8.A0d("description");
                }
                textView2.setText(R.string.f12nameremoved);
                this.A09 = new AnonymousClass3FW(new C89044Va(this, 1), this, AnonymousClass00F.A07(this));
                C61963Ee r1 = new C61963Ee();
                r1.A01 = getString(R.string.f12nameremoved);
                r1.A03 = getString(R.string.f12nameremoved);
                r1.A00 = 255;
                r1.A04 = false;
                this.A08 = r1.A00();
            } else {
                setTitle(R.string.f12nameremoved);
                TextView textView3 = this.A05;
                if (textView3 == null) {
                    throw C36331k8.A0d("settingsTitle");
                }
                textView3.setText(R.string.f12nameremoved);
                TextView textView4 = this.A04;
                if (textView4 == null) {
                    throw C36331k8.A0d("description");
                }
                textView4.setText(R.string.f12nameremoved);
                if (bundle != null) {
                    FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) getSupportFragmentManager().A0N(FingerprintBottomSheet.class.getName());
                    this.A0B = fingerprintBottomSheet;
                    if (fingerprintBottomSheet != null) {
                        fingerprintBottomSheet.A02 = this.A0H;
                    }
                }
            }
            this.A0F = C36361kB.A0H(this, R.id.timeout);
            this.A00 = C36361kB.A0H(this, R.id.notification_preference);
            this.A06 = (SwitchCompat) C36361kB.A0H(this, R.id.app_auth_settings_switch);
            this.A07 = (SwitchCompat) C36361kB.A0H(this, R.id.notification_content_switch);
            C66923Xv.A01(findViewById(R.id.app_auth_settings_preference), this, 35);
            View view = this.A00;
            if (view == null) {
                throw C36331k8.A0d("notificationView");
            }
            C66923Xv.A01(view, this, 36);
            this.A01 = (RadioButton) C36361kB.A0H(this, R.id.timeout_immediately);
            this.A02 = (RadioButton) C36361kB.A0H(this, R.id.timeout_one_min);
            this.A03 = (RadioButton) C36361kB.A0H(this, R.id.timeout_thirty_min);
            RadioButton radioButton = this.A01;
            if (radioButton == null) {
                throw C36331k8.A0d("timeoutImmediately");
            }
            radioButton.setText(R.string.f12nameremoved);
            RadioButton radioButton2 = this.A02;
            if (radioButton2 == null) {
                throw C36331k8.A0d("timeoutOneMinute");
            }
            radioButton2.setText(this.A00.A0L(new Object[]{1L}, R.plurals.f10nameremoved, 1));
            RadioButton radioButton3 = this.A03;
            if (radioButton3 == null) {
                throw C36331k8.A0d("timeoutThirtyMinutes");
            }
            C18820ts r3 = this.A00;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, 0, 30);
            radioButton3.setText(r3.A0L(objArr, R.plurals.f10nameremoved, 30));
            RadioButton radioButton4 = this.A01;
            if (radioButton4 == null) {
                throw C36331k8.A0d("timeoutImmediately");
            }
            radioButton4.setOnClickListener(new AnonymousClass3YA(this, 0));
            RadioButton radioButton5 = this.A02;
            if (radioButton5 == null) {
                throw C36331k8.A0d("timeoutOneMinute");
            }
            radioButton5.setOnClickListener(new AnonymousClass3YA(this, 60000));
            RadioButton radioButton6 = this.A03;
            if (radioButton6 == null) {
                throw C36331k8.A0d("timeoutThirtyMinutes");
            }
            radioButton6.setOnClickListener(new AnonymousClass3YA(this, 1800000));
            return;
        }
        throw C36381kD.A0l();
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass3FW r0 = this.A09;
        if (r0 != null) {
            r0.A00();
        }
        this.A09 = null;
        FingerprintBottomSheet fingerprintBottomSheet = this.A0B;
        if (fingerprintBottomSheet != null) {
            fingerprintBottomSheet.A02 = null;
        }
        this.A0B = null;
    }

    public void onResume() {
        super.onResume();
        Log.i("AppAuthSettingsActivity/update-ui");
        boolean A2K = this.A09.A2K();
        long A0P = this.A09.A0P();
        boolean A1I = C36441kJ.A1I(C36331k8.A06(this), "privacy_fingerprint_show_notification_content");
        A0Q(A2K);
        C36321k7.A1V("AppAuthSettingsActivity/update-timeout: ", AnonymousClass000.A0u(), A0P);
        RadioButton radioButton = this.A01;
        if (radioButton == null) {
            throw C36331k8.A0d("timeoutImmediately");
        }
        boolean z = true;
        radioButton.setChecked(AnonymousClass000.A1Q((A0P > 0 ? 1 : (A0P == 0 ? 0 : -1))));
        RadioButton radioButton2 = this.A02;
        if (radioButton2 == null) {
            throw C36331k8.A0d("timeoutOneMinute");
        }
        radioButton2.setChecked(AnonymousClass000.A1Q((A0P > 60000 ? 1 : (A0P == 60000 ? 0 : -1))));
        RadioButton radioButton3 = this.A03;
        if (radioButton3 == null) {
            throw C36331k8.A0d("timeoutThirtyMinutes");
        }
        if (A0P != 1800000) {
            z = false;
        }
        radioButton3.setChecked(z);
        SwitchCompat switchCompat = this.A06;
        if (switchCompat == null) {
            throw C36331k8.A0d("appAuthSettingsSwitch");
        }
        switchCompat.setChecked(A2K);
        SwitchCompat switchCompat2 = this.A07;
        if (switchCompat2 == null) {
            throw C36331k8.A0d("notificationContentSwitch");
        }
        switchCompat2.setChecked(A1I);
        AnonymousClass3PI r3 = this.A0E;
        if (r3 != null) {
            View view = this.A00;
            AnonymousClass00C.A08(view);
            r3.A02(view, "screen_lock", C36381kD.A0q(this));
            return;
        }
        throw C36331k8.A0d("settingsSearchUtil");
    }

    public AppAuthSettingsActivity() {
        this(0);
        this.A0H = new AnonymousClass28q(this);
    }
}
