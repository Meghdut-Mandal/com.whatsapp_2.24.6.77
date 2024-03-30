package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.2jl  reason: invalid class name and case insensitive filesystem */
public abstract class C49832jl extends C132446Tt {
    public CharSequence A00;
    public String A01;
    public final /* synthetic */ AnonymousClass3L7 A02;

    public abstract AnonymousClass00I A0G(String str);

    public abstract String A0H(CharSequence charSequence, String str, Locale locale);

    public C49832jl(AnonymousClass3L7 r1, CharSequence charSequence, String str) {
        this.A02 = r1;
        this.A00 = charSequence;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List list;
        AnonymousClass3L7 r4 = this.A02;
        Locale A012 = r4.A07.A01();
        AnonymousClass00I A0G = A0G(A0H(this.A00, this.A01, A012));
        if (A0G == null || (list = (List) A0G.A01) == null || list.isEmpty()) {
            AnonymousClass2PY r1 = new AnonymousClass2PY();
            r1.A00 = Integer.valueOf(r4.A04());
            if (A012 != null) {
                r1.A01 = A012.getLanguage();
            }
            r1.A02 = r4.A04.A06();
            r4.A05.Blw(r1);
        }
        return A0G;
    }
}
