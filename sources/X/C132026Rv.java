package X;

import java.nio.FloatBuffer;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: X.6Rv  reason: invalid class name and case insensitive filesystem */
public class C132026Rv {
    public static final FloatBuffer A01;
    public static final FloatBuffer A02;
    public final Map A00 = new IdentityHashMap();

    static {
        FloatBuffer A0m = C90474aD.A0m(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}, 32);
        A0m.position(0);
        A01 = A0m;
        FloatBuffer A0m2 = C90474aD.A0m(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}, 32);
        A0m2.position(0);
        A02 = A0m2;
    }
}
