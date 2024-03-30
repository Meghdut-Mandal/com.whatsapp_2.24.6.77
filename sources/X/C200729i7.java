package X;

import java.util.HashSet;

/* renamed from: X.9i7  reason: invalid class name and case insensitive filesystem */
public final class C200729i7 {
    public static String A00 = "goog.exo.core";
    public static boolean A01 = true;
    public static final HashSet A02 = C36441kJ.A16();

    public static synchronized void A00(String str) {
        synchronized (C200729i7.class) {
            if (A02.add(str)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(A00);
                A00 = AnonymousClass000.A0p(", ", str, A0u);
            }
        }
    }
}
