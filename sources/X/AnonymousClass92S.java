package X;

/* renamed from: X.92S  reason: invalid class name */
public final class AnonymousClass92S extends IndexOutOfBoundsException {
    public static final long serialVersionUID = 160715609518896765L;
    public final String className;
    public final int constantPoolCount;

    public AnonymousClass92S(String str, int i) {
        super(AnonymousClass000.A0p("Class too large: ", str, AnonymousClass000.A0u()));
        this.className = str;
        this.constantPoolCount = i;
    }
}
