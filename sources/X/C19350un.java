package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.0un  reason: invalid class name and case insensitive filesystem */
public final class C19350un {
    public int A00 = 0;
    public final C19290uh A01;
    public final Map A02 = new AnonymousClass008();

    public static final String A00(C19350un r3) {
        String string;
        C19290uh r32 = r3.A01;
        synchronized (r32) {
            string = r32.A01.getString("topic_operation_queue", "");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    public C19350un(C19290uh r2) {
        this.A01 = r2;
    }
}
