package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Iu  reason: invalid class name and case insensitive filesystem */
public abstract class C129876Iu {
    public static final List A00;
    public static final Map A01;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (r3 >= A00.size()) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C121745te A00(int r3) {
        /*
            if (r3 < 0) goto L_0x000b
            java.util.List r0 = A00
            int r0 = r0.size()
            r2 = 1
            if (r3 < r0) goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Filter ID does not exist: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)
            X.C18740tg.A0E(r2, r0)
            java.util.List r0 = A00
            java.lang.Object r0 = r0.get(r3)
            X.5te r0 = (X.C121745te) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129876Iu.A00(int):X.5te");
    }

    static {
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(new C121745te(0, R.string.f12nameremoved, (String) null));
        A0I.add(new C121745te(1, R.string.f12nameremoved, "filter_pop.png"));
        A0I.add(new C121745te(2, R.string.f12nameremoved, "filter_bw.png"));
        A0I.add(new C121745te(3, R.string.f12nameremoved, "filter_cool.png"));
        A0I.add(new C121745te(4, R.string.f12nameremoved, "filter_chrome.png"));
        A0I.add(new C121745te(5, R.string.f12nameremoved, "filter_film.png"));
        List<C121745te> unmodifiableList = Collections.unmodifiableList(A0I);
        A00 = unmodifiableList;
        HashMap A0J = AnonymousClass001.A0J();
        for (C121745te r1 : unmodifiableList) {
            A0J.put(r1.A02, r1);
        }
        A01 = Collections.unmodifiableMap(A0J);
    }
}
