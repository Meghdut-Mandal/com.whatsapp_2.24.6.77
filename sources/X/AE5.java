package X;

import android.content.res.Resources;
import com.whatsapp.R;

public class AE5 implements B2X {
    public final C192629Hy A00;

    public AnonymousClass1AL B7r(String str) {
        return null;
    }

    public boolean BNR() {
        return false;
    }

    public String BIY(Resources resources, C202319lY r5, String str) {
        if (r5.A02 == 420) {
            return resources.getString(R.string.f12nameremoved, AnonymousClass000.A1b(str));
        }
        C192629Hy r2 = this.A00;
        int A002 = AnonymousClass6R8.A00(r5.A0J, -1);
        String A003 = r2.A01.A00(A002);
        if (A003 != null) {
            return A003;
        }
        if (A002 != 20727) {
            return null;
        }
        return r2.A00.A01(R.string.f12nameremoved);
    }

    public AE5(C192629Hy r1) {
        this.A00 = r1;
    }
}
