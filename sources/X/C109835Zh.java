package X;

import android.os.Build;
import com.whatsapp.backup.google.workers.BackupGpbSignalWorker;

/* renamed from: X.5Zh  reason: invalid class name and case insensitive filesystem */
public abstract class C109835Zh {
    public static final void A00(C24461Cn r11, C19420v0 r12, C20810yC r13, C21570zS r14) {
        AnonymousClass00C.A0D(r13, 0);
        C36321k7.A11(r14, r12, r11);
        boolean A0E = AnonymousClass6YN.A0E(r12);
        boolean z = C36411kG.A0E(r11.A01).getBoolean("send_gpb_signal", false);
        boolean z2 = true;
        boolean z3 = !AnonymousClass6YN.A0A(r11, r13);
        switch (r12.A0E()) {
            case 11:
            case 12:
            case 20:
            case 21:
            case 25:
            case 28:
            case 29:
            case 30:
            case 31:
                z2 = false;
                break;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BackupGpbSignalWorker/enqueueUniqueWork shouldRun = ");
        A0u.append(A0E);
        A0u.append(" & ");
        A0u.append(z);
        A0u.append(" & ");
        A0u.append(z3);
        C36321k7.A1X(" & ", A0u, z2);
        if (A0E && z && z3 && z2) {
            C97384pE r2 = new C97384pE(BackupGpbSignalWorker.class);
            Integer num = C023109s.A01;
            r2.A03(new C132316Tb(num, C004702c.A00, -1, -1, false, false, false, false));
            if (Build.VERSION.SDK_INT >= 31) {
                r2.A04(C023109s.A00);
            }
            C90514aH.A0V(r14).A07((C97404pG) r2.A00(), num, "BackupGpbSignalWorker");
        }
    }
}
