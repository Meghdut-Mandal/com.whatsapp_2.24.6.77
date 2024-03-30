package X;

import com.whatsapp.WaTextView;
import com.whatsapp.registration.EULA;
import java.util.Locale;

/* renamed from: X.3nM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C75513nM implements C87984Qy {
    public final /* synthetic */ WaTextView A00;
    public final /* synthetic */ C48902iF A01;

    public /* synthetic */ C75513nM(WaTextView waTextView, C48902iF r2) {
        this.A01 = r2;
        this.A00 = waTextView;
    }

    public final void BZZ() {
        C48902iF r0 = this.A01;
        WaTextView waTextView = this.A00;
        EULA eula = (EULA) r0.A00;
        waTextView.setText(AnonymousClass3SY.A00(AnonymousClass9ZR.A01(Locale.getDefault())));
        if (eula.A0d) {
            eula.A0d = false;
            AnonymousClass3GZ r1 = eula.A0J;
            C36321k7.A0q(r1.A02, "language_selector_clicked_count", C36371kC.A01(C36341k9.A0E(r1.A02), "language_selector_clicked_count") + 1);
            if (C19550w8.A08()) {
                eula.recreate();
                return;
            }
            eula.finish();
            eula.startActivity(eula.getIntent());
            eula.overridePendingTransition(0, 0);
        }
    }
}
