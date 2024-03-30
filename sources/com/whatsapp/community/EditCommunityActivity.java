package com.whatsapp.community;

import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass16K;
import X.AnonymousClass171;
import X.AnonymousClass1O7;
import X.AnonymousClass1RY;
import X.AnonymousClass2Es;
import X.AnonymousClass3QL;
import X.AnonymousClass4W3;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C226815j;
import X.C27731Pn;
import X.C28421Sp;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C65533Sl;
import X.C89324Wc;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.jid.GroupJid;

public class EditCommunityActivity extends AnonymousClass2Es {
    public AnonymousClass16D A00;
    public AnonymousClass16I A01;
    public AnonymousClass171 A02;
    public AnonymousClass1O7 A03;
    public AnonymousClass1RY A04;
    public C27731Pn A05;
    public AnonymousClass141 A06;
    public GroupJid A07;
    public boolean A08;
    public final C226815j A09;

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r2 = A0B.A00;
            C36321k7.A0X(A0B, r2, this, C36321k7.A05(A0B, r2, this));
            this.A0B = (AnonymousClass16K) A0B.A2C.get();
            this.A0D = C36381kD.A0b(A0B);
            this.A0F = C36391kE.A0k(A0B);
            this.A0A = C36431kI.A0Z(A0B);
            this.A09 = (C28421Sp) A0B.ADy.get();
            this.A0E = C36351kA.A0m(A0B);
            this.A0C = C36361kB.A0W(A0B);
            this.A05 = C36351kA.A0T(A0B);
            this.A00 = C36341k9.A0R(A0B);
            this.A02 = C36341k9.A0S(A0B);
            this.A01 = C36351kA.A0S(A0B);
            this.A03 = (AnonymousClass1O7) A0B.AEU.get();
        }
    }

    public EditCommunityActivity(int i) {
        this.A08 = false;
        C89324Wc.A00(this, 9);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 64206) {
            if (i != 16436755) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            C36411kG.A1J(this.A0F);
            if (i2 != -1) {
                if (i2 == 0 && intent != null) {
                    this.A0F.A04(intent, this);
                    return;
                }
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    this.A01.A01(this.A07);
                    this.A0F.A0D(this.A06);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    C36411kG.A1J(this.A0F);
                }
            }
            this.A0F.A05(intent, this, 16436755);
            return;
        } else {
            return;
        }
        this.A01.A01(this.A07);
        this.A0F.A0F(this.A06);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A04 = this.A05.A03(this, this, "community-home");
        this.A01.registerObserver(this.A09);
        AnonymousClass147 A002 = C65533Sl.A00(getIntent(), "extra_community_jid");
        C18740tg.A06(A002);
        this.A07 = A002;
        AnonymousClass141 A0D = this.A00.A0D(A002);
        this.A06 = A0D;
        this.A08.setText(this.A02.A0H(A0D));
        WaEditText waEditText = this.A07;
        AnonymousClass3QL r0 = this.A06.A0K;
        C18740tg.A06(r0);
        waEditText.setText(r0.A03);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A04.A0A(this.A03, this.A06, dimensionPixelSize, false);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01.unregisterObserver(this.A09);
    }

    public EditCommunityActivity() {
        this(0);
        this.A09 = AnonymousClass4W3.A00(this, 7);
    }
}
