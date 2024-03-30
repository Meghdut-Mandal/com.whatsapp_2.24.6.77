package X;

import android.util.JsonWriter;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.8mn  reason: invalid class name and case insensitive filesystem */
public abstract class C181018mn extends AnonymousClass3T1 {
    public DeviceJid A00;
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0129, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0130, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0134, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A1X() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass8Y0
            if (r0 == 0) goto L_0x00a7
            r1 = r7
            X.8Y0 r1 = (X.AnonymousClass8Y0) r1
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            android.util.JsonWriter r3 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0292 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0292 }
            A00(r3, r1)     // Catch:{ all -> 0x009d }
            java.util.HashMap r5 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "stickerResults"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x009d }
            r0.beginObject()     // Catch:{ all -> 0x009d }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x009d }
            java.util.Iterator r6 = X.AnonymousClass000.A0y(r0)     // Catch:{ all -> 0x009d }
        L_0x0027:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0061
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r6)     // Catch:{ all -> 0x009d }
            java.lang.String r1 = X.C90494aF.A0f(r2)     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x009d }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x009d }
            X.918 r0 = (X.AnonymousClass918) r0     // Catch:{ all -> 0x009d }
            r5.put(r1, r0)     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x009d }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x009d }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x009d }
            X.8SA r1 = (X.AnonymousClass8SA) r1     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0027
            java.lang.String r0 = X.C90494aF.A0f(r2)     // Catch:{ all -> 0x009d }
            r3.name(r0)     // Catch:{ all -> 0x009d }
            byte[] r0 = r1.A0o()     // Catch:{ all -> 0x009d }
            java.lang.String r0 = X.C36441kJ.A13(r0)     // Catch:{ all -> 0x009d }
            r3.value(r0)     // Catch:{ all -> 0x009d }
            goto L_0x0027
        L_0x0061:
            r3.endObject()     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "requestResults"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x009d }
            r0.beginObject()     // Catch:{ all -> 0x009d }
            java.util.Iterator r2 = X.C36371kC.A10(r5)     // Catch:{ all -> 0x009d }
        L_0x0071:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x008f
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r2)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = X.C90494aF.A0f(r1)     // Catch:{ all -> 0x009d }
            r3.name(r0)     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x009d }
            X.918 r0 = (X.AnonymousClass918) r0     // Catch:{ all -> 0x009d }
            int r0 = r0.value     // Catch:{ all -> 0x009d }
            long r0 = (long) r0     // Catch:{ all -> 0x009d }
            r3.value(r0)     // Catch:{ all -> 0x009d }
            goto L_0x0071
        L_0x008f:
            r3.endObject()     // Catch:{ all -> 0x009d }
            r3.endObject()     // Catch:{ all -> 0x009d }
            r3.flush()     // Catch:{ all -> 0x009d }
            r3.close()     // Catch:{ IOException -> 0x0292 }
            goto L_0x01d7
        L_0x009d:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0292 }
        L_0x00a6:
            throw r1     // Catch:{ IOException -> 0x0292 }
        L_0x00a7:
            boolean r0 = r7 instanceof X.C174648Xx
            if (r0 == 0) goto L_0x00d8
            r2 = r7
            X.8mm r2 = (X.C181008mm) r2
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            android.util.JsonWriter r0 = new android.util.JsonWriter     // Catch:{ IOException -> 0x00d3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00d3 }
            A00(r0, r2)     // Catch:{ all -> 0x00c9 }
            r0.endObject()     // Catch:{ all -> 0x00c9 }
            r0.flush()     // Catch:{ all -> 0x00c9 }
            r0.close()     // Catch:{ IOException -> 0x00d3 }
            java.lang.String r0 = r1.toString()
            return r0
        L_0x00c9:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00ce }
            goto L_0x00d2
        L_0x00ce:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00d3 }
        L_0x00d2:
            throw r1     // Catch:{ IOException -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/writeData failed"
            goto L_0x0295
        L_0x00d8:
            boolean r0 = r7 instanceof X.C174658Xy
            if (r0 == 0) goto L_0x013c
            r1 = r7
            X.8Xy r1 = (X.C174658Xy) r1
            r4 = 0
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ IOException -> 0x0135 }
            r3.<init>()     // Catch:{ IOException -> 0x0135 }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ all -> 0x012e }
            r2.<init>(r3)     // Catch:{ all -> 0x012e }
            A00(r2, r1)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "peerDataOperationResults"
            r2.name(r0)     // Catch:{ all -> 0x0127 }
            r2.beginArray()     // Catch:{ all -> 0x0127 }
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x0127 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0127 }
        L_0x00fb:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0127 }
            X.8Qi r0 = (X.C173088Qi) r0     // Catch:{ all -> 0x0127 }
            byte[] r0 = r0.A0o()     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = X.C36441kJ.A13(r0)     // Catch:{ all -> 0x0127 }
            r2.value(r0)     // Catch:{ all -> 0x0127 }
            goto L_0x00fb
        L_0x0113:
            r2.endArray()     // Catch:{ all -> 0x0127 }
            r2.endObject()     // Catch:{ all -> 0x0127 }
            r2.flush()     // Catch:{ all -> 0x0127 }
            r2.close()     // Catch:{ all -> 0x012e }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x012e }
            r3.close()     // Catch:{ IOException -> 0x0135 }
            return r0
        L_0x0127:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x012e }
        L_0x012e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0130 }
        L_0x0130:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ IOException -> 0x0135 }
            throw r0     // Catch:{ IOException -> 0x0135 }
        L_0x0135:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataPlaceholderResendResponse/writeData failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x013c:
            boolean r0 = r7 instanceof X.C174668Xz
            if (r0 == 0) goto L_0x01eb
            r1 = r7
            X.8Xz r1 = (X.C174668Xz) r1
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            android.util.JsonWriter r3 = new android.util.JsonWriter     // Catch:{ IOException -> 0x01e6 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x01e6 }
            A00(r3, r1)     // Catch:{ all -> 0x01dc }
            java.util.HashMap r5 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = "linkPreviewResults"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x01dc }
            r0.beginObject()     // Catch:{ all -> 0x01dc }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x01dc }
            java.util.Iterator r6 = X.AnonymousClass000.A0y(r0)     // Catch:{ all -> 0x01dc }
        L_0x0163:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x019d
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r6)     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = X.C90494aF.A0f(r2)     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x01dc }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x01dc }
            X.918 r0 = (X.AnonymousClass918) r0     // Catch:{ all -> 0x01dc }
            r5.put(r1, r0)     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x01dc }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x01dc }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x01dc }
            X.8Rh r1 = (X.C173338Rh) r1     // Catch:{ all -> 0x01dc }
            if (r1 == 0) goto L_0x0163
            java.lang.String r0 = X.C90494aF.A0f(r2)     // Catch:{ all -> 0x01dc }
            r3.name(r0)     // Catch:{ all -> 0x01dc }
            byte[] r0 = r1.A0o()     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = X.C36441kJ.A13(r0)     // Catch:{ all -> 0x01dc }
            r3.value(r0)     // Catch:{ all -> 0x01dc }
            goto L_0x0163
        L_0x019d:
            r3.endObject()     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = "requestResults"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x01dc }
            r0.beginObject()     // Catch:{ all -> 0x01dc }
            java.util.Iterator r2 = X.C36371kC.A10(r5)     // Catch:{ all -> 0x01dc }
        L_0x01ad:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x01cb
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r2)     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = X.C90494aF.A0f(r1)     // Catch:{ all -> 0x01dc }
            r3.name(r0)     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x01dc }
            X.918 r0 = (X.AnonymousClass918) r0     // Catch:{ all -> 0x01dc }
            int r0 = r0.value     // Catch:{ all -> 0x01dc }
            long r0 = (long) r0     // Catch:{ all -> 0x01dc }
            r3.value(r0)     // Catch:{ all -> 0x01dc }
            goto L_0x01ad
        L_0x01cb:
            r3.endObject()     // Catch:{ all -> 0x01dc }
            r3.endObject()     // Catch:{ all -> 0x01dc }
            r3.flush()     // Catch:{ all -> 0x01dc }
            r3.close()     // Catch:{ IOException -> 0x01e6 }
        L_0x01d7:
            java.lang.String r0 = r4.toString()
            return r0
        L_0x01dc:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01e1 }
            goto L_0x01e5
        L_0x01e1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01e6 }
        L_0x01e5:
            throw r1     // Catch:{ IOException -> 0x01e6 }
        L_0x01e6:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/writeData failed"
            goto L_0x0295
        L_0x01eb:
            boolean r0 = r7 instanceof X.C180998ml
            if (r0 == 0) goto L_0x0238
            r4 = r7
            X.8ml r4 = (X.C180998ml) r4
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0234 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0234 }
            r2.beginObject()     // Catch:{ all -> 0x022a }
            X.8NW r0 = r4.A00     // Catch:{ all -> 0x022a }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x022a }
            byte[] r0 = r0.A0o()     // Catch:{ all -> 0x022a }
            java.lang.String r1 = X.C36441kJ.A13(r0)     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "appStateSyncKeyShareProtoString"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x022a }
            r0.value(r1)     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "isNewlyGeneratedKey"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x022a }
            boolean r0 = r4.A01     // Catch:{ all -> 0x022a }
            r1.value(r0)     // Catch:{ all -> 0x022a }
            r2.endObject()     // Catch:{ all -> 0x022a }
            r2.flush()     // Catch:{ all -> 0x022a }
            r2.close()     // Catch:{ IOException -> 0x0234 }
            goto L_0x027f
        L_0x022a:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x022f }
            goto L_0x0233
        L_0x022f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0234 }
        L_0x0233:
            throw r1     // Catch:{ IOException -> 0x0234 }
        L_0x0234:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/writeData failed"
            goto L_0x0295
        L_0x0238:
            r1 = r7
            X.8mk r1 = (X.C180988mk) r1
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x028e }
            r2.<init>(r3)     // Catch:{ IOException -> 0x028e }
            r2.beginObject()     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "key-ids"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0284 }
            r0.beginArray()     // Catch:{ all -> 0x0284 }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x0284 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0284 }
        L_0x0257:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0284 }
            if (r0 == 0) goto L_0x0273
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0284 }
            X.9jo r0 = (X.C201539jo) r0     // Catch:{ all -> 0x0284 }
            X.8Ng r0 = r0.A01()     // Catch:{ all -> 0x0284 }
            byte[] r0 = r0.A0o()     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = X.C36441kJ.A13(r0)     // Catch:{ all -> 0x0284 }
            r2.value(r0)     // Catch:{ all -> 0x0284 }
            goto L_0x0257
        L_0x0273:
            r2.endArray()     // Catch:{ all -> 0x0284 }
            r2.endObject()     // Catch:{ all -> 0x0284 }
            r2.flush()     // Catch:{ all -> 0x0284 }
            r2.close()     // Catch:{ IOException -> 0x028e }
        L_0x027f:
            java.lang.String r0 = r3.toString()
            return r0
        L_0x0284:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0289 }
            goto L_0x028d
        L_0x0289:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x028e }
        L_0x028d:
            throw r1     // Catch:{ IOException -> 0x028e }
        L_0x028e:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/writeData failed"
            goto L_0x0295
        L_0x0292:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/writeData failed"
        L_0x0295:
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181018mn.A1X():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01dd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Y(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass8Y0
            if (r0 == 0) goto L_0x00ef
            r6 = r8
            X.8Y0 r6 = (X.AnonymousClass8Y0) r6
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x03e1
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            android.util.JsonReader r7 = X.C90484aE.A0Q(r9)     // Catch:{ IOException -> 0x00bd }
            r7.beginObject()     // Catch:{ all -> 0x00b3 }
        L_0x001c:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r3 = r7.nextName()     // Catch:{ all -> 0x00b3 }
            int r1 = r3.hashCode()     // Catch:{ all -> 0x00b3 }
            r0 = -957719559(0xffffffffc6ea5bf9, float:-29997.986)
            r4 = 2
            if (r1 == r0) goto L_0x006c
            r0 = -758599065(0xffffffffd2c8b267, float:-4.30993277E11)
            if (r1 == r0) goto L_0x0049
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x0099
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = r7.nextString()     // Catch:{ all -> 0x00b3 }
            r6.A00 = r0     // Catch:{ all -> 0x00b3 }
            goto L_0x001c
        L_0x0049:
            java.lang.String r0 = "requestResults"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0099
            r7.beginObject()     // Catch:{ all -> 0x00b3 }
        L_0x0054:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = r7.nextName()     // Catch:{ all -> 0x00b3 }
            int r0 = r7.nextInt()     // Catch:{ all -> 0x00b3 }
            X.918 r0 = X.AnonymousClass918.A00(r0)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0054
            r2.put(r1, r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x0054
        L_0x006c:
            java.lang.String r0 = "stickerResults"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0099
            r7.beginObject()     // Catch:{ all -> 0x00b3 }
        L_0x0077:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0095
            java.lang.String r3 = r7.nextName()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = r7.nextString()     // Catch:{ all -> 0x00b3 }
            byte[] r1 = android.util.Base64.decode(r0, r4)     // Catch:{ all -> 0x00b3 }
            X.8SA r0 = X.AnonymousClass8SA.DEFAULT_INSTANCE     // Catch:{ all -> 0x00b3 }
            X.8Hz r0 = X.C170918Hz.A08(r0, r1)     // Catch:{ all -> 0x00b3 }
            X.8SA r0 = (X.AnonymousClass8SA) r0     // Catch:{ all -> 0x00b3 }
            r5.put(r3, r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x0077
        L_0x0095:
            r7.endObject()     // Catch:{ all -> 0x00b3 }
            goto L_0x001c
        L_0x0099:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x00b3 }
            r1.append(r3)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "\""
            X.C36341k9.A1O(r1, r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x001c
        L_0x00ac:
            r7.endObject()     // Catch:{ all -> 0x00b3 }
            r7.close()     // Catch:{ IOException -> 0x00bd }
            goto L_0x00c3
        L_0x00b3:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00bd }
        L_0x00bc:
            throw r1     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/readData failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00c3:
            java.util.Iterator r4 = X.C36371kC.A10(r2)
        L_0x00c7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03e1
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r4)
            java.lang.Object r3 = r0.getKey()
            java.util.Map r2 = r6.A00
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r5.containsKey(r3)
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r5.get(r3)
        L_0x00e5:
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            r2.put(r3, r0)
            goto L_0x00c7
        L_0x00ed:
            r0 = 0
            goto L_0x00e5
        L_0x00ef:
            boolean r0 = r8 instanceof X.C174648Xx
            if (r0 == 0) goto L_0x0148
            r4 = r8
            X.8mm r4 = (X.C181008mm) r4
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x03e1
            android.util.JsonReader r3 = X.C90484aE.A0Q(r9)     // Catch:{ IOException -> 0x03db }
            r3.beginObject()     // Catch:{ all -> 0x013e }
        L_0x0103:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0137
            java.lang.String r2 = r3.nextName()     // Catch:{ all -> 0x013e }
            int r1 = r2.hashCode()     // Catch:{ all -> 0x013e }
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x0125
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x013e }
            r4.A00 = r0     // Catch:{ all -> 0x013e }
            goto L_0x0103
        L_0x0125:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x013e }
            r1.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "\""
            X.C36341k9.A1O(r1, r0)     // Catch:{ all -> 0x013e }
            goto L_0x0103
        L_0x0137:
            r3.endObject()     // Catch:{ all -> 0x013e }
            r3.close()     // Catch:{ IOException -> 0x03db }
            return
        L_0x013e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0143 }
            goto L_0x0147
        L_0x0143:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x03db }
        L_0x0147:
            throw r1     // Catch:{ IOException -> 0x03db }
        L_0x0148:
            boolean r0 = r8 instanceof X.C174658Xy
            if (r0 == 0) goto L_0x01e3
            r5 = r8
            X.8Xy r5 = (X.C174658Xy) r5
            if (r9 == 0) goto L_0x03e1
            int r0 = r9.length()
            if (r0 == 0) goto L_0x03e1
            java.io.StringReader r2 = new java.io.StringReader     // Catch:{ IOException -> 0x01de }
            r2.<init>(r9)     // Catch:{ IOException -> 0x01de }
            android.util.JsonReader r4 = new android.util.JsonReader     // Catch:{ all -> 0x01d7 }
            r4.<init>(r2)     // Catch:{ all -> 0x01d7 }
            java.lang.String r6 = "FMessagePeerDataPlaceholderResendResponse/readData failed"
            r4.beginObject()     // Catch:{ all -> 0x01d0 }
        L_0x0166:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01d0 }
            if (r0 == 0) goto L_0x01c6
            java.lang.String r3 = r4.nextName()     // Catch:{ all -> 0x01d0 }
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)     // Catch:{ all -> 0x01d0 }
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = r4.nextString()     // Catch:{ all -> 0x01d0 }
            r5.A00 = r0     // Catch:{ all -> 0x01d0 }
            goto L_0x0166
        L_0x017f:
            java.lang.String r0 = "peerDataOperationResults"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)     // Catch:{ all -> 0x01d0 }
            if (r0 == 0) goto L_0x01bc
            r4.beginArray()     // Catch:{ all -> 0x01d0 }
            X.0k2 r3 = new X.0k2     // Catch:{ all -> 0x01d0 }
            r3.<init>()     // Catch:{ all -> 0x01d0 }
        L_0x018f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01d0 }
            if (r0 == 0) goto L_0x01b2
            java.lang.String r1 = r4.nextString()     // Catch:{ 186 | IllegalArgumentException -> 0x01ad }
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ 186 | IllegalArgumentException -> 0x01ad }
            X.8Qi r0 = X.C173088Qi.DEFAULT_INSTANCE     // Catch:{ 186 | IllegalArgumentException -> 0x01ad }
            X.8Hz r0 = X.C170918Hz.A08(r0, r1)     // Catch:{ 186 | IllegalArgumentException -> 0x01ad }
            X.8Qi r0 = (X.C173088Qi) r0     // Catch:{ 186 | IllegalArgumentException -> 0x01ad }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 186 | IllegalArgumentException -> 0x01ad }
            r3.add(r0)     // Catch:{ 186 | IllegalArgumentException -> 0x01ad }
            goto L_0x018f
        L_0x01ad:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)     // Catch:{ all -> 0x01d0 }
            goto L_0x018f
        L_0x01b2:
            X.0k2 r0 = X.AnonymousClass03S.A00(r3)     // Catch:{ all -> 0x01d0 }
            r5.A00 = r0     // Catch:{ all -> 0x01d0 }
            r4.endArray()     // Catch:{ all -> 0x01d0 }
            goto L_0x0166
        L_0x01bc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01d0 }
            java.lang.String r0 = "FMessagePeerDataPlaceholderResendResponse/readData unexpected name: "
            X.C36321k7.A1R(r0, r3, r1)     // Catch:{ all -> 0x01d0 }
            goto L_0x0166
        L_0x01c6:
            r4.endObject()     // Catch:{ all -> 0x01d0 }
            r4.close()     // Catch:{ all -> 0x01d7 }
            r2.close()     // Catch:{ IOException -> 0x01de }
            return
        L_0x01d0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01d2 }
        L_0x01d2:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x01d7 }
            throw r0     // Catch:{ all -> 0x01d7 }
        L_0x01d7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x01de }
            throw r0     // Catch:{ IOException -> 0x01de }
        L_0x01de:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataPlaceholderResendResponse/readData failed"
            goto L_0x03de
        L_0x01e3:
            boolean r0 = r8 instanceof X.C174668Xz
            if (r0 == 0) goto L_0x02d2
            r6 = r8
            X.8Xz r6 = (X.C174668Xz) r6
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x03e1
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            android.util.JsonReader r7 = X.C90484aE.A0Q(r9)     // Catch:{ IOException -> 0x02a0 }
            r7.beginObject()     // Catch:{ all -> 0x0296 }
        L_0x01ff:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x028f
            java.lang.String r3 = r7.nextName()     // Catch:{ all -> 0x0296 }
            int r1 = r3.hashCode()     // Catch:{ all -> 0x0296 }
            r0 = -1808687704(0xffffffff94319da8, float:-8.9673085E-27)
            r4 = 2
            if (r1 == r0) goto L_0x024f
            r0 = -758599065(0xffffffffd2c8b267, float:-4.30993277E11)
            if (r1 == r0) goto L_0x022c
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x027c
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x027c
            java.lang.String r0 = r7.nextString()     // Catch:{ all -> 0x0296 }
            r6.A00 = r0     // Catch:{ all -> 0x0296 }
            goto L_0x01ff
        L_0x022c:
            java.lang.String r0 = "requestResults"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x027c
            r7.beginObject()     // Catch:{ all -> 0x0296 }
        L_0x0237:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x0278
            java.lang.String r1 = r7.nextName()     // Catch:{ all -> 0x0296 }
            int r0 = r7.nextInt()     // Catch:{ all -> 0x0296 }
            X.918 r0 = X.AnonymousClass918.A00(r0)     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x0237
            r2.put(r1, r0)     // Catch:{ all -> 0x0296 }
            goto L_0x0237
        L_0x024f:
            java.lang.String r0 = "linkPreviewResults"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x027c
            r7.beginObject()     // Catch:{ all -> 0x0296 }
        L_0x025a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x0278
            java.lang.String r3 = r7.nextName()     // Catch:{ all -> 0x0296 }
            java.lang.String r0 = r7.nextString()     // Catch:{ all -> 0x0296 }
            byte[] r1 = android.util.Base64.decode(r0, r4)     // Catch:{ all -> 0x0296 }
            X.8Rh r0 = X.C173338Rh.DEFAULT_INSTANCE     // Catch:{ all -> 0x0296 }
            X.8Hz r0 = X.C170918Hz.A08(r0, r1)     // Catch:{ all -> 0x0296 }
            X.8Rh r0 = (X.C173338Rh) r0     // Catch:{ all -> 0x0296 }
            r5.put(r3, r0)     // Catch:{ all -> 0x0296 }
            goto L_0x025a
        L_0x0278:
            r7.endObject()     // Catch:{ all -> 0x0296 }
            goto L_0x01ff
        L_0x027c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0296 }
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x0296 }
            r1.append(r3)     // Catch:{ all -> 0x0296 }
            java.lang.String r0 = "\""
            X.C36341k9.A1O(r1, r0)     // Catch:{ all -> 0x0296 }
            goto L_0x01ff
        L_0x028f:
            r7.endObject()     // Catch:{ all -> 0x0296 }
            r7.close()     // Catch:{ IOException -> 0x02a0 }
            goto L_0x02a6
        L_0x0296:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x029b }
            goto L_0x029f
        L_0x029b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x02a0 }
        L_0x029f:
            throw r1     // Catch:{ IOException -> 0x02a0 }
        L_0x02a0:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/readData failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02a6:
            java.util.Iterator r4 = X.C36371kC.A10(r2)
        L_0x02aa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03e1
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r4)
            java.lang.Object r3 = r0.getKey()
            java.util.Map r2 = r6.A00
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r5.containsKey(r3)
            if (r0 == 0) goto L_0x02d0
            java.lang.Object r0 = r5.get(r3)
        L_0x02c8:
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            r2.put(r3, r0)
            goto L_0x02aa
        L_0x02d0:
            r0 = 0
            goto L_0x02c8
        L_0x02d2:
            boolean r0 = r8 instanceof X.C180998ml
            if (r0 == 0) goto L_0x0351
            r2 = r8
            X.8ml r2 = (X.C180998ml) r2
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x03e1
            android.util.JsonReader r4 = X.C90484aE.A0Q(r9)     // Catch:{ IOException -> 0x034c }
            r4.beginObject()     // Catch:{ all -> 0x0342 }
        L_0x02e6:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0342 }
            if (r0 == 0) goto L_0x033b
            java.lang.String r3 = r4.nextName()     // Catch:{ all -> 0x0342 }
            int r1 = r3.hashCode()     // Catch:{ all -> 0x0342 }
            r0 = -1807872114(0xffffffff943e0f8e, float:-9.595616E-27)
            if (r1 == r0) goto L_0x030d
            r0 = 1970709011(0x7576a213, float:3.126446E32)
            if (r1 != r0) goto L_0x0329
            java.lang.String r0 = "isNewlyGeneratedKey"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0342 }
            if (r0 == 0) goto L_0x0329
            boolean r0 = r4.nextBoolean()     // Catch:{ all -> 0x0342 }
            r2.A01 = r0     // Catch:{ all -> 0x0342 }
            goto L_0x02e6
        L_0x030d:
            java.lang.String r0 = "appStateSyncKeyShareProtoString"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0342 }
            if (r0 == 0) goto L_0x0329
            java.lang.String r1 = r4.nextString()     // Catch:{ all -> 0x0342 }
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x0342 }
            X.8NW r0 = X.AnonymousClass8NW.DEFAULT_INSTANCE     // Catch:{ all -> 0x0342 }
            X.8Hz r0 = X.C170918Hz.A08(r0, r1)     // Catch:{ all -> 0x0342 }
            X.8NW r0 = (X.AnonymousClass8NW) r0     // Catch:{ all -> 0x0342 }
            r2.A00 = r0     // Catch:{ all -> 0x0342 }
            goto L_0x02e6
        L_0x0329:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0342 }
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x0342 }
            r1.append(r3)     // Catch:{ all -> 0x0342 }
            java.lang.String r0 = "\""
            X.C36341k9.A1O(r1, r0)     // Catch:{ all -> 0x0342 }
            goto L_0x02e6
        L_0x033b:
            r4.endObject()     // Catch:{ all -> 0x0342 }
            r4.close()     // Catch:{ IOException -> 0x034c }
            return
        L_0x0342:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0347 }
            goto L_0x034b
        L_0x0347:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x034c }
        L_0x034b:
            throw r1     // Catch:{ IOException -> 0x034c }
        L_0x034c:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/readData failed"
            goto L_0x03de
        L_0x0351:
            r0 = r8
            X.8mk r0 = (X.C180988mk) r0
            java.util.Set r2 = r0.A00
            r2.clear()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x03e1
            android.util.JsonReader r4 = X.C90484aE.A0Q(r9)     // Catch:{ IOException -> 0x03d7 }
            r4.beginObject()     // Catch:{ all -> 0x03cd }
        L_0x0366:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x03cd }
            if (r0 == 0) goto L_0x03c6
            java.lang.String r3 = r4.nextName()     // Catch:{ all -> 0x03cd }
            int r1 = r3.hashCode()     // Catch:{ all -> 0x03cd }
            r0 = -816618934(0xffffffffcf53624a, float:-3.54643405E9)
            if (r1 != r0) goto L_0x03b4
            java.lang.String r0 = "key-ids"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x03cd }
            if (r0 == 0) goto L_0x03b4
            r4.beginArray()     // Catch:{ all -> 0x03cd }
        L_0x0384:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x03cd }
            if (r0 == 0) goto L_0x03b0
            java.lang.String r1 = r4.nextString()     // Catch:{ all -> 0x03cd }
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x03cd }
            X.8Ng r0 = X.C172288Ng.DEFAULT_INSTANCE     // Catch:{ all -> 0x03cd }
            X.8Hz r1 = X.C170918Hz.A08(r0, r1)     // Catch:{ all -> 0x03cd }
            X.8Ng r1 = (X.C172288Ng) r1     // Catch:{ all -> 0x03cd }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x03cd }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0384
            X.AUx r0 = r1.keyId_     // Catch:{ all -> 0x03cd }
            byte[] r1 = r0.A06()     // Catch:{ all -> 0x03cd }
            X.9jo r0 = new X.9jo     // Catch:{ all -> 0x03cd }
            r0.<init>(r1)     // Catch:{ all -> 0x03cd }
            r2.add(r0)     // Catch:{ all -> 0x03cd }
            goto L_0x0384
        L_0x03b0:
            r4.endArray()     // Catch:{ all -> 0x03cd }
            goto L_0x0366
        L_0x03b4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x03cd }
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x03cd }
            r1.append(r3)     // Catch:{ all -> 0x03cd }
            java.lang.String r0 = "\""
            X.C36341k9.A1O(r1, r0)     // Catch:{ all -> 0x03cd }
            goto L_0x0366
        L_0x03c6:
            r4.endObject()     // Catch:{ all -> 0x03cd }
            r4.close()     // Catch:{ IOException -> 0x03d7 }
            return
        L_0x03cd:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x03d2 }
            goto L_0x03d6
        L_0x03d2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x03d7 }
        L_0x03d6:
            throw r1     // Catch:{ IOException -> 0x03d7 }
        L_0x03d7:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/readData failed"
            goto L_0x03de
        L_0x03db:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/readData failed"
        L_0x03de:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181018mn.A1Y(java.lang.String):void");
    }

    public static void A00(JsonWriter jsonWriter, C181008mm r2) {
        jsonWriter.beginObject();
        jsonWriter.name("requestStanzaId").value(r2.A00);
    }

    public C181018mn(C64933Qa r1, int i, long j) {
        super(r1, i, j);
    }
}
