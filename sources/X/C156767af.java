package X;

import android.content.Context;
import java.io.File;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.7af  reason: invalid class name and case insensitive filesystem */
public class C156767af extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1Ax A00;
    public final File fileToDelete;
    public final int messageType;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C156767af(java.io.File r3, int r4) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "delete-media-file-job"
            r1.A00 = r0
            r0 = 1
            r1.A01 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            r2.fileToDelete = r3
            r2.messageType = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156767af.<init>(java.io.File, int):void");
    }

    public void A0B() {
        AnonymousClass1Ax r2 = this.A00;
        File file = this.fileToDelete;
        int i = this.messageType;
        AnonymousClass6YY.A0P(file);
        r2.A08(file, i);
    }

    public void Bqf(Context context) {
        this.A00 = (AnonymousClass1Ax) C36371kC.A0P(context).A4p.get();
    }
}
