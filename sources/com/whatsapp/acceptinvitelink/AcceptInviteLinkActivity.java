package com.whatsapp.acceptinvitelink;

import X.AnonymousClass000;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass19A;
import X.AnonymousClass1EM;
import X.AnonymousClass1LV;
import X.AnonymousClass1RY;
import X.AnonymousClass3EZ;
import X.AnonymousClass3HI;
import X.AnonymousClass4YE;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19700wN;
import X.C19970wo;
import X.C20350xQ;
import X.C20510xg;
import X.C20810yC;
import X.C21010yW;
import X.C220412q;
import X.C230717b;
import X.C231417i;
import X.C24381Cf;
import X.C24521Ct;
import X.C27731Pn;
import X.C27751Pr;
import X.C27781Pu;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C48732hx;
import X.C49722ja;
import X.C65533Sl;
import X.C66923Xv;
import X.C75243mu;
import X.C89314Wb;
import X.C90124Ze;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.concurrent.atomic.AtomicReference;

public class AcceptInviteLinkActivity extends AnonymousClass155 {
    public AnonymousClass1LV A00;
    public AnonymousClass16D A01;
    public AnonymousClass171 A02;
    public C27731Pn A03;
    public C33751fs A04;
    public C18820ts A05;
    public C220412q A06;
    public C24381Cf A07;
    public AnonymousClass17X A08;
    public C27781Pu A09;
    public C231417i A0A;
    public C27751Pr A0B;
    public C21010yW A0C;
    public C20350xQ A0D;
    public C230717b A0E;
    public C20510xg A0F;
    public AnonymousClass3HI A0G;
    public AnonymousClass19A A0H;
    public AnonymousClass1EM A0I;
    public Runnable A0J;
    public int A0K;
    public AnonymousClass1RY A0L;
    public boolean A0M;
    public final AtomicReference A0N;
    public final C24521Ct A0O;

    public void A2F() {
        if (!this.A0M) {
            this.A0M = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r2 = A0B2.A00;
            C36321k7.A0X(A0B2, r2, this, C36321k7.A05(A0B2, r2, this));
            this.A06 = C36351kA.A0a(A0B2);
            this.A0C = C36351kA.A0g(A0B2);
            this.A03 = C36351kA.A0T(A0B2);
            this.A0E = (C230717b) A0B2.AOc.get();
            this.A0H = C36361kB.A0c(A0B2);
            this.A01 = C36341k9.A0R(A0B2);
            this.A02 = C36341k9.A0S(A0B2);
            this.A05 = C36341k9.A0T(A0B2);
            this.A0I = C36371kC.A0l(A0B2);
            this.A0D = C36361kB.A0a(A0B2);
            this.A0F = C36431kI.A0e(A0B2);
            this.A0A = (C231417i) A0B2.A8k.get();
            this.A0B = C36381kD.A0b(A0B2);
            this.A09 = (C27781Pu) A0B2.A8D.get();
            this.A00 = C36361kB.A0U(A0B2);
            this.A04 = C36361kB.A0X(r2);
            this.A07 = C36371kC.A0Y(A0B2);
            this.A08 = C36351kA.A0b(A0B2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        View findViewById = findViewById(R.id.invite_container);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C90124Ze(findViewById, findViewById(R.id.background), this, 0));
        this.A0L = this.A03.A05(this, "accept-invite-link-activity");
        C66923Xv.A01(findViewById(R.id.filler), this, 19);
        this.A0K = getIntent().getIntExtra("display_type", 0);
        TextView A0H2 = C36401kF.A0H(this, R.id.progress_text);
        int i = this.A0K;
        if (i == 0) {
            A0H2.setText(R.string.f12nameremoved);
            String stringExtra = getIntent().getStringExtra("code");
            if (TextUtils.isEmpty(stringExtra)) {
                this.A05.A06(R.string.f12nameremoved, 1);
                finish();
            } else {
                C36321k7.A1Q("acceptlink/processcode/", stringExtra, AnonymousClass000.A0u());
                C36391kE.A1Q(new C49722ja(this, this.A07, this.A0D, this.A0F, this.A0H, stringExtra), this.A04);
            }
        } else if (i == 1) {
            A0H2.setText(R.string.f12nameremoved);
            String stringExtra2 = getIntent().getStringExtra("subgroup_jid");
            String stringExtra3 = getIntent().getStringExtra("parent_group_jid");
            C65533Sl r1 = AnonymousClass147.A01;
            AnonymousClass147 A062 = r1.A06(stringExtra2);
            AnonymousClass147 A063 = r1.A06(stringExtra3);
            if (A062 == null || A063 == null) {
                C19700wN r4 = this.A03;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("subgroup jid is null = ");
                boolean z = true;
                A0u.append(AnonymousClass000.A1W(A062));
                A0u.append("parent group jid is null = ");
                if (A063 != null) {
                    z = false;
                }
                r4.A0E("parent-group-error", C36421kH.A0d(A0u, z), false);
            } else {
                this.A0N.set(A062);
                new AnonymousClass3EZ(this.A03, this.A00, new C75243mu(this, A063), A063, this.A0H).A00(A062);
            }
        }
        C19970wo r12 = this.A07;
        C20810yC r15 = this.A0D;
        C220412q r14 = this.A06;
        AnonymousClass16D r9 = this.A01;
        AnonymousClass171 r10 = this.A02;
        C18820ts r13 = this.A05;
        AnonymousClass1EM r2 = this.A0I;
        AnonymousClass3HI r6 = new AnonymousClass3HI(this, C36421kH.A0E(this, R.id.invite_root), r9, r10, this.A0L, r12, r13, r14, r15, r2);
        this.A0G = r6;
        r6.A00 = true;
        this.A07.registerObserver(this.A0O);
        C36331k8.A0l(this);
        C36361kB.A0u(this);
    }

    public AcceptInviteLinkActivity(int i) {
        this.A0M = false;
        C89314Wb.A00(this, 9);
    }

    public static void A01(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        C66923Xv.A01(acceptInviteLinkActivity.findViewById(R.id.invite_ignore), acceptInviteLinkActivity, 20);
        C36331k8.A11(acceptInviteLinkActivity, R.id.progress);
        C36401kF.A1B(acceptInviteLinkActivity, R.id.group_info);
    }

    public static void A07(AcceptInviteLinkActivity acceptInviteLinkActivity, int i) {
        acceptInviteLinkActivity.findViewById(R.id.progress).setVisibility(4);
        C36341k9.A13(acceptInviteLinkActivity, R.id.group_info, 4);
        C36401kF.A1B(acceptInviteLinkActivity, R.id.error);
        C36341k9.A13(acceptInviteLinkActivity, R.id.learn_more, 4);
        C36391kE.A0Q(acceptInviteLinkActivity, R.id.error_text).setText(i);
        C48732hx.A00(acceptInviteLinkActivity.findViewById(R.id.ok), acceptInviteLinkActivity, 5);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.unregisterObserver(this.A0O);
        Runnable runnable = this.A0J;
        if (runnable != null) {
            this.A05.A0G(runnable);
        }
        this.A0L.A02();
    }

    public AcceptInviteLinkActivity() {
        this(0);
        this.A0N = new AtomicReference((Object) null);
        this.A0O = new AnonymousClass4YE(this, 0);
    }
}
