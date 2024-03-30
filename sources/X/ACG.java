package X;

import com.whatsapp.jid.UserJid;
import java.nio.charset.Charset;

public final class ACG implements C22941Ayr {
    public final UserJid A00;
    public final C64933Qa A01;

    public ACG(UserJid userJid, C64933Qa r2) {
        this.A01 = r2;
        this.A00 = userJid;
    }

    public byte[] B88() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01.A01);
        A0u.append(0);
        String A0q = AnonymousClass000.A0q(this.A00.getRawString(), A0u);
        Charset charset = C19430v1.A0D;
        AnonymousClass00C.A09(charset);
        byte[] bytes = A0q.getBytes(charset);
        AnonymousClass00C.A08(bytes);
        return bytes;
    }
}
