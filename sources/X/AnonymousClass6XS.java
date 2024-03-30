package X;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* renamed from: X.6XS  reason: invalid class name */
public abstract class AnonymousClass6XS {
    public static final void A02(ViewStructure viewStructure) {
        viewStructure.setAutofillType(1);
    }

    public static final AutofillId A00(ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    public static final CharSequence A01(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    public static final boolean A04(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public static final boolean A05(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public static final boolean A06(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public static final boolean A07(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public static final void A03(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }
}
