package X;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import com.whatsapp.AbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.101  reason: invalid class name */
public class AnonymousClass101 {
    public static final Integer[] A08 = {0, 1};
    public String A00;
    public String A01;
    public boolean A02 = false;
    public final AnonymousClass100 A03;
    public final C19770wU A04;
    public final Set A05 = new HashSet();
    public final AtomicBoolean A06 = new AtomicBoolean(true);
    public final HashMap A07 = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (r9.contains("libvlc.so") != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(android.content.Context r12, java.lang.String r13, int r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r6 = r11
            boolean r0 = r11.A02
            X.C18740tg.A0C(r0)
            r7 = r12
            java.io.File r1 = r12.getFilesDir()
            java.lang.String r2 = "decompressed"
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            java.io.File r8 = new java.io.File
            r8.<init>(r0, r13)
            java.io.File r0 = r12.getFilesDir()
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0034
            boolean r0 = r1.mkdir()
            if (r0 != 0) goto L_0x0034
            java.lang.String r1 = "Could not create decompressed assets directory"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0034:
            boolean r0 = r8.exists()
            if (r0 != 0) goto L_0x003d
            r8.mkdir()
        L_0x003d:
            if (r15 != 0) goto L_0x008f
            boolean r0 = r11.A01(r12, r13)
            if (r0 == 0) goto L_0x008f
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.AnonymousClass10B.A00(r12)
        L_0x004d:
            if (r14 != 0) goto L_0x0086
            java.lang.String r1 = r11.A00
            if (r1 != 0) goto L_0x0067
            int r4 = com.facebook.superpack.AssetDecompressor.get_architecture()
            java.lang.String r3 = "arm64-v8a"
            java.lang.String r2 = "armeabi-v7a"
            java.lang.String r1 = "x86"
            java.lang.String r0 = "x86_64"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r1, r0}
            r1 = r0[r4]
            r11.A00 = r1
        L_0x0067:
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = "libwhatsapp.so"
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = "libvlc.so"
            boolean r0 = r9.contains(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0081
        L_0x0080:
            r1 = 1
        L_0x0081:
            java.lang.String r0 = "libvlc.so needs to be co-located in armv7 builds, to avoid setting off a bug on some older x86 devices"
            X.C18740tg.A0F(r1, r0)
        L_0x0086:
            int r1 = r9.size()
            r0 = 0
            if (r1 <= 0) goto L_0x008e
            r0 = 1
        L_0x008e:
            return r0
        L_0x008f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "compressed/"
            r5.append(r0)
            if (r14 == 0) goto L_0x00bb
            java.lang.String r0 = "strings"
        L_0x009d:
            r5.append(r0)
            java.lang.String r0 = "/"
            r5.append(r0)
            r5.append(r13)
            java.lang.String r2 = r5.toString()
            java.lang.String r0 = "."
            int r0 = r13.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r3 = r13.substring(r0)
            if (r16 != 0) goto L_0x00e1
            goto L_0x00d4
        L_0x00bb:
            java.lang.String r0 = r11.A00
            if (r0 != 0) goto L_0x009d
            int r4 = com.facebook.superpack.AssetDecompressor.get_architecture()
            java.lang.String r3 = "arm64-v8a"
            java.lang.String r2 = "armeabi-v7a"
            java.lang.String r1 = "x86"
            java.lang.String r0 = "x86_64"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r1, r0}
            r0 = r0[r4]
            r11.A00 = r0
            goto L_0x009d
        L_0x00d4:
            android.content.res.AssetManager r1 = r12.getAssets()     // Catch:{ AssetDecompressionException -> 0x0127 }
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ AssetDecompressionException -> 0x0127 }
            java.lang.String[] r0 = com.facebook.superpack.AssetDecompressor.decompress(r1, r2, r3, r0)     // Catch:{ AssetDecompressionException -> 0x0127 }
            goto L_0x00f6
        L_0x00e1:
            android.content.res.AssetManager r0 = r12.getAssets()
            java.io.InputStream r2 = r0.open(r2)
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ AssetDecompressionException -> 0x0114 }
            java.lang.String[] r0 = com.facebook.superpack.AssetDecompressor.decompress_legacy(r2, r3, r0)     // Catch:{ AssetDecompressionException -> 0x0114 }
            if (r2 == 0) goto L_0x00f6
            r2.close()
        L_0x00f6:
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            X.0wU r0 = r11.A04     // Catch:{ all -> 0x0112 }
            r10 = 25
            X.1ia r5 = new X.1ia     // Catch:{ all -> 0x0112 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0112 }
            r0.Boy(r5)     // Catch:{ all -> 0x0112 }
            java.util.Set r0 = r11.A05
            r0.add(r13)
            goto L_0x004d
        L_0x0112:
            r1 = move-exception
            throw r1
        L_0x0114:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x011b }
            r0.<init>(r1)     // Catch:{ all -> 0x011b }
            throw r0     // Catch:{ all -> 0x011b }
        L_0x011b:
            r1 = move-exception
            if (r2 == 0) goto L_0x012d
            r2.close()     // Catch:{ all -> 0x0122 }
            throw r1
        L_0x0122:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0127:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
        L_0x012d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass101.A02(android.content.Context, java.lang.String, int, boolean, boolean):boolean");
    }

    public static boolean A00(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lib");
        sb.append(str);
        sb.append(".so");
        if (!new File(new File(new File(context.getFilesDir(), "decompressed"), AbstractAppShellDelegate.COMPRESSED_LIBS_ARCHIVE_NAME), sb.toString()).exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("whatsappassetdecompressor/load-library-from-archive File missing: ");
            sb2.append(str);
            Log.w(sb2.toString());
            return false;
        }
        try {
            return SoLoader.A06(str);
        } catch (UnsatisfiedLinkError e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("whatsappassetdecompressor/load-library-from-archive error: ");
            sb3.append(str);
            Log.w(sb3.toString(), e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r0 == false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.util.HashMap r4 = r7.A07
            java.lang.Object r0 = r4.get(r9)
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x001a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.put(r9, r0)
            r1 = 0
        L_0x0019:
            return r1
        L_0x001a:
            java.util.Set r0 = r7.A05
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0028
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x0024:
            r4.put(r9, r0)
            return r1
        L_0x0028:
            java.io.File r2 = r8.getFilesDir()     // Catch:{ IOException -> 0x0075 }
            java.lang.String r1 = "decompressed"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0075 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0075 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0075 }
            r1.<init>(r0, r9)     // Catch:{ IOException -> 0x0075 }
            java.lang.String r0 = ".superpack_version"
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0075 }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x0075 }
            long r1 = r6.length()     // Catch:{ IOException -> 0x0075 }
            int r0 = (int) r1     // Catch:{ IOException -> 0x0075 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0075 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0075 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0075 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0075 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x006b }
        L_0x0052:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x006b }
            r0 = -1
            if (r1 == r0) goto L_0x005e
            r0 = 0
            r5.write(r2, r0, r1)     // Catch:{ all -> 0x006b }
            goto L_0x0052
        L_0x005e:
            r3.close()     // Catch:{ IOException -> 0x0075 }
            byte[] r0 = r5.toByteArray()     // Catch:{ IOException -> 0x0075 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0075 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0075 }
            goto L_0x0077
        L_0x006b:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0075 }
        L_0x0074:
            throw r1     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            java.lang.String r1 = ""
        L_0x0077:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = r7.A01
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass101.A01(android.content.Context, java.lang.String):boolean");
    }

    public AnonymousClass101(AnonymousClass100 r3, C19770wU r4) {
        this.A04 = r4;
        this.A03 = r3;
    }
}
