package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.73b  reason: invalid class name and case insensitive filesystem */
public class C1498673b implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public C1498673b(Object obj, Object obj2, Object obj3, int i, int i2, boolean z) {
        this.A05 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = i;
        this.A04 = z;
    }

    public final void run() {
        String str;
        if (this.A05 != 0) {
            boolean z = this.A04;
            C130456Ld r9 = (C130456Ld) this.A01;
            int i = this.A00;
            C006302t r10 = (C006302t) this.A02;
            C006302t r11 = (C006302t) this.A03;
            if (!z) {
                String string = C36411kG.A0E(r9.A01.A01).getString("pref_avatar_profile_photo_poses", (String) null);
                if (string != null) {
                    JSONArray jSONArray = new JSONArray(string);
                    ArrayList A0I = AnonymousClass001.A0I();
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        String string2 = jSONObject.getString("url");
                        if (jSONObject.has("emojis")) {
                            str = jSONObject.getString("emojis");
                        } else {
                            str = null;
                        }
                        AnonymousClass00C.A0B(string2);
                        A0I.add(new C134646bN(string2, str));
                    }
                    AnonymousClass1HC r1 = r9.A02;
                    r1.A01(i, "urls_read_from_cache");
                    List A002 = C130456Ld.A00(r9, A0I, false, true);
                    if (!A002.isEmpty()) {
                        r1.A01(i, "bitmaps_read_from_cache");
                        r9.A00.A0H(new C1498072v(r10, A002, 48));
                        return;
                    }
                }
                r9.A03.Bp1(new C1498673b(r9, r10, r11, i, 1, true));
                return;
            }
            C120105qy r3 = (C120105qy) r9.A05.get();
            C146026uu B3y = r3.A01.B3y(new AnonymousClass6GG(r3, 4));
            C139346jd r2 = new C139346jd(new AnonymousClass7UO(r9, r11), new AnonymousClass7VT(r9, r10, r11, i), 3);
            r9.A02.A01(i, "graphql_request_posted");
            B3y.Blp(r2);
            return;
        }
        C019408g r4 = (C019408g) this.A02;
        Object obj = this.A03;
        int i3 = this.A00;
        boolean z2 = this.A04;
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass17Y r0 = ((AnonymousClass6PU) this.A01).A00;
        if (r0 != null) {
            r0.A02();
            r4.BKt(obj, Integer.valueOf(i3), Boolean.valueOf(z2));
            return;
        }
        throw C36321k7.A06();
    }
}
