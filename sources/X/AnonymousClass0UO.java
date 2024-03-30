package X;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.0UO  reason: invalid class name */
public final class AnonymousClass0UO {
    public AnonymousClass0WZ A00;
    public final AnonymousClass0WZ A01;
    public final String A02;

    public final void A00(Object obj, String str) {
        AnonymousClass0WZ r1 = new AnonymousClass0WZ((AnonymousClass0OY) null);
        this.A00.A00 = r1;
        this.A00 = r1;
        r1.A01 = obj;
        r1.A02 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.A02);
        sb.append('{');
        AnonymousClass0WZ r4 = this.A01.A00;
        String str = "";
        while (r4 != null) {
            Object obj = r4.A01;
            sb.append(str);
            String str2 = r4.A02;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            r4 = r4.A00;
            str = ", ";
        }
        return AnonymousClass000.A0s(sb);
    }

    public /* synthetic */ AnonymousClass0UO(String str) {
        AnonymousClass0WZ r0 = new AnonymousClass0WZ((AnonymousClass0OY) null);
        this.A01 = r0;
        this.A00 = r0;
        Objects.requireNonNull(str);
        this.A02 = str;
    }
}
