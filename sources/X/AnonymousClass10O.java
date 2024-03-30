package X;

/* renamed from: X.10O  reason: invalid class name */
public class AnonymousClass10O {
    public static AnonymousClass10M A00;

    public static boolean A00(String str) {
        AnonymousClass10M r0;
        synchronized (AnonymousClass10O.class) {
            r0 = A00;
            if (r0 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return r0.BOO(str, 0);
    }
}
