package com.whatsapp.biz.product.view.fragment;

import X.AnonymousClass0FM;
import X.AnonymousClass17Y;
import X.AnonymousClass3LW;
import X.AnonymousClass4PH;
import X.AnonymousClass4XL;
import X.C39001qm;
import X.C56002vY;
import X.C594133v;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class ProductReportReasonDialogFragment extends Hilt_ProductReportReasonDialogFragment {
    public int A00 = -1;
    public AnonymousClass17Y A01;
    public AnonymousClass4PH A02;
    public final C594133v[] A03 = {new C594133v("no-match", R.string.f12nameremoved), new C594133v("spam", R.string.f12nameremoved), new C594133v("illegal", R.string.f12nameremoved), new C594133v("scam", R.string.f12nameremoved), new C594133v("knockoff", R.string.f12nameremoved), new C594133v("other", R.string.f12nameremoved)};

    public Dialog A1a(Bundle bundle) {
        C39001qm A04 = AnonymousClass3LW.A04(this);
        C594133v[] r4 = this.A03;
        int length = r4.length;
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i = 0; i < length; i++) {
            charSequenceArr[i] = A0n(r4[i].A00);
        }
        A04.A0U(AnonymousClass4XL.A00(this, 20), charSequenceArr, this.A00);
        A04.A0L(R.string.f12nameremoved);
        A04.setPositiveButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
        AnonymousClass0FM create = A04.create();
        create.setOnShowListener(new C56002vY(this, 1));
        return create;
    }
}
