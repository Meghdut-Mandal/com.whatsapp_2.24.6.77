package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3qv  reason: invalid class name and case insensitive filesystem */
public final class C77703qv implements C88964Us {
    public String A00 = "";
    public final C19630wG A01;

    public C77703qv(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public View BJ3(View view) {
        AnonymousClass00C.A0D(view, 0);
        return view.findViewById(R.id.storage_usage_save_space_row);
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public String BGE() {
        return C36371kC.A0v(this.A01, R.string.f12nameremoved);
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BDM() {
        return "disappearing_messages_storage";
    }

    public String BF6() {
        return "manage_storage";
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 5;
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
}
