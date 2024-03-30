package com.whatsapp.payments.ui;

import X.AnonymousClass00C;
import X.AnonymousClass03T;
import X.AnonymousClass19A;
import X.AnonymousClass1FR;
import X.AnonymousClass2ZT;
import X.AnonymousClass35D;
import X.AnonymousClass4TR;
import X.AnonymousClass4X3;
import X.AnonymousClass6X5;
import X.C186018vH;
import X.C18740tg;
import X.C203399nx;
import X.C23075B3f;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;
import java.util.ArrayList;

public final class BrazilPaymentIncomeCollectionBottomSheet extends Hilt_BrazilPaymentIncomeCollectionBottomSheet {
    public static ArrayList A05 = AnonymousClass03T.A02(new AnonymousClass35D(0, 15000), new AnonymousClass35D(15000, AnonymousClass6X5.A0L), new AnonymousClass35D(AnonymousClass6X5.A0L, 45000), new AnonymousClass35D(45000, 60000), new AnonymousClass35D(60000, Long.MAX_VALUE));
    public C23075B3f A00;
    public AnonymousClass4TR A01;
    public BrazilIncomeCollectionViewModel A02;
    public AnonymousClass1FR A03;
    public String A04;

    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        BrazilIncomeCollectionViewModel brazilIncomeCollectionViewModel = this.A02;
        if (brazilIncomeCollectionViewModel == null) {
            throw C36331k8.A0d("brazilIncomeCollectionViewModel");
        }
        Context A0B = C36371kC.A0B(view2);
        AnonymousClass4X3 r7 = new AnonymousClass4X3(view2, this, 1);
        AnonymousClass19A r10 = brazilIncomeCollectionViewModel.A02;
        String A09 = r10.A09();
        C186018vH r9 = new C186018vH(A09, 2);
        C203399nx r12 = r9.A00;
        AnonymousClass00C.A08(r12);
        r10.A0E(new AnonymousClass2ZT(A0B, brazilIncomeCollectionViewModel.A00, brazilIncomeCollectionViewModel.A03, r7, brazilIncomeCollectionViewModel, r9), r12, A09, 204, 0);
        C36391kE.A1I(C36361kB.A0G(view2, R.id.br_bottom_sheet_slab_container_close_button), this, 17);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        String str = this.A04;
        C23075B3f b3f = this.A00;
        if (b3f == null) {
            throw C36331k8.A0d("paymentFieldStatsLogger");
        }
        C18740tg.A06(b3f);
        b3f.BOm(1, 128, "income_collection_prompt", str);
        super.onDismiss(dialogInterface);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A04 = A0b().getString("referral_screen");
        this.A02 = (BrazilIncomeCollectionViewModel) C36441kJ.A0b(this).A00(BrazilIncomeCollectionViewModel.class);
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
