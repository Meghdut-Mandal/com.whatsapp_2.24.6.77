package X;

import com.google.protobuf.CodedOutputStream;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: X.9TV  reason: invalid class name */
public final class AnonymousClass9TV {
    public final CodedOutputStream A00;

    public void A00(C23073B3d b3d, Object obj, int i) {
        CodedOutputStream codedOutputStream = this.A00;
        int i2 = i << 3;
        codedOutputStream.A08(i2 | 3);
        b3d.Bxf(codedOutputStream.A00, obj);
        codedOutputStream.A08(i2 | 4);
    }

    public AnonymousClass9TV(CodedOutputStream codedOutputStream) {
        Charset charset = AnonymousClass9BD.A04;
        Objects.requireNonNull(codedOutputStream, "output");
        this.A00 = codedOutputStream;
        codedOutputStream.A00 = this;
    }
}
