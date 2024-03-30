package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: X.00E  reason: invalid class name */
public abstract class AnonymousClass00E {
    public static Drawable A00(Context context, int i) {
        return context.getDrawable(i);
    }

    public static File A01(Context context) {
        return context.getNoBackupFilesDir();
    }
}
