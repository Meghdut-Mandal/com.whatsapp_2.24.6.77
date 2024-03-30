package X;

import java.io.InputStream;

/* renamed from: X.6sw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144866sw implements AnonymousClass7gS {
    public final /* synthetic */ C128736Dk A00;
    public final /* synthetic */ C124835ys A01;
    public final /* synthetic */ byte[] A02;

    public /* synthetic */ C144866sw(C128736Dk r1, C124835ys r2, byte[] bArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = bArr;
    }

    public final InputStream B6T(InputStream inputStream) {
        C128736Dk r2 = this.A00;
        byte[] bArr = this.A02;
        AnonymousClass00C.A0D(bArr, 2);
        return new AnonymousClass61M(r2).A00(inputStream, bArr);
    }
}
