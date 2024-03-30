package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import X.C114735hk;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;

public class NetworkClientImpl extends NetworkClient {
    public final C114735hk mWorker;

    private native HybridData initHybrid();

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00de A[SYNTHETIC, Splitter:B:31:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendRequest(com.facebook.native_bridge.NativeDataPromise r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String[] r22, java.lang.String[] r23, boolean r24) {
        /*
            r17 = this;
            r12 = r21
            r0 = r17
            r1 = r18
            X.5hk r6 = r0.mWorker     // Catch:{ Exception -> 0x00e9 }
            com.facebook.cameracore.mediapipeline.services.networking.implementation.HTTPClientResponseHandler r3 = new com.facebook.cameracore.mediapipeline.services.networking.implementation.HTTPClientResponseHandler     // Catch:{ Exception -> 0x00e9 }
            r3.<init>()     // Catch:{ Exception -> 0x00e9 }
            X.6nn r2 = new X.6nn     // Catch:{ Exception -> 0x00e9 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x00e9 }
            r15 = 0
            r11 = r19
            X.AnonymousClass00C.A0D(r11, r15)     // Catch:{ Exception -> 0x00e9 }
            r5 = r20
            r10 = r22
            X.C36321k7.A0y(r5, r10)     // Catch:{ Exception -> 0x00e9 }
            r0 = 4
            r9 = r23
            X.AnonymousClass00C.A0D(r9, r0)     // Catch:{ Exception -> 0x00e9 }
            X.5oI r4 = new X.5oI     // Catch:{ Exception -> 0x00e9 }
            r4.<init>(r2, r3)     // Catch:{ Exception -> 0x00e9 }
            X.5tr r2 = r6.A00     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = "AvatarSdkHttpClient Starting request"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00e9 }
            r3 = 0
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ all -> 0x00d1 }
            java.lang.String r6 = r5.toUpperCase(r0)     // Catch:{ all -> 0x00d1 }
            X.AnonymousClass00C.A08(r6)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "GET"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = "POST"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x0059
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "Unsupported method: "
            r2.append(r0)     // Catch:{ all -> 0x00d1 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r5, r2)     // Catch:{ all -> 0x00d1 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x0059:
            int r5 = r10.length     // Catch:{ all -> 0x00d1 }
            int r0 = r9.length     // Catch:{ all -> 0x00d1 }
            int r8 = java.lang.Math.min(r5, r0)     // Catch:{ all -> 0x00d1 }
            java.util.ArrayList r7 = X.C36441kJ.A14(r8)     // Catch:{ all -> 0x00d1 }
            r6 = 0
        L_0x0064:
            if (r6 >= r8) goto L_0x0070
            r5 = r22[r6]     // Catch:{ all -> 0x00d1 }
            r0 = r23[r6]     // Catch:{ all -> 0x00d1 }
            X.C90494aF.A1F(r5, r0, r7)     // Catch:{ all -> 0x00d1 }
            int r6 = r6 + 1
            goto L_0x0064
        L_0x0070:
            java.util.Map r14 = X.C000400e.A09(r7)     // Catch:{ all -> 0x00d1 }
            X.13E r9 = r2.A01     // Catch:{ all -> 0x00d1 }
            if (r21 == 0) goto L_0x007e
            int r0 = r12.length()     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x007f
        L_0x007e:
            r12 = r3
        L_0x007f:
            X.0wt r0 = r2.A02     // Catch:{ all -> 0x00d1 }
            java.lang.String r13 = r0.A02()     // Catch:{ all -> 0x00d1 }
            r0 = 35
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r16 = 0
            X.6v1 r6 = r9.A03(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00d1 }
            java.net.HttpURLConnection r0 = r6.A01     // Catch:{ all -> 0x00ce }
            int r8 = r0.getResponseCode()     // Catch:{ all -> 0x00ce }
            X.0ww r0 = r2.A00     // Catch:{ all -> 0x00ce }
            X.5RE r7 = r6.B8D(r0, r3, r10)     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "AvatarSdkHttpClient Success with code: "
            X.C36321k7.A1T(r0, r2, r8)     // Catch:{ all -> 0x00ce }
            org.apache.http.HttpVersion r3 = org.apache.http.HttpVersion.HTTP_1_1     // Catch:{ all -> 0x00ce }
            org.apache.http.impl.EnglishReasonPhraseCatalog r2 = org.apache.http.impl.EnglishReasonPhraseCatalog.INSTANCE     // Catch:{ all -> 0x00ce }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r2.getReason(r8, r0)     // Catch:{ all -> 0x00ce }
            org.apache.http.message.BasicHttpResponse r5 = new org.apache.http.message.BasicHttpResponse     // Catch:{ all -> 0x00ce }
            r5.<init>(r3, r8, r0)     // Catch:{ all -> 0x00ce }
            r2 = -1
            org.apache.http.entity.InputStreamEntity r0 = new org.apache.http.entity.InputStreamEntity     // Catch:{ all -> 0x00ce }
            r0.<init>(r7, r2)     // Catch:{ all -> 0x00ce }
            r5.setEntity(r0)     // Catch:{ all -> 0x00ce }
            X.7is r2 = r4.A00     // Catch:{ all -> 0x00ce }
            org.apache.http.client.ResponseHandler r0 = r4.A01     // Catch:{ all -> 0x00ce }
            java.lang.Object r0 = r0.handleResponse(r5)     // Catch:{ all -> 0x00ce }
            r2.onSuccess(r0)     // Catch:{ all -> 0x00ce }
            r6.close()     // Catch:{ Exception -> 0x00e9 }
            return
        L_0x00ce:
            r2 = move-exception
            r3 = r6
            goto L_0x00d2
        L_0x00d1:
            r2 = move-exception
        L_0x00d2:
            java.lang.String r0 = "AvatarSdkHttpClient Error occurred"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00e2 }
            X.7is r0 = r4.A00     // Catch:{ all -> 0x00e2 }
            r0.BXQ(r2)     // Catch:{ all -> 0x00e2 }
            if (r3 == 0) goto L_0x00f1
            r3.close()     // Catch:{ Exception -> 0x00e9 }
            return
        L_0x00e2:
            r0 = move-exception
            if (r3 == 0) goto L_0x00e8
            r3.close()     // Catch:{ Exception -> 0x00e9 }
        L_0x00e8:
            throw r0     // Catch:{ Exception -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r1.setException(r0)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl.sendRequest(com.facebook.native_bridge.NativeDataPromise, java.lang.String, java.lang.String, java.lang.String, java.lang.String[], java.lang.String[], boolean):void");
    }

    public NetworkClientImpl(C114735hk r2) {
        this.mWorker = r2;
        this.mHybridData = initHybrid();
    }
}
