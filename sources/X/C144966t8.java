package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6t8  reason: invalid class name and case insensitive filesystem */
public class C144966t8 implements AnonymousClass7gT {
    public final C20690y0 A00;

    public static long[] A00(File file) {
        long[] jArr = {0, 0};
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    jArr[0] = jArr[0] + file2.length();
                    jArr[1] = jArr[1] + 1;
                } else if (file2.isDirectory()) {
                    long[] A002 = A00(file2);
                    jArr[0] = jArr[0] + A002[0];
                    jArr[1] = jArr[1] + A002[1];
                }
            }
        } else {
            C36321k7.A1L(file, "mediafoldersize listedFiles is null for folder ", AnonymousClass000.A0u());
        }
        return jArr;
    }

    public void Bcw(AnonymousClass591 r7) {
        String str;
        C20690y0 r5 = this.A00;
        File A0H = r5.A0H();
        if (A0H.exists() && A0H.isDirectory()) {
            try {
                long[] A002 = A00(A0H);
                r7.A1B = Long.valueOf(A002[0]);
                r7.A1A = Long.valueOf(A002[1]);
                File file = r5.A08().A0N;
                if (!file.exists() || !file.isDirectory()) {
                    Log.e("fieldstathelpers/update-media-folder-fieldstats/error/video-folder-does-not-exist");
                    return;
                }
                long[] A003 = A00(file);
                r7.A1S = Long.valueOf(A003[0]);
                r7.A1R = Long.valueOf(A003[1]);
            } catch (StackOverflowError e) {
                e = e;
                str = "fieldstathelpers/update-media-folder-fieldstats/error/stackoverflow";
                Log.e(str, e);
            } catch (OutOfMemoryError e2) {
                e = e2;
                str = "fieldstathelpers/update-media-folder-fieldstats/error/outofmemory";
                Log.e(str, e);
            }
        }
    }

    public C144966t8(C20690y0 r1) {
        this.A00 = r1;
    }
}
