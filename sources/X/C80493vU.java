package X;

import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3vU  reason: invalid class name and case insensitive filesystem */
public class C80493vU implements Runnable {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public final int A04;

    public C80493vU(Object obj, int i, int i2, long j, long j2) {
        this.A04 = i2;
        this.A03 = obj;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                return;
            case 1:
                int i = this.A00;
                long j = this.A01;
                long j2 = this.A02;
                RestoreFromBackupActivity restoreFromBackupActivity = ((AnonymousClass29P) this.A03).A01;
                if (!RestoreFromBackupActivity.A0n(restoreFromBackupActivity)) {
                    restoreFromBackupActivity.A02.setIndeterminate(false);
                    restoreFromBackupActivity.A02.setProgress(i);
                    TextView textView = restoreFromBackupActivity.A04;
                    Object[] A1Q = C36441kJ.A1Q();
                    A1Q[0] = AnonymousClass3TF.A03(restoreFromBackupActivity.A00, j);
                    A1Q[1] = AnonymousClass3TF.A03(restoreFromBackupActivity.A00, j2);
                    C36371kC.A1M(restoreFromBackupActivity.A00, A1Q, i, 2);
                    C36341k9.A0s(restoreFromBackupActivity, textView, A1Q, R.string.f12nameremoved);
                    return;
                }
                Log.i("restore>RestoreFromBackupActivity/observer/activity exited during msgstore download progress");
                return;
            default:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A03;
                long j3 = this.A01;
                long j4 = this.A02;
                int i2 = this.A00;
                Log.i("storage-usage-gallery-activity/message delete completed");
                storageUsageGalleryActivity.Bnv();
                storageUsageGalleryActivity.A02 += j3;
                StorageUsageGalleryActivity.A07(storageUsageGalleryActivity);
                String str = storageUsageGalleryActivity.A0T;
                int i3 = storageUsageGalleryActivity.A00;
                C21010yW r2 = storageUsageGalleryActivity.A0L;
                C45492Ro r1 = new C45492Ro();
                C55572uq.A00(r1, str, 6, i3);
                r1.A04 = Long.valueOf(j4);
                r1.A03 = C36441kJ.A0y(i2);
                r2.Bly(r1);
                C62473Gh r0 = storageUsageGalleryActivity.A0D;
                if (r0 != null) {
                    r0.A03.clear();
                }
                AnonymousClass0V9 r02 = storageUsageGalleryActivity.A05;
                if (r02 != null) {
                    r02.A05();
                }
                if (j4 > 0) {
                    StorageUsageDeleteCompleteDialogFragment storageUsageDeleteCompleteDialogFragment = new StorageUsageDeleteCompleteDialogFragment();
                    Bundle A07 = AnonymousClass001.A07();
                    A07.putLong("deleted_disk_size", j4);
                    storageUsageDeleteCompleteDialogFragment.A17(A07);
                    C36331k8.A12(storageUsageDeleteCompleteDialogFragment, storageUsageGalleryActivity);
                }
                storageUsageGalleryActivity.A0R = null;
                return;
        }
    }
}
