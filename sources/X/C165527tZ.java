package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.7tZ  reason: invalid class name and case insensitive filesystem */
public class C165527tZ implements C160087kR {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C165527tZ(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A01 = obj4;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2J(X.C123815x8 r41) {
        /*
            r40 = this;
            r8 = r40
            int r1 = r8.A04
            r0 = 0
            r4 = r41
            if (r1 == 0) goto L_0x00b2
            X.AnonymousClass00C.A0D(r4, r0)
            boolean r0 = X.C224714l.A02()
            r0 = r0 ^ 1
            X.C18740tg.A0C(r0)
            int r0 = r4.A00
            if (r0 == 0) goto L_0x004a
            java.lang.Object r5 = r8.A03
            X.1UD r5 = (X.AnonymousClass1UD) r5
            X.1UF r3 = r5.A04
            if (r3 == 0) goto L_0x0043
            X.66O r2 = r4.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.waffle.utils.graphql.WaffleGraphqlErrorProcessor"
            X.AnonymousClass00C.A0E(r2, r0)
            X.2Uy r2 = (X.C46112Uy) r2
            java.lang.Object r7 = r8.A02
            X.6Ee r7 = (X.C128936Ee) r7
            java.lang.Object r6 = r8.A01
            java.lang.Object r8 = r8.A00
            r9 = 17
            X.73N r4 = new X.73N
            r4.<init>(r5, r6, r7, r8, r9)
            r1 = 0
            X.7s6 r0 = new X.7s6
            r0.<init>(r8, r1)
            r3.A00(r7, r0, r2, r4)
            return
        L_0x0043:
            java.lang.String r0 = "waffleGraphqlErrorHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x004a:
            java.lang.Object r1 = r8.A00
            X.61K r1 = (X.AnonymousClass61K) r1
            X.60z r0 = r4.A03
            java.lang.Object r3 = r0.A00
            X.6PC r3 = (X.AnonymousClass6PC) r3
            if (r3 != 0) goto L_0x0067
            java.lang.String r0 = "WaffleClientCacheImpl/fetchDataFromServerWithHandler:onSuccess Empty response, clearing cache"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1UC r1 = r1.A00
            java.lang.String r0 = X.AnonymousClass1UC.A07
            android.content.SharedPreferences r0 = r1.A06()
            X.C90504aG.A12(r0)
            return
        L_0x0067:
            X.1UC r4 = r1.A00
            java.lang.String r0 = X.AnonymousClass1UC.A07
            monitor-enter(r4)
            android.content.SharedPreferences r0 = r4.A06()     // Catch:{ all -> 0x00af }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "auto_crossposting"
            X.6Oy r5 = r3.A00     // Catch:{ all -> 0x00af }
            boolean r6 = r5.A00     // Catch:{ all -> 0x00af }
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r6)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "crossposting_destination"
            java.lang.String r2 = r3.A01     // Catch:{ all -> 0x00af }
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "crossposting_destination_fb"
            android.content.SharedPreferences$Editor r2 = r1.putString(r0, r2)     // Catch:{ all -> 0x00af }
            java.lang.String r1 = "crossposting_destination_ig"
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x00af }
            android.content.SharedPreferences$Editor r3 = r2.putString(r1, r0)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "last_cache_update_time"
            X.0wo r0 = r4.A02     // Catch:{ all -> 0x00af }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x00af }
            android.content.SharedPreferences$Editor r1 = r3.putLong(r2, r0)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "fb_auto_crossposting"
            android.content.SharedPreferences$Editor r2 = r1.putBoolean(r0, r6)     // Catch:{ all -> 0x00af }
            java.lang.String r1 = "ig_auto_crossposting"
            boolean r0 = r5.A01     // Catch:{ all -> 0x00af }
            X.C36331k8.A0w(r2, r1, r0)     // Catch:{ all -> 0x00af }
            monitor-exit(r4)
            return
        L_0x00af:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00b2:
            X.AnonymousClass00C.A0D(r4, r0)
            X.60z r2 = r4.A03
            X.AnonymousClass00C.A08(r2)
            X.66O r1 = r4.A04
            X.AnonymousClass00C.A08(r1)
            int r0 = r4.A00
            r11 = 0
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r1 = r1.A00(r11)
            boolean r0 = r1 instanceof X.AnonymousClass5UQ
            if (r0 == 0) goto L_0x00cf
            r11 = r1
            java.lang.Throwable r11 = (java.lang.Throwable) r11
        L_0x00cf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ARDModelMetadataDownloader Error response: "
            X.C36321k7.A1J(r11, r0, r1)
            java.lang.Object r6 = r8.A01
            X.02t r6 = (X.C006302t) r6
            if (r11 != 0) goto L_0x00e0
            X.4xE r11 = X.C101244xE.A00
        L_0x00e0:
            X.5VK r0 = X.C139466ju.A00(r11)
        L_0x00e4:
            r6.invoke(r0)
            return
        L_0x00e8:
            java.lang.String r0 = "ARDModelMetadataDownloader Success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r2.A00
            X.6D8 r0 = (X.AnonymousClass6D8) r0
            if (r0 == 0) goto L_0x016b
            java.util.List r3 = r0.A00
            java.lang.Object r10 = r8.A02
            java.util.List r10 = (java.util.List) r10
            r6 = 10
            java.util.ArrayList r2 = X.C36351kA.A0z(r10)
            java.util.Iterator r1 = r10.iterator()
        L_0x0103:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r0 = (com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest) r0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r0.mCapability
            r2.add(r0)
            goto L_0x0103
        L_0x0115:
            java.util.Set r5 = X.C007103b.A0f(r2)
            java.util.ArrayList r2 = X.C36351kA.A0z(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0121:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r1.next()
            X.6C4 r0 = (X.AnonymousClass6C4) r0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r0.A01
            r2.add(r0)
            goto L_0x0121
        L_0x0133:
            java.util.Set r4 = X.C007103b.A0f(r2)
            boolean r0 = X.AnonymousClass00C.A0J(r4, r5)
            if (r0 != 0) goto L_0x0177
            java.lang.Object r6 = r8.A01
            X.02t r6 = (X.C006302t) r6
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Requested for "
            r3.append(r0)
            java.util.List r0 = X.C007103b.A0X(r5)
            java.lang.String r2 = ", "
            java.lang.String r1 = ""
            java.lang.String r0 = X.C007103b.A0Q(r2, r1, r1, r0, r11)
            r3.append(r0)
            java.lang.String r0 = ", received "
            r3.append(r0)
            java.util.List r0 = X.C007103b.A0X(r4)
            java.lang.String r0 = X.C007103b.A0Q(r2, r1, r1, r0, r11)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r3)
            goto L_0x0171
        L_0x016b:
            java.lang.Object r6 = r8.A01
            X.02t r6 = (X.C006302t) r6
            X.4xD r0 = X.C101234xD.A00
        L_0x0171:
            X.5VK r0 = X.C139466ju.A00(r0)
            goto L_0x00e4
        L_0x0177:
            int r0 = X.AnonymousClass03U.A06(r3, r6)     // Catch:{ 5VK -> 0x023f }
            int r1 = X.C000300d.A02(r0)     // Catch:{ 5VK -> 0x023f }
            r0 = 16
            if (r1 >= r0) goto L_0x0185
            r1 = 16
        L_0x0185:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ 5VK -> 0x023f }
            r9.<init>(r1)     // Catch:{ 5VK -> 0x023f }
            java.util.Iterator r17 = r3.iterator()     // Catch:{ 5VK -> 0x023f }
        L_0x018e:
            boolean r0 = r17.hasNext()     // Catch:{ 5VK -> 0x023f }
            if (r0 == 0) goto L_0x0237
            java.lang.Object r7 = r17.next()     // Catch:{ 5VK -> 0x023f }
            X.6C4 r7 = (X.AnonymousClass6C4) r7     // Catch:{ 5VK -> 0x023f }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = r7.A01     // Catch:{ 5VK -> 0x023f }
            java.util.List r0 = r7.A02     // Catch:{ 5VK -> 0x023f }
            java.util.ArrayList r5 = X.C36351kA.A0z(r0)     // Catch:{ 5VK -> 0x023f }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ 5VK -> 0x023f }
        L_0x01a6:
            boolean r0 = r16.hasNext()     // Catch:{ 5VK -> 0x023f }
            if (r0 == 0) goto L_0x0212
            java.lang.Object r12 = r16.next()     // Catch:{ 5VK -> 0x023f }
            X.6E2 r12 = (X.AnonymousClass6E2) r12     // Catch:{ 5VK -> 0x023f }
            int r0 = r7.A00     // Catch:{ 5VK -> 0x023f }
            r20 = r0
            X.00T r0 = X.C114005gU.A02     // Catch:{ 5VK -> 0x023f }
            java.lang.Object r0 = X.C36381kD.A0p(r0)     // Catch:{ 5VK -> 0x023f }
            X.0wy r0 = (X.C20070wy) r0     // Catch:{ 5VK -> 0x023f }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ 5VK -> 0x023f }
            X.0wy r0 = (X.C20070wy) r0     // Catch:{ 5VK -> 0x023f }
            if (r0 == 0) goto L_0x0217
            X.5Tl r4 = r12.A02     // Catch:{ 5VK -> 0x023f }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ 5VK -> 0x023f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 5VK -> 0x023f }
            if (r3 == 0) goto L_0x0217
            java.lang.String r0 = r12.A04     // Catch:{ 5VK -> 0x023f }
            r18 = r0
            X.6B3 r0 = r12.A03     // Catch:{ 5VK -> 0x023f }
            java.lang.String r15 = r0.A00     // Catch:{ 5VK -> 0x023f }
            java.lang.String r14 = r12.A06     // Catch:{ 5VK -> 0x023f }
            int r0 = r12.A00     // Catch:{ 5VK -> 0x023f }
            long r1 = (long) r0     // Catch:{ 5VK -> 0x023f }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r13 = r12.A01     // Catch:{ 5VK -> 0x023f }
            java.lang.String r12 = r12.A05     // Catch:{ 5VK -> 0x023f }
            java.lang.Integer r24 = X.C023109s.A01     // Catch:{ 5VK -> 0x023f }
            r38 = 0
            com.facebook.cameracore.ardelivery.model.ARAssetType r19 = com.facebook.cameracore.ardelivery.model.ARAssetType.SUPPORT     // Catch:{ 5VK -> 0x023f }
            X.6c3 r0 = new X.6c3     // Catch:{ 5VK -> 0x023f }
            r28 = r15
            r31 = r11
            r33 = r11
            r34 = r11
            r21 = r11
            r25 = r18
            r26 = r11
            r27 = r15
            r29 = r14
            r30 = r3
            r32 = r12
            r35 = r20
            r36 = r1
            r18 = r0
            r20 = r13
            r22 = r4
            r23 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)     // Catch:{ 5VK -> 0x023f }
            r5.add(r0)     // Catch:{ 5VK -> 0x023f }
            goto L_0x01a6
        L_0x0212:
            r9.put(r6, r5)     // Catch:{ 5VK -> 0x023f }
            goto L_0x018e
        L_0x0217:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5VK -> 0x023f }
            java.lang.String r0 = "No hash found for "
            r1.append(r0)     // Catch:{ 5VK -> 0x023f }
            r1.append(r6)     // Catch:{ 5VK -> 0x023f }
            java.lang.String r0 = " and "
            r1.append(r0)     // Catch:{ 5VK -> 0x023f }
            X.5Tl r0 = r12.A02     // Catch:{ 5VK -> 0x023f }
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ 5VK -> 0x023f }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ 5VK -> 0x023f }
            X.5VK r0 = X.C139466ju.A00(r0)     // Catch:{ 5VK -> 0x023f }
            throw r0     // Catch:{ 5VK -> 0x023f }
        L_0x0237:
            java.lang.Object r0 = r8.A00
            X.7eY r0 = (X.AnonymousClass7eY) r0
            r0.BU6(r11, r10, r9)
            return
        L_0x023f:
            r1 = move-exception
            java.lang.Object r0 = r8.A01
            X.02t r0 = (X.C006302t) r0
            r0.invoke(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165527tZ.B2J(X.5x8):void");
    }

    public void BVL(IOException iOException) {
        if (this.A04 != 0) {
            Log.e("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onDeliveryFailure");
            return;
        }
        AnonymousClass00C.A0D(iOException, 0);
        ((AnonymousClass7eY) this.A00).BU6(C139466ju.A00(iOException), (List) this.A02, (Map) null);
    }

    public void BWk(Exception exc) {
        if (this.A04 != 0) {
            C36321k7.A1S("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onFailure Error code: ", AnonymousClass000.A0u(), 1);
            return;
        }
        AnonymousClass00C.A0D(exc, 0);
        ((AnonymousClass7eY) this.A00).BU6(C139466ju.A00(exc), (List) this.A02, (Map) null);
    }
}
