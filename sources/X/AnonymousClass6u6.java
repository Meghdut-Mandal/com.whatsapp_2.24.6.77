package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6u6  reason: invalid class name */
public final class AnonymousClass6u6 implements B33 {
    public final C130936Na A00;
    public final AnonymousClass67R A01;
    public final AnonymousClass1UW A02;
    public final AnonymousClass1HC A03;
    public final AnonymousClass6Bd A04;
    public final AtomicInteger A05 = C90484aE.A0v();

    public AnonymousClass6u6(C130936Na r2, AnonymousClass1UW r3, AnonymousClass1HC r4, AnonymousClass67R r5, AnonymousClass6Bd r6) {
        C36421kH.A1J(r2, 1, r4);
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r3;
        this.A01 = r5;
        this.A03 = r4;
    }

    /* renamed from: A00 */
    public void BlV(C160057kO r26, C128936Ee r27, AnonymousClass6AZ r28, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        C160057kO r9 = r26;
        C128936Ee r13 = r27;
        X509Certificate x509Certificate2 = x509Certificate;
        C36321k7.A17(x509Certificate2, r9, r13, 1);
        AnonymousClass1HC r3 = this.A03;
        Integer num2 = r3.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("perform_backup_restore_");
            r3.A01(intValue, C36381kD.A10(A0u, this.A05.getAndIncrement()));
        }
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            r9.BWk(AnonymousClass001.A08("passwordPublicKey is null"));
            return;
        }
        Integer num3 = num;
        if (num == null) {
            r9.BWk(AnonymousClass001.A08("passwordKeyId is null"));
            return;
        }
        AnonymousClass6AZ r8 = r28;
        if (r28 == null) {
            r9.BWk(AnonymousClass001.A08("avatar user backup data is null"));
            return;
        }
        try {
            KeyPair A032 = AnonymousClass6UE.A03();
            String A012 = AnonymousClass6UE.A01(A032);
            String str2 = (String) C135086c7.A00(r8.A01);
            try {
                AnonymousClass6Bd r32 = this.A04;
                C122515uy A033 = this.A00.A03(C36381kD.A0y(r32.A01(A012, r32.A00(str2, publicKey2, num3.intValue()))), x509Certificate2);
                String A09 = r32.A01.A09();
                byte[] bArr = A033.A01;
                byte[] bArr2 = A033.A02;
                byte[] bArr3 = A033.A00;
                byte[] bArr4 = bArr2;
                byte[] bArr5 = bArr3;
                byte[] bArr6 = bArr;
                C203399nx r1 = new C186018vH(Long.valueOf(C36371kC.A09(r32.A00)), A09, C135086c7.A01(r8.A00), bArr6, bArr4, bArr5, A033.A03).A00;
                AnonymousClass00C.A08(r1);
                AnonymousClass6AZ r21 = r8;
                C128936Ee r19 = r13;
                C160057kO r18 = r9;
                r32.A02(r9, r1, A09, new AnonymousClass7VI(r9, this, str2, A032), new C155187Vc(r18, r19, this, r21, num3, publicKey2, x509Certificate2));
            } catch (IOException e) {
                e = e;
                str = "Password encryption IOException:";
                Log.e(str, e);
                r9.BWk(e);
            } catch (GeneralSecurityException e2) {
                e = e2;
                str = "Password encryption GeneralSecurityException:";
                Log.e(str, e);
                r9.BWk(e);
            }
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            str = "Error generating key pair:";
            Log.e(str, e);
            r9.BWk(e);
        }
    }

    public void A01(C160057kO r36, C128936Ee r37, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        X509Certificate x509Certificate2 = x509Certificate;
        AnonymousClass00C.A0D(x509Certificate2, 0);
        C160057kO r14 = r36;
        C128936Ee r20 = r37;
        C36331k8.A1G(r14, 3, r20);
        AnonymousClass1HC r3 = this.A03;
        Integer num2 = r3.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("perform_user_creation_");
            r3.A01(intValue, C36381kD.A10(A0u, this.A05.getAndIncrement()));
        }
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            e = AnonymousClass001.A08("passwordPublicKey is null");
        } else {
            Integer num3 = num;
            if (num == null) {
                e = AnonymousClass001.A08("passwordKeyId is null");
            } else {
                try {
                    KeyPair A032 = AnonymousClass6UE.A03();
                    String A012 = AnonymousClass6UE.A01(A032);
                    String A002 = AnonymousClass6UE.A00();
                    AnonymousClass00C.A08(A002);
                    try {
                        AnonymousClass6Bd r5 = this.A04;
                        C122515uy A033 = this.A00.A03(C36381kD.A0y(r5.A01(A012, r5.A00(A002, publicKey2, num3.intValue()))), x509Certificate2);
                        String A09 = r5.A01.A09();
                        byte[] bArr = A033.A01;
                        byte[] bArr2 = A033.A02;
                        byte[] bArr3 = A033.A00;
                        byte[] bArr4 = A033.A03;
                        Long valueOf = Long.valueOf(C36371kC.A09(r5.A00));
                        AnonymousClass6QB A0T = C36421kH.A0T();
                        C36331k8.A1D(A0T, "xmlns", "avatars");
                        C36411kG.A1K(A0T, "smax_id", 100);
                        C36341k9.A1C(A0T);
                        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
                        if (C203539oF.A0P(A09, 0, 9007199254740991L, false)) {
                            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
                        }
                        AnonymousClass6QB A0q = C36441kJ.A0q("encryption_metadata");
                        C36331k8.A1D(A0q, "version", "1");
                        C36331k8.A1D(A0q, "algorithm", "rsa2048");
                        AnonymousClass6QB A0q2 = C36441kJ.A0q("encrypted_key");
                        C203539oF.A0I(bArr, 1, 2048);
                        A0q2.A01 = bArr;
                        C36361kB.A1H(A0q2, A0q);
                        AnonymousClass6QB A0q3 = C36441kJ.A0q("nonce");
                        C203539oF.A0I(bArr2, 1, 128);
                        A0q3.A01 = bArr2;
                        C36361kB.A1H(A0q3, A0q);
                        AnonymousClass6QB A0q4 = C36441kJ.A0q("encrypted_data");
                        C203539oF.A0I(bArr3, 1, 8192);
                        A0q4.A01 = bArr3;
                        C36361kB.A1H(A0q4, A0q);
                        AnonymousClass6QB A0q5 = C36441kJ.A0q("auth_tag");
                        C203539oF.A0I(bArr4, 1, 128);
                        A0q5.A01 = bArr4;
                        C36361kB.A1H(A0q5, A0q);
                        C36361kB.A1H(A0q, A0T);
                        AnonymousClass6QB A0q6 = C36441kJ.A0q("timestamp");
                        if (C203539oF.A0L(valueOf, 1, 9007199254740991L, false)) {
                            A0q6.A07(String.valueOf(valueOf));
                        }
                        C36361kB.A1H(A0q6, A0T);
                        X509Certificate x509Certificate3 = x509Certificate2;
                        r5.A02(r14, A0T.A03(), A09, new AnonymousClass7VH(r14, this, A002, A032), new AnonymousClass7VZ(r14, r20, this, num3, publicKey2, x509Certificate3));
                        return;
                    } catch (IOException e) {
                        e = e;
                        str = "Password encryption IOException:";
                    } catch (GeneralSecurityException e2) {
                        e = e2;
                        str = "Password encryption GeneralSecurityException:";
                    }
                } catch (NoSuchAlgorithmException e3) {
                    e = e3;
                    str = "Error generating key pair:";
                    Log.e(str, e);
                    r14.BWk(e);
                }
            }
        }
        r14.BWk(e);
    }

    public /* synthetic */ void BlU(C160057kO r1, C128936Ee r2, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        A01(r1, r2, num, publicKey, x509Certificate);
    }

    public void BlX(AnonymousClass6OQ r19, C160057kO r20, C128936Ee r21, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        AnonymousClass00C.A0D(x509Certificate2, 0);
        AnonymousClass1HC r3 = this.A03;
        Integer num2 = r3.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("perform_user_deletion_");
            r3.A01(intValue, C36381kD.A10(A0u, this.A05.getAndIncrement()));
        }
        AnonymousClass6Bd r12 = this.A04;
        String A09 = r12.A01.A09();
        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        String str3 = str;
        if (!AnonymousClass00C.A0J(str3, str2)) {
            if (AnonymousClass00C.A0J(str3, "event")) {
                str2 = "event";
            } else {
                Log.e("Unsupported user deletion reason attribute");
                str2 = null;
            }
        }
        ArrayList arrayList = C107515Pg.A00;
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "avatars");
        C36411kG.A1K(A0T, "smax_id", 102);
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C36331k8.A1C(A0T, A09);
        A0T.A08(str2, "reason", C107515Pg.A00);
        C160057kO r5 = r20;
        r12.A02(r5, A0T.A03(), A09, new AnonymousClass7TR(r5), new C155237Vh(r19, r5, r21, this, num, str3, publicKey, x509Certificate2));
    }

    public void BlZ(AnonymousClass6OQ r26, C160057kO r27, C128936Ee r28, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        X509Certificate x509Certificate2 = x509Certificate;
        AnonymousClass00C.A0D(x509Certificate2, 0);
        AnonymousClass6OQ r9 = r26;
        C160057kO r8 = r27;
        C128936Ee r13 = r28;
        C36321k7.A17(r9, r8, r13, 1);
        AnonymousClass1HC r3 = this.A03;
        Integer num2 = r3.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("perform_token_refresh_");
            r3.A01(intValue, C36381kD.A10(A0u, this.A05.getAndIncrement()));
        }
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            e = AnonymousClass001.A08("passwordPublicKey is null");
        } else {
            Integer num3 = num;
            if (num == null) {
                e = AnonymousClass001.A08("passwordKeyId is null");
            } else {
                try {
                    KeyPair A032 = AnonymousClass6UE.A03();
                    String A012 = AnonymousClass6UE.A01(A032);
                    String A002 = AnonymousClass6OQ.A00(r9);
                    try {
                        AnonymousClass6Bd r32 = this.A04;
                        C122515uy A033 = this.A00.A03(C36381kD.A0y(r32.A01(A012, r32.A00(A002, publicKey2, num3.intValue()))), x509Certificate2);
                        String A09 = r32.A01.A09();
                        byte[] bArr = A033.A01;
                        byte[] bArr2 = A033.A02;
                        byte[] bArr3 = bArr;
                        byte[] bArr4 = bArr2;
                        C203399nx r1 = new C186018vH(Long.valueOf(C36371kC.A09(r32.A00)), A09, C135086c7.A01(r9.A04), bArr3, bArr4, A033.A00, A033.A03).A00;
                        AnonymousClass00C.A08(r1);
                        C128936Ee r20 = r13;
                        AnonymousClass6OQ r18 = r9;
                        C160057kO r19 = r8;
                        r32.A02(r8, r1, A09, new AnonymousClass7VK(r8, this, A002, A032), new C155197Vd(r18, r19, r20, this, num3, publicKey2, x509Certificate2));
                        return;
                    } catch (IOException e) {
                        e = e;
                        str = "Password encryption IOException:";
                    } catch (GeneralSecurityException e2) {
                        e = e2;
                        str = "Password encryption GeneralSecurityException:";
                    }
                } catch (NoSuchAlgorithmException e3) {
                    e = e3;
                    str = "Error generating key pair:";
                    Log.e(str, e);
                    r8.BWk(e);
                }
            }
        }
        r8.BWk(e);
    }

    public void BlY(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw AnonymousClass001.A0D();
    }
}
