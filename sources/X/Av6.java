package X;

import java.util.HashSet;

public class Av6 extends C202299lU {
    public static final HashSet A01 = C36421kH.A0g(new String[]{"7BIT", "8BIT", "BASE64", "B"});
    public static final HashSet A02 = C36421kH.A0g(new String[]{"BEGIN", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER", "NAME", "PROFILE", "SOURCE", "NICKNAME", "CLASS", "SORT-STRING", "CATEGORIES", "PRODID"});
    public static final HashSet A03 = C36441kJ.A16();
    public String A00;

    public void A04(String str) {
        try {
            super.A04(str);
        } catch (AnonymousClass1YJ unused) {
            String[] split = str.split("=", 2);
            if (split.length == 2) {
                String A0a = C165617ti.A0a(split);
                String str2 = split[1];
                AnonymousClass9UV r0 = this.A0G;
                if (r0 != null) {
                    r0.A01 = A0a;
                    r0.A00(str2);
                    return;
                }
                return;
            }
            throw new AnonymousClass1YJ(AnonymousClass000.A0p("Unknown params value: ", str, AnonymousClass000.A0u()));
        }
    }
}
