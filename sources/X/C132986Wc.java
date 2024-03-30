package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.6Wc  reason: invalid class name and case insensitive filesystem */
public class C132986Wc {
    public static final int A0E = 1000;
    public static final int A0F = 131072;
    public static final String A0G = "import/complete/all";
    public static final String A0H = "import/complete/enc_metadata";
    public static final String A0I = "import/complete/file_list";
    public static final String A0J = "import/complete/files";
    public static final String A0K = "import/metadata/data_id";
    public static final String A0L = "import/metadata/key";
    public static final String A0M = "import/metadata/key-jid";
    public static final String A0N = "import/metadata/key/account_hash";
    public static final String A0O = "import/metadata/key/proto_version";
    public static final String A0P = "import/metadata/key/server_salt";
    public static final String A0Q = "import/metadata/scheme";
    public static final String A0R = "import/metadata/source_id";
    public static final String A0S = "migration/prefetcher";
    public static final String A0T = "xpm/file-prefetcher";
    public final C19700wN A00;
    public final C19730wQ A01;
    public final C19630wG A02;
    public final AnonymousClass6FI A03;
    public final AnonymousClass5FV A04;
    public final C1270366r A05;
    public final C128596Cw A06;
    public final AnonymousClass613 A07;
    public final AnonymousClass6JO A08;
    public final AnonymousClass6NF A09;
    public final AnonymousClass614 A0A;
    public final AnonymousClass6T9 A0B;
    public final AnonymousClass005 A0C;
    public final AtomicBoolean A0D = C36431kI.A1H();

    private OutputStream A00(OutputStream outputStream, String str, String str2) {
        if (str2 == null) {
            return outputStream;
        }
        String A002 = this.A06.A00(A0L);
        if (A002 != null) {
            byte[] decode = Base64.decode(A002, 2);
            byte[] decode2 = Base64.decode(str2, 2);
            try {
                Cipher A19 = C90514aH.A19();
                A19.init(2, C90494aF.A0m(decode), new IvParameterSpec(decode2));
                return new CipherOutputStream(outputStream, A19);
            } catch (GeneralSecurityException e) {
                throw new AnonymousClass5R7(AnonymousClass000.A0p("Failed to decrypt: ", str, AnonymousClass000.A0u()), e, 105);
            }
        } else {
            throw C90524aI.A0X("Cannot create decryption stream due to a missing key.");
        }
    }

    private void A01() {
        A0I("migration/messages_export.zip");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014e, code lost:
        if (r2 == null) goto L_0x0162;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(android.os.CancellationSignal r23, byte[] r24) {
        /*
            r22 = this;
            r9 = r22
            X.613 r0 = r9.A07
            X.66r r0 = r0.A00
            X.1M0 r4 = r0.A00()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0194 }
            java.lang.String r2 = "SELECT COUNT(*) as count FROM prefetched_files"
            r1 = 0
            java.lang.String r0 = "XPM_FILE_PREFETCHER_FILE_COUNT"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0194 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0188 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "count"
            int r3 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x0188 }
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            r2.close()     // Catch:{ all -> 0x0194 }
            r4.close()
            X.613 r0 = r9.A07
            int r2 = r0.A00()
            int r4 = r3 - r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); pending="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", moved="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", total="
            X.C36321k7.A1T(r0, r1, r3)
            X.6FI r0 = r9.A03     // Catch:{ OperationCanceledException -> 0x016d }
            X.71p r15 = r0.A02()     // Catch:{ OperationCanceledException -> 0x016d }
            X.613 r0 = r9.A07     // Catch:{ all -> 0x0163 }
            r1 = 1000(0x3e8, float:1.401E-42)
            X.66r r0 = r0.A00     // Catch:{ all -> 0x0163 }
            X.1M0 r8 = r0.A00()     // Catch:{ all -> 0x0163 }
            X.14e r7 = r8.A02     // Catch:{ all -> 0x0159 }
            java.lang.String r6 = "SELECT   file._id, file.remote_file_path, file.file_size, file.required,  enc.enc_iv FROM prefetched_files AS file LEFT JOIN encrypted_files AS enc ON file.remote_file_path =   enc.remote_file_path WHERE file.prefetched = 0 ORDER BY   file.required DESC , file._id ASC  LIMIT ?"
            java.lang.String[] r5 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0159 }
            r2 = 0
            long r0 = (long) r1     // Catch:{ all -> 0x0159 }
            X.C36401kF.A1T(r5, r2, r0)     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "XPM_FILE_PREFETCHER_PENDING"
            android.database.Cursor r2 = r7.A09(r6, r0, r5)     // Catch:{ all -> 0x0159 }
            r8.close()     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "remote_file_path"
            int r8 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "enc_iv"
            int r7 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "required"
            int r6 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014d }
            X.5FV r0 = r9.A04     // Catch:{ all -> 0x014d }
            java.util.Iterator r5 = X.C36361kB.A0s(r0)     // Catch:{ all -> 0x014d }
        L_0x0088:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x014d }
            X.5mN r0 = (X.C117505mN) r0     // Catch:{ all -> 0x014d }
            X.6Sx r1 = r0.A00     // Catch:{ all -> 0x014d }
            r0 = 0
            r1.A01(r0, r4, r3)     // Catch:{ all -> 0x014d }
            goto L_0x0088
        L_0x009b:
            r14 = 0
        L_0x009c:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0146
            r5 = r23
            r5.throwIfCanceled()     // Catch:{ all -> 0x014d }
            java.lang.String r11 = r2.getString(r8)     // Catch:{ all -> 0x014d }
            java.lang.String r1 = r2.getString(r7)     // Catch:{ all -> 0x014d }
            int r0 = r2.getInt(r6)     // Catch:{ all -> 0x014d }
            boolean r13 = X.AnonymousClass000.A1P(r0)
            r0 = r24
            r9.A0H(r5, r11, r1, r0)     // Catch:{ OperationCanceledException -> 0x0144, all -> 0x00c6 }
            int r4 = r4 + 1
            X.6JO r1 = r9.A08     // Catch:{ OperationCanceledException -> 0x0144, all -> 0x00c6 }
            java.lang.String r0 = "prefetched/file/success"
            X.AnonymousClass6JO.A01(r1, r0)     // Catch:{ OperationCanceledException -> 0x0144, all -> 0x00c6 }
            goto L_0x0117
        L_0x00c6:
            r12 = move-exception
            int r14 = r14 + 1
            X.6JO r1 = r9.A08     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "prefetched/file/failed"
            X.AnonymousClass6JO.A01(r1, r0)     // Catch:{ all -> 0x014d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); failed to import file "
            X.C90464aC.A1L(r0, r11, r1, r12)     // Catch:{ all -> 0x014d }
            X.0wN r10 = r9.A00     // Catch:{ all -> 0x014d }
            java.lang.String r5 = "xpm-file-prefetcher-import-failed"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r11)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = ", "
            java.lang.String r0 = X.AnonymousClass000.A0l(r12, r0, r1)     // Catch:{ all -> 0x0142 }
            r10.A0D(r5, r0, r12)     // Catch:{ all -> 0x0142 }
            A03(r11, r12)     // Catch:{ all -> 0x0142 }
            if (r13 != 0) goto L_0x013c
            X.613 r0 = r9.A07     // Catch:{ all -> 0x0142 }
            X.66r r0 = r0.A00     // Catch:{ all -> 0x0142 }
            X.1M0 r5 = r0.A01()     // Catch:{ all -> 0x0142 }
            android.content.ContentValues r10 = X.C36441kJ.A0E()     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = "prefetched"
            r0 = -1
            X.C36341k9.A0o(r10, r1, r0)     // Catch:{ all -> 0x0132 }
            X.14e r0 = r5.A02     // Catch:{ all -> 0x0132 }
            java.lang.String r18 = "prefetched_files"
            java.lang.String r19 = "remote_file_path = ?"
            java.lang.String[] r21 = X.C90474aD.A1b(r11)     // Catch:{ all -> 0x0132 }
            java.lang.String r20 = "XPM_FILE_PREFETCHER_MARK_FILE_FAILED"
            r16 = r0
            r17 = r10
            r16.A01(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0132 }
            r5.close()     // Catch:{ all -> 0x0142 }
        L_0x0117:
            X.5FV r0 = r9.A04     // Catch:{ all -> 0x014d }
            int r10 = r14 + r4
            java.util.Iterator r5 = X.C36361kB.A0s(r0)     // Catch:{ all -> 0x014d }
        L_0x011f:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x014d }
            X.5mN r0 = (X.C117505mN) r0     // Catch:{ all -> 0x014d }
            X.6Sx r1 = r0.A00     // Catch:{ all -> 0x014d }
            r0 = 0
            r1.A01(r0, r10, r3)     // Catch:{ all -> 0x014d }
            goto L_0x011f
        L_0x0132:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0137 }
            goto L_0x013b
        L_0x0137:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0142 }
        L_0x013b:
            throw r1     // Catch:{ all -> 0x0142 }
        L_0x013c:
            X.5R7 r0 = new X.5R7     // Catch:{ all -> 0x0142 }
            r0.<init>(r12)     // Catch:{ all -> 0x0142 }
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r1 = move-exception
            goto L_0x0150
        L_0x0144:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x014d }
        L_0x0146:
            r2.close()     // Catch:{ all -> 0x0163 }
            r15.close()     // Catch:{ OperationCanceledException -> 0x016d }
            return
        L_0x014d:
            r1 = move-exception
            if (r2 == 0) goto L_0x0162
        L_0x0150:
            r2.close()     // Catch:{ all -> 0x0154 }
            goto L_0x0162
        L_0x0154:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0163 }
            goto L_0x0162
        L_0x0159:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x015e }
            goto L_0x0162
        L_0x015e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0163 }
        L_0x0162:
            throw r1     // Catch:{ all -> 0x0163 }
        L_0x0163:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0168 }
            goto L_0x016c
        L_0x0168:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x016d }
        L_0x016c:
            throw r1     // Catch:{ OperationCanceledException -> 0x016d }
        L_0x016d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); cancelled after "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " has been imported."
            X.C36321k7.A1a(r1, r0)
            throw r2
        L_0x0188:
            r1 = move-exception
            if (r2 == 0) goto L_0x0193
            r2.close()     // Catch:{ all -> 0x018f }
            goto L_0x0193
        L_0x018f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0194 }
        L_0x0193:
            throw r1     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0199 }
            throw r1
        L_0x0199:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132986Wc.A02(android.os.CancellationSignal, byte[]):void");
    }

    public File A04() {
        return C36441kJ.A0w(C90514aH.A0j(this.A02), A0S);
    }

    public File A06(String str) {
        Cursor A092;
        FileNotFoundException fileNotFoundException;
        AnonymousClass613 r0 = this.A07;
        C18740tg.A06(str);
        AnonymousClass1M0 A002 = r0.A00.A00();
        try {
            boolean z = true;
            A092 = A002.A02.A09("SELECT prefetched_file_path, prefetched FROM prefetched_files WHERE remote_file_path = ?", "XPM_FILE_PREFETCHER_GET_PREFETCHED_PATH", new String[]{str});
            if (!A092.moveToFirst()) {
                fileNotFoundException = C90524aI.A0V(AnonymousClass000.A0p("Unknown remote file: ", str, AnonymousClass000.A0u()));
            } else if (A092.getCount() <= 1) {
                int columnIndexOrThrow = A092.getColumnIndexOrThrow("prefetched");
                int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("prefetched_file_path");
                long j = A092.getLong(columnIndexOrThrow);
                boolean A1Q = AnonymousClass000.A1Q((j > -1 ? 1 : (j == -1 ? 0 : -1)));
                if (j != 1) {
                    z = false;
                }
                String string = A092.getString(columnIndexOrThrow2);
                if (!z || TextUtils.isEmpty(string)) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("File was not prefetched: ");
                    A0u.append(str);
                    fileNotFoundException = C90524aI.A0V(C36371kC.A0z(", prefetch failed: ", A0u, A1Q));
                } else {
                    File A0S2 = C90524aI.A0S(string);
                    A092.close();
                    A002.close();
                    if (A0S2.exists()) {
                        return A0S2;
                    }
                    throw C90524aI.A0V(AnonymousClass000.A0p("Not found in file prefetcher sandbox: ", str, AnonymousClass000.A0u()));
                }
            } else {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Multiple prefetched files match: ");
                fileNotFoundException = C90524aI.A0V(C36381kD.A10(A0u2, A092.getCount()));
            }
            throw fileNotFoundException;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A07() {
        this.A06.A02(A0G);
    }

    public void A08() {
        this.A0D.get();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A09() {
        /*
            r6 = this;
            X.6Cw r5 = r6.A06
            monitor-enter(r5)
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x0050 }
            X.613 r0 = r5.A01     // Catch:{ all -> 0x0050 }
            X.66r r0 = r0.A00     // Catch:{ all -> 0x0050 }
            X.1M0 r4 = r0.A01()     // Catch:{ all -> 0x0050 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "properties"
            java.lang.String r0 = "XPM_DELETE_ALL_PROPERTIES"
            r1 = 0
            r3.A03(r2, r1, r0, r1)     // Catch:{ all -> 0x0046 }
            r4.close()     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)
            X.66r r2 = r6.A05
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0043 }
            X.54b r0 = r2.A00     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0029
            r0.close()     // Catch:{ all -> 0x0040 }
            r2.A00 = r1     // Catch:{ all -> 0x0040 }
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
            android.content.Context r1 = r2.A01     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "migration_prefetcher.db"
            r1.deleteDatabase(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "FilePrefetcher/removeDatabase/deleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0043 }
            monitor-exit(r2)
            java.io.File r1 = r6.A04()
            r0 = 0
            X.AnonymousClass6YY.A0H(r1, r0)
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0046:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0050 }
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132986Wc.A09():void");
    }

    public void A0A(CancellationSignal cancellationSignal) {
        String str;
        Log.i("xpm/file-prefetcher/importEncryptionKey(); ");
        PhoneUserJid A0n = C36441kJ.A0n(this.A01);
        if (A0n != null) {
            String rawString = A0n.getRawString();
            String A002 = this.A06.A00(A0M);
            if (!rawString.equals(A002)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("xpm/file-prefetcher/importEncryptionKey(); key was cached for a different jid, removing (old jid: ");
                A0u.append(A002);
                C36321k7.A1a(A0u, ") ");
                this.A09.A02.A00.clear();
                this.A06.A01(A0M, (String) null);
                this.A06.A01(A0L, (String) null);
            }
            if (this.A06.A00(A0L) != null) {
                str = "xpm/file-prefetcher/importEncryptionKey(); encryption key has already been fetched from the server, skipping.";
            } else {
                String A003 = this.A06.A00(A0O);
                String A004 = this.A06.A00(A0N);
                String A005 = this.A06.A00(A0P);
                if (A003 == null || A004 == null || A005 == null) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C36321k7.A1O("Missing key identifier: version=", A003, ", account_hash=", A004, A0u2);
                    throw new AnonymousClass5R6(AnonymousClass000.A0p(", server_salt=", A005, A0u2));
                }
                StringBuilder A0u3 = AnonymousClass000.A0u();
                C36321k7.A1O("xpm/file-prefetcher/importEncryptionKey(); key, version=", A003, ", account_hash=", A004, A0u3);
                C36321k7.A1Q(", server_salt=", A005, A0u3);
                C123895xG A012 = this.A09.A01(cancellationSignal, A003, A004, A005);
                this.A06.A01(A0L, A012.A03);
                this.A06.A01(A0M, A012.A01.getRawString());
                str = "xpm/file-prefetcher/importEncryptionKey(); encryption key imported successfully";
            }
            Log.i(str);
            return;
        }
        throw new AnonymousClass5R7(301, "Cannot identify current logged in user.");
    }

    public void A0B(CancellationSignal cancellationSignal) {
        if (this.A06.A02(A0J)) {
            Log.i("xpm/file-prefetcher/importAllFiles(); file were already imported, skipping.");
            return;
        }
        byte[] bArr = new byte[A0F];
        while (this.A07.A00() > 0) {
            cancellationSignal.throwIfCanceled();
            A02(cancellationSignal, bArr);
        }
        this.A06.A01(A0J, Boolean.toString(true));
    }

    public void A0C(CancellationSignal cancellationSignal) {
        AnonymousClass5R7 th;
        Throwable th2;
        AnonymousClass5R7 r1;
        ZipInputStream zipInputStream;
        ZipEntry nextEntry;
        AnonymousClass1M0 A012;
        Log.i("xpm/file-prefetcher/importEncryptionMetadata(); ");
        PhoneUserJid A0n = C36441kJ.A0n(this.A01);
        if (A0n != null) {
            String A002 = C130916My.A00(A0n);
            C1495371p A022 = this.A03.A02();
            try {
                AnonymousClass1M0 A013 = this.A07.A00.A01();
                try {
                    C1495671s B1k = A013.B1k();
                    try {
                        int i = 0;
                        if (this.A06.A02(A0H)) {
                            Log.i("xpm/file-prefetcher/importEncryptionMetadata(); encryption metadata is already imported, skipping.");
                            B1k.close();
                            A013.close();
                            A022.close();
                            return;
                        } else if (A0J()) {
                            ParcelFileDescriptor A003 = this.A03.A00("migration/enc.zip");
                            try {
                                FileInputStream fileInputStream = new FileInputStream(A003.getFileDescriptor());
                                try {
                                    C130916My A004 = this.A0A.A00(fileInputStream);
                                    String str = A004.A03;
                                    if (str == null || str.equals(A002)) {
                                        String str2 = A004.A02;
                                        if (str2.equals("AES-GCM-v1")) {
                                            this.A06.A01(A0Q, str2);
                                            this.A06.A01(A0K, A004.A01);
                                            this.A06.A01(A0R, str);
                                            C128596Cw r2 = this.A06;
                                            C1262162z r4 = A004.A00;
                                            r2.A01(A0O, r4.A02);
                                            this.A06.A01(A0N, r4.A00);
                                            this.A06.A01(A0P, r4.A01);
                                            fileInputStream.close();
                                            A003.close();
                                            A003 = this.A03.A00("migration/enc.zip");
                                            FileInputStream fileInputStream2 = new FileInputStream(A003.getFileDescriptor());
                                            try {
                                                AnonymousClass614 r3 = this.A0A;
                                                zipInputStream = new ZipInputStream(fileInputStream2);
                                                do {
                                                    nextEntry = zipInputStream.getNextEntry();
                                                    if (nextEntry == null) {
                                                        throw C90524aI.A0V("metadata.json was not found in zip file.");
                                                    }
                                                } while (!"metadata.json".equals(nextEntry.getName()));
                                                AnonymousClass5D2 r6 = new AnonymousClass5D2(C90474aD.A0K(zipInputStream), r3.A00, zipInputStream);
                                                while (r6.A01()) {
                                                    try {
                                                        cancellationSignal.throwIfCanceled();
                                                        AnonymousClass624 r32 = (AnonymousClass624) r6.A00();
                                                        AnonymousClass613 r22 = this.A07;
                                                        ContentValues A0E2 = C36441kJ.A0E();
                                                        A0E2.put("remote_file_path", r32.A01);
                                                        A0E2.put("enc_iv", r32.A00);
                                                        A012 = r22.A00.A01();
                                                        A012.A02.A04("encrypted_files", "XPM_FILE_PREFETCHER_INSERT_ENC_INFO", A0E2);
                                                        A012.close();
                                                        i++;
                                                    } catch (Throwable th3) {
                                                        r6.close();
                                                        throw th3;
                                                    }
                                                }
                                                r6.close();
                                                fileInputStream2.close();
                                                A003.close();
                                                this.A06.A01(A0H, Boolean.toString(true));
                                                B1k.A00();
                                                B1k.close();
                                                A013.close();
                                                A022.close();
                                                StringBuilder A0u = AnonymousClass000.A0u();
                                                A0u.append("xpm/file-prefetcher/importEncryptionMetadata(); imported ");
                                                A0u.append(i);
                                                C36321k7.A1a(A0u, " encrypted file metadata entries.");
                                                return;
                                            } catch (Throwable th4) {
                                                th2 = th4;
                                                fileInputStream2.close();
                                                throw th2;
                                            }
                                        } else {
                                            r1 = new AnonymousClass5R7(100, AnonymousClass000.A0p("Unsupported: ", str2, AnonymousClass000.A0u()));
                                        }
                                    } else {
                                        StringBuilder A0u2 = AnonymousClass000.A0u();
                                        A0u2.append("Source id mismatch: current=");
                                        A0u2.append(str);
                                        r1 = new AnonymousClass5R7(106, AnonymousClass000.A0p(", expected=", A002, A0u2));
                                    }
                                    throw r1;
                                } catch (Throwable th5) {
                                    th2.addSuppressed(th5);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                if (A003 != null) {
                                    try {
                                        A003.close();
                                    } catch (Throwable th7) {
                                        th.addSuppressed(th7);
                                    }
                                }
                            }
                        } else {
                            th = new AnonymousClass5R7(200, "Missing encryption metadata: migration/enc.zip");
                            throw th;
                        }
                    } catch (Throwable th8) {
                        B1k.close();
                        throw th8;
                    }
                } catch (Throwable th9) {
                    A013.close();
                    throw th9;
                }
            } catch (Throwable th10) {
                try {
                    A022.close();
                    throw th10;
                } catch (Throwable th11) {
                    th10.addSuppressed(th11);
                    throw th10;
                }
            }
        } else {
            throw new AnonymousClass5R7(301, "Cannot identify current logged in user.");
        }
        throw th;
    }

    public void A0D(CancellationSignal cancellationSignal) {
        AnonymousClass5KJ A012;
        AnonymousClass1M0 A013;
        Log.i("xpm/file-prefetcher/importFileList(); ");
        AnonymousClass1M0 A014 = this.A07.A00.A01();
        try {
            C1495671s B1k = A014.B1k();
            try {
                if (this.A06.A02(A0I)) {
                    Log.i("xpm/file-prefetcher/importFileList(); file list was already imported, skipping.");
                    B1k.close();
                    A014.close();
                    return;
                }
                AnonymousClass6FI r4 = this.A03;
                try {
                    A012 = r4.A01();
                    ParcelFileDescriptor BBq = ((IAppDataReaderService) A012.A00()).BBq();
                    AnonymousClass5D1 r42 = new AnonymousClass5D1(BBq, new JsonReader(new BufferedReader(new FileReader(BBq.getFileDescriptor()))), (AnonymousClass6T9) r4.A05.A00.A00.A5O.get());
                    A012.close();
                    int i = 0;
                    while (r42.A01()) {
                        try {
                            cancellationSignal.throwIfCanceled();
                            AnonymousClass6AR r1 = (AnonymousClass6AR) r42.A00();
                            AnonymousClass613 r2 = this.A07;
                            ContentValues A0E2 = C36441kJ.A0E();
                            String str = r1.A01;
                            A0E2.put("remote_file_path", str);
                            A0E2.put("file_size", Long.valueOf(r1.A00));
                            A0E2.putNull("prefetched_file_path");
                            A0E2.put("required", 0);
                            A0E2.put("prefetched", 0);
                            A013 = r2.A00.A01();
                            long A042 = A013.A02.A04("prefetched_files", "XPM_FILE_PREFETCHER_INSERT_FILE", A0E2);
                            A013.close();
                            if (A042 < 0) {
                                C36321k7.A1P("xpm/file-prefetcher/importFileList(); failed to import metadata for ", str, AnonymousClass000.A0u());
                                this.A00.A0E("xpm-file-prefetcher-cannot-add-metadata", str, false);
                            } else {
                                i++;
                            }
                        } catch (Throwable th) {
                            r42.close();
                            throw th;
                        }
                    }
                    r42.close();
                    this.A06.A01(A0I, Boolean.toString(true));
                    B1k.A00();
                    B1k.close();
                    A014.close();
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("xpm/file-prefetcher/importFileList(); imported ");
                    A0u.append(i);
                    C36321k7.A1a(A0u, " entries.");
                    return;
                } catch (Exception e) {
                    throw new IOException(e);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                B1k.close();
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                A014.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public void A0E(CancellationSignal cancellationSignal) {
        if (!this.A0D.getAndSet(true)) {
            try {
                A0F(cancellationSignal);
            } finally {
                this.A0D.set(false);
            }
        } else {
            Log.e("xpm/file-prefetcher/prefetchAllFiles()concurrent prefetch requested, not supported");
            throw AnonymousClass001.A09("Multiple concurrent operations are not supported.");
        }
    }

    public void A0F(CancellationSignal cancellationSignal) {
        C1495371p A022;
        Log.i("xpm/file-prefetcher/prefetchAllFilesLocked()");
        if (this.A06.A02(A0G)) {
            Log.i("xpm/file-prefetcher/prefetchAllFilesLocked() already marked as completed, nothing to do.");
            return;
        }
        try {
            A022 = this.A03.A02();
            if (A0J()) {
                A0C(cancellationSignal);
                A0A(cancellationSignal);
            }
            A0D(cancellationSignal);
            A01();
            A0B(cancellationSignal);
            this.A0C.get();
            this.A03.A03();
            this.A06.A01(A0G, Boolean.toString(true));
            A022.close();
            return;
        } catch (OperationCanceledException e) {
            Log.w("xpm/file-prefetcher/prefetchAllFilesLocked()cancelled");
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A0I(String str) {
        AnonymousClass1M0 A012 = this.A07.A00.A01();
        try {
            ContentValues A0E2 = C36441kJ.A0E();
            C36341k9.A0o(A0E2, "required", 1);
            int A013 = A012.A02.A01(A0E2, "prefetched_files", "remote_file_path = ?", "XPM_FILE_PREFETCHER_MARK_FILE_REQUIRED", new String[]{str});
            A012.close();
            if (A013 <= 0) {
                throw new AnonymousClass5R7(200, AnonymousClass000.A0q(" is not present in remote sandbox.", AnonymousClass000.A0v(str)));
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public boolean A0J() {
        try {
            ParcelFileDescriptor A002 = this.A03.A00("migration/enc.zip");
            if (A002 != null) {
                A002.close();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public C132986Wc(C19700wN r2, C19730wQ r3, C19630wG r4, AnonymousClass6NF r5, AnonymousClass614 r6, AnonymousClass6JO r7, AnonymousClass6T9 r8, AnonymousClass005 r9, AnonymousClass613 r10, AnonymousClass6FI r11, AnonymousClass5FV r12, C1270366r r13, C128596Cw r14) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = r7;
        this.A09 = r5;
        this.A0A = r6;
        this.A0C = r9;
        this.A0B = r8;
        this.A03 = r11;
        this.A07 = r10;
        this.A04 = r12;
        this.A05 = r13;
        this.A06 = r14;
    }

    public static void A03(String str, Throwable th) {
        Throwable cause = th.getCause();
        if (cause instanceof AEADBadTagException) {
            throw new AnonymousClass5R7(AnonymousClass000.A0p("Failed to decrypt: ", str, AnonymousClass000.A0u()), cause, 104);
        }
    }

    public File A05(String str) {
        File canonicalFile = A04().getCanonicalFile();
        File canonicalFile2 = C36441kJ.A0w(canonicalFile, str).getCanonicalFile();
        for (File parentFile = canonicalFile2.getParentFile(); parentFile != null; parentFile = parentFile.getParentFile()) {
            if (canonicalFile.equals(parentFile)) {
                return canonicalFile2;
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Remote path '");
        A0u.append(str);
        A0u.append("' escaped prefetch sandbox: '");
        A0u.append(canonicalFile2);
        throw new SecurityException(AnonymousClass000.A0q("'", A0u));
    }

    public void A0G(CancellationSignal cancellationSignal, File file, String str, byte[] bArr) {
        this.A0B.A03(cancellationSignal, A06(str), file, bArr);
    }

    public void A0H(CancellationSignal cancellationSignal, String str, String str2, byte[] bArr) {
        OutputStream A002;
        Parcel obtain;
        Parcel obtain2;
        File A052 = A05(str);
        File parentFile = A052.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        try {
            ParcelFileDescriptor A003 = this.A03.A00(str);
            try {
                FileInputStream fileInputStream = new FileInputStream(A003.getFileDescriptor());
                try {
                    FileOutputStream A0W = C90524aI.A0W(A052);
                    try {
                        A002 = A00(A0W, str, str2);
                        AnonymousClass6T9.A01(cancellationSignal, fileInputStream, A002, bArr);
                        if (A002 != null) {
                            A002.close();
                        }
                        A0W.close();
                        fileInputStream.close();
                        A003.close();
                        AnonymousClass613 r0 = this.A07;
                        String canonicalPath = A052.getCanonicalPath();
                        AnonymousClass1M0 A012 = r0.A00.A01();
                        try {
                            ContentValues A0E2 = C36441kJ.A0E();
                            C36341k9.A0o(A0E2, "prefetched", 1);
                            A0E2.put("prefetched_file_path", canonicalPath);
                            A012.A02.A01(A0E2, "prefetched_files", "remote_file_path = ?", "XPM_FILE_PREFETCHER_MARK_FILE_PREFETCHED", new String[]{str});
                            A012.close();
                            this.A0C.get();
                            if (!str.equals("migration/metadata.json")) {
                                try {
                                    AnonymousClass5KJ A013 = this.A03.A01();
                                    try {
                                        C141386nA r1 = (C141386nA) ((IAppDataReaderService) A013.A00());
                                        obtain = Parcel.obtain();
                                        obtain2 = Parcel.obtain();
                                        obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                                        obtain.writeString(str);
                                        AnonymousClass000.A15(r1.A00, obtain, obtain2, 3);
                                        obtain2.recycle();
                                        obtain.recycle();
                                        A013.close();
                                        return;
                                    } catch (Throwable th) {
                                        A013.close();
                                        throw th;
                                    }
                                } catch (Exception e) {
                                    throw new IOException(str, e);
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        A0W.close();
                        throw th4;
                    }
                    throw th;
                } catch (Throwable th5) {
                    fileInputStream.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                if (A003 != null) {
                    A003.close();
                }
                throw th6;
            }
        } catch (OperationCanceledException e2) {
            A052.delete();
            C36321k7.A1Q("xpm/file-prefetcher/importFile(); cancelled while importing ", str, AnonymousClass000.A0u());
            throw e2;
        } catch (Throwable th7) {
            th6.addSuppressed(th7);
        }
    }
}
