package X;

import java.io.IOException;
import java.io.InputStream;

public class AZY implements C23128B6j {
    public C22688Ass A00;

    public AZY(C22688Ass ass) {
        this.A00 = ass;
    }

    public AnonymousClass121 BDb() {
        return new C22644AsA(this.A00.A02());
    }

    public InputStream BEb() {
        return this.A00;
    }

    public AnonymousClass121 Bve() {
        try {
            return BDb();
        } catch (IOException e) {
            throw new AnonymousClass92R(C36331k8.A0i("IOException converting stream to byte array: ", AnonymousClass000.A0u(), e), e);
        }
    }
}
