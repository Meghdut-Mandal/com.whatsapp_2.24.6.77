package X;

import java.util.Collection;
import java.util.Locale;

/* renamed from: X.7p7  reason: invalid class name and case insensitive filesystem */
public class C162767p7 extends C49832jl {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162767p7(C162787p9 r2, C1043759k r3, CharSequence charSequence, String str) {
        super(r3, charSequence, str);
        this.A01 = r3;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00I r5 = (AnonymousClass00I) obj;
        if (r5 == null) {
            ((AnonymousClass67Z) this.A00).A00((String) null, (Collection) null, true);
        } else {
            ((AnonymousClass67Z) this.A00).A00((String) r5.A00, (Collection) r5.A01, false);
        }
    }

    public AnonymousClass00I A0G(String str) {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass58R r1 = new AnonymousClass58R();
            r1.A08 = "Tenor";
            r1.A00 = C36371kC.A0n();
            return C1043859l.A01(r1, (C1043859l) obj, str);
        }
        AnonymousClass58R r12 = new AnonymousClass58R();
        r12.A08 = "Giphy";
        r12.A00 = C36371kC.A0n();
        return C1043759k.A00(r12, (C1043759k) obj, str);
    }

    public String A0H(CharSequence charSequence, String str, Locale locale) {
        String A002;
        String[] strArr;
        String A0q;
        if (this.A02 != 0) {
            AnonymousClass00C.A0D(charSequence, 1);
            String[] strArr2 = new String[6];
            strArr2[0] = "key";
            strArr2[1] = AnonymousClass6JD.A0X;
            strArr2[2] = "tag";
            strArr2[3] = charSequence.toString();
            strArr2[4] = "locale";
            C18820ts r6 = ((AnonymousClass3L7) this.A01).A04;
            if (locale != null) {
                String country = locale.getCountry();
                if (country == null || country.length() == 0) {
                    A0q = locale.getLanguage();
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append(locale.getLanguage());
                    A0u.append('_');
                    A0q = AnonymousClass000.A0q(locale.getCountry(), A0u);
                }
                AnonymousClass00C.A0B(A0q);
            } else {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append(r6.A06());
                A0u2.append('_');
                A0q = AnonymousClass000.A0q(r6.A05(), A0u2);
            }
            strArr2[5] = A0q;
            A002 = C54392ss.A00("https://wa.tenor.co/v1/search", strArr2);
            if (str == null || str.length() == 0) {
                return A002;
            }
            strArr = new String[2];
            strArr[0] = "pos";
        } else {
            AnonymousClass00C.A0D(charSequence, 1);
            A002 = C54392ss.A00("https://api.giphy.com/v1/gifs/search", "api_key", AnonymousClass6JD.A0I, "q", charSequence.toString(), "lang", AnonymousClass6W4.A00.A03(((AnonymousClass3L7) this.A01).A04, locale), "rating", "pg-13");
            if (str == null || str.length() == 0) {
                return A002;
            }
            strArr = new String[2];
            strArr[0] = "offset";
        }
        strArr[1] = str;
        return C54392ss.A00(A002, strArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162767p7(C162787p9 r2, C1043859l r3, CharSequence charSequence, String str) {
        super(r3, charSequence, str);
        this.A01 = r3;
        this.A00 = r2;
    }
}
