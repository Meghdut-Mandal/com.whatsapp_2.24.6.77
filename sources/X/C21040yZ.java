package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.0yZ  reason: invalid class name and case insensitive filesystem */
public final class C21040yZ {
    public static final List A02;
    public final C20810yC A00;
    public final C21030yY A01;

    public C21040yZ(C20810yC r2, C21030yY r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    static {
        List asList = Arrays.asList(new String[]{"com.instagram.", "com.oculus.", "com.facebook."});
        AnonymousClass00C.A08(asList);
        A02 = asList;
    }

    public final void A00(C51822oR r5, String str) {
        if (C20800yB.A01(C21000yV.A02, this.A00, 3777) && str != null && str.length() != 0) {
            List<String> list = A02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str2 : list) {
                    AnonymousClass00C.A0D(str2, 1);
                    if (str.startsWith(str2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cross-app communication detected for operation '");
                        String name = r5.name();
                        sb.append(name);
                        sb.append("' and authority '");
                        sb.append(str);
                        sb.append('\'');
                        Log.i(sb.toString());
                        this.A01.A00("CONTENT_RESOLVER", name, C224714l.A00(new Throwable("")), str);
                        return;
                    }
                }
            }
        }
    }
}
