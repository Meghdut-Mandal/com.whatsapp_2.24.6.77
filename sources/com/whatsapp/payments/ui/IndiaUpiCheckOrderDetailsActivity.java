package com.whatsapp.payments.ui;

import X.AVb;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.AnonymousClass16J;
import X.AnonymousClass16X;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1A5;
import X.AnonymousClass1DR;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1XC;
import X.AnonymousClass3UJ;
import X.AnonymousClass627;
import X.AnonymousClass7hO;
import X.AnonymousClass8gG;
import X.AnonymousClass9SC;
import X.AnonymousClass9UH;
import X.AnonymousClass9UZ;
import X.AnonymousClass9Za;
import X.B3K;
import X.B7W;
import X.C111245by;
import X.C128166Be;
import X.C131606Ps;
import X.C147346x4;
import X.C165567td;
import X.C165587tf;
import X.C165617ti;
import X.C167747yk;
import X.C175698au;
import X.C175928bI;
import X.C179038ix;
import X.C179148jG;
import X.C179648kT;
import X.C180408lk;
import X.C183728rG;
import X.C18740tg;
import X.C188008yt;
import X.C18820ts;
import X.C194219Oo;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C199969gL;
import X.C202059ky;
import X.C20310xM;
import X.C203749ok;
import X.C206909uC;
import X.C207119ua;
import X.C207259uo;
import X.C207959xO;
import X.C20810yC;
import X.C21060yb;
import X.C21296AGa;
import X.C21298AGc;
import X.C21302AGg;
import X.C21333AHl;
import X.C23043B1o;
import X.C24851Ea;
import X.C24881Ed;
import X.C32681e1;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C64933Qa;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public class IndiaUpiCheckOrderDetailsActivity extends C179038ix implements B3K {
    public AnonymousClass16D A00;
    public AnonymousClass185 A01;
    public C18820ts A02;
    public AnonymousClass16J A03;
    public AnonymousClass8gG A04;
    public AnonymousClass1XC A05;
    public C21302AGg A06;
    public C179648kT A07;
    public AnonymousClass9UH A08;
    public C199969gL A09;
    public C32681e1 A0A;
    public List A0B;
    public C183728rG A0C;

    private void A10(C188008yt r16, C194219Oo r17, int i) {
        int i2;
        int A052;
        int[] iArr;
        int i3;
        AnonymousClass07B supportActionBar = getSupportActionBar();
        int i4 = i;
        if (supportActionBar != null) {
            Resources resources = getResources();
            C20810yC r0 = this.A0D;
            if (i4 == 1) {
                A052 = C165587tf.A05(r0);
                iArr = new int[4];
                iArr[0] = R.string.f12nameremoved;
                iArr[1] = R.string.f12nameremoved;
                iArr[2] = R.string.f12nameremoved;
                i3 = R.string.f12nameremoved;
            } else {
                A052 = C165587tf.A05(r0);
                iArr = new int[4];
                iArr[0] = R.string.f12nameremoved;
                iArr[1] = R.string.f12nameremoved;
                iArr[2] = R.string.f12nameremoved;
                i3 = R.string.f12nameremoved;
            }
            iArr[3] = i3;
            supportActionBar.A0Q(resources.getString(iArr[A052]));
        }
        int i5 = 11;
        if (i4 == 1) {
            i5 = 4;
        }
        C194219Oo r10 = r17;
        this.A09.A03(r10.A0B, this.A06.A08, i5);
        C20810yC r2 = this.A0D;
        List list = this.A09;
        AnonymousClass00C.A0D(r2, 1);
        LinkedHashMap A012 = AnonymousClass9Za.A01(this, r2.A09(1767), list);
        String str = this.A06.A08;
        AnonymousClass00C.A0D(str, 0);
        if (A012.get(str) == null) {
            i2 = 0;
        } else {
            i2 = 1;
            if (this.A0A) {
                i2 = 5;
            }
        }
        if (TextUtils.isEmpty(this.A07)) {
            this.A07 = this.A06.A0C;
        }
        C21302AGg aGg = this.A06;
        aGg.A05.A02(this, this.A02, r16, r10, aGg.A08, this.A09, i2, i4);
    }

    public void BUH(C207119ua r1, AnonymousClass11F r2, AnonymousClass9SC r3, C23043B1o b1o) {
    }

    public boolean BMo() {
        if (this instanceof IndiaUpiQuickBuyActivity) {
            return true;
        }
        return false;
    }

    public void Bbz(C188008yt r5, C194219Oo r6) {
        if (!(this instanceof IndiaUpiQuickBuyActivity)) {
            A10(r5, r6, r6.A00);
        } else if (this.A0A) {
            Objects.requireNonNull(this.A09);
            C18740tg.A0B(C36401kF.A1a(this.A09));
            C21333AHl aHl = (C21333AHl) ((C206909uC) this.A09.get(0)).A00;
            Objects.requireNonNull(aHl);
            String str = aHl.A02;
            BuO(C111245by.A00(this, this.A0D, C36401kF.A0b(this.A04.A00), str), 0);
            A4p(false);
        } else {
            C36391kE.A1Q(new B7W(r6, this, 3), this.A04);
        }
    }

    public void BgH(C207119ua r4) {
        C19730wQ r1 = this.A02;
        r1.A0G();
        if (r1.A0N(r1.A02)) {
            BO5(R.string.f12nameremoved);
        } else if (C179148jG.A1P(this)) {
            AVb.A00(this.A04, this, new C21298AGc(r4, this), 36);
        } else {
            A4n(r4);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19970wo r8 = this.A07;
        C20810yC r7 = this.A0D;
        C32681e1 r6 = this.A0A;
        Resources resources = getResources();
        AnonymousClass1FR r5 = this.A0W;
        C18820ts r4 = this.A02;
        AnonymousClass1EU r3 = this.A0P;
        C180408lk r32 = new C180408lk(resources, this.A01, r8, r4, this.A06, r7, this.A0O, r3, r5, r6);
        C19970wo r20 = this.A07;
        C20810yC r38 = this.A0D;
        AnonymousClass17Y r14 = this.A05;
        C32681e1 r13 = this.A0A;
        C19770wU r37 = this.A04;
        AnonymousClass1FR r12 = this.A0W;
        C18820ts r11 = this.A02;
        AnonymousClass9UH r10 = this.A08;
        AnonymousClass16D r82 = this.A00;
        AnonymousClass1EU r72 = this.A0P;
        C20310xM r62 = this.A07;
        AnonymousClass16J r24 = this.A03;
        AnonymousClass185 r19 = this.A01;
        AnonymousClass1EV r52 = this.A0O;
        C24881Ed r42 = this.A07;
        AnonymousClass1XC r33 = this.A05;
        AnonymousClass1A5 r2 = this.A06;
        C199969gL r1 = this.A09;
        AnonymousClass1DR r27 = this.A0Q;
        AnonymousClass9UZ r15 = this.A0V;
        C18820ts r21 = r11;
        AnonymousClass1A5 r22 = r2;
        C20310xM r23 = r62;
        AnonymousClass17Y r17 = r14;
        AnonymousClass16D r18 = r82;
        this.A06 = new C21302AGg(r17, r18, r19, r20, r21, r22, r23, r24, r42, r38, r27, r52, r72, r33, r15, r32, r10, r12, r1, r13, r37);
        C21060yb r34 = this.A08;
        C64933Qa A022 = AnonymousClass3UJ.A02(getIntent());
        Objects.requireNonNull(A022);
        boolean BMo = BMo();
        AnonymousClass1FR r25 = this.A0W;
        this.A06.A00(this, this, (C167747yk) C165617ti.A0A(new C207959xO(r19, r34, r20, r24, r38, (UserJid) null, r27, this.A0P, r15, r25, A022, r37, false, BMo), this).A00(C167747yk.class));
        if (!(this instanceof IndiaUpiQuickBuyActivity)) {
            C36321k7.A0P(this);
            setContentView((View) this.A06.A05);
        }
        C21302AGg aGg = this.A06;
        C64933Qa r63 = aGg.A07;
        this.A04 = r63;
        C175928bI r53 = this.A0O;
        String str = aGg.A0B;
        if (str == null) {
            str = "";
        }
        r53.A02 = new C207259uo(aGg.A00, str, r63.A01);
        if (this.A0C == null) {
            C183728rG r16 = new C183728rG(this, r63);
            this.A0C = r16;
            C36391kE.A1Q(r16, this.A04);
        }
        A4P();
    }

    public static void A0z(AnonymousClass16X r8, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity, String str) {
        String str2;
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("action", "start");
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put("receiver_jid", indiaUpiCheckOrderDetailsActivity.A0E.getRawString());
        A0J2.put("receiver_vpa", str);
        A0J2.put("order_message_id", indiaUpiCheckOrderDetailsActivity.A06.A07.A01);
        C128166Be r5 = new C128166Be("upi_p2m_order_payment", (String) null, A0J);
        if (indiaUpiCheckOrderDetailsActivity instanceof IndiaUpiQuickBuyActivity) {
            str2 = "chat";
        } else {
            str2 = "order_details";
        }
        ((AnonymousClass627) indiaUpiCheckOrderDetailsActivity.A0j.get()).A00((AnonymousClass7hO) null, new C203749ok(r8, indiaUpiCheckOrderDetailsActivity, 1), r5, str2, A0J2);
    }

    public void A42(Intent intent) {
        super.A42(intent);
        intent.putExtra("extra_order_id", this.A06.A0B);
        intent.putExtra("extra_order_expiry_ts_in_sec", this.A06.A00);
        intent.putExtra("extra_payment_config_id", this.A06.A0C);
    }

    public void A4X(C175698au r4, C175698au r5, C202059ky r6, String str, String str2, boolean z) {
        super.A4X(r4, r5, r6, str, str2, z);
        if (r6 == null && r4 == null && r5 == null && str != null) {
            AVb.A00(this.A04, this, new C21296AGa(str), 37);
        }
    }

    public void A4s(C207119ua r14) {
        C131606Ps A0F = C165567td.A0F();
        AnonymousClass1FR r3 = this.A0W;
        C24851Ea A032 = r3.A09.A02("p2p_context").A03();
        boolean z = false;
        if (A032 != null) {
            String str = A032.A03;
            if ((str.equals("unset") || str.equals("tos_with_wallet") || str.equals("tos_no_wallet")) && !r3.A07.A03().getBoolean("pref_p2m_hybrid_tos_accepted", false)) {
                z = true;
            }
        }
        A0F.A04("tos_displayed", z);
        this.A0S.BOq(A0F, C36361kB.A0i(), C36371kC.A0p(), "order_details", "chat", this.A0i, this.A0h, false, true);
        AVb.A00(this.A04, this, new C147346x4(r14, this), 36);
    }

    public boolean BLF() {
        return !BMo();
    }

    public void Bc0(C188008yt r2, C194219Oo r3) {
        if (BMo()) {
            finish();
        } else {
            A10(r2, r3, 4);
        }
    }

    public void onStart() {
        super.onStart();
        if (BMo()) {
            overridePendingTransition(0, 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!BMo()) {
            return super.onTouchEvent(motionEvent);
        }
        C36351kA.A11(this);
        return true;
    }
}
