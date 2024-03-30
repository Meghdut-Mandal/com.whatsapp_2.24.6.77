package X;

import android.hardware.Camera;
import java.util.Comparator;

/* renamed from: X.75v  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1505875v implements Comparator {
    public static final /* synthetic */ C1505875v A00 = new C1505875v();

    public final int compare(Object obj, Object obj2) {
        Camera.Size size = (Camera.Size) obj;
        Camera.Size size2 = (Camera.Size) obj2;
        return Integer.compare(size.width * size.height, size2.width * size2.height);
    }
}
