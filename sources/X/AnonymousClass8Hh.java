package X;

import java.util.Comparator;

/* renamed from: X.8Hh  reason: invalid class name */
public class AnonymousClass8Hh extends AnonymousClass8Hi {
    public static final AnonymousClass8Hh INSTANCE = new AnonymousClass8Hh();
    public static final long serialVersionUID = 0;

    public AnonymousClass8Hh() {
        super(C20070wy.of(), 0, (Comparator) null);
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
