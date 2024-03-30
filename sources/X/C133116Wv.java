package X;

import android.net.Uri;
import android.util.SparseIntArray;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Wv  reason: invalid class name and case insensitive filesystem */
public class C133116Wv {
    public final C21390zA A00;
    public final C20690y0 A01;
    public final AnonymousClass179 A02;
    public final C21060yb A03;
    public final C20830yE A04;
    public final C19420v0 A05;
    public final C21350z4 A06;
    public final AnonymousClass12U A07;
    public final AtomicBoolean A08 = C36431kI.A1H();
    public final C19700wN A09;
    public final C24341Cb A0A;
    public final C19970wo A0B;
    public final C19630wG A0C;
    public final C21010yW A0D;

    public static void A03(SparseIntArray sparseIntArray, C133116Wv r7, int i) {
        if (sparseIntArray != null) {
            int i2 = sparseIntArray.get(i, 0);
            sparseIntArray.put(i, i2 + 1);
            if (i2 != 0) {
                return;
            }
        }
        if (i == 2 || i == 3 || i == 4 || i == 6) {
            C19700wN r3 = r7.A09;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("result=");
            r3.A0E("externaldirmigration/failed", AnonymousClass000.A0q(C36331k8.A0h(Integer.valueOf(i)), A0u), true);
        }
        AnonymousClass580 r4 = new AnonymousClass580();
        r4.A00 = Integer.valueOf(i);
        AnonymousClass005 r6 = r7.A05.A00;
        r4.A01 = C90474aD.A0Z(C36391kE.A0H(r6), "external_dir_migration_attempt_n", -1);
        r4.A04 = C90474aD.A0Z(C36391kE.A0H(r6), "ext_dir_migration_rescan_time", -1);
        r4.A03 = C90474aD.A0Z(C36391kE.A0H(r6), "ext_dir_migration_move_time", -1);
        r4.A02 = C90504aG.A0h(System.currentTimeMillis(), C36341k9.A0B(C36391kE.A0H(r6), "ext_dir_migration_start_time"));
        r7.A0D.Bls(r4, (C18950u5) null, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if ((!X.C36441kJ.A0w(r15, ".nomedia").exists()) == false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9 A[Catch:{ IOException -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.util.SparseIntArray r22, X.C122245uX r23, X.C133116Wv r24, java.io.File r25, java.io.File r26, boolean r27) {
        /*
            r12 = r25
            boolean r0 = r12.exists()
            r1 = 0
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = ".migrated"
            java.io.File r11 = X.C36441kJ.A0w(r12, r0)
            boolean r0 = r11.exists()
            r1 = 1
            if (r0 != 0) goto L_0x015e
            r15 = r26
            boolean r0 = r15.exists()
            r3 = 2
            r14 = r22
            r13 = r24
            if (r0 != 0) goto L_0x002e
            boolean r0 = r15.mkdir()
            if (r0 != 0) goto L_0x002e
            r0 = 3
            A03(r14, r13, r0)
        L_0x002d:
            return r3
        L_0x002e:
            java.lang.String r10 = " to="
            java.lang.String r1 = ".nomedia"
            java.io.File r0 = X.C36441kJ.A0w(r12, r1)
            boolean r0 = r0.exists()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004c
            java.io.File r0 = X.C36441kJ.A0w(r15, r1)
            boolean r0 = r0.exists()
            r0 = r0 ^ 1
            r16 = 1
            if (r0 != 0) goto L_0x004e
        L_0x004c:
            r16 = 0
        L_0x004e:
            java.io.File[] r9 = r12.listFiles()
            java.lang.String r8 = "externaldirmigration/move/can't delete from="
            r22 = r27
            if (r9 == 0) goto L_0x0147
            int r7 = r9.length
            r6 = 0
            r5 = 0
        L_0x005b:
            if (r5 >= r7) goto L_0x0121
            r3 = r9[r5]
            java.lang.String r0 = r3.getName()
            java.io.File r4 = X.C36441kJ.A0w(r15, r0)
            com.whatsapp.util.StatResult r2 = com.whatsapp.ExternalDirMigration$Utils.lstatOpenFile(r3)     // Catch:{ IOException -> 0x0114 }
            if (r2 == 0) goto L_0x011d
            boolean r1 = r2.A05     // Catch:{ IOException -> 0x0114 }
            r0 = r23
            if (r1 != 0) goto L_0x00aa
            boolean r1 = r3.isDirectory()     // Catch:{ IOException -> 0x0114 }
            if (r1 == 0) goto L_0x008b
            r18 = r0
            r20 = r3
            r21 = r4
            r17 = r14
            r19 = r13
            int r0 = A00(r17, r18, r19, r20, r21, r22)     // Catch:{ IOException -> 0x0114 }
            if (r0 <= r6) goto L_0x011d
            goto L_0x011c
        L_0x008b:
            int r2 = r2.A01     // Catch:{ IOException -> 0x0114 }
            r1 = 1
            if (r2 <= r1) goto L_0x00aa
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0114 }
            java.lang.String r0 = "externaldirmigration/can't migrate "
            r1.append(r0)     // Catch:{ IOException -> 0x0114 }
            r1.append(r3)     // Catch:{ IOException -> 0x0114 }
            java.lang.String r0 = "(too many hard links: "
            r1.append(r0)     // Catch:{ IOException -> 0x0114 }
            r1.append(r2)     // Catch:{ IOException -> 0x0114 }
            java.lang.String r0 = ")"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ IOException -> 0x0114 }
            goto L_0x00c6
        L_0x00aa:
            boolean r1 = r4.exists()     // Catch:{ IOException -> 0x0114 }
            if (r1 == 0) goto L_0x00cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0114 }
            java.lang.String r0 = "externaldirmigration/file already exists, to="
            X.C36321k7.A1L(r4, r0, r1)     // Catch:{ IOException -> 0x0114 }
            boolean r0 = r3.delete()     // Catch:{ IOException -> 0x0114 }
            if (r0 != 0) goto L_0x011d
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0114 }
            X.C36321k7.A1L(r3, r8, r0)     // Catch:{ IOException -> 0x0114 }
        L_0x00c6:
            r0 = 1
            if (r6 >= r0) goto L_0x011d
            r6 = 1
            goto L_0x011d
        L_0x00cb:
            X.1Cb r1 = r13.A0A     // Catch:{ IOException -> 0x0114 }
            boolean r1 = X.AnonymousClass6YY.A0N(r1, r3, r4)     // Catch:{ IOException -> 0x0114 }
            if (r1 == 0) goto L_0x00f8
            X.6Wv r3 = r0.A00     // Catch:{ IOException -> 0x0114 }
            java.util.List r2 = r0.A01     // Catch:{ IOException -> 0x0114 }
            boolean r1 = r0.A03     // Catch:{ IOException -> 0x0114 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A02     // Catch:{ IOException -> 0x0114 }
            r17 = r0
            java.lang.String r0 = "scoped"
            if (r16 == 0) goto L_0x00e4
            r2.add(r4)     // Catch:{ IOException -> 0x0114 }
        L_0x00e4:
            if (r1 == 0) goto L_0x011d
            boolean r1 = X.C90504aG.A1Z(r17)     // Catch:{ IOException -> 0x0114 }
            if (r1 == 0) goto L_0x011d
            X.179 r1 = r3.A02     // Catch:{ IOException -> 0x0114 }
            r1.A09(r0)     // Catch:{ IOException -> 0x0114 }
            X.0v0 r1 = r3.A05     // Catch:{ IOException -> 0x0114 }
            r0 = 2
            r1.A17(r0)     // Catch:{ IOException -> 0x0114 }
            goto L_0x011d
        L_0x00f8:
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x0114 }
            if (r0 == 0) goto L_0x011d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0114 }
            java.lang.String r0 = "externaldirmigration/can't rename from="
            r1.append(r0)     // Catch:{ IOException -> 0x0114 }
            r1.append(r3)     // Catch:{ IOException -> 0x0114 }
            X.C36321k7.A1J(r4, r10, r1)     // Catch:{ IOException -> 0x0114 }
            if (r27 != 0) goto L_0x011a
            r0 = 4
            A03(r14, r13, r0)     // Catch:{ IOException -> 0x0114 }
            goto L_0x011a
        L_0x0114:
            r1 = move-exception
            java.lang.String r0 = "Failed to read a file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x011a:
            r6 = 2
            goto L_0x011d
        L_0x011c:
            r6 = r0
        L_0x011d:
            int r5 = r5 + 1
            goto L_0x005b
        L_0x0121:
            if (r6 == 0) goto L_0x0147
            r1 = 1
            r3 = 2
            if (r6 != r1) goto L_0x002d
            X.179 r0 = r13.A02
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x002d
            boolean r0 = r11.exists()     // Catch:{ IOException -> 0x013c }
            if (r0 != 0) goto L_0x015e
            boolean r0 = r11.createNewFile()     // Catch:{ IOException -> 0x013c }
            if (r0 == 0) goto L_0x002d
            return r1
        L_0x013c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "externaldirmigration/ensureFileExists failed to create "
            X.C36321k7.A1M(r11, r0, r1, r2)
            return r3
        L_0x0147:
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x015c
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C36321k7.A1J(r12, r8, r0)
            if (r27 != 0) goto L_0x015a
            r0 = 6
            A03(r14, r13, r0)
        L_0x015a:
            r3 = 2
            return r3
        L_0x015c:
            r3 = 0
            return r3
        L_0x015e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133116Wv.A00(android.util.SparseIntArray, X.5uX, X.6Wv, java.io.File, java.io.File, boolean):int");
    }

    public static int A01(C133116Wv r2) {
        int A012 = C36371kC.A01(C36341k9.A0E(r2.A05), "external_dir_migration_stage");
        if (A012 >= 0 && A012 <= 5) {
            return A012;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("externaldirmigration/unexpected stage (");
        A0u.append(A012);
        C36321k7.A1Z(A0u, ") resetting to not started");
        return 0;
    }

    public C133116Wv(C21390zA r2, C19700wN r3, C20690y0 r4, AnonymousClass179 r5, C24341Cb r6, C21060yb r7, C19970wo r8, C19630wG r9, C20830yE r10, C19420v0 r11, C21350z4 r12, C21010yW r13, AnonymousClass12U r14) {
        this.A0C = r9;
        this.A0B = r8;
        this.A09 = r3;
        this.A01 = r4;
        this.A0D = r13;
        this.A02 = r5;
        this.A03 = r7;
        this.A06 = r12;
        this.A0A = r6;
        this.A04 = r10;
        this.A05 = r11;
        this.A07 = r14;
        this.A00 = r2;
    }

    public static void A02(Uri uri, C21060yb r7, File file) {
        try {
            C21050ya A0O = r7.A0O();
            C18740tg.A06(A0O);
            String[] A1R = C36441kJ.A1R();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(file.getAbsolutePath());
            A1R[0] = AnonymousClass000.A0t(A0u, '%');
            A0O.A01(uri, "_data LIKE ?", A1R);
        } catch (RuntimeException e) {
            C36321k7.A1M(file, "externaldirmigration/unscan failed for ", AnonymousClass000.A0u(), e);
        }
    }

    public static void A04(C133116Wv r6, File file, List list, Set set) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            boolean z = !C36441kJ.A0w(file, ".nomedia").exists();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (set.add(file2)) {
                        A04(r6, file2, list, set);
                    }
                } else if (z) {
                    list.add(file2);
                }
            }
        }
    }
}
