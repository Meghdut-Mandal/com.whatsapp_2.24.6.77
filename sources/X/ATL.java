package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

public final /* synthetic */ class ATL implements C25711Hj {
    public final /* synthetic */ AnonymousClass16X A00;
    public final /* synthetic */ C207249un A01;
    public final /* synthetic */ C146506vi A02;
    public final /* synthetic */ C175938bJ A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ AnonymousClass2bV A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ ATL(AnonymousClass16X r1, C207249un r2, C146506vi r3, C175938bJ r4, BrazilPaymentActivity brazilPaymentActivity, AnonymousClass2bV r6, String str, String str2) {
        this.A04 = brazilPaymentActivity;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = r3;
        this.A05 = r6;
    }

    public final void accept(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        C175938bJ r6 = this.A03;
        AnonymousClass16X r3 = this.A00;
        C207249un r4 = this.A01;
        String str = this.A06;
        String str2 = this.A07;
        C146506vi r5 = this.A02;
        AnonymousClass2bV r8 = this.A05;
        r6.A02 = (Boolean) obj;
        AnonymousClass16U A012 = brazilPaymentActivity.A06.A01("BRL");
        C36331k8.A1F(new C183698rD(A012, r3, r4, r5, r6, brazilPaymentActivity, r8, str, str2), brazilPaymentActivity.A04);
    }
}
