package X;

/* renamed from: X.96X  reason: invalid class name */
public abstract class AnonymousClass96X {
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02a9 A[SYNTHETIC, Splitter:B:125:0x02a9] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0353 A[Catch:{ JSONException -> 0x040b }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0355 A[SYNTHETIC, Splitter:B:156:0x0355] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0392 A[Catch:{ JSONException -> 0x040b }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0408 A[Catch:{ JSONException -> 0x040b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject A00(X.C207219uk r14) {
        /*
            org.json.JSONObject r3 = X.C36441kJ.A1B()
            X.9tl r4 = r14.A03     // Catch:{ JSONException -> 0x040b }
            r2 = 0
            if (r4 != 0) goto L_0x000b
            r0 = r2
            goto L_0x000d
        L_0x000b:
            java.lang.String r0 = r4.A01     // Catch:{ JSONException -> 0x040b }
        L_0x000d:
            java.lang.String r9 = "title"
            r3.put(r9, r0)     // Catch:{ JSONException -> 0x040b }
            if (r4 != 0) goto L_0x0016
            r1 = r2
            goto L_0x0018
        L_0x0016:
            java.lang.String r1 = r4.A00     // Catch:{ JSONException -> 0x040b }
        L_0x0018:
            java.lang.String r0 = "sub_title"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            if (r4 == 0) goto L_0x0028
            byte[] r1 = r4.A02     // Catch:{ JSONException -> 0x040b }
            if (r1 == 0) goto L_0x0028
            r0 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x040b }
        L_0x0028:
            java.lang.String r0 = "header_thumbnail"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r8 = "description"
            java.lang.String r0 = r14.A09     // Catch:{ JSONException -> 0x040b }
            r3.put(r8, r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = "templateId"
            java.lang.String r0 = r14.A0B     // Catch:{ JSONException -> 0x040b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = "footerText"
            java.lang.String r0 = r14.A0A     // Catch:{ JSONException -> 0x040b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = "buttonText"
            java.lang.String r0 = r14.A08     // Catch:{ JSONException -> 0x040b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = "selectListType"
            int r0 = r14.A00     // Catch:{ JSONException -> 0x040b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r10 = "sections"
            org.json.JSONArray r7 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x040b }
            java.util.List r0 = r14.A0C     // Catch:{ JSONException -> 0x040b }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ JSONException -> 0x040b }
        L_0x005c:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r1 = r12.next()     // Catch:{ JSONException -> 0x040b }
            X.9to r1 = (X.C206689to) r1     // Catch:{ JSONException -> 0x040b }
            org.json.JSONObject r6 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = r1.A01     // Catch:{ JSONException -> 0x040b }
            r6.put(r9, r0)     // Catch:{ JSONException -> 0x040b }
            org.json.JSONArray r5 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x040b }
            java.util.List r0 = r1.A02     // Catch:{ JSONException -> 0x040b }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ JSONException -> 0x040b }
        L_0x007b:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r4 = r11.next()     // Catch:{ JSONException -> 0x040b }
            X.9ts r4 = (X.C206729ts) r4     // Catch:{ JSONException -> 0x040b }
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r4.A02     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = r4.A03     // Catch:{ JSONException -> 0x040b }
            r2.put(r9, r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = r4.A00     // Catch:{ JSONException -> 0x040b }
            r2.put(r8, r0)     // Catch:{ JSONException -> 0x040b }
            r5.put(r2)     // Catch:{ JSONException -> 0x040b }
            goto L_0x007b
        L_0x00a0:
            java.lang.String r0 = "items"
            r6.put(r0, r5)     // Catch:{ JSONException -> 0x040b }
            r7.put(r6)     // Catch:{ JSONException -> 0x040b }
            goto L_0x005c
        L_0x00a9:
            r3.put(r10, r7)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r5 = "product_info"
            X.9u1 r6 = r14.A05     // Catch:{ JSONException -> 0x040b }
            if (r6 != 0) goto L_0x00b5
            r4 = 0
            goto L_0x013c
        L_0x00b5:
            org.json.JSONObject r4 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x040b }
            org.json.JSONArray r10 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x040b }
            java.util.List r0 = r6.A02     // Catch:{ JSONException -> 0x040b }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ JSONException -> 0x040b }
        L_0x00c3:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x0108
            java.lang.Object r2 = r13.next()     // Catch:{ JSONException -> 0x040b }
            X.9td r2 = (X.C206579td) r2     // Catch:{ JSONException -> 0x040b }
            org.json.JSONObject r11 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r2.A00     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "product_sections_title"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            org.json.JSONArray r7 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x040b }
            java.util.List r0 = r2.A01     // Catch:{ JSONException -> 0x040b }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ JSONException -> 0x040b }
        L_0x00e4:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r12.next()     // Catch:{ JSONException -> 0x040b }
            X.9tW r0 = (X.C206509tW) r0     // Catch:{ JSONException -> 0x040b }
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r0.A00     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "product_id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            r7.put(r2)     // Catch:{ JSONException -> 0x040b }
            goto L_0x00e4
        L_0x00ff:
            java.lang.String r0 = "product_section_products"
            r11.put(r0, r7)     // Catch:{ JSONException -> 0x040b }
            r10.put(r11)     // Catch:{ JSONException -> 0x040b }
            goto L_0x00c3
        L_0x0108:
            java.lang.String r0 = "product_sections"
            r4.put(r0, r10)     // Catch:{ JSONException -> 0x040b }
            com.whatsapp.jid.UserJid r0 = r6.A00     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r0.getRawString()     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "business_owner_jid"
            org.json.JSONObject r2 = X.C90484aE.A0x(r1, r0, r4)     // Catch:{ JSONException -> 0x040b }
            X.9tm r6 = r6.A01     // Catch:{ JSONException -> 0x040b }
            byte[] r1 = r6.A02     // Catch:{ JSONException -> 0x040b }
            if (r1 == 0) goto L_0x0129
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "product_header_info_thumb"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x0129:
            java.lang.String r1 = r6.A01     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "product_header_info_id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            boolean r1 = r6.A00     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "product_header_is_rejected"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "product_header_info"
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x040b }
        L_0x013c:
            r3.put(r5, r4)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r5 = "checkout_info"
            X.9ui r6 = r14.A01     // Catch:{ JSONException -> 0x040b }
            r2 = 0
            if (r6 == 0) goto L_0x0274
            org.json.JSONObject r4 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x040b }
            byte[] r1 = r6.A0N     // Catch:{ JSONException -> 0x040b }
            if (r1 == 0) goto L_0x0158
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "thumb"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x0158:
            java.lang.String r0 = r6.A0G     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x015f
            r4.put(r9, r0)     // Catch:{ JSONException -> 0x040b }
        L_0x015f:
            X.9uM r0 = r6.A0B     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x016c
            org.json.JSONObject r1 = X.C202749ma.A04(r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "total_amount"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x016c:
            java.lang.String r1 = r6.A0F     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "reference_id"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r6.A0D     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "order_request_id"
            if (r1 == 0) goto L_0x017c
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x017c:
            X.16U r0 = r6.A08     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x0189
            X.16V r0 = (X.AnonymousClass16V) r0     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r0.A02     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "currency"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x0189:
            X.9u5 r0 = r6.A0A     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x019d
            org.json.JSONObject r7 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x040b }
            int r1 = r0.A00     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "max_installment_count"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "installment"
            r4.put(r0, r7)     // Catch:{ JSONException -> 0x040b }
        L_0x019d:
            java.lang.String r1 = r6.A05()     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "payment_configuration"
            if (r1 == 0) goto L_0x01a8
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x01a8:
            java.lang.String r1 = r6.A0E     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "payment_type"
            if (r1 == 0) goto L_0x01b1
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x01b1:
            java.lang.String r1 = r6.A06     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "transaction_id"
            if (r1 == 0) goto L_0x01ba
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x01ba:
            int r0 = r6.A00     // Catch:{ JSONException -> 0x040b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "transaction_status"
            if (r1 == 0) goto L_0x01c7
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x01c7:
            java.lang.String r1 = r6.A04     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "payment_method"
            if (r1 == 0) goto L_0x01d0
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x01d0:
            java.lang.String r1 = r6.A05     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "payment_status"
            if (r1 == 0) goto L_0x01d9
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x01d9:
            long r0 = r6.A01     // Catch:{ JSONException -> 0x040b }
            r10 = 0
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x01e6
            java.lang.String r7 = "payment_timestamp"
            r4.put(r7, r0)     // Catch:{ JSONException -> 0x040b }
        L_0x01e6:
            java.lang.String r1 = r6.A0H     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "type"
            if (r1 == 0) goto L_0x01ef
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x01ef:
            java.util.List r0 = r6.A0J     // Catch:{ JSONException -> 0x040b }
            org.json.JSONArray r1 = X.C202749ma.A00(r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "external_payment_configurations"
            if (r1 == 0) goto L_0x01fc
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x01fc:
            java.util.List r0 = r6.A0I     // Catch:{ JSONException -> 0x040b }
            org.json.JSONArray r1 = X.C202749ma.A02(r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "beneficiaries"
            if (r1 == 0) goto L_0x0209
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x0209:
            X.9uP r0 = r6.A09     // Catch:{ JSONException -> 0x040b }
            org.json.JSONObject r1 = X.C202749ma.A03(r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "order"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            boolean r1 = r6.A0M     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "is_interactive"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            boolean r1 = r6.A07     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "maybe_paid_externally"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.util.List r0 = r6.A0L     // Catch:{ JSONException -> 0x040b }
            org.json.JSONArray r1 = X.C202749ma.A01(r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "payment_settings"
            if (r1 == 0) goto L_0x022f
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x022f:
            java.lang.String r1 = r6.A0C     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "additional_note"
            if (r1 == 0) goto L_0x0238
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x0238:
            X.9ua r0 = r6.A02     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x0240
            org.json.JSONObject r2 = r0.A02()     // Catch:{ JSONException -> 0x040b }
        L_0x0240:
            java.lang.String r0 = "paid_amount"
            if (r2 == 0) goto L_0x0247
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x040b }
        L_0x0247:
            java.util.List r0 = r6.A0K     // Catch:{ JSONException -> 0x040b }
            if (r0 != 0) goto L_0x024d
            r2 = 0
            goto L_0x0263
        L_0x024d:
            org.json.JSONArray r2 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x040b }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x040b }
        L_0x0255:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x0263
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x040b }
            r2.put(r0)     // Catch:{ JSONException -> 0x040b }
            goto L_0x0255
        L_0x0263:
            java.lang.String r0 = "native_payment_methods"
            if (r2 == 0) goto L_0x026a
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x040b }
        L_0x026a:
            java.lang.String r1 = r6.A03     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "logging_id"
            if (r1 == 0) goto L_0x0273
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x0273:
            r2 = r4
        L_0x0274:
            r3.put(r5, r2)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r5 = "shops_info"
            X.9tn r4 = r14.A06     // Catch:{ JSONException -> 0x040b }
            r6 = 0
            if (r4 == 0) goto L_0x029e
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0298 }
            java.lang.String r1 = "id"
            java.lang.String r0 = r4.A02     // Catch:{ JSONException -> 0x0298 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0298 }
            java.lang.String r1 = "shop_surface"
            int r0 = r4.A00     // Catch:{ JSONException -> 0x0298 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0298 }
            java.lang.String r1 = "message_version"
            int r0 = r4.A01     // Catch:{ JSONException -> 0x0298 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0298 }
            goto L_0x029f
        L_0x0298:
            r1 = move-exception
            java.lang.String r0 = "ShopInfoContentConverter/toJsonObject error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x029e:
            r2 = r6
        L_0x029f:
            r3.put(r5, r2)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r5 = "native_flow_content"
            X.9uX r2 = r14.A04     // Catch:{ JSONException -> 0x040b }
            r7 = 0
            if (r2 == 0) goto L_0x034a
            org.json.JSONObject r6 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0345 }
            org.json.JSONArray r10 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x0345 }
            java.lang.String r1 = "content_of_nfm"
            int r0 = r2.A01     // Catch:{ JSONException -> 0x0345 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0345 }
            java.lang.String r1 = "message_params_json"
            java.lang.String r0 = r2.A02     // Catch:{ JSONException -> 0x0345 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0345 }
            java.util.List r0 = r2.A03     // Catch:{ JSONException -> 0x0345 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ JSONException -> 0x0345 }
        L_0x02c5:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x0345 }
            if (r0 == 0) goto L_0x02f0
            java.lang.Object r12 = r13.next()     // Catch:{ JSONException -> 0x0345 }
            X.9tc r12 = (X.C206569tc) r12     // Catch:{ JSONException -> 0x0345 }
            org.json.JSONObject r11 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0345 }
            java.lang.String r1 = "name"
            X.9uL r4 = r12.A01     // Catch:{ JSONException -> 0x0345 }
            java.lang.String r0 = r4.A00     // Catch:{ JSONException -> 0x0345 }
            r11.put(r1, r0)     // Catch:{ JSONException -> 0x0345 }
            java.lang.String r1 = "params"
            java.lang.String r0 = r4.A01     // Catch:{ JSONException -> 0x0345 }
            r11.put(r1, r0)     // Catch:{ JSONException -> 0x0345 }
            java.lang.String r1 = "selected"
            boolean r0 = r12.A00     // Catch:{ JSONException -> 0x0345 }
            r11.put(r1, r0)     // Catch:{ JSONException -> 0x0345 }
            r10.put(r11)     // Catch:{ JSONException -> 0x0345 }
            goto L_0x02c5
        L_0x02f0:
            java.lang.String r0 = "buttons"
            r6.put(r0, r10)     // Catch:{ JSONException -> 0x0345 }
            java.lang.String r4 = "form_state"
            java.util.List r11 = r2.A04     // Catch:{ JSONException -> 0x0345 }
            X.9tV r0 = r2.A00     // Catch:{ JSONException -> 0x0345 }
            if (r0 != 0) goto L_0x02ff
            r2 = r7
            goto L_0x0341
        L_0x02ff:
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0345 }
            java.lang.String r1 = "is_form_disabled"
            boolean r0 = r0.A00     // Catch:{ JSONException -> 0x033b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x033b }
            if (r11 == 0) goto L_0x0341
            java.util.HashMap r10 = X.AnonymousClass001.A0J()     // Catch:{ JSONException -> 0x033b }
            java.util.Iterator r12 = r11.iterator()     // Catch:{ JSONException -> 0x033b }
        L_0x0314:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x033b }
            if (r0 == 0) goto L_0x0330
            java.lang.Object r11 = r12.next()     // Catch:{ JSONException -> 0x033b }
            X.9sw r11 = (X.C206239sw) r11     // Catch:{ JSONException -> 0x033b }
            boolean r0 = r11 instanceof X.C181968oK     // Catch:{ JSONException -> 0x033b }
            if (r0 == 0) goto L_0x0314
            X.8oK r11 = (X.C181968oK) r11     // Catch:{ JSONException -> 0x033b }
            java.lang.String r1 = r11.A01     // Catch:{ JSONException -> 0x033b }
            X.9sy r0 = r11.A00     // Catch:{ JSONException -> 0x033b }
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x033b }
            r10.put(r1, r0)     // Catch:{ JSONException -> 0x033b }
            goto L_0x0314
        L_0x0330:
            java.lang.String r1 = "form_elements_values"
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x033b }
            r0.<init>(r10)     // Catch:{ JSONException -> 0x033b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x033b }
            goto L_0x0341
        L_0x033b:
            r1 = move-exception
            java.lang.String r0 = "NativeFlowMessageConverter/toJSONObject/error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x0345 }
        L_0x0341:
            r6.put(r4, r2)     // Catch:{ JSONException -> 0x0345 }
            goto L_0x034a
        L_0x0345:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x040b }
            r6 = r7
        L_0x034a:
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r5 = "carousel_content"
            X.9tU r0 = r14.A02     // Catch:{ JSONException -> 0x040b }
            if (r0 != 0) goto L_0x0355
            r4 = r7
            goto L_0x0384
        L_0x0355:
            org.json.JSONObject r4 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x037d }
            org.json.JSONArray r2 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x037d }
            java.util.List r0 = r0.A00     // Catch:{ JSONException -> 0x037d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x037d }
        L_0x0363:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x037d }
            if (r0 == 0) goto L_0x0377
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x037d }
            X.9uk r0 = (X.C207219uk) r0     // Catch:{ JSONException -> 0x037d }
            org.json.JSONObject r0 = A00(r0)     // Catch:{ JSONException -> 0x037d }
            r2.put(r0)     // Catch:{ JSONException -> 0x037d }
            goto L_0x0363
        L_0x0377:
            java.lang.String r0 = "cards"
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x037d }
            goto L_0x0384
        L_0x037d:
            r1 = move-exception
            java.lang.String r0 = "CarouselMessageConverter/toJSONObject/serialization error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x040b }
            r4 = r7
        L_0x0384:
            r3.put(r5, r4)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r2 = "single_product_info"
            X.3XY r5 = r14.A07     // Catch:{ JSONException -> 0x040b }
            r6 = 0
            if (r5 == 0) goto L_0x0408
            com.whatsapp.jid.UserJid r0 = r5.A01     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x0408
            org.json.JSONObject r4 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r0.getRawString()     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "business_owner_jid"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r5.A06     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "product_id"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = r5.A09     // Catch:{ JSONException -> 0x040b }
            r4.put(r9, r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = r5.A04     // Catch:{ JSONException -> 0x040b }
            r4.put(r8, r0)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r5.A03     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "currency_code"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.math.BigDecimal r1 = r5.A0A     // Catch:{ JSONException -> 0x040b }
            if (r1 == 0) goto L_0x03c7
            java.math.BigDecimal r0 = X.C129676Ia.A00     // Catch:{ JSONException -> 0x040b }
            java.math.BigDecimal r0 = r1.multiply(r0)     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x03c7
            java.lang.Long r7 = X.C90514aH.A0m(r0)     // Catch:{ JSONException -> 0x040b }
        L_0x03c7:
            java.lang.String r0 = "price_amount"
            r4.put(r0, r7)     // Catch:{ JSONException -> 0x040b }
            java.math.BigDecimal r1 = r5.A0B     // Catch:{ JSONException -> 0x040b }
            if (r1 == 0) goto L_0x03dc
            java.math.BigDecimal r0 = X.C129676Ia.A00     // Catch:{ JSONException -> 0x040b }
            java.math.BigDecimal r0 = r1.multiply(r0)     // Catch:{ JSONException -> 0x040b }
            if (r0 == 0) goto L_0x03dc
            java.lang.Long r6 = X.C90514aH.A0m(r0)     // Catch:{ JSONException -> 0x040b }
        L_0x03dc:
            java.lang.String r0 = "sale_price_amount"
            r4.put(r0, r6)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r5.A08     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "retailer_id"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r5.A07     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "product_url"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            int r1 = r5.A00     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "product_image_count"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r5.A02     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "body"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
            java.lang.String r1 = r5.A05     // Catch:{ JSONException -> 0x040b }
            java.lang.String r0 = "footer"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x040b }
        L_0x0404:
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x040b }
            goto L_0x040a
        L_0x0408:
            r4 = r7
            goto L_0x0404
        L_0x040a:
            return r3
        L_0x040b:
            r1 = move-exception
            java.lang.String r0 = "InteractiveMessageConverter/toJSONObject/serialization error"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96X.A00(X.9uk):org.json.JSONObject");
    }
}
