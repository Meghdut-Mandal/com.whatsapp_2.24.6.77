package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.9dd  reason: invalid class name and case insensitive filesystem */
public final class C198479dd {
    public final String A00;

    public final String A00(String str) {
        List list;
        String str2 = this.A00;
        if (str2 != null) {
            C21076A7n A01 = C200759iB.A01(str2);
            Object Bmq = A01.Bmq("$.length()", new C22902AyE[0]);
            AnonymousClass00C.A08(Bmq);
            int A0I = AnonymousClass000.A0I(Bmq);
            for (int i = 0; i < A0I; i++) {
                try {
                    list = (List) A01.Bmq(AnonymousClass000.A0q("].error_equals", C90464aC.A0h(i, "$.[")), new C22902AyE[0]);
                } catch (ClassCastException e) {
                    Log.e("FcsStateErrors: Failed to parse error_equals as a List<String>", e);
                    list = C023409w.A00;
                } catch (C173698Sr unused) {
                    list = C023409w.A00;
                }
                if (list.contains(str) || list.isEmpty()) {
                    return (String) A01.Bmq(AnonymousClass000.A0q("].next", C90464aC.A0h(i, "$.[")), new C22902AyE[0]);
                }
            }
        }
        return null;
    }

    public C198479dd(String str) {
        this.A00 = str;
    }

    public C198479dd() {
        this((String) null);
    }
}
