package X;

import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.1vf  reason: invalid class name and case insensitive filesystem */
public class C40511vf extends AnonymousClass0CZ {
    public final AnonymousClass397 A00;

    public int A0J() {
        C23931Ak r0 = this.A00.A01;
        if (r0 == null) {
            r0 = C23931Ak.of();
        }
        return r0.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r4, int i) {
        C42151yM r42 = (C42151yM) r4;
        C23931Ak r0 = this.A00.A01;
        if (r0 == null) {
            r0 = C23931Ak.of();
        }
        C601136n r2 = (C601136n) r0.get(i);
        r42.A00 = r2;
        r42.A02.setText(r2.A02.A00);
        r42.A01.setChecked(r2.A00);
        r2.A01.A0A(new C66033Uk(r42, 39));
    }

    public C40511vf(C02830Cb r4) {
        this.A00 = new AnonymousClass397(new C02880Cg(r4).A00(), new C02870Cf(this));
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42151yM(C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved));
    }
}
