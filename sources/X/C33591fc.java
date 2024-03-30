package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.1fc  reason: invalid class name and case insensitive filesystem */
public final class C33591fc {
    public static final List A02;
    public final C19420v0 A00;
    public final C20810yC A01;

    public C33591fc(C19420v0 r2, C20810yC r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    static {
        List asList = Arrays.asList(new String[]{"biz_enforce_download_create", "biz_enforce_download_boost_post", "biz_enforce_download_reminder"});
        AnonymousClass00C.A08(asList);
        A02 = asList;
    }
}
