package X;

import android.app.Activity;
import android.text.Editable;
import com.whatsapp.R;
import com.whatsapp.WaEditText;

/* renamed from: X.3EO  reason: invalid class name */
public final class AnonymousClass3EO {
    public final Activity A00;
    public final C63443Kb A01;
    public final AnonymousClass3F1 A02;
    public final AnonymousClass3QT A03;
    public final AnonymousClass2Fm A04;

    public AnonymousClass3EO(Activity activity, AnonymousClass3QT r3, AnonymousClass2Fm r4, C63443Kb r5, AnonymousClass3F1 r6) {
        C36331k8.A1G(r4, 3, r5);
        this.A00 = activity;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
        this.A02 = r6;
    }

    public final boolean A00() {
        if (this.A03.A02().length() == 0) {
            WaEditText waEditText = this.A04.A05;
            if (waEditText == null) {
                throw C36331k8.A0d("phoneField");
            }
            Editable text = waEditText.getText();
            if (text == null || text.length() == 0) {
                return false;
            }
        }
        AnonymousClass3T6.A01(this.A00, new AnonymousClass4XM(this, 14), new AnonymousClass4XM(this, 13), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
        return true;
    }
}
