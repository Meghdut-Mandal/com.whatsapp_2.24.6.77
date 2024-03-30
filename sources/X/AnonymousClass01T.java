package X;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0;
import java.util.Map;

/* renamed from: X.01T  reason: invalid class name */
public final class AnonymousClass01T {
    public boolean A00;
    public final AnonymousClass01U A01 = new AnonymousClass01U();
    public final AnonymousClass017 A02;

    public final void A02(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        AnonymousClass01U r1 = this.A01;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = r1.A00;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C001800t r0 = r1.A05;
        AnonymousClass05S r2 = new AnonymousClass05S(r0);
        r0.A03.put(r2, false);
        while (r2.hasNext()) {
            Map.Entry entry = (Map.Entry) r2.next();
            bundle2.putBundle((String) entry.getKey(), ((C003801r) entry.getValue()).BpH());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void A00() {
        AnonymousClass017 r4 = this.A02;
        AnonymousClass01M lifecycle = r4.getLifecycle();
        AnonymousClass00C.A08(lifecycle);
        if (((AnonymousClass01N) lifecycle).A02 == AnonymousClass01P.INITIALIZED) {
            lifecycle.A04(new Recreator(r4));
            AnonymousClass01U r1 = this.A01;
            if (!r1.A01) {
                lifecycle.A04(new SavedStateRegistry$$ExternalSyntheticLambda0(r1));
                r1.A01 = true;
                this.A00 = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void A01(Bundle bundle) {
        Bundle bundle2;
        if (!this.A00) {
            A00();
        }
        AnonymousClass01M lifecycle = this.A02.getLifecycle();
        AnonymousClass00C.A08(lifecycle);
        AnonymousClass01N r2 = (AnonymousClass01N) lifecycle;
        if (r2.A02.compareTo(AnonymousClass01P.STARTED) >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("performRestore cannot be called when owner is ");
            sb.append(r2.A02);
            throw new IllegalStateException(sb.toString());
        }
        AnonymousClass01U r22 = this.A01;
        if (!r22.A01) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        } else if (!r22.A03) {
            if (bundle != null) {
                bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            } else {
                bundle2 = null;
            }
            r22.A00 = bundle2;
            r22.A03 = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
    }

    public AnonymousClass01T(AnonymousClass017 r2) {
        this.A02 = r2;
    }
}
