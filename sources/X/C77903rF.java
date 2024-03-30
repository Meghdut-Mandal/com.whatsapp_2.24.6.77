package X;

import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.3rF  reason: invalid class name and case insensitive filesystem */
public class C77903rF implements C88564Te {
    public final /* synthetic */ AnonymousClass6VK A00;
    public final /* synthetic */ WaBloksActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C77903rF(AnonymousClass6VK r1, WaBloksActivity waBloksActivity, String str, List list) {
        this.A00 = r1;
        this.A03 = list;
        this.A01 = waBloksActivity;
        this.A02 = str;
    }

    public void BXj(Map map) {
        AnonymousClass6VK.A02(this.A01, this.A02);
    }

    public void BXk(AnonymousClass3XW r13) {
        String str;
        String str2;
        String str3 = r13.A03;
        if ((str3 == null || str3.length() == 0) && (((str = r13.A01) == null || str.length() == 0) && ((str2 = r13.A02) == null || str2.length() == 0))) {
            AnonymousClass6VK.A02(this.A01, this.A02);
            return;
        }
        List list = this.A03;
        String str4 = r13.A00;
        String str5 = r13.A01;
        WaBloksActivity waBloksActivity = this.A01;
        ((AnonymousClass1X4) this.A00.A0Y.get()).A0X((AnonymousClass3T1) null, str4, str3, str5, waBloksActivity.getString(R.string.f12nameremoved), list, r13.A00());
        if (list.size() == 1) {
            waBloksActivity.startActivity(C36441kJ.A0j().A1Z(waBloksActivity, (AnonymousClass11F) list.get(0), 0));
        }
    }
}
