package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.3Pw  reason: invalid class name and case insensitive filesystem */
public final class C64903Pw {
    public static final C64903Pw A01 = new C64903Pw();
    public final int A00 = -2;

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof C64903Pw);
    }

    public int hashCode() {
        return ((AnonymousClass000.A0H(-2) + 31) * 31) + C36411kG.A09(false);
    }

    public String toString() {
        Object[] objArr = new Object[2];
        AnonymousClass000.A1J(objArr, -2);
        C36421kH.A1R(objArr, false);
        String format = String.format((Locale) null, "%d defer:%b", Arrays.copyOf(objArr, 2));
        AnonymousClass00C.A08(format);
        return format;
    }
}
