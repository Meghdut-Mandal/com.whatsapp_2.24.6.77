package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.6Jo  reason: invalid class name and case insensitive filesystem */
public class C130066Jo {
    public MessageDigest A00;
    public final C117255lx A01;

    public static synchronized MessageDigest A00(C130066Jo r3) {
        MessageDigest messageDigest;
        synchronized (r3) {
            messageDigest = r3.A00;
            if (messageDigest == null) {
                try {
                    messageDigest = MessageDigest.getInstance("MD5");
                    r3.A00 = messageDigest;
                } catch (NoSuchAlgorithmException e) {
                    throw C90514aH.A0s(AnonymousClass000.A0l(e, "ABOfflineAssign assign will fail due to MD5 algorithm not found: ", AnonymousClass000.A0u()));
                }
            }
        }
        return messageDigest;
    }

    public C130066Jo(C117255lx r1) {
        this.A01 = r1;
    }
}
