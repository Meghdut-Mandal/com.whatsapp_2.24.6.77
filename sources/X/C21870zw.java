package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0zw  reason: invalid class name and case insensitive filesystem */
public abstract class C21870zw {
    public static final String A00;

    static {
        String format = String.format(Locale.US, "%07d", Arrays.copyOf(new Object[]{Long.valueOf((System.currentTimeMillis() / ((long) 1000)) % ((long) 10000000))}, 1));
        AnonymousClass00C.A08(format);
        A00 = format;
    }
}
