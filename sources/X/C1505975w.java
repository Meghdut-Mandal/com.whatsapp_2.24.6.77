package X;

import android.hardware.Camera;
import java.util.Comparator;

/* renamed from: X.75w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1505975w implements Comparator {
    public static final /* synthetic */ C1505975w A00 = new C1505975w();

    public final int compare(Object obj, Object obj2) {
        Camera.Size size = (Camera.Size) obj;
        Camera.Size size2 = (Camera.Size) obj2;
        return Integer.compare(size2.width * size2.height, size.width * size.height);
    }
}
