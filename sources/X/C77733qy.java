package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3qy  reason: invalid class name and case insensitive filesystem */
public final class C77733qy implements C88964Us {
    public String A00 = "";
    public final C19630wG A01;
    public final C20810yC A02;

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public String BGE() {
        boolean A0E = this.A02.A0E(455);
        C19630wG r1 = this.A01;
        int i = R.string.f12nameremoved;
        if (A0E) {
            i = R.string.f12nameremoved;
        }
        String A012 = r1.A01(i);
        AnonymousClass00C.A0B(A012);
        return A012;
    }

    public C77733qy(C19630wG r2, C20810yC r3) {
        C36321k7.A0x(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BDM() {
        return "account_report";
    }

    public String BF6() {
        return "request_account_info";
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 2;
    }

    public /* synthetic */ boolean BN8() {
        return false;
    }

    public /* synthetic */ boolean BNj() {
        return true;
    }

    public /* synthetic */ boolean Bt1() {
        return true;
    }

    public /* synthetic */ Drawable getIcon() {
        return null;
    }

    public /* synthetic */ View BJ3(View view) {
        return null;
    }
}
