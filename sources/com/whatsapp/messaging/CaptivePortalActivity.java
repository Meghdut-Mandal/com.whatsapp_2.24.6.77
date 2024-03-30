package com.whatsapp.messaging;

import X.AnonymousClass000;
import X.AnonymousClass1YV;
import X.AnonymousClass3LW;
import X.C133536Yx;
import X.C163027pX;
import X.C163297py;
import X.C163437qC;
import X.C18800tq;
import X.C21060yb;
import X.C224914p;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C39001qm;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class CaptivePortalActivity extends C224914p {
    public C21060yb A00;
    public AnonymousClass1YV A01;
    public boolean A02;

    public void onCreate(Bundle bundle) {
        WifiInfo connectionInfo;
        int length;
        requestWindowFeature(1);
        super.onCreate(bundle);
        WifiManager A0F = this.A00.A0F();
        if (A0F == null) {
            Log.w("captiveportalactivity/create wm=null");
            connectionInfo = null;
        } else {
            connectionInfo = A0F.getConnectionInfo();
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0r(false);
        A002.A0d(R.string.f12nameremoved);
        A002.A0g(new C163297py(this, 32), R.string.f12nameremoved);
        A002.A0f(new C163437qC(A0F, this, 9), R.string.f12nameremoved);
        if (connectionInfo != null) {
            int networkId = connectionInfo.getNetworkId();
            String ssid = connectionInfo.getSSID();
            if (ssid != null && (length = ssid.length()) >= 2 && ((ssid.startsWith("\"") || ssid.startsWith("'")) && (ssid.endsWith("\"") || ssid.endsWith("'")))) {
                ssid = ssid.substring(1, length - 1);
            }
            C36321k7.A1Q("wifi network name is ", ssid, AnonymousClass000.A0u());
            A002.A0Z(C36351kA.A0w(this, ssid, 1, R.string.f12nameremoved));
            A002.A0S(new C133536Yx(A0F, this, ssid, networkId), C36351kA.A0w(this, ssid, 1, R.string.f12nameremoved));
        } else {
            A002.A0K(R.string.f12nameremoved);
        }
        Log.i("captive portal dialog created");
        A002.A0b();
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            this.A04 = C36341k9.A0Z(A0B);
            this.A00 = C36351kA.A0U(A0B);
            this.A01 = (AnonymousClass1YV) A0B.A5S.get();
        }
    }

    public CaptivePortalActivity(int i) {
        this.A02 = false;
        C163027pX.A00(this, 37);
    }

    public void onPause() {
        super.onPause();
        this.A01.A01.removeMessages(1);
        this.A01.A04();
    }

    public void onResume() {
        super.onResume();
        this.A01.A01.sendEmptyMessageDelayed(1, 3000);
    }

    public CaptivePortalActivity() {
        this(0);
    }
}
