package com.whatsapp.companiondevice;

import X.AnonymousClass14B;
import X.AnonymousClass155;
import X.AnonymousClass192;
import X.AnonymousClass19A;
import X.AnonymousClass1LU;
import X.AnonymousClass1OP;
import X.AnonymousClass30D;
import X.AnonymousClass3D4;
import X.AnonymousClass3LW;
import X.AnonymousClass3M6;
import X.AnonymousClass3N1;
import X.AnonymousClass3PV;
import X.AnonymousClass3WB;
import X.AnonymousClass4RZ;
import X.AnonymousClass751;
import X.C012005e;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C20380xT;
import X.C236419g;
import X.C237819v;
import X.C27111My;
import X.C31611c6;
import X.C31621c7;
import X.C31641c9;
import X.C31661cB;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C429721s;
import X.C53592rZ;
import X.C55202uF;
import X.C593933t;
import X.C61303Bi;
import X.C63643Kv;
import X.C64233Ne;
import X.C88694Tr;
import X.C88884Uk;
import X.C89324Wc;
import X.C90024Yu;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.qrcode.AgentDeviceLoginViewModel;

public class LinkedDevicesEnterCodeActivity extends AnonymousClass155 implements AnonymousClass4RZ {
    public C19460v5 A00;
    public C61303Bi A01;
    public C32691e2 A02;
    public C593933t A03;
    public C31641c9 A04;
    public C31621c7 A05;
    public C31611c6 A06;
    public C237819v A07;
    public AnonymousClass3D4 A08;
    public C31661cB A09;
    public C88694Tr A0A;
    public AnonymousClass1OP A0B;
    public C236419g A0C;
    public AnonymousClass1LU A0D;
    public AnonymousClass19A A0E;
    public AgentDeviceLoginViewModel A0F;
    public C63643Kv A0G;
    public C20380xT A0H;
    public Runnable A0I;
    public boolean A0J;
    public final AnonymousClass3N1 A0K;
    public final AnonymousClass192 A0L;
    public final C88884Uk A0M;

    public void A2F() {
        if (!this.A0J) {
            this.A0J = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r2 = r1.A00;
            C36321k7.A0X(r1, r2, this, C36321k7.A05(r1, r2, this));
            this.A02 = C36371kC.A0R(r1);
            this.A0E = C36361kB.A0c(r1);
            this.A0H = C36331k8.A0I(r1);
            this.A0D = C36411kG.A0e(r1);
            this.A0C = C36381kD.A0a(r1);
            this.A07 = (C237819v) r1.A40.get();
            this.A00 = C19470v6.A00;
            this.A05 = (C31621c7) r1.AE7.get();
            this.A01 = (C61303Bi) A0L2.A0o.get();
            this.A04 = (C31641c9) r1.AAP.get();
            this.A03 = (C593933t) r2.ACM.get();
            this.A08 = (AnonymousClass3D4) r2.A6A.get();
            this.A06 = (C31611c6) r1.AEA.get();
            this.A0B = (AnonymousClass1OP) r1.AFm.get();
            this.A09 = (C31661cB) r1.AEB.get();
        }
    }

    public void BTv(String str) {
        AnonymousClass3PV A002 = this.A05.A00();
        if (C36431kI.A1R(this)) {
            A30(new AnonymousClass3WB(A002, this), 0, R.string.f12nameremoved);
            this.A04.Bp1(new AnonymousClass751(35, str, this));
        } else if (!BLh()) {
            A07(this, 2);
        }
    }

    public void onDestroy() {
        AnonymousClass3D4 r1 = this.A08;
        C18740tg.A01();
        r1.A01 = null;
        this.A0C.unregisterObserver(this.A0L);
        this.A06.unregisterObserver(this.A0K);
        super.onDestroy();
    }

    public void onStop() {
        this.A09.A00 = false;
        super.onStop();
    }

    public LinkedDevicesEnterCodeActivity(int i) {
        this.A0J = false;
        C89324Wc.A00(this, 20);
    }

    public static void A01(LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity) {
        linkedDevicesEnterCodeActivity.Bnv();
        C18740tg.A01();
        Runnable runnable = linkedDevicesEnterCodeActivity.A0I;
        if (runnable != null) {
            linkedDevicesEnterCodeActivity.A00.removeCallbacks(runnable);
        }
    }

    public static void A07(LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity, int i) {
        C39001qm A002 = AnonymousClass3LW.A00(linkedDevicesEnterCodeActivity);
        C39001qm.A04(linkedDevicesEnterCodeActivity, A002);
        A002.A0k(linkedDevicesEnterCodeActivity, new C53592rZ(linkedDevicesEnterCodeActivity, 22));
        int i2 = R.string.f12nameremoved;
        if (i != 1) {
            i2 = R.string.f12nameremoved;
        }
        A002.A0d(i2);
        int i3 = R.string.f12nameremoved;
        if (i != 1) {
            i3 = R.string.f12nameremoved;
            if (i != 2) {
                i3 = R.string.f12nameremoved;
                if (i != 3) {
                    i3 = R.string.f12nameremoved;
                }
            }
        }
        A002.A0c(i3);
        A002.A0b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0A = this.A0B.A00();
        AnonymousClass3D4 r3 = this.A08;
        C88884Uk r2 = this.A0M;
        C18740tg.A01();
        r3.A01 = new C64233Ne((AnonymousClass30D) r3.A00.A00.A00.A00.A7k.get(), r2);
        this.A0C.registerObserver(this.A0L);
        this.A06.registerObserver(this.A0K);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        int A1X = C36341k9.A1X(this);
        TextEmojiLabel A0e = C36441kJ.A0e(this, R.id.enter_code_description);
        C36331k8.A1A(this.A0D, A0e);
        SpannableStringBuilder A0P = C36441kJ.A0P(Html.fromHtml(C36391kE.A0v(this, this.A0H.A02("1324084875126592").toString(), new Object[A1X], 0, R.string.f12nameremoved)));
        URLSpan[] A1a = C36381kD.A1a(A0P, 0);
        if (A1a != null) {
            for (URLSpan uRLSpan : A1a) {
                C36351kA.A18(A0P, uRLSpan, C429721s.A00(this, uRLSpan, this.A02, this.A05, this.A08));
            }
        }
        C36331k8.A16(A0e, this.A08);
        C36431kI.A1M(A0e, A0P);
        this.A0G = this.A01.A00(new C55202uF());
        String stringExtra = getIntent().getStringExtra("prefilled_link_code");
        this.A0G.A02((LinearLayout) C012005e.A02(this.A00, R.id.enter_code_boxes), this, 8);
        if (!AnonymousClass14B.A0F(stringExtra)) {
            BTv(stringExtra);
        }
        getIntent().getIntExtra("entry_point", A1X);
        getIntent().getStringExtra("agent_id");
        AgentDeviceLoginViewModel agentDeviceLoginViewModel = (AgentDeviceLoginViewModel) C36441kJ.A0b(this).A00(AgentDeviceLoginViewModel.class);
        this.A0F = agentDeviceLoginViewModel;
        C53592rZ.A00(this, agentDeviceLoginViewModel.A00, 23);
        C53592rZ.A00(this, this.A0F.A01, 24);
        this.A04.A00(2);
    }

    public void onStart() {
        super.onStart();
        C31661cB r1 = this.A09;
        r1.A00 = true;
        r1.A03.A03(54, "CompanionRegWithLinkCodeNotificationManager/onEnterCodeActivityStart");
    }

    public LinkedDevicesEnterCodeActivity() {
        this(0);
        this.A0M = new AnonymousClass3M6(this, 0);
        this.A0L = new C90024Yu(this, 0);
        this.A0K = new AnonymousClass3N1(this);
    }
}
