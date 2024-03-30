package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: X.5JZ  reason: invalid class name */
public class AnonymousClass5JZ extends C148366yk {
    public String A00;
    public String A01;
    public final AnonymousClass1GH A02;
    public final boolean A03;
    public final boolean A04;
    public final Long A05;
    public final Long A06;
    public final String A07;

    public static Uri.Builder A01(C1265864p r6, AnonymousClass5JZ r7) {
        byte[] bArr;
        byte[] bArr2;
        String str = r7.A01;
        if (str == null) {
            AnonymousClass1GH r1 = r7.A02;
            C18740tg.A06(r1);
            String str2 = r7.A01;
            if (r7.A04) {
                bArr = new byte[32];
                new Random().nextBytes(bArr);
            } else {
                C19420v0 r3 = (C19420v0) r1.A00.get();
                String A0t = C36371kC.A0t(C36341k9.A0E(r3), "upload_token_random_bytes");
                if (TextUtils.isEmpty(A0t) || (bArr2 = Base64.decode(A0t, 3)) == null) {
                    bArr2 = new byte[32];
                    new SecureRandom().nextBytes(bArr2);
                    C36341k9.A0x(C19420v0.A00(r3), "upload_token_random_bytes", Base64.encodeToString(bArr2, 3));
                }
                byte[] decode = Base64.decode(str2, 2);
                if (decode == null) {
                    bArr = (byte[]) bArr2.clone();
                } else {
                    int length = bArr2.length;
                    int length2 = decode.length;
                    bArr = new byte[(length + length2)];
                    System.arraycopy(bArr2, 0, bArr, 0, length);
                    System.arraycopy(decode, 0, bArr, length, length2);
                }
            }
            try {
                str = AnonymousClass14B.A0A(C36441kJ.A13(C90504aG.A0s().digest(bArr)));
                r7.A01 = str;
            } catch (NoSuchAlgorithmException e) {
                throw C90524aI.A0Y(e);
            }
        }
        C18740tg.A0D(AnonymousClass000.A1V(str), "Upload token has not been set");
        Uri.Builder A032 = r7.A03(r6);
        A032.appendQueryParameter("token", r7.A01);
        return A032;
    }

    public AnonymousClass5JZ(AnonymousClass1GH r2, Long l, Long l2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        super(str, str2, str3);
        if (!z2) {
            this.A00 = this.A02;
        }
        this.A02 = r2;
        this.A04 = z;
        this.A03 = z2;
        this.A07 = str4;
        this.A05 = l;
        this.A06 = l2;
    }

    public static Uri.Builder A00(C1265864p r2, AnonymousClass5JZ r3) {
        Uri.Builder A012 = A01(r2, r3);
        if (r3.A03) {
            A012.appendQueryParameter("stream", "1");
        }
        String str = r3.A07;
        if (str != null) {
            A012.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        }
        Long l = r3.A05;
        if (l != null) {
            A012.appendQueryParameter("media_id", String.valueOf(l));
        }
        Long l2 = r3.A06;
        if (l2 != null) {
            A012.appendQueryParameter("media_id_upload", String.valueOf(l2));
        }
        return A012;
    }

    public String B7t(C1265864p r2, boolean z) {
        return C90474aD.A0b(A00(r2, this));
    }
}
