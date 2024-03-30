package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1MD  reason: invalid class name */
public abstract class AnonymousClass1MD {
    public static final Charset[] A00 = {Charset.forName(DefaultCrypto.UTF_8), Charset.forName("UTF-16BE")};
    public static final C000000a A01;
    public static final Charset A02 = Charset.forName("US-ASCII");

    static {
        List asList = Arrays.asList(new String[]{"AO", "CV", "GQ", "FR", "GW", "LU", "MO", "MZ", "PT", "ST", "CH", "TL"});
        C000000a r0 = new C000000a(0);
        if (asList != null) {
            r0.addAll(asList);
        }
        A01 = r0;
    }
}
