package X;

import android.app.ActivityManager;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* renamed from: X.1K0  reason: invalid class name */
public abstract class AnonymousClass1K0 {
    public static final FileFilter A00 = AnonymousClass1K1.A00;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x00db */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00() {
        /*
            r9 = 0
            r5 = -1
            r8 = 0
            r7 = -1
        L_0x0004:
            int r0 = A01()     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            if (r8 >= r0) goto L_0x0067
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            r1.<init>()     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            java.lang.String r0 = "/sys/devices/system/cpu/cpu"
            r1.append(r0)     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            r1.append(r8)     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            java.lang.String r0 = "/cpufreq/cpuinfo_max_freq"
            r1.append(r0)     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            if (r0 == 0) goto L_0x0064
            r0 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r0]     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ NumberFormatException -> 0x0064 }
            r4.<init>(r1)     // Catch:{ NumberFormatException -> 0x0064 }
            int r3 = r4.read(r6)     // Catch:{ all -> 0x005a }
            r2 = 0
        L_0x0039:
            byte r1 = r6[r2]     // Catch:{ all -> 0x005a }
            r0 = 48
            if (r1 < r0) goto L_0x004a
            byte r1 = r6[r2]     // Catch:{ all -> 0x005a }
            r0 = 57
            if (r1 > r0) goto L_0x004a
            if (r2 >= r3) goto L_0x004a
            int r2 = r2 + 1
            goto L_0x0039
        L_0x004a:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x005a }
            r0.<init>(r6, r9, r2)     // Catch:{ all -> 0x005a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x005a }
            if (r0 <= r7) goto L_0x0056
            r7 = r0
        L_0x0056:
            r4.close()     // Catch:{ NumberFormatException -> 0x0064 }
            goto L_0x0064
        L_0x005a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ NumberFormatException -> 0x0064 }
        L_0x0063:
            throw r1     // Catch:{ NumberFormatException -> 0x0064 }
        L_0x0064:
            int r8 = r8 + 1
            goto L_0x0004
        L_0x0067:
            if (r7 != r5) goto L_0x00e9
            java.lang.String r0 = "/proc/cpuinfo"
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            r6.<init>(r0)     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            java.lang.String r10 = "cpu MHz"
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r0]     // Catch:{ all -> 0x00df }
            int r4 = r6.read(r9)     // Catch:{ IOException | NumberFormatException -> 0x00db }
            r3 = 0
        L_0x007b:
            if (r3 >= r4) goto L_0x00db
            byte r0 = r9[r3]     // Catch:{ IOException | NumberFormatException -> 0x00db }
            r1 = 10
            if (r0 == r1) goto L_0x0085
            if (r3 != 0) goto L_0x00a3
        L_0x0085:
            byte r0 = r9[r3]     // Catch:{ IOException | NumberFormatException -> 0x00db }
            if (r0 != r1) goto L_0x008b
            int r3 = r3 + 1
        L_0x008b:
            r8 = r3
        L_0x008c:
            if (r8 >= r4) goto L_0x00a3
            int r2 = r8 - r3
            byte r1 = r9[r8]     // Catch:{ IOException | NumberFormatException -> 0x00db }
            char r0 = r10.charAt(r2)     // Catch:{ IOException | NumberFormatException -> 0x00db }
            if (r1 != r0) goto L_0x00a3
            int r0 = r10.length()     // Catch:{ IOException | NumberFormatException -> 0x00db }
            int r0 = r0 + -1
            if (r2 == r0) goto L_0x00a6
            int r8 = r8 + 1
            goto L_0x008c
        L_0x00a3:
            int r3 = r3 + 1
            goto L_0x007b
        L_0x00a6:
            r0 = 1024(0x400, float:1.435E-42)
            r4 = 1024(0x400, float:1.435E-42)
            if (r8 >= r0) goto L_0x00db
            byte r1 = r9[r8]     // Catch:{ IOException | NumberFormatException -> 0x00db }
            r0 = 10
            if (r1 == r0) goto L_0x00db
            r3 = 48
            if (r1 < r3) goto L_0x00c9
            r2 = 57
            if (r1 > r2) goto L_0x00c9
            int r1 = r8 + 1
        L_0x00bc:
            if (r1 >= r4) goto L_0x00cc
            byte r0 = r9[r1]     // Catch:{ IOException | NumberFormatException -> 0x00db }
            if (r0 < r3) goto L_0x00cc
            byte r0 = r9[r1]     // Catch:{ IOException | NumberFormatException -> 0x00db }
            if (r0 > r2) goto L_0x00cc
            int r1 = r1 + 1
            goto L_0x00bc
        L_0x00c9:
            int r8 = r8 + 1
            goto L_0x00a6
        L_0x00cc:
            int r1 = r1 - r8
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | NumberFormatException -> 0x00db }
            r0.<init>(r9, r8, r1)     // Catch:{ IOException | NumberFormatException -> 0x00db }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | NumberFormatException -> 0x00db }
            int r0 = r0 * 1000
            if (r0 <= r7) goto L_0x00db
            r7 = r0
        L_0x00db:
            r6.close()     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
            return r7
        L_0x00df:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00e4 }
            goto L_0x00e8
        L_0x00e4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
        L_0x00e8:
            throw r1     // Catch:{ IOException -> 0x00ec, all -> 0x00ea }
        L_0x00e9:
            return r7
        L_0x00ea:
            r0 = move-exception
            throw r0
        L_0x00ec:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1K0.A00():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01() {
        /*
            java.lang.String r0 = "/sys/devices/system/cpu/"
            java.io.File r1 = new java.io.File     // Catch:{ NullPointerException | SecurityException -> 0x0011, all -> 0x000f }
            r1.<init>(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0011, all -> 0x000f }
            java.io.FileFilter r0 = A00     // Catch:{ NullPointerException | SecurityException -> 0x0011, all -> 0x000f }
            java.io.File[] r0 = r1.listFiles(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0011, all -> 0x000f }
            int r0 = r0.length     // Catch:{ NullPointerException | SecurityException -> 0x0011, all -> 0x000f }
            return r0
        L_0x000f:
            r0 = move-exception
            throw r0
        L_0x0011:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1K0.A01():int");
    }

    public static long A02(C21060yb r2) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager A04 = r2.A04();
        if (A04 == null) {
            Log.w("deviceinfo/get-total-memory am=null");
            return -1;
        }
        A04.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static boolean A03(String str) {
        BufferedReader bufferedReader;
        String readLine;
        String lowerCase = str.toLowerCase(Locale.US);
        BufferedReader bufferedReader2 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, C19430v1.A0B));
            } catch (UnsupportedEncodingException e) {
                Log.i("searchFileForText/unsupported-encoding: UTF-8", e);
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            bufferedReader2 = bufferedReader;
            do {
                readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    fileInputStream.close();
                    try {
                        return false;
                    } catch (Exception e2) {
                        Log.w("DeviceInfo/searchFileForText bufferedReader.close failed", e2);
                        return false;
                    }
                }
            } while (!readLine.toLowerCase(Locale.US).contains(lowerCase));
            fileInputStream.close();
            try {
                bufferedReader2.close();
                return true;
            } catch (Exception e3) {
                Log.w("DeviceInfo/searchFileForText bufferedReader.close failed", e3);
                return true;
            }
        } catch (Exception e4) {
            try {
                Log.w("DeviceInfo/searchFileForText read failed", e4);
            } finally {
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                        throw th;
                    } catch (Exception e5) {
                        Log.w("DeviceInfo/searchFileForText bufferedReader.close failed", e5);
                    }
                }
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}
