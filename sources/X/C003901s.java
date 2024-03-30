package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.01s  reason: invalid class name and case insensitive filesystem */
public final class C003901s implements C003801r {
    public Bundle A00;
    public boolean A01;
    public final AnonymousClass01U A02;
    public final AnonymousClass00T A03;

    public C003901s(AnonymousClass016 r3, AnonymousClass01U r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A02 = r4;
        this.A03 = new AnonymousClass00U(new C004001t(r3));
    }

    public final Bundle A00(String str) {
        Bundle bundle;
        if (!this.A01) {
            this.A00 = this.A02.A00("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.A01 = true;
            this.A03.getValue();
        }
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.A00;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.A00;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.A00 = null;
        }
        return bundle;
    }

    public Bundle BpH() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C018808a) this.A03.getValue()).A00.entrySet()) {
            String str = (String) entry.getKey();
            Bundle BpH = ((AnonymousClass08M) entry.getValue()).A00.BpH();
            if (!AnonymousClass00C.A0J(BpH, Bundle.EMPTY)) {
                bundle.putBundle(str, BpH);
            }
        }
        this.A01 = false;
        return bundle;
    }
}
