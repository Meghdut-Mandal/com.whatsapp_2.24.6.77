package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.66T  reason: invalid class name */
public abstract class AnonymousClass66T {
    public List A00;
    public final JSONArray A01 = C90524aI.A0u();

    public String A01() {
        if (!(this instanceof C105625Fk)) {
            return ((C105635Fl) this).A00;
        }
        try {
            return C90504aG.A0o(((C105625Fk) this).A00.toString().getBytes(C19430v1.A0B));
        } catch (UnsupportedEncodingException e) {
            throw new AnonymousClass5VA(e);
        }
    }

    public AnonymousClass66T A00(PublicKey... publicKeyArr) {
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            A0I.add(AnonymousClass6HB.A00(publicKeyArr[0]));
            this.A00 = A0I;
            return this;
        } catch (NoSuchAlgorithmException e) {
            Log.e("PAY: DefaultTrustTokenBuilder/generateKeyFingerprints", e);
            throw new AnonymousClass5VA(e);
        }
    }
}
