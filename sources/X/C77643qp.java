package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3qp  reason: invalid class name and case insensitive filesystem */
public final class C77643qp implements C88964Us {
    public String A00 = "";
    public final C19630wG A01;

    public C77643qp(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public View BJ3(View view) {
        AnonymousClass00C.A0D(view, 0);
        return view.findViewById(R.id.settings_gdrive_e2e_encryption);
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public String BGE() {
        return C36371kC.A0v(this.A01, R.string.f12nameremoved);
    }

    public boolean BNj() {
        return C34191gb.A08(this.A01.A00);
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BDM() {
        return "end_to_end_encrypted_backup";
    }

    public String BF6() {
        return "chat_backup";
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 3;
    }

    public /* synthetic */ boolean BN8() {
        return false;
    }

    public /* synthetic */ boolean Bt1() {
        return true;
    }

    public /* synthetic */ Drawable getIcon() {
        return null;
    }
}
