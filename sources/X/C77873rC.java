package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3rC  reason: invalid class name and case insensitive filesystem */
public final class C77873rC implements C88964Us {
    public String A00 = "";
    public final C19730wQ A01;
    public final C19630wG A02;
    public final C20810yC A03;

    public View BJ3(View view) {
        AnonymousClass00C.A0D(view, 0);
        return view.findViewById(R.id.settings_avatar);
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public List B8J() {
        return C36371kC.A11(C36371kC.A0v(this.A02, R.string.f12nameremoved));
    }

    public String BGE() {
        return C36371kC.A0v(this.A02, R.string.f12nameremoved);
    }

    public boolean BNj() {
        if (this.A01.A0L() || !this.A03.A0E(1396)) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass00E.A00(this.A02.A00, R.drawable.ic_settings_avatar);
    }

    public C77873rC(C19730wQ r2, C19630wG r3, C20810yC r4) {
        C36321k7.A11(r3, r2, r4);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public String BDM() {
        return "avatar";
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

    public /* synthetic */ boolean Bt1() {
        return true;
    }
}
