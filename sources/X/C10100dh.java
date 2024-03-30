package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0dh  reason: invalid class name and case insensitive filesystem */
public final class C10100dh implements C17370rB {
    public static final C10100dh A01 = new C10100dh(AnonymousClass001.A07());
    public final Bundle A00;

    public /* synthetic */ C10100dh(Bundle bundle) {
        this.A00 = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10100dh)) {
            return false;
        }
        Bundle bundle = this.A00;
        Bundle bundle2 = ((C10100dh) obj).A00;
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (!AnonymousClass0QM.A00(bundle.get(A0C), bundle2.get(A0C))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass000.A0K(this.A00, AnonymousClass001.A0L());
    }
}
