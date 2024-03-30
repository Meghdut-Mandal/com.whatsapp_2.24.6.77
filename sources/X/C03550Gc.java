package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Gc  reason: invalid class name and case insensitive filesystem */
public final class C03550Gc extends C06750Ux {
    public final JobInfo A00;
    public final JobScheduler A01;

    public void A04(Intent intent) {
        this.A01.enqueue(this.A00, new JobWorkItem(intent));
    }

    public C03550Gc(ComponentName componentName, Context context, int i) {
        super(componentName);
        A03(i);
        this.A00 = new JobInfo.Builder(i, this.A02).setOverrideDeadline(0).build();
        this.A01 = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }
}
