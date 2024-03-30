package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1Hn  reason: invalid class name and case insensitive filesystem */
public final class C25751Hn {
    public C173158Qp A00;
    public final C25731Hl A01;
    public final C19630wG A02;

    public C25751Hn(C25731Hl r2, C19630wG r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public boolean A02(C173158Qp r4) {
        AnonymousClass00C.A0D(r4, 0);
        try {
            AnonymousClass6YY.A09(r4, A01());
            this.A00 = r4;
            this.A01.A02(true);
            return true;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatLockUserPasscodeStorage/setStoredPasscode: ");
            sb.append(e.getMessage());
            Log.e(sb.toString(), e.getCause());
            return false;
        }
    }

    public C173158Qp A00() {
        try {
            C173158Qp r0 = this.A00;
            if (r0 != null) {
                return r0;
            }
            byte[] A0W = AnonymousClass6YY.A0W(A01());
            AnonymousClass00C.A08(A0W);
            C173158Qp r02 = (C173158Qp) C170918Hz.A08(C173158Qp.DEFAULT_INSTANCE, A0W);
            this.A00 = r02;
            return r02;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatLockUserPasscodeStorage/getStoredPasscode: ");
            sb.append(e.getMessage());
            Log.e(sb.toString(), e.getCause());
            return null;
        }
    }

    public File A01() {
        return new File(this.A02.A00.getFilesDir(), "secret_code.key");
    }
}
