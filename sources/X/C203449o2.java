package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9o2  reason: invalid class name and case insensitive filesystem */
public abstract class C203449o2 {
    public static int A00(int i) {
        if (i == 1) {
            return R.drawable.av_visa;
        }
        if (i == 2) {
            return R.drawable.av_mc;
        }
        if (i == 3) {
            return R.drawable.av_amex;
        }
        if (i != 4) {
            return R.drawable.av_card;
        }
        return R.drawable.av_discover;
    }

    public static int A01(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((C207249un) list.get(i)).A01 == 2) {
                return i;
            }
        }
        return 0;
    }

    public static String A03(Context context, C207249un r3) {
        if (!TextUtils.isEmpty((CharSequence) null) || r3.A01 != 2) {
            return null;
        }
        return context.getString(R.string.f12nameremoved);
    }

    public static void A06(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("fetchIcon/costs ");
        sb.append(System.currentTimeMillis() - j);
        sb.append(" ms");
        C24611Dc.A01("PaymentMethodUtils", sb.toString());
    }

    public static void A07(C207249un r1, PaymentMethodRow paymentMethodRow) {
        int i;
        if (r1 instanceof C175798b4) {
            i = A00(((C175798b4) r1).A01);
        } else {
            Bitmap A0A = r1.A0A();
            if (A0A != null) {
                paymentMethodRow.A00.setImageBitmap(A0A);
                return;
            }
            i = R.drawable.av_bank;
        }
        paymentMethodRow.A00.setImageResource(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r6 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r6 != null) goto L_0x007a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087 A[SYNTHETIC, Splitter:B:35:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A09(X.C20050ww r10, java.lang.String r11) {
        /*
            java.lang.String r5 = "fetchIcon/Close InputStream: "
            java.lang.String r4 = "PaymentMethodUtils"
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r0 != 0) goto L_0x009c
            long r8 = java.lang.System.currentTimeMillis()
            r0 = 32768(0x8000, float:4.5918E-41)
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            java.net.URLConnection r2 = X.C90504aG.A0r(r11)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r0)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            r2.setConnectTimeout(r0)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            r0 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            X.5RE r6 = new X.5RE     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            r6.<init>(r10, r0, r3, r1)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            if (r2 != 0) goto L_0x0046
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            java.lang.String r0 = "fetchIcon/failed to decode image data/url="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r11, r1)     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            X.C165577te.A1M(r4, r0)     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            goto L_0x0051
        L_0x0046:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            r0 = 100
            r2.compress(r1, r0, r7)     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            byte[] r3 = r7.toByteArray()     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
        L_0x0051:
            A06(r8)
            goto L_0x007a
        L_0x0055:
            r1 = move-exception
            goto L_0x005b
        L_0x0057:
            r1 = move-exception
            goto L_0x006c
        L_0x0059:
            r1 = move-exception
            r6 = r3
        L_0x005b:
            java.lang.String r0 = "/fetchIcon/IOException: "
            java.lang.String r0 = X.C24611Dc.A01(r4, r0)     // Catch:{ all -> 0x007e }
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x007e }
            A06(r8)
            if (r6 == 0) goto L_0x009c
            goto L_0x007a
        L_0x006a:
            r1 = move-exception
            r6 = r3
        L_0x006c:
            java.lang.String r0 = "fetchIcon/Malformed URL: "
            java.lang.String r0 = X.C24611Dc.A01(r4, r0)     // Catch:{ all -> 0x007e }
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x007e }
            A06(r8)
            if (r6 == 0) goto L_0x009c
        L_0x007a:
            r6.close()     // Catch:{ IOException -> 0x0094 }
            return r3
        L_0x007e:
            r2 = move-exception
            r3 = r6
            goto L_0x0082
        L_0x0081:
            r2 = move-exception
        L_0x0082:
            A06(r8)
            if (r3 == 0) goto L_0x0093
            r3.close()     // Catch:{ IOException -> 0x008b }
            throw r2
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = X.C24611Dc.A01(r4, r5)
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0093:
            throw r2
        L_0x0094:
            r1 = move-exception
            java.lang.String r0 = X.C24611Dc.A01(r4, r5)
            com.whatsapp.util.Log.w(r0, r1)
        L_0x009c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203449o2.A09(X.0ww, java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.content.Context r7, X.C175798b4 r8) {
        /*
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
            java.lang.String r6 = r7.getString(r0)
            int r0 = r8.A01
            java.lang.String r4 = X.C175798b4.A03(r0)
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x0012
            r4 = r5
        L_0x0012:
            int r3 = r8.A00
            r2 = 1
            r1 = 2131892165(0x7f1217c5, float:1.941907E38)
            if (r3 == r2) goto L_0x0026
            r0 = 4
            r1 = 2131892164(0x7f1217c4, float:1.9419069E38)
            if (r3 == r0) goto L_0x0026
            r0 = 6
            if (r3 != r0) goto L_0x0066
            r1 = 2131892163(0x7f1217c3, float:1.9419067E38)
        L_0x0026:
            java.lang.String r0 = r7.getString(r1)
        L_0x002a:
            if (r0 == 0) goto L_0x0041
            r1 = 2131892165(0x7f1217c5, float:1.941907E38)
            if (r3 == r2) goto L_0x003d
            r0 = 4
            r1 = 2131892164(0x7f1217c4, float:1.9419069E38)
            if (r3 == r0) goto L_0x003d
            r0 = 6
            if (r3 != r0) goto L_0x0061
            r1 = 2131892163(0x7f1217c3, float:1.9419067E38)
        L_0x003d:
            java.lang.String r5 = r7.getString(r1)
        L_0x0041:
            X.6c7 r1 = r8.A09
            boolean r0 = X.C202349ld.A03(r1)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = X.C165607th.A0s(r1)
            java.lang.String r3 = A04(r0)
            r2 = 2131892254(0x7f12181e, float:1.9419251E38)
            java.lang.Object[] r1 = X.C36441kJ.A1Q()
            X.C36341k9.A1I(r4, r5, r1)
            r0 = 2
            java.lang.String r6 = X.C36391kE.A0v(r7, r3, r1, r0, r2)
        L_0x0060:
            return r6
        L_0x0061:
            java.lang.String r5 = X.C207249un.A07(r3)
            goto L_0x0041
        L_0x0066:
            java.lang.String r0 = X.C207249un.A07(r3)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203449o2.A02(android.content.Context, X.8b4):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(java.lang.String r4) {
        /*
            int r1 = r4.length()
            r0 = 4
            if (r1 <= r0) goto L_0x000c
            int r1 = r1 - r0
            java.lang.String r4 = r4.substring(r1)
        L_0x000c:
            r3 = 0
            int r2 = r4.length()
            r1 = r2
        L_0x0012:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0023
            char r0 = r4.charAt(r2)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0023
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0023:
            if (r3 == r1) goto L_0x002a
            int r1 = r1 - r3
            java.lang.String r4 = r4.substring(r1)
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203449o2.A04(java.lang.String):java.lang.String");
    }

    public static String A05(List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C207249un A0S = C165607th.A0S(it);
            if (A0S.A01 == 2) {
                C175898bF r0 = A0S.A08;
                if (r0 != null) {
                    return (String) C165577te.A0g(r0.A08());
                }
                C165577te.A1M("PaymentMethodUtils", "getDefaultAccountHolderName/null country data");
            }
        }
        return null;
    }

    public static boolean A08(C207249un r2) {
        int A09 = r2.A09();
        if (A09 == 4 || A09 == 1 || A09 == 6 || A09 == 8 || A09 == 7) {
            return true;
        }
        return false;
    }
}
