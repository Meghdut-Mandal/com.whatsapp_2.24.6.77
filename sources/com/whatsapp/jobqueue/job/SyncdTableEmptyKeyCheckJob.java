package com.whatsapp.jobqueue.job;

import X.AnonymousClass1AC;
import X.AnonymousClass1M0;
import X.AnonymousClass7i8;
import X.C18800tq;
import X.C237119n;
import X.C36351kA;
import X.C36371kC;
import android.content.Context;
import android.database.Cursor;
import com.whatsapp.util.Log;
import org.whispersystems.jobqueue.Job;

public class SyncdTableEmptyKeyCheckJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C237119n A00;
    public transient AnonymousClass1AC A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncdTableEmptyKeyCheckJob() {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            r0 = 1
            r1.A01 = r0
            java.lang.String r0 = "syncd-table-empty-key-check"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob.<init>():void");
    }

    public void A0B() {
        Cursor A09;
        Log.i("SyncdTableEmptyKeyCheckJob/onRun/start");
        AnonymousClass1M0 A03 = this.A01.A00.get();
        try {
            A09 = A03.A02.A09("SELECT 1 as has_empty_key FROM syncd_mutations WHERE device_id = 0  AND epoch = 0  LIMIT 1 ", "SyncdMutationsTable.HAS_EMPTY_KEY_EXIST_STATE", (String[]) null);
            boolean z = false;
            if (A09.moveToFirst() && C36351kA.A03(A09, "has_empty_key") == 1) {
                z = true;
            }
            A09.close();
            A03.close();
            if (z) {
                Log.e("SyncdTableEmptyKeyCheckJob/onRun/hasEmptyKeyMutation");
                this.A00.A03(7);
                return;
            }
            Log.i("SyncdTableEmptyKeyCheckJob/onRun/end");
            return;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void Bqf(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        this.A01 = (AnonymousClass1AC) A0P.A8R.get();
        this.A00 = (C237119n) A0P.A8S.get();
    }
}
