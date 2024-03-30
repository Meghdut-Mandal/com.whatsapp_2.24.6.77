package X;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: X.3LP  reason: invalid class name */
public abstract class AnonymousClass3LP {
    public static /* synthetic */ File A00(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Private/");
        File A0w = C36441kJ.A0w(externalFilesDir, AnonymousClass000.A0q(str.trim(), A0u));
        if (!A0w.exists()) {
            A0w.mkdirs();
        }
        C20690y0.A06(A0w);
        A0w.getAbsolutePath();
        return A0w;
    }

    public static /* synthetic */ void A01(AnonymousClass3BP r1, Set set) {
        set.add(r1.A0D);
        set.add(r1.A0B);
        set.add(r1.A0A);
        set.add(r1.A0E);
        set.add(r1.A0C);
        set.add(r1.A04);
    }
}
