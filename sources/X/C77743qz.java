package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3qz  reason: invalid class name and case insensitive filesystem */
public final class C77743qz implements C88964Us {
    public String A00 = "";
    public final C19460v5 A01;
    public final C19630wG A02;

    public View BJ3(View view) {
        AnonymousClass00C.A0D(view, 0);
        return view.findViewById(R.id.business_tools);
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public String BGE() {
        this.A01.A02();
        throw AnonymousClass001.A0A("getSmbBusinessTitleStringId");
    }

    public Drawable getIcon() {
        return AnonymousClass00E.A00(this.A02.A00, R.drawable.ic_settings_business);
    }

    public C77743qz(C19460v5 r2, C19630wG r3) {
        C36321k7.A0x(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BDM() {
        return "business_tools";
    }

    public String BF6() {
        return "";
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 1;
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
