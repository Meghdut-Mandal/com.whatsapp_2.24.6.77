package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.3Rk  reason: invalid class name and case insensitive filesystem */
public class C65273Rk {
    public int A00;
    public int A01;
    public String A02 = "";
    public String A03;
    public String[] A04;
    public String[] A05;
    public final Locale A06;
    public final Locale A07;

    private void A00() {
        ArrayList arrayList;
        Locale locale = this.A06;
        String A032 = C26621Kw.A03(locale);
        Locale locale2 = this.A07;
        String A033 = C26621Kw.A03(locale2);
        boolean equals = A032.equals(A033);
        try {
            String[] strArr = (String[]) AnonymousClass9BF.A03.A01(this.A03);
            if (strArr == null) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList A14 = C36441kJ.A14(r2);
                for (String A002 : strArr) {
                    A14.add(AnonymousClass9ZR.A00(A002));
                }
                arrayList = A14;
            }
        } catch (IllegalArgumentException unused) {
            arrayList = Collections.emptyList();
        }
        if (!arrayList.isEmpty() || !equals) {
            int size = arrayList.size() + 2;
            ArrayList A142 = C36441kJ.A14(size);
            ArrayList A143 = C36441kJ.A14(size);
            A142.add(AnonymousClass9ZR.A01(locale2));
            A143.add(locale2.toLanguageTag());
            int i = -1;
            if (equals) {
                i = 0;
            }
            this.A00 = i;
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                Locale forLanguageTag = Locale.forLanguageTag(A0C);
                String A034 = C26621Kw.A03(forLanguageTag);
                if (!A034.equals(A033)) {
                    if (!C201129iv.A00(C201129iv.A04, C26621Kw.A03(forLanguageTag))) {
                        C36321k7.A1Q("whatsapplocaledata/getlanguagepreferencesdata/non-renderable language: ", A0C, AnonymousClass000.A0u());
                        stringBuffer.append(A0C);
                        stringBuffer.append(",");
                    } else {
                        A142.add(AnonymousClass9ZR.A01(forLanguageTag));
                        A143.add(forLanguageTag.toLanguageTag());
                        if (this.A00 == -1 && A034.equals(A032)) {
                            this.A00 = A142.size() - 1;
                        }
                    }
                }
            }
            if (this.A00 == -1) {
                A142.add(AnonymousClass9ZR.A01(locale));
                A143.add(locale.toLanguageTag());
                this.A00 = A142.size() - 1;
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.setLength(stringBuffer.length() - 1);
                this.A02 = stringBuffer.toString();
            }
            int size2 = A142.size();
            this.A01 = size2;
            if (size2 >= 2) {
                this.A04 = C36371kC.A1b(A142, 0);
                this.A05 = C36371kC.A1b(A143, 0);
                return;
            }
        }
        this.A01 = 0;
    }

    public C65273Rk(String str, Locale locale, Locale locale2) {
        this.A03 = str;
        this.A07 = locale;
        this.A06 = locale2;
        A00();
    }

    public C65273Rk(String str, String str2, Locale locale, Locale locale2) {
        String A012;
        if (!"1".equals(str) || str2.length() != 10 || !"55501".equals(str2.substring(3, 8))) {
            A012 = AnonymousClass1M4.A01(str, str2);
        } else {
            A012 = "QQ";
        }
        this.A03 = A012;
        this.A07 = locale;
        this.A06 = locale2;
        A00();
    }
}
