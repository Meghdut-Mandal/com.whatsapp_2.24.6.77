package X;

import android.os.StrictMode;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* renamed from: X.6SG  reason: invalid class name */
public class AnonymousClass6SG {
    public static final List A05 = C90484aE.A0t("test_lint");
    public String A00;
    public String A01;
    public boolean A02;
    public final String A03;
    public final String A04;

    public AnonymousClass6SG(C1263763r r2) {
        String str = r2.A01;
        Objects.requireNonNull(str);
        this.A01 = str;
        String str2 = r2.A00;
        Objects.requireNonNull(str2);
        this.A00 = str2;
        this.A02 = r2.A04;
        this.A03 = r2.A02;
        this.A04 = r2.A03;
    }

    /* JADX INFO: finally extract failed */
    public static String A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID randomUUID = UUID.randomUUID();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return randomUUID.toString();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
