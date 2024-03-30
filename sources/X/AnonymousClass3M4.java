package X;

import java.io.File;
import java.util.List;

/* renamed from: X.3M4  reason: invalid class name */
public abstract class AnonymousClass3M4 {
    public static final C124995z9 A00(C132046Rx r16, C25471Gl r17, int i, boolean z) {
        int i2 = i;
        return new C124995z9(r16, (C119765qQ) null, r17, (File) null, (String) null, (String) null, "optimistic", (List) null, (int[]) null, i2, 0, 1, 0, true, z, true, AnonymousClass000.A1S(i2, 3));
    }

    public static final C124995z9 A01(C119765qQ r19, C25471Gl r20, File file, int i) {
        String str;
        C25471Gl r3 = r20;
        boolean A06 = AnonymousClass6Y1.A06(r3);
        boolean z = !A06;
        if (A06) {
            str = "newsletter";
        } else {
            str = "mms";
        }
        return new C124995z9((C132046Rx) null, r19, r3, file, (String) null, (String) null, str, (List) null, (int[]) null, 0, 0, i, 0, true, true, z, false);
    }
}
