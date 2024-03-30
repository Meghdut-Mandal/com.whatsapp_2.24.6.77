package X;

import java.security.KeyStore;

/* renamed from: X.77c  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1508777c implements AnonymousClass004 {
    public static final /* synthetic */ C1508777c A00 = new C1508777c();

    public final Object get() {
        KeyStore keyStore;
        try {
            keyStore = KeyStore.getInstance("AndroidKeyStore");
            try {
                keyStore.load((KeyStore.LoadStoreParameter) null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            keyStore = null;
            C36321k7.A1L(e, "PAY: TrustedDeviceKeyStore keystore load threw: ", AnonymousClass000.A0u());
            if (keyStore == null) {
                return null;
            }
            return new AnonymousClass626(keyStore);
        }
        return new AnonymousClass626(keyStore);
    }
}
