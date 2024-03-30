package com.whatsapp.deviceauth;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass17Y;
import X.AnonymousClass3FW;
import X.AnonymousClass4QP;
import X.C18740tg;
import X.C193769Mu;
import X.C19700wN;
import X.C202529m7;
import X.C207669va;
import X.C20810yC;
import X.C21060yb;
import X.C39091rA;
import X.C61963Ee;
import X.C81113wU;
import X.C89414Wl;
import android.app.KeyguardManager;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

public class BiometricAuthPlugin extends DeviceAuthenticationPlugin {
    public C202529m7 A00;
    public C193769Mu A01;
    public AnonymousClass3FW A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass01I A05;
    public final C19700wN A06;
    public final AnonymousClass17Y A07;
    public final C21060yb A08;
    public final AnonymousClass4QP A09;
    public final DeviceCredentialsAuthPlugin A0A;
    public final C20810yC A0B;

    public static void A00(BiometricAuthPlugin biometricAuthPlugin, int i) {
        if (Build.VERSION.SDK_INT != 29 && (i == 2 || i == 3)) {
            AnonymousClass3FW r0 = biometricAuthPlugin.A02;
            C18740tg.A06(r0);
            r0.A00();
            AnonymousClass17Y r3 = biometricAuthPlugin.A07;
            DeviceCredentialsAuthPlugin deviceCredentialsAuthPlugin = biometricAuthPlugin.A0A;
            Objects.requireNonNull(deviceCredentialsAuthPlugin);
            r3.A0I(new C81113wU((Object) deviceCredentialsAuthPlugin, 36), 200);
        } else if (i == 2) {
            biometricAuthPlugin.A09.BRa(4);
        } else {
            biometricAuthPlugin.A09.BRa(i);
        }
    }

    private boolean A01() {
        C202529m7 r1 = this.A00;
        if (r1 == null) {
            r1 = new C202529m7(new C207669va(this.A05));
            this.A00 = r1;
        }
        return AnonymousClass000.A1Q(r1.A03(255));
    }

    private boolean A02() {
        String str;
        KeyguardManager A062 = this.A08.A06();
        if (A062 == null || !A062.isDeviceSecure()) {
            str = "BiometricAuthPlugin/NoDeviceCredentials";
        } else if (this.A0A.A05()) {
            return true;
        } else {
            str = "BiometricAuthPlugin/CannotAuthenticateWithDeviceCredentials";
        }
        Log.i(str);
        return false;
    }

    public void A04() {
        String str;
        AnonymousClass01I r5 = this.A05;
        Executor A072 = AnonymousClass00F.A07(r5);
        Set set = C39091rA.A03;
        this.A02 = new AnonymousClass3FW(new C39091rA(this.A06, new C89414Wl(this, 2), "BiometricAuthPlugin"), r5, A072);
        C61963Ee r1 = new C61963Ee();
        r1.A03 = r5.getString(this.A04);
        int i = this.A03;
        if (i != 0) {
            str = r5.getString(i);
        } else {
            str = null;
        }
        r1.A02 = str;
        r1.A00 = 33023;
        r1.A04 = false;
        this.A01 = r1.A00();
    }

    public boolean A05() {
        if (Build.VERSION.SDK_INT < 23 || !this.A0B.A0E(482) || !A01() || !A02()) {
            return false;
        }
        return true;
    }

    public void A06() {
        if (this.A02 == null || this.A01 == null) {
            throw AnonymousClass001.A09("BiometricAuthPlugin/authenticate: No prompt created. Have you checked if you can authenticate?");
        }
        Log.i("BiometricAuthPlugin/authentication-attempt");
        this.A02.A01(this.A01);
    }

    public BiometricAuthPlugin(AnonymousClass01I r7, C19700wN r8, AnonymousClass17Y r9, C21060yb r10, AnonymousClass4QP r11, C20810yC r12, int i, int i2) {
        this.A0B = r12;
        this.A07 = r9;
        this.A06 = r8;
        this.A08 = r10;
        this.A05 = r7;
        this.A04 = i;
        this.A03 = i2;
        this.A09 = r11;
        this.A0A = new DeviceCredentialsAuthPlugin(r7, r8, r10, r11, i);
        r7.A06.A04(this);
    }
}
