package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.6vs  reason: invalid class name and case insensitive filesystem */
public class C146606vs implements C160127kV {
    public final String A00;
    public final MessageDigest A01;
    public final C160127kV A02;
    public final C25471Gl A03;
    public final String A04;
    public final MessageDigest A05;

    public long BEc() {
        return 0;
    }

    public void Bwp() {
    }

    public OutputStream Bl9(C162167o8 r8) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2 = this.A05;
        if (messageDigest2 == null || (messageDigest = this.A01) == null) {
            throw new AnonymousClass5V9(26);
        }
        return new DigestOutputStream(new AnonymousClass5RJ(new C144826ss(this.A03).B5L(Base64.decode(this.A04, 0)), new DigestOutputStream(this.A02.Bl9(r8), messageDigest), (long) ((C146096v1) r8).A01.getContentLength()), messageDigest2);
    }

    public C146606vs(C160127kV r3, C25471Gl r4, String str, String str2) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2;
        this.A02 = r3;
        this.A04 = str;
        this.A00 = str2;
        this.A03 = r4;
        try {
            messageDigest = C90504aG.A0s();
        } catch (NoSuchAlgorithmException e) {
            Log.e("encryptedstreamdownload/digest error", e);
            messageDigest = null;
        }
        this.A05 = messageDigest;
        try {
            messageDigest2 = C90504aG.A0s();
        } catch (NoSuchAlgorithmException e2) {
            Log.e("encryptedstreamdownload/digest error", e2);
            messageDigest2 = null;
        }
        this.A01 = messageDigest2;
    }
}
