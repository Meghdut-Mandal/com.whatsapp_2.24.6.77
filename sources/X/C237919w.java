package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: X.19w  reason: invalid class name and case insensitive filesystem */
public class C237919w {
    public static final Random A02 = new Random();
    public static volatile SecureRandom A03;
    public final C19730wQ A00;
    public final C19970wo A01;

    public static String A00(C19730wQ r1, C19970wo r2) {
        return C18750th.A06(A01(r1, r2, false));
    }

    public static byte[] A01(C19730wQ r7, C19970wo r8, boolean z) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            long A002 = C19970wo.A00(r8);
            byte[] bArr = new byte[8];
            for (int i = 7; i >= 0; i--) {
                bArr[i] = (byte) ((int) A002);
                A002 >>= 8;
            }
            instance.update(bArr);
            r7.A0G();
            PhoneUserJid phoneUserJid = r7.A03;
            C18740tg.A06(phoneUserJid);
            instance.update(phoneUserJid.getRawString().getBytes());
            byte[] bArr2 = new byte[16];
            if (z) {
                if (A03 == null) {
                    synchronized (C237919w.class) {
                        if (A03 == null) {
                            A03 = new SecureRandom();
                        }
                    }
                }
                A03.nextBytes(bArr2);
            } else {
                A02.nextBytes(bArr2);
            }
            instance.update(bArr2);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            Log.w("Unable to provide message id hash due to missing md5 algorithm.", e);
            throw new IllegalStateException("Unable to provide message id hash due to missing md5 algorithm.", e);
        }
    }

    public C64933Qa A02(AnonymousClass11F r3, boolean z) {
        return new C64933Qa(r3, A00(this.A00, this.A01), z);
    }

    public C237919w(C19730wQ r1, C19970wo r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
