package com.whatsapp.accountlinking.webauthutil;

import X.AnonymousClass00C;
import X.AnonymousClass01L;
import X.AnonymousClass04G;
import X.AnonymousClass507;
import X.C100674vP;
import X.C118935oy;
import X.C1273868b;
import X.C131616Pt;
import X.C142326oh;
import X.C158077fl;
import X.C160377ku;
import X.C162977pS;
import X.C163027pX;
import X.C18700tb;
import X.C18740tg;
import X.C27011Mj;
import X.C28721Tt;
import X.C36331k8;
import X.C36431kI;
import X.C36441kJ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class FxWebAuthLauncherActivity extends AnonymousClass01L implements C18700tb {
    public C131616Pt A00;
    public boolean A01;
    public C158077fl A02;
    public Object A03;
    public boolean A04;
    public final Object A05;
    public volatile C27011Mj A06;

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("activityLaunched", this.A04);
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new C27011Mj(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public FxWebAuthLauncherActivity(int i) {
        this.A05 = C36441kJ.A11();
        this.A01 = false;
        C163027pX.A00(this, 5);
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A00(this, super.BAw());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        String str;
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 2884) {
            C160377ku r5 = null;
            if (intent == null || (stringExtra = intent.getStringExtra("webview_callback")) == null || stringExtra.length() == 0) {
                uri = null;
            } else {
                uri = Uri.parse(stringExtra);
            }
            Object obj = this.A03;
            C158077fl r0 = this.A02;
            if (r0 != null) {
                r5 = r0.B7y();
            }
            C100674vP A032 = C142326oh.A03(obj);
            C1273868b A002 = C1273868b.A00();
            if (i2 != -1 || uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            A002.A0A(str, 0);
            C1273868b.A07(A032, A002, r5);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.A04 = bundle.getBoolean("activityLaunched");
        }
        C131616Pt r2 = this.A00;
        if (r2 != null) {
            this.A03 = r2.A01(new C162977pS("environment", 0), "webAuth");
            C131616Pt r22 = this.A00;
            if (r22 != null) {
                C158077fl r1 = (C158077fl) r22.A01(new C162977pS("callback", 0), "webAuth");
                this.A02 = r1;
                if (this.A04 || this.A03 == null || r1 == null) {
                    finish();
                    return;
                }
                this.A04 = true;
                C118935oy r4 = new C118935oy();
                r4.A01 = getIntent().getStringExtra("initialUrl");
                r4.A00 = getIntent().getStringExtra("callbackUrlScheme");
                AnonymousClass00C.A09(AnonymousClass507.A01);
                Intent className = C36431kI.A0D().setClassName(getPackageName(), "com.whatsapp.accountlinking.FxWaInAppBrowserActivity");
                AnonymousClass00C.A08(className);
                String str = r4.A01;
                C18740tg.A06(str);
                className.putExtra("webview_url", str);
                className.putExtra("webview_callback", r4.A00);
                className.putExtra("webview_avoid_external", true);
                className.putExtra("webview_hide_url", true);
                className.putExtra("webview_javascript_enabled", true);
                startActivityForResult(className, 2884);
                return;
            }
            throw C36331k8.A0d("bkCache");
        }
        throw C36331k8.A0d("bkCache");
    }

    public void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            C131616Pt r2 = this.A00;
            if (r2 != null) {
                r2.A03(new C162977pS("environment", 0), "webAuth");
                C131616Pt r22 = this.A00;
                if (r22 != null) {
                    r22.A03(new C162977pS("callback", 0), "webAuth");
                    return;
                }
                throw C36331k8.A0d("bkCache");
            }
            throw C36331k8.A0d("bkCache");
        }
    }

    public FxWebAuthLauncherActivity() {
        this(0);
    }
}
