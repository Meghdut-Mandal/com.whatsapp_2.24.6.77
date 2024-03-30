package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1eC  reason: invalid class name and case insensitive filesystem */
public class C32791eC {
    public static final List A02 = Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
    public final C21010yW A00;
    public final C32781eB A01;

    public void A00(int i, int i2) {
        C32781eB r3 = this.A01;
        synchronized (r3) {
            String A002 = C32781eB.A00(i);
            String[] split = r3.A01(i).split(",");
            if (i2 < split.length) {
                split[i2] = String.valueOf(Integer.parseInt(split[i2]) + 1);
                String join = TextUtils.join(",", split);
                SharedPreferences sharedPreferences = r3.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = r3.A01.A00("privacy_highlight");
                    r3.A00 = sharedPreferences;
                }
                sharedPreferences.edit().putString(A002, join).apply();
            } else {
                throw new IllegalStateException("position exceeds event array length");
            }
        }
    }

    public C32791eC(C21010yW r1, C32781eB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
