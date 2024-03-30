package com.facebook.cameracore.mediapipeline.services.externalasset;

import X.C107735Qq;
import X.C90474aD;
import com.facebook.native_bridge.NativeDataPromise;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ExampleExternalAssetLocalDataSource implements ExternalAssetLocalDataSource {
    private String getLocalFilePath(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URI(str).toURL();
            String protocol = url.getProtocol();
            if (protocol != null && protocol.equals("file")) {
                return url.getPath();
            }
        } catch (MalformedURLException | URISyntaxException unused) {
        }
        return null;
    }

    public boolean getAsset(NativeDataPromise nativeDataPromise, String str, String str2) {
        DataInputStream dataInputStream;
        String localFilePath = getLocalFilePath(str);
        if (localFilePath == null) {
            return false;
        }
        C107735Qq r5 = new C107735Qq(localFilePath);
        byte[] bArr = new byte[((int) r5.length())];
        try {
            dataInputStream = new DataInputStream(C90474aD.A0U(r5));
            dataInputStream.readFully(bArr);
            ExternalAssetResponse externalAssetResponse = new ExternalAssetResponse();
            externalAssetResponse.buffer = bArr;
            externalAssetResponse.length = (int) r5.length();
            externalAssetResponse.completed = true;
            nativeDataPromise.setValue(externalAssetResponse);
            dataInputStream.close();
            return true;
        } catch (IOException unused) {
            nativeDataPromise.setException("ExampleExternalAssetLocalDataSource fails to load file.");
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getStreamingURI(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r5.hashCode()
            switch(r0) {
                case -384488815: goto L_0x003d;
                case 452781974: goto L_0x0032;
                case 1911932022: goto L_0x0027;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Integer r1 = X.C023109s.A0G
        L_0x0009:
            java.lang.Integer r0 = X.C023109s.A01
            r2 = 0
            if (r1 != r0) goto L_0x0048
            java.lang.String r0 = r3.getLocalFilePath(r4)
            if (r0 == 0) goto L_0x0048
            java.io.File r1 = X.C90524aI.A0S(r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x0048
            java.net.URI r0 = r1.toURI()
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0027:
            java.lang.String r0 = "image/*"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r1 = X.C023109s.A00
            goto L_0x0009
        L_0x0032:
            java.lang.String r0 = "video/*"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r1 = X.C023109s.A01
            goto L_0x0009
        L_0x003d:
            java.lang.String r0 = "model/gltf-binary"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r1 = X.C023109s.A0C
            goto L_0x0009
        L_0x0048:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.externalasset.ExampleExternalAssetLocalDataSource.getStreamingURI(java.lang.String, java.lang.String):java.lang.String");
    }
}
