package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3r2  reason: invalid class name and case insensitive filesystem */
public final class C77773r2 implements C88964Us {
    public String A00 = "";
    public final C19630wG A01;
    public final AnonymousClass13J A02;

    public View BJ3(View view) {
        AnonymousClass00C.A0D(view, 0);
        return view.findViewById(R.id.setting_tell_a_friend);
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public String BGE() {
        return C36371kC.A0v(this.A01, R.string.f12nameremoved);
    }

    public Drawable getIcon() {
        return AnonymousClass00E.A00(this.A01.A00, R.drawable.ic_settings_contacts);
    }

    public C77773r2(C19630wG r2, AnonymousClass13J r3) {
        C36321k7.A0x(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BDM() {
        return "tell_a_friend";
    }

    public String BF6() {
        return "";
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 7;
    }

    public /* synthetic */ boolean BN8() {
        return false;
    }

    public boolean BNj() {
        return true;
    }

    public /* synthetic */ boolean Bt1() {
        return true;
    }
}
