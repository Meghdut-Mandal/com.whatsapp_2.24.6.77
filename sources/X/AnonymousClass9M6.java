package X;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9M6  reason: invalid class name */
public class AnonymousClass9M6 {
    public final int A00;
    public final IvParameterSpec A01;
    public final SecretKeySpec A02;
    public final SecretKeySpec A03;

    public AnonymousClass9M6(IvParameterSpec ivParameterSpec, SecretKeySpec secretKeySpec, SecretKeySpec secretKeySpec2, int i) {
        this.A02 = secretKeySpec;
        this.A03 = secretKeySpec2;
        this.A01 = ivParameterSpec;
        this.A00 = i;
    }
}