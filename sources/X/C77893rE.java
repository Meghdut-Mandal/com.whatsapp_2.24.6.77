package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3rE  reason: invalid class name and case insensitive filesystem */
public final class C77893rE implements C88964Us {
    public String A00 = "";
    public final C19460v5 A01;
    public final C19460v5 A02;
    public final C19460v5 A03;
    public final C19730wQ A04;
    public final C19630wG A05;

    public View BJ3(View view) {
        AnonymousClass00C.A0D(view, 0);
        return view.findViewById(R.id.premium_tools);
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public String BGE() {
        this.A02.A02();
        throw AnonymousClass001.A0A("getSmbPremiumToolsTitleStringId");
    }

    public boolean BNj() {
        C19460v5 r1 = this.A03;
        if (!r1.A05() || this.A04.A0L()) {
            return false;
        }
        r1.A02();
        throw AnonymousClass001.A0A("isOnlyPremiumFeatureEnabled");
    }

    public Drawable getIcon() {
        this.A01.A02();
        throw AnonymousClass001.A0A("getSettingsPremiumIconId");
    }

    public C77893rE(C19460v5 r2, C19460v5 r3, C19460v5 r4, C19730wQ r5, C19630wG r6) {
        C36321k7.A1B(r6, r2, r5, r3, r4);
        this.A05 = r6;
        this.A02 = r2;
        this.A04 = r5;
        this.A03 = r3;
        this.A01 = r4;
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BDM() {
        return "premium_subscription";
    }

    public String BF6() {
        return "";
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 10;
    }

    public /* synthetic */ boolean BN8() {
        return false;
    }

    public /* synthetic */ boolean Bt1() {
        return true;
    }
}
