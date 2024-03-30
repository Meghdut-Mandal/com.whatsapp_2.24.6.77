package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.0YK  reason: invalid class name */
public abstract class AnonymousClass0YK {
    public static MappedByteBuffer A01(Context context, Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor A00 = C05360Pk.A00(context.getContentResolver(), uri);
            if (A00 == null) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(A00.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                A00.close();
                return map;
            } catch (Throwable th) {
                A00.close();
                throw th;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static File A00(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(".font");
            A0u.append(Process.myPid());
            A0u.append("-");
            A0u.append(Process.myTid());
            String A0q = AnonymousClass000.A0q("-", A0u);
            int i = 0;
            while (i < 100) {
                File file = new File(cacheDir, AnonymousClass000.A0r(A0q, AnonymousClass000.A0u(), i));
                try {
                    if (file.createNewFile()) {
                        return file;
                    }
                    i++;
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    public static boolean A02(Resources resources, File file, int i) {
        try {
            InputStream openRawResource = resources.openRawResource(i);
            try {
                boolean A03 = A03(file, openRawResource);
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return A03;
            } catch (Throwable th) {
                th = th;
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                        throw th;
                    } catch (IOException unused2) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        if (r5 == null) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041 A[SYNTHETIC, Splitter:B:23:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.io.File r8, java.io.InputStream r9) {
        /*
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.allowThreadDiskWrites()
            r6 = 0
            r5 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0028 }
            r4.<init>(r8, r6)     // Catch:{ IOException -> 0x0028 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
        L_0x000f:
            int r1 = r9.read(r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r0 = -1
            if (r1 == r0) goto L_0x001a
            r4.write(r2, r6, r1)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            r0 = 1
            r4.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            android.os.StrictMode.setThreadPolicy(r7)
            return r0
        L_0x0022:
            r0 = move-exception
            r5 = r4
            goto L_0x004b
        L_0x0025:
            r3 = move-exception
            r5 = r4
            goto L_0x0029
        L_0x0028:
            r3 = move-exception
        L_0x0029:
            java.lang.String r2 = "TypefaceCompatUtil"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "Error copying resource contents to temp file: "
            r1.append(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0048 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x0044
            r5.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            android.os.StrictMode.setThreadPolicy(r7)
            return r6
        L_0x0048:
            r0 = move-exception
            if (r5 == 0) goto L_0x004e
        L_0x004b:
            r5.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            android.os.StrictMode.setThreadPolicy(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YK.A03(java.io.File, java.io.InputStream):boolean");
    }
}
