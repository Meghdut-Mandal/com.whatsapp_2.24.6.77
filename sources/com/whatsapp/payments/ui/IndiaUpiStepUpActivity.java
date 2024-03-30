package com.whatsapp.payments.ui;

import X.AE0;
import X.AEA;
import X.AF7;
import X.AVY;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1YM;
import X.AnonymousClass3LW;
import X.AnonymousClass8gR;
import X.AnonymousClass9IK;
import X.AnonymousClass9S6;
import X.B7Z;
import X.B84;
import X.B9J;
import X.BA9;
import X.BAA;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import X.C167567yI;
import X.C173858Tk;
import X.C175748az;
import X.C175818b6;
import X.C179108jC;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C191459Da;
import X.C194029Nv;
import X.C195479Ul;
import X.C202059ky;
import X.C202269lR;
import X.C207249un;
import X.C24611Dc;
import X.C27111My;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C36321k7;
import X.C36351kA;
import X.C39001qm;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.List;

public class IndiaUpiStepUpActivity extends C179108jC {
    public C191459Da A00;
    public C175748az A01;
    public AnonymousClass1YM A02;
    public AnonymousClass8gR A03;
    public C167567yI A04;
    public String A05;
    public boolean A06;
    public final C24611Dc A07;
    public final List A08;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable A072 = C173858Tk.A07(this);
        C18740tg.A07(A072, "Bank account must be passed with intent extras");
        this.A01 = (C175748az) A072;
        List list = this.A08;
        String stringExtra = getIntent().getStringExtra("extra_step_up_id");
        C18740tg.A07(stringExtra, "Step up id must be passed as intent extra");
        list.add(stringExtra);
        AnonymousClass17Y r4 = this.A05;
        AnonymousClass19A r5 = this.A0H;
        C29131Vl r14 = this.A0D;
        C202269lR r6 = this.A0L;
        C29121Vk r9 = this.A0M;
        C195479Ul r10 = this.A06;
        AF7 af7 = this.A0S;
        C29221Vu r8 = this.A0K;
        AE0 ae0 = this.A0M;
        this.A03 = new AnonymousClass8gR(this, r4, r5, r6, ae0, r8, r9, r10, this, af7, this.A0V, r14);
        AnonymousClass9S6 r2 = new AnonymousClass9S6(this, r4, r8, r9);
        this.A05 = A3t(ae0.A0A());
        C167567yI r22 = (C167567yI) C165617ti.A0A(new B9J(r2, this, 4), this).A00(C167567yI.class);
        this.A04 = r22;
        r22.A00.A08(this, new BAA(this, 0));
        C167567yI r23 = this.A04;
        r23.A02.A08(this, new BA9(this, 49));
        C167567yI r3 = this.A04;
        AnonymousClass9IK.A00(r3.A04.A00, r3.A00, R.string.f12nameremoved);
        r3.A07.A02();
    }

    public void A2F() {
        if (!this.A06) {
            this.A06 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            C173858Tk.A0k(A0L, r2, r1, this);
            this.A00 = (C191459Da) A0L.A2s.get();
            this.A02 = (AnonymousClass1YM) r2.AVM.get();
        }
    }

    public void BgO(C202059ky r3) {
        throw AnonymousClass001.A0E(this.A07.A03("onSetPin unsupported"));
    }

    public Dialog onCreateDialog(int i) {
        int i2 = i;
        if (i != 28) {
            if (i != 32) {
                switch (i) {
                    case 10:
                        return A49(new AVY(this, 22), getString(R.string.f12nameremoved), getString(R.string.f12nameremoved), i2, R.string.f12nameremoved, R.string.f12nameremoved);
                    case 11:
                        break;
                    case 12:
                        return A48(new AVY(this, 23), getString(R.string.f12nameremoved), 12, R.string.f12nameremoved, R.string.f12nameremoved);
                    default:
                        return super.onCreateDialog(i);
                }
            } else {
                C39001qm A002 = AnonymousClass3LW.A00(this);
                A002.A0c(R.string.f12nameremoved);
                B84.A00(A002, this, 38, R.string.f12nameremoved);
                return A002.create();
            }
        }
        return A47(this.A01, i);
    }

    public IndiaUpiStepUpActivity(int i) {
        this.A06 = false;
        B7Z.A00(this, 41);
    }

    public void BZk(C202059ky r6, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A07.A06("onListKeys called");
            C167567yI r4 = this.A04;
            C175748az r3 = r4.A05;
            C194029Nv r1 = new C194029Nv(0);
            r1.A05 = str;
            r1.A04 = r3.A0B;
            r1.A01 = (C175818b6) r3.A08;
            r1.A06 = (String) C207249un.A06(r3);
            r4.A02.A0D(r1);
        } else if (r6 != null && !AEA.A02(this, "upi-list-keys", r6.A00, false)) {
            if (this.A04.A05("upi-list-keys")) {
                this.A0M.A0F();
                Bnv();
                Bu1(R.string.f12nameremoved);
                this.A03.A02();
                return;
            }
            C24611Dc r2 = this.A07;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C173858Tk.A0I(str, A0u));
            C165567td.A18(r2, " failed; ; showErrorAndFinish", A0u);
            A4D();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1014) {
            if (i2 == -1) {
                this.A0P.A08();
                this.A0C.A06(this.A08);
                this.A02.A03((String) null);
            }
            finish();
        }
    }

    public IndiaUpiStepUpActivity() {
        this(0);
        this.A07 = C165587tf.A0X("IndiaUpiStepUpActivity");
        this.A08 = AnonymousClass001.A0I();
    }
}
