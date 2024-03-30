package X;

import com.facebook.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.83K  reason: invalid class name */
public class AnonymousClass83K extends AnonymousClass83L {
    public final Map headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public AnonymousClass83K(C202189lD r5, Map map, int i) {
        super(r5, (IOException) null, AnonymousClass000.A0r("Response code: ", AnonymousClass000.A0u(), i), 2004);
        byte[] bArr = Util.A08;
        this.responseCode = i;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
