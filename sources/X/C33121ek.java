package X;

import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.1ek  reason: invalid class name and case insensitive filesystem */
public class C33121ek extends C19580wB {
    public volatile int A00 = -1;
    public volatile int A01 = -1;

    public void A00() {
        Log.i("GoogleBackupRestoreObservable/backup cancelled");
        this.A00 = 0;
        for (C33151eo BRq : getObservers()) {
            BRq.BRq();
        }
    }

    public void A01() {
        Log.i("restore>GoogleBackupRestoreObservable/notify-media-restore-cancelled");
        this.A01 = -1;
        for (C33151eo Bab : getObservers()) {
            Bab.Bab();
        }
    }

    public void A07(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleBackupRestoreObservable/backup-end/success: ");
        sb.append(z);
        Log.i(sb.toString());
        this.A00 = 0;
        for (C33151eo BRr : getObservers()) {
            BRr.BRr(z);
        }
    }

    public void A02(int i, Bundle bundle) {
        for (C33151eo BX0 : getObservers()) {
            BX0.BX0(i, bundle);
        }
    }

    public void A03(int i, Bundle bundle) {
        for (C33151eo BX1 : getObservers()) {
            BX1.BX1(i, bundle);
        }
    }

    public void A04(long j, long j2) {
        for (C33151eo BRz : getObservers()) {
            BRz.BRz(j, j2);
        }
    }

    public void A05(long j, long j2) {
        for (C33151eo Bb2 : getObservers()) {
            Bb2.Bb2(j, j2);
        }
    }

    public void A06(boolean z) {
        for (C33151eo BQb : getObservers()) {
            BQb.BQb(z);
        }
    }

    public void A08(boolean z) {
        for (C33151eo Bb1 : getObservers()) {
            Bb1.Bb1(z);
        }
    }
}
