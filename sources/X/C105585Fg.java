package X;

import java.util.Map;

/* renamed from: X.5Fg  reason: invalid class name and case insensitive filesystem */
public final class C105585Fg extends AnonymousClass5MM {
    public final C117665md A00;
    public final C19770wU A01;
    public final String A02;
    public final String A03;

    public C105585Fg(C19600wD r7, C24601Db r8, C29121Vk r9, C117665md r10, C117705mh r11, C111495cN r12, C19770wU r13, String str, String str2) {
        super(r7, r8, r9, r11, r12);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r10;
        this.A01 = r13;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Integer num;
        AnonymousClass00I r6 = (AnonymousClass00I) obj;
        C117665md r3 = this.A00;
        if (r3 != null) {
            C202059ky r1 = null;
            if (r6 != null) {
                String str = (String) r6.A00;
                r1 = (C202059ky) r6.A01;
                if (!(str == null || str.length() == 0)) {
                    r3.A00.BiH(C36391kE.A11("card_token", str));
                    return;
                }
            }
            C159627jf r4 = r3.A00;
            if (r1 != null) {
                num = Integer.valueOf(r1.A00);
            } else {
                num = null;
            }
            r4.BXS(new AnonymousClass6PH(num, "PaymentNetworkError", (String) null), (Map) null);
        }
    }
}
