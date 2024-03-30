package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2tJ  reason: invalid class name and case insensitive filesystem */
public abstract class C54662tJ {
    public static final String A00(C19730wQ r3, AnonymousClass11F r4) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            AnonymousClass00C.A08(instance);
            PhoneUserJid A0n = C36441kJ.A0n(r3);
            if (A0n == null) {
                Log.e("IntegrityFunnelLogger/myPhoneUserJid is null");
                return "";
            }
            String rawString = A0n.getRawString();
            Charset charset = AnonymousClass0S4.A05;
            instance.update(C36371kC.A1Z(rawString, charset));
            instance.update(C36371kC.A1Z(r4.getRawString(), charset));
            String A13 = C36441kJ.A13(instance.digest());
            AnonymousClass00C.A08(A13);
            return A13;
        } catch (NoSuchAlgorithmException unused) {
            Log.e("IntegrityFunnelLogger/no SHA1 algorithm available");
            return "";
        }
    }
}
