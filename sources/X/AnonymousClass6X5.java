package X;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.JsonReader;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6X5  reason: invalid class name */
public class AnonymousClass6X5 {
    public static final long A0L = 30000;
    public static final String A0M = "GoogleMigrateIntegrationManager/";
    public CancellationSignal A00;
    public CountDownLatch A01;
    public final C220612s A02;
    public final C19700wN A03;
    public final C20690y0 A04;
    public final C19970wo A05;
    public final AnonymousClass1QN A06;
    public final C219612i A07;
    public final AnonymousClass6FI A08;
    public final C132986Wc A09;
    public final AnonymousClass5FX A0A;
    public final C132276Sx A0B;
    public final AnonymousClass6JO A0C;
    public final C133246Xk A0D;
    public final C111135bn A0E;
    public final AnonymousClass3HJ A0F;
    public final C29501Ww A0G;
    public final AnonymousClass3TX A0H;
    public final AnonymousClass3NT A0I;
    public final AnonymousClass005 A0J;
    public final AtomicBoolean A0K = C36431kI.A1H();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0136 A[LOOP:1: B:46:0x0130->B:48:0x0136, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r15 = this;
            monitor-enter(r15)
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ all -> 0x01d8 }
            if (r0 != 0) goto L_0x01d1
            java.util.concurrent.CountDownLatch r0 = r15.A01     // Catch:{ all -> 0x01d8 }
            if (r0 != 0) goto L_0x01d1
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ all -> 0x01d8 }
            r0.<init>()     // Catch:{ all -> 0x01d8 }
            r15.A00 = r0     // Catch:{ all -> 0x01d8 }
            r5 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x01d8 }
            r0.<init>(r5)     // Catch:{ all -> 0x01d8 }
            r15.A01 = r0     // Catch:{ all -> 0x01d8 }
            monitor-exit(r15)     // Catch:{ all -> 0x01d8 }
            X.6JO r1 = r15.A0C
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x01ce }
            r0.clear()     // Catch:{ all -> 0x01ce }
            monitor-exit(r1)     // Catch:{ all -> 0x01ce }
            X.5FX r0 = r15.A0A
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x0028:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            X.7li r0 = (X.C160867li) r0
            r0.BZ4()
            goto L_0x0028
        L_0x0038:
            r2 = 0
            X.6Sx r3 = r15.A0B     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.5FX r1 = r3.A05     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.7li r0 = r3.A04     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r1.registerObserver(r0)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.5FV r1 = r3.A03     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.5mN r0 = r3.A06     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r1.registerObserver(r0)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.5FW r1 = r3.A08     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.7h2 r0 = r3.A07     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r1.registerObserver(r0)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.12s r0 = r15.A02     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.6Ni r6 = r0.A00()     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            boolean r0 = r6.A00()     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x008c
            r15.A03()     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r15.A0D()     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.6Wc r1 = r15.A09     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r1.A0E(r0)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.6Xk r1 = r15.A0D     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r1.A0B(r0)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r15.A04(r6)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.12i r3 = r15.A07     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            java.lang.String r1 = "cross_platform_migration_completed"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r3.A04(r1, r0)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.12i r4 = r15.A07     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            java.lang.String r3 = "cross_platform_migration_completed_timestamp"
            X.0wo r0 = r15.A05     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r4.A03(r3, r0)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            goto L_0x00a5
        L_0x008c:
            X.0wN r4 = r15.A03     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            java.lang.String r3 = "xpm-integration-failed"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            java.lang.String r0 = "failed to initialize db, result = "
            java.lang.String r0 = X.AnonymousClass000.A0l(r6, r0, r1)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r4.A0E(r3, r0, r5)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            X.5FX r1 = r15.A0A     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r0 = 302(0x12e, float:4.23E-43)
            r1.A01(r0)     // Catch:{ OperationCanceledException -> 0x011b, Exception -> 0x00b1 }
            r5 = 0
        L_0x00a5:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
            r2 = r5
            goto L_0x012a
        L_0x00b1:
            r6 = move-exception
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/"
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x01c2 }
            boolean r0 = r6 instanceof X.AnonymousClass7h1     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x00c2
            r0 = r6
            X.7h1 r0 = (X.AnonymousClass7h1) r0     // Catch:{ all -> 0x01c2 }
            int r5 = r0.BEE()     // Catch:{ all -> 0x01c2 }
        L_0x00c2:
            X.3NT r0 = r15.A0I     // Catch:{ all -> 0x01c2 }
            android.content.SharedPreferences r1 = X.AnonymousClass3NT.A00(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "google_migrate_ios_funnel_id"
            r3 = 0
            java.lang.String r10 = r1.getString(r0, r3)     // Catch:{ all -> 0x01c2 }
            X.3NT r0 = r15.A0I     // Catch:{ all -> 0x01c2 }
            android.content.SharedPreferences r1 = X.AnonymousClass3NT.A00(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "google_migrate_ios_export_duration"
            java.lang.String r11 = r1.getString(r0, r3)     // Catch:{ all -> 0x01c2 }
            X.3TX r7 = r15.A0H     // Catch:{ all -> 0x01c2 }
            r1 = 1
            r0 = 302(0x12e, float:4.23E-43)
            if (r5 == r0) goto L_0x00f3
            r0 = 202(0xca, float:2.83E-43)
            if (r5 == r0) goto L_0x00f3
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 == r0) goto L_0x00f3
            r0 = 201(0xc9, float:2.82E-43)
            if (r5 == r0) goto L_0x00f3
            if (r5 == r1) goto L_0x00f3
            java.lang.String r8 = "google_migrate_recoverable_error"
            goto L_0x00f5
        L_0x00f3:
            java.lang.String r8 = "google_migrate_unrecoverable_error"
        L_0x00f5:
            java.lang.StringBuilder r1 = X.C90504aG.A0q(r5)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = ";"
            java.lang.String r9 = X.AnonymousClass000.A0l(r6, r0, r1)     // Catch:{ all -> 0x01c2 }
            r12 = 0
            r7.A0B(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01c2 }
            X.0wN r4 = r15.A03     // Catch:{ all -> 0x01c2 }
            java.lang.String r3 = "xpm-integration-failed"
            java.lang.StringBuilder r1 = X.C90504aG.A0q(r5)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass000.A0l(r6, r0, r1)     // Catch:{ all -> 0x01c2 }
            r4.A0D(r3, r0, r6)     // Catch:{ all -> 0x01c2 }
            X.5FX r0 = r15.A0A     // Catch:{ all -> 0x01c2 }
            r0.A01(r5)     // Catch:{ all -> 0x01c2 }
            goto L_0x0120
        L_0x011b:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01c2 }
        L_0x0120:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
        L_0x012a:
            X.5FX r0 = r15.A0A
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x0130:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0140
            java.lang.Object r0 = r1.next()
            X.7li r0 = (X.C160867li) r0
            r0.BU4(r2)
            goto L_0x0130
        L_0x0140:
            r15.A01()
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData(); stats=\n"
            r9.append(r0)
            X.6JO r3 = r15.A0C
            java.lang.String r11 = "\n"
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "prefetched/file/success"
            int r2 = X.AnonymousClass6JO.A00(r3, r0)
            java.lang.String r0 = "prefetched/file/failed"
            int r1 = X.AnonymousClass6JO.A00(r3, r0)
            int r14 = r2 + r1
            java.lang.String r0 = "import/chat/skipped"
            int r13 = X.AnonymousClass6JO.A00(r3, r0)
            java.lang.String r0 = "import/msg/success"
            int r12 = X.AnonymousClass6JO.A00(r3, r0)
            java.lang.String r0 = "import/msg/failed"
            int r8 = X.AnonymousClass6JO.A00(r3, r0)
            java.lang.String r0 = "import/msg/skipped"
            int r7 = X.AnonymousClass6JO.A00(r3, r0)
            int r6 = r12 + r8
            int r6 = r6 + r7
            java.lang.String r0 = "import/msg/file/success"
            int r5 = X.AnonymousClass6JO.A00(r3, r0)
            java.lang.String r0 = "import/msg/file/failed"
            int r4 = X.AnonymousClass6JO.A00(r3, r0)
            int r3 = r5 + r4
            java.lang.String r0 = "Prefetched files: success="
            r10.append(r0)
            r10.append(r2)
            java.lang.String r2 = ", failed="
            r10.append(r2)
            r10.append(r1)
            java.lang.String r1 = ", total="
            X.C36351kA.A1M(r1, r11, r10, r14)
            java.lang.String r0 = "Chats: skipped="
            X.C36351kA.A1M(r0, r11, r10, r13)
            java.lang.String r0 = "Messages: success="
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = ", skipped="
            X.C90464aC.A1K(r0, r2, r10, r7, r8)
            X.C36351kA.A1M(r1, r11, r10, r6)
            java.lang.String r0 = "Message files: success="
            X.C90464aC.A1K(r0, r2, r10, r5, r4)
            java.lang.String r0 = X.AnonymousClass000.A0r(r1, r10, r3)
            X.C36321k7.A1a(r9, r0)
            return
        L_0x01c2:
            r1 = move-exception
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
            throw r1
        L_0x01ce:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ce }
            throw r0
        L_0x01d1:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/Import already running, cannot start another import."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x01d8 }
            throw r0     // Catch:{ all -> 0x01d8 }
        L_0x01d8:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01d8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X5.A09():void");
    }

    public boolean A0G() {
        try {
            String A012 = this.A07.A01("cross_platform_migration_completed");
            return A012 != null && Integer.parseInt(A012) == 1;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2.A01 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0H() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000a
            java.util.concurrent.CountDownLatch r1 = r2.A01     // Catch:{ all -> 0x000d }
            r0 = 1
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X5.A0H():boolean");
    }

    private void A01() {
        Log.i("GoogleMigrateIntegrationManager/cleanUpAfterImportCompleted()");
        this.A07.A04("cross_migration_data_cleanup_needed", String.valueOf(1));
        C132276Sx r2 = this.A0B;
        r2.A05.unregisterObserver(r2.A04);
        r2.A03.unregisterObserver(r2.A06);
        r2.A08.unregisterObserver(r2.A07);
        synchronized (this) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    private void A02() {
        A04(this.A02.A00());
    }

    private void A03() {
        if (!this.A0G.A0G()) {
            throw new AnonymousClass5R7(301, "GoogleMigrateIntegrationManager/can not find jabber Id");
        }
    }

    public int A05() {
        int i;
        C132276Sx r1 = this.A0B;
        synchronized (r1) {
            i = r1.A00;
        }
        return i;
    }

    public int A06() {
        int i;
        C132276Sx r2 = this.A0B;
        synchronized (r2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GoogleMigrate/getCurrentScreen = ");
            C36321k7.A1Y(A0u, r2.A01);
            i = r2.A01;
        }
        return i;
    }

    public void A07() {
        CountDownLatch countDownLatch;
        Log.i("GoogleMigrateIntegrationManager/cancelImport()");
        boolean z = true;
        if (!this.A0K.getAndSet(true)) {
            synchronized (this) {
                if (this.A00 == null || this.A01 == null) {
                    Log.i("GoogleMigrateIntegrationManager/cancellationSignal or importCompleted is null");
                    A00();
                } else {
                    z = false;
                }
                countDownLatch = this.A01;
                if (this.A00 != null) {
                    Log.i("GoogleMigrateIntegrationManager/cancelImport()/cancellationSignal.cancel");
                    this.A00.cancel();
                }
            }
            if (z) {
                this.A0A.A00();
                A01();
                return;
            }
            try {
                Iterator A0s = C36361kB.A0s(this.A0A);
                while (A0s.hasNext()) {
                    ((C160867li) A0s.next()).BT5();
                }
                if (countDownLatch != null) {
                    countDownLatch.await(A0L, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException e) {
                this.A0A.A01(2);
                Log.e("GoogleMigrateIntegrationManager/cancelImportProcess()/InterruptedException", e);
            } catch (Throwable th) {
                A00();
                this.A0A.A00();
                A01();
                this.A0K.set(false);
                throw th;
            }
            A00();
            this.A0A.A00();
            A01();
            this.A0K.set(false);
            return;
        }
        Log.e("GoogleMigrateIntegrationManager/concurrent cancelImport requested, not supported");
        throw AnonymousClass001.A09("Multiple concurrent operations are not supported.");
    }

    public void A08() {
        if (this.A07.A00("cross_migration_data_cleanup_needed", 0) == 1) {
            this.A09.A09();
            this.A0J.get();
            if (this.A08.A04()) {
                try {
                    this.A08.A03();
                } catch (IOException e) {
                    this.A03.A0D("xpm-integration-delete-failed", AnonymousClass000.A0l(e, "failed to delete remote data: ", AnonymousClass000.A0u()), e);
                    Log.e("GoogleMigrateIntegrationManager/deferredCleanup()/could not delete all data from Google Migrate");
                }
            }
            this.A07.A02("cross_migration_data_cleanup_needed");
            return;
        }
        Log.i("GoogleMigrateIntegrationManager/deferredCleanup()/does not need to cleanup");
    }

    public void A0A() {
        this.A02.A00();
    }

    public void A0B() {
        C132276Sx r1 = this.A0B;
        synchronized (r1) {
            r1.A01 = 0;
        }
    }

    public void A0C() {
        this.A06.A00();
        this.A02.A02();
    }

    public void A0D() {
        JsonReader A0K2;
        IOException iOException;
        Log.i("GoogleMigrateIntegrationManager/saveLoggingInfoFromiOS()");
        try {
            ParcelFileDescriptor A002 = this.A08.A00("migration/metadata.json");
            try {
                FileInputStream fileInputStream = new FileInputStream(A002.getFileDescriptor());
                try {
                    A0K2 = C90474aD.A0K(fileInputStream);
                    A0K2.beginObject();
                    String str = null;
                    String str2 = null;
                    while (A0K2.hasNext()) {
                        if ("attemptInfo".equals(A0K2.nextName())) {
                            A0K2.beginObject();
                            while (A0K2.hasNext()) {
                                String nextName = A0K2.nextName();
                                if ("attemptCompletionTime".equals(nextName)) {
                                    str2 = Double.toString(A0K2.nextDouble());
                                } else if ("attemptID".equals(nextName)) {
                                    str = A0K2.nextString();
                                }
                            }
                            A0K2.endObject();
                        } else {
                            A0K2.skipValue();
                        }
                    }
                    A0K2.endObject();
                    if (str == null) {
                        iOException = C90524aI.A0X("Invalid metadata file: iOSFunnelId is missing.");
                    } else if (str2 != null) {
                        A0K2.close();
                        C36341k9.A0x(AnonymousClass3NT.A00(this.A0I).edit(), "google_migrate_ios_export_duration", str2);
                        C36341k9.A0x(AnonymousClass3NT.A00(this.A0I).edit(), "google_migrate_ios_funnel_id", str);
                        fileInputStream.close();
                        A002.close();
                        return;
                    } else {
                        iOException = C90524aI.A0X("Invalid metadata file: iOSExportDuration is missing.");
                    }
                    throw iOException;
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (A002 != null) {
                    A002.close();
                }
                throw th2;
            }
        } catch (IOException e) {
            Log.e("GoogleMigrateIntegrationManager/saveLoggingInfoFromiOS()/", e);
            this.A03.A0D("xpm-integration-no-funnel-id", "saveLoggingInfoFromiOS;", e);
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void A0E(int r4) {
        /*
            r3 = this;
            X.5FX r0 = r3.A0A     // Catch:{ all -> 0x0030 }
            java.util.Iterator r1 = X.C36361kB.A0s(r0)     // Catch:{ all -> 0x0030 }
        L_0x0006:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0030 }
            X.7li r0 = (X.C160867li) r0     // Catch:{ all -> 0x0030 }
            r0.BdL()     // Catch:{ all -> 0x0030 }
            goto L_0x0006
        L_0x0016:
            r3.A0C()     // Catch:{ all -> 0x0030 }
            X.5FX r0 = r3.A0A
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r1.next()
            X.7li r0 = (X.C160867li) r0
            r0.BdK(r4)
            goto L_0x001f
        L_0x002f:
            return
        L_0x0030:
            r2 = move-exception
            X.5FX r0 = r3.A0A
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x0037:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r1.next()
            X.7li r0 = (X.C160867li) r0
            r0.BdK(r4)
            goto L_0x0037
        L_0x0047:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X5.A0E(int):void");
    }

    public boolean A0F() {
        return this.A08.A04();
    }

    public AnonymousClass6X5(C19970wo r2, C19700wN r3, C20690y0 r4, AnonymousClass3TX r5, C132986Wc r6, C133246Xk r7, AnonymousClass6JO r8, C219612i r9, AnonymousClass005 r10, AnonymousClass6FI r11, C29501Ww r12, C132276Sx r13, AnonymousClass5FX r14, AnonymousClass3HJ r15, AnonymousClass1QN r16, C220612s r17, AnonymousClass3NT r18, C111135bn r19) {
        this.A05 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A0H = r5;
        this.A0J = r10;
        this.A09 = r6;
        this.A0D = r7;
        this.A0C = r8;
        this.A07 = r9;
        this.A08 = r11;
        this.A0G = r12;
        this.A0B = r13;
        this.A0A = r14;
        this.A0F = r15;
        this.A06 = r16;
        this.A02 = r17;
        this.A0I = r18;
        this.A0E = r19;
    }

    private void A00() {
        A0C();
        File A0H2 = this.A04.A0H();
        AnonymousClass6YY.A0H(A0H2, (Set) null);
        String[] list = A0H2.list();
        if (!(list == null || list.length == 0)) {
            this.A03.A0E(A0M, "cancelImport/could not delete media folder", false);
            Log.e("GoogleMigrateIntegrationManager/cleanUpAfterCancellation()/could not delete media folder");
        }
        A02();
    }

    private void A04(C131006Ni r2) {
        if (r2.A00()) {
            AnonymousClass3HJ r0 = this.A0F;
            r0.A00();
            r0.A01();
        }
    }
}
