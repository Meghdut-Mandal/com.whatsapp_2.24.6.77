package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Set;

/* renamed from: X.68w  reason: invalid class name and case insensitive filesystem */
public class C1275868w {
    public final Context A00;

    public void A02() {
        AnonymousClass6YY.A0H(C36441kJ.A0w(this.A00.getFilesDir(), "migration/import/sandbox"), (Set) null);
    }

    public C1275868w(Context context) {
        this.A00 = context;
    }

    public File A00(String str) {
        if (!TextUtils.isEmpty(str)) {
            File A01 = A01(str);
            C90464aC.A18(A01);
            if (A01.getParentFile() != null) {
                A01.getParentFile().mkdirs();
            }
            return A01;
        }
        throw AnonymousClass001.A08("Filename is not specified.");
    }

    public File A01(String str) {
        if (!TextUtils.isEmpty(str)) {
            File A0w = C36441kJ.A0w(this.A00.getFilesDir(), "migration/import/sandbox");
            File A0w2 = C36441kJ.A0w(A0w, str);
            if (A0w2.getCanonicalPath().startsWith(A0w.getCanonicalPath())) {
                return A0w2;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid file name: ");
            A0u.append(str);
            throw C90464aC.A0M(", sandbox escaping attempt.", A0u);
        }
        throw AnonymousClass001.A08("Filename is not specified.");
    }
}
