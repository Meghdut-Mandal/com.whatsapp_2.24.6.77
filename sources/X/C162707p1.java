package X;

import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7p1  reason: invalid class name and case insensitive filesystem */
public class C162707p1 extends C33131el {
    public Object A00;
    public final int A01;

    public C162707p1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean A00() {
        switch (this.A01) {
            case 0:
                AnonymousClass6FS r4 = (AnonymousClass6FS) this.A00;
                C33101ei r3 = r4.A04;
                AtomicBoolean atomicBoolean = r3.A0S;
                if (atomicBoolean.get()) {
                    if (!C90484aE.A1S(r3, r4.A06, r4.A00()) || !atomicBoolean.get()) {
                        return false;
                    }
                    return true;
                }
                break;
            case 1:
                AnonymousClass6FS r0 = (AnonymousClass6FS) this.A00;
                return C90484aE.A1S(r0.A04, r0.A06, r0.A00());
            default:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                if (restoreFromBackupActivity.A0w.get()) {
                    Log.i("restore>RestoreFromBackupActivity/one-time-setup-task/cancelled");
                    break;
                } else {
                    return restoreFromBackupActivity.A0C.A0I.A00();
                }
        }
        return false;
    }

    public String toString() {
        switch (this.A01) {
            case 0:
                return "media-restore-condition";
            case 1:
                return "suitable-condition";
            default:
                return "one-time-setup-condition";
        }
    }
}
