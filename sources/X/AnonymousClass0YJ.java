package X;

import android.graphics.Path;

/* renamed from: X.0YJ  reason: invalid class name */
public abstract class AnonymousClass0YJ {
    public static boolean A01(AnonymousClass0YU[] r5, AnonymousClass0YU[] r6) {
        int length;
        if (!(r5 == null || r6 == null || (length = r5.length) != r6.length)) {
            int i = 0;
            while (i < length) {
                if (r5[i].A00 == r6[i].A00 && r5[i].A01.length == r6[i].A01.length) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public static Path A00(String str) {
        Path path = new Path();
        AnonymousClass0YU[] A02 = A02(str);
        if (A02 == null) {
            return null;
        }
        try {
            AnonymousClass0YU.A01(path, A02);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(AnonymousClass000.A0p("Error in parsing ", str, AnonymousClass000.A0u()), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        r12 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0YU[] A02(java.lang.String r15) {
        /*
            if (r15 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r8 = 1
            r7 = 0
            r6 = 1
            r5 = 0
        L_0x000c:
            int r4 = r15.length()
            if (r6 < r4) goto L_0x0032
            int r6 = r6 - r5
            if (r6 != r8) goto L_0x0025
            if (r5 >= r4) goto L_0x0025
            char r2 = r15.charAt(r5)
            float[] r1 = new float[r7]
            X.0YU r0 = new X.0YU
            r0.<init>(r1, r2)
            r3.add(r0)
        L_0x0025:
            int r0 = r3.size()
            X.0YU[] r0 = new X.AnonymousClass0YU[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            X.0YU[] r0 = (X.AnonymousClass0YU[]) r0
            return r0
        L_0x0032:
            if (r6 >= r4) goto L_0x004e
            char r2 = r15.charAt(r6)
            int r1 = r2 + -65
            int r0 = r2 + -90
            int r1 = r1 * r0
            if (r1 <= 0) goto L_0x0046
            int r1 = r2 + -97
            int r0 = r2 + -122
            int r1 = r1 * r0
            if (r1 > 0) goto L_0x006e
        L_0x0046:
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L_0x006e
            r0 = 69
            if (r2 == r0) goto L_0x006e
        L_0x004e:
            r14 = r6
            java.lang.String r0 = r15.substring(r5, r6)
            java.lang.String r4 = r0.trim()
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x00d5
            char r1 = r4.charAt(r7)
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L_0x00c7
            char r1 = r4.charAt(r7)
            r0 = 90
            if (r1 == r0) goto L_0x00c7
            goto L_0x0071
        L_0x006e:
            int r6 = r6 + 1
            goto L_0x0032
        L_0x0071:
            int r9 = r4.length()     // Catch:{ NumberFormatException -> 0x00e0 }
            float[] r6 = new float[r9]     // Catch:{ NumberFormatException -> 0x00e0 }
            r11 = 1
            r5 = 0
        L_0x0079:
            if (r11 >= r9) goto L_0x00bb
            r13 = 0
            r2 = r11
            r12 = 0
            r10 = 0
        L_0x007f:
            if (r2 >= r9) goto L_0x008f
            char r1 = r4.charAt(r2)     // Catch:{ NumberFormatException -> 0x00e0 }
            r0 = 32
            if (r1 == r0) goto L_0x008f
            goto L_0x0092
        L_0x008a:
            if (r2 == r11) goto L_0x009d
            if (r12 != 0) goto L_0x009d
        L_0x008e:
            r13 = 1
        L_0x008f:
            if (r11 >= r2) goto L_0x00b5
            goto L_0x00a8
        L_0x0092:
            r0 = 69
            if (r1 == r0) goto L_0x00a6
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x00a6
            switch(r1) {
                case 44: goto L_0x008f;
                case 45: goto L_0x008a;
                case 46: goto L_0x00a1;
                default: goto L_0x009d;
            }     // Catch:{ NumberFormatException -> 0x00e0 }
        L_0x009d:
            r12 = 0
        L_0x009e:
            int r2 = r2 + 1
            goto L_0x007f
        L_0x00a1:
            if (r10 != 0) goto L_0x008e
            r12 = 0
            r10 = 1
            goto L_0x009e
        L_0x00a6:
            r12 = 1
            goto L_0x009e
        L_0x00a8:
            int r1 = r5 + 1
            java.lang.String r0 = r4.substring(r11, r2)     // Catch:{ NumberFormatException -> 0x00e0 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x00e0 }
            r6[r5] = r0     // Catch:{ NumberFormatException -> 0x00e0 }
            r5 = r1
        L_0x00b5:
            int r11 = r2 + 1
            if (r13 == 0) goto L_0x0079
            r11 = r2
            goto L_0x0079
        L_0x00bb:
            if (r7 > r5) goto L_0x00da
            int r0 = java.lang.Math.min(r5, r9)     // Catch:{ NumberFormatException -> 0x00e0 }
            float[] r2 = new float[r5]     // Catch:{ NumberFormatException -> 0x00e0 }
            java.lang.System.arraycopy(r6, r7, r2, r7, r0)     // Catch:{ NumberFormatException -> 0x00e0 }
            goto L_0x00c9
        L_0x00c7:
            float[] r2 = new float[r7]
        L_0x00c9:
            char r1 = r4.charAt(r7)
            X.0YU r0 = new X.0YU
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x00d5:
            int r6 = r14 + 1
            r5 = r14
            goto L_0x000c
        L_0x00da:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ NumberFormatException -> 0x00e0 }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x00e0 }
            throw r0     // Catch:{ NumberFormatException -> 0x00e0 }
        L_0x00e0:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "error in parsing \""
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "\""
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YJ.A02(java.lang.String):X.0YU[]");
    }
}
