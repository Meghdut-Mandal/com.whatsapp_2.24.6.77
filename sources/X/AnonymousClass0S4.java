package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.charset.Charset;

/* renamed from: X.0S4  reason: invalid class name */
public abstract class AnonymousClass0S4 {
    public static final Charset A00;
    public static final Charset A01;
    public static final Charset A02;
    public static final Charset A03;
    public static final Charset A04;
    public static final Charset A05;

    static {
        Charset forName = Charset.forName(DefaultCrypto.UTF_8);
        AnonymousClass00C.A08(forName);
        A05 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        AnonymousClass00C.A08(forName2);
        A02 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        AnonymousClass00C.A08(forName3);
        A03 = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        AnonymousClass00C.A08(forName4);
        A04 = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        AnonymousClass00C.A08(forName5);
        A01 = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        AnonymousClass00C.A08(forName6);
        A00 = forName6;
    }
}
