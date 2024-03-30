package com.whatsapp.registration.flashcall;

import X.AnonymousClass07B;
import X.AnonymousClass190;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RU;
import X.AnonymousClass1X8;
import X.AnonymousClass26H;
import X.AnonymousClass3C2;
import X.AnonymousClass3DM;
import X.AnonymousClass3RF;
import X.AnonymousClass3TX;
import X.C03570Gk;
import X.C19630wG;
import X.C20830yE;
import X.C21520zN;
import X.C29501Ww;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C36441kJ;
import X.C62623Gw;
import X.C65983Uf;
import X.C67133Yq;
import X.C77353qM;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class PrimaryFlashCallEducationScreen extends AnonymousClass26H {
    public AnonymousClass3C2 A00;
    public AnonymousClass1RU A01;
    public C19630wG A02;
    public C20830yE A03;
    public C21520zN A04;
    public C62623Gw A05;
    public C29501Ww A06;
    public AnonymousClass1X8 A07;
    public C77353qM A08;
    public AnonymousClass3DM A09;
    public AnonymousClass3TX A0A;
    public int A0B = -1;
    public long A0C = 0;
    public long A0D = 0;
    public boolean A0E;

    private SpannableString A01(Typeface typeface, String str) {
        TypefaceSpan typefaceSpan;
        Spanned fromHtml = Html.fromHtml(str);
        String obj = fromHtml.toString();
        SpannableString A0O = C36441kJ.A0O(obj);
        for (Object obj2 : fromHtml.getSpans(0, obj.length(), Object.class)) {
            int spanStart = fromHtml.getSpanStart(obj2);
            int spanEnd = fromHtml.getSpanEnd(obj2);
            int spanFlags = fromHtml.getSpanFlags(obj2);
            if (Build.VERSION.SDK_INT >= 28) {
                typefaceSpan = new TypefaceSpan(typeface);
            } else {
                typefaceSpan = new TypefaceSpan("sans-serif-medium");
            }
            A0O.setSpan(typefaceSpan, spanStart, spanEnd, spanFlags);
            A0O.setSpan(new ForegroundColorSpan(C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved)), spanStart, spanEnd, spanFlags);
        }
        return A0O;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || i == 2) {
            this.A08.A04(i, i2);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        Intent intent;
        this.A0A.A08("flash_call_education", "back");
        if (this.A01.A0F(this.A0E)) {
            Log.i("PrimaryFlashCallEducationScreen/onBackPressed/is adding new account");
            C65983Uf.A0F(this, this.A01, this.A09, this.A0A);
            return;
        }
        if (this.A0E) {
            Log.i("PrimaryFlashCallEducationScreen/back-pressed/go-to-change-number-screen");
            C29501Ww.A02(this.A06, 3, true);
            if (!this.A06.A0F()) {
                finish();
                return;
            }
            intent = AnonymousClass190.A00(this);
        } else {
            Log.i("PrimaryFlashCallEducationScreen/back-pressed/go-to-register-phone-screen");
            C29501Ww.A02(this.A06, 1, true);
            intent = AnonymousClass190.A0B(this);
            intent.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        }
        A33(intent, true);
    }

    public void onCreate(Bundle bundle) {
        Log.i("PrimaryFlashCallEducationScreen/oncreate");
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36331k8.A0n(this);
        C36331k8.A0w(C36331k8.A05(this.A09), "pref_flash_call_education_screen_displayed", true);
        if (C36371kC.A0H(this) != null) {
            this.A0B = getIntent().getIntExtra("flash_type", -1);
            this.A0C = getIntent().getLongExtra("sms_retry_time", 0);
            this.A0D = getIntent().getLongExtra("voice_retry_time", 0);
            this.A0E = getIntent().getBooleanExtra("change_number", false);
        }
        C65983Uf.A0M(this.A00, this, this.A00, R.id.verify_flash_call_title_toolbar, false, true, this.A01.A0F(this.A0E));
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0X(false);
        }
        Typeface createFromAsset = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
        C36401kF.A0H(this, R.id.flash_call_education_screen_headline).setTypeface(createFromAsset, 0);
        C36401kF.A0H(this, R.id.make_and_manage_calls).setText(A01(createFromAsset, getString(R.string.f12nameremoved)));
        C36401kF.A0H(this, R.id.access_phone_call_logs).setText(A01(createFromAsset, getString(R.string.f12nameremoved)));
        this.A09.A00(C36441kJ.A0e(this, R.id.flash_call_learn_more), this, R.string.f12nameremoved);
        C65983Uf.A0O(this, this.A04, R.id.verify_flash_call_title_toolbar_text);
        this.A08 = this.A00.A00(this, 2, this.A0B, this.A0C, this.A0D, this.A04.A0E(3902));
        View A0B2 = C03570Gk.A0B(this, R.id.verify_with_sms_button);
        C67133Yq.A00(A0B2, this, 17);
        if (this.A04.A0E(3591)) {
            AnonymousClass1RJ A0r = C36351kA.A0r(this, R.id.verify_another_way_button_view_stub);
            A0B2.setVisibility(8);
            A0r.A03(0);
            A0r.A05(new C67133Yq((Object) this, 16));
            getSupportFragmentManager().A0l(new AnonymousClass3RF(this, 13), this, "VERIFY_ANOTHER_WAY_FRAGMENT_RESULT");
        }
        C67133Yq.A00(C03570Gk.A0B(this, R.id.continue_button), this, 18);
        if (this.A09.A0B() == -1) {
            C36341k9.A0v(C36331k8.A05(this.A09), "pref_flash_call_education_link_clicked", 0);
        }
        this.A0A.A04("flash_call_education");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f12nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            Log.i("PrimaryFlashCallEducationScreen/select-menu-option/help");
            this.A05.A01(this, this.A07, "verify-flash-call");
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Log.i("PrimaryFlashCallEducationScreen/select-menu-option/reset");
            this.A06.A09();
            C36361kB.A0t(this);
            return true;
        }
    }
}
