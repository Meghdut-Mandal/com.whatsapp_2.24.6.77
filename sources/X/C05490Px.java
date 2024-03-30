package X;

import android.util.Log;
import java.io.File;

/* renamed from: X.0Px  reason: invalid class name and case insensitive filesystem */
public abstract class C05490Px {
    public static void A00(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", AnonymousClass000.A0l(file2, "Failed to delete file which is a directory ", AnonymousClass000.A0u()));
        }
        if (!file.renameTo(file2)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Failed to rename ");
            A0u.append(file);
            Log.e("AtomicFile", AnonymousClass000.A0l(file2, " to ", A0u));
        }
    }
}
