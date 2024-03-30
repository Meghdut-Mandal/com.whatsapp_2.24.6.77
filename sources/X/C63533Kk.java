package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Kk  reason: invalid class name and case insensitive filesystem */
public abstract class C63533Kk {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;

    public abstract View buildPaymentHelpSupportSection(Context context, C207249un r2, String str);

    public ArrayList A00() {
        boolean z = this instanceof AnonymousClass2ZV;
        ArrayList A0I = AnonymousClass001.A0I();
        boolean isEmpty = TextUtils.isEmpty(this.A02);
        if (z) {
            if (!isEmpty) {
                C36361kB.A1O("Payments fb txn id", this.A02, A0I);
            }
            if (!TextUtils.isEmpty(this.A01)) {
                C36361kB.A1O("Payments return value", this.A01, A0I);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                C36361kB.A1O("Payments status", this.A03, A0I);
            }
        } else {
            if (!isEmpty) {
                C36361kB.A1O("Payments fb txn id", this.A02, A0I);
            }
            if (!TextUtils.isEmpty(this.A00)) {
                C36361kB.A1O("Payments bank txn id", this.A00, A0I);
            }
            if (!TextUtils.isEmpty(this.A01)) {
                C36361kB.A1O("Payments return value", this.A01, A0I);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                C36361kB.A1O("Payments status", this.A03, A0I);
            }
        }
        A01(A0I);
        return A0I;
    }

    public void A01(List list) {
        ArrayList arrayList = this.A04;
        if (arrayList != null && !arrayList.isEmpty()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            for (int i = 0; i < arrayList.size(); i++) {
                A0u.append(C36421kH.A0e(arrayList, i));
                if (i < arrayList.size() - 1) {
                    A0u.append(", ");
                }
            }
            list.add(C36441kJ.A0Q("Topic IDs", A0u.toString()));
        }
    }
}
