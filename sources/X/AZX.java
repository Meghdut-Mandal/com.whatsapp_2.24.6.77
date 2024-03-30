package X;

import java.io.IOException;
import java.io.InputStream;

public class AZX implements C23128B6j {
    public AnonymousClass9WM A00;

    public AZX(AnonymousClass9WM r1) {
        this.A00 = r1;
    }

    public InputStream BEb() {
        return new C187458xu(this.A00);
    }

    public AnonymousClass121 BDb() {
        return new C22645AsB(C1903097w.A00(new C187458xu(this.A00)));
    }

    public AnonymousClass121 Bve() {
        try {
            return BDb();
        } catch (IOException e) {
            throw new AnonymousClass92R(C36331k8.A0i("IOException converting stream to byte array: ", AnonymousClass000.A0u(), e), e);
        }
    }
}
