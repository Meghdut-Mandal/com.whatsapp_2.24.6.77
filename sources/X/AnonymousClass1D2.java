package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: X.1D2  reason: invalid class name */
public final class AnonymousClass1D2 {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new AnonymousClass1D3(this));

    public AnonymousClass1D2(C19890wg r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public static final String A00(int i, int i2, int i3) {
        String format = String.format(Locale.US, "%d_%d_%d_%d_%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i2), 0, "bandwidths"}, 5));
        AnonymousClass00C.A08(format);
        return format;
    }

    public final ArrayList A01(int i, int i2, int i3) {
        StringTokenizer stringTokenizer = new StringTokenizer(((SharedPreferences) this.A01.getValue()).getString(A00(i, i2, i3), ""), ",");
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            AnonymousClass00C.A08(nextToken);
            arrayList.add(Integer.valueOf(Integer.parseInt(nextToken)));
        }
        return arrayList;
    }
}
