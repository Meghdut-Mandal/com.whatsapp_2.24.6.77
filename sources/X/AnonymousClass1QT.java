package X;

import android.os.Bundle;

/* renamed from: X.1QT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QT implements AnonymousClass05T {
    public final /* synthetic */ C225114s A00;

    public /* synthetic */ AnonymousClass1QT(C225114s r1) {
        this.A00 = r1;
    }

    public final void BYP(String str, Bundle bundle) {
        String string;
        C225114s r4 = this.A00;
        AnonymousClass00C.A0D(bundle, 2);
        String string2 = bundle.getString("dialog_tag");
        if (string2 != null && (string = bundle.getString("action_type")) != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1743220960) {
                if (hashCode != -997076054 && hashCode == -297673372 && string.equals("negative_button_clicked")) {
                    r4.BQ6(string2);
                }
            } else if (string.equals("positive_button_clicked")) {
                r4.Bln(string2);
            }
        }
    }
}
