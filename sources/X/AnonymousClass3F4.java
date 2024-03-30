package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3F4  reason: invalid class name */
public class AnonymousClass3F4 {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    public AnonymousClass3F4 A00() {
        ArrayList arrayList;
        String str = this.A02;
        String str2 = this.A03;
        List list = this.A06;
        if (list != null) {
            arrayList = C36441kJ.A15(list);
        } else {
            arrayList = null;
        }
        return new AnonymousClass3F4(this.A00, str, str2, this.A05, this.A01, this.A04, arrayList, this.A07);
    }

    public AnonymousClass3F4(Long l, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        this.A02 = str;
        this.A03 = str2;
        this.A06 = list;
        this.A05 = str3;
        this.A00 = l;
        this.A01 = str4;
        this.A04 = str5;
        this.A07 = z;
    }
}
