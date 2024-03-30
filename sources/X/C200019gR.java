package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.9gR  reason: invalid class name and case insensitive filesystem */
public final class C200019gR {
    public final C18820ts A00;
    public final AnonymousClass1M4 A01;

    public static final LinkedHashMap A00(C206759tv r6) {
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass011[] r4 = new AnonymousClass011[2];
        C36341k9.A1J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.A04, r4, 0);
        AnonymousClass011[] r3 = new AnonymousClass011[2];
        C36341k9.A1J("width", Integer.valueOf(r6.A03), r3, 0);
        r3[1] = C36441kJ.A19("height", Integer.valueOf(r6.A02));
        C36341k9.A1J("original_dimensions", C000400e.A07(r3), r4, 1);
        LinkedHashMap A08 = C000400e.A08(r4);
        String str = r6.A00;
        if (str != null) {
            A08.put("original_image_url", str);
        }
        String str2 = r6.A01;
        if (str2 != null) {
            A08.put("request_image_url", str2);
        }
        return A08;
    }

    public final LinkedHashMap A01(C128506Cn r5) {
        AnonymousClass011[] r2 = new AnonymousClass011[4];
        C36341k9.A1J("category_id", r5.A01, r2, 0);
        C90464aC.A1F("is_last_level", Boolean.valueOf(r5.A04), r2);
        C90474aD.A1F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r5.A02, r2);
        C90474aD.A1G("media", C36391kE.A11("image", A00(r5.A00)), r2);
        return C000400e.A07(r2);
    }

    public final LinkedHashMap A02(C207269up r8) {
        String str;
        String str2;
        String str3;
        String str4;
        AnonymousClass00C.A0D(r8, 0);
        AnonymousClass011[] r3 = new AnonymousClass011[5];
        C36341k9.A1J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r8.A0F, r3, 0);
        r3[1] = C36441kJ.A19(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r8.A05);
        int i = r8.A00;
        if (i == 0) {
            str = "IN_STOCK";
        } else if (i == 1) {
            str = "OUT_STOCK";
        } else if (i != 2) {
            str = "UNKNOWN";
        } else {
            str = "AVAILABLE_FOR_ANOTHER_POSTCODE";
        }
        C90474aD.A1F("product_availability", str, r3);
        if (r8.A08) {
            str2 = "ISHIDDEN_TRUE";
        } else {
            str2 = "ISHIDDEN_FALSE";
        }
        C90474aD.A1G("is_hidden", str2, r3);
        C90484aE.A1H("max_available", Long.valueOf(r8.A09), r3);
        LinkedHashMap A08 = C000400e.A08(r3);
        String str5 = r8.A0C;
        if (str5 != null) {
            A08.put("description", str5);
        }
        BigDecimal bigDecimal = r8.A06;
        if (bigDecimal != null) {
            A08.put("price", String.valueOf(bigDecimal.unscaledValue()));
        }
        C132386Tk r0 = r8.A04;
        if (r0 != null) {
            A08.put("currency", r0.A00);
        }
        String str6 = r8.A0E;
        if (str6 != null) {
            A08.put("url", str6);
        }
        String str7 = r8.A0G;
        if (str7 != null) {
            A08.put("retailer_id", str7);
        }
        C206769tw r5 = r8.A01;
        if (r5 != null) {
            AnonymousClass011[] r4 = new AnonymousClass011[4];
            int i2 = r5.A00;
            if (i2 == 0) {
                str4 = "APPROVED";
            } else if (i2 == 1) {
                str4 = "REVIEWING";
            } else if (i2 == 2) {
                str4 = "REJECTED";
            } else if (i2 != 3) {
                str4 = "UNKNOWN";
            } else {
                str4 = "DELETED";
            }
            C36341k9.A1J("status", str4, r4, 0);
            C90464aC.A1F("can_appeal", Boolean.valueOf(r5.A03), r4);
            C90474aD.A1F("commerce_url", r5.A01, r4);
            C90474aD.A1G("reject_reason", r5.A02, r4);
            A08.put("status_info", C000400e.A07(r4));
        }
        C134726bV r52 = r8.A02;
        if (r52 != null) {
            AnonymousClass011[] r42 = new AnonymousClass011[1];
            C36341k9.A1J("price", String.valueOf(r52.A00.unscaledValue()), r42, 0);
            LinkedHashMap A082 = C000400e.A08(r42);
            Date date = r52.A02;
            if (date != null) {
                A082.put("start_date", Long.valueOf(date.getTime()));
            }
            Date date2 = r52.A01;
            if (date2 != null) {
                A082.put("end_date", Long.valueOf(date2.getTime()));
            }
            A08.put("sale_price", A082);
        }
        String str8 = r8.A0D;
        if (str8 != null) {
            A08.put("image_fetch_status", str8);
        }
        List list = r8.A07;
        if (C36401kF.A1a(list)) {
            ArrayList A0I = AnonymousClass001.A0I();
            for (C206759tv A002 : C007103b.A0V(list)) {
                A0I.add(A00(A002));
            }
            A08.put("media", C36391kE.A11("images", A0I));
        }
        C206589te r6 = r8.A0A;
        if (r6 != null) {
            LinkedHashMap A1G = C36431kI.A1G();
            String str9 = r6.A01;
            A1G.put("country_code_origin", str9);
            if ("N/A".equals(str9) || str9 == null) {
                str3 = null;
            } else {
                str3 = this.A01.A03(this.A00, str9);
            }
            A1G.put("country_name", str3);
            A1G.put("importer_name", r6.A02);
            C206779tx r62 = r6.A00;
            if (r62 != null) {
                AnonymousClass011[] r53 = new AnonymousClass011[6];
                C36341k9.A1J("street1", r62.A04, r53, 0);
                C36341k9.A1J("street2", r62.A05, r53, 1);
                C36341k9.A1J("city", r62.A00, r53, 2);
                C36341k9.A1J("region", r62.A03, r53, 3);
                C36341k9.A1J("postal_code", r62.A02, r53, 4);
                C36341k9.A1J("country_code", r62.A01, r53, 5);
                A1G.put("importer_address", C000400e.A07(r53));
            }
            A08.put("compliance_info", A1G);
        }
        return A08;
    }

    public C200019gR(C18820ts r1, AnonymousClass1M4 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
