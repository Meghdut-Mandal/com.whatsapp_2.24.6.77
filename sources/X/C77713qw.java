package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3qw  reason: invalid class name and case insensitive filesystem */
public final class C77713qw implements C88964Us {
    public String A00 = "";
    public final AnonymousClass18U A01;
    public final C19630wG A02;

    public View BJ3(View view) {
        AnonymousClass00C.A0D(view, 0);
        return view.findViewById(R.id.app_auth_settings_preference);
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public boolean Bt1() {
        return false;
    }

    public String BGE() {
        C19630wG r2 = this.A02;
        boolean A1W = C36421kH.A1W(this.A01);
        int i = R.string.f12nameremoved;
        if (A1W) {
            i = R.string.f12nameremoved;
        }
        return C36371kC.A0v(r2, i);
    }

    public boolean BNj() {
        return this.A01.A05();
    }

    public C77713qw(AnonymousClass18U r2, C19630wG r3) {
        C36321k7.A0x(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BDM() {
        return "app_authentication";
    }

    public String BF6() {
        return "screen_lock";
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 11;
    }

    public /* synthetic */ boolean BN8() {
        return false;
    }

    public /* synthetic */ Drawable getIcon() {
        return null;
    }
}
