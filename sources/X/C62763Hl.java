package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.businessdirectory.view.activity.DirectoryBusinessChainingActivity;
import com.whatsapp.jid.Jid;

/* renamed from: X.3Hl  reason: invalid class name and case insensitive filesystem */
public class C62763Hl {
    public final C19730wQ A00;
    public final AnonymousClass1QW A01;

    public void A00(Activity activity, AnonymousClass141 r6) {
        if (r6.A0H != null && A01(r6) && r6.A0K() != null) {
            AnonymousClass11F r3 = r6.A0H;
            String A0K = r6.A0K();
            Intent A0H = C36441kJ.A0H(activity, DirectoryBusinessChainingActivity.class);
            A0H.putExtra("directory_biz_chaining_jid", r3);
            A0H.putExtra("directory_biz_chaining_name", A0K);
            activity.startActivity(A0H);
        }
    }

    public boolean A01(AnonymousClass141 r4) {
        Jid A0h;
        AnonymousClass1QW r2 = this.A01;
        C20810yC r1 = r2.A03;
        if (!r1.A0E(1616) || !r2.A02() || !r4.A0C() || (((!r1.A0E(2192) || !r2.A02()) && ((!r1.A0E(1616) || !r2.A02() || !r1.A0E(1764)) && ((A0h = C36431kI.A0h(r4)) == null || !A0h.getRawString().startsWith("5511")))) || AnonymousClass3M3.A01(r2.A00, r4.A0H))) {
            return false;
        }
        return true;
    }

    public C62763Hl(C19730wQ r1, AnonymousClass1QW r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
