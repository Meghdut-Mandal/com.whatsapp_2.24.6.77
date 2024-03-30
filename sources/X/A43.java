package X;

import java.nio.charset.Charset;
import java.util.Objects;

public final class A43 implements C22809AwK {
    public static final C23018B0j A01 = new C21033A3w();
    public final C23018B0j A00;

    public A43() {
        C23018B0j b0j;
        C23018B0j[] b0jArr = new C23018B0j[2];
        b0jArr[0] = C21035A3y.A00;
        try {
            b0j = (C23018B0j) C165577te.A0d();
        } catch (Exception unused) {
            b0j = A01;
        }
        b0jArr[1] = b0j;
        C21034A3x a3x = new C21034A3x(b0jArr);
        Charset charset = C197089b7.A00;
        Objects.requireNonNull(a3x, "messageInfoFactory");
        this.A00 = a3x;
    }
}
