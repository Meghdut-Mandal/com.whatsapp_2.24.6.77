package X;

import java.security.Provider;
import java.security.Security;

/* renamed from: X.AaJ  reason: case insensitive filesystem */
public class C21786AaJ implements C22844Awt {
    public static volatile Provider A01;
    public final Provider A00;

    public C21786AaJ() {
        Provider provider;
        synchronized (C21786AaJ.class) {
            provider = Security.getProvider("SC");
            if (!(provider instanceof AnonymousClass11n)) {
                if (A01 != null) {
                    provider = A01;
                } else {
                    A01 = new AnonymousClass11n();
                    provider = A01;
                }
            }
        }
        this.A00 = provider;
    }
}
