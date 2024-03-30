package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import org.apache.xml.security.Init;

/* renamed from: X.67U  reason: invalid class name */
public class AnonymousClass67U {
    public static List A04;
    public String A00 = "";
    public AnonymousClass6MM A01;
    public C132506Ua A02;
    public C156817b0 A03;

    public AnonymousClass72D A00(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        String str6;
        byte[] bArr;
        SecretKey secretKey;
        byte[] bArr2;
        if (str == null || !str.isEmpty()) {
            ArrayList A0I = AnonymousClass001.A0I();
            for (C121995u8 r1 : A04) {
                if (r1.A01.equals(str)) {
                    A0I.add(r1);
                }
            }
            if (A0I.size() != 0) {
                C121995u8 r4 = (C121995u8) A0I.get(new SecureRandom().nextInt(A0I.size()));
                this.A00 = r4.A02;
                StringBuilder A0h = C90524aI.A0h(500);
                try {
                    byte[] A1Z = C90484aE.A1Z("AES/CBC/PKCS5Padding", new SecureRandom());
                    String A002 = AnonymousClass6HS.A00(A1Z, 2);
                    byte[] A003 = C132506Ua.A00(str4, A002);
                    String str7 = str5;
                    int length = str7.length() / 2;
                    byte[] bArr3 = new byte[length];
                    for (int i = 0; i < length; i++) {
                        C90504aG.A1L(str7, bArr3, i);
                    }
                    String A004 = AnonymousClass6HS.A00(C132506Ua.A01(A003, bArr3, A1Z), 2);
                    AnonymousClass000.A1D(str3, "|", str2, A0h);
                    A0h.append("|");
                    AnonymousClass000.A1D(A004, "|", A002, A0h);
                    String obj = A0h.toString();
                    if (bool.booleanValue()) {
                        try {
                            secretKey = C90464aC.A0n();
                        } catch (NoSuchAlgorithmException unused) {
                            secretKey = null;
                        }
                        byte[] encoded = secretKey.getEncoded();
                        byte[] A1Z2 = C90484aE.A1Z("AES/CBC/PKCS5Padding", new SecureRandom());
                        String A005 = AnonymousClass6HS.A00(A1Z2, 2);
                        byte[] A012 = C132506Ua.A01(obj.getBytes(), encoded, A1Z2);
                        try {
                            bArr2 = C90484aE.A1b(C90464aC.A0l(AnonymousClass6HS.A01(this.A00.getBytes("utf-8"))), AnonymousClass6HS.A00(encoded, 0).getBytes());
                        } catch (Exception unused2) {
                            bArr2 = null;
                        }
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("eyJhbGciOiJSU0EtT0FFUCIsImVuYyI6IkEyNTZHQ00ifQ.");
                        A0u.append(AnonymousClass6HS.A00(bArr2, 2));
                        A0u.append(".");
                        A0u.append(A005);
                        A0u.append(".");
                        str6 = AnonymousClass000.A0q(AnonymousClass6HS.A00(A012, 2), A0u).replace("+", "-").replace("/", "_");
                    } else {
                        try {
                            bArr = C90484aE.A1b(C90464aC.A0l(AnonymousClass6HS.A01(this.A00.getBytes("utf-8"))), obj.getBytes());
                        } catch (Exception unused3) {
                            bArr = null;
                        }
                        str6 = AnonymousClass6HS.A00(bArr, 2);
                    }
                    return new AnonymousClass72D(new AnonymousClass72G(r4.A00, r4.A01, str6));
                } catch (Exception unused4) {
                    throw new AnonymousClass5VJ(C023109s.A0V);
                }
            } else {
                throw new AnonymousClass5VJ(C023109s.A01);
            }
        } else {
            throw new AnonymousClass5VJ(C023109s.A00);
        }
    }

    public AnonymousClass67U(String str) {
        Init.b();
        try {
            AnonymousClass6MM r0 = new AnonymousClass6MM();
            this.A01 = r0;
            if (r0.A01(str)) {
                this.A03 = new C156817b0(str);
                A04 = C156817b0.A00;
                try {
                    this.A02 = new C132506Ua();
                } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
                    throw new AnonymousClass5VJ(C023109s.A0V);
                }
            } else {
                throw new AnonymousClass5VJ(C023109s.A0S);
            }
        } catch (AnonymousClass5VJ e) {
            throw e;
        } catch (Exception unused2) {
            throw new AnonymousClass5VJ(C023109s.A0V);
        }
    }
}
