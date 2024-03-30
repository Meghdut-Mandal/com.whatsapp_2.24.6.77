package X;

import com.whatsapp.util.Log;

/* renamed from: X.5zy  reason: invalid class name and case insensitive filesystem */
public abstract class C125475zy {
    public String A00() {
        Object obj;
        if (this instanceof C162977pS) {
            return ((C162977pS) this).A00;
        }
        if (!(this instanceof AnonymousClass5OH)) {
            return ((AnonymousClass5OG) this).A00.A02;
        }
        AnonymousClass5OH r0 = (AnonymousClass5OH) this;
        AnonymousClass6MZ r5 = r0.A00;
        String str = r0.A02;
        String str2 = r0.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36351kA.A1K(r5.A00, A0u);
        A0u.append(":");
        A0u.append(":");
        A0u.append(str);
        A0u.append(":");
        A0u.append("b3ee4083bc5153a49b8915306fcb062aac140bd37f9c3c5b42e55d85397fdf0c");
        A0u.append(":");
        C36351kA.A1K(C36401kF.A0x(r5.A01), A0u);
        boolean z = true;
        if (str2 == null || !AnonymousClass000.A1R(str2.length())) {
            z = false;
        }
        if (z || str2 != null) {
            try {
                String A05 = C18750th.A05(str2);
                A0u.append(":");
                A0u.append(A05);
                obj = A0u;
            } catch (Throwable th) {
                obj = C90524aI.A0t(th);
            }
            Throwable A00 = AnonymousClass0AK.A00(obj);
            if (A00 != null) {
                Log.e("Unable to calculate parameter hash.", A00);
            }
        }
        return C36381kD.A0y(A0u);
    }
}
