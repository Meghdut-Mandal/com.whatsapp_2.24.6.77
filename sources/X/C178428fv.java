package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8fv  reason: invalid class name and case insensitive filesystem */
public class C178428fv extends AIB {
    public final /* synthetic */ C193509Lt A00;
    public final /* synthetic */ C194939Rv A01;
    public final /* synthetic */ C186018vH A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178428fv(Context context, C29221Vu r2, C193509Lt r3, C194939Rv r4, C19640wH r5, C186018vH r6) {
        super(context, r2, r5);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r6;
    }

    public void A05(C202059ky r2) {
        this.A01.A00(r2);
    }

    public void A06(C202059ky r2) {
        this.A01.A00(r2);
    }

    public void A07(C203399nx r9) {
        try {
            C194939Rv r4 = this.A01;
            ArrayList arrayList = C186248ve.A0F;
            C186248ve r3 = new C186248ve(r9, this.A02);
            AnonymousClass1YQ r7 = r4.A01;
            C199359fB r2 = r4.A02;
            String str = r4.A03;
            AnonymousClass9RV r5 = r4.A00;
            try {
                C198299dE r6 = new C198299dE(r7.A03, r2, r3, str);
                AnonymousClass1YS r42 = r7.A05;
                long j = r6.A08.A01;
                C198299dE r32 = (C198299dE) r42.A01.get(Long.valueOf(j));
                if (r32 != null) {
                    r6.A02 = r32.A02;
                    r6.A00 = r32.A00;
                    r6.A01 = r32.A01;
                }
                r42.A03(r6, j);
                if (r5 != null) {
                    r5.A00(r6);
                }
            } catch (Exception e) {
                Log.e("PAY: PaymentIncentiveManager/processSuccessfulGetOfferDetails : Error while parsing ", e);
                r7.A05.A01();
                if (r5 != null) {
                    Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed");
                    r5.A01.BWY();
                }
            }
        } catch (C235919b e2) {
            C165577te.A1M("GetIncentiveOffer", e2.getMessage());
            this.A01.A00(C202059ky.A00());
        }
    }
}
