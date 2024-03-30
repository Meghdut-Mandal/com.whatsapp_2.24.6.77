package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6VE  reason: invalid class name */
public final class AnonymousClass6VE {
    public final C29311Wd A00;
    public final C109875Zl A01;

    public AnonymousClass6VE(C109875Zl r2, C29311Wd r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6B4 A03(com.whatsapp.jid.Jid r8, java.lang.String r9) {
        /*
            r7 = this;
            r6 = 0
            r5 = 1
            X.AnonymousClass00C.A0D(r9, r5)
            X.1Wd r0 = r7.A00
            X.54c r0 = r0.A00()
            X.1M0 r4 = r0.get()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_scaled_image_url, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date, product_max_available, product_variant_props, product_total_variant_quantity FROM cart_item WHERE business_id=? AND product_id=?"
            java.lang.String[] r1 = X.C36441kJ.A1S()     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0041 }
            r1[r6] = r0     // Catch:{ all -> 0x0041 }
            r1[r5] = r9     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "cart_item.SELECT_CART_ITEM"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r2 == 0) goto L_0x003d
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0032
            X.6B4 r1 = r7.A02(r2)     // Catch:{ all -> 0x0036 }
        L_0x0032:
            r2.close()     // Catch:{ all -> 0x0041 }
            goto L_0x003d
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x003d:
            r4.close()
            return r1
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VE.A03(com.whatsapp.jid.Jid, java.lang.String):X.6B4");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass6B4 r9, com.whatsapp.jid.Jid r10) {
        /*
            r8 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r9, r0)
            X.1Wd r0 = r8.A00
            X.54c r0 = r0.A00()
            X.1M0 r5 = r0.A04()
            X.71s r6 = r5.B1k()     // Catch:{ all -> 0x006c }
            X.9up r0 = r9.A02     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = r0.A0F     // Catch:{ all -> 0x0065 }
            X.14e r7 = r5.A02     // Catch:{ all -> 0x0065 }
            java.lang.String[] r2 = X.C36441kJ.A1S()     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0065 }
            r3 = 0
            X.C90494aF.A1H(r0, r1, r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "SELECT product_quantity FROM cart_item WHERE business_id=? AND product_id=?"
            java.lang.String r0 = "cart_item.SELECT_CART_ITEM_QUANTITY"
            android.database.Cursor r2 = r7.A09(r1, r0, r2)     // Catch:{ all -> 0x0065 }
            if (r2 == 0) goto L_0x0045
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "product_quantity"
            int r3 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x003e }
        L_0x003a:
            r2.close()     // Catch:{ all -> 0x0065 }
            goto L_0x0045
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0045:
            long r3 = (long) r3     // Catch:{ all -> 0x0065 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
            A00(r8, r9, r5, r10)     // Catch:{ all -> 0x0065 }
            goto L_0x005b
        L_0x0050:
            android.content.ContentValues r2 = r8.A01(r9, r10)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "cart_item"
            java.lang.String r0 = "cart_item.INSERT_CART_ITEM"
            r7.A04(r1, r0, r2)     // Catch:{ all -> 0x0065 }
        L_0x005b:
            r6.A00()     // Catch:{ all -> 0x0065 }
            r6.close()     // Catch:{ all -> 0x006c }
            r5.close()
            return
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VE.A05(X.6B4, com.whatsapp.jid.Jid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(com.whatsapp.jid.Jid r8, java.lang.String r9) {
        /*
            r7 = this;
            r6 = 0
            r5 = 1
            X.AnonymousClass00C.A0D(r9, r5)
            X.1Wd r0 = r7.A00
            X.54c r0 = r0.A00()
            X.1M0 r4 = r0.A04()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "DELETE FROM cart_item WHERE business_id=? AND product_id=?"
            java.lang.String[] r1 = X.C36441kJ.A1S()     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0028 }
            r1[r6] = r0     // Catch:{ all -> 0x0028 }
            r1[r5] = r9     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "cart_item.DELETE_CART_ITEM"
            r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x0028 }
            r4.close()
            return
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VE.A07(com.whatsapp.jid.Jid, java.lang.String):void");
    }

    public static final int A00(AnonymousClass6VE r5, AnonymousClass6B4 r6, C26911Lz r7, Jid jid) {
        C224114e r2 = ((AnonymousClass1M0) r7).A02;
        ContentValues A012 = r5.A01(r6, jid);
        String[] A1S = C36441kJ.A1S();
        A1S[0] = jid.getRawString();
        A1S[1] = r6.A02.A0F;
        return r2.A01(A012, "cart_item", "business_id=?  AND product_id=?", "cart_item.UPDATE_CART_ITEM", A1S);
    }

    private final ContentValues A01(AnonymousClass6B4 r10, Jid jid) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str;
        String str2;
        List<C134606bJ> list;
        BigDecimal multiply;
        C207269up r2 = r10.A02;
        BigDecimal bigDecimal = r2.A06;
        String str3 = null;
        if (bigDecimal == null || (multiply = bigDecimal.multiply(new BigDecimal(1000.0d))) == null) {
            l = null;
        } else {
            l = C90514aH.A0m(multiply);
        }
        C134726bV r6 = r2.A02;
        if (r6 != null) {
            l2 = C90514aH.A0m(r6.A00.multiply(new BigDecimal(1000.0d)));
            Date date = r6.A02;
            if (date != null) {
                l3 = Long.valueOf(date.getTime());
            } else {
                l3 = null;
            }
            Date date2 = r6.A01;
            if (date2 != null) {
                l4 = Long.valueOf(date2.getTime());
            } else {
                l4 = null;
            }
        } else {
            l2 = null;
            l3 = null;
            l4 = null;
        }
        C132386Tk r0 = r2.A04;
        if (r0 != null) {
            str3 = r0.A00;
        }
        ContentValues A0E = C36441kJ.A0E();
        A0E.put("business_id", jid.getRawString());
        A0E.put("product_id", r2.A0F);
        A0E.put("product_title", r2.A05);
        A0E.put("product_price_1000", l);
        A0E.put("product_currency_code", str3);
        List list2 = r2.A07;
        C206759tv r02 = (C206759tv) C007103b.A0P(list2, 0);
        if (r02 != null) {
            str = r02.A04;
        } else {
            str = "";
        }
        A0E.put("product_image_id", str);
        C206759tv r03 = (C206759tv) C007103b.A0P(list2, 0);
        if (r03 == null || (str2 = r03.A01) == null) {
            str2 = "";
        }
        A0E.put("product_scaled_image_url", str2);
        A0E.put("product_quantity", Long.valueOf(r10.A00));
        A0E.put("product_sale_price_1000", l2);
        A0E.put("product_sale_start_date", l3);
        A0E.put("product_sale_end_date", l4);
        A0E.put("product_max_available", Long.valueOf(r2.A09));
        String str4 = null;
        C134736bW r04 = r2.A0B;
        if (!(r04 == null || (list = r04.A02) == null)) {
            JSONArray A0u = C90524aI.A0u();
            for (C134606bJ r3 : list) {
                JSONObject A1B = C36441kJ.A1B();
                A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.A00);
                A1B.put("value", r3.A01);
                A0u.put(A1B);
            }
            str4 = A0u.toString();
        }
        A0E.put("product_variant_props", str4);
        A0E.put("product_total_variant_quantity", Long.valueOf(r10.A01));
        return A0E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        if (r0.length() == 0) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass6B4 A02(android.database.Cursor r36) {
        /*
            r35 = this;
            java.lang.String r1 = "product_id"
            r0 = r36
            java.lang.String r14 = X.C36341k9.A0f(r0, r1)
            java.lang.String r1 = "product_title"
            java.lang.String r15 = X.C36341k9.A0f(r0, r1)
            java.lang.String r1 = "product_price_1000"
            int r2 = r0.getColumnIndexOrThrow(r1)
            boolean r1 = r0.isNull(r2)
            r11 = 0
            if (r1 == 0) goto L_0x0108
            r7 = r11
        L_0x001c:
            java.lang.String r1 = "product_currency_code"
            java.lang.String r2 = X.C36341k9.A0f(r0, r1)
            java.lang.String r1 = "product_quantity"
            long r31 = X.C36351kA.A07(r0, r1)
            java.lang.String r1 = "product_total_variant_quantity"
            long r33 = X.C36351kA.A07(r0, r1)
            java.lang.String r1 = "product_image_id"
            java.lang.String r26 = X.C36341k9.A0f(r0, r1)
            java.lang.String r1 = "product_scaled_image_url"
            java.lang.String r28 = X.C36341k9.A0f(r0, r1)
            java.lang.String r1 = "product_sale_price_1000"
            int r3 = r0.getColumnIndexOrThrow(r1)
            boolean r1 = r0.isNull(r3)
            if (r1 == 0) goto L_0x0102
            r5 = r11
        L_0x0047:
            java.lang.String r1 = "product_sale_start_date"
            int r3 = r0.getColumnIndexOrThrow(r1)
            boolean r1 = r0.isNull(r3)
            if (r1 == 0) goto L_0x00fc
            r4 = r11
        L_0x0054:
            java.lang.String r1 = "product_sale_end_date"
            int r3 = r0.getColumnIndexOrThrow(r1)
            boolean r1 = r0.isNull(r3)
            if (r1 == 0) goto L_0x00f6
            r6 = r11
        L_0x0061:
            java.lang.String r1 = "product_max_available"
            int r3 = r0.getColumnIndexOrThrow(r1)
            boolean r1 = r0.isNull(r3)
            if (r1 == 0) goto L_0x00f0
            r23 = 99
        L_0x006f:
            if (r2 == 0) goto L_0x00ee
            int r1 = r2.length()
            if (r1 == 0) goto L_0x00ee
            X.6Tk r13 = new X.6Tk
            r13.<init>(r2)
        L_0x007c:
            if (r7 == 0) goto L_0x00eb
            if (r13 == 0) goto L_0x00eb
            long r1 = r7.longValue()
            java.math.BigDecimal r20 = X.C129676Ia.A00(r13, r1)
        L_0x0088:
            if (r5 == 0) goto L_0x00af
            if (r13 == 0) goto L_0x00af
            long r1 = r5.longValue()
            java.math.BigDecimal r5 = X.C129676Ia.A00(r13, r1)
            if (r4 == 0) goto L_0x00e4
            if (r6 == 0) goto L_0x00e4
            long r1 = r4.longValue()
            java.util.Date r4 = new java.util.Date
            r4.<init>(r1)
            long r2 = r6.longValue()
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            X.6bV r11 = new X.6bV
            r11.<init>(r13, r5, r4, r1)
        L_0x00af:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            if (r26 == 0) goto L_0x00cb
            int r1 = r26.length()
            if (r1 == 0) goto L_0x00cb
            r29 = 0
            java.lang.String r27 = ""
            X.9tv r1 = new X.9tv
            r30 = 0
            r25 = r1
            r25.<init>(r26, r27, r28, r29, r30)
            r7.add(r1)
        L_0x00cb:
            java.lang.String r1 = "product_variant_props"
            java.lang.String r0 = X.C36341k9.A0f(r0, r1)
            r3 = 0
            if (r0 == 0) goto L_0x00db
            int r2 = r0.length()
            r1 = 0
            if (r2 != 0) goto L_0x00dc
        L_0x00db:
            r1 = 1
        L_0x00dc:
            r9 = 0
            if (r1 != 0) goto L_0x013a
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            goto L_0x010e
        L_0x00e4:
            X.6bV r1 = new X.6bV
            r1.<init>(r13, r5, r11, r11)
            r11 = r1
            goto L_0x00af
        L_0x00eb:
            r20 = r11
            goto L_0x0088
        L_0x00ee:
            r13 = r11
            goto L_0x007c
        L_0x00f0:
            long r23 = r0.getLong(r3)
            goto L_0x006f
        L_0x00f6:
            java.lang.Long r6 = X.C36361kB.A0k(r0, r3)
            goto L_0x0061
        L_0x00fc:
            java.lang.Long r4 = X.C36361kB.A0k(r0, r3)
            goto L_0x0054
        L_0x0102:
            java.lang.Long r5 = X.C36361kB.A0k(r0, r3)
            goto L_0x0047
        L_0x0108:
            java.lang.Long r7 = X.C36361kB.A0k(r0, r2)
            goto L_0x001c
        L_0x010e:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x013a }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x013a }
            int r6 = r1.length()     // Catch:{ JSONException -> 0x013a }
        L_0x0117:
            if (r3 >= r6) goto L_0x013c
            org.json.JSONObject r0 = r1.getJSONObject(r3)     // Catch:{ JSONException -> 0x013a }
            java.lang.String r4 = "name"
            java.lang.String r5 = r0.getString(r4)     // Catch:{ JSONException -> 0x013a }
            java.lang.String r4 = "value"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x013a }
            X.AnonymousClass00C.A0B(r5)     // Catch:{ JSONException -> 0x013a }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ JSONException -> 0x013a }
            X.6bJ r0 = new X.6bJ     // Catch:{ JSONException -> 0x013a }
            r0.<init>(r5, r4)     // Catch:{ JSONException -> 0x013a }
            r2.add(r0)     // Catch:{ JSONException -> 0x013a }
            int r3 = r3 + 1
            goto L_0x0117
        L_0x013a:
            r12 = 0
            goto L_0x0147
        L_0x013c:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x013a
            X.6bW r12 = new X.6bW
            r12.<init>(r9, r9, r9, r2)
        L_0x0147:
            X.AnonymousClass00C.A0B(r14)
            X.AnonymousClass00C.A0B(r15)
            r22 = 0
            r25 = 1
            X.9up r8 = new X.9up
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r26 = 0
            r10 = r9
            r21 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26)
            X.6B4 r29 = new X.6B4
            r30 = r8
            r29.<init>(r30, r31, r33)
            return r29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VE.A02(android.database.Cursor):X.6B4");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass777 A04(com.whatsapp.jid.Jid r7) {
        /*
            r6 = this;
            X.777 r5 = new X.777
            r5.<init>()
            X.1Wd r0 = r6.A00     // Catch:{ Exception -> 0x004c }
            X.54c r0 = r0.A00()     // Catch:{ Exception -> 0x004c }
            X.1M0 r4 = r0.get()     // Catch:{ Exception -> 0x004c }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_scaled_image_url, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date, product_max_available, product_variant_props, product_total_variant_quantity FROM cart_item WHERE business_id=?"
            java.lang.String[] r1 = X.C90504aG.A1b(r7)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "cart_item.SELECT_CART_ITEMS"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0045 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x0027
        L_0x0023:
            r5.BVO(r1)     // Catch:{ all -> 0x003e }
            goto L_0x0035
        L_0x0027:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0023
            X.6B4 r0 = r6.A02(r2)     // Catch:{ all -> 0x003e }
            r1.add(r0)     // Catch:{ all -> 0x003e }
            goto L_0x0027
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ all -> 0x0045 }
        L_0x003a:
            r4.close()     // Catch:{ Exception -> 0x004c }
            return r5
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ Exception -> 0x004c }
            throw r0     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            r0 = move-exception
            r5.BVM(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VE.A04(com.whatsapp.jid.Jid):X.777");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(com.whatsapp.jid.Jid r6) {
        /*
            r5 = this;
            X.1Wd r0 = r5.A00
            X.54c r0 = r0.A00()
            X.1M0 r4 = r0.A04()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x001b }
            java.lang.String r2 = "DELETE FROM cart_item WHERE business_id=?"
            java.lang.String[] r1 = X.C90504aG.A1b(r6)     // Catch:{ all -> 0x001b }
            java.lang.String r0 = "cart_item.DELETE_CART"
            r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x001b }
            r4.close()
            return
        L_0x001b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VE.A06(com.whatsapp.jid.Jid):void");
    }
}
