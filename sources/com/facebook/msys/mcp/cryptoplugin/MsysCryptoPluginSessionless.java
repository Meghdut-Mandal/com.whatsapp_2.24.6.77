package com.facebook.msys.mcp.cryptoplugin;

import X.C90524aI;
import android.net.Uri;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MsysCryptoPluginSessionless extends Sessionless {
    public String MsysCryptoImpl_MsysCryptoCreateMD5DigestHandler(byte[] bArr) {
        return new String(DefaultCrypto.mCrypto.computeMd5(bArr), StandardCharsets.UTF_8);
    }

    public String MsysCryptoImpl_MsysCryptoCreateSHA256DigestHandler(byte[] bArr, String str) {
        return DefaultCrypto.mCrypto.computeSHA256(bArr, str);
    }

    public String MsysCryptoImpl_MsysCryptoCreateSHA256HashFromFileUrl(Uri uri, String str) {
        try {
            return DefaultCrypto.mCrypto.computeSHA256(uri.toString(), str);
        } catch (IOException e) {
            throw C90524aI.A0e("Failed to compute SHA256.", e);
        }
    }
}
