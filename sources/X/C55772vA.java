package X;

import android.content.res.Resources;
import com.whatsapp.R;

/* renamed from: X.2vA  reason: invalid class name and case insensitive filesystem */
public abstract class C55772vA {
    public static int A00(Resources resources, AnonymousClass6PM r3) {
        int[] intArray = resources.getIntArray(R.array.f3nameremoved);
        return intArray[r3.A00 % intArray.length];
    }
}
