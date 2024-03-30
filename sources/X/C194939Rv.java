package X;

import com.whatsapp.util.Log;

/* renamed from: X.9Rv  reason: invalid class name and case insensitive filesystem */
public class C194939Rv {
    public final /* synthetic */ AnonymousClass9RV A00;
    public final /* synthetic */ AnonymousClass1YQ A01;
    public final /* synthetic */ C199359fB A02;
    public final /* synthetic */ String A03;

    public C194939Rv(AnonymousClass9RV r1, AnonymousClass1YQ r2, C199359fB r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }

    public void A00(C202059ky r3) {
        C36321k7.A1J(r3, "PAY: PaymentIncentiveManager/getIncentiveOfferInfo/getOfferDetails/onError : ", AnonymousClass000.A0u());
        AnonymousClass9RV r1 = this.A00;
        if (r1 != null) {
            Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed");
            r1.A01.BWY();
        }
    }
}
