package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Yz  reason: invalid class name and case insensitive filesystem */
public class C07710Yz {
    public static Collection A00(Object obj) {
        if (!(obj instanceof AnonymousClass00W) || (obj instanceof AnonymousClass00Y)) {
            try {
                return (Collection) obj;
            } catch (ClassCastException e) {
                AnonymousClass00C.A0H(C07710Yz.class.getName(), e);
                throw e;
            }
        } else {
            A04(obj, "kotlin.collections.MutableCollection");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static List A01(Object obj) {
        if (!(obj instanceof AnonymousClass00W) || (obj instanceof C004902e)) {
            try {
                return (List) obj;
            } catch (ClassCastException e) {
                AnonymousClass00C.A0H(C07710Yz.class.getName(), e);
                throw e;
            }
        } else {
            A04(obj, "kotlin.collections.MutableList");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static Map A02(Object obj) {
        if (!(obj instanceof AnonymousClass00W) || (obj instanceof C17930sJ)) {
            try {
                return (Map) obj;
            } catch (ClassCastException e) {
                AnonymousClass00C.A0H(C07710Yz.class.getName(), e);
                throw e;
            }
        } else {
            A04(obj, "kotlin.collections.MutableMap");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A03(Object obj, int i) {
        if (obj != null && !A06(obj, i)) {
            A04(obj, AnonymousClass000.A0r("kotlin.jvm.functions.Function", AnonymousClass000.A0u(), i));
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A04(Object obj, String str) {
        String A0k;
        if (obj == null) {
            A0k = "null";
        } else {
            A0k = AnonymousClass000.A0k(obj);
        }
        ClassCastException classCastException = new ClassCastException(AnonymousClass000.A0p(" cannot be cast to ", str, AnonymousClass000.A0v(A0k)));
        AnonymousClass00C.A0H(C07710Yz.class.getName(), classCastException);
        throw classCastException;
    }

    public static boolean A05(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        if (!(obj instanceof AnonymousClass00W) || (obj instanceof AnonymousClass00Z)) {
            return true;
        }
        return false;
    }

    public static boolean A06(Object obj, int i) {
        int i2;
        if (obj instanceof AnonymousClass00P) {
            if (obj instanceof AnonymousClass00Q) {
                i2 = ((AnonymousClass00Q) obj).getArity();
            } else if (obj instanceof AnonymousClass00S) {
                i2 = 0;
            } else if (obj instanceof C006302t) {
                i2 = 1;
            } else if (obj instanceof C009003v) {
                i2 = 2;
            } else if (obj instanceof C019408g) {
                i2 = 3;
            } else if (obj instanceof C019508h) {
                i2 = 4;
            } else if (obj instanceof C019608i) {
                i2 = 5;
            } else if (obj instanceof C019708j) {
                i2 = 6;
            } else if (obj instanceof C019808k) {
                i2 = 7;
            } else if (obj instanceof C019908l) {
                i2 = 8;
            } else if (obj instanceof C020008m) {
                i2 = 9;
            } else if (obj instanceof AnonymousClass08n) {
                i2 = 10;
            } else if (obj instanceof C020108o) {
                i2 = 11;
            } else if (obj instanceof C020308q) {
                i2 = 13;
            } else if (obj instanceof C020408r) {
                i2 = 14;
            } else if (obj instanceof C020508s) {
                i2 = 15;
            } else if (obj instanceof C020608t) {
                i2 = 16;
            } else if (obj instanceof C020708u) {
                i2 = 17;
            } else if (obj instanceof C020808v) {
                i2 = 18;
            } else if (obj instanceof C020908w) {
                i2 = 19;
            } else if (obj instanceof C021008x) {
                i2 = 20;
            } else {
                boolean z = obj instanceof C021108y;
                i2 = -1;
                if (z) {
                    i2 = 21;
                }
            }
            if (i2 != i) {
                return false;
            }
            return true;
        }
        return false;
    }
}
