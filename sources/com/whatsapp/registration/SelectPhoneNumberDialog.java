package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0FM;
import X.AnonymousClass1N4;
import X.AnonymousClass2d9;
import X.AnonymousClass3LW;
import X.AnonymousClass4OX;
import X.AnonymousClass4XI;
import X.C18740tg;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C37821nG;
import X.C39001qm;
import X.C89594Xd;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.ArrayList;

public final class SelectPhoneNumberDialog extends Hilt_SelectPhoneNumberDialog {
    public AnonymousClass1N4 A00;
    public AnonymousClass4OX A01;

    public void A1O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        if (context instanceof AnonymousClass4OX) {
            this.A01 = (AnonymousClass4OX) context;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onCancel(dialogInterface);
        AnonymousClass4OX r0 = this.A01;
        if (r0 != null) {
            AnonymousClass2d9 r02 = (AnonymousClass2d9) r0;
            r02.A0C.A02(r02.A0O.A03);
        }
    }

    public void A19() {
        super.A19();
        this.A01 = null;
    }

    public Dialog A1a(Bundle bundle) {
        ArrayList parcelableArrayList = A0b().getParcelableArrayList("deviceSimInfoList");
        C18740tg.A06(parcelableArrayList);
        AnonymousClass00C.A08(parcelableArrayList);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SelectPhoneNumberDialog/number-of-suggestions: ");
        C36321k7.A1Y(A0u, parcelableArrayList.size());
        Context A0a = A0a();
        AnonymousClass1N4 r0 = this.A00;
        if (r0 != null) {
            C37821nG r4 = new C37821nG(A0a, r0, parcelableArrayList);
            C39001qm A002 = AnonymousClass3LW.A00(A0a);
            A002.A0d(R.string.f12nameremoved);
            A002.A00.A0O((DialogInterface.OnClickListener) null, r4);
            A002.A0h(new AnonymousClass4XI(this, r4, parcelableArrayList, 13), R.string.f12nameremoved);
            C39001qm.A0C(A002, this, 23, R.string.f12nameremoved);
            AnonymousClass0FM A0O = C36371kC.A0O(A002);
            C89594Xd.A00(A0O.A00.A0K, r4, 11);
            return A0O;
        }
        throw C36331k8.A0d("countryPhoneInfo");
    }
}
