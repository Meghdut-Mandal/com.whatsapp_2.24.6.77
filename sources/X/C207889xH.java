package X;

import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* renamed from: X.9xH  reason: invalid class name and case insensitive filesystem */
public class C207889xH implements AnonymousClass04G {
    public final /* synthetic */ AnonymousClass8gO A00;
    public final /* synthetic */ AnonymousClass8gS A01;
    public final /* synthetic */ IndiaUpiMandatePaymentActivity A02;

    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r2, Class cls) {
        return AnonymousClass0QC.A00(this, cls);
    }

    public C207889xH(AnonymousClass8gO r1, AnonymousClass8gS r2, IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity) {
        this.A02 = indiaUpiMandatePaymentActivity;
        this.A01 = r2;
        this.A00 = r1;
    }

    public AnonymousClass04R B3o(Class cls) {
        IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = this.A02;
        AnonymousClass9DX r4 = indiaUpiMandatePaymentActivity.A01;
        C202319lY r13 = ((C206289t2) indiaUpiMandatePaymentActivity.getIntent().getParcelableExtra("payment_transaction_info")).A00;
        AnonymousClass8gR r6 = indiaUpiMandatePaymentActivity.A08;
        AnonymousClass8gS r5 = this.A01;
        AnonymousClass8gO r3 = this.A00;
        AnonymousClass8gJ r2 = indiaUpiMandatePaymentActivity.A07;
        int i = indiaUpiMandatePaymentActivity.A00;
        String A0J = C173858Tk.A0J(indiaUpiMandatePaymentActivity);
        C18800tq r42 = r4.A00.A01;
        C19970wo A0V = C36351kA.A0V(r42);
        C19630wG A0W = C36351kA.A0W(r42);
        AnonymousClass17Y A0M = C36351kA.A0M(r42);
        C19730wQ A0N = C36351kA.A0N(r42);
        C19770wU A0Z = C36341k9.A0Z(r42);
        AnonymousClass1EU A0f = C36381kD.A0f(r42);
        C24601Db A0S = C165587tf.A0S(r42);
        AF7 A0V2 = C165587tf.A0V(r42);
        AnonymousClass8gS r20 = r5;
        AnonymousClass8gR r21 = r6;
        AnonymousClass8gO r18 = r3;
        AnonymousClass8gJ r19 = r2;
        return new C167687yZ(A0M, A0N, A0V, A0W, (AnonymousClass16S) r42.A6x.get(), r13, C165607th.A0X(r42), A0S, (AnonymousClass1DR) r42.A6G.get(), A0f, r18, r19, r20, r21, A0V2, A0Z, A0J, i);
    }
}
