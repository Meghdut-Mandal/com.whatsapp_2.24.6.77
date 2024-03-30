package X;

/* renamed from: X.0Qn  reason: invalid class name and case insensitive filesystem */
public abstract class C05650Qn {
    public static String A00(AnonymousClass00Q r1) {
        String obj = r1.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
