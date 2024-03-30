package X;

import android.content.Context;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.6HV  reason: invalid class name */
public class AnonymousClass6HV {
    public static void A00(Context context, Job job) {
        if (job instanceof AnonymousClass7i8) {
            ((AnonymousClass7i8) job).Bqf(context);
        }
        for (Requirement requirement : job.parameters.requirements) {
            if (requirement instanceof AnonymousClass7i8) {
                ((AnonymousClass7i8) requirement).Bqf(context);
            }
        }
    }
}
