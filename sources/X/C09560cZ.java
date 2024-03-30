package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: X.0cZ  reason: invalid class name and case insensitive filesystem */
public final class C09560cZ implements C17050qd {
    public final JobWorkItem A00;
    public final /* synthetic */ C03060Da A01;

    public C09560cZ(JobWorkItem jobWorkItem, C03060Da r2) {
        this.A01 = r2;
        this.A00 = jobWorkItem;
    }

    public void B3D() {
        C03060Da r0 = this.A01;
        synchronized (r0.A02) {
            JobParameters jobParameters = r0.A00;
            if (jobParameters != null) {
                jobParameters.completeWork(this.A00);
            }
        }
    }

    public Intent getIntent() {
        return this.A00.getIntent();
    }
}
