package com.facebook.msys.mcp.cryptoplugin;

import android.net.Uri;

public abstract class Sessionless {
    public abstract String MsysCryptoImpl_MsysCryptoCreateMD5DigestHandler(byte[] bArr);

    public abstract String MsysCryptoImpl_MsysCryptoCreateSHA256DigestHandler(byte[] bArr, String str);

    public abstract String MsysCryptoImpl_MsysCryptoCreateSHA256HashFromFileUrl(Uri uri, String str);
}
