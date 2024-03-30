package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.9f8  reason: invalid class name and case insensitive filesystem */
public final class C199329f8 {
    public static final AnonymousClass7c0 A01 = C208889z0.A00;
    public static final C199329f8 A02 = new C199329f8(AnonymousClass001.A0I());
    public final C23931Ak A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C199329f8) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C199329f8(List list) {
        this.A00 = C23931Ak.copyOf((Collection) list);
    }
}
