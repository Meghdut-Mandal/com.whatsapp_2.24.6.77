package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3r5  reason: invalid class name and case insensitive filesystem */
public final class C77803r5 implements C88964Us {
    public String A00 = "";
    public final C19630wG A01;
    public final C20810yC A02;

    public View BJ3(View view) {
        AnonymousClass00C.A0D(view, 0);
        return view.findViewById(R.id.settings_old_debug_inflated);
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public List B8J() {
        return C36371kC.A11(C36371kC.A0v(this.A01, R.string.f12nameremoved));
    }

    public String BGE() {
        return C36371kC.A0v(this.A01, R.string.f12nameremoved);
    }

    public Drawable getIcon() {
        return AnonymousClass00E.A00(this.A01.A00, R.drawable.vec_ic_settings_bug_report);
    }

    public C77803r5(C19630wG r2, C20810yC r3) {
        C36321k7.A0x(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public String BDM() {
        return "old_debug";
    }

    public String BF6() {
        return "";
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 22;
    }

    public /* synthetic */ boolean BN8() {
        return false;
    }

    public boolean BNj() {
        return false;
    }

    public /* synthetic */ boolean Bt1() {
        return true;
    }
}
