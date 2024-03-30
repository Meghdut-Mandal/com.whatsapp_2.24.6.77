package X;

import android.graphics.Bitmap;
import com.whatsapp.media.transcode.Mozjpeg;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6IR  reason: invalid class name */
public abstract class AnonymousClass6IR {
    public static final Mozjpeg A00 = new Mozjpeg();

    public static byte[] A00(Bitmap bitmap, int i, boolean z, boolean z2) {
        BufferedInputStream A0U;
        Bitmap bitmap2 = bitmap;
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            try {
                File createTempFile = File.createTempFile(AnonymousClass1GW.A0K(), (String) null);
                A00.A00(bitmap2, createTempFile.getAbsolutePath(), i, false, z, z2);
                if (createTempFile.length() > 0) {
                    try {
                        A0U = C90474aD.A0U(createTempFile);
                        byte[] A04 = AnonymousClass14X.A04(A0U);
                        A0U.close();
                        createTempFile.delete();
                        return A04;
                    } catch (Throwable th) {
                        createTempFile.delete();
                        throw th;
                    }
                }
            } catch (IOException e) {
                Log.e("BitmapCompressor/createCompressedByteArray", e);
                return null;
            }
        }
        return null;
        throw th;
    }
}
