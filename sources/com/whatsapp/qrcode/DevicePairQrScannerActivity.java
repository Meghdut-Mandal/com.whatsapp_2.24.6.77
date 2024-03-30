package com.whatsapp.qrcode;

import X.AnonymousClass192;
import X.AnonymousClass1LU;
import X.AnonymousClass1OP;
import X.AnonymousClass1RJ;
import X.AnonymousClass30D;
import X.AnonymousClass36H;
import X.AnonymousClass3CF;
import X.AnonymousClass3EC;
import X.AnonymousClass3M6;
import X.AnonymousClass3Y5;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C19970wo;
import X.C236419g;
import X.C237819v;
import X.C31641c9;
import X.C31651cA;
import X.C33771fu;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import X.C47042ch;
import X.C593933t;
import X.C64233Ne;
import X.C65973Ue;
import X.C81133wW;
import X.C88694Tr;
import X.C88884Uk;
import X.C89354Wf;
import X.C90024Yu;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

public class DevicePairQrScannerActivity extends C47042ch {
    public static final long A0M = (TimeUnit.SECONDS.toMillis(6) + 32000);
    public static final long A0N = TimeUnit.SECONDS.toMillis(4);
    public int A00;
    public C19460v5 A01;
    public AnonymousClass3CF A02;
    public C33771fu A03;
    public C593933t A04;
    public C31641c9 A05;
    public C31651cA A06;
    public C237819v A07;
    public AnonymousClass36H A08;
    public C88694Tr A09;
    public AnonymousClass1OP A0A;
    public C236419g A0B;
    public AnonymousClass1LU A0C;
    public AgentDeviceLoginViewModel A0D;
    public C64233Ne A0E;
    public AnonymousClass3EC A0F;
    public Runnable A0G;
    public String A0H;
    public boolean A0I;
    public final C88884Uk A0J;
    public final Runnable A0K;
    public final AnonymousClass192 A0L;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            AnonymousClass3EC r2 = this.A0F;
            if (i2 == 0) {
                r2.A00(4);
            } else {
                r2.A00 = C19970wo.A00(r2.A02);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public static void A01(DevicePairQrScannerActivity devicePairQrScannerActivity) {
        Runnable runnable = devicePairQrScannerActivity.A0G;
        if (runnable != null) {
            devicePairQrScannerActivity.A00.removeCallbacks(runnable);
        }
        devicePairQrScannerActivity.Bnv();
    }

    public void A2F() {
        if (!this.A0I) {
            this.A0I = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r2 = A0B2.A00;
            C36321k7.A0X(A0B2, r2, this, C36321k7.A05(A0B2, r2, this));
            this.A03 = C36381kD.A0W(A0B2);
            this.A04 = C36351kA.A0X(A0B2);
            this.A03 = C36351kA.A0P(A0B2);
            this.A0C = C36411kG.A0e(A0B2);
            this.A0B = C36381kD.A0a(A0B2);
            this.A0F = (AnonymousClass3EC) r2.A6o.get();
            this.A05 = (C31641c9) A0B2.AAP.get();
            this.A01 = C19470v6.A00;
            this.A04 = (C593933t) r2.ACM.get();
            this.A07 = (C237819v) A0B2.A40.get();
            this.A08 = (AnonymousClass36H) r2.A9z.get();
            this.A0A = (AnonymousClass1OP) A0B2.AFm.get();
            this.A02 = (AnonymousClass3CF) r2.A7l.get();
            this.A06 = (C31651cA) A0B2.AE9.get();
        }
    }

    public void onDestroy() {
        this.A0B.unregisterObserver(this.A0L);
        synchronized (this.A08.A00) {
        }
        this.A0F.A00(2);
        super.onDestroy();
    }

    public DevicePairQrScannerActivity(int i) {
        this.A0I = false;
        C89354Wf.A00(this, 33);
    }

    public void A2x(int i) {
        if (i == R.string.f12nameremoved || i == R.string.f12nameremoved || i == R.string.f12nameremoved) {
            this.A05.BoN();
        } else if (i == 1000) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05.setShouldUseGoogleVisionScanner(true);
        this.A09 = this.A0A.A00();
        AnonymousClass3CF r0 = this.A02;
        this.A0E = new C64233Ne((AnonymousClass30D) r0.A00.A00.A00.A7k.get(), this.A0J);
        this.A02.setText(Html.fromHtml(C36381kD.A0r(this, "web.whatsapp.com", new Object[1], R.string.f12nameremoved)));
        this.A02.setVisibility(0);
        if (this.A06.A01()) {
            String string = getString(R.string.f12nameremoved);
            AnonymousClass3Y5 r2 = new AnonymousClass3Y5(this, 49);
            AnonymousClass1RJ A0r = C36351kA.A0r(this, R.id.bottom_banner_stub);
            ((TextView) C36391kE.A0L(A0r, 0)).setText(string);
            A0r.A05(r2);
        }
        this.A0B.registerObserver(this.A0L);
        synchronized (this.A08.A00) {
        }
        this.A00 = getIntent().getIntExtra("entry_point", 1);
        this.A0H = getIntent().getStringExtra("agent_id");
        AgentDeviceLoginViewModel agentDeviceLoginViewModel = (AgentDeviceLoginViewModel) C36441kJ.A0b(this).A00(AgentDeviceLoginViewModel.class);
        this.A0D = agentDeviceLoginViewModel;
        C65973Ue.A00(this, agentDeviceLoginViewModel.A00, 4);
        C65973Ue.A00(this, this.A0D.A01, 5);
        if (this.A04.A02("android.permission.CAMERA") == 0) {
            AnonymousClass3EC r22 = this.A0F;
            r22.A00 = C19970wo.A00(r22.A02);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public DevicePairQrScannerActivity() {
        this(0);
        this.A0K = new C81133wW((Object) this, 33);
        this.A0J = new AnonymousClass3M6(this, 1);
        this.A0L = new C90024Yu(this, 3);
    }
}
