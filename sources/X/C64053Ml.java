package X;

import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3Ml  reason: invalid class name and case insensitive filesystem */
public abstract class C64053Ml {
    public static final List A00 = Arrays.asList(new String[]{"directory", "guia"});

    public static boolean A00(Uri uri) {
        if (uri.getPathSegments().size() != 1) {
            return false;
        }
        return A00.contains(new File(uri.getPath()).getName().toLowerCase(Locale.US));
    }
}
