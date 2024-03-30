package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6Mt  reason: invalid class name and case insensitive filesystem */
public final class C130876Mt {
    public AnonymousClass9Pa A00;
    public final AnonymousClass1KK A01;
    public final C19420v0 A02;
    public final C19770wU A03;

    public final void A01(C159167iv r8, String str, String str2) {
        C159167iv r4 = r8;
        String str3 = str;
        if (str == null || AnonymousClass098.A06(str) || str2 == null) {
            r8.BXR(C000400e.A0D());
            return;
        }
        if (str.equals(this.A02.A0l(str2))) {
            r8.onSuccess();
            return;
        }
        C222813r r0 = UserJid.Companion;
        this.A03.Boy(new C1503574y(this, C222813r.A01(str2), r4, str3, 4));
    }

    public C130876Mt(AnonymousClass9Pa r1, AnonymousClass1KK r2, C19420v0 r3, C19770wU r4) {
        C36321k7.A18(r1, r2, r4, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static final void A00(C159167iv r3, C130876Mt r4, C119055pA r5, UserJid userJid, String str, String str2) {
        String str3;
        int hashCode = str.hashCode();
        String str4 = "in_pin_code_invalid";
        if (hashCode != -1930003499) {
            if (hashCode != -1867169789) {
                if (hashCode == 688255102 && str.equals("unserviceable_location")) {
                    str4 = "in_pin_code_not_servicable";
                }
            } else if (str.equals("success")) {
                r3.onSuccess();
                if (r5 != null && (str3 = r5.A00) != null) {
                    C19420v0 r42 = r4.A02;
                    C36341k9.A0x(C19420v0.A00(r42), AnonymousClass000.A0p("dc_user_postcode_", userJid.getRawString(), AnonymousClass000.A0u()), str2);
                    C36341k9.A0x(C19420v0.A00(r42), AnonymousClass000.A0p("dc_location_name_", userJid.getRawString(), AnonymousClass000.A0u()), str3);
                    return;
                }
                return;
            }
        }
        r3.BXR(C36391kE.A11("validation_errors", C36391kE.A11("in_pin_code", str4)));
    }
}
