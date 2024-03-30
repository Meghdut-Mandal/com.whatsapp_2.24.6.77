package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.54R  reason: invalid class name */
public class AnonymousClass54R extends AnonymousClass1CP {
    public final C19730wQ A00;
    public final C24341Cb A01;
    public final C19630wG A02;
    public final AnonymousClass1CY A03;
    public final C29311Wd A04;
    public final C24391Cg A05;
    public final AnonymousClass1CS A06;

    public String A0J() {
        return "commerce-db";
    }

    public ArrayList A0K(File file) {
        ArrayList A062 = AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT13);
        A062.add(".crypt1");
        return AnonymousClass6YO.A07(file, "commerce_backup.db", A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r13 == null) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f A[Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086, all -> 0x0091 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0N(android.content.Context r22, java.io.File r23) {
        /*
            r21 = this;
            r0 = r21
            monitor-enter(r0)
            X.1Wd r2 = r0.A04     // Catch:{ all -> 0x0096 }
            X.54c r1 = r2.A00()     // Catch:{ all -> 0x0096 }
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.A02     // Catch:{ all -> 0x0096 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r1.writeLock()     // Catch:{ all -> 0x0096 }
            r5.lock()     // Catch:{ all -> 0x0096 }
            r18 = 0
            r2.A01()     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            X.0wG r1 = r2.A02     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            android.content.Context r2 = r1.A00     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            java.lang.String r1 = "commerce.db"
            java.io.File r17 = r2.getDatabasePath(r1)     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            r15 = r23
            boolean r2 = r15.exists()     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            r1 = 1
            if (r2 != 0) goto L_0x0038
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            java.lang.String r2 = "commerce_backup_store/backup/backup-file-not-found"
            X.C36321k7.A1K(r15, r2, r3)     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            r5.unlock()     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)
            return r1
        L_0x0038:
            r15.length()     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            java.lang.String r3 = r15.getName()     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            java.lang.String r2 = "commerce_backup.db"
            int r3 = X.AnonymousClass6YO.A01(r3, r2)     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            if (r3 <= 0) goto L_0x0080
            X.5U6 r13 = X.AnonymousClass5U6.CRYPT13     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            int r2 = r13.version     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            if (r3 < r2) goto L_0x0053
            X.5U6 r13 = X.AnonymousClass5U6.A02(r3)     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            if (r13 == 0) goto L_0x0080
        L_0x0053:
            X.1CS r14 = r0.A06     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            X.0wQ r6 = r0.A00     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            X.1CY r10 = r0.A03     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            X.1Ck r8 = r0.A01     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            X.1Cb r9 = r0.A01     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            X.1Cg r12 = r0.A05     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            X.0yF r11 = r0.A04     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            r7 = 0
            r16 = r7
            X.6QE r14 = X.C109765Za.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            X.0wG r15 = r0.A02     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            r19 = 0
            r20 = 0
            X.61g r4 = r14.A05(r15, r16, r17, r18, r19, r20)     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            java.lang.String r2 = "commerce_backup_store/restore/result "
            X.C36321k7.A1K(r4, r2, r3)     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            int r2 = r4.A00     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            if (r2 != r1) goto L_0x008c
            goto L_0x0083
        L_0x0080:
            X.5U6 r13 = X.AnonymousClass5U6.UNENCRYPTED     // Catch:{ 0tz | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0086 }
            goto L_0x0053
        L_0x0083:
            r18 = 1
            goto L_0x008c
        L_0x0086:
            r2 = move-exception
            java.lang.String r1 = "commerce_backup_store/restore/error"
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ all -> 0x0091 }
        L_0x008c:
            r5.unlock()     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)
            return r18
        L_0x0091:
            r1 = move-exception
            r5.unlock()     // Catch:{ all -> 0x0096 }
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54R.A0N(android.content.Context, java.io.File):boolean");
    }

    public AnonymousClass6PN A0O(AnonymousClass5U6 r22) {
        AnonymousClass6PN r14;
        File A032;
        C24341Cb r9 = this.A01;
        if (r9.A02()) {
            Log.i("commerce_backup_store/backup/skip no media or read-only media");
            return new AnonymousClass6PN("commerce-db");
        }
        C29311Wd r1 = this.A04;
        ReentrantReadWriteLock.WriteLock writeLock = r1.A00().A02.writeLock();
        writeLock.lock();
        try {
            Log.i("commerce_backup_store/backup/close-backup-db");
            r1.A01();
            File databasePath = r1.A02.A00.getDatabasePath("commerce.db");
            if (!databasePath.exists()) {
                C36321k7.A1K(databasePath, "commerce_backup_store/backup/db-file-not-found", AnonymousClass000.A0u());
                writeLock.unlock();
                return null;
            }
            AnonymousClass5U6 r13 = r22;
            if (r13 == AnonymousClass5U6.CRYPT13) {
                A032 = C36441kJ.A0w(this.A02.A02(), "commerce_backup.db.crypt1");
            } else {
                A032 = AnonymousClass5U6.A03(this, r13, "commerce_backup.db.crypt", AnonymousClass000.A0u());
            }
            Iterator it = A0K(A0E(r13)).iterator();
            while (it.hasNext()) {
                File A0a = C90504aG.A0a(it);
                if (!A0a.equals(A032)) {
                    C90464aC.A18(A0a);
                }
            }
            AnonymousClass1CS r142 = this.A06;
            C19730wQ r6 = this.A00;
            AnonymousClass1CY r10 = this.A03;
            AnonymousClass6QE A002 = C109765Za.A00(r6, (C132716Uy) null, this.A01, r9, r10, this.A04, this.A05, r13, r142, A032, (Boolean) null);
            if (!A002.A08(this.A02.A00)) {
                Log.w("commerce_backup_store/backup/failed to prepare for backup");
                r14 = new AnonymousClass6PN("commerce-db");
            } else {
                C36321k7.A1K(A032, "commerce_backup_store/backup/to ", AnonymousClass000.A0u());
                A002.A07((AnonymousClass7fT) null, databasePath);
                r14 = new AnonymousClass6PN(A032, (Long) null, "commerce-db", C90514aH.A0K(this, r13), true);
            }
            writeLock.unlock();
            return r14;
        } catch (Exception e) {
            Log.w("commerce_backup_store/backup/error", e);
            r14 = new AnonymousClass6PN("commerce-db");
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    public AnonymousClass54R(C19730wQ r1, C24341Cb r2, C19630wG r3, AnonymousClass1CY r4, C24421Cj r5, C29311Wd r6, C24391Cg r7, AnonymousClass1CS r8) {
        super(r5);
        this.A02 = r3;
        this.A06 = r8;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r6;
        this.A01 = r2;
        this.A05 = r7;
    }

    public void A0L(C1042758y r2, double d) {
        r2.A0J = Double.valueOf(d);
    }

    public void A0M(C1042758y r2, double d) {
        r2.A0I = Double.valueOf(d);
    }
}
