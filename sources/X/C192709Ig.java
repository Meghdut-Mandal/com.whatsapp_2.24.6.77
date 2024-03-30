package X;

import java.security.Permission;
import java.security.SecureRandom;

/* renamed from: X.9Ig  reason: invalid class name and case insensitive filesystem */
public class C192709Ig {
    public int A00;
    public SecureRandom A01;

    public C192709Ig(int i, SecureRandom secureRandom) {
        Permission permission = C201939kk.A03;
        this.A01 = secureRandom == null ? C201939kk.A00() : secureRandom;
        this.A00 = i;
    }
}
