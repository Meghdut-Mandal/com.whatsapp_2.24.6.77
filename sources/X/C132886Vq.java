package X;

import java.util.Locale;

/* renamed from: X.6Vq  reason: invalid class name and case insensitive filesystem */
public abstract class C132886Vq {
    public static C161037m1 A00 = C139576k7.A00;

    public static void A00(Class cls, Object obj, Object obj2, Object obj3, String str) {
        if (A00.BMH(2)) {
            Object[] A1Q = C36441kJ.A1Q();
            C36321k7.A1H(obj, obj2, obj3, A1Q);
            String format = String.format((Locale) null, str, A1Q);
            C161037m1 r1 = A00;
            if (r1.BMH(2)) {
                r1.BxE(cls.getSimpleName(), format);
            }
        }
    }

    public static void A01(Class cls, Object obj, Object obj2, String str) {
        C161037m1 r3 = A00;
        if (r3.BMH(2)) {
            String simpleName = cls.getSimpleName();
            Object[] objArr = new Object[2];
            C36331k8.A1N(obj, obj2, objArr);
            r3.BxE(simpleName, String.format((Locale) null, str, objArr));
        }
    }

    public static void A02(Class cls, Object obj, String str) {
        C161037m1 r3 = A00;
        if (r3.BMH(2)) {
            r3.BxE(cls.getSimpleName(), String.format((Locale) null, str, AnonymousClass000.A1b(obj)));
        }
    }

    public static void A03(String str, String str2, Object... objArr) {
        C161037m1 r1 = A00;
        if (r1.BMH(5)) {
            r1.BxN(str, String.format((Locale) null, str2, objArr));
        }
    }
}
