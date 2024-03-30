package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.4rS  reason: invalid class name and case insensitive filesystem */
public class C98454rS extends C98464rT implements C17560rc {
    public C140926mO A00;

    public void A00(Context context) {
        AnonymousClass6O6 r0;
        synchronized (AnonymousClass6O6.class) {
            r0 = AnonymousClass6O6.A03;
            if (r0 == null) {
                r0 = new AnonymousClass6O6(context);
                AnonymousClass6O6.A03 = r0;
            }
        }
        this.A00 = r0;
        this.A01 = this;
        this.A00 = new C140926mO(context, this);
    }

    public C157877ep B3b(C125255za r4) {
        if (!(this instanceof C98444rR)) {
            return null;
        }
        C98444rR r2 = (C98444rR) this;
        AnonymousClass00C.A0D(r4, 0);
        String A01 = r4.A01();
        switch (A01.hashCode()) {
            case 101264299:
                if (A01.equals("eviction.v2")) {
                    return (C140906mM) r2.A01.A00.getValue();
                }
                return null;
            case 351608024:
                if (A01.equals("version")) {
                    return (C140896mL) r2.A01.A03.getValue();
                }
                return null;
            case 408072700:
                if (A01.equals("max_size")) {
                    return (C140916mN) r2.A01.A01.getValue();
                }
                return null;
            case 1738660166:
                if (A01.equals("stale_removal")) {
                    return (C140886mK) r2.A01.A02.getValue();
                }
                return null;
            default:
                return null;
        }
    }

    public File BnH(AnonymousClass6MU r2, File file) {
        C109565Yb.A00(this.A00, r2, file);
        return file;
    }

    public C98454rS(Context context) {
        A00(context);
    }

    public C98454rS() {
    }
}
