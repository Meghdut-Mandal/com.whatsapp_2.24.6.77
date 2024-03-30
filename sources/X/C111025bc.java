package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.whatsapp.media.download.service.MediaDownloadJobService;

/* renamed from: X.5bc  reason: invalid class name and case insensitive filesystem */
public abstract class C111025bc {
    public static void A00(Context context, C21060yb r6) {
        for (JobInfo id : ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs()) {
            if (id.getId() == 15) {
                return;
            }
        }
        JobScheduler jobScheduler = r6.A01;
        if (jobScheduler == null) {
            jobScheduler = (JobScheduler) C21060yb.A03(r6, "jobscheduler", true);
            r6.A01 = jobScheduler;
            if (jobScheduler == null) {
                return;
            }
        }
        jobScheduler.schedule(new JobInfo.Builder(15, new ComponentName(context, MediaDownloadJobService.class)).setRequiredNetworkType(1).setUserInitiated(true).build());
    }
}
