package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass00E;
import X.AnonymousClass14B;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass1BX;
import X.AnonymousClass1RC;
import X.AnonymousClass3QR;
import X.AnonymousClass3Y8;
import X.AnonymousClass411;
import X.AnonymousClass4XY;
import X.AnonymousClass6YV;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C20420xX;
import X.C20810yC;
import X.C21060yb;
import X.C224514j;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C65963Ud;
import X.C68903ce;
import X.C81163wZ;
import X.C89364Wg;
import X.C89564Xa;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.concurrent.Executor;

public class SettingsUserProxyActivity extends AnonymousClass155 implements C20420xX {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SwitchCompat A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public SettingsUserProxyViewModel A09;
    public boolean A0A;

    private void A01(Intent intent) {
        if (intent == null || intent.getBooleanExtra("intent_proxy_has_changed", true)) {
            this.A09.A0U();
            SettingsUserProxyViewModel settingsUserProxyViewModel = this.A09;
            if (settingsUserProxyViewModel.A0E.A00.A06() && settingsUserProxyViewModel.A02 != null) {
                SettingsUserProxyViewModel.A02(settingsUserProxyViewModel);
            }
            if (!this.A05.isChecked()) {
                this.A05.setChecked(true);
            }
        }
    }

    public /* synthetic */ void BYl() {
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYo() {
    }

    public /* synthetic */ void BYp() {
    }

    public static void A07(SettingsUserProxyActivity settingsUserProxyActivity, boolean z) {
        int i;
        int i2;
        if (settingsUserProxyActivity.A02 != 0 && settingsUserProxyActivity.A00 != 0 && settingsUserProxyActivity.A03 != 0 && !settingsUserProxyActivity.A09.A0W()) {
            SpannableString A0O = C36441kJ.A0O(settingsUserProxyActivity.A07.getText());
            SpannableString A0O2 = C36441kJ.A0O(settingsUserProxyActivity.A06.getText());
            if (z) {
                i = settingsUserProxyActivity.A03;
            } else {
                i = settingsUserProxyActivity.A00;
            }
            A0O.setSpan(new ForegroundColorSpan(i), 0, A0O.length(), 0);
            if (z) {
                i2 = settingsUserProxyActivity.A02;
            } else {
                i2 = settingsUserProxyActivity.A00;
            }
            A0O2.setSpan(new ForegroundColorSpan(i2), 0, A0O2.length(), 0);
            settingsUserProxyActivity.A07.setText(A0O);
            settingsUserProxyActivity.A06.setText(A0O2);
        }
    }

    public void A2F() {
        if (!this.A0A) {
            this.A0A = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A09 = (SettingsUserProxyViewModel) C36441kJ.A0b(this).A00(SettingsUserProxyViewModel.class);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        boolean A1X = C36341k9.A1X(this);
        this.A00 = AnonymousClass1RC.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A03 = AnonymousClass1RC.A00(this, R.attr.f4nameremoved, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
        this.A02 = AnonymousClass1RC.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A04 = AnonymousClass1RC.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A01 = AnonymousClass1RC.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.proxy_switcher);
        this.A05 = switchCompat;
        switchCompat.setChecked(this.A09.A0E.A00.A06());
        AnonymousClass4XY.A00(this.A05, this, 20);
        C20810yC r13 = this.A0D;
        AnonymousClass17Y r10 = this.A05;
        C24801Dv r9 = this.A01;
        C21060yb r12 = this.A08;
        AnonymousClass6YV.A0E(this, Uri.parse("https://faq.whatsapp.com/520504143274092"), r9, r10, C36401kF.A0O(this.A00, R.id.proxy_info_description), r12, r13, getString(R.string.f12nameremoved), "learn-more");
        this.A07 = (WaTextView) C03570Gk.A0B(this, R.id.ip_address_text);
        View findViewById = findViewById(R.id.ip_connection_view_group);
        AnonymousClass3Y8.A00(findViewById, this, 34);
        C89564Xa.A00(findViewById, this, 10);
        this.A06 = (WaTextView) C03570Gk.A0B(this, R.id.connection_status_indicator);
        ViewStub viewStub = (ViewStub) C03570Gk.A0B(this, R.id.connection_media_status_indicator);
        viewStub.setLayoutResource(R.layout.f9nameremoved);
        if (this.A09.A0W()) {
            this.A08 = (WaTextView) viewStub.inflate();
        }
        int i = 8;
        findViewById(R.id.connection_text).setVisibility(C36381kD.A00(this.A09.A0W() ? 1 : 0));
        View findViewById2 = findViewById(R.id.user_proxy_section_divider);
        if (this.A09.A0W()) {
            i = 0;
        }
        findViewById2.setVisibility(i);
        A07(this, this.A09.A0E.A00.A06());
        this.A09.A0U();
        SettingsUserProxyViewModel settingsUserProxyViewModel = this.A09;
        AnonymousClass1BX r3 = settingsUserProxyViewModel.A0D;
        if (r3.A07()) {
            C68903ce r5 = settingsUserProxyViewModel.A0G;
            Number number = (Number) r5.A03.A00();
            if (number == null) {
                number = Integer.valueOf(C36371kC.A01(r5.A05.A01.A00("user_proxy_setting_pref"), "proxy_connection_status"));
            }
            settingsUserProxyViewModel.A00 = number.intValue();
            Number number2 = (Number) r5.A04.A00();
            if (number2 == null) {
                number2 = Integer.valueOf(C36371kC.A01(r5.A05.A01.A00("user_proxy_setting_pref"), "proxy_media_connection_status"));
            }
            settingsUserProxyViewModel.A01 = number2.intValue();
            r3.A03(settingsUserProxyViewModel.A00);
            r3.A02(settingsUserProxyViewModel.A01);
            C81163wZ.A00(settingsUserProxyViewModel.A0H, settingsUserProxyViewModel, 46);
        }
        C68903ce r52 = settingsUserProxyViewModel.A0G;
        AnonymousClass411 r1 = new AnonymousClass411(settingsUserProxyViewModel, 19);
        Executor executor = settingsUserProxyViewModel.A08.A04;
        r52.A03.A03(r1, executor);
        r52.A04.A03(new AnonymousClass411(settingsUserProxyViewModel, 20), executor);
        SettingsUserProxyViewModel settingsUserProxyViewModel2 = this.A09;
        settingsUserProxyViewModel2.A05.A0D(settingsUserProxyViewModel2.A0D.A01());
        SettingsUserProxyViewModel settingsUserProxyViewModel3 = this.A09;
        settingsUserProxyViewModel3.A0V(C36371kC.A01(settingsUserProxyViewModel3.A0D.A01.A00("user_proxy_setting_pref"), "proxy_connection_status"), A1X);
        C65963Ud.A00(this, this.A09.A05, 15);
        C65963Ud.A00(this, this.A09.A06, 13);
        C65963Ud.A00(this, this.A09.A07, 14);
        if ("deeplink".equals(getIntent().getStringExtra("source"))) {
            A01(getIntent());
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu != null && this.A09.A0W()) {
            MenuItem findItem = menu.findItem(R.id.menuitem_share);
            if (findItem == null) {
                findItem = menu.add(0, R.id.menuitem_share, 0, R.string.f12nameremoved).setIcon(AnonymousClass00E.A00(this, R.drawable.ic_action_share));
                findItem.setShowAsAction(1);
            }
            findItem.setVisible(!AnonymousClass14B.A0F(this.A09.A02));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public SettingsUserProxyActivity(int i) {
        this.A0A = false;
        C89364Wg.A00(this, 32);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10001) {
            A01(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_share) {
            AnonymousClass3QR A0S = this.A09.A0S();
            Uri.Builder builder = new Uri.Builder();
            String str = A0S.A02;
            if (str == null) {
                str = A0S.A05;
            }
            Uri build = builder.scheme("https").authority("wa.me").path("proxy").appendQueryParameter("host", str).appendQueryParameter("chatPort", String.valueOf(A0S.A00)).appendQueryParameter("mediaPort", String.valueOf(A0S.A01)).appendQueryParameter("chatTLS", String.valueOf(A0S.A06)).build();
            if (build != null) {
                Intent A0B = C36431kI.A0B();
                A0B.setType("text/plain");
                A0B.putExtra("android.intent.extra.SUBJECT", getString(R.string.f12nameremoved));
                A0B.putExtra("android.intent.extra.TEXT", C36391kE.A0v(this, build.toString(), AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
                A0B.addFlags(524288);
                startActivity(Intent.createChooser(A0B, getString(R.string.f12nameremoved)));
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        if (!this.A05.isChecked() && this.A09.A0W() && AnonymousClass14B.A0F(this.A09.A02)) {
            this.A09.A0U();
            this.A05.setChecked(true);
        }
    }

    public void onStop() {
        super.onStop();
        SettingsUserProxyViewModel settingsUserProxyViewModel = this.A09;
        AnonymousClass1BX r1 = settingsUserProxyViewModel.A0D;
        r1.A03(settingsUserProxyViewModel.A00);
        r1.A02(settingsUserProxyViewModel.A01);
        r1.A04(settingsUserProxyViewModel.A02);
    }

    public SettingsUserProxyActivity() {
        this(0);
    }
}
