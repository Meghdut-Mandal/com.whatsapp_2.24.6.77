package X;

import android.content.Context;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;

/* renamed from: X.2ZS  reason: invalid class name */
public final class AnonymousClass2ZS extends AIB {
    public final /* synthetic */ AnonymousClass4TR A00;
    public final /* synthetic */ BrazilIncomeCollectionViewModel A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2ZS(Context context, AnonymousClass17Y r2, C29221Vu r3, AnonymousClass4TR r4, BrazilIncomeCollectionViewModel brazilIncomeCollectionViewModel) {
        super(context, r3, r2);
        this.A00 = r4;
        this.A01 = brazilIncomeCollectionViewModel;
    }

    public void A07(C203399nx r3) {
        this.A01.A04.A0N("collected");
        this.A00.BZ8();
    }

    public void A05(C202059ky r3) {
        C36321k7.A1K(r3, "PAY: BrazilSaveIncomeInformationAction/saveIncomeSlab onRequestError: ", C36341k9.A0i(r3));
        this.A00.BWY();
    }

    public void A06(C202059ky r3) {
        C36321k7.A1K(r3, "PAY: BrazilSaveIncomeInformationAction/saveIncomeSlab onResponseError: ", C36341k9.A0i(r3));
        this.A00.BWY();
    }
}
