package com.whatsapp.twofactor;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass06T;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.AnonymousClass155;
import X.C012005e;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C29011Uz;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36431kI;
import X.C81183wb;
import X.C81293wm;
import X.C88614Tj;
import X.C89374Wh;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import java.util.List;

public class TwoFactorAuthActivity extends AnonymousClass155 implements C88614Tj {
    public static final int[] A0B = {R.id.page_indicator_1, R.id.page_indicator_2, R.id.page_indicator_3};
    public AnonymousClass07B A00;
    public C29011Uz A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public int[] A07;
    public boolean A08;
    public final Handler A09;
    public final Runnable A0A;

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A01 = (C29011Uz) r1.A49.get();
        }
    }

    public boolean A3l(AnonymousClass02E r4) {
        if (this.A07.length == 1 || r4.getClass() == SetEmailFragment.class) {
            return true;
        }
        return false;
    }

    public void Bjj(int i) {
        Handler handler = this.A09;
        handler.removeCallbacks(this.A0A);
        handler.postDelayed(new C81293wm((Object) this, i, 20), 700);
    }

    public void Bjk() {
        Handler handler = this.A09;
        handler.removeCallbacks(this.A0A);
        handler.postDelayed(C81183wb.A00(this, 40), 700);
    }

    public TwoFactorAuthActivity(int i) {
        this.A08 = false;
        C89374Wh.A00(this, 18);
    }

    public void A3i(View view, int i) {
        View A022 = C012005e.A02(view, R.id.page_indicator);
        if (this.A0D.A0E(5711)) {
            A022.setVisibility(8);
            return;
        }
        int i2 = 0;
        A022.setVisibility(0);
        while (i2 < i) {
            i2++;
            AnonymousClass06T.A00(ColorStateList.valueOf(C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved)), C36391kE.A0N(view, A0B[i2]));
        }
        int length = this.A07.length;
        while (true) {
            length++;
            int[] iArr = A0B;
            if (length < 3) {
                C36341k9.A10(view, iArr[length], 8);
            } else {
                return;
            }
        }
    }

    public void A3j(AnonymousClass02E r6, boolean z) {
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        A0O.A06(R.anim.f1nameremoved, R.anim.f1nameremoved, R.anim.f1nameremoved, R.anim.f1nameremoved);
        A0O.A0B(r6, R.id.container);
        if (z) {
            A0O.A0J((String) null);
        }
        A0O.A01();
    }

    public void A3k(boolean z) {
        Bu1(R.string.f12nameremoved);
        this.A09.postDelayed(this.A0A, C29011Uz.A0F);
        this.A01.A00 = z;
        this.A04.Bp1(C81183wb.A00(this, 41));
    }

    public void onCreate(Bundle bundle) {
        Bundle A072;
        AnonymousClass02E setCodeFragment;
        super.onCreate(bundle);
        getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        setTitle(R.string.f12nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        this.A00 = supportActionBar;
        boolean z = true;
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
        }
        int[] intArrayExtra = C36431kI.A0F(this, R.layout.f9nameremoved).getIntArrayExtra("workflows");
        C18740tg.A06(intArrayExtra);
        this.A07 = intArrayExtra;
        if (intArrayExtra.length <= 0) {
            z = false;
        }
        C18740tg.A0C(z);
        String stringExtra = getIntent().getStringExtra("primaryCTA");
        C18740tg.A06(stringExtra);
        this.A06 = stringExtra;
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        int i = this.A07[0];
        if (i == 1) {
            A072 = AnonymousClass001.A07();
            A072.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
            setCodeFragment = new SetCodeFragment();
        } else if (i == 2) {
            A072 = AnonymousClass001.A07();
            A072.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
            setCodeFragment = new SetEmailFragment();
        } else {
            throw AnonymousClass001.A09(AnonymousClass000.A0r("Invalid work flow:", AnonymousClass000.A0u(), i));
        }
        setCodeFragment.A17(A072);
        A0O.A0B(setCodeFragment, R.id.container);
        A0O.A01();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.A0I() > 0) {
                supportFragmentManager.A0V();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        List list = this.A01.A09;
        C18740tg.A0C(list.contains(this));
        list.remove(this);
    }

    public void onResume() {
        super.onResume();
        List list = this.A01.A09;
        C18740tg.A0C(!list.contains(this));
        list.add(this);
    }

    public TwoFactorAuthActivity() {
        this(0);
        this.A09 = C36341k9.A0H();
        this.A0A = C81183wb.A00(this, 39);
    }
}
