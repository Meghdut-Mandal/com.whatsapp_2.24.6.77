package X;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0Y0  reason: invalid class name */
public class AnonymousClass0Y0 {
    public final Signature A00;
    public final Cipher A01;
    public final Mac A02;

    public AnonymousClass0Y0(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
    }

    public AnonymousClass0Y0(Cipher cipher) {
        this.A01 = cipher;
        this.A00 = null;
        this.A02 = null;
    }

    public AnonymousClass0Y0(Mac mac) {
        this.A02 = mac;
        this.A01 = null;
        this.A00 = null;
    }
}
