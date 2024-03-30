package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2v5  reason: invalid class name and case insensitive filesystem */
public abstract class C55722v5 {
    public static final File A00(Context context, String str) {
        AnonymousClass00C.A0D(context, 0);
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            File A0w = C36441kJ.A0w(externalCacheDir, str);
            if (A0w.exists() || A0w.mkdirs()) {
                return A0w;
            }
        }
        Log.e("FileUtils/createCacheFolder couldn't create external cache folder");
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File A0w2 = C36441kJ.A0w(cacheDir, str);
            if (A0w2.exists() || A0w2.mkdirs()) {
                return A0w2;
            }
        }
        return null;
    }
}
