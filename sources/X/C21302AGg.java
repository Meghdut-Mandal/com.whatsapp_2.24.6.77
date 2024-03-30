package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import java.util.Objects;

/* renamed from: X.AGg  reason: case insensitive filesystem */
public class C21302AGg implements C23031B1c {
    public long A00;
    public AnonymousClass155 A01;
    public AnonymousClass9S7 A02;
    public B3K A03;
    public AnonymousClass9SA A04;
    public PaymentCheckoutOrderDetailsViewV2 A05;
    public C200239gv A06;
    public C64933Qa A07;
    public String A08 = "WhatsappPay";
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public C167747yk A0D;
    public C88874Uj A0E;
    public final AnonymousClass17Y A0F;
    public final AnonymousClass16D A0G;
    public final C18820ts A0H;
    public final C20310xM A0I;
    public final C24881Ed A0J;
    public final C20810yC A0K;
    public final AnonymousClass1XC A0L;
    public final AnonymousClass9UH A0M;
    public final AnonymousClass1FR A0N;
    public final C199969gL A0O;
    public final C19770wU A0P;
    public final AnonymousClass185 A0Q;
    public final C19970wo A0R;
    public final AnonymousClass1A5 A0S;
    public final AnonymousClass16J A0T;
    public final AnonymousClass1DR A0U;
    public final AnonymousClass1EV A0V;
    public final AnonymousClass1EU A0W;
    public final AnonymousClass9UZ A0X;
    public final C32681e1 A0Y;

    public void Bts(C202319lY r10, AnonymousClass11F r11, long j) {
        AnonymousClass155 r1;
        int i;
        C39001qm A002 = AnonymousClass3LW.A00(this.A01);
        A002.A0r(false);
        B84.A00(A002, this, 44, R.string.f12nameremoved);
        C175708av r12 = r10.A0A;
        if (r12 == null || !(r12 instanceof C175928bI) || !((C175928bI) r12).A0X) {
            A002.setTitle(this.A01.getString(R.string.f12nameremoved));
            r1 = this.A01;
            i = R.string.f12nameremoved;
        } else {
            A002.setTitle(this.A01.getString(R.string.f12nameremoved));
            r1 = this.A01;
            i = R.string.f12nameremoved;
        }
        A002.A0Z(r1.getString(i));
        AnonymousClass11F r4 = r11;
        if (this.A0N.A0h(r11)) {
            A002.setNegativeButton(R.string.f12nameremoved, new C23163B7x(r4, this, 1, j));
        }
        C36341k9.A11(A002);
    }

    public void A00(AnonymousClass155 r5, B3K b3k, C167747yk r7) {
        this.A01 = r5;
        this.A03 = b3k;
        this.A0B = r5.getIntent().getStringExtra("extra_order_id");
        this.A09 = r5.getIntent().getStringExtra("extra_order_discount_program_name");
        this.A00 = r5.getIntent().getLongExtra("extra_order_expiry_ts_in_sec", 0);
        this.A0C = r5.getIntent().getStringExtra("extra_payment_config_id");
        C64933Qa A022 = AnonymousClass3UJ.A02(r5.getIntent());
        Objects.requireNonNull(A022);
        this.A07 = A022;
        if (r5.getIntent().getBooleanExtra("extra_checkout_lite_enabled", false)) {
            this.A08 = "checkout_lite";
        }
        AH2 ah2 = new AH2(r5, b3k, this);
        this.A0E = ah2;
        this.A06.A00 = ah2;
        AnonymousClass9SA r2 = new AnonymousClass9SA(this.A0J, this, this.A0P);
        this.A04 = r2;
        r5.A06.A04(new PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0(r2));
        this.A0D = r7;
        r7.A0Z(false);
        BAA.A00(r5, r7.A02, this, 3);
        this.A05 = (PaymentCheckoutOrderDetailsViewV2) LayoutInflater.from(r5).inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
    }

    public void A01(C188008yt r8, C194219Oo r9) {
        if (this.A03.BMo()) {
            this.A0O.A03(r9.A0B, this.A08, 12);
        }
        C19770wU r6 = this.A0P;
        C20310xM r1 = this.A0I;
        AnonymousClass1XC r4 = this.A0L;
        C202449lr.A02(this.A0F, r1, this.A0J, new C21154AAo(this, r8, r9), r4, r9.A0B, r6);
    }

    public boolean BtR(int i) {
        return AnonymousClass000.A1S(i, 405);
    }

    public C21302AGg(AnonymousClass17Y r2, AnonymousClass16D r3, AnonymousClass185 r4, C19970wo r5, C18820ts r6, AnonymousClass1A5 r7, C20310xM r8, AnonymousClass16J r9, C24881Ed r10, C20810yC r11, AnonymousClass1DR r12, AnonymousClass1EV r13, AnonymousClass1EU r14, AnonymousClass1XC r15, AnonymousClass9UZ r16, C200239gv r17, AnonymousClass9UH r18, AnonymousClass1FR r19, C199969gL r20, C32681e1 r21, C19770wU r22) {
        this.A0R = r5;
        this.A0K = r11;
        this.A0F = r2;
        this.A0Y = r21;
        this.A0P = r22;
        this.A0N = r19;
        this.A0H = r6;
        this.A0M = r18;
        this.A0G = r3;
        this.A0W = r14;
        this.A0I = r8;
        this.A0T = r9;
        this.A0Q = r4;
        this.A0V = r13;
        this.A0J = r10;
        this.A0L = r15;
        this.A0S = r7;
        this.A0O = r20;
        this.A0U = r12;
        this.A0X = r16;
        this.A06 = r17;
    }
}
