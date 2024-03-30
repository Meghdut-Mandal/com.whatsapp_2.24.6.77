package X;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: X.ADz  reason: case insensitive filesystem */
public class C21243ADz implements AnonymousClass1XD, C23037B1i {
    public B2Z A00;
    public AnonymousClass1EU A01;
    public C183778rL A02;
    public final AnonymousClass155 A03;
    public final C25251Fo A04;
    public final AnonymousClass1YK A05;
    public final AnonymousClass1DR A06;
    public final C193889Nh A07;
    public final C22988Aze A08;
    public final C23039B1k A09;
    public final C19770wU A0A;
    public final boolean A0B;
    public final AnonymousClass1EZ A0C;
    public final C29231Vv A0D;
    public final C24601Db A0E;
    public final AnonymousClass1XC A0F;
    public final C23037B1i A0G;
    public final String A0H;
    public final C29121Vk A0I;
    public final C24611Dc A0J = C165607th.A0c("PaymentDataPresenter", "payment");

    public synchronized void A00(boolean z) {
        synchronized (this) {
            C183778rL r1 = this.A02;
            if (r1 != null) {
                r1.A0D(true);
            }
            AnonymousClass155 r4 = this.A03;
            C19770wU r9 = this.A0A;
            C183778rL r3 = new C183778rL(r4, this.A04, this.A05, this.A01, this.A07, r9, AnonymousClass001.A0F(this.A08), AnonymousClass001.A0F(this.A09), this.A0B, z);
            this.A02 = r3;
            r9.Bp0(r3, new Void[0]);
        }
    }

    public void A01(boolean z, boolean z2) {
        boolean z3 = this.A0B;
        if (z3) {
            C203349np r1 = new C203349np(this, 5);
            this.A00 = r1;
            this.A06.registerObserver(r1);
        }
        AnonymousClass1EZ r3 = this.A0C;
        if (r3.A0F() || this.A0D.A0F()) {
            C24601Db r2 = this.A0E;
            if (!C36371kC.A1U(r2.A03(), "has_p2mlite_account") && (z2 || C19970wo.A00(r2.A01) - C36341k9.A0B(r2.A03(), "payments_methods_last_sync_time") > C90484aE.A0K(TimeUnit.HOURS))) {
                this.A0I.A09(this);
            }
        }
        if (!r3.A0F() && !this.A0D.A0F()) {
            C24601Db r32 = this.A0E;
            if (!r32.A03().getBoolean("payment_account_recovered", false) || !r32.A03().getBoolean("payment_account_recoverable", false)) {
                return;
            }
        }
        if (z3 && z) {
            this.A0F.A01(this, (Integer) null, (Integer) null, (String) null, this.A0H);
        }
    }

    public void Bes(C202059ky r4) {
        C165567td.A15(this.A0J, r4, "getPaymentMethods/getPaymentTransactions/onRequestError. paymentNetworkError: ", AnonymousClass000.A0u());
    }

    public void Bf0(C202059ky r4) {
        C165567td.A15(this.A0J, r4, "getPaymentMethods/getPaymentTransactions/onResponseError. paymentNetworkError: ", AnonymousClass000.A0u());
    }

    public void Bf1(AnonymousClass9KX r11) {
        if (r11 instanceof C178538gh) {
            this.A0J.A04("init/getMethods/onResponseSuccess");
        } else if (r11 instanceof C178548gi) {
            C24611Dc r2 = this.A0J;
            r2.A04("init/getTransactions/onResponseSuccess");
            C178548gi r112 = (C178548gi) r11;
            C206879u9 r1 = r112.A00;
            if (r1 == null) {
                r2.A04("unexpected payment transaction result type.");
            } else if (!r1.A01 && !TextUtils.isEmpty(r1.A00)) {
                this.A0F.A01(this, (Integer) null, (Integer) null, r112.A00.A00, this.A0H);
            }
        } else {
            return;
        }
        A00(false);
    }

    public C21243ADz(AnonymousClass155 r3, C25251Fo r4, AnonymousClass1EZ r5, C29231Vv r6, AnonymousClass1YK r7, C24601Db r8, AnonymousClass1DR r9, C29121Vk r10, AnonymousClass1EU r11, AnonymousClass1XC r12, C193889Nh r13, C23037B1i b1i, C22988Aze aze, C23039B1k b1k, C19770wU r17, String str, boolean z) {
        this.A03 = r3;
        this.A0A = r17;
        this.A07 = r13;
        this.A01 = r11;
        this.A0E = r8;
        this.A0C = r5;
        this.A0I = r10;
        this.A0F = r12;
        this.A0D = r6;
        this.A08 = aze;
        this.A06 = r9;
        this.A04 = r4;
        this.A05 = r7;
        this.A0G = b1i;
        this.A09 = b1k;
        this.A0H = str;
        this.A0B = z;
    }

    public void BQr(boolean z) {
        throw null;
    }

    public void BcR(C207249un r2) {
        throw null;
    }
}
