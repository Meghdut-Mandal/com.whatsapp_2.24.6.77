package X;

import java.security.cert.CertificateEncodingException;

/* renamed from: X.AtQ  reason: case insensitive filesystem */
public class C22722AtQ extends C21879Ac5 {
    public final byte[] encoding;

    public C22722AtQ(String str, C22619Arl arl, C22616Ari ari, C22844Awt awt, byte[] bArr, byte[] bArr2, boolean[] zArr) {
        super(str, arl, ari, awt, bArr, zArr);
        this.encoding = bArr2;
    }

    public byte[] getEncoded() {
        byte[] bArr = this.encoding;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException();
    }
}
