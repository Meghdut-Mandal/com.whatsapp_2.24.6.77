package com.whatsapp.conversationslist;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0V9;
import X.AnonymousClass155;
import X.AnonymousClass1RK;
import X.AnonymousClass4I6;
import X.C010804n;
import X.C18800tq;
import X.C18830tt;
import X.C18950u5;
import X.C19430v1;
import X.C24681Dj;
import X.C32931eR;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36431kI;
import X.C89334Wd;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;

public final class InteropConversationsActivity extends AnonymousClass155 implements AnonymousClass1RK {
    public C32931eR A00;
    public C24681Dj A01;
    public boolean A02;
    public final AnonymousClass00T A03;

    public String BH5() {
        return null;
    }

    public Drawable BH6() {
        return null;
    }

    public String BIO() {
        return null;
    }

    public void Bih(AnonymousClass0V9 r2) {
        AnonymousClass00C.A0D(r2, 0);
        super.Bih(r2);
        C36391kE.A14(this);
    }

    public void Bii(AnonymousClass0V9 r2) {
        AnonymousClass00C.A0D(r2, 0);
        super.Bii(r2);
        C36341k9.A0n(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = (C24681Dj) A0B.A6f.get();
            this.A00 = C36431kI.A0g(A0B);
        }
    }

    public C18950u5 BGv() {
        C18950u5 r0 = C19430v1.A02;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public /* synthetic */ void BaQ(int i, int i2) {
        this.A03.getValue();
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(getPackageName(), "com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity");
        startActivity(A0D);
    }

    public InteropConversationsActivity(int i) {
        this.A02 = false;
        C89334Wd.A00(this, 8);
    }

    public /* synthetic */ boolean B0r() {
        return false;
    }

    public String BDl() {
        return getString(R.string.f12nameremoved);
    }

    public Drawable BDm() {
        return C010804n.A00((Resources.Theme) null, getResources(), R.drawable.vec_ic_new_chat);
    }

    public String BDn() {
        return getString(R.string.f12nameremoved);
    }

    public void Bg1() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36321k7.A0P(this);
        C36391kE.A15(this, R.string.f12nameremoved);
        if (this.A00 == null) {
            throw C36331k8.A0d("interopRolloutManager");
        }
    }

    public InteropConversationsActivity() {
        this(0);
        this.A03 = C36431kI.A1I(AnonymousClass4I6.A00);
    }
}
