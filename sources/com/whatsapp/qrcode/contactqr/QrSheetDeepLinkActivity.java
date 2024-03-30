package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass17Z;
import X.AnonymousClass185;
import X.AnonymousClass19A;
import X.AnonymousClass1A6;
import X.AnonymousClass1DX;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1N4;
import X.AnonymousClass1NC;
import X.AnonymousClass1QW;
import X.AnonymousClass4OW;
import X.AnonymousClass4RX;
import X.C18800tq;
import X.C18830tt;
import X.C19600wD;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C21100yf;
import X.C21159AAt;
import X.C25851Hx;
import X.C26861Lu;
import X.C27261Nn;
import X.C29151Vn;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C603437m;
import X.C62483Gi;
import X.C64783Pk;
import X.C64933Qa;
import X.C89354Wf;
import android.os.Bundle;

public class QrSheetDeepLinkActivity extends AnonymousClass155 implements AnonymousClass4RX, AnonymousClass4OW {
    public AnonymousClass1NC A00;
    public AnonymousClass1N4 A01;
    public C26861Lu A02;
    public C32691e2 A03;
    public C603437m A04;
    public AnonymousClass16D A05;
    public C27261Nn A06;
    public AnonymousClass185 A07;
    public AnonymousClass171 A08;
    public C21159AAt A09;
    public AnonymousClass1A6 A0A;
    public AnonymousClass17Z A0B;
    public C25851Hx A0C;
    public AnonymousClass1DX A0D;
    public C62483Gi A0E;
    public C21010yW A0F;
    public AnonymousClass19A A0G;
    public AnonymousClass1QW A0H;
    public AnonymousClass1EV A0I;
    public AnonymousClass1EU A0J;
    public C29151Vn A0K;
    public C64783Pk A0L;
    public String A0M;
    public boolean A0N;

    public void A2F() {
        if (!this.A0N) {
            this.A0N = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0F = C36351kA.A0g(A0B2);
            this.A00 = C36401kF.A0J(A0B2);
            this.A03 = C36371kC.A0R(A0B2);
            this.A0G = C36361kB.A0c(A0B2);
            this.A05 = C36341k9.A0R(A0B2);
            this.A08 = C36341k9.A0S(A0B2);
            this.A02 = (C26861Lu) A0B2.A2c.get();
            this.A0J = C36381kD.A0f(A0B2);
            this.A09 = C36411kG.A0b(A0B2);
            this.A01 = C36351kA.A0K(A0B2);
            this.A0D = (AnonymousClass1DX) A0B2.AFJ.get();
            this.A07 = C36371kC.A0U(A0B2);
            this.A0A = C36401kF.A0V(A0B2);
            this.A0I = C36371kC.A0h(A0B2);
            this.A0H = (AnonymousClass1QW) r1.A0Z.get();
            this.A0K = (C29151Vn) A0B2.AVb.get();
            this.A06 = (C27261Nn) A0B2.AQN.get();
            this.A0C = (C25851Hx) A0B2.AGV.get();
            this.A0B = C36411kG.A0c(A0B2);
            this.A04 = (C603437m) r1.A5d.get();
            this.A0E = (C62483Gi) r1.A5h.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19970wo r25 = this.A07;
        C20810yC r29 = this.A0D;
        AnonymousClass17Y r45 = this.A05;
        C19730wQ r44 = this.A02;
        C19770wU r36 = this.A04;
        C21010yW r30 = this.A0F;
        AnonymousClass1NC r43 = this.A00;
        C21100yf r42 = this.A06;
        C32691e2 r41 = this.A03;
        AnonymousClass19A r31 = this.A0G;
        AnonymousClass16D r40 = this.A05;
        C21060yb r19 = this.A08;
        AnonymousClass171 r18 = this.A08;
        C26861Lu r17 = this.A02;
        C21159AAt aAt = this.A09;
        AnonymousClass1N4 r14 = this.A01;
        AnonymousClass1DX r13 = this.A0D;
        AnonymousClass185 r12 = this.A07;
        AnonymousClass1A6 r10 = this.A0A;
        AnonymousClass1EV r9 = this.A0I;
        AnonymousClass1QW r8 = this.A0H;
        C29151Vn r7 = this.A0K;
        C19600wD r6 = this.A07;
        C27261Nn r5 = this.A06;
        C25851Hx r4 = this.A0C;
        AnonymousClass17Z r3 = this.A0B;
        C64783Pk r72 = new C64783Pk(r43, r14, r17, this, r45, r41, r44, r42, this.A04, r6, r40, r5, r12, r18, aAt, r10, r19, r25, r3, r4, r13, r29, r30, r31, r8, r9, this.A0J, r7, r36, (Integer) null, false, false);
        this.A0L = r72;
        r72.A01 = getIntent().getStringExtra("extra_deep_link_session_id");
        this.A0L.A02 = true;
        this.A0M = getIntent().getStringExtra("qrcode");
        boolean booleanExtra = getIntent().getBooleanExtra("from_internal_deep_link_click", false);
        String str = this.A0M;
        if (str != null && !this.A0L.A0e) {
            this.A0M = str;
            this.A0L.A02((C64933Qa) null, str, 5, false, booleanExtra);
        }
    }

    public QrSheetDeepLinkActivity(int i) {
        this.A0N = false;
        C89354Wf.A00(this, 39);
    }

    public void Bdw() {
        finish();
    }

    public QrSheetDeepLinkActivity() {
        this(0);
    }
}
