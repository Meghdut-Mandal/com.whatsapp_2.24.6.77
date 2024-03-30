package X;

import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;

/* renamed from: X.7s4  reason: invalid class name and case insensitive filesystem */
public class C164597s4 implements AnonymousClass7hQ {
    public Object A00;
    public final int A01;

    public C164597s4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BWq(String str, int i, int i2) {
        int i3;
        int i4 = i;
        if (this.A01 != 0) {
            C101514xp r0 = (C101514xp) this.A00;
            C116535kk r1 = r0.A08;
            synchronized (r0.A0B) {
            }
            EncBackupViewModel.A01(r1.A00, i);
            return;
        }
        C101504xo r12 = (C101504xo) this.A00;
        C159187ix r2 = r12.A08;
        synchronized (r12.A0B) {
            i3 = r12.A00;
        }
        r2.BWr(str, i4, i3, -1, i2);
    }
}
