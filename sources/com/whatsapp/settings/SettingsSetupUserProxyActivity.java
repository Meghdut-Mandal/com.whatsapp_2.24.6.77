package com.whatsapp.settings;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass3QR;
import X.AnonymousClass3Y8;
import X.AnonymousClass4HC;
import X.AnonymousClass4LH;
import X.AnonymousClass4VZ;
import X.AnonymousClass4WJ;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import X.C55172uC;
import X.C65963Ud;
import X.C84504Dm;
import X.C84514Dn;
import X.C89364Wg;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class SettingsSetupUserProxyActivity extends AnonymousClass155 {
    public View A00;
    public TextInputLayout A01;
    public WaTextView A02;
    public WaTextView A03;
    public boolean A04;
    public final AnonymousClass00T A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r0.equals(r1) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.settings.SettingsSetupUserProxyActivity r4) {
        /*
            java.lang.Class<com.whatsapp.settings.SettingsUserProxyActivity> r0 = com.whatsapp.settings.SettingsUserProxyActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r4, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r3 = "source"
            java.lang.String r0 = r0.getStringExtra(r3)
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = "deeplink"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            r2.putExtra(r3, r1)
            X.00T r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.3QR r1 = r0.A00
            X.3QR r0 = r0.A01
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "intent_proxy_has_changed"
            r2.putExtra(r0, r1)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = r0.getStringExtra(r3)
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = "deeplink"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            r4.startActivity(r2)
        L_0x004a:
            r4.finish()
            return
        L_0x004e:
            r0 = -1
            r4.setResult(r0, r2)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsSetupUserProxyActivity.A01(com.whatsapp.settings.SettingsSetupUserProxyActivity):void");
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public SettingsSetupUserProxyActivity(int i) {
        this.A04 = false;
        C89364Wg.A00(this, 31);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        boolean A1X = C36341k9.A1X(this);
        this.A01 = (TextInputLayout) C36361kB.A0H(this, R.id.proxy_host_text_input_layout);
        View findViewById = findViewById(R.id.chat_port_layout);
        View findViewById2 = findViewById(R.id.media_port_layout);
        TextView A0P = C36391kE.A0P(findViewById, R.id.proxy_port_name);
        this.A02 = C36351kA.A0Q(findViewById, R.id.proxy_port_indicator);
        A0P.setText(R.string.f12nameremoved);
        TextView A0P2 = C36391kE.A0P(findViewById2, R.id.proxy_port_name);
        this.A03 = C36351kA.A0Q(findViewById2, R.id.proxy_port_indicator);
        A0P2.setText(R.string.f12nameremoved);
        AnonymousClass3Y8.A00(findViewById, this, 33);
        AnonymousClass3Y8.A00(findViewById2, this, 32);
        this.A00 = C36361kB.A0H(this, R.id.save_proxy_button);
        AnonymousClass00T r3 = this.A05;
        SettingsSetupUserProxyViewModel settingsSetupUserProxyViewModel = (SettingsSetupUserProxyViewModel) r3.getValue();
        Intent intent = getIntent();
        AnonymousClass00C.A08(intent);
        String stringExtra = intent.getStringExtra("intent_host_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        AnonymousClass3QR A002 = C55172uC.A00(stringExtra, intent.getIntExtra("intent_chat_port", 443), intent.getIntExtra("intent_media_port", 587), intent.getBooleanExtra("intent_use_tls", A1X));
        settingsSetupUserProxyViewModel.A00 = A002;
        SettingsSetupUserProxyViewModel.A01(A002, settingsSetupUserProxyViewModel);
        TextInputLayout textInputLayout = this.A01;
        if (textInputLayout == null) {
            throw C36331k8.A0d("proxyInputEditText");
        }
        EditText editText = textInputLayout.A0B;
        if (editText != null) {
            AnonymousClass4WJ.A00(editText, this, 18);
        }
        this.A05.A01(new AnonymousClass4VZ(this, 2), this);
        C65963Ud.A01(this, ((SettingsSetupUserProxyViewModel) r3.getValue()).A02, new AnonymousClass4LH(this), 12);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == 16908332) {
            A01(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public SettingsSetupUserProxyActivity() {
        this(0);
        this.A05 = C36441kJ.A0a(new C84514Dn(this), new C84504Dm(this), new AnonymousClass4HC(this), C36441kJ.A1A(SettingsSetupUserProxyViewModel.class));
    }
}
