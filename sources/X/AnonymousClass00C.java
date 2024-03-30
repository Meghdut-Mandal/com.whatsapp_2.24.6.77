package X;

import java.util.Arrays;

/* renamed from: X.00C  reason: invalid class name */
public class AnonymousClass00C {
    public static int A00(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static AnonymousClass03N A02(Throwable th) {
        A0D(th, 0);
        return new AnonymousClass03N(th);
    }

    public static void A03() {
        AnonymousClass0OH r0 = new AnonymousClass0OH();
        A0I(r0);
        throw r0;
    }

    public static void A04(Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("INVOKE_RETURN");
            sb.append(" must not be null");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            A0I(illegalStateException);
            throw illegalStateException;
        }
    }

    public static void A05(Object obj) {
        if (obj == null) {
            A0F("ARRAY_ELEMENT");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A06(Object obj) {
        if (obj == null) {
            A0F("CHECK_CAST");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A07(Object obj) {
        if (obj == null) {
            A0F("INSTANCE_FIELD");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A08(Object obj) {
        if (obj == null) {
            A0F("INVOKE_RETURN");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A09(Object obj) {
        if (obj == null) {
            A0F("STATIC_FIELD");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A0A(Object obj) {
        if (obj == null) {
            A0F("UNKNOWN");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A0B(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            A0I(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0C(Object obj, int i) {
        if (obj == null) {
            String num = Integer.toString(i);
            StringBuilder sb = new StringBuilder();
            sb.append("param at index = ");
            sb.append(num);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(A01(sb.toString()));
            A0I(illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    public static void A0D(Object obj, int i) {
        if (obj == null) {
            String num = Integer.toString(i);
            StringBuilder sb = new StringBuilder();
            sb.append("param at index = ");
            sb.append(num);
            NullPointerException nullPointerException = new NullPointerException(A01(sb.toString()));
            A0I(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0E(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            A0I(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0F(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        NullPointerException nullPointerException = new NullPointerException(sb.toString());
        A0I(nullPointerException);
        throw nullPointerException;
    }

    public static void A0G(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        C13210jV r0 = new C13210jV(sb.toString());
        A0I(r0);
        throw r0;
    }

    public static void A0I(Throwable th) {
        A0H(AnonymousClass00C.class.getName(), th);
    }

    public static boolean A0J(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static String A01(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AnonymousClass00C.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        return sb.toString();
    }

    public static void A0H(String str, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static Object[] A0K(Object[] objArr, int i) {
        Object[] copyOf = Arrays.copyOf(objArr, i);
        A08(copyOf);
        return copyOf;
    }
}
