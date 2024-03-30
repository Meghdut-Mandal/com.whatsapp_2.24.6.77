package X;

import android.content.ContentValues;
import android.os.Build;
import java.io.File;

/* renamed from: X.5bi  reason: invalid class name and case insensitive filesystem */
public abstract class C111085bi {
    public static final ContentValues A00(File file, String str, String str2) {
        ContentValues A0E = C36441kJ.A0E();
        A0E.put("mime_type", str2);
        A0E.put("_display_name", file.getName());
        if (Build.VERSION.SDK_INT >= 29) {
            A0E.put("relative_path", AnonymousClass000.A0q("/WhatsApp/", AnonymousClass000.A0v(str)));
            return A0E;
        }
        A0E.put("_data", file.getPath());
        return A0E;
    }
}
