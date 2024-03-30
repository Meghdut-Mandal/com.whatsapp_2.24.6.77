package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1LY  reason: invalid class name */
public final class AnonymousClass1LY {
    public final AnonymousClass196 A00;
    public final Map A01;
    public final C26671Lb A02;
    public final C19970wo A03;
    public final C19770wU A04;

    public AnonymousClass1LY(AnonymousClass196 r11, C26671Lb r12, C19970wo r13, C19420v0 r14, C20810yC r15, C19770wU r16) {
        AnonymousClass00C.A0D(r15, 1);
        AnonymousClass00C.A0D(r13, 2);
        C19770wU r0 = r16;
        AnonymousClass00C.A0D(r0, 3);
        AnonymousClass00C.A0D(r12, 4);
        AnonymousClass00C.A0D(r14, 5);
        AnonymousClass00C.A0D(r11, 6);
        this.A03 = r13;
        this.A04 = r0;
        this.A02 = r12;
        this.A00 = r11;
        this.A01 = C000400e.A08(new AnonymousClass011("community_home", new C26711Lf(r14)), new AnonymousClass011("community", new C26721Lg(r14, r15)), new AnonymousClass011("ephemeral", new C26731Lh(r14)), new AnonymousClass011("ephemeral_view_once", new C26741Li(r14)), new AnonymousClass011("ephemeral_view_once_receiver", new C26751Lj(r14)), new AnonymousClass011("newsletter_multi_admin", new C26761Lk(r14)), new AnonymousClass011("support_ai", new C26771Ll(r14)), new AnonymousClass011("community_events", new C26781Lm(r13, r14)));
    }

    public final boolean A01(Object obj, String str) {
        C26701Le r1;
        Object obj2 = this.A01.get(str);
        if ((obj2 instanceof C26701Le) && (r1 = (C26701Le) obj2) != null) {
            return r1.BJz(obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Support for the nux key ");
        sb.append(str);
        sb.append(" has not been added yet.");
        Log.e(sb.toString());
        return false;
    }

    public final void A00(String str, Object obj) {
        Object obj2 = this.A01.get(str);
        if (!(obj2 instanceof C26701Le) || obj2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Support for the nux key ");
            sb.append(str);
            sb.append(" has not been added yet.");
            Log.e(sb.toString());
            return;
        }
        this.A04.Boy(new C35631j0(obj2, obj, this, 46));
    }
}
