package X;

import java.security.cert.CRLException;

/* renamed from: X.AtO  reason: case insensitive filesystem */
public class C22720AtO extends C21875Ac1 {
    public final byte[] A00;

    public C22720AtO(String str, C22606ArY arY, C22844Awt awt, byte[] bArr, byte[] bArr2, boolean z) {
        super(str, arY, awt, bArr, z);
        this.A00 = bArr2;
    }

    public byte[] getEncoded() {
        byte[] bArr = this.A00;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
