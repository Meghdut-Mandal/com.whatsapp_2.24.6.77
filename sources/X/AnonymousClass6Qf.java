package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.6Qf  reason: invalid class name */
public abstract class AnonymousClass6Qf {
    public static long A00(File file) {
        int length;
        long j = 0;
        if (file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            if (file.isDirectory()) {
                try {
                    File[] listFiles = file.listFiles();
                    if (!(listFiles == null || (length = listFiles.length) == 0)) {
                        int i = 0;
                        do {
                            j += A00(listFiles[i]);
                            i++;
                        } while (i < length);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return j;
    }

    public static C120965sN A01(File file) {
        int length;
        if (file.exists()) {
            File file2 = file;
            try {
                if (file.getParent() != null) {
                    file2 = C36441kJ.A0w(file.getParentFile().getCanonicalFile(), file.getName());
                }
                if (!file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
                }
            } catch (IOException unused) {
            }
            if (!file.isDirectory()) {
                return A02(file, false);
            }
            C120965sN A02 = A02(file, true);
            if (!file.isDirectory()) {
                return A02;
            }
            try {
                File[] listFiles = file.listFiles();
                if (listFiles == null || (length = listFiles.length) == 0) {
                    return A02;
                }
                long j = A02.A00;
                long j2 = A02.A02;
                long j3 = A02.A01;
                int i = 0;
                do {
                    C120965sN A01 = A01(listFiles[i]);
                    j += A01.A00;
                    j2 += A01.A02;
                    j3 += A01.A01;
                    i++;
                } while (i < length);
                return new C120965sN(j, j2, j3);
            } catch (Exception unused2) {
                return A02;
            }
        }
        return new C120965sN(0, 0, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:8|9|10|11|12|13|(5:15|(0)|(1:21)|22|23)|18|(0)|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r8 == 0) goto L_0x0055;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ExcHandler: ErrnoException | NoSuchMethodError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:11:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C120965sN A02(java.io.File r15, boolean r16) {
        /*
            long r0 = r15.length()
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0014
            r13 = 1
            X.5sN r8 = new X.5sN
            r11 = 0
            r8.<init>(r9, r11, r13)
            return r8
        L_0x0014:
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0027
            r15 = 1
            X.5sN r8 = new X.5sN
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r10 = r8
            r10.<init>(r11, r13, r15)
            return r8
        L_0x0027:
            r6 = -1
            java.lang.String r2 = r15.getCanonicalPath()     // Catch:{ IOException -> 0x002e }
            goto L_0x0032
        L_0x002e:
            java.lang.String r2 = r15.getAbsolutePath()     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0045, ErrnoException | NoSuchMethodError -> 0x0045 }
        L_0x0032:
            android.system.StructStat r2 = android.system.Os.lstat(r2)     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0045, ErrnoException | NoSuchMethodError -> 0x0045 }
            long r2 = r2.st_blocks     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0045, ErrnoException | NoSuchMethodError -> 0x0045 }
            r4 = 512(0x200, double:2.53E-321)
            long r2 = r2 * r4
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0045
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0055
            if (r8 == 0) goto L_0x0055
        L_0x0045:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = (float) r0
            float r3 = r3 * r2
            r2 = 1166016512(0x45800000, float:4096.0)
            float r3 = r3 / r2
            double r2 = (double) r3
            double r4 = java.lang.Math.ceil(r2)
            long r2 = (long) r4
            r4 = 4096(0x1000, double:2.0237E-320)
            long r2 = r2 * r4
        L_0x0055:
            if (r16 == 0) goto L_0x0059
            r0 = 0
        L_0x0059:
            r13 = 1
            X.5sN r8 = new X.5sN
            r9 = r0
            r11 = r2
            r8.<init>(r9, r11, r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Qf.A02(java.io.File, boolean):X.5sN");
    }
}
