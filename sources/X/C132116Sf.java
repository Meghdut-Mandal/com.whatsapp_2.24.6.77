package X;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: X.6Sf  reason: invalid class name and case insensitive filesystem */
public class C132116Sf {
    public static final String A01 = AnonymousClass6VD.A01("SystemJobInfoConverter");
    public final ComponentName A00;

    public static JobInfo.TriggerContentUri A00(AnonymousClass667 r3) {
        return new JobInfo.TriggerContentUri(r3.A00, r3.A01 ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
        if (r6 >= 24) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        if (r6 >= 26) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.job.JobInfo A01(X.AnonymousClass6QA r12, int r13) {
        /*
            r11 = this;
            X.6Tb r8 = r12.A09
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r1 = r12.A0J
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            r4.putString(r0, r1)
            int r1 = r12.A0I
            java.lang.String r0 = "EXTRA_WORK_SPEC_GENERATION"
            r4.putInt(r0, r1)
            long r0 = r12.A05
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r5)
            java.lang.String r0 = "EXTRA_IS_PERIODIC"
            r4.putBoolean(r0, r1)
            android.content.ComponentName r0 = r11.A00
            android.app.job.JobInfo$Builder r1 = new android.app.job.JobInfo$Builder
            r1.<init>(r13, r0)
            boolean r0 = r8.A05
            android.app.job.JobInfo$Builder r0 = r1.setRequiresCharging(r0)
            boolean r5 = r8.A06
            android.app.job.JobInfo$Builder r0 = r0.setRequiresDeviceIdle(r5)
            android.app.job.JobInfo$Builder r7 = r0.setExtras(r4)
            java.lang.Integer r10 = r8.A02
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r6 < r0) goto L_0x00ae
            java.lang.Integer r0 = X.C023109s.A0S
            if (r10 != r0) goto L_0x00ae
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r0 = 25
            android.net.NetworkRequest$Builder r0 = r1.addCapability(r0)
            android.net.NetworkRequest r0 = r0.build()
            r7.setRequiredNetwork(r0)
        L_0x0059:
            r9 = 0
            r10 = 1
            if (r5 != 0) goto L_0x006a
            java.lang.Integer r1 = r12.A0C
            java.lang.Integer r0 = X.C023109s.A01
            r4 = 1
            if (r1 != r0) goto L_0x0065
            r4 = 0
        L_0x0065:
            long r0 = r12.A02
            r7.setBackoffCriteria(r0, r4)
        L_0x006a:
            long r0 = r12.A04()
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            long r4 = java.lang.Math.max(r0, r2)
            r0 = 28
            if (r6 <= r0) goto L_0x00a6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00a6
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x0086
            r7.setImportantWhileForeground(r10)
        L_0x0086:
            java.util.Set r1 = r8.A03
            boolean r0 = X.C90514aH.A1a(r1)
            if (r0 == 0) goto L_0x00f2
            java.util.Iterator r1 = r1.iterator()
        L_0x0092:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r1.next()
            X.667 r0 = (X.AnonymousClass667) r0
            android.app.job.JobInfo$TriggerContentUri r0 = A00(r0)
            r7.addTriggerContentUri(r0)
            goto L_0x0092
        L_0x00a6:
            r7.setMinimumLatency(r4)
            r0 = 24
            if (r6 < r0) goto L_0x00f2
            goto L_0x0086
        L_0x00ae:
            int r9 = r10.intValue()
            r4 = 1
            r0 = 0
            r1 = 0
            if (r9 == r0) goto L_0x00c6
            r1 = 2
            if (r9 == r4) goto L_0x00e6
            r0 = 3
            if (r9 == r1) goto L_0x00c6
            r1 = 4
            if (r9 == r0) goto L_0x00ca
            if (r9 != r1) goto L_0x00d0
            r0 = 26
            if (r6 < r0) goto L_0x00d0
        L_0x00c6:
            r7.setRequiredNetworkType(r1)
            goto L_0x0059
        L_0x00ca:
            r0 = 24
            if (r6 < r0) goto L_0x00d0
            r1 = 3
            goto L_0x00c6
        L_0x00d0:
            X.6VD r9 = X.AnonymousClass6VD.A00()
            java.lang.String r4 = A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "API version too low. Cannot convert network type value "
            r1.append(r0)
            java.lang.String r0 = X.C109395Xk.A00(r10)
            X.AnonymousClass6VD.A03(r9, r0, r4, r1)
        L_0x00e6:
            r1 = 1
            goto L_0x00c6
        L_0x00e8:
            long r0 = r8.A01
            r7.setTriggerContentUpdateDelay(r0)
            long r0 = r8.A00
            r7.setTriggerContentMaxDelay(r0)
        L_0x00f2:
            r7.setPersisted(r9)
            r0 = 26
            if (r6 < r0) goto L_0x0103
            boolean r0 = r8.A04
            r7.setRequiresBatteryNotLow(r0)
            boolean r0 = r8.A07
            r7.setRequiresStorageNotLow(r0)
        L_0x0103:
            int r0 = r12.A01
            boolean r1 = X.AnonymousClass000.A1R(r0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
            r9 = 1
        L_0x010e:
            r0 = 31
            if (r6 < r0) goto L_0x011d
            boolean r0 = r12.A0H
            if (r0 == 0) goto L_0x011d
            if (r1 != 0) goto L_0x011d
            if (r9 != 0) goto L_0x011d
            r7.setExpedited(r10)
        L_0x011d:
            android.app.job.JobInfo r0 = r7.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132116Sf.A01(X.6QA, int):android.app.job.JobInfo");
    }

    public C132116Sf(Context context) {
        this.A00 = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
