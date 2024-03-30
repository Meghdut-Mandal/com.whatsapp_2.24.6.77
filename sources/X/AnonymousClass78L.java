package X;

/* renamed from: X.78L  reason: invalid class name */
public final class AnonymousClass78L extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass78L(String str) {
        super(str);
        AnonymousClass00C.A0D(str, 1);
    }

    public static AnonymousClass78L A00(String str, StringBuilder sb) {
        sb.append(str);
        return new AnonymousClass78L(sb.toString());
    }
}
