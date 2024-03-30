package com.whatsapp.deviceauth;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass3FW;
import X.AnonymousClass3HL;
import X.AnonymousClass4QP;
import X.C193769Mu;
import X.C19700wN;
import X.C202529m7;
import X.C207669va;
import X.C21060yb;
import X.C39091rA;
import X.C61963Ee;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;

public class DeviceCredentialsAuthPlugin extends DeviceAuthenticationPlugin {
    public C202529m7 A00;
    public C193769Mu A01;
    public AnonymousClass3FW A02;
    public final int A03;
    public final AnonymousClass01I A04;
    public final C21060yb A05;
    public final AnonymousClass3HL A06;

    private C193769Mu A00() {
        C61963Ee r2 = new C61963Ee();
        r2.A03 = this.A04.getString(this.A03);
        r2.A00 = 32768;
        return r2.A00();
    }

    private void A01() {
        if (this.A02 == null || this.A01 == null) {
            throw AnonymousClass001.A09("DeviceCredentialsAuthPlugin/authenticate: No prompt created. Have you checked if you can authenticate?");
        }
        Log.i("DeviceCredentialsAuthPlugin/authentication-attempt-API30AndAbove");
        this.A02.A01(this.A01);
    }

    private boolean A02() {
        C202529m7 r1 = this.A00;
        if (r1 == null) {
            r1 = new C202529m7(new C207669va(this.A04));
            this.A00 = r1;
        }
        return AnonymousClass000.A1Q(r1.A03(32768));
    }

    private boolean A03() {
        KeyguardManager A062 = this.A05.A06();
        if (A062 == null || !A062.isDeviceSecure()) {
            return false;
        }
        return true;
    }

    public void A04() {
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass01I r3 = this.A04;
            this.A02 = new AnonymousClass3FW(this.A06, r3, AnonymousClass00F.A07(r3));
            this.A01 = A00();
        }
    }

    public boolean A05() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || !A03()) {
            return false;
        }
        if (i >= 30) {
            return A02();
        }
        if (i == 29) {
            return this.A05.A0P("android.software.secure_lock_screen");
        }
        return true;
    }

    public void A06() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            throw AnonymousClass001.A09("DeviceCredentialsAuthPlugin/authenticate: SDK must be 23 or higher. Have you checked if you can authenticate?");
        } else if (i >= 30) {
            A01();
        } else {
            KeyguardManager A062 = this.A05.A06();
            if (A062 != null) {
                AnonymousClass01I r2 = this.A04;
                Intent createConfirmDeviceCredentialIntent = A062.createConfirmDeviceCredentialIntent(r2.getString(this.A03), "");
                Log.i("DeviceCredentialsAuthPlugin/authentication-attempt-API29AndBelow");
                r2.startActivityForResult(createConfirmDeviceCredentialIntent, 12345);
                return;
            }
            throw AnonymousClass001.A09("DeviceCredentialsManager/authenticate: Cannot get KeyguardManager. Have you checked if you can authenticate?");
        }
    }

    public DeviceCredentialsAuthPlugin(AnonymousClass01I r3, C19700wN r4, C21060yb r5, AnonymousClass4QP r6, int i) {
        this.A05 = r5;
        this.A04 = r3;
        this.A03 = i;
        this.A06 = new C39091rA(r4, r6, "DeviceCredentialsAuthPlugin");
        r3.A06.A04(this);
    }
}
