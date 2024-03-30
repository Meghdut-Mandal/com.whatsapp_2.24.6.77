package X;

import java.io.PrintStream;

/* renamed from: X.5ej  reason: invalid class name and case insensitive filesystem */
public abstract class C112955ej {
    public static final C125275zc A00;

    static {
        C125275zc r0;
        try {
            Integer num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
            if (num != null) {
                if (num.intValue() >= 19) {
                    r0 = new C99144sh();
                    A00 = r0;
                }
            }
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(printStream);
        } catch (Throwable th) {
            PrintStream printStream2 = System.err;
            String name = C99134sg.class.getName();
            StringBuilder A0h = C90524aI.A0h(C90474aD.A05(name) + 133);
            A0h.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            A0h.append(name);
            printStream2.println(AnonymousClass000.A0q("will be used. The error is: ", A0h));
            th.printStackTrace(printStream2);
            r0 = new C99134sg();
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            r0 = new C99154si();
        } else {
            r0 = new C99134sg();
        }
        A00 = r0;
    }
}
