package X;

import java.io.File;

/* renamed from: X.0lV  reason: invalid class name and case insensitive filesystem */
public abstract class C14360lV extends C14370lW {
    public static final boolean A00(File file) {
        C13460ju r3 = new C13460ju(new C12740ia(file, AnonymousClass0Nd.BOTTOM_UP));
        while (true) {
            boolean z = true;
            while (true) {
                if (!r3.hasNext()) {
                    return z;
                }
                File file2 = (File) r3.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }
}
