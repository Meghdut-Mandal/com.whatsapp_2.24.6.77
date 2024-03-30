package X;

import android.view.View;
import android.view.autofill.AutofillManager;

/* renamed from: X.6fx  reason: invalid class name and case insensitive filesystem */
public final class C137326fx implements AnonymousClass7bP {
    public final View A00;
    public final C114335h3 A01;
    public final AutofillManager A02;

    public C137326fx(View view, C114335h3 r4) {
        this.A00 = view;
        this.A01 = r4;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.A02 = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw AnonymousClass001.A09("Autofill service could not be located.");
    }

    public final AutofillManager A00() {
        return this.A02;
    }
}
