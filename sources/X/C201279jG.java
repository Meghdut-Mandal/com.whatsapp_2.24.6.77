package X;

/* renamed from: X.9jG  reason: invalid class name and case insensitive filesystem */
public abstract class C201279jG {
    public String A00;
    public boolean A01;

    public static final C206659tl A00(AnonymousClass8SV r6, String str) {
        Integer num;
        String str2;
        String str3;
        byte[] bArr;
        AnonymousClass8SF r0;
        C21674AUx aUx;
        if ((r6.bitField0_ & 1) == 0) {
            return null;
        }
        AnonymousClass8SN r4 = r6.header_;
        if (r4 == null) {
            r4 = AnonymousClass8SN.DEFAULT_INSTANCE;
        }
        int i = r4.mediaCase_;
        if (i == 0) {
            num = C023109s.A0V;
        } else if (i == 3) {
            num = C023109s.A00;
        } else if (i != 4) {
            switch (i) {
                case 6:
                    num = C023109s.A0C;
                    break;
                case 7:
                    num = C023109s.A0G;
                    break;
                case 8:
                    num = C023109s.A0R;
                    break;
                case 9:
                    num = C023109s.A0S;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = C023109s.A01;
        }
        if (!r4.hasMediaAttachment_ || num != C023109s.A0V) {
            if (num == C023109s.A0C) {
                str2 = r4.title_;
                str3 = r4.subtitle_;
                if (i == 6) {
                    aUx = (C21674AUx) r4.media_;
                } else {
                    aUx = C21674AUx.A00;
                }
            } else if (num != C023109s.A01 || ((r6.interactiveMessageCase_ != 6 || !C202419ln.A01(r6, "review_and_pay")) && !"catalog_message".equals(str))) {
                str2 = r4.title_;
                str3 = r4.subtitle_;
                bArr = null;
                return new C206659tl(str2, bArr, str3);
            } else {
                str2 = r4.title_;
                str3 = r4.subtitle_;
                if (r4.mediaCase_ == 4) {
                    r0 = (AnonymousClass8SF) r4.media_;
                } else {
                    r0 = AnonymousClass8SF.DEFAULT_INSTANCE;
                }
                aUx = r0.jpegThumbnail_;
            }
            bArr = aUx.A06();
            return new C206659tl(str2, bArr, str3);
        }
        throw C165617ti.A0S(C165597tg.A0d(), "media not set");
    }

    public static final String A01(AnonymousClass8SV r1) {
        if ((r1.bitField0_ & 4) == 0) {
            return null;
        }
        C172368No r0 = r1.footer_;
        if (r0 == null) {
            r0 = C172368No.DEFAULT_INSTANCE;
        }
        return r0.text_;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f8, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0307, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0308, code lost:
        r0.A00.A0E("JsonPayloadForNativeFlowMPMIsMalformed", X.AnonymousClass000.A0l(r3, "Malformed params_json payload detected. error: ", X.AnonymousClass000.A0u()), true);
        r1 = X.AnonymousClass000.A0u();
        r1.append("MPMNativeFlowContentFactory/parseE2EProductListInfo/invalid or missing fields in button_params_json=");
        X.C36351kA.A1Q(r10.buttonParamsJson_, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d0, code lost:
        if (r3.isEmpty() != false) goto L_0x01d2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0307 A[ExcHandler: JSONException (r3v10 'e' org.json.JSONException A[CUSTOM_DECLARE]), Splitter:B:99:0x01e7] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C207219uk A02(X.AnonymousClass8SV r32) {
        /*
            r31 = this;
            r0 = r31
            boolean r2 = r0 instanceof X.C181828o6
            r1 = r32
            if (r2 == 0) goto L_0x0068
            r3 = 0
            java.lang.String r2 = r0.A00
            X.9tl r6 = A00(r1, r2)
            java.lang.String r11 = r0.A03(r1, r3)
            int r2 = r1.interactiveMessageCase_
            r0 = 4
            if (r2 != r0) goto L_0x0065
            java.lang.Object r5 = r1.interactiveMessage_
            X.8Q2 r5 = (X.AnonymousClass8Q2) r5
        L_0x001c:
            if (r5 == 0) goto L_0x0063
            java.lang.String r4 = r5.id_
            int r1 = r5.surface_
            if (r1 == 0) goto L_0x0060
            r0 = 1
            if (r1 == r0) goto L_0x005d
            r0 = 2
            if (r1 == r0) goto L_0x005a
            r0 = 3
            if (r1 != r0) goto L_0x0060
            X.90r r0 = X.C1887790r.WA
        L_0x002f:
            int r3 = r0.ordinal()
            r2 = 3
            r1 = 2
            r0 = 1
            if (r3 == r0) goto L_0x0058
            if (r3 == r1) goto L_0x0056
            if (r3 == r2) goto L_0x003d
            r2 = 0
        L_0x003d:
            int r0 = r5.messageVersion_
            X.9tn r9 = new X.9tn
            r9.<init>(r4, r2, r0)
        L_0x0044:
            r16 = 4
            r4 = 0
            X.09w r15 = X.C023409w.A00
            X.9uk r3 = new X.9uk
            r7 = r4
            r8 = r4
            r10 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        L_0x0056:
            r2 = 2
            goto L_0x003d
        L_0x0058:
            r2 = 1
            goto L_0x003d
        L_0x005a:
            X.90r r0 = X.C1887790r.IG
            goto L_0x002f
        L_0x005d:
            X.90r r0 = X.C1887790r.FB
            goto L_0x002f
        L_0x0060:
            X.90r r0 = X.C1887790r.UNKNOWN_SURFACE
            goto L_0x002f
        L_0x0063:
            r9 = 0
            goto L_0x0044
        L_0x0065:
            X.8Q2 r5 = X.AnonymousClass8Q2.DEFAULT_INSTANCE
            goto L_0x001c
        L_0x0068:
            boolean r2 = r0 instanceof X.C181858o9
            if (r2 == 0) goto L_0x0147
            X.8o9 r0 = (X.C181858o9) r0
            java.lang.String r3 = r0.A00
            java.lang.String r2 = "catalog_message"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00ba
            r30 = 1
        L_0x007a:
            X.9tl r10 = A00(r1, r3)
            boolean r2 = r0.A00
            java.lang.String r15 = r0.A03(r1, r2)
            java.lang.String r16 = A01(r1)
            X.8SN r3 = r1.header_
            if (r3 != 0) goto L_0x008e
            X.8SN r3 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x008e:
            int r2 = r3.mediaCase_
            r0 = 9
            if (r2 != r0) goto L_0x00b7
            java.lang.Object r5 = r3.media_
            X.8RR r5 = (X.AnonymousClass8RR) r5
        L_0x0098:
            r14 = 0
            if (r5 == 0) goto L_0x011a
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r5.businessOwnerJid_
            com.whatsapp.jid.UserJid r18 = r2.A02(r0)
            r0 = 0
            if (r18 == 0) goto L_0x00e1
            X.8Rt r0 = r5.product_
            if (r0 != 0) goto L_0x00ac
            X.8Rt r0 = X.C173458Rt.DEFAULT_INSTANCE
        L_0x00ac:
            java.lang.String r4 = r0.currencyCode_
            if (r4 == 0) goto L_0x00dc
            int r2 = r4.length()
            if (r2 == 0) goto L_0x00dc
            goto L_0x00c5
        L_0x00b7:
            X.8RR r5 = X.AnonymousClass8RR.DEFAULT_INSTANCE
            goto L_0x0098
        L_0x00ba:
            java.lang.String r2 = "form_message"
            boolean r2 = r2.equals(r3)
            int r30 = X.C165587tf.A03(r2)
            goto L_0x007a
        L_0x00c5:
            X.6Tk r6 = new X.6Tk     // Catch:{ IllegalArgumentException -> 0x00e6 }
            r6.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x00e6 }
            long r2 = r0.priceAmount1000_     // Catch:{ IllegalArgumentException -> 0x00e6 }
            java.math.BigDecimal r27 = X.C129676Ia.A00(r6, r2)     // Catch:{ IllegalArgumentException -> 0x00e6 }
            X.6Tk r6 = new X.6Tk     // Catch:{ IllegalArgumentException -> 0x00e8 }
            r6.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x00e8 }
            long r2 = r0.salePriceAmount1000_     // Catch:{ IllegalArgumentException -> 0x00e8 }
            java.math.BigDecimal r28 = X.C129676Ia.A00(r6, r2)     // Catch:{ IllegalArgumentException -> 0x00e8 }
            goto L_0x00eb
        L_0x00dc:
            r27 = r14
            r28 = r14
            goto L_0x00eb
        L_0x00e1:
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x00e6:
            r27 = r14
        L_0x00e8:
            r4 = r14
            r28 = r14
        L_0x00eb:
            java.lang.String r9 = r0.productId_
            java.lang.String r8 = r0.title_
            java.lang.String r6 = r0.description_
            java.lang.String r3 = r0.retailerId_
            java.lang.String r2 = r0.url_
            int r7 = r0.productImageCount_
            java.lang.String r0 = r5.body_
            java.lang.String r5 = r5.footer_
            X.AnonymousClass00C.A0B(r9)
            X.AnonymousClass00C.A0B(r8)
            X.3XY r14 = new X.3XY
            r17 = r14
            r19 = r9
            r20 = r8
            r21 = r6
            r22 = r4
            r23 = r3
            r24 = r2
            r25 = r0
            r26 = r5
            r29 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x011a:
            X.8Q1 r0 = r1.A0u()
            java.util.ArrayList r28 = X.C202419ln.A00(r0)
            X.8Q1 r0 = r1.A0u()
            java.lang.String r0 = r0.messageParamsJson_
            r8 = 0
            X.9uX r11 = new X.9uX
            r29 = r8
            r25 = r11
            r26 = r8
            r27 = r0
            r25.<init>(r26, r27, r28, r29, r30)
            X.09w r19 = X.C023409w.A00
            r20 = 9
            X.9uk r7 = new X.9uk
            r12 = r8
            r13 = r8
            r17 = r8
            r18 = r8
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r7
        L_0x0147:
            boolean r2 = r0 instanceof X.C181878oB
            if (r2 == 0) goto L_0x01a8
            X.8oB r0 = (X.C181878oB) r0
            java.lang.String r3 = r0.A00
            java.lang.String r2 = "catalog_message"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0184
            r6 = 1
        L_0x0158:
            X.9tl r7 = A00(r1, r3)
            boolean r2 = r0.A00
            java.lang.String r9 = r0.A03(r1, r2)
            java.lang.String r10 = A01(r1)
            X.8Q1 r2 = r1.A0u()
            java.util.ArrayList r4 = X.C202419ln.A00(r2)
            X.8Q1 r2 = r1.A0u()
            java.lang.String r3 = r2.messageParamsJson_
            r2 = 2
            if (r2 != r6) goto L_0x0198
            X.9Qf r2 = r0.A01
            X.8Q1 r0 = r1.A0u()
            java.lang.String r0 = r0.messageParamsJson_
            X.AnonymousClass00C.A08(r0)
            r5 = 0
            goto L_0x018f
        L_0x0184:
            java.lang.String r2 = "form_message"
            boolean r2 = r2.equals(r3)
            int r6 = X.C165587tf.A03(r2)
            goto L_0x0158
        L_0x018f:
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0199 }
            X.0k2 r5 = r2.A00(r0, r5)     // Catch:{ JSONException -> 0x0199 }
            goto L_0x0199
        L_0x0198:
            r5 = 0
        L_0x0199:
            r2 = 0
            X.9uX r1 = new X.9uX
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r11 = ""
            X.9uk r6 = new X.9uk
            r8 = r1
            r6.<init>((X.C206659tl) r7, (X.C207089uX) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11)
            return r6
        L_0x01a8:
            boolean r2 = r0 instanceof X.C181848o8
            if (r2 == 0) goto L_0x0342
            X.8o8 r0 = (X.C181848o8) r0
            r5 = 0
            java.lang.String r2 = r0.A00
            X.9tl r6 = A00(r1, r2)
            java.lang.String r21 = r0.A03(r1, r5)
            if (r21 != 0) goto L_0x01bd
            java.lang.String r21 = ""
        L_0x01bd:
            java.lang.String r22 = A01(r1)
            X.8Q1 r1 = r1.A0u()
            X.B6c r3 = r1.buttons_
            r12 = 1
            r11 = 0
            if (r3 == 0) goto L_0x01d2
            boolean r2 = r3.isEmpty()
            r1 = 0
            if (r2 == 0) goto L_0x01d3
        L_0x01d2:
            r1 = 1
        L_0x01d3:
            r18 = 0
            if (r1 != 0) goto L_0x032a
            if (r6 == 0) goto L_0x01e4
            byte[] r7 = r6.A02
        L_0x01db:
            java.lang.Object r10 = r3.get(r5)
            X.8P5 r10 = (X.AnonymousClass8P5) r10
            java.lang.String r9 = ""
            goto L_0x01e7
        L_0x01e4:
            r7 = r18
            goto L_0x01db
        L_0x01e7:
            java.lang.String r1 = r10.buttonParamsJson_     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02f8 }
            org.json.JSONObject r4 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02f8 }
            java.lang.String r1 = "thumbnail_product_id"
            java.lang.String r3 = r4.optString(r1)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02f8 }
            java.lang.String r1 = "business_owner_jid"
            java.lang.String r17 = X.C36411kG.A10(r1, r4)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02f8 }
            int r1 = r17.length()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r1 != 0) goto L_0x0208
            X.0wN r8 = r0.A00     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            java.lang.String r2 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            java.lang.String r1 = "businessOwnerJID is empty when businessOwnerJID is a required field"
            r8.A0E(r2, r1, r12)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
        L_0x0208:
            X.AnonymousClass00C.A0B(r3)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            X.9tm r8 = new X.9tm     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            r8.<init>(r7, r3, r5)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            byte[] r1 = r8.A02     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r1 == 0) goto L_0x0217
            int r1 = r1.length     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r1 != 0) goto L_0x0220
        L_0x0217:
            X.0wN r3 = r0.A00     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            java.lang.String r2 = "NativeFlowMPMIsMissingThumbnailJpegData"
            java.lang.String r1 = "Error: thumbnail jpeg data is null or an empty byte array, so valid thumbnail jpeg is missing from payload"
            r3.A0E(r2, r1, r12)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
        L_0x0220:
            java.lang.String r1 = r8.A01     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            int r1 = r1.length()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r1 != 0) goto L_0x0231
            X.0wN r3 = r0.A00     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            java.lang.String r2 = "NativeFlowMPMIsMissingThumbnailProductId"
            java.lang.String r1 = "Error: thumbnail product id is empty string, so valid thumbnail product id is missing from payload"
            r3.A0E(r2, r1, r12)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
        L_0x0231:
            java.lang.String r1 = "sections"
            org.json.JSONArray r7 = r4.optJSONArray(r1)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r7 != 0) goto L_0x0296
            X.09w r4 = X.C023409w.A00     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
        L_0x023b:
            boolean r1 = r4.isEmpty()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r1 == 0) goto L_0x0257
            X.0wN r3 = r0.A00     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            java.lang.String r2 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            java.lang.String r1 = "Error: parsedProductListInfo is an empty list"
            r3.A0E(r2, r1, r12)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
        L_0x024a:
            X.13r r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            com.whatsapp.jid.UserJid r2 = X.C222813r.A01(r17)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            X.9u1 r1 = new X.9u1     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            r1.<init>(r2, r8, r4)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            goto L_0x0328
        L_0x0257:
            java.util.Iterator r5 = r4.iterator()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            r2 = 0
        L_0x025c:
            boolean r1 = r5.hasNext()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r1 == 0) goto L_0x027e
            int r3 = r2 + 1
            java.lang.Object r1 = r5.next()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            X.9td r1 = (X.C206579td) r1     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            java.util.List r1 = r1.A01     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            boolean r1 = r1.isEmpty()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r1 == 0) goto L_0x027c
            java.lang.StringBuilder r2 = X.C90464aC.A0h(r2, r9)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            java.lang.String r1 = ", "
            java.lang.String r9 = X.AnonymousClass000.A0q(r1, r2)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
        L_0x027c:
            r2 = r3
            goto L_0x025c
        L_0x027e:
            int r1 = r9.length()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r1 == 0) goto L_0x024a
            X.0wN r3 = r0.A00     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            java.lang.String r1 = "Error: parsedProductListInfo has empty product sections at indices: "
            java.lang.String r2 = X.AnonymousClass000.A0p(r1, r9, r2)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            java.lang.String r1 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            r3.A0E(r1, r2, r12)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            goto L_0x024a
        L_0x0296:
            X.0k2 r16 = new X.0k2     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            r16.<init>()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            int r15 = r7.length()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
        L_0x029f:
            if (r11 >= r15) goto L_0x02f2
            org.json.JSONObject r2 = r7.optJSONObject(r11)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r2 == 0) goto L_0x02ef
            java.lang.String r1 = "title"
            java.lang.String r14 = r2.optString(r1)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            java.lang.String r1 = "product_items"
            org.json.JSONArray r5 = r2.optJSONArray(r1)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r5 == 0) goto L_0x02ef
            X.0k2 r13 = new X.0k2     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            r13.<init>()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            int r4 = r5.length()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            r3 = 0
        L_0x02bf:
            if (r3 >= r4) goto L_0x02e1
            org.json.JSONObject r2 = r5.optJSONObject(r3)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r2 == 0) goto L_0x02de
            java.lang.String r1 = "product_retailer_id"
            java.lang.String r2 = r2.optString(r1)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            int r1 = r2.length()     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            if (r1 <= 0) goto L_0x02de
            X.9tW r1 = new X.9tW     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            r13.add(r1)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
        L_0x02de:
            int r3 = r3 + 1
            goto L_0x02bf
        L_0x02e1:
            X.0k2 r1 = X.AnonymousClass03S.A00(r13)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            X.9td r2 = new X.9td     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            r2.<init>(r14, r1)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            r1 = r16
            r1.add(r2)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
        L_0x02ef:
            int r11 = r11 + 1
            goto L_0x029f
        L_0x02f2:
            X.0k2 r4 = X.AnonymousClass03S.A00(r16)     // Catch:{ JSONException -> 0x0307, 0wR -> 0x02fa }
            goto L_0x023b
        L_0x02f8:
            r2 = move-exception
            goto L_0x02fd
        L_0x02fa:
            r2 = move-exception
            r9 = r17
        L_0x02fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MPMNativeFlowContentFactory/parseE2EProductListInfo/invalid JID="
            X.C90464aC.A1L(r0, r9, r1, r2)
            goto L_0x032a
        L_0x0307:
            r3 = move-exception
            X.0wN r2 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Malformed params_json payload detected. error: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r3, r0, r1)
            java.lang.String r0 = "JsonPayloadForNativeFlowMPMIsMalformed"
            r2.A0E(r0, r1, r12)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MPMNativeFlowContentFactory/parseE2EProductListInfo/invalid or missing fields in button_params_json="
            r1.append(r0)
            java.lang.String r0 = r10.buttonParamsJson_
            X.C36351kA.A1Q(r0, r1, r3)
            goto L_0x032a
        L_0x0328:
            r18 = r1
        L_0x032a:
            r14 = 0
            java.lang.String r23 = ""
            X.09w r25 = X.C023409w.A00
            r26 = 6
            X.9uk r13 = new X.9uk
            r17 = r14
            r19 = r14
            r20 = r14
            r24 = r14
            r15 = r14
            r16 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r13
        L_0x0342:
            boolean r2 = r0 instanceof X.C181838o7
            if (r2 == 0) goto L_0x039c
            X.8o7 r0 = (X.C181838o7) r0
            r3 = 0
            java.lang.String r2 = r0.A00
            X.9tl r5 = A00(r1, r2)
            java.lang.String r7 = r0.A03(r1, r3)
            java.lang.String r8 = A01(r1)
            X.8Q1 r2 = r1.A0u()
            X.B6c r2 = r2.buttons_
            java.lang.Object r2 = r2.get(r3)
            X.8P5 r2 = (X.AnonymousClass8P5) r2
            java.lang.String r4 = r2.buttonParamsJson_
            if (r5 == 0) goto L_0x038f
            byte[] r3 = r5.A02
        L_0x0369:
            X.16T r2 = r0.A00
            r0 = 1
            X.9ui r4 = X.C203219nY.A02(r2, r4, r3, r0)
            if (r4 == 0) goto L_0x0391
            X.9uP r0 = r4.A09
            java.lang.String r0 = r0.A01
            int r0 = X.C207199ui.A00(r0)
            if (r0 == 0) goto L_0x0391
            X.8Q1 r0 = r1.A0u()
            java.util.ArrayList r0 = X.C202419ln.A00(r0)
            X.9uX r6 = new X.9uX
            r6.<init>(r0)
            X.9uk r3 = new X.9uk
            r3.<init>((X.C207199ui) r4, (X.C206659tl) r5, (X.C207089uX) r6, (java.lang.String) r7, (java.lang.String) r8)
            return r3
        L_0x038f:
            r3 = 0
            goto L_0x0369
        L_0x0391:
            java.lang.Integer r1 = X.C165597tg.A0d()
            java.lang.String r0 = "Order status: unknown status"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x039c:
            X.8oA r0 = (X.C181868oA) r0
            r5 = 0
            r2 = 0
            X.9tl r7 = A00(r1, r2)
            java.lang.String r12 = r0.A03(r1, r5)
            java.lang.String r13 = A01(r1)
            int r3 = r1.interactiveMessageCase_
            r2 = 7
            if (r3 != r2) goto L_0x0422
            java.lang.Object r1 = r1.interactiveMessage_
            X.8P4 r1 = (X.AnonymousClass8P4) r1
        L_0x03b5:
            X.B6c r6 = r1.cards_
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.AnonymousClass00C.A0B(r6)
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0402
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0402
        L_0x03c8:
            java.util.Iterator r6 = r6.iterator()
        L_0x03cc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0425
            java.lang.Object r3 = r6.next()
            X.8SV r3 = (X.AnonymousClass8SV) r3
            X.AnonymousClass00C.A0B(r3)
            X.AnonymousClass00C.A0D(r3, r5)
            int r2 = r3.interactiveMessageCase_
            r1 = 6
            if (r2 != r1) goto L_0x03ff
            int r1 = r3.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x03ff
            X.8SN r1 = r3.header_
            if (r1 != 0) goto L_0x03ef
            X.8SN r1 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x03ef:
            int r2 = r1.mediaCase_
            r1 = 9
            if (r2 != r1) goto L_0x03ff
            X.8o9 r1 = r0.A01
        L_0x03f7:
            X.9uk r1 = r1.A02(r3)
            r4.add(r1)
            goto L_0x03cc
        L_0x03ff:
            X.8oB r1 = r0.A00
            goto L_0x03f7
        L_0x0402:
            java.util.Iterator r3 = r6.iterator()
        L_0x0406:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x03c8
            java.lang.Object r1 = r3.next()
            X.8SV r1 = (X.AnonymousClass8SV) r1
            int r2 = r1.interactiveMessageCase_
            r1 = 6
            if (r2 == r1) goto L_0x0406
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "Some of the cards of the carousel msg are not native flow message"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x0422:
            X.8P4 r1 = X.AnonymousClass8P4.DEFAULT_INSTANCE
            goto L_0x03b5
        L_0x0425:
            X.9tU r6 = new X.9tU
            r6.<init>(r4)
            r5 = 0
            X.09w r16 = X.C023409w.A00
            X.9uk r4 = new X.9uk
            r9 = r5
            r10 = r5
            r11 = r5
            r14 = r5
            r15 = r5
            r17 = 7
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201279jG.A02(X.8SV):X.9uk");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if ("form_message".equals(r1) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r2 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A03(X.AnonymousClass8SV r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r5.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x007d
            X.8Nn r0 = r5.body_
            if (r0 != 0) goto L_0x000c
            X.8Nn r0 = X.C172358Nn.DEFAULT_INSTANCE
        L_0x000c:
            java.lang.String r2 = r0.text_
            if (r2 != 0) goto L_0x007f
        L_0x0010:
            java.lang.Integer r1 = r5.A0v()
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 == r0) goto L_0x007f
            int r0 = r5.interactiveMessageCase_
            r1 = 6
            if (r0 != r1) goto L_0x0025
            java.lang.String r0 = "review_and_pay"
            boolean r0 = X.C202419ln.A01(r5, r0)
            if (r0 != 0) goto L_0x007f
        L_0x0025:
            int r0 = r5.interactiveMessageCase_
            if (r0 != r1) goto L_0x004d
            X.8Q1 r3 = r5.A0u()
            r1 = 1
            if (r3 == 0) goto L_0x007b
            X.B6c r0 = r3.buttons_
            int r0 = r0.size()
            if (r0 != r1) goto L_0x007b
            r1 = 0
            X.B6c r0 = r3.buttons_
            java.lang.Object r0 = r0.get(r1)
            X.8P5 r0 = (X.AnonymousClass8P5) r0
            if (r0 == 0) goto L_0x007b
            java.lang.String r1 = r0.name_
        L_0x0045:
            java.lang.String r0 = "form_message"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007f
        L_0x004d:
            java.lang.String r0 = "review_order"
            boolean r0 = X.C202419ln.A01(r5, r0)
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "payment_method"
            boolean r0 = X.C202419ln.A01(r5, r0)
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "payment_status"
            boolean r0 = X.C202419ln.A01(r5, r0)
            if (r0 != 0) goto L_0x007f
            int r1 = r5.interactiveMessageCase_
            r0 = 7
            if (r1 == r0) goto L_0x007f
            if (r6 != 0) goto L_0x007f
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x007f
            java.lang.Integer r1 = X.C165597tg.A0d()
            java.lang.String r0 = "missing body"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x007b:
            r1 = 0
            goto L_0x0045
        L_0x007d:
            r2 = 0
            goto L_0x0010
        L_0x007f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201279jG.A03(X.8SV, boolean):java.lang.String");
    }
}
