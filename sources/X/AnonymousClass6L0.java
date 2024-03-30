package X;

import android.text.Html;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6L0  reason: invalid class name */
public final class AnonymousClass6L0 {
    public int A00;
    public List A01 = A00(this);
    public boolean A02 = Locale.getDefault().getLanguage().equals("pt");
    public final C20810yC A03;
    public final C19630wG A04;

    public static final List A00(AnonymousClass6L0 r6) {
        boolean z = r6.A02;
        C20810yC r1 = r6.A03;
        int i = 2010;
        if (z) {
            i = 2011;
        }
        String A09 = r1.A09(i);
        AnonymousClass00C.A0D(A09, 0);
        List A0K = AnonymousClass099.A0K(A09, String.valueOf(new char[]{':'}[0]), 0);
        ArrayList A0J = C36321k7.A0J(A0K);
        Iterator it = A0K.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C36421kH.A0B(r6.A04).getString(R.string.f12nameremoved));
            A0u.append(" \"");
            A0u.append(Html.fromHtml(A0C));
            A0J.add(AnonymousClass000.A0t(A0u, '\"'));
        }
        return A0J;
    }

    public AnonymousClass6L0(C19630wG r3, C20810yC r4) {
        C36321k7.A0x(r3, r4);
        this.A04 = r3;
        this.A03 = r4;
    }
}
