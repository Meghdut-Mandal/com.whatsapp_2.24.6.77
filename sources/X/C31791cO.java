package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1cO  reason: invalid class name and case insensitive filesystem */
public class C31791cO {
    public C31801cP A00;
    public final int A01;

    public C31791cO(C31801cP r2) {
        this(r2, 0);
    }

    public static AnonymousClass9VS A00(C203399nx r3) {
        boolean z;
        String str = null;
        if (r3 != null) {
            C203399nx A0c = r3.A0c("after");
            if (A0c != null) {
                str = A0c.A0e();
            }
            z = !TextUtils.isEmpty(str);
        } else {
            z = false;
        }
        return new AnonymousClass9VS(z, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.9tx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.9tx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.9tx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.9tx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.9tx} */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C206589te A01(X.C203399nx r10) {
        /*
            r4 = 0
            if (r10 != 0) goto L_0x0004
            return r4
        L_0x0004:
            java.lang.String r0 = "country_code_origin"
            X.9nx r2 = r10.A0c(r0)
            java.lang.String r0 = "importer_name"
            X.9nx r1 = r10.A0c(r0)
            java.lang.String r0 = "importer_address"
            X.9nx r3 = r10.A0c(r0)
            if (r2 != 0) goto L_0x0081
            r2 = r4
        L_0x0019:
            if (r1 != 0) goto L_0x007c
            r1 = r4
        L_0x001c:
            if (r3 == 0) goto L_0x006c
            java.lang.String r0 = "street1"
            X.9nx r0 = r3.A0c(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r5 = r0.A0e()
        L_0x002a:
            java.lang.String r0 = "street2"
            X.9nx r0 = r3.A0c(r0)
            if (r0 == 0) goto L_0x0078
            java.lang.String r6 = r0.A0e()
        L_0x0036:
            java.lang.String r0 = "postal_code"
            X.9nx r0 = r3.A0c(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.String r7 = r0.A0e()
        L_0x0042:
            java.lang.String r0 = "city"
            X.9nx r0 = r3.A0c(r0)
            if (r0 == 0) goto L_0x0074
            java.lang.String r8 = r0.A0e()
        L_0x004e:
            java.lang.String r0 = "region"
            X.9nx r0 = r3.A0c(r0)
            if (r0 == 0) goto L_0x0072
            java.lang.String r9 = r0.A0e()
        L_0x005a:
            java.lang.String r0 = "country_code"
            X.9nx r0 = r3.A0c(r0)
            if (r0 == 0) goto L_0x0066
            java.lang.String r4 = r0.A0e()
        L_0x0066:
            r10 = r4
            X.9tx r4 = new X.9tx
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L_0x006c:
            X.9te r0 = new X.9te
            r0.<init>(r4, r2, r1)
            return r0
        L_0x0072:
            r9 = r4
            goto L_0x005a
        L_0x0074:
            r8 = r4
            goto L_0x004e
        L_0x0076:
            r7 = r4
            goto L_0x0042
        L_0x0078:
            r6 = r4
            goto L_0x0036
        L_0x007a:
            r5 = r4
            goto L_0x002a
        L_0x007c:
            java.lang.String r1 = r1.A0e()
            goto L_0x001c
        L_0x0081:
            java.lang.String r2 = r2.A0e()
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31791cO.A01(X.9nx):X.9te");
    }

    public C21112A8x A02(C203399nx r5) {
        String str;
        if (this.A01 != 1) {
            str = "product_catalog";
        } else {
            str = "product_list";
        }
        C203399nx A0c = r5.A0c(str);
        if (A0c == null) {
            return null;
        }
        List<C203399nx> A0j = A0c.A0j("product");
        ArrayList arrayList = new ArrayList();
        for (C203399nx A03 : A0j) {
            C207269up A032 = A03(A03);
            if (A032 != null) {
                arrayList.add(A032);
            }
        }
        return new C21112A8x(A00(A0c.A0c("paging")), arrayList);
    }

    /* JADX WARNING: type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b3, code lost:
        if (java.lang.Boolean.parseBoolean(r10.A0e()) == false) goto L_0x01b5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C207269up A03(X.C203399nx r35) {
        /*
            r34 = this;
            java.lang.String r0 = "id"
            r6 = r35
            X.9nx r18 = r6.A0c(r0)
            java.lang.String r0 = "name"
            X.9nx r17 = r6.A0c(r0)
            java.lang.String r0 = "description"
            X.9nx r11 = r6.A0c(r0)
            java.lang.String r0 = "url"
            X.9nx r16 = r6.A0c(r0)
            java.lang.String r10 = "price"
            X.9nx r9 = r6.A0c(r10)
            java.lang.String r0 = "currency"
            X.9nx r2 = r6.A0c(r0)
            java.lang.String r0 = "retailer_id"
            X.9nx r15 = r6.A0c(r0)
            java.lang.String r0 = "media"
            X.9nx r5 = r6.A0c(r0)
            java.lang.String r0 = "image_fetch_status"
            X.9nx r1 = r6.A0c(r0)
            java.lang.String r0 = "status_info"
            X.9nx r3 = r6.A0c(r0)
            java.lang.String r0 = "sale_price"
            X.9nx r7 = r6.A0c(r0)
            java.lang.String r0 = "belongs_to"
            X.9nx r14 = r6.A0c(r0)
            java.lang.String r0 = "compliance_info"
            X.9nx r13 = r6.A0c(r0)
            java.lang.String r0 = "max_available"
            X.9nx r12 = r6.A0c(r0)
            java.lang.String r0 = "variant_info"
            X.9nx r8 = r6.A0c(r0)
            if (r1 != 0) goto L_0x00a0
            java.lang.String r26 = ""
        L_0x0060:
            r4 = 0
            if (r18 != 0) goto L_0x009b
            r21 = r4
        L_0x0065:
            if (r17 != 0) goto L_0x0096
            r22 = r4
        L_0x0069:
            if (r11 != 0) goto L_0x0091
            r23 = r4
        L_0x006d:
            if (r2 == 0) goto L_0x008f
            java.lang.String r0 = r2.A0e()
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = r2.A0e()
            X.6Tk r2 = new X.6Tk
            r2.<init>(r0)
        L_0x0082:
            if (r9 == 0) goto L_0x008d
            java.lang.String r0 = r9.A0e()
        L_0x0088:
            if (r2 == 0) goto L_0x00b2
            if (r0 == 0) goto L_0x00b2
            goto L_0x00a5
        L_0x008d:
            r0 = r4
            goto L_0x0088
        L_0x008f:
            r2 = r4
            goto L_0x0082
        L_0x0091:
            java.lang.String r23 = r11.A0e()
            goto L_0x006d
        L_0x0096:
            java.lang.String r22 = r17.A0e()
            goto L_0x0069
        L_0x009b:
            java.lang.String r21 = r18.A0e()
            goto L_0x0065
        L_0x00a0:
            java.lang.String r26 = r1.A0e()
            goto L_0x0060
        L_0x00a5:
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00ae }
            java.math.BigDecimal r27 = X.C129676Ia.A00(r2, r0)     // Catch:{ Exception -> 0x00ae }
            goto L_0x00b4
        L_0x00ae:
            r2 = r4
            r27 = r4
            goto L_0x00b4
        L_0x00b2:
            r27 = r4
        L_0x00b4:
            r9 = 0
            if (r7 != 0) goto L_0x010e
            r7 = r4
        L_0x00b8:
            if (r15 != 0) goto L_0x0109
            r25 = r4
        L_0x00bc:
            if (r16 != 0) goto L_0x0104
            r24 = r4
        L_0x00c0:
            java.lang.String r0 = "is_hidden"
            java.lang.String r0 = r6.A0i(r0, r4)
            boolean r33 = java.lang.Boolean.parseBoolean(r0)
            java.lang.String r0 = "availability"
            java.lang.String r1 = r6.A0i(r0, r4)
            java.lang.String r0 = "out of stock"
            boolean r29 = r0.equalsIgnoreCase(r1)
            java.lang.String r0 = "compliance_category"
            java.lang.String r0 = r6.A0i(r0, r4)
            if (r21 == 0) goto L_0x0239
            if (r22 == 0) goto L_0x0239
            if (r5 == 0) goto L_0x0239
            java.lang.String r1 = "image"
            java.util.List r9 = r5.A0j(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = 0
        L_0x00ee:
            int r1 = r9.size()
            if (r4 >= r1) goto L_0x0161
            X.9nx r1 = r5.A0b(r4)
            X.9tv r1 = X.C31841cT.A00(r1)
            if (r1 == 0) goto L_0x0101
            r6.add(r1)
        L_0x0101:
            int r4 = r4 + 1
            goto L_0x00ee
        L_0x0104:
            java.lang.String r24 = r16.A0e()
            goto L_0x00c0
        L_0x0109:
            java.lang.String r25 = r15.A0e()
            goto L_0x00bc
        L_0x010e:
            X.9nx r1 = r7.A0c(r10)
            java.lang.String r0 = "start_date"
            X.9nx r11 = r7.A0c(r0)
            java.lang.String r0 = "end_date"
            X.9nx r10 = r7.A0c(r0)
            if (r1 == 0) goto L_0x012d
            java.lang.String r0 = r1.A0e()
        L_0x0124:
            if (r2 == 0) goto L_0x015e
            if (r0 == 0) goto L_0x015e
            long r0 = java.lang.Long.parseLong(r0)
            goto L_0x012f
        L_0x012d:
            r0 = r4
            goto L_0x0124
        L_0x012f:
            java.math.BigDecimal r1 = X.C129676Ia.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x015e }
            if (r11 == 0) goto L_0x014f
            if (r10 == 0) goto L_0x014f
            java.lang.String r7 = r11.A0e()
            java.lang.String r0 = r10.A0e()
            if (r7 == 0) goto L_0x014f
            if (r0 == 0) goto L_0x014f
            java.util.Date r7 = X.AnonymousClass9ZL.A00(r7)     // Catch:{ ParseException -> 0x014c }
            java.util.Date r9 = X.AnonymousClass9ZL.A00(r0)     // Catch:{ ParseException -> 0x0151 }
            goto L_0x0155
        L_0x014c:
            r0 = move-exception
            r7 = r4
            goto L_0x0152
        L_0x014f:
            r0 = r4
            goto L_0x0157
        L_0x0151:
            r0 = move-exception
        L_0x0152:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0155:
            r0 = r9
            r9 = r7
        L_0x0157:
            X.6bV r7 = new X.6bV
            r7.<init>(r2, r1, r9, r0)
            goto L_0x00b8
        L_0x015e:
            r7 = r4
            goto L_0x00b8
        L_0x0161:
            X.9te r4 = A01(r13)
            java.lang.String r1 = "COUNTRY_ORIGIN_EXEMPT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0175
            java.lang.String r1 = "N/A"
            r0 = 0
            X.9te r4 = new X.9te
            r4.<init>(r0, r1, r0)
        L_0x0175:
            if (r12 == 0) goto L_0x01fc
            java.lang.String r0 = r12.A0e()
            if (r0 == 0) goto L_0x01fc
            long r30 = java.lang.Long.parseLong(r0)
        L_0x0181:
            r5 = 0
            if (r3 == 0) goto L_0x020f
            java.lang.String r0 = "status"
            X.9nx r0 = r3.A0c(r0)
            java.lang.String r1 = "can_appeal"
            X.9nx r10 = r3.A0c(r1)
            java.lang.String r1 = "reject_reason"
            X.9nx r9 = r3.A0c(r1)
            java.lang.String r1 = "commerce_url"
            X.9nx r1 = r3.A0c(r1)
            if (r0 != 0) goto L_0x01f7
            r3 = r5
        L_0x019f:
            if (r9 != 0) goto L_0x01f2
            r16 = r5
        L_0x01a3:
            if (r1 != 0) goto L_0x01ed
            r17 = r5
        L_0x01a7:
            if (r10 == 0) goto L_0x01b5
            java.lang.String r1 = r10.A0e()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            r20 = 1
            if (r1 != 0) goto L_0x01b7
        L_0x01b5:
            r20 = 0
        L_0x01b7:
            int r19 = X.AnonymousClass962.A00(r3)
            if (r0 == 0) goto L_0x0207
            java.lang.String r1 = "reasons"
            X.9nx r0 = r0.A0c(r1)
            r10 = 0
            if (r0 == 0) goto L_0x0206
            java.lang.String r1 = "product"
            java.util.List r0 = r0.A0j(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r0.iterator()
        L_0x01d5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r0 = r9.next()
            X.9nx r0 = (X.C203399nx) r0
            java.lang.String r1 = "reason"
            java.lang.String r0 = r0.A0i(r1, r5)
            if (r0 == 0) goto L_0x01d5
            r3.add(r0)
            goto L_0x01d5
        L_0x01ed:
            java.lang.String r17 = r1.A0e()
            goto L_0x01a7
        L_0x01f2:
            java.lang.String r16 = r9.A0e()
            goto L_0x01a3
        L_0x01f7:
            java.lang.String r3 = r0.A0e()
            goto L_0x019f
        L_0x01fc:
            r30 = 99
            goto L_0x0181
        L_0x01ff:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0206
            r10 = r3
        L_0x0206:
            r5 = r10
        L_0x0207:
            X.9tw r15 = new X.9tw
            r18 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            r5 = r15
        L_0x020f:
            r0 = r34
            X.1cP r0 = r0.A00
            X.6bW r19 = r0.A00(r2, r8)
            r32 = 1
            X.9up r15 = new X.9up
            r18 = r7
            r20 = r2
            r28 = r6
            r16 = r4
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33)
            if (r14 == 0) goto L_0x0238
            java.lang.String r0 = r14.A0e()
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
            X.8VY r0 = new X.8VY
            r0.<init>(r15, r1)
            return r0
        L_0x0238:
            return r15
        L_0x0239:
            java.lang.String r0 = "Connection/Product/missing required fields."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31791cO.A03(X.9nx):X.9up");
    }

    public void A04(AnonymousClass1KK r4, UserJid userJid, C203399nx r6) {
        String str;
        String A0i;
        if (this.A01 != 1) {
            str = "product_catalog";
        } else {
            str = "product_list";
        }
        C203399nx A0c = r6.A0c(str);
        if (A0c != null && (A0i = A0c.A0i("cart_enabled", (String) null)) != null) {
            r4.A0H(userJid, Boolean.parseBoolean(A0i));
        }
    }

    public C31791cO(C31801cP r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }
}
