package X;

import java.io.Closeable;

/* renamed from: X.6I7  reason: invalid class name */
public abstract class AnonymousClass6I7 {
    public static final char[] A00 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void A00(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                AnonymousClass6YR.A09("AssetFileUtil", "unable to close stream", e);
            }
        }
    }
}
