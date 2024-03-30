package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import X.C90524aI;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public class HTTPClientResponseHandler implements ResponseHandler {
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        HTTPResponse hTTPResponse = new HTTPResponse();
        hTTPResponse.statusCode = httpResponse.getStatusLine().getStatusCode();
        Header[] allHeaders = httpResponse.getAllHeaders();
        if (allHeaders == null) {
            hTTPResponse.headerNames = new String[0];
            hTTPResponse.headerValues = new String[0];
        } else {
            int length = allHeaders.length;
            String[] strArr = new String[length];
            String[] strArr2 = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = allHeaders[i].getName();
                strArr2[i] = allHeaders[i].getValue();
            }
            hTTPResponse.headerNames = strArr;
            hTTPResponse.headerValues = strArr2;
        }
        InputStream content = httpResponse.getEntity().getContent();
        ByteArrayOutputStream A0Q = C90524aI.A0Q();
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        while (true) {
            int read = content.read(bArr, 0, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            if (read != -1) {
                A0Q.write(bArr, 0, read);
            } else {
                A0Q.flush();
                content.close();
                hTTPResponse.content = A0Q.toByteArray();
                return hTTPResponse;
            }
        }
    }
}
