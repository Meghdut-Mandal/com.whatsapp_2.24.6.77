package X;

import com.whatsapp.jobqueue.job.GetStatusPrivacyJob;

/* renamed from: X.5bY  reason: invalid class name and case insensitive filesystem */
public abstract class C110985bY {
    public static final GetStatusPrivacyJob A00(C19460v5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass673 r1 = new AnonymousClass673();
        r1.A00 = "GetStatusPrivacyJob";
        AnonymousClass673.A00(r1);
        if (!r2.A05()) {
            return new GetStatusPrivacyJob(r1.A01());
        }
        r2.A02();
        throw AnonymousClass001.A0A("getValidVNameRequirement");
    }
}
