package X;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: X.ADf  reason: case insensitive filesystem */
public class C21223ADf implements C22822AwX {
    public Cipher A00;
    public SecretKey A01;
    public byte[] A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.A00 = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        throw X.C165577te.A0V("No such padding", r1, (byte) 80);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        throw X.C165577te.A0V("AES/GCM/NoPadding not found", r1, (byte) 80);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(byte[] r5, byte[] r6) {
        /*
            r4 = this;
            java.lang.String r3 = "AES/GCM/NoPadding"
            r2 = 80
            if (r5 == 0) goto L_0x004a
            int r1 = r5.length
            r0 = 16
            if (r1 != r0) goto L_0x004a
            if (r6 == 0) goto L_0x0043
            int r1 = r6.length
            r0 = 12
            if (r1 != r0) goto L_0x0043
            r4.A02 = r6
            javax.crypto.spec.SecretKeySpec r0 = X.C90494aF.A0m(r5)
            r4.A01 = r0
            java.lang.String r0 = "AndroidOpenSSL"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r3, r0)     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x0023 }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x0023 }
            return
        L_0x0023:
            java.lang.String r0 = "SC"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r3, r0)     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x002c }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x002c }
            return
        L_0x002c:
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x003b, NoSuchPaddingException -> 0x0033 }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException -> 0x003b, NoSuchPaddingException -> 0x0033 }
            return
        L_0x0033:
            r1 = move-exception
            java.lang.String r0 = "No such padding"
            X.0yt r0 = X.C165577te.A0V(r0, r1, r2)
            throw r0
        L_0x003b:
            r1 = move-exception
            java.lang.String r0 = "AES/GCM/NoPadding not found"
            X.0yt r0 = X.C165577te.A0V(r0, r1, r2)
            throw r0
        L_0x0043:
            java.lang.String r0 = "Invalid iv length."
            X.0yt r0 = X.C165567td.A0E(r0, r2)
            throw r0
        L_0x004a:
            java.lang.String r0 = "Invalid key length."
            X.0yt r0 = X.C165567td.A0E(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21223ADf.A00(byte[], byte[]):void");
    }
}
