package X;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.CancellationSignal;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.6WX  reason: invalid class name */
public class AnonymousClass6WX {
    public CancellationSignal A00;
    public CountDownLatch A01;
    public final C19700wN A02;
    public final C21060yb A03;
    public final C20810yC A04;
    public final C21010yW A05;
    public final C20280xJ A06;
    public final C133236Xj A07;
    public final AnonymousClass6Q7 A08;
    public final AnonymousClass6FO A09;
    public final AnonymousClass6F7 A0A;
    public final C1268465w A0B;
    public final C146926wO A0C;
    public final AnonymousClass5FY A0D;
    public final C121765tg A0E;
    public final AnonymousClass6F6 A0F;
    public final C29501Ww A0G;
    public final C224214g A0H;
    public final AnonymousClass005 A0I;
    public final AnonymousClass005 A0J;
    public final List A0K = AnonymousClass001.A0I();
    public final C19970wo A0L;
    public final C119855qZ A0M;
    public final AnonymousClass005 A0N;

    public static synchronized long A00(AnonymousClass6WX r2) {
        long A002;
        synchronized (r2) {
            A002 = r2.A0H.A00();
        }
        return A002;
    }

    public static synchronized void A02(AnonymousClass6WX r1) {
        synchronized (r1) {
            r1.A0H.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r1 == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A09() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.isCanceled()     // Catch:{ all -> 0x000f }
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            monitor-exit(r2)
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WX.A09():boolean");
    }

    public static AnonymousClass58W A01(AnonymousClass6WX r10, int i) {
        long j;
        Cursor A092;
        long j2;
        AnonymousClass6FO r5 = r10.A09;
        String A022 = r5.A02();
        AnonymousClass58W r2 = new AnonymousClass58W();
        r2.A05 = Integer.valueOf(i);
        r2.A09 = A022;
        r2.A03 = C36361kB.A0i();
        if (10 == i) {
            r2.A07 = Long.valueOf(A00(r10) / 1000);
            C227915v r9 = (C227915v) r10.A0I.get();
            Long A002 = ((AnonymousClass15x) r10.A0N.get()).A00();
            AnonymousClass6F6 r3 = r10.A0F;
            long A003 = r3.A00();
            AnonymousClass1M0 A004 = C1270466s.A00(r3);
            try {
                A092 = A004.A02.A09("SELECT  SUM(f.file_size) AS media_size FROM exported_files_metadata AS f WHERE f.required = 0", "XPM_EXPORT_TOTAL_MEDIA_SIZE", (String[]) null);
                if (!A092.moveToFirst()) {
                    j2 = 0;
                } else {
                    j2 = C36351kA.A07(A092, "media_size");
                }
                A092.close();
                A004.close();
                long A023 = ((C20060wx) r10.A0J.get()).A02();
                if (A002 != null) {
                    r2.A00 = C90524aI.A0Z(r9.A00(A002.longValue()));
                }
                r2.A02 = C90524aI.A0Z(r9.A00(A003));
                r2.A01 = C90524aI.A0Z(r9.A00(j2));
                j = r9.A00(A023);
            } catch (Throwable th) {
                try {
                    A004.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else if (8 == i) {
            r2.A06 = Long.valueOf(((C227915v) r10.A0I.get()).A00(((C20060wx) r10.A0J.get()).A02()));
            r2.A07 = Long.valueOf(A00(r10) / 1000);
            r2.A08 = C36441kJ.A0y(r10.A0C.A00);
            r5.A03();
            return r2;
        } else if (3 == i) {
            C227915v r52 = (C227915v) r10.A0I.get();
            Long A005 = ((AnonymousClass15x) r10.A0N.get()).A00();
            long A024 = ((C20060wx) r10.A0J.get()).A02();
            if (A005 != null) {
                r2.A00 = C90524aI.A0Z(r52.A00(A005.longValue()));
            }
            j = r52.A00(A024);
        } else {
            r2.A07 = Long.valueOf(A00(r10) / 1000);
            r2.A08 = C36441kJ.A0y(r10.A0C.A00);
            return r2;
        }
        r2.A06 = Long.valueOf(j);
        return r2;
        throw th;
    }

    public static void A03(AnonymousClass6WX r2, int i) {
        if (8 != i || C36371kC.A0t(C36391kE.A0H(r2.A09.A01), "/export/logging/funnelId") != null) {
            r2.A05.Blv(A01(r2, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008b, code lost:
        if (r2 == false) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a3 A[LOOP:2: B:51:0x009d->B:53:0x00a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f0 A[LOOP:3: B:61:0x00ea->B:63:0x00f0, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r11 = this;
            java.lang.String r1 = "ExportFlowManager/cancelExport()"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r0 = r11.A09()
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "ExportFlowManager/cancelExport() already in progress"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0011:
            X.14g r6 = new X.14g
            r6.<init>((java.lang.String) r1)
            monitor-enter(r11)
            android.os.CancellationSignal r0 = r11.A00     // Catch:{ all -> 0x0123 }
            r5 = 0
            if (r0 != 0) goto L_0x0027
            java.util.concurrent.CountDownLatch r0 = r11.A01     // Catch:{ all -> 0x0123 }
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "ExportFlowManager/cancellationSignal or exportCompleted is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0123 }
            r0 = 1
            goto L_0x0032
        L_0x0027:
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0123 }
            android.os.CancellationSignal r0 = r11.A00     // Catch:{ all -> 0x0123 }
            r0.cancel()     // Catch:{ all -> 0x0123 }
        L_0x0031:
            r0 = 0
        L_0x0032:
            monitor-exit(r11)     // Catch:{ all -> 0x0123 }
            r4 = 8
            if (r0 == 0) goto L_0x0041
            A03(r11, r4)
            A02(r11)
            r11.A07()
            return
        L_0x0041:
            r8 = 2
            r9 = 1000(0x3e8, double:4.94E-321)
            X.5FY r3 = r11.A0D     // Catch:{ InterruptedException -> 0x007f, all -> 0x00fa }
            java.util.Iterator r1 = X.C36361kB.A0s(r3)     // Catch:{ InterruptedException -> 0x007f, all -> 0x00fa }
        L_0x004a:
            boolean r0 = r1.hasNext()     // Catch:{ InterruptedException -> 0x007f, all -> 0x00fa }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()     // Catch:{ InterruptedException -> 0x007f, all -> 0x00fa }
            X.7lX r0 = (X.C160757lX) r0     // Catch:{ InterruptedException -> 0x007f, all -> 0x00fa }
            r0.BT5()     // Catch:{ InterruptedException -> 0x007f, all -> 0x00fa }
            goto L_0x004a
        L_0x005a:
            monitor-enter(r11)     // Catch:{ InterruptedException -> 0x007f, all -> 0x00fa }
            java.util.concurrent.CountDownLatch r7 = r11.A01     // Catch:{ all -> 0x007c }
            monitor-exit(r11)     // Catch:{ all -> 0x007c }
            if (r7 == 0) goto L_0x00ad
            r0 = 300000(0x493e0, double:1.482197E-318)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x007f, all -> 0x00fa }
            boolean r2 = r7.await(r0, r2)     // Catch:{ InterruptedException -> 0x007f, all -> 0x00fa }
            if (r2 == 0) goto L_0x0071
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x007a }
            goto L_0x008d
        L_0x0071:
            r3.A00(r8)     // Catch:{ InterruptedException -> 0x007a }
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x007a }
            goto L_0x00ad
        L_0x007a:
            r1 = move-exception
            goto L_0x0081
        L_0x007c:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ InterruptedException -> 0x007f, all -> 0x00fa }
        L_0x007f:
            r1 = move-exception
            r2 = 0
        L_0x0081:
            X.5FY r3 = r11.A0D     // Catch:{ all -> 0x00d5 }
            r3.A00(r8)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "ExportFlowManager/cancelExport()/InterruptedException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x00ad
        L_0x008d:
            r11.A07()
        L_0x0090:
            r6.A01()
            A03(r11, r4)
            A02(r11)
            java.util.Iterator r1 = X.C36361kB.A0s(r3)
        L_0x009d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r1.next()
            X.7lX r0 = (X.C160757lX) r0
            r0.BT4()
            goto L_0x009d
        L_0x00ad:
            long r0 = r6.A00()
            long r0 = r0 / r9
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ExportFlowManager/reset() was not called since cancellation did not succeed after "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " seconds"
            X.C36321k7.A1Z(r1, r0)
            X.0wN r1 = r11.A02
            java.lang.String r0 = "xpm-export-cancel-failed"
            r1.A0E(r0, r2, r5)
            goto L_0x0090
        L_0x00cf:
            X.6wO r0 = r11.A0C
            r3.unregisterObserver(r0)
            return
        L_0x00d5:
            r3 = move-exception
            if (r2 == 0) goto L_0x00fb
            r11.A07()
        L_0x00db:
            r6.A01()
            A03(r11, r4)
            A02(r11)
            X.5FY r2 = r11.A0D
            java.util.Iterator r1 = X.C36361kB.A0s(r2)
        L_0x00ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x011d
            java.lang.Object r0 = r1.next()
            X.7lX r0 = (X.C160757lX) r0
            r0.BT4()
            goto L_0x00ea
        L_0x00fa:
            r3 = move-exception
        L_0x00fb:
            long r0 = r6.A00()
            long r0 = r0 / r9
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ExportFlowManager/reset() was not called since cancellation did not succeed after "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " seconds"
            X.C36321k7.A1Z(r1, r0)
            X.0wN r1 = r11.A02
            java.lang.String r0 = "xpm-export-cancel-failed"
            r1.A0E(r0, r2, r5)
            goto L_0x00db
        L_0x011d:
            X.6wO r0 = r11.A0C
            r2.unregisterObserver(r0)
            throw r3
        L_0x0123:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0123 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WX.A04():void");
    }

    public void A05() {
        this.A08.A02();
        A04();
        this.A06.A04(true);
        Log.i("ExportFlowManager/cancelExportFlowAndClearData/complete");
        AnonymousClass005 r2 = this.A09.A01;
        C36341k9.A0u(C90464aC.A0C(r2), "/export/start_time");
        C36341k9.A0u(C90464aC.A0C(r2), "/export/provider_closed/timestamp");
        C29501Ww r3 = this.A0G;
        if (r3.A0G.A01.getInt("registration_state", 1) == 11) {
            r3.A09();
        }
        Log.i("ExportFlowManager/disableExportProviderAndClearMigrationFlags/complete/success");
    }

    public void A06() {
        boolean A0E2 = this.A04.A0E(843);
        C119855qZ r0 = this.A0M;
        PackageManager packageManager = r0.A01;
        ComponentName componentName = r0.A00;
        if (A0E2 != AnonymousClass000.A1O(packageManager.getComponentEnabledSetting(componentName))) {
            packageManager.setComponentEnabledSetting(componentName, AnonymousClass000.A1P(A0E2 ? 1 : 0) ? 1 : 0, 1);
        }
    }

    public void A07() {
        Log.i("ExportFlowManager/reset()");
        C36341k9.A0u(C90464aC.A0C(this.A09.A01).remove("/export/enc/active/owner").remove("/export/enc/active/version").remove("/export/enc/active/account_hash").remove("/export/enc/active/server_salt").remove("/export/enc/active/last_fetch_time"), "/export/enc/active/seed");
        this.A0F.A04();
        this.A0B.A01();
    }

    public boolean A08() {
        AnonymousClass6Q7 r0 = this.A08;
        if (AnonymousClass000.A1O(r0.A01.getComponentEnabledSetting(r0.A00)) || C36391kE.A0H(this.A09.A01).getLong("/export/start_time", 0) > 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass6WX(C19700wN r3, C21060yb r4, C19970wo r5, C20810yC r6, C21010yW r7, C20280xJ r8, C133236Xj r9, C119855qZ r10, AnonymousClass6Q7 r11, AnonymousClass6FO r12, AnonymousClass6F7 r13, C1268465w r14, AnonymousClass5FY r15, C121765tg r16, AnonymousClass6F6 r17, C29501Ww r18, AnonymousClass005 r19, AnonymousClass005 r20, AnonymousClass005 r21) {
        this.A0L = r5;
        this.A04 = r6;
        this.A02 = r3;
        this.A05 = r7;
        this.A09 = r12;
        this.A03 = r4;
        this.A07 = r9;
        this.A0J = r19;
        this.A0B = r14;
        this.A06 = r8;
        this.A0G = r18;
        this.A0E = r16;
        this.A0F = r17;
        this.A0A = r13;
        this.A0M = r10;
        this.A0D = r15;
        this.A0I = r20;
        this.A0N = r21;
        this.A08 = r11;
        C224214g r0 = new C224214g("ExportFlowManager/duration");
        this.A0H = r0;
        r0.A01();
        C146926wO r02 = new C146926wO(this);
        this.A0C = r02;
        r15.registerObserver(r02);
    }
}
