package X;

import com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6yV  reason: invalid class name and case insensitive filesystem */
public class C148216yV implements C162117o3 {
    public final /* synthetic */ DeleteAccountFromHsmServerJob A00;
    public final /* synthetic */ AtomicInteger A01;

    public C148216yV(DeleteAccountFromHsmServerJob deleteAccountFromHsmServerJob, AtomicInteger atomicInteger) {
        this.A00 = deleteAccountFromHsmServerJob;
        this.A01 = atomicInteger;
    }

    public void onSuccess() {
        Log.i("DeleteAccountFromHsmServerJob/job successful");
    }

    public void BWq(String str, int i, int i2) {
        C36321k7.A1S("DeleteAccountFromHsmServerJob/job unsuccessful with error code: ", AnonymousClass000.A0u(), i);
        this.A01.set(i);
    }
}
