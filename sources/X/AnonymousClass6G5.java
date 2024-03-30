package X;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6G5  reason: invalid class name */
public abstract class AnonymousClass6G5 {
    public static final void A01(ViewStructure viewStructure, C137326fx r6) {
        Map map = r6.A01.A00;
        int A00 = AnonymousClass6QS.A00(viewStructure, map.size());
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            int A0I = AnonymousClass000.A0I(A11.getKey());
            A11.getValue();
            ViewStructure A01 = AnonymousClass6QS.A01(viewStructure, A00);
            if (A01 != null) {
                AutofillId A002 = AnonymousClass6XS.A00(viewStructure);
                AnonymousClass00C.A0B(A002);
                AnonymousClass6XS.A03(A01, A002, A0I);
                AnonymousClass6QS.A02(A01, r6.A00.getContext().getPackageName(), A0I);
                AnonymousClass6XS.A02(A01);
                throw AnonymousClass001.A0A("getAutofillTypes");
            }
            A00++;
        }
    }

    public static final void A00(SparseArray sparseArray, C137326fx r7) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
            if (AnonymousClass6XS.A06(autofillValue)) {
                C114335h3 r1 = r7.A01;
                AnonymousClass6XS.A01(autofillValue).toString();
                r1.A00.get(Integer.valueOf(keyAt));
            } else if (AnonymousClass6XS.A04(autofillValue)) {
                throw new C05170Nv(AnonymousClass000.A0q("b/138604541: Add onFill() callback for date", AnonymousClass000.A0v("An operation is not implemented: ")));
            } else if (AnonymousClass6XS.A05(autofillValue)) {
                throw new C05170Nv(AnonymousClass000.A0q("b/138604541: Add onFill() callback for list", AnonymousClass000.A0v("An operation is not implemented: ")));
            } else if (AnonymousClass6XS.A07(autofillValue)) {
                throw new C05170Nv(AnonymousClass000.A0q("b/138604541:  Add onFill() callback for toggle", AnonymousClass000.A0v("An operation is not implemented: ")));
            }
        }
    }
}
