package X;

import com.whatsapp.util.Log;

/* renamed from: X.5dA  reason: invalid class name and case insensitive filesystem */
public class C111985dA implements AnonymousClass4TU {
    public Object A00;
    public final int A01;

    public C111985dA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onFailure(Exception exc) {
        if (this.A01 != 0) {
            AnonymousClass00C.A0D(exc, 0);
            Log.e("AvatarUserManagementHelper/generateTokenAfterMigration failed", exc);
            return;
        }
        AnonymousClass00C.A0D(exc, 0);
        Log.e("AvatarBackup/restore failed", exc);
        ((AnonymousClass777) this.A00).BVM(exc);
    }

    public void onSuccess() {
        if (this.A01 != 0) {
            AnonymousClass1XW r3 = (AnonymousClass1XW) this.A00;
            r3.A00.A0H(new C81133wW((Object) r3, 3));
            return;
        }
        ((AnonymousClass777) this.A00).BVO(C36371kC.A0m());
    }
}
