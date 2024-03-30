package X;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.6YY  reason: invalid class name */
public abstract class AnonymousClass6YY {
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A02(X.C20840yF r14, java.io.File r15, int r16, int r17) {
        /*
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "file-utils/truncate-from-end compressedFile:"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " compressedInputFileSizeLimit:"
            r1.append(r0)
            r3 = r16
            r1.append(r3)
            java.lang.String r0 = " bufferSize:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " uncompressedTruncatedFileSize:"
            r1.append(r0)
            r10 = r17
            X.C36321k7.A1Y(r1, r10)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r4 = 0
            if (r15 != 0) goto L_0x003a
            java.lang.String r0 = "file-utils/truncate-from-end/no-compressed-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.util.Pair r0 = X.C36441kJ.A0Q(r5, r4)
        L_0x0039:
            return r0
        L_0x003a:
            long r6 = r15.length()
            long r0 = (long) r3
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x004d
            java.lang.String r0 = "file-utils/truncate-from-end/too-small-no-truncation-required"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.util.Pair r0 = X.C36441kJ.A0Q(r5, r15)
            return r0
        L_0x004d:
            r15.length()
            r1 = 16384(0x4000, float:2.2959E-41)
            r17 = 1
            java.lang.String r0 = "uncompressed-crashlog"
            java.io.File r3 = java.io.File.createTempFile(r0, r4)     // Catch:{ IOException -> 0x015b, all -> 0x0173 }
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ SyncFailedException -> 0x014e }
            r2.<init>(r3, r0)     // Catch:{ SyncFailedException -> 0x014e }
            byte[] r12 = new byte[r1]     // Catch:{ all -> 0x0144 }
            java.io.FileInputStream r6 = X.C90524aI.A0U(r15)     // Catch:{ all -> 0x0144 }
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x013a }
            r7.<init>(r6, r1)     // Catch:{ all -> 0x013a }
            r3.getAbsolutePath()     // Catch:{ all -> 0x008e }
        L_0x006f:
            r8 = 0
            r11 = 0
        L_0x0071:
            if (r11 >= r10) goto L_0x0086
            r1 = 16384(0x4000, float:2.2959E-41)
            int r0 = r10 - r11
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x008e }
            int r0 = r7.read(r12, r8, r0)     // Catch:{ all -> 0x008e }
            if (r0 <= 0) goto L_0x0086
            r2.write(r12, r8, r0)     // Catch:{ all -> 0x008e }
            int r11 = r11 + r0
            goto L_0x0071
        L_0x0086:
            r0 = 0
            r2.seek(r0)     // Catch:{ all -> 0x008e }
            if (r11 == r10) goto L_0x006f
            goto L_0x0098
        L_0x008e:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x013a }
        L_0x0097:
            throw r1     // Catch:{ all -> 0x013a }
        L_0x0098:
            r7.close()     // Catch:{ all -> 0x013a }
            r6.close()     // Catch:{ all -> 0x0144 }
            X.C90514aH.A1M(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r15.getName()     // Catch:{ IOException -> 0x0128 }
            java.io.File r16 = r14.A00(r6)     // Catch:{ IOException -> 0x0128 }
            java.io.FileOutputStream r8 = X.C90524aI.A0W(r16)     // Catch:{ IOException -> 0x0128 }
            java.util.zip.GZIPOutputStream r9 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x011e }
            r9.<init>(r8)     // Catch:{ all -> 0x011e }
            long r6 = (long) r11     // Catch:{ all -> 0x011e }
            r2.seek(r6)     // Catch:{ all -> 0x0114 }
            int r14 = r10 - r11
            r6 = 0
            r13 = 0
        L_0x00ba:
            if (r13 >= r14) goto L_0x00cf
            int r15 = r14 - r13
            r7 = 16384(0x4000, float:2.2959E-41)
            int r7 = java.lang.Math.min(r7, r15)     // Catch:{ all -> 0x0114 }
            int r7 = r2.read(r12, r6, r7)     // Catch:{ all -> 0x0114 }
            if (r7 <= 0) goto L_0x00cf
            r9.write(r12, r6, r7)     // Catch:{ all -> 0x0114 }
            int r13 = r13 + r7
            goto L_0x00ba
        L_0x00cf:
            r2.seek(r0)     // Catch:{ all -> 0x0114 }
            r7 = 0
        L_0x00d3:
            if (r7 >= r11) goto L_0x00e8
            r1 = 16384(0x4000, float:2.2959E-41)
            int r0 = r11 - r7
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0114 }
            int r0 = r2.read(r12, r6, r0)     // Catch:{ all -> 0x0114 }
            if (r0 <= 0) goto L_0x00e8
            r9.write(r12, r6, r0)     // Catch:{ all -> 0x0114 }
            int r7 = r7 + r0
            goto L_0x00d3
        L_0x00e8:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "file-utils/truncate-from-end uncompressedSize:"
            r6.append(r0)     // Catch:{ all -> 0x0114 }
            r6.append(r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = " compressedSize:"
            r6.append(r0)     // Catch:{ all -> 0x0114 }
            long r0 = r16.length()     // Catch:{ all -> 0x0114 }
            X.C36351kA.A1S(r6, r0)     // Catch:{ all -> 0x0114 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)     // Catch:{ all -> 0x0114 }
            r0 = r16
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)     // Catch:{ all -> 0x0114 }
            r9.close()     // Catch:{ all -> 0x011e }
            r8.close()     // Catch:{ IOException -> 0x0128 }
            r2.close()     // Catch:{ SyncFailedException -> 0x014e }
            goto L_0x016c
        L_0x0114:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0119 }
            goto L_0x011d
        L_0x0119:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x011e }
        L_0x011d:
            throw r1     // Catch:{ all -> 0x011e }
        L_0x011e:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0123 }
            goto L_0x0127
        L_0x0123:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0128 }
        L_0x0127:
            throw r1     // Catch:{ IOException -> 0x0128 }
        L_0x0128:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "file-utils/unable to create compressed file"
            X.C36321k7.A1J(r6, r0, r1)     // Catch:{ all -> 0x0144 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r5, r4)     // Catch:{ all -> 0x0144 }
            r2.close()     // Catch:{ SyncFailedException -> 0x014e }
            goto L_0x016c
        L_0x013a:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x013f }
            goto L_0x0143
        L_0x013f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0144 }
        L_0x0143:
            throw r1     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0149 }
            goto L_0x014d
        L_0x0149:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SyncFailedException -> 0x014e }
        L_0x014d:
            throw r1     // Catch:{ SyncFailedException -> 0x014e }
        L_0x014e:
            r1 = move-exception
            java.lang.String r0 = "file-utils/truncate-from-end"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0159 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r5, r4)     // Catch:{ IOException -> 0x0159 }
            goto L_0x016a
        L_0x0159:
            r2 = move-exception
            goto L_0x015d
        L_0x015b:
            r2 = move-exception
            r3 = r4
        L_0x015d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "fileutils/unable to create tempfile/"
            X.C36321k7.A1K(r2, r0, r1)     // Catch:{ all -> 0x0170 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r5, r4)     // Catch:{ all -> 0x0170 }
        L_0x016a:
            if (r3 == 0) goto L_0x0039
        L_0x016c:
            r3.delete()
            return r0
        L_0x0170:
            r0 = move-exception
            r4 = r3
            goto L_0x0174
        L_0x0173:
            r0 = move-exception
        L_0x0174:
            if (r4 == 0) goto L_0x0179
            r4.delete()
        L_0x0179:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YY.A02(X.0yF, java.io.File, int, int):android.util.Pair");
    }

    public static File A05(String str, String str2) {
        try {
            File A0T = C90524aI.A0T(str, str2);
            if (A0T.getCanonicalPath().startsWith(str)) {
                return A0T;
            }
            return null;
        } catch (IOException unused) {
        }
    }

    public static void A09(C170918Hz r3, File file) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1, false);
        try {
            deflaterOutputStream = new DeflaterOutputStream(C90524aI.A0W(file), deflater);
            r3.A0n(deflaterOutputStream);
            deflaterOutputStream.close();
            deflater.end();
            return;
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static boolean A0S(File file, InputStream inputStream) {
        BufferedOutputStream A0Y;
        try {
            A0Y = C90504aG.A0Y(file);
            byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    A0Y.write(bArr, 0, read);
                } else {
                    A0Y.close();
                    return true;
                }
            }
        } catch (IOException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C36351kA.A1Q(C90514aH.A0x(file, "FileUtils/saveInputStreamToFile/could not save file to:", A0u), A0u, e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static boolean A0T(File file, InputStream inputStream, long j) {
        BufferedOutputStream A0Y;
        try {
            A0Y = C90504aG.A0Y(file);
            byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
            long j2 = 0;
            do {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    A0Y.write(bArr, 0, read);
                    j2 += (long) read;
                } else {
                    A0Y.close();
                    return true;
                }
            } while (j2 <= j);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FileUtils/saveInputStreamToFileWithMaxBytes file size of ");
            A0u.append(j2);
            throw C90524aI.A0X(C36381kD.A0z(" but max of ", A0u, j));
        } catch (IOException e) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            C36351kA.A1Q(C90514aH.A0x(file, "FileUtils/saveInputStreamToFileWithMaxBytes/could not save file to:", A0u2), A0u2, e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] A0W(File file) {
        InflaterInputStream inflaterInputStream;
        Inflater inflater = new Inflater(false);
        try {
            inflaterInputStream = new InflaterInputStream(C90524aI.A0U(file), inflater);
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            A0J(inflaterInputStream, A0Q);
            byte[] byteArray = A0Q.toByteArray();
            inflaterInputStream.close();
            inflater.end();
            return byteArray;
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
        throw th;
    }

    public static long A00(C02680Bk r8, File file) {
        if (r8 != null) {
            r8.A04();
        }
        if (!file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList A0l = C90524aI.A0l();
        A0l.add(file);
        long j = 0;
        while (A0l.peek() != null) {
            if (r8 != null) {
                r8.A04();
            }
            Object poll = A0l.poll();
            C18740tg.A06(poll);
            File[] listFiles = ((File) poll).listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (r8 != null) {
                        r8.A04();
                    }
                    if (file2.exists()) {
                        if (file2.isDirectory()) {
                            A0l.add(file2);
                        } else {
                            j += file2.length();
                        }
                    }
                }
            }
        }
        return j;
    }

    public static Uri A01(Context context, File file) {
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        return FileProvider.A00(context, file, C19430v1.A07);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086 A[SYNTHETIC, Splitter:B:48:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC, Splitter:B:53:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4 A[SYNTHETIC, Splitter:B:58:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c3 A[SYNTHETIC, Splitter:B:72:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00cd A[SYNTHETIC, Splitter:B:77:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00df A[SYNTHETIC, Splitter:B:82:0x00df] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A04(java.io.File r13, java.io.File r14, java.lang.String r15) {
        /*
            java.lang.String r3 = "compress/close/fail "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r15)
            java.lang.String r0 = ".gz"
            java.io.File r12 = X.C90464aC.A0K(r14, r0, r1)
            boolean r0 = r12.exists()
            r11 = 0
            if (r0 == 0) goto L_0x001f
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "compress/fail"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r11
        L_0x001f:
            java.io.FileOutputStream r4 = X.C90524aI.A0W(r12)     // Catch:{ FileNotFoundException -> 0x0078, all -> 0x0074 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ FileNotFoundException -> 0x007c, all -> 0x0071 }
            r6.<init>(r4)     // Catch:{ FileNotFoundException -> 0x007c, all -> 0x0071 }
            r10 = 32768(0x8000, float:4.5918E-41)
            byte[] r9 = new byte[r10]     // Catch:{ FileNotFoundException -> 0x006e, all -> 0x00c0 }
            long r7 = r13.length()     // Catch:{ FileNotFoundException -> 0x006e, all -> 0x00c0 }
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            java.io.BufferedInputStream r5 = X.C90474aD.A0U(r13)     // Catch:{ FileNotFoundException -> 0x006e, all -> 0x00c0 }
            r2 = 0
            int r1 = r5.read(r9, r2, r10)     // Catch:{ FileNotFoundException -> 0x004b }
        L_0x0040:
            r0 = -1
            if (r1 == r0) goto L_0x004e
            r6.write(r9, r2, r1)     // Catch:{ FileNotFoundException -> 0x004b }
            int r1 = r5.read(r9, r2, r10)     // Catch:{ FileNotFoundException -> 0x004b }
            goto L_0x0040
        L_0x004b:
            r1 = move-exception
            goto L_0x007f
        L_0x004d:
            r5 = r11
        L_0x004e:
            if (r5 == 0) goto L_0x0059
            r5.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0059
        L_0x0054:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r12 = r11
        L_0x0059:
            r6.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x006a
        L_0x005d:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)
            java.lang.String r0 = r0.toString()
            X.C36321k7.A1Z(r1, r0)
            r12 = r11
        L_0x006a:
            r4.close()     // Catch:{ IOException -> 0x00ae }
            return r12
        L_0x006e:
            r1 = move-exception
            r5 = r11
            goto L_0x007f
        L_0x0071:
            r2 = move-exception
            r6 = r11
            goto L_0x00c1
        L_0x0074:
            r2 = move-exception
            r4 = r11
            r6 = r11
            goto L_0x00c1
        L_0x0078:
            r1 = move-exception
            r4 = r11
            r6 = r11
            goto L_0x007e
        L_0x007c:
            r1 = move-exception
            r6 = r11
        L_0x007e:
            r5 = r11
        L_0x007f:
            java.lang.String r0 = "compress/fail "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00bd }
            if (r5 == 0) goto L_0x008f
            r5.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x008f
        L_0x008a:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r12 = r11
        L_0x008f:
            if (r6 == 0) goto L_0x00a2
            r6.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x00a2
        L_0x0095:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)
            java.lang.String r0 = r0.toString()
            X.C36321k7.A1Z(r1, r0)
            r12 = r11
        L_0x00a2:
            if (r4 == 0) goto L_0x00bc
            r4.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x00bb
        L_0x00a8:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            goto L_0x00b3
        L_0x00ae:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
        L_0x00b3:
            java.lang.String r0 = X.C90494aF.A0c(r0, r3, r1)
            X.C36321k7.A1Z(r1, r0)
            return r11
        L_0x00bb:
            return r12
        L_0x00bc:
            return r12
        L_0x00bd:
            r2 = move-exception
            r11 = r5
            goto L_0x00c1
        L_0x00c0:
            r2 = move-exception
        L_0x00c1:
            if (r11 == 0) goto L_0x00cb
            r11.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x00cb:
            if (r6 == 0) goto L_0x00dd
            r6.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00dd
        L_0x00d1:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)
            java.lang.String r0 = r0.toString()
            X.C36321k7.A1Z(r1, r0)
        L_0x00dd:
            if (r4 == 0) goto L_0x00ef
            r4.close()     // Catch:{ IOException -> 0x00e3 }
            throw r2
        L_0x00e3:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)
            java.lang.String r0 = r0.toString()
            X.C36321k7.A1Z(r1, r0)
        L_0x00ef:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YY.A04(java.io.File, java.io.File, java.lang.String):java.io.File");
    }

    public static String A07(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (str.lastIndexOf(File.separator) > lastIndexOf || lastIndexOf < 0) {
            return "";
        }
        return str.substring(lastIndexOf + 1);
    }

    public static String A08(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        if (lastIndexOf2 > lastIndexOf) {
            lastIndexOf = -1;
        }
        if (lastIndexOf2 < 0) {
            lastIndexOf2 = 0;
        }
        if (lastIndexOf >= 0) {
            return str.substring(lastIndexOf2, lastIndexOf);
        }
        return str.substring(lastIndexOf2);
    }

    public static void A0D(C25711Hj r3, InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
                r3.accept(C36441kJ.A0y(read));
            } else {
                return;
            }
        }
    }

    public static void A0I(File file, byte[] bArr) {
        if (bArr != null) {
            BufferedOutputStream A0Y = C90504aG.A0Y(file);
            try {
                A0Y.write(bArr);
                A0Y.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public static void A0J(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void A0K(FileChannel fileChannel, WritableByteChannel writableByteChannel) {
        long j = 0;
        while (true) {
            FileChannel fileChannel2 = fileChannel;
            if (j < fileChannel.size()) {
                fileChannel2.transferTo(j, Math.min(131072, fileChannel.size() - j), writableByteChannel);
                j += 131072;
            } else {
                return;
            }
        }
    }

    public static File A03(Uri uri) {
        if (uri.getPath() == null || (uri.getScheme() != null && !"file".equals(uri.getScheme()))) {
            return null;
        }
        return C90484aE.A0c(uri);
    }

    public static String A06(File file, MessageDigest messageDigest, long j) {
        BufferedInputStream bufferedInputStream;
        if (!file.exists() || j > file.length()) {
            return null;
        }
        messageDigest.reset();
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        long j2 = 0;
        FileInputStream A0U = C90524aI.A0U(file);
        try {
            bufferedInputStream = new BufferedInputStream(A0U);
            int i = 0;
            while (true) {
                if (i == -1) {
                    break;
                }
                i = bufferedInputStream.read(bArr, 0, ZipDecompressor.UNZIP_BUFFER_SIZE);
                if (i > 0) {
                    long j3 = ((long) i) + j2;
                    if (j3 >= j) {
                        messageDigest.update(bArr, 0, (int) (j - j2));
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                    j2 = j3;
                }
            }
            String A07 = C18750th.A07(messageDigest.digest());
            bufferedInputStream.close();
            A0U.close();
            return A07;
        } catch (Throwable th) {
            try {
                A0U.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A0A(C20060wx r24, File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            long j = 0;
            for (File length : listFiles) {
                j += length.length();
            }
            if (j > 0) {
                ArrayList A10 = C36351kA.A10(listFiles);
                Collections.sort(A10, C1506275z.A00);
                long A01 = r24.A01();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = A10.iterator();
                while (it.hasNext()) {
                    File A0a = C90504aG.A0a(it);
                    long lastModified = A0a.lastModified();
                    if (currentTimeMillis - lastModified >= 604800000 || j > 20000000 || (j > 2000000 && 50000000 > A01 && A01 > 0)) {
                        long length2 = A0a.length();
                        StringBuilder A0u = AnonymousClass000.A0u();
                        C90474aD.A16(A0a, "cleanup/", A0u);
                        A0u.append(":");
                        A0u.append(currentTimeMillis);
                        A0u.append(" - ");
                        A0u.append(lastModified);
                        A0u.append(" fileLength=");
                        A0u.append(length2);
                        A0u.append(" directoryLengthBeforeCleanup=");
                        A0u.append(j);
                        C36321k7.A1V(" storageAvailableBeforeCleanup=", A0u, A01);
                        if (!A0a.delete()) {
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            A0u2.append("cleanup/failed to delete ");
                            C36321k7.A1a(A0u2, A0a.getName());
                        } else {
                            j -= length2;
                            A01 += length2;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void A0B(C24051Aw r1, File file, File file2) {
        FileOutputStream A0W;
        FileInputStream A0U = C90524aI.A0U(file);
        try {
            r1.A05(A0U);
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            A0W = C90524aI.A0W(file2);
            A0J(A0U, A0W);
            A0W.close();
            A0U.close();
            return;
        } catch (Throwable th) {
            try {
                A0U.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A0C(C24051Aw r1, File file, File file2) {
        if (!file.renameTo(file2)) {
            A0B(r1, file, file2);
            A0P(file);
        }
    }

    public static void A0E(File file, long j) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (System.currentTimeMillis() - file2.lastModified() > j) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    C90474aD.A16(file2, "cleanup/", A0u);
                    A0u.append(":");
                    A0u.append(System.currentTimeMillis());
                    A0u.append(" - ");
                    C36351kA.A1S(A0u, file2.lastModified());
                    if (!file2.delete()) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("cleanup/failed to delete ");
                        C36321k7.A1a(A0u2, file2.getName());
                    }
                }
            }
        }
    }

    public static void A0F(File file, InputStream inputStream, ZipOutputStream zipOutputStream) {
        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
        A0J(inputStream, zipOutputStream);
        zipOutputStream.closeEntry();
    }

    public static void A0G(File file, String str) {
        int length;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null && (length = listFiles.length) > 0) {
            int i = 0;
            do {
                File file2 = listFiles[i];
                StringBuilder A0v = AnonymousClass000.A0v(str);
                A0v.append(file2.getName());
                C90464aC.A19(file2, " ", A0v);
                A0v.append(" drw=");
                String str2 = "1";
                String str3 = "0";
                if (file2.isDirectory()) {
                    str3 = str2;
                }
                A0v.append(str3);
                String str4 = "0";
                if (file2.canRead()) {
                    str4 = str2;
                }
                A0v.append(str4);
                if (!file2.canWrite()) {
                    str2 = "0";
                }
                C36321k7.A1a(A0v, str2);
                i++;
            } while (i < length);
        }
    }

    public static void A0H(File file, Set set) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!file2.isDirectory()) {
                    file2.getPath();
                    A0P(file2);
                } else if (set == null || !set.contains(file2.getName())) {
                    A0H(file2, (Set) null);
                } else {
                    file2.getPath();
                }
            }
        }
        file.getPath();
        A0P(file);
    }

    public static boolean A0L(Uri uri, C21060yb r6, C20830yE r7, boolean z) {
        String scheme = uri.getScheme();
        if (!"settings".equals(uri.getAuthority()) && ("file".equals(scheme) || "content".equals(scheme))) {
            try {
                C21050ya A0O = r6.A0O();
                if (A0O == null) {
                    Log.w("file-utils/ringtone-available/false cr=null");
                    return false;
                }
                AnonymousClass14X.A02(A0O.A06(uri));
                return true;
            } catch (SQLiteException | FileNotFoundException | NullPointerException e) {
                Log.i(AnonymousClass000.A0l(uri, "file-utils/ringtone-available/false/file-not-found ", AnonymousClass000.A0u()), e);
                return false;
            } catch (IllegalStateException e2) {
                Log.i(AnonymousClass000.A0l(uri, "file-utils/ringtone-available/false/illegal-state ", AnonymousClass000.A0u()), e2);
                return false;
            } catch (IllegalArgumentException e3) {
                Log.i(AnonymousClass000.A0l(uri, "file-utils/ringtone-available/false/illegal-argument ", AnonymousClass000.A0u()), e3);
                return false;
            } catch (SecurityException e4) {
                if (uri.toString().startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString())) {
                    Log.i("file-utils/ringtone-available/false/access-denied", e4);
                    if (!r7.A0D()) {
                        return z;
                    }
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("file-utils/ringtone-available/true/cannot-check ");
                    C36351kA.A1K(uri, A0u);
                    Log.i(A0u.toString(), e4);
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean A0M(C24341Cb r3, File file, File file2) {
        AnonymousClass5RK r32;
        try {
            FileInputStream A0U = C90524aI.A0U(file);
            try {
                r32 = new AnonymousClass5RK(r3.A00(), file2);
                byte[] bArr = new byte[C132986Wc.A0F];
                while (true) {
                    int read = A0U.read(bArr);
                    if (read >= 0) {
                        r32.write(bArr, 0, read);
                    } else {
                        r32.close();
                        A0U.close();
                        return true;
                    }
                }
            } catch (Throwable th) {
                A0U.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e("fileutils/copyexternalfile/failed to copy external file", e);
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static boolean A0N(C24341Cb r1, File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        boolean A0M = A0M(r1, file, file2);
        if (!file.delete()) {
            Log.w("fileutils/moveFile/could not delete source file");
        }
        return A0M;
    }

    public static boolean A0O(C20840yF r3, File file, File file2) {
        AnonymousClass5RK r32;
        try {
            FileInputStream A0U = C90524aI.A0U(file);
            try {
                r32 = new AnonymousClass5RK(r3.A00, file2);
                byte[] bArr = new byte[C132986Wc.A0F];
                while (true) {
                    int read = A0U.read(bArr);
                    if (read >= 0) {
                        r32.write(bArr, 0, read);
                    } else {
                        r32.close();
                        A0U.close();
                        return true;
                    }
                }
            } catch (Throwable th) {
                A0U.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e("fileutils/copyinternalfile/failed to copy internal file", e);
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static boolean A0P(File file) {
        if (!file.exists() || file.delete()) {
            return true;
        }
        C36321k7.A1L(file, "file-utils/delete-file/failed ", AnonymousClass000.A0u());
        return false;
    }

    public static boolean A0Q(File file) {
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File A0Q : listFiles) {
                        if (!A0Q(A0Q)) {
                            return false;
                        }
                    }
                }
            } catch (OutOfMemoryError e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                C36351kA.A1Q(C90514aH.A0x(file, "trash/delete-recursive/out-of-memory ", A0u), A0u, e);
                return false;
            }
        }
        return file.delete();
    }

    public static boolean A0R(File file) {
        StringBuilder sb;
        String str;
        String absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            boolean isDirectory = file.isDirectory();
            sb = AnonymousClass000.A0u();
            if (isDirectory) {
                C36321k7.A1P("FileUtils/prepareEmptyDir/Directory already exists unexpectedly! Cleaning up. ", absolutePath, sb);
                A0E(file, -1);
                return true;
            }
            str = "FileUtils/prepareEmptyDir/Directory already exists unexpectedly and is a file! Wrong call.";
        } else if (file.mkdirs()) {
            return true;
        } else {
            sb = AnonymousClass000.A0u();
            str = "FileUtils/prepareEmptyDir/Could not make directory ";
        }
        C36321k7.A1P(str, absolutePath, sb);
        return false;
    }

    public static boolean A0U(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            if (!str.matches("[\\w-.,'\\s]+")) {
                str2 = "FileUtils/fileNameInvalid/file name contains invalid characters, allowed characters are a to z, A to Z, _ , ' - . and space character";
            } else if (!str.contains("..")) {
                return false;
            } else {
                str2 = "FileUtils/fileNameInvalid/file name cannot contain ..";
            }
            Log.e(str2);
        }
        return true;
    }

    public static byte[] A0V(File file) {
        byte[] bArr = new byte[((int) file.length())];
        FileInputStream A0U = C90524aI.A0U(file);
        try {
            A0U.read(bArr);
            A0U.close();
            return bArr;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
