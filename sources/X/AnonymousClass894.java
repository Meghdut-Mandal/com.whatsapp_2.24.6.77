package X;

import java.io.File;
import java.util.zip.ZipFile;

/* renamed from: X.894  reason: invalid class name */
public class AnonymousClass894 extends C21653ATt {
    public AnonymousClass890[] A00;
    public final AnonymousClass10I A01;
    public final File A02;
    public final ZipFile A03;
    public final /* synthetic */ AnonymousClass10J A04;
    public final /* synthetic */ AnonymousClass10J A05;

    public AnonymousClass894(AnonymousClass10J r3, AnonymousClass10J r4) {
        this.A04 = r3;
        this.A05 = r3;
        this.A03 = new ZipFile(r3.A00);
        this.A01 = r4;
        this.A02 = C90524aI.A0S(r3.A03.getApplicationInfo().nativeLibraryDir);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass890[] A02() {
        /*
            r15 = this;
            X.890[] r6 = r15.A00
            if (r6 != 0) goto L_0x0142
            java.util.LinkedHashSet r5 = X.C36441kJ.A17()
            java.util.HashMap r3 = X.AnonymousClass001.A0J()
            java.lang.String r0 = "^lib/([^/]+)/([^/]+\\.so)$"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r0)
            java.lang.String[] r6 = X.C131706Qe.A02()
            java.util.zip.ZipFile r0 = r15.A03
            java.util.Enumeration r9 = r0.entries()
        L_0x001c:
            boolean r0 = r9.hasMoreElements()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r4 = r9.nextElement()
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r4
            java.lang.String r0 = r4.getName()
            java.util.regex.Matcher r1 = r7.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x001c
            r0 = 1
            java.lang.String r8 = r1.group(r0)
            r0 = 2
            java.lang.String r2 = r1.group(r0)
            r1 = 0
        L_0x0041:
            int r0 = r6.length
            if (r1 >= r0) goto L_0x001c
            r0 = r6[r1]
            if (r0 == 0) goto L_0x006a
            r0 = r6[r1]
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x006a
            if (r1 < 0) goto L_0x001c
            r5.add(r8)
            java.lang.Object r0 = r3.get(r2)
            X.890 r0 = (X.AnonymousClass890) r0
            if (r0 == 0) goto L_0x0061
            int r0 = r0.A00
            if (r1 >= r0) goto L_0x001c
        L_0x0061:
            X.890 r0 = new X.890
            r0.<init>(r2, r4, r1)
            r3.put(r2, r0)
            goto L_0x001c
        L_0x006a:
            int r1 = r1 + 1
            goto L_0x0041
        L_0x006d:
            X.10I r1 = r15.A01
            int r0 = r5.size()
            java.lang.String[] r0 = X.C36371kC.A1b(r5, r0)
            r1.A01 = r0
            java.util.Collection r1 = r3.values()
            int r0 = r3.size()
            X.890[] r0 = new X.AnonymousClass890[r0]
            java.lang.Object[] r5 = r1.toArray(r0)
            X.890[] r5 = (X.AnonymousClass890[]) r5
            java.util.Arrays.sort(r5)
            r4 = 0
            r8 = 0
            r7 = 0
        L_0x008f:
            int r3 = r5.length
            if (r8 >= r3) goto L_0x012f
            r0 = r5[r8]
            java.util.zip.ZipEntry r1 = r0.A01
            java.lang.String r2 = r0.A01
            java.lang.String r9 = r1.getName()
            X.10J r3 = r15.A04
            java.lang.String r0 = r3.A00
            boolean r0 = r2.equals(r0)
            r14 = 0
            r12 = 1
            if (r0 == 0) goto L_0x00c6
            r0 = 0
            r3.A00 = r0
            java.lang.Object[] r6 = new java.lang.Object[r12]
            r6[r4] = r2
            java.lang.String r0 = "allowing consideration of corrupted lib %s"
        L_0x00b1:
            java.lang.String r1 = java.lang.String.format(r0, r6)
            r14 = 1
        L_0x00b6:
            java.lang.String r0 = "ApkSoSource"
            android.util.Log.d(r0, r1)
            if (r14 == 0) goto L_0x00c2
            int r7 = r7 + 1
        L_0x00bf:
            int r8 = r8 + 1
            goto L_0x008f
        L_0x00c2:
            r0 = 0
            r5[r8] = r0
            goto L_0x00bf
        L_0x00c6:
            java.io.File r0 = r15.A02
            java.io.File r13 = X.C36441kJ.A0w(r0, r2)
            r11 = 3
            r10 = 2
            java.lang.String r3 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x0120 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0120 }
            boolean r0 = r3.startsWith(r0)     // Catch:{ IOException -> 0x0120 }
            if (r0 != 0) goto L_0x00e7
            java.lang.String r1 = "not allowing consideration of %s: %s not in lib dir"
            java.lang.Object[] r0 = X.C36431kI.A1a(r9, r2, r10)     // Catch:{ IOException -> 0x0120 }
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch:{ IOException -> 0x0120 }
            goto L_0x00b6
        L_0x00e7:
            boolean r0 = r13.isFile()
            if (r0 != 0) goto L_0x00f4
            java.lang.Object[] r6 = X.C36431kI.A1a(r9, r2, r10)
            java.lang.String r0 = "allowing consideration of %s: %s not in system lib dir"
            goto L_0x00b1
        L_0x00f4:
            long r2 = r13.length()
            long r0 = r1.getSize()
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x010d
            java.lang.Object[] r6 = new java.lang.Object[r11]
            r6[r4] = r13
            X.AnonymousClass000.A1M(r6, r12, r2)
            X.AnonymousClass000.A1M(r6, r10, r0)
            java.lang.String r0 = "allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK"
            goto L_0x00b1
        L_0x010d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "not allowing consideration of "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ": deferring to libdir"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x00b6
        L_0x0120:
            r0 = move-exception
            java.lang.Object[] r1 = X.C36431kI.A1a(r9, r2, r11)
            X.C90514aH.A1Q(r0, r1, r10)
            java.lang.String r0 = "not allowing consideration of %s: %s, IOException when constructing path: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            goto L_0x00b6
        L_0x012f:
            X.890[] r6 = new X.AnonymousClass890[r7]
            r2 = 0
        L_0x0132:
            if (r4 >= r3) goto L_0x0140
            r1 = r5[r4]
            if (r1 == 0) goto L_0x013d
            int r0 = r2 + 1
            r6[r2] = r1
            r2 = r0
        L_0x013d:
            int r4 = r4 + 1
            goto L_0x0132
        L_0x0140:
            r15.A00 = r6
        L_0x0142:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass894.A02():X.890[]");
    }
}
