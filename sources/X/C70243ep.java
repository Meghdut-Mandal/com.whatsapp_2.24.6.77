package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ep  reason: invalid class name and case insensitive filesystem */
public class C70243ep implements C87564Ph {
    public final CharSequence A00;
    public final List A01;

    public final String A00() {
        List list = this.A01;
        if (list.size() > 1) {
            ArrayList A0J = C36321k7.A0J(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0J.add(AnonymousClass3U8.A04(C36351kA.A0j(C36391kE.A0f(it))));
            }
            return C36381kD.A0x(", ", A0J);
        }
        String A04 = AnonymousClass3U8.A04(C36351kA.A0j(getContact()));
        if (A04 == null) {
            return "";
        }
        return A04;
    }

    public AnonymousClass141 getContact() {
        if (this instanceof AnonymousClass2GV) {
            return ((AnonymousClass2GV) this).A00;
        }
        return (AnonymousClass141) C36391kE.A0t(this.A01);
    }

    public C70243ep(List list, CharSequence charSequence) {
        C36321k7.A0x(charSequence, list);
        this.A00 = charSequence;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NonWhatsAppContactListItem{displayName='");
        A0u.append(this.A00);
        A0u.append("', waContactList=");
        A0u.append(this.A01);
        return AnonymousClass000.A0s(A0u);
    }
}
