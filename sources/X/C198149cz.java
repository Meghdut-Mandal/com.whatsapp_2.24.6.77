package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.jniexecutors.PooledNativeRunnable;
import java.lang.reflect.Array;

/* renamed from: X.9cz  reason: invalid class name and case insensitive filesystem */
public class C198149cz {
    public int A00;
    public long A01;
    public Object[] A02;
    public final int A03 = Math.max(16, 1);
    public final int A04;
    public final int A05;
    public final AnonymousClass9Us A06;
    public final C159017ie A07;

    public C198149cz(AnonymousClass9Us r6, C159017ie r7) {
        int max = Math.max(16, 0);
        this.A05 = max;
        this.A04 = Math.max(max, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        this.A06 = r6;
        this.A07 = r7;
        this.A02 = (Object[]) Array.newInstance(PooledNativeRunnable.class, max);
    }

    public static void A00(C198149cz r4, int i) {
        Object[] objArr = (Object[]) Array.newInstance(PooledNativeRunnable.class, i);
        Object[] objArr2 = r4.A02;
        System.arraycopy(objArr2, 0, objArr, 0, Math.min(objArr2.length, i));
        r4.A02 = objArr;
        r4.A00 = Math.min(r4.A00, i);
    }
}
