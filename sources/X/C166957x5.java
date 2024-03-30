package X;

import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: X.7x5  reason: invalid class name and case insensitive filesystem */
public final class C166957x5 extends AnonymousClass9BV {
    public final String A00;

    public C166957x5(String str, Bundle bundle) {
        super(bundle);
        this.A00 = str;
        AnonymousClass00C.A0D(str, 0);
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw AnonymousClass001.A08("authenticationResponseJson must not be empty, and must be a valid JSON");
    }
}
