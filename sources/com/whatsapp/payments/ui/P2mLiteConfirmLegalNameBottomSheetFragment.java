package com.whatsapp.payments.ui;

import X.AF6;
import X.AVY;
import X.AnonymousClass1N3;
import X.AnonymousClass9ZG;
import X.C18740tg;
import X.C20810yC;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import com.whatsapp.R;

public final class P2mLiteConfirmLegalNameBottomSheetFragment extends Hilt_P2mLiteConfirmLegalNameBottomSheetFragment {
    public AF6 A00;
    public String A01;
    public String A02;

    public SpannableString A1Z() {
        C32681e1 r4 = this.A0C;
        if (r4 != null) {
            Context A1D = A1D();
            String A0n = A0n(R.string.f12nameremoved);
            String[] strArr = {"p2m-lite-desc-link"};
            String[] strArr2 = new String[1];
            AnonymousClass1N3 r2 = this.A06;
            if (r2 != null) {
                C20810yC r1 = this.A08;
                if (r1 != null) {
                    String A09 = r1.A09(2672);
                    C18740tg.A06(A09);
                    strArr2[0] = r2.A00(A09).toString();
                    return r4.A01(A1D, A0n, new Runnable[]{new AVY(this, 28)}, strArr, strArr2);
                }
                throw C36321k7.A07();
            }
            throw C36331k8.A0d("waLinkFactory");
        }
        throw C36331k8.A0d("linkifier");
    }

    public void A1b(Integer num, String str, String str2, int i) {
        AF6 af6 = this.A00;
        if (af6 != null) {
            af6.A01(AnonymousClass9ZG.A00(), num, str, str2, this.A02, this.A01, i, true);
            return;
        }
        throw C36331k8.A0d("p2mLiteEventLogger");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        Bundle A0b = A0b();
        this.A01 = A0b.getString("extra_payment_config_id");
        this.A02 = A0b.getString("extra_order_type");
    }
}
