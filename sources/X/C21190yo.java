package X;

import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* renamed from: X.0yo  reason: invalid class name and case insensitive filesystem */
public class C21190yo {
    public static String A00(Map map) {
        AnonymousClass5RF r1 = new AnonymousClass5RF(map);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            do {
            } while (new DigestInputStream(r1, instance).read() != -1);
            return C18750th.A07(instance.digest());
        } catch (IOException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
