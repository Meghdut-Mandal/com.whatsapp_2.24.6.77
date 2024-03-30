package X;

import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.text.TextUtils;
import android.util.JsonWriter;
import com.whatsapp.Me;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.util.zip.ZipOutputStream;

/* renamed from: X.6F7  reason: invalid class name */
public class AnonymousClass6F7 {
    public final C19730wQ A00;
    public final AnonymousClass6FO A01;
    public final AnonymousClass6F6 A02;
    public final C19970wo A03;
    public final AnonymousClass6NF A04;
    public final C21570zS A05;
    public final SecureRandom A06;

    public void A00() {
        AnonymousClass6FO r1 = this.A01;
        C123895xG A012 = r1.A01();
        Log.i("ExportEncryptionManager/copyPrefetchedKeyToActiveKey");
        if (A012 != null) {
            C36341k9.A0x(C90464aC.A0C(r1.A01).putString("/export/enc/active/owner", A012.A01.getRawString()).putString("/export/enc/active/version", A012.A05).putString("/export/enc/active/account_hash", A012.A02).putString("/export/enc/active/server_salt", A012.A04).putLong("/export/enc/active/last_fetch_time", A012.A00), "/export/enc/active/seed", A012.A03);
            Log.i("ExportEncryptionManager/copiedPrefetchedKeyToActiveKey");
            return;
        }
        throw new C105015Cy(101, "Active encryption key info is missing.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r0 = new X.C1271667f();
        r3 = X.C023109s.A01;
        r0.A00 = r3;
        r2 = r0.A00();
        r0 = new X.C97384pE(com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker.class);
        r0.A03(r2);
        X.C90514aH.A0V(r4.A05).A07((X.C97404pG) r0.A00(), r3, "export-key-prefetch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r4 = this;
            X.0wQ r1 = r4.A00
            boolean r0 = r1.A0L()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "ExportEncryptionManager/maybeScheduleGenerateEncryptionKey(); skip scheduling, user in companion mode"
        L_0x000a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x000e:
            com.whatsapp.jid.PhoneUserJid r1 = X.C36441kJ.A0n(r1)
            if (r1 != 0) goto L_0x0017
            java.lang.String r0 = "ExportEncryptionManager/maybeScheduleGenerateEncryptionKey(); skip scheduling, no user logged in"
            goto L_0x000a
        L_0x0017:
            monitor-enter(r4)
            X.6FO r0 = r4.A01     // Catch:{ all -> 0x0057 }
            X.5xG r0 = r0.A01()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x002d
            boolean r0 = r4.A04(r1, r0)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "ExportEncryptionManager/maybeScheduleGenerateEncryptionKey(); skip scheduling, encryption key is already prefetched recently"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0057 }
            monitor-exit(r4)     // Catch:{ all -> 0x0057 }
            return
        L_0x002d:
            monitor-exit(r4)     // Catch:{ all -> 0x0057 }
            X.67f r0 = new X.67f
            r0.<init>()
            java.lang.Integer r3 = X.C023109s.A01
            r0.A00 = r3
            X.6Tb r2 = r0.A00()
            java.lang.Class<com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker> r1 = com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker.class
            X.4pE r0 = new X.4pE
            r0.<init>(r1)
            r0.A03(r2)
            X.5s0 r2 = r0.A00()
            X.4pG r2 = (X.C97404pG) r2
            X.0zS r0 = r4.A05
            X.6VR r1 = X.C90514aH.A0V(r0)
            java.lang.String r0 = "export-key-prefetch"
            r1.A07(r2, r3, r0)
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0057 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6F7.A01():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r4 = new byte[32];
        r3.A06.nextBytes(r4);
        r1 = X.C36441kJ.A13(r4);
        r11 = r3.A04;
        r12 = r11.A00;
        r13 = X.C36441kJ.A0n(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r13 == null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r6 = android.util.Base64.decode(r1, 2);
        r8 = X.C90484aE.A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r11.A01.A01(new X.C1497272n(r8, 16), r6, new byte[16], 2) == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass6NF.A00(r21, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r8.getCount() > 0) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        r1 = X.C36441kJ.A0n(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r1 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r1.equals(r13) == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        r4 = X.AnonymousClass001.A0I();
        r9 = X.C36371kC.A10(new java.util.HashMap(r11.A02.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        if (r9.hasNext() == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        r1 = X.AnonymousClass000.A11(r9);
        r5 = (X.AnonymousClass66K) r1.getKey();
        r8 = (X.C1261262q) r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (java.util.Arrays.equals(r8.A01, r6) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        r14 = r5.A00;
        r5 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c1, code lost:
        if (r5 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c4, code lost:
        r5 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c6, code lost:
        if (r14 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (r7 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        if (r5 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        r4.add(new X.C123895xG(r13, r14, android.util.Base64.encodeToString(r6, 2), android.util.Base64.encodeToString(r7, 2), android.util.Base64.encodeToString(r5, 2), java.lang.System.currentTimeMillis()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e6, code lost:
        r7 = java.util.Arrays.copyOf(r5, r5.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        java.util.Collections.sort(r4, X.AnonymousClass768.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        if (r4.isEmpty() != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f7, code lost:
        r6 = (X.C123895xG) X.C36441kJ.A12(r4);
        r2 = X.C36441kJ.A0n(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        if (r2 != null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0103, code lost:
        r0 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); user logged out while waiting for encryption key";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0108, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1 = r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010d, code lost:
        if (r1 == null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
        if (A04(r2, r1) == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0115, code lost:
        com.whatsapp.util.Log.i("ExportEncryptionManager/maybeGenerateEncryptionKey(); concurrent conflict, encryption key was prefetched recently");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011a, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011c, code lost:
        r1 = r6.A01;
        r1.getRawString();
        r9 = r6.A05;
        r8 = r6.A02;
        r7 = r6.A04;
        X.C36341k9.A0x(X.C90464aC.A0C(r0.A01).putString("/export/enc/prefetched/owner", r1.getRawString()).putString("/export/enc/prefetched/version", r9).putString("/export/enc/prefetched/account_hash", r8).putString("/export/enc/prefetched/server_salt", r7).putLong("/export/enc/prefetched/last_fetch_time", r6.A00), "/export/enc/prefetched/seed", r6.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0159, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0166, code lost:
        throw new X.C105015Cy(101, "Failed to create a key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016e, code lost:
        throw new X.AnonymousClass5R7(301, "User changed while waiting for encryption key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0176, code lost:
        throw new X.AnonymousClass5R7(301, "User was logged out while waiting for encryption key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017e, code lost:
        throw new X.C105015Cy(103, "Failed to create a key, timed out.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0187, code lost:
        throw new X.C105015Cy("Failed to create a key, interrupted.", (java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0191, code lost:
        throw new X.C105015Cy(102, "Not connected to server, cannot create keys.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0199, code lost:
        throw new X.AnonymousClass5R7(301, "Cannot create encryption key when user is not logged in.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.os.CancellationSignal r21) {
        /*
            r20 = this;
            r3 = r20
            X.0wQ r2 = r3.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.C36441kJ.A0n(r2)
            if (r4 != 0) goto L_0x0010
            java.lang.String r0 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); skipped key prefetching, no user is logged in"
        L_0x000c:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0010:
            java.lang.System.currentTimeMillis()
            monitor-enter(r3)
            X.6FO r0 = r3.A01     // Catch:{ all -> 0x019a }
            X.5xG r1 = r0.A01()     // Catch:{ all -> 0x019a }
            if (r1 == 0) goto L_0x003b
            boolean r1 = r3.A04(r4, r1)     // Catch:{ all -> 0x019a }
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); skipped key prefetching, key is already prefetched recently"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x019a }
            monitor-exit(r3)     // Catch:{ all -> 0x019a }
            goto L_0x0107
        L_0x002a:
            java.lang.String r1 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); reset prefetched key, a different user is now logged in or key is older"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x019a }
            r0.A04()     // Catch:{ all -> 0x019a }
            X.6NF r1 = r3.A04     // Catch:{ all -> 0x019a }
            X.1CZ r1 = r1.A02     // Catch:{ all -> 0x019a }
            java.util.Map r1 = r1.A00     // Catch:{ all -> 0x019a }
            r1.clear()     // Catch:{ all -> 0x019a }
        L_0x003b:
            monitor-exit(r3)     // Catch:{ all -> 0x019a }
            r1 = 32
            byte[] r4 = new byte[r1]
            java.security.SecureRandom r1 = r3.A06
            r1.nextBytes(r4)
            java.lang.String r1 = X.C36441kJ.A13(r4)
            X.6NF r11 = r3.A04
            X.0wQ r12 = r11.A00
            com.whatsapp.jid.PhoneUserJid r13 = X.C36441kJ.A0n(r12)
            r4 = 301(0x12d, float:4.22E-43)
            if (r13 == 0) goto L_0x0192
            r10 = 2
            byte[] r6 = android.util.Base64.decode(r1, r10)
            r1 = 16
            byte[] r9 = new byte[r1]
            java.util.concurrent.CountDownLatch r8 = X.C90484aE.A0u()
            X.1Ca r7 = r11.A01
            r5 = 16
            X.72n r1 = new X.72n
            r1.<init>(r8, r5)
            boolean r1 = r7.A01(r1, r6, r9, r10)
            if (r1 == 0) goto L_0x0188
            r5 = 103(0x67, float:1.44E-43)
            r1 = r21
            X.AnonymousClass6NF.A00(r1, r8)     // Catch:{ InterruptedException -> 0x017f }
            long r9 = r8.getCount()
            r7 = 0
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0177
            com.whatsapp.jid.PhoneUserJid r1 = X.C36441kJ.A0n(r12)
            if (r1 == 0) goto L_0x016f
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0167
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.1CZ r1 = r11.A02
            java.util.Map r5 = r1.A00
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r5)
            java.util.Iterator r9 = X.C36371kC.A10(r1)
        L_0x009f:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00ec
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r9)
            java.lang.Object r5 = r1.getKey()
            X.66K r5 = (X.AnonymousClass66K) r5
            java.lang.Object r8 = r1.getValue()
            X.62q r8 = (X.C1261262q) r8
            byte[] r1 = r8.A01
            boolean r1 = java.util.Arrays.equals(r1, r6)
            if (r1 == 0) goto L_0x009f
            java.lang.String r14 = r5.A00
            byte[] r5 = r5.A01
            if (r5 != 0) goto L_0x00e6
            r7 = 0
        L_0x00c4:
            byte[] r5 = r8.A02
            if (r14 == 0) goto L_0x009f
            if (r7 == 0) goto L_0x009f
            if (r5 == 0) goto L_0x009f
            r1 = 2
            java.lang.String r15 = android.util.Base64.encodeToString(r6, r1)
            java.lang.String r16 = android.util.Base64.encodeToString(r7, r1)
            java.lang.String r17 = android.util.Base64.encodeToString(r5, r1)
            long r18 = java.lang.System.currentTimeMillis()
            X.5xG r12 = new X.5xG
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r4.add(r12)
            goto L_0x009f
        L_0x00e6:
            int r1 = r5.length
            byte[] r7 = java.util.Arrays.copyOf(r5, r1)
            goto L_0x00c4
        L_0x00ec:
            X.768 r1 = X.AnonymousClass768.A00
            java.util.Collections.sort(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x015d
            java.lang.Object r6 = X.C36441kJ.A12(r4)
            X.5xG r6 = (X.C123895xG) r6
            com.whatsapp.jid.PhoneUserJid r2 = X.C36441kJ.A0n(r2)
            if (r2 != 0) goto L_0x0108
            java.lang.String r0 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); user logged out while waiting for encryption key"
            goto L_0x000c
        L_0x0107:
            return
        L_0x0108:
            monitor-enter(r3)
            X.5xG r1 = r0.A01()     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x011c
            boolean r1 = r3.A04(r2, r1)     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x011c
            java.lang.String r0 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); concurrent conflict, encryption key was prefetched recently"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015a }
        L_0x011a:
            monitor-exit(r3)     // Catch:{ all -> 0x015a }
            goto L_0x0159
        L_0x011c:
            com.whatsapp.jid.UserJid r1 = r6.A01     // Catch:{ all -> 0x015a }
            r1.getRawString()     // Catch:{ all -> 0x015a }
            java.lang.String r9 = r6.A05     // Catch:{ all -> 0x015a }
            java.lang.String r8 = r6.A02     // Catch:{ all -> 0x015a }
            java.lang.String r7 = r6.A04     // Catch:{ all -> 0x015a }
            long r4 = r6.A00     // Catch:{ all -> 0x015a }
            X.005 r0 = r0.A01     // Catch:{ all -> 0x015a }
            android.content.SharedPreferences$Editor r2 = X.C90464aC.A0C(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "/export/enc/prefetched/owner"
            android.content.SharedPreferences$Editor r1 = r2.putString(r0, r1)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "/export/enc/prefetched/version"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r9)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "/export/enc/prefetched/account_hash"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r8)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "/export/enc/prefetched/server_salt"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "/export/enc/prefetched/last_fetch_time"
            android.content.SharedPreferences$Editor r2 = r1.putLong(r0, r4)     // Catch:{ all -> 0x015a }
            java.lang.String r1 = r6.A03     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "/export/enc/prefetched/seed"
            X.C36341k9.A0x(r2, r0, r1)     // Catch:{ all -> 0x015a }
            goto L_0x011a
        L_0x0159:
            return
        L_0x015a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x015a }
            throw r0
        L_0x015d:
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = "Failed to create a key."
            X.5Cy r0 = new X.5Cy
            r0.<init>((int) r2, (java.lang.String) r1)
            throw r0
        L_0x0167:
            java.lang.String r1 = "User changed while waiting for encryption key."
            X.5R7 r0 = new X.5R7
            r0.<init>(r4, r1)
            throw r0
        L_0x016f:
            java.lang.String r1 = "User was logged out while waiting for encryption key."
            X.5R7 r0 = new X.5R7
            r0.<init>(r4, r1)
            throw r0
        L_0x0177:
            java.lang.String r1 = "Failed to create a key, timed out."
            X.5Cy r0 = new X.5Cy
            r0.<init>((int) r5, (java.lang.String) r1)
            throw r0
        L_0x017f:
            r2 = move-exception
            java.lang.String r1 = "Failed to create a key, interrupted."
            X.5Cy r0 = new X.5Cy
            r0.<init>((java.lang.String) r1, (java.lang.Throwable) r2)
            throw r0
        L_0x0188:
            r2 = 102(0x66, float:1.43E-43)
            java.lang.String r1 = "Not connected to server, cannot create keys."
            X.5Cy r0 = new X.5Cy
            r0.<init>((int) r2, (java.lang.String) r1)
            throw r0
        L_0x0192:
            java.lang.String r1 = "Cannot create encryption key when user is not logged in."
            X.5R7 r0 = new X.5R7
            r0.<init>(r4, r1)
            throw r0
        L_0x019a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x019a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6F7.A02(android.os.CancellationSignal):void");
    }

    public void A03(CancellationSignal cancellationSignal, ZipOutputStream zipOutputStream, boolean z) {
        String str;
        Throwable th;
        int i;
        C123895xG A002 = this.A01.A00();
        if (A002 != null) {
            Log.i("ExportEncryptionManager/generateEncFileMetadata(); generating metadata with:");
            C19730wQ r1 = this.A00;
            r1.A0G();
            Me me = r1.A00;
            String str2 = null;
            if (me != null) {
                str = me.jabber_id;
            } else {
                str = null;
            }
            Me A052 = r1.A05();
            if (A052 != null) {
                str2 = A052.jabber_id;
            }
            Log.i("ExportEncryptionManager/generateEncFileMetadata();    current user:");
            C36321k7.A1Q("ExportEncryptionManager/generateEncFileMetadata();       current user: ", str, AnonymousClass000.A0u());
            C36321k7.A1Q("ExportEncryptionManager/generateEncFileMetadata();       old user: ", str2, AnonymousClass000.A0u());
            Log.i("ExportEncryptionManager/generateEncFileMetadata();    key info:");
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ExportEncryptionManager/generateEncFileMetadata();       user         = ");
            UserJid userJid = A002.A01;
            C36321k7.A1a(A0u, userJid.getRawString());
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("ExportEncryptionManager/generateEncFileMetadata();       version      = ");
            String str3 = A002.A05;
            C36321k7.A1a(A0u2, str3);
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("ExportEncryptionManager/generateEncFileMetadata();       account_hash = ");
            String str4 = A002.A02;
            C36321k7.A1a(A0u3, str4);
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append("ExportEncryptionManager/generateEncFileMetadata();       server_salt  = ");
            String str5 = A002.A04;
            C36321k7.A1a(A0u4, str5);
            StringBuilder A0u5 = AnonymousClass000.A0u();
            A0u5.append("ExportEncryptionManager/generateEncFileMetadata();       last_fetched = ");
            C36351kA.A1S(A0u5, A002.A00);
            String A0l = C36361kB.A0l();
            String A003 = C130916My.A00(userJid);
            Log.i("ExportEncryptionManager/generateEncFileMetadata();   data info: ");
            C36321k7.A1Q("ExportEncryptionManager/generateEncFileMetadata();       data_id      = ", A0l, AnonymousClass000.A0u());
            C36321k7.A1Q("ExportEncryptionManager/generateEncFileMetadata();       source_id    = ", A003, AnonymousClass000.A0u());
            try {
                C1495271o r3 = new C1495271o(AnonymousClass001.A0J(), zipOutputStream);
                try {
                    C130916My r2 = new C130916My(new C1262162z(str3, str4, str5), "AES-GCM-v1", A0l, A003);
                    JsonWriter jsonWriter = r3.A01;
                    jsonWriter.name("data_id");
                    jsonWriter.value(r2.A01);
                    String str6 = r2.A03;
                    if (str6 != null) {
                        jsonWriter.name("source_id");
                        jsonWriter.value(str6);
                    }
                    jsonWriter.name("scheme");
                    jsonWriter.value("AES-GCM-v1");
                    jsonWriter.name("key_id");
                    jsonWriter.beginObject();
                    jsonWriter.name("version");
                    C1262162z r22 = r2.A00;
                    jsonWriter.value((long) Integer.parseInt(r22.A02));
                    jsonWriter.name("account_hash");
                    jsonWriter.value(r22.A00);
                    jsonWriter.name("server_salt");
                    jsonWriter.value(r22.A01);
                    jsonWriter.endObject();
                    if (z) {
                        jsonWriter.name("files");
                        jsonWriter.beginArray();
                        int i2 = 0;
                        do {
                            try {
                                cancellationSignal.throwIfCanceled();
                                AnonymousClass1M0 A012 = this.A02.A00.A00.A01();
                                try {
                                    C224114e r9 = A012.A02;
                                    String[] A1S = C36441kJ.A1S();
                                    C36401kF.A1T(A1S, 0, (long) i2);
                                    C36401kF.A1T(A1S, 1, (long) 1000);
                                    C81803xe r5 = new C81803xe(r9.A09("SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f ORDER BY   f.required DESC , f._id ASC  LIMIT ?, ?", "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_ALL_PAGED", A1S), C145126tO.A00);
                                    A012.close();
                                    i = 0;
                                    while (r5.hasNext()) {
                                        try {
                                            cancellationSignal.throwIfCanceled();
                                            C123905xH r12 = (C123905xH) r5.next();
                                            String str7 = r12.A03;
                                            if (!TextUtils.isEmpty(str7)) {
                                                String str8 = r12.A04;
                                                jsonWriter.beginObject();
                                                jsonWriter.name("path");
                                                jsonWriter.value(str8);
                                                jsonWriter.name("iv");
                                                jsonWriter.value(str7);
                                                jsonWriter.endObject();
                                            }
                                            i++;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    r5.close();
                                    i2 += 1000;
                                } catch (Throwable th3) {
                                    th = th3;
                                    A012.close();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                jsonWriter.endArray();
                                throw th4;
                            }
                        } while (i > 0);
                        jsonWriter.endArray();
                    }
                    r3.close();
                } catch (Throwable th5) {
                    r3.close();
                    throw th5;
                }
            } catch (OperationCanceledException e) {
                throw e;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
        } else {
            throw new C105015Cy(101, "Active encryption key info is missing.");
        }
    }

    public AnonymousClass6F7(C19730wQ r1, C19970wo r2, AnonymousClass6NF r3, AnonymousClass6FO r4, AnonymousClass6F6 r5, C21570zS r6, SecureRandom secureRandom) {
        this.A03 = r2;
        this.A00 = r1;
        this.A01 = r4;
        this.A05 = r6;
        this.A06 = secureRandom;
        this.A04 = r3;
        this.A02 = r5;
    }

    public boolean A04(UserJid userJid, C123895xG r9) {
        long abs = Math.abs(System.currentTimeMillis() - r9.A00);
        boolean A1P = AnonymousClass000.A1P(userJid.equals(r9.A01) ? 1 : 0);
        boolean A1P2 = C36431kI.A1P((abs > 604800000 ? 1 : (abs == 604800000 ? 0 : -1)));
        if (!A1P || !A1P2) {
            return false;
        }
        return true;
    }
}
