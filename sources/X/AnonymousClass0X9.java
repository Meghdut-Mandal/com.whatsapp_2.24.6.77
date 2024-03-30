package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0X9  reason: invalid class name */
public class AnonymousClass0X9 {
    public View A00;
    public final ArrayList A01 = AnonymousClass001.A0I();
    public final Map A02 = AnonymousClass001.A0J();

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0X9) {
            AnonymousClass0X9 r3 = (AnonymousClass0X9) obj;
            if (this.A00 != r3.A00 || !this.A02.equals(r3.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A02.hashCode();
    }

    public AnonymousClass0X9(View view) {
        this.A00 = view;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TransitionValues@");
        A0u.append(Integer.toHexString(hashCode()));
        StringBuilder A0v = AnonymousClass000.A0v(AnonymousClass000.A0q(":\n", A0u));
        A0v.append("    view = ");
        A0v.append(this.A00);
        String A0q = AnonymousClass000.A0q("    values:", AnonymousClass000.A0v(AnonymousClass000.A0q("\n", A0v)));
        Map map = this.A02;
        Iterator A10 = AnonymousClass000.A10(map);
        while (A10.hasNext()) {
            String A0C = AnonymousClass001.A0C(A10);
            StringBuilder A0v2 = AnonymousClass000.A0v(A0q);
            A0v2.append("    ");
            A0v2.append(A0C);
            A0v2.append(": ");
            A0v2.append(map.get(A0C));
            A0q = AnonymousClass000.A0q("\n", A0v2);
        }
        return A0q;
    }

    @Deprecated
    public AnonymousClass0X9() {
    }
}
