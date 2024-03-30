package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Hy  reason: invalid class name and case insensitive filesystem */
public final class C25861Hy {
    public final C25871Hz A00;
    public final C19970wo A01;
    public final AnonymousClass1DW A02;
    public final C20810yC A03;

    public C25861Hy(C19970wo r2, C25871Hz r3, AnonymousClass1DW r4, C20810yC r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r4, 4);
        this.A01 = r2;
        this.A03 = r5;
        this.A00 = r3;
        this.A02 = r4;
    }

    public final AnonymousClass9TX A00(AnonymousClass3PE r18, UserJid userJid) {
        String str;
        String str2;
        AnonymousClass3PE r5 = r18;
        AnonymousClass00C.A0D(r5, 1);
        String str3 = r5.A06;
        if (!TextUtils.isEmpty(str3) && str3.contains("ctwa")) {
            if (!C20800yB.A01(C21000yV.A02, this.A03, 5151)) {
                UserJid userJid2 = userJid;
                if (userJid != null && (str = r5.A0A) != null && (str2 = r5.A05) != null) {
                    return new C175418aS(userJid2, str2, str, "", r5.A0C, -1, System.currentTimeMillis(), r5.A0E, r5.A0G, r5.A0F);
                }
                String str4 = r5.A05;
                String str5 = r5.A0A;
                if (userJid == null) {
                    C25871Hz.A00(this.A00, 2);
                }
                if (str4 == null) {
                    this.A00.A01(userJid2, 5);
                }
                if (str5 == null) {
                    this.A00.A01(userJid2, 4);
                }
            }
        }
        return new AnonymousClass54P();
    }
}
