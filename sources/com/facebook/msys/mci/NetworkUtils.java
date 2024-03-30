package com.facebook.msys.mci;

import X.C98034qj;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;

public class NetworkUtils {
    public static native String getMqttSandboxDomain();

    public static native String getSandboxDomain();

    public static native synchronized void setMqttSandboxDomain(String str);

    public static native synchronized void setSandboxDomain(String str);

    public static Map flattenHeaders(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    hashMap.put(entry.getKey(), ((List) entry.getValue()).get(0));
                } else if (list.size() > 1) {
                    StringBuilder sb = new StringBuilder(list.size() * 16);
                    for (int i = 1; i < list.size(); i++) {
                        sb.append(',');
                        sb.append((String) list.get(i));
                    }
                    hashMap.put(entry.getKey(), sb.toString());
                }
            }
        }
        return hashMap;
    }

    public static void markDataTaskCompleted(DataTask dataTask, NetworkSession networkSession, UrlResponse urlResponse, String str, byte[] bArr, File file, IOException iOException) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null) {
            sb.append(str);
            sb.append("markDataTaskCompletedInExecution, id=%s");
            sb.append(dataTask.mTaskIdentifier);
        } else {
            sb.append(str);
            sb.append("markDataTaskCompletedInExecution, id=%s, bytes=%d");
            sb.append(dataTask.mTaskIdentifier);
            sb.append(bArr.length);
        }
        Log.i(sb.toString());
        Execution.executeAsyncWithPriority(new C98034qj(dataTask, networkSession, urlResponse, str, bArr, file, iOException), 3, 0);
    }

    public static UrlResponse newErrorURLResponse(UrlRequest urlRequest) {
        return new UrlResponse(urlRequest, 0, new HashMap());
    }

    public static Pair httpHeaderMapToKeysAndValues(Map map) {
        Object[] objArr = new String[map.size()];
        Object[] objArr2 = new String[map.size()];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        return new Pair(objArr, objArr2);
    }

    public static Map flattenHeaders(Header[] headerArr) {
        HashMap hashMap = new HashMap();
        for (Header header : headerArr) {
            hashMap.put(header.getName(), header.getValue());
        }
        return hashMap;
    }
}
