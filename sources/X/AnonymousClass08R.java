package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.08R  reason: invalid class name */
public final class AnonymousClass08R implements C003801r {
    public final Set A00 = new LinkedHashSet();

    public Bundle BpH() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList(this.A00));
        return bundle;
    }

    public AnonymousClass08R(AnonymousClass01U r2) {
        r2.A03(this, "androidx.savedstate.Restarter");
    }
}
