package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.3Nt  reason: invalid class name and case insensitive filesystem */
public class C64383Nt {
    public final C001700s A00 = C36431kI.A0S();
    public final C19600wD A01;
    public final C64943Qb A02;
    public final C64393Nu A03;
    public final C19930wk A04;

    public C64383Nt(C19600wD r2, C64943Qb r3, C64393Nu r4, C19770wU r5) {
        this.A04 = C36411kG.A0r(r5);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static Bitmap A00(Context context, File file) {
        FileInputStream fileInputStream;
        Point A06 = AnonymousClass3T0.A06(context);
        try {
            fileInputStream = new FileInputStream(file);
            Bitmap bitmap = AnonymousClass6Y8.A0A(AnonymousClass3T0.A07(A06, true), fileInputStream).A02;
            fileInputStream.close();
            return bitmap;
        } catch (IOException | OutOfMemoryError e) {
            Log.e("DownloadableWallpaperManager/error when loading wallpaper resource", e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
