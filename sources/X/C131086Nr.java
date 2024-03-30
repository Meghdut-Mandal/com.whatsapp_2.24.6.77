package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.6Nr  reason: invalid class name and case insensitive filesystem */
public final class C131086Nr {
    public final C19630wG A00;
    public final AnonymousClass005 A01;

    public final void A02() {
        File A0w = C36441kJ.A0w(this.A00.A00.getDir("account_switching", 0), "checkpoint");
        if (A0w.exists()) {
            C36321k7.A1X("AccountSwitchingRecoveryManager/deleteCheckpointFile = ", AnonymousClass000.A0u(), A0w.delete());
            return;
        }
        Log.e("AccountSwitchingRecoveryManager/deleteCheckpointFile/checkpointFile not found");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x024d, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0250, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012f, code lost:
        if (r9.equals("moving") != false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x024c, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(boolean r21) {
        /*
            r20 = this;
            java.lang.String r6 = "staging"
            r19 = r20
            r0 = r19
            X.0wG r0 = r0.A00
            android.content.Context r2 = r0.A00
            java.lang.String r1 = "account_switching"
            r0 = 0
            java.io.File r1 = r2.getDir(r1, r0)
            java.lang.String r0 = "checkpoint"
            java.io.File r2 = X.C36441kJ.A0w(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpointFile found = "
            r1.append(r0)
            boolean r0 = r2.exists()
            r1.append(r0)
            java.lang.String r0 = " recoveryOnAppStartup: "
            r7 = r21
            X.C36321k7.A1X(r0, r1, r7)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0251
            java.lang.String r0 = "rws"
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            r4.<init>(r2, r0)
            long r1 = r4.length()     // Catch:{ all -> 0x024a }
            r12 = 1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpointFile is empty, nothing to recover"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x024a }
            r19.A02()     // Catch:{ all -> 0x024a }
            goto L_0x023f
        L_0x004f:
            long r8 = r4.length()     // Catch:{ all -> 0x024a }
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0243
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x024a }
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpoint file length: "
            r5.append(r2)     // Catch:{ all -> 0x024a }
            long r2 = r4.length()     // Catch:{ all -> 0x024a }
            X.C36351kA.A1S(r5, r2)     // Catch:{ all -> 0x024a }
            long r2 = r4.length()     // Catch:{ all -> 0x024a }
            long r2 = r2 - r12
        L_0x006e:
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x0081
            r4.seek(r2)     // Catch:{ all -> 0x024a }
            byte r8 = r4.readByte()     // Catch:{ all -> 0x024a }
            r5 = 10
            if (r8 == r5) goto L_0x0081
            r8 = -1
            long r2 = r2 + r8
            goto L_0x006e
        L_0x0081:
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0087
            long r0 = r2 + r12
        L_0x0087:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x024a }
            long r9 = r4.length()     // Catch:{ all -> 0x024a }
        L_0x008f:
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x00a4
            r4.seek(r0)     // Catch:{ all -> 0x024a }
            int r8 = r4.read()     // Catch:{ all -> 0x024a }
            r5 = 10
            if (r8 == r5) goto L_0x00a4
            char r5 = (char) r8     // Catch:{ all -> 0x024a }
            r11.append(r5)     // Catch:{ all -> 0x024a }
            long r0 = r0 + r12
            goto L_0x008f
        L_0x00a4:
            java.lang.String r11 = X.C36381kD.A0y(r11)     // Catch:{ all -> 0x024a }
            int r0 = r11.length()     // Catch:{ all -> 0x024a }
            r9 = 0
            if (r0 != 0) goto L_0x00b3
            A00(r4, r2)     // Catch:{ all -> 0x024a }
            goto L_0x004f
        L_0x00b3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpoint line: "
            X.C36321k7.A1Q(r0, r11, r1)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x024a }
            r15 = 0
            r5 = 6
            java.util.List r8 = X.AnonymousClass099.A0L(r11, r0, r9)     // Catch:{ all -> 0x024a }
            java.lang.String r9 = X.C36401kF.A0s(r8, r9)     // Catch:{ all -> 0x024a }
            int r10 = r9.hashCode()     // Catch:{ all -> 0x024a }
            r0 = -1068259250(0xffffffffc053a84e, float:-3.3071475)
            java.lang.String r1 = "moved"
            java.lang.String r13 = "moving"
            if (r10 == r0) goto L_0x012b
            r0 = 104087219(0x6343eb3, float:3.39003E-35)
            if (r10 == r0) goto L_0x0123
            r0 = 2038719204(0x798462e4, float:8.592362E34)
            if (r10 != r0) goto L_0x021c
            java.lang.String r0 = "accounts_backup_created"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x021c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/restoring accounts backup file, recoveryOnAppStartUp="
            X.C36321k7.A1X(r0, r1, r7)     // Catch:{ all -> 0x024a }
            r0 = r19
            X.005 r1 = r0.A01     // Catch:{ all -> 0x024a }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x024a }
            X.1Z0 r0 = (X.AnonymousClass1Z0) r0     // Catch:{ all -> 0x024a }
            boolean r0 = r0.A08()     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/retrying restoring accounts backup file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x024a }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x024a }
            X.1Z0 r0 = (X.AnonymousClass1Z0) r0     // Catch:{ all -> 0x024a }
            boolean r0 = r0.A08()     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to restore accounts backup file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x024a }
            if (r21 != 0) goto L_0x011e
            goto L_0x0220
        L_0x011e:
            A00(r4, r2)     // Catch:{ all -> 0x024a }
            goto L_0x021c
        L_0x0123:
            boolean r0 = r9.equals(r1)     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x0131
            goto L_0x021c
        L_0x012b:
            boolean r0 = r9.equals(r13)     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x021c
        L_0x0131:
            int r0 = r8.size()     // Catch:{ all -> 0x024a }
            boolean r0 = X.AnonymousClass000.A1S(r0, r5)
            X.C18740tg.A0B(r0)     // Catch:{ all -> 0x024a }
            java.lang.String r14 = X.C90474aD.A0i(r8)     // Catch:{ all -> 0x024a }
            r0 = 3
            java.lang.String r0 = X.C36401kF.A0s(r8, r0)     // Catch:{ all -> 0x024a }
            java.io.File r12 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x024a }
            r0 = 5
            java.lang.String r0 = X.C36401kF.A0s(r8, r0)     // Catch:{ all -> 0x024a }
            java.io.File r10 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x024a }
            java.io.File r5 = X.C36441kJ.A0w(r12, r14)     // Catch:{ all -> 0x024a }
            java.io.File r9 = X.C36441kJ.A0w(r10, r14)     // Catch:{ all -> 0x024a }
            boolean r0 = r9.exists()     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x0173
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/toDir: "
            X.C90464aC.A1A(r9, r0, r1)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = " doesn't exist"
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x024a }
            A00(r4, r2)     // Catch:{ all -> 0x024a }
            goto L_0x021c
        L_0x0173:
            java.lang.Object r0 = r8.get(r15)     // Catch:{ all -> 0x024a }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r13)     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x01f2
            java.lang.String r0 = X.C90514aH.A0w(r10)     // Catch:{ all -> 0x024a }
            boolean r0 = X.AnonymousClass099.A0O(r0, r6, r15)     // Catch:{ all -> 0x024a }
            java.lang.String r8 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to recover from MOVING case for "
            java.lang.String r13 = " is not moved"
            java.lang.String r1 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/record was moving but "
            java.lang.String r16 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/Skipping as "
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r9.exists()     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x01b2
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r1, r14)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = " was successfully moved from data dir"
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x024a }
            r16 = r2
            r18 = r7
            r13 = r10
            r14 = r9
            r15 = r4
            r11 = r12
            r12 = r5
            r10 = r19
            boolean r0 = r10.A01(r11, r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x021c
            if (r21 != 0) goto L_0x021c
            goto L_0x0226
        L_0x01b2:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r16)     // Catch:{ all -> 0x024a }
            X.C36321k7.A1Q(r11, r13, r0)     // Catch:{ all -> 0x024a }
            A00(r4, r2)     // Catch:{ all -> 0x024a }
            goto L_0x021c
        L_0x01bd:
            java.lang.String r0 = X.C90514aH.A0w(r12)     // Catch:{ all -> 0x024a }
            boolean r0 = X.AnonymousClass099.A0O(r0, r6, r15)     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x021c
            boolean r0 = r5.exists()     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x01ea
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r1, r14)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = " was successfully moved from staging"
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x024a }
            r16 = r2
            r18 = r7
            r13 = r10
            r14 = r9
            r15 = r4
            r11 = r12
            r12 = r5
            r10 = r19
            boolean r0 = r10.A01(r11, r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x021c
            if (r21 != 0) goto L_0x021c
            goto L_0x022e
        L_0x01ea:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r16)     // Catch:{ all -> 0x024a }
            X.C36321k7.A1Q(r11, r13, r0)     // Catch:{ all -> 0x024a }
            goto L_0x0219
        L_0x01f2:
            java.lang.Object r0 = r8.get(r15)     // Catch:{ all -> 0x024a }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x0210
            r16 = r2
            r18 = r7
            r13 = r10
            r14 = r9
            r15 = r4
            r11 = r12
            r12 = r5
            r10 = r19
            boolean r0 = r10.A01(r11, r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x021c
            if (r21 != 0) goto L_0x021c
            goto L_0x0236
        L_0x0210:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/invalid record: "
            X.C36321k7.A1P(r0, r11, r1)     // Catch:{ all -> 0x024a }
        L_0x0219:
            A00(r4, r2)     // Catch:{ all -> 0x024a }
        L_0x021c:
            r12 = 1
            goto L_0x004f
        L_0x0220:
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to restore accounts backup file, retrying on app startup"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x024a }
            goto L_0x023f
        L_0x0226:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x024a }
            X.C36321k7.A1J(r5, r8, r0)     // Catch:{ all -> 0x024a }
            goto L_0x023f
        L_0x022e:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x024a }
            X.C36321k7.A1J(r5, r8, r0)     // Catch:{ all -> 0x024a }
            goto L_0x023f
        L_0x0236:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to recover from MOVED case for "
            X.C36321k7.A1J(r5, r0, r1)     // Catch:{ all -> 0x024a }
        L_0x023f:
            r4.close()
            return
        L_0x0243:
            r4.close()
            r19.A02()
            return
        L_0x024a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x024c }
        L_0x024c:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x0251:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131086Nr.A03(boolean):void");
    }

    public C131086Nr(C19630wG r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static void A00(RandomAccessFile randomAccessFile, long j) {
        randomAccessFile.seek(j);
        randomAccessFile.setLength(randomAccessFile.getFilePointer());
    }

    private final boolean A01(File file, File file2, File file3, File file4, RandomAccessFile randomAccessFile, long j, boolean z) {
        File[] listFiles;
        if (!file.exists() && AnonymousClass099.A0O(C90514aH.A0w(file), "staging", false)) {
            boolean mkdirs = file.mkdirs();
            StringBuilder A0u = AnonymousClass000.A0u();
            C90464aC.A1A(file, "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/", A0u);
            C36321k7.A1X(" dirCreated: ", A0u, mkdirs);
            if (!mkdirs && !z) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                C36321k7.A1a(A0u2, C90514aH.A0x(file2, "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/failed to create ", A0u2));
                return false;
            }
        }
        if (file2.exists()) {
            boolean A002 = C14360lV.A00(file2);
            StringBuilder A0u3 = AnonymousClass000.A0u();
            C90464aC.A1A(file2, "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/fromDir: ", A0u3);
            C36321k7.A1X(" found. Deleting it: ", A0u3, A002);
        }
        boolean renameTo = file4.renameTo(file2);
        StringBuilder A0u4 = AnonymousClass000.A0u();
        C90464aC.A1A(file2, "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/fromDir: ", A0u4);
        C90464aC.A1A(file4, ", toDir: ", A0u4);
        C36321k7.A1X(":, moveDir:", A0u4, renameTo);
        if (!renameTo) {
            if (file2.exists()) {
                boolean A003 = C14360lV.A00(file2);
                StringBuilder A0u5 = AnonymousClass000.A0u();
                C90464aC.A1A(file2, "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/attempting again fromDir: ", A0u5);
                C36321k7.A1X(" found. Deleting it: ", A0u5, A003);
            }
            renameTo = file4.renameTo(file2);
            StringBuilder A0u6 = AnonymousClass000.A0u();
            C90464aC.A1A(file2, "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/attempting again fromDir: ", A0u6);
            C90464aC.A1A(file4, ", toDir: ", A0u6);
            C36321k7.A1X(":, moveDir:", A0u6, renameTo);
            if (!renameTo && !z) {
                C36321k7.A1J(file2, "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/failed to recover ", AnonymousClass000.A0u());
                if (file3.exists() && AnonymousClass099.A0O(C90514aH.A0w(file3), "staging", false) && ((listFiles = file3.listFiles()) == null || listFiles.length == 0)) {
                    boolean A004 = C14360lV.A00(file3);
                    StringBuilder A0u7 = AnonymousClass000.A0u();
                    C90464aC.A1A(file3, "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/toPath: ", A0u7);
                    C36321k7.A1X(" is empty. Deleting it:", A0u7, A004);
                }
                return renameTo;
            }
        }
        StringBuilder A0u8 = AnonymousClass000.A0u();
        A0u8.append("AccountSwitchingRecoveryManager/recoverFromMovedDirectories/recovered ");
        A0u8.append(file2);
        C36321k7.A1X(" successfully: ", A0u8, renameTo);
        A00(randomAccessFile, j);
        boolean A0042 = C14360lV.A00(file3);
        StringBuilder A0u72 = AnonymousClass000.A0u();
        C90464aC.A1A(file3, "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/toPath: ", A0u72);
        C36321k7.A1X(" is empty. Deleting it:", A0u72, A0042);
        return renameTo;
    }
}
