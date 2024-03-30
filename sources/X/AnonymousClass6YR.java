package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* renamed from: X.6YR  reason: invalid class name */
public class AnonymousClass6YR {
    public static final List A00 = AnonymousClass001.A0I();
    public static volatile C161037m1 A01 = C139566k6.A01;

    static {
        A01.BrD(5);
        C132886Vq.A00 = A01;
    }

    public static void A00(Class cls, String str) {
        if (A01.BMH(3)) {
            A01.B52(cls.getSimpleName(), str);
        }
    }

    public static void A01(Object obj, Object obj2, String str, String str2) {
        if (A01.BMH(3)) {
            A04(str, StringFormatUtil.formatStrLocaleSafe(str2, obj, obj2));
        }
    }

    public static void A02(Object obj, String str, String str2) {
        if (A01.BMH(3)) {
            A04(str, StringFormatUtil.formatStrLocaleSafe(str2, obj));
        }
    }

    public static void A03(Object obj, String str, String str2) {
        if (A01.BMH(4)) {
            A06(str, StringFormatUtil.formatStrLocaleSafe(str2, obj));
        }
    }

    public static void A04(String str, String str2) {
        if (A01.BMH(3)) {
            A01.B52(str, str2);
        }
    }

    public static void A06(String str, String str2) {
        if (A01.BMH(4)) {
            A01.BKF(str, str2);
        }
    }

    public static void A07(String str, String str2) {
        if (A01.BMH(5)) {
            A01.BxN(str, str2);
        }
    }

    public static void A0B(String str, String str2, Throwable th) {
        if (A01.BMH(5)) {
            A01.BxO(str, str2, th);
        }
    }

    public static void A0D(String str, String str2, Throwable th, Object... objArr) {
        if (A01.BMH(3)) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str2, objArr);
            if (A01.BMH(3)) {
                A01.B53(str, formatStrLocaleSafe, th);
            }
        }
    }

    public static void A0G(String str, String str2, Object... objArr) {
        if (A01.BMH(5)) {
            A07(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A05(String str, String str2) {
        if (C90484aE.A1P()) {
            A01.B6I(str, str2);
        }
    }

    public static void A08(String str, String str2) {
        if (C90484aE.A1P()) {
            A01.Bxh(str, str2);
        }
    }

    public static void A09(String str, String str2, Throwable th) {
        if (C90484aE.A1P()) {
            A01.B6J(str, str2, th);
        }
    }

    public static void A0A(String str, String str2, Throwable th) {
        if (C90484aE.A1P()) {
            A01.B6J(str, str2, th);
        }
    }

    public static void A0C(String str, String str2, Throwable th) {
        if (C90484aE.A1P()) {
            A01.Bxi(str, str2, th);
        }
    }

    public static void A0E(String str, String str2, Throwable th, Object... objArr) {
        if (C90484aE.A1P()) {
            A09(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0F(String str, String str2, Object... objArr) {
        if (C90484aE.A1P()) {
            A05(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A0H(String str, String str2, Object... objArr) {
        if (C90484aE.A1P()) {
            A08(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }
}
