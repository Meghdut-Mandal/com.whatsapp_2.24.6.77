package androidx.work.impl.background.systemjob;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass69L;
import X.AnonymousClass6EO;
import X.AnonymousClass6VD;
import X.AnonymousClass6VR;
import X.AnonymousClass7e8;
import X.C114465hI;
import X.C138836im;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.util.Log;
import java.util.Map;

public class SystemJobService extends JobService implements AnonymousClass7e8 {
    public static final String A03 = AnonymousClass6VD.A01("SystemJobService");
    public AnonymousClass6VR A00;
    public final AnonymousClass6EO A01 = new AnonymousClass6EO();
    public final Map A02 = AnonymousClass001.A0J();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r5 = null;
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r2 < 24) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        r5 = new X.C120755s1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (X.AnonymousClass6GN.A00(r9) == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        r5.A02 = java.util.Arrays.asList(X.AnonymousClass6GN.A00(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (X.AnonymousClass6GN.A01(r9) == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        r5.A01 = java.util.Arrays.asList(X.AnonymousClass6GN.A01(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r2 < 28) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        r5.A00 = X.C109435Xo.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        r4 = r8.A00;
        r4.A06.B74(new X.C1503374w(r5, r4, r8.A01.A01(r1), 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            X.6VR r0 = r8.A00
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L_0x0015
            X.6VD r2 = X.AnonymousClass6VD.A00()
            java.lang.String r1 = A03
            java.lang.String r0 = "WorkManager is not initialized; requesting retry."
            r2.A04(r1, r0)
            r8.jobFinished(r9, r6)
            return r7
        L_0x0015:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r9.getExtras()     // Catch:{ NullPointerException -> 0x00ac }
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r1.containsKey(r2)     // Catch:{ NullPointerException -> 0x00ac }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r2 = r1.getString(r2)     // Catch:{ NullPointerException -> 0x00ac }
            java.lang.String r0 = "EXTRA_WORK_SPEC_GENERATION"
            int r0 = r1.getInt(r0)     // Catch:{ NullPointerException -> 0x00ac }
            X.69L r1 = new X.69L     // Catch:{ NullPointerException -> 0x00ac }
            r1.<init>(r2, r0)     // Catch:{ NullPointerException -> 0x00ac }
            java.util.Map r5 = r8.A02
            monitor-enter(r5)
            boolean r0 = r5.containsKey(r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x004c
            X.6VD r4 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = A03     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "Job is already being executed by SystemJobService: "
            X.AnonymousClass6VD.A02(r4, r1, r0, r3, r2)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r5)     // Catch:{ all -> 0x00a9 }
            return r7
        L_0x004c:
            X.6VD r4 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = A03     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "onStartJob for "
            X.AnonymousClass6VD.A02(r4, r1, r0, r3, r2)     // Catch:{ all -> 0x00a9 }
            r5.put(r1, r9)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r5)     // Catch:{ all -> 0x00a9 }
            r5 = 0
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r2 < r0) goto L_0x0095
            X.5s1 r5 = new X.5s1
            r5.<init>()
            android.net.Uri[] r0 = X.AnonymousClass6GN.A00(r9)
            if (r0 == 0) goto L_0x007b
            android.net.Uri[] r0 = X.AnonymousClass6GN.A00(r9)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.A02 = r0
        L_0x007b:
            java.lang.String[] r0 = X.AnonymousClass6GN.A01(r9)
            if (r0 == 0) goto L_0x008b
            java.lang.String[] r0 = X.AnonymousClass6GN.A01(r9)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.A01 = r0
        L_0x008b:
            r0 = 28
            if (r2 < r0) goto L_0x0095
            android.net.Network r0 = X.C109435Xo.A00(r9)
            r5.A00 = r0
        L_0x0095:
            X.6VR r4 = r8.A00
            X.6EO r0 = r8.A01
            X.5hI r3 = r0.A01(r1)
            X.7eB r2 = r4.A06
            r1 = 4
            X.74w r0 = new X.74w
            r0.<init>(r5, r4, r3, r1)
            r2.B74(r0)
            return r6
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a9 }
            throw r0
        L_0x00ac:
            X.AnonymousClass6VD.A00()
            java.lang.String r1 = A03
            java.lang.String r0 = "WorkSpec id not found!"
            android.util.Log.e(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.A00 == null) {
            AnonymousClass6VD.A00().A04(A03, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                AnonymousClass69L r4 = new AnonymousClass69L(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                AnonymousClass6VD.A02(AnonymousClass6VD.A00(), r4, "onStopJob for ", A03, AnonymousClass000.A0u());
                Map map = this.A02;
                synchronized (map) {
                    map.remove(r4);
                }
                C114465hI A002 = this.A01.A00(r4);
                if (A002 != null) {
                    this.A00.A09(A002);
                }
                C138836im r0 = this.A00.A03;
                String str = r4.A01;
                synchronized (r0.A0A) {
                    contains = r0.A07.contains(str);
                }
                return !contains;
            }
        } catch (NullPointerException unused) {
        }
        AnonymousClass6VD.A00();
        Log.e(A03, "WorkSpec id not found!");
        return false;
    }

    public void BX7(AnonymousClass69L r5, boolean z) {
        JobParameters jobParameters;
        AnonymousClass6VD A002 = AnonymousClass6VD.A00();
        String str = A03;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(r5.A01);
        AnonymousClass6VD.A03(A002, " executed on JobScheduler", str, A0u);
        Map map = this.A02;
        synchronized (map) {
            jobParameters = (JobParameters) map.remove(r5);
        }
        this.A01.A00(r5);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            AnonymousClass6VR A002 = AnonymousClass6VR.A00(getApplicationContext());
            this.A00 = A002;
            A002.A03.A02(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                AnonymousClass6VD.A00();
                Log.w(A03, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw AnonymousClass001.A09("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass6VR r0 = this.A00;
        if (r0 != null) {
            r0.A03.A03(this);
        }
    }
}
