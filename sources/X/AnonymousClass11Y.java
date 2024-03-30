package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.11Y  reason: invalid class name */
public abstract class AnonymousClass11Y {
    public static File A00(Context context) {
        File file = new File(context.getCacheDir(), "minidumps");
        if (!file.exists() || !file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
            if (!file.mkdirs()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Breakpad init failed to create crash directory: ");
                sb.append(file);
                throw new RuntimeException(sb.toString());
            }
        }
        return file;
    }
}
