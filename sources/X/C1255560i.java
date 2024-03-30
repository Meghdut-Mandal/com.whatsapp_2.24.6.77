package X;

import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.60i  reason: invalid class name and case insensitive filesystem */
public final class C1255560i {
    public final C20690y0 A00;

    public C1255560i(C20690y0 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final File A00(String str) {
        File A0X;
        AnonymousClass00C.A0D(str, 0);
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            Log.e("BloksFileManager/getCapturedMediaDirectory external storage is not writable");
            A0X = null;
        } else {
            A0X = this.A00.A0X("bloks_captured_media");
        }
        if (A0X != null) {
            if (A0X.exists() || A0X.mkdirs()) {
                return C90524aI.A0T(A0X.getPath(), str);
            }
            Log.e("BloksFileManager/getCapturedMediaFile: failed to create media directory");
        }
        return null;
    }
}
