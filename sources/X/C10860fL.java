package X;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: X.0fL  reason: invalid class name and case insensitive filesystem */
public final class C10860fL implements Serializable {
    public static final long serialVersionUID = 0;
    public final int flags;
    public final String pattern;

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.pattern, this.flags);
        AnonymousClass00C.A08(compile);
        return new C10880fN(compile);
    }

    public C10860fL(String str, int i) {
        this.pattern = str;
        this.flags = i;
    }
}
