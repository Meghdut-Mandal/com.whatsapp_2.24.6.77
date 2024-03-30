package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3rB  reason: invalid class name and case insensitive filesystem */
public final class C77863rB implements C88964Us {
    public String A00 = "";
    public final AnonymousClass18U A01;
    public final C19630wG A02;
    public final C19420v0 A03;

    public View BJ3(View view) {
        AnonymousClass00C.A0D(view, 0);
        return view.findViewById(R.id.notification_preference);
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public boolean Bt1() {
        return false;
    }

    public String BGE() {
        return C36371kC.A0v(this.A02, R.string.f12nameremoved);
    }

    public boolean BNj() {
        if (!this.A01.A05() || !this.A03.A2K()) {
            return false;
        }
        return true;
    }

    public C77863rB(AnonymousClass18U r2, C19630wG r3, C19420v0 r4) {
        C36321k7.A11(r3, r2, r4);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BDM() {
        return "show_content_in_notifications";
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
