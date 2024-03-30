package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.54W  reason: invalid class name */
public class AnonymousClass54W extends AnonymousClass1CP {
    public final C24041Av A00;
    public final C19630wG A01;
    public final C24401Ch A02;
    public final C23991Aq A03;
    public final AnonymousClass005 A04;
    public final C19730wQ A05;
    public final C24341Cb A06;
    public final AnonymousClass1CY A07;
    public final C24391Cg A08;
    public final AnonymousClass1CS A09;

    public String A0J() {
        return "stickers-db";
    }

    public ArrayList A0K(File file) {
        ArrayList A062 = AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT13);
        A062.add(".crypt1");
        return AnonymousClass6YO.A07(file, "stickers.db", A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r14 == null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0N(android.content.Context r19, java.io.File r20) {
        /*
            r18 = this;
            r2 = r18
            monitor-enter(r2)
            X.005 r1 = r2.A04     // Catch:{ all -> 0x0088 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0088 }
            X.54e r0 = (X.C1031554e) r0     // Catch:{ all -> 0x0088 }
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A02     // Catch:{ all -> 0x0088 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r0.writeLock()     // Catch:{ all -> 0x0088 }
            r6.lock()     // Catch:{ all -> 0x0088 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0083 }
            X.16q r0 = (X.C229616q) r0     // Catch:{ all -> 0x0083 }
            r0.close()     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0083 }
            X.54e r0 = (X.C1031554e) r0     // Catch:{ all -> 0x0083 }
            r0.A05()     // Catch:{ all -> 0x0083 }
            X.0wG r0 = r2.A01     // Catch:{ all -> 0x0083 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "stickers.db"
            java.io.File r4 = r0.getDatabasePath(r1)     // Catch:{ all -> 0x0083 }
            X.1Av r0 = r2.A00     // Catch:{ all -> 0x0083 }
            X.0y0 r0 = r0.A00     // Catch:{ all -> 0x0083 }
            java.io.File r3 = r0.A0G()     // Catch:{ all -> 0x0083 }
            r5 = 0
            r16 = r20
            java.lang.String r0 = r16.getName()     // Catch:{ Exception -> 0x0078 }
            int r1 = X.AnonymousClass6YO.A01(r0, r1)     // Catch:{ Exception -> 0x0078 }
            if (r1 <= 0) goto L_0x0070
            X.5U6 r14 = X.AnonymousClass5U6.CRYPT13     // Catch:{ Exception -> 0x0078 }
            int r0 = r14.version     // Catch:{ Exception -> 0x0078 }
            if (r1 < r0) goto L_0x0051
            X.5U6 r14 = X.AnonymousClass5U6.A02(r1)     // Catch:{ Exception -> 0x0078 }
            if (r14 == 0) goto L_0x0070
        L_0x0051:
            X.1CS r15 = r2.A09     // Catch:{ Exception -> 0x0078 }
            X.0wQ r7 = r2.A05     // Catch:{ Exception -> 0x0078 }
            X.1CY r11 = r2.A07     // Catch:{ Exception -> 0x0078 }
            X.1Ck r9 = r2.A01     // Catch:{ Exception -> 0x0078 }
            X.1Cb r10 = r2.A06     // Catch:{ Exception -> 0x0078 }
            X.1Cg r13 = r2.A08     // Catch:{ Exception -> 0x0078 }
            X.0yF r12 = r2.A04     // Catch:{ Exception -> 0x0078 }
            r8 = 0
            r17 = r8
            X.6QE r1 = X.C109765Za.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0078 }
            X.6pR r0 = new X.6pR     // Catch:{ Exception -> 0x0078 }
            r0.<init>(r4, r3)     // Catch:{ Exception -> 0x0078 }
            boolean r0 = r1.A09(r0)     // Catch:{ Exception -> 0x0078 }
            goto L_0x0073
        L_0x0070:
            X.5U6 r14 = X.AnonymousClass5U6.UNENCRYPTED     // Catch:{ Exception -> 0x0078 }
            goto L_0x0051
        L_0x0073:
            r6.unlock()     // Catch:{ all -> 0x0088 }
            monitor-exit(r2)
            return r0
        L_0x0078:
            r1 = move-exception
            java.lang.String r0 = "sticker-db-storage/restore failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0083 }
            r6.unlock()     // Catch:{ all -> 0x0088 }
            monitor-exit(r2)
            return r5
        L_0x0083:
            r0 = move-exception
            r6.unlock()     // Catch:{ all -> 0x0088 }
            throw r0     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54W.A0N(android.content.Context, java.io.File):boolean");
    }

    public AnonymousClass6PN A0P(AnonymousClass5U6 r24) {
        File A032;
        C162157o7 A062;
        C24341Cb r15 = this.A06;
        if (r15.A02()) {
            Log.i("sticker-db-storage/backup/skip no media or read-only media");
            return null;
        }
        AnonymousClass5U6 r7 = r24;
        if (r7 == AnonymousClass5U6.CRYPT13) {
            A032 = C36441kJ.A0w(this.A02.A02(), "stickers.db.crypt1");
        } else {
            A032 = AnonymousClass5U6.A03(this, r7, "stickers.db.crypt", AnonymousClass000.A0u());
        }
        if (A032.exists() && A032.isDirectory()) {
            A032.delete();
        }
        File parentFile = A032.getParentFile();
        C18740tg.A06(parentFile);
        C90474aD.A15(parentFile);
        Iterator it = A0K(A0E(r7)).iterator();
        while (it.hasNext()) {
            File A0a = C90504aG.A0a(it);
            if (!A0a.equals(A032)) {
                C90464aC.A18(A0a);
            }
        }
        C36321k7.A1K(A032, "sticker-db-storage/backup/to ", AnonymousClass000.A0u());
        long j = 0;
        AnonymousClass005 r1 = this.A04;
        ReentrantReadWriteLock.WriteLock writeLock = ((C229616q) r1.get()).A02.writeLock();
        writeLock.lock();
        try {
            ((C1031554e) r1.get()).A06();
            ((C229616q) r1.get()).close();
            AnonymousClass1CS r3 = this.A09;
            C19730wQ r12 = this.A05;
            AnonymousClass1CY r2 = this.A07;
            AnonymousClass6QE A002 = C109765Za.A00(r12, (C132716Uy) null, this.A01, r15, r2, this.A04, this.A08, r7, r3, A032, (Boolean) null);
            Context context = this.A01.A00;
            A062 = A002.A06(context);
            if (A062 == null) {
                writeLock.unlock();
                return null;
            }
            A062.BxY(context.getDatabasePath("stickers.db"));
            File[] listFiles = this.A00.A00.A0G().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    A062.BxY(file);
                    j += file.length();
                }
            }
            A062.close();
            AnonymousClass6PN r14 = new AnonymousClass6PN(A032, Long.valueOf(j), "stickers-db", C90514aH.A0K(this, r7), true);
            writeLock.unlock();
            return r14;
        } catch (Exception e) {
            try {
                Log.e("sticker-db-storage/backup failed", e);
                return null;
            } finally {
                writeLock.unlock();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public AnonymousClass54W(C19730wQ r1, C24041Av r2, C24341Cb r3, C19630wG r4, AnonymousClass1CY r5, C24421Cj r6, C24401Ch r7, C23991Aq r8, C24391Cg r9, AnonymousClass1CS r10, AnonymousClass005 r11) {
        super(r6);
        this.A01 = r4;
        this.A09 = r10;
        this.A05 = r1;
        this.A07 = r5;
        this.A04 = r11;
        this.A06 = r3;
        this.A03 = r8;
        this.A08 = r9;
        this.A02 = r7;
        this.A00 = r2;
    }

    public void A0H(C1042758y r2, double d) {
        r2.A0N = Double.valueOf(d);
    }

    public void A0L(C1042758y r2, double d) {
        r2.A0O = Double.valueOf(d);
    }

    public void A0M(C1042758y r2, double d) {
        r2.A0M = Double.valueOf(d);
    }

    public AnonymousClass6PN A0O(AnonymousClass5U6 r2) {
        return A0P(r2);
    }
}
