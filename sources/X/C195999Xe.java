package X;

import java.util.Arrays;

/* renamed from: X.9Xe  reason: invalid class name and case insensitive filesystem */
public abstract class C195999Xe {
    public String A00() {
        if (this instanceof AnonymousClass81P) {
            return ((AnonymousClass81P) this).A02;
        }
        String A0k = AnonymousClass000.A0k(this);
        return C165607th.A0o(A0k.lastIndexOf(36), A0k);
    }

    public void A01() {
        if (this instanceof AnonymousClass81P) {
            AnonymousClass81P r5 = (AnonymousClass81P) this;
            String str = r5.A02;
            AnonymousClass6YR.A03(str, "sup:MediaStreamState", "[%s] entering state");
            AnonymousClass9UM r2 = r5.A00.A02;
            if (r2 != null) {
                r2.A01(new AnonymousClass9GT(C90504aG.A0m("Enter state [%s]", Arrays.copyOf(new Object[]{str}, 1))));
            }
            r5.A01.A07();
        }
    }
}
