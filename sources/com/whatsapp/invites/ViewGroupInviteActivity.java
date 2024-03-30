package com.whatsapp.invites;

import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1A1;
import X.AnonymousClass1EM;
import X.AnonymousClass1RY;
import X.AnonymousClass2XC;
import X.AnonymousClass2bQ;
import X.AnonymousClass3HI;
import X.AnonymousClass4YE;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19630wG;
import X.C19770wU;
import X.C19970wo;
import X.C20510xg;
import X.C220412q;
import X.C24381Cf;
import X.C24521Ct;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C605738j;
import X.C87934Qt;
import X.C89344We;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicReference;

public class ViewGroupInviteActivity extends AnonymousClass155 implements C87934Qt {
    public int A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ImageView A03;
    public TextView A04;
    public AnonymousClass16D A05;
    public AnonymousClass171 A06;
    public AnonymousClass1RY A07;
    public C27731Pn A08;
    public C19630wG A09;
    public C18820ts A0A;
    public C220412q A0B;
    public C24381Cf A0C;
    public AnonymousClass17X A0D;
    public C20510xg A0E;
    public AnonymousClass3HI A0F;
    public UserJid A0G;
    public AnonymousClass19A A0H;
    public C605738j A0I;
    public AnonymousClass2bQ A0J;
    public AnonymousClass1A1 A0K;
    public AnonymousClass1EM A0L;
    public Runnable A0M;
    public boolean A0N;
    public View A0O;
    public ViewGroup A0P;
    public TextView A0Q;
    public boolean A0R;
    public final AtomicReference A0S;
    public final C24521Ct A0T;

    public void BfZ(UserJid userJid) {
        this.A04.setText(R.string.f12nameremoved);
        this.A02.setVisibility(0);
        this.A01.setVisibility(4);
        C19770wU r1 = this.A04;
        C19970wo r4 = this.A07;
        AnonymousClass17Y r3 = this.A05;
        C20510xg r5 = this.A0E;
        Object obj = this.A0S.get();
        C18740tg.A06(obj);
        C36391kE.A1Q(new AnonymousClass2XC(r3, r4, r5, this, (AnonymousClass147) obj, userJid), r1);
    }

    public static void A01(ViewGroupInviteActivity viewGroupInviteActivity, int i) {
        viewGroupInviteActivity.A0Q.setText(i);
        viewGroupInviteActivity.A02.setVisibility(4);
        viewGroupInviteActivity.A0P.setVisibility(0);
        viewGroupInviteActivity.A01.setVisibility(4);
        viewGroupInviteActivity.A0O.setVisibility(8);
    }

    public void A2F() {
        if (!this.A0R) {
            this.A0R = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A09 = C36351kA.A0W(A0B2);
            this.A0B = C36351kA.A0a(A0B2);
            this.A08 = C36351kA.A0T(A0B2);
            this.A0H = C36361kB.A0c(A0B2);
            this.A05 = C36341k9.A0R(A0B2);
            this.A06 = C36341k9.A0S(A0B2);
            this.A0A = C36341k9.A0T(A0B2);
            this.A0L = C36371kC.A0l(A0B2);
            this.A0K = C36351kA.A0n(A0B2);
            this.A0E = C36431kI.A0e(A0B2);
            this.A0C = C36371kC.A0Y(A0B2);
            this.A0D = C36351kA.A0b(A0B2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r1 == false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r12 = r22
            r0 = r23
            super.onCreate(r0)
            android.content.Intent r5 = r12.getIntent()
            java.lang.String r3 = "from_me"
            boolean r0 = r5.hasExtra(r3)
            r4 = 0
            if (r0 == 0) goto L_0x007e
            java.lang.String r2 = "key_remote_jid"
            boolean r0 = r5.hasExtra(r2)
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = "key_id"
            boolean r0 = r5.hasExtra(r1)
            if (r0 == 0) goto L_0x007e
            boolean r0 = r5.getBooleanExtra(r3, r4)
            r12.A0N = r0
            java.lang.String r0 = r5.getStringExtra(r2)
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)
            r12.A0G = r0
            java.lang.String r0 = "group_type"
            int r0 = r5.getIntExtra(r0, r4)
            r12.A00 = r0
            com.whatsapp.jid.UserJid r3 = r12.A0G
            if (r3 == 0) goto L_0x007e
            boolean r2 = r12.A0N
            java.lang.String r0 = r5.getStringExtra(r1)
            X.3Qa r1 = new X.3Qa
            r1.<init>(r3, r0, r2)
            X.1A1 r0 = r12.A0K
            X.3T1 r2 = r0.A03(r1)
            boolean r0 = r2 instanceof X.AnonymousClass2bQ
            if (r0 == 0) goto L_0x007e
            X.2bQ r2 = (X.AnonymousClass2bQ) r2
            r12.A0J = r2
            java.util.concurrent.atomic.AtomicReference r1 = r12.A0S
            X.147 r0 = r2.A02
            r1.set(r0)
            java.lang.Object r0 = r1.get()
            r2 = 1
            if (r0 != 0) goto L_0x0082
            X.17Y r3 = r12.A05
            X.1EM r1 = r12.A0L
            X.2bQ r0 = r12.A0J
            int r0 = r0.A00
            boolean r1 = r1.A03(r0)
            r0 = 2131889532(0x7f120d7c, float:1.941373E38)
            if (r1 != 0) goto L_0x007b
        L_0x0078:
            r0 = 2131889531(0x7f120d7b, float:1.9413728E38)
        L_0x007b:
            r3.A06(r0, r2)
        L_0x007e:
            r12.finish()
            return
        L_0x0082:
            X.2bQ r1 = r12.A0J
            X.3Qa r0 = r1.A1J
            X.11F r0 = r0.A00
            com.whatsapp.jid.UserJid r7 = X.C222813r.A00(r0)
            X.147 r6 = r1.A02
            if (r6 == 0) goto L_0x00a4
            java.lang.String r8 = r1.A06
            if (r8 == 0) goto L_0x00a4
            if (r7 == 0) goto L_0x00a4
            long r9 = r1.A01
            X.38j r5 = new X.38j
            r5.<init>(r6, r7, r8, r9)
        L_0x009d:
            r12.A0I = r5
            if (r5 != 0) goto L_0x00a6
            X.17Y r3 = r12.A05
            goto L_0x0078
        L_0x00a4:
            r5 = 0
            goto L_0x009d
        L_0x00a6:
            r0 = 2131896300(0x7f1227ec, float:1.9427457E38)
            r12.setTitle(r0)
            r0 = 2131626451(0x7f0e09d3, float:1.8880139E38)
            r12.setContentView((int) r0)
            r1 = 2131431006(0x7f0b0e5e, float:1.848373E38)
            r0 = 2131431006(0x7f0b0e5e, float:1.848373E38)
            android.view.View r6 = r12.findViewById(r1)
            r1 = 2131427893(0x7f0b0235, float:1.8477415E38)
            android.view.View r5 = r12.findViewById(r1)
            android.view.ViewTreeObserver r3 = r6.getViewTreeObserver()
            r2 = 3
            X.4Ze r1 = new X.4Ze
            r1.<init>(r6, r5, r12, r2)
            r3.addOnGlobalLayoutListener(r1)
            X.1Pn r2 = r12.A08
            java.lang.String r1 = "view-group-invite-activity"
            X.1RY r1 = r2.A05(r12, r1)
            r12.A07 = r1
            r1 = 2131433000(0x7f0b1628, float:1.8487773E38)
            android.view.ViewGroup r1 = X.C36421kH.A0E(r12, r1)
            r12.A02 = r1
            r1 = 2131430637(0x7f0b0ced, float:1.848298E38)
            android.view.ViewGroup r1 = X.C36421kH.A0E(r12, r1)
            r12.A01 = r1
            r1 = 2131430012(0x7f0b0a7c, float:1.8481713E38)
            android.view.ViewGroup r1 = X.C36421kH.A0E(r12, r1)
            r12.A0P = r1
            r1 = 2131433013(0x7f0b1635, float:1.84878E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r12, r1)
            r12.A04 = r1
            r1 = 2131430025(0x7f0b0a89, float:1.848174E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r12, r1)
            r12.A0Q = r1
            r1 = 2131430651(0x7f0b0cfb, float:1.848301E38)
            android.widget.ImageView r1 = X.C36411kG.A0Q(r12, r1)
            r12.A03 = r1
            r1 = 2131430652(0x7f0b0cfc, float:1.8483011E38)
            android.view.View r1 = r12.findViewById(r1)
            r12.A0O = r1
            X.0wo r8 = r12.A07
            X.0yC r7 = r12.A0D
            X.12q r6 = r12.A0B
            X.16D r14 = r12.A05
            X.171 r15 = r12.A06
            X.0ts r5 = r12.A0A
            X.1EM r3 = r12.A0L
            X.1RY r2 = r12.A07
            r1 = 2131431016(0x7f0b0e68, float:1.848375E38)
            android.view.ViewGroup r13 = X.C36421kH.A0E(r12, r1)
            X.3HI r11 = new X.3HI
            r16 = r2
            r17 = r8
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r12.A0F = r11
            r11.A00 = r4
            r1 = 2131431011(0x7f0b0e63, float:1.848374E38)
            android.view.View r2 = r12.findViewById(r1)
            r1 = 41
            X.AnonymousClass3Y3.A00(r2, r12, r1)
            r1 = 2131430995(0x7f0b0e53, float:1.8483707E38)
            android.widget.TextView r3 = X.C36391kE.A0Q(r12, r1)
            r1 = 19
            X.C48752hz.A00(r3, r12, r1)
            boolean r1 = r12.A0N
            if (r1 == 0) goto L_0x01c8
            r2 = 2131893737(0x7f121de9, float:1.9422259E38)
        L_0x0164:
            r3.setText(r2)
            r1 = 2131432194(0x7f0b1302, float:1.8486139E38)
            android.view.View r2 = r12.findViewById(r1)
            r1 = 42
            X.AnonymousClass3Y3.A00(r2, r12, r1)
            r1 = 2131431149(0x7f0b0eed, float:1.848402E38)
            X.C36331k8.A11(r12, r1)
            X.1Cf r2 = r12.A0C
            X.1Ct r1 = r12.A0T
            r2.registerObserver(r1)
            r1 = 2131430277(0x7f0b0b85, float:1.848225E38)
            android.view.View r2 = r12.findViewById(r1)
            r1 = 43
            X.AnonymousClass3Y3.A00(r2, r12, r1)
            X.0wU r1 = r12.A04
            X.0wo r6 = r12.A07
            X.0yC r10 = r12.A0D
            X.0wQ r3 = r12.A02
            X.0wG r7 = r12.A09
            X.12q r8 = r12.A0B
            X.19A r13 = r12.A0H
            X.16D r4 = r12.A05
            X.171 r5 = r12.A06
            X.0xg r11 = r12.A0E
            X.17X r9 = r12.A0D
            X.2bQ r15 = r12.A0J
            X.38j r14 = r12.A0I
            X.C18740tg.A06(r14)
            X.2kT r2 = new X.2kT
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.C36391kE.A1Q(r2, r1)
            X.C36331k8.A0l(r12)
            X.C36361kB.A0u(r12)
            android.view.animation.AlphaAnimation r3 = X.C36351kA.A0D()
            r1 = 150(0x96, double:7.4E-322)
            r3.setDuration(r1)
            android.view.View r0 = r12.findViewById(r0)
            r0.startAnimation(r3)
            return
        L_0x01c8:
            X.1EM r2 = r12.A0L
            X.2bQ r1 = r12.A0J
            int r1 = r1.A00
            boolean r1 = r2.A03(r1)
            r2 = 2131890622(0x7f1211be, float:1.941594E38)
            if (r1 == 0) goto L_0x0164
            r2 = 2131890626(0x7f1211c2, float:1.941595E38)
            goto L_0x0164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.invites.ViewGroupInviteActivity.onCreate(android.os.Bundle):void");
    }

    public ViewGroupInviteActivity(int i) {
        this.A0R = false;
        C89344We.A00(this, 9);
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0M;
        if (runnable != null) {
            this.A05.A0G(runnable);
            this.A0M = null;
        }
        this.A0C.unregisterObserver(this.A0T);
        this.A07.A02();
    }

    public ViewGroupInviteActivity() {
        this(0);
        this.A0S = new AtomicReference((Object) null);
        this.A0T = new AnonymousClass4YE(this, 16);
    }
}
