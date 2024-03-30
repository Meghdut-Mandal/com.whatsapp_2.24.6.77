package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.01U  reason: invalid class name */
public final class AnonymousClass01U {
    public Bundle A00;
    public boolean A01;
    public boolean A02 = true;
    public boolean A03;
    public AnonymousClass08R A04;
    public final C001800t A05 = new C001800t();

    public final Bundle A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        if (this.A03) {
            Bundle bundle = this.A00;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.A00;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.A00;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.A00 = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void A03(C003801r r3, String str) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00C.A0D(r3, 1);
        if (this.A05.A02(str, r3) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final C003801r A01() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AnonymousClass00C.A06(entry);
            Object key = entry.getKey();
            C003801r r1 = (C003801r) entry.getValue();
            if (AnonymousClass00C.A0J(key, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return r1;
            }
        }
        return null;
    }

    public final void A02() {
        Class<AnonymousClass08Q> cls = AnonymousClass08Q.class;
        if (this.A02) {
            AnonymousClass08R r0 = this.A04;
            if (r0 == null) {
                r0 = new AnonymousClass08R(this);
            }
            this.A04 = r0;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                AnonymousClass08R r02 = this.A04;
                if (r02 != null) {
                    String name = cls.getName();
                    AnonymousClass00C.A08(name);
                    r02.A00.add(name);
                }
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Class ");
                sb.append(cls.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
