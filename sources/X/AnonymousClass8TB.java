package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8TB  reason: invalid class name */
public class AnonymousClass8TB extends C200269h0 {
    public final Object A00;
    public final boolean A01 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass8TB)) {
                return false;
            }
            Object obj2 = this.A00;
            Object obj3 = ((AnonymousClass8TB) obj).A00;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (!obj2.equals(obj3)) {
                return false;
            }
        }
    }

    public Object A07() {
        try {
            if (this.A01) {
                return this.A00;
            }
            return new C22563Aos(-1).A0D(this.A00.toString(), C197039b2.A02.A00);
        } catch (AnonymousClass928 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String toString() {
        return this.A00.toString();
    }

    public AnonymousClass8TB(CharSequence charSequence) {
        this.A00 = charSequence.toString();
    }

    public static C200269h0 A00(C200269h0 r1) {
        AnonymousClass8TB A02 = r1.A02();
        if (!(A02.A07() instanceof List)) {
            return B4C.A03;
        }
        return new AnonymousClass8TD(Collections.unmodifiableList((List) A02.A07()));
    }

    public AnonymousClass8TB(Object obj) {
        this.A00 = obj;
    }
}
