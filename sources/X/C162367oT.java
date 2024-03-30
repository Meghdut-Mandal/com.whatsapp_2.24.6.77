package X;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.CountDownTimer;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;

/* renamed from: X.7oT  reason: invalid class name and case insensitive filesystem */
public class C162367oT extends CountDownTimer {
    public Object A00;
    public final int A01 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162367oT(AnonymousClass5D7 r3) {
        super(1000, 1000);
        this.A00 = r3;
    }

    public void onFinish() {
        if (this.A01 != 0) {
            AnonymousClass5D7 r4 = (AnonymousClass5D7) this.A00;
            WifiP2pManager wifiP2pManager = r4.A01;
            if (wifiP2pManager != null) {
                wifiP2pManager.requestGroupInfo(r4.A00, new C133736Zu(r4));
            }
            WifiP2pManager wifiP2pManager2 = r4.A01;
            if (wifiP2pManager2 != null) {
                wifiP2pManager2.requestConnectionInfo(r4.A00, new C164707sF(r4, 0));
                return;
            }
            return;
        }
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) this.A00;
        encBackupViewModel.A00 = null;
        encBackupViewModel.A08.A0C(C36411kG.A0t());
        C36341k9.A17(encBackupViewModel.A04, 1);
    }

    public void onTick(long j) {
        if (this.A01 == 0) {
            EncBackupViewModel encBackupViewModel = (EncBackupViewModel) this.A00;
            C001700s r5 = encBackupViewModel.A08;
            if (r5.A04() == null || C36431kI.A09(r5.A04()) - j >= 60000) {
                r5.A0C(Long.valueOf(j));
                C001700s r1 = encBackupViewModel.A04;
                r1.A0C(r1.A04());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162367oT(EncBackupViewModel encBackupViewModel, long j) {
        super(j, 60000);
        this.A00 = encBackupViewModel;
    }
}
