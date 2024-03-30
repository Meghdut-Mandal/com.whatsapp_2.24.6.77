package X;

import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.83B  reason: invalid class name */
public class AnonymousClass83B extends AnonymousClass9GL {
    public AnonymousClass9SN A00;
    public final AnonymousClass9SG A01;
    public final AtomicReference A02;

    public static boolean A00(C207099uY r1, List list) {
        String A002;
        String str = r1.A0R;
        if (str == null) {
            A002 = null;
        } else {
            try {
                A002 = new Locale(str).getISO3Language();
            } catch (MissingResourceException unused) {
                A002 = C1897495k.A00(str);
            }
        }
        return list.contains(A002);
    }

    public void A01(AnonymousClass839 r3) {
        C209329zp r0;
        AnonymousClass83A r1 = new AnonymousClass83A(r3);
        Objects.requireNonNull(r1);
        if (!this.A02.getAndSet(r1).equals(r1) && (r0 = this.A00) != null) {
            r0.A0g.A00.sendEmptyMessage(11);
        }
    }

    public AnonymousClass83B(AnonymousClass9SG r3) {
        this.A01 = r3;
        this.A02 = new AtomicReference(AnonymousClass83A.A09);
    }

    public AnonymousClass83B() {
        this((AnonymousClass9SG) null);
    }
}
