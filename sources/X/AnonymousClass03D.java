package X;

/* renamed from: X.03D  reason: invalid class name */
public abstract class AnonymousClass03D {
    public static final void A00(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected positive parallelism level, but got ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
