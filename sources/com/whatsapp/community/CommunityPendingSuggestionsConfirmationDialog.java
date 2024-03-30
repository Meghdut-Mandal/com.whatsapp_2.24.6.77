package com.whatsapp.community;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3LW;
import X.AnonymousClass4XM;
import X.C18740tg;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C39001qm;
import X.C87134Np;
import X.C89784Xw;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.whatsapp.R;

public final class CommunityPendingSuggestionsConfirmationDialog extends Hilt_CommunityPendingSuggestionsConfirmationDialog {
    public C87134Np A00;
    public AnonymousClass16D A01;
    public AnonymousClass171 A02;

    public void A1O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        C18740tg.A06(context);
        this.A00 = (C87134Np) context;
    }

    public Dialog A1a(Bundle bundle) {
        String A0m;
        int i;
        String str;
        AnonymousClass01I A0i = A0i();
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        int i2 = A0b().getInt("dialogId");
        int i3 = A0b().getInt("availableGroups");
        int i4 = A0b().getInt("totalPendingGroups");
        if (i2 == 0) {
            A0m = C36361kB.A0m(A0i, R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        } else if (i2 != 1) {
            if (i2 == 2) {
                A0m = C36361kB.A0m(A0i, R.string.f12nameremoved);
                i = R.string.f12nameremoved;
            }
            A002.setNegativeButton(R.string.f12nameremoved, new AnonymousClass4XM(this, 0));
            A002.A0S(new C89784Xw(this, i2, 1), A0i.getString(R.string.f12nameremoved));
            return C36371kC.A0O(A002);
        } else {
            String A0m2 = C36361kB.A0m(A0i, R.string.f12nameremoved);
            Resources resources = A0i.getResources();
            Object[] objArr = new Object[2];
            C36331k8.A1X(objArr, i3, 0, i4, 1);
            str = resources.getQuantityString(R.plurals.f10nameremoved, i4, objArr);
            AnonymousClass00C.A08(str);
            A002.setTitle(A0m2);
            A002.A0Z(str);
            A002.setNegativeButton(R.string.f12nameremoved, new AnonymousClass4XM(this, 0));
            A002.A0S(new C89784Xw(this, i2, 1), A0i.getString(R.string.f12nameremoved));
            return C36371kC.A0O(A002);
        }
        str = C36361kB.A0m(A0i, i);
        A002.setTitle(A0m);
        A002.A0Z(str);
        A002.setNegativeButton(R.string.f12nameremoved, new AnonymousClass4XM(this, 0));
        A002.A0S(new C89784Xw(this, i2, 1), A0i.getString(R.string.f12nameremoved));
        return C36371kC.A0O(A002);
    }
}
