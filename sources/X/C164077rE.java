package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.workers.GoogleBackupWorker;

/* renamed from: X.7rE  reason: invalid class name and case insensitive filesystem */
public class C164077rE implements AnonymousClass7fW {
    public Object A00;
    public final int A01;

    public C164077rE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onError(int i) {
        if (this.A01 != 0) {
            GoogleBackupWorker.A01((GoogleBackupWorker) this.A00, i);
        } else {
            ((GoogleBackupService) this.A00).A08.A06(i);
        }
    }
}
