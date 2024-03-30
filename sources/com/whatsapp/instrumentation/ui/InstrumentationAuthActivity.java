package com.whatsapp.instrumentation.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09Y;
import X.AnonymousClass155;
import X.AnonymousClass1VC;
import X.AnonymousClass1VH;
import X.AnonymousClass3S0;
import X.AnonymousClass3SK;
import X.AnonymousClass4OD;
import X.AnonymousClass4OE;
import X.C18800tq;
import X.C18830tt;
import X.C19630wG;
import X.C20720y3;
import X.C20810yC;
import X.C21100yf;
import X.C21360z5;
import X.C236519h;
import X.C28361Si;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36431kI;
import X.C62223Fg;
import X.C89344We;
import X.C89414Wl;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.deviceauth.BiometricAuthPlugin;
import com.whatsapp.util.Log;

public class InstrumentationAuthActivity extends AnonymousClass155 implements AnonymousClass4OD, AnonymousClass4OE {
    public C21360z5 A00;
    public C236519h A01;
    public C19630wG A02;
    public BiometricAuthPlugin A03;
    public AnonymousClass1VC A04;
    public ConfirmFragment A05;
    public PermissionsFragment A06;
    public AnonymousClass3S0 A07;
    public AnonymousClass1VH A08;
    public C62223Fg A09;
    public C20720y3 A0A;
    public C28361Si A0B;
    public String A0C;
    public boolean A0D;

    public void onCreate(Bundle bundle) {
        String A0p;
        int i;
        String str;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        if (!this.A04.A00.A09(C21100yf.A0P)) {
            i = 3;
            str = "Feature is disabled!";
        } else {
            ComponentName callingActivity = getCallingActivity();
            if (callingActivity == null) {
                A0p = "Not started for result.";
            } else {
                String packageName = callingActivity.getPackageName();
                try {
                    if (this.A08.A01(packageName).A03) {
                        Intent intent = getIntent();
                        String str2 = null;
                        if (!(intent == null || getCallingPackage() == null)) {
                            str2 = intent.getStringExtra("request_token");
                        }
                        this.A0C = str2;
                        if (!this.A09.A01(packageName, str2)) {
                            Log.e("InstrumentationAuthActivity/onCreate no correct request token!");
                            i = 4;
                            str = "Request is not authorized!";
                        } else {
                            setContentView((int) R.layout.f9nameremoved);
                            C20810yC r9 = this.A0D;
                            this.A03 = new BiometricAuthPlugin(this, this.A03, this.A05, this.A08, new C89414Wl(this, 3), r9, R.string.f12nameremoved, 0);
                            Intent intent2 = getIntent();
                            int i2 = 0;
                            if (intent2 != null) {
                                i2 = intent2.getIntExtra("content_variant", 0);
                            }
                            PermissionsFragment permissionsFragment = new PermissionsFragment();
                            Bundle A072 = AnonymousClass001.A07();
                            A072.putInt("content_variant", i2);
                            permissionsFragment.A17(A072);
                            this.A06 = permissionsFragment;
                            ConfirmFragment confirmFragment = new ConfirmFragment();
                            Bundle A073 = AnonymousClass001.A07();
                            A073.putInt("content_variant", i2);
                            confirmFragment.A17(A073);
                            this.A05 = confirmFragment;
                            if (bundle == null) {
                                AnonymousClass09Y A0O = C36341k9.A0O(this);
                                A0O.A0A(this.A06, R.id.fragment_container);
                                A0O.A01();
                            }
                            if (this.A00.A03()) {
                                Log.w("InstrumentationAuthActivity/onCreate/clock-wrong");
                                AnonymousClass3SK.A02(this, this.A0A, this.A0B);
                            } else if (this.A00.A02()) {
                                Log.w("InstrumentationAuthActivity/onCreate/sw-expired");
                                AnonymousClass3SK.A03(this, this.A0A, this.A0B);
                            }
                            C36321k7.A0O(this);
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                A0p = AnonymousClass000.A0p("Untrusted caller: ", packageName, AnonymousClass000.A0u());
            }
            A01(this, A0p, 8);
            return;
        }
        A01(this, str, i);
    }

    public void A2F() {
        if (!this.A0D) {
            this.A0D = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A00 = C36401kF.A0N(A0B2);
            this.A09 = (C62223Fg) A0B2.Acy.get();
            this.A0A = C36401kF.A0c(A0B2);
            this.A0B = C36371kC.A0g(A0B2);
            this.A02 = C36351kA.A0W(A0B2);
            this.A01 = (C236519h) A0B2.A0G.get();
            this.A04 = (AnonymousClass1VC) A0B2.A4B.get();
            this.A08 = (AnonymousClass1VH) A0B2.A4E.get();
            this.A07 = (AnonymousClass3S0) r1.A9G.get();
        }
    }

    public InstrumentationAuthActivity(int i) {
        this.A0D = false;
        C89344We.A00(this, 1);
    }

    public static void A01(InstrumentationAuthActivity instrumentationAuthActivity, String str, int i) {
        Intent A0D2 = C36431kI.A0D();
        A0D2.putExtra("error_code", i);
        A0D2.putExtra("error_message", str);
        instrumentationAuthActivity.setResult(0, A0D2);
        instrumentationAuthActivity.finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 12345) {
            return;
        }
        if (i2 == -1 || i2 == 4) {
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            A0O.A0B(this.A05, R.id.fragment_container);
            A0O.A0J((String) null);
            A0O.A01();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.A05.A12()) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        A0O.A0B(this.A06, R.id.fragment_container);
        A0O.A01();
        return true;
    }

    public void onResume() {
        super.onResume();
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        A0O.A0B(this.A06, R.id.fragment_container);
        A0O.A01();
    }

    public InstrumentationAuthActivity() {
        this(0);
    }
}
