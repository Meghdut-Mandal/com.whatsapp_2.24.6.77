package X;

/* renamed from: X.5WR  reason: invalid class name */
public abstract class AnonymousClass5WR {
    public static final String A00(float f) {
        int max = Math.max(1, 0);
        float pow = (float) Math.pow((double) 10.0f, (double) max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - ((float) i) >= 0.5f) {
            i++;
        }
        float f3 = ((float) i) / pow;
        if (max > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }

    public static void A01(StringBuilder sb, float f) {
        sb.append(A00(f));
    }
}
