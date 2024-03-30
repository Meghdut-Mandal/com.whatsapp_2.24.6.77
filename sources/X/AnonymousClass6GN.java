package X;

import android.app.job.JobParameters;
import android.net.Uri;

/* renamed from: X.6GN  reason: invalid class name */
public abstract class AnonymousClass6GN {
    public static Uri[] A00(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static String[] A01(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }
}
