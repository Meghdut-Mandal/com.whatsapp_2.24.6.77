package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.3MS  reason: invalid class name */
public abstract class AnonymousClass3MS {
    public static Drawable A00(Context context, C46972by r5) {
        String str = r5.A05;
        String A1b = r5.A1b();
        String upperCase = AnonymousClass1Ax.A02(str).toUpperCase(Locale.US);
        if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(A1b)) {
            upperCase = AnonymousClass6YY.A07(A1b).toUpperCase(Locale.US);
        }
        return A01(context, str, upperCase, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r2 = X.AnonymousClass1Ax.A02(r5).toUpperCase(java.util.Locale.US);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_ppt;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r7 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_ppt_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007c, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_doc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r7 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0081, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_doc_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008d, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_xls;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0090, code lost:
        if (r7 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_xls_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0099, code lost:
        return X.AnonymousClass00E.A00(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A01(android.content.Context r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            if (r5 != 0) goto L_0x0023
            r3 = 2131232961(0x7f0808c1, float:1.8082046E38)
            if (r7 == 0) goto L_0x000a
            r3 = 2131232962(0x7f0808c2, float:1.8082048E38)
        L_0x000a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x009a
            java.lang.String r2 = ""
        L_0x0012:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168613(0x7f070d65, float:1.7951533E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.1lb r0 = new X.1lb
            r0.<init>(r4, r2, r3, r1)
            return r0
        L_0x0023:
            int r0 = r5.hashCode()
            switch(r0) {
                case -1248334925: goto L_0x0043;
                case -1248332507: goto L_0x0054;
                case -1073633483: goto L_0x0057;
                case -1071817359: goto L_0x005a;
                case -1050893613: goto L_0x006b;
                case -1004732798: goto L_0x006e;
                case -366307023: goto L_0x0071;
                case 904647503: goto L_0x0074;
                case 1993842850: goto L_0x0085;
                default: goto L_0x002a;
            }
        L_0x002a:
            r3 = 2131232961(0x7f0808c1, float:1.8082046E38)
            if (r7 == 0) goto L_0x0032
            r3 = 2131232962(0x7f0808c2, float:1.8082048E38)
        L_0x0032:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x009a
        L_0x0038:
            java.lang.String r1 = X.AnonymousClass1Ax.A02(r5)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toUpperCase(r0)
            goto L_0x0012
        L_0x0043:
            java.lang.String r0 = "application/pdf"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r3 = 2131232957(0x7f0808bd, float:1.8082038E38)
            if (r7 == 0) goto L_0x0038
            r3 = 2131232958(0x7f0808be, float:1.808204E38)
            goto L_0x0038
        L_0x0054:
            java.lang.String r0 = "application/rtf"
            goto L_0x0076
        L_0x0057:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            goto L_0x005c
        L_0x005a:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
        L_0x005c:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232959(0x7f0808bf, float:1.8082042E38)
            if (r7 == 0) goto L_0x0095
            r0 = 2131232960(0x7f0808c0, float:1.8082044E38)
            goto L_0x0095
        L_0x006b:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            goto L_0x0076
        L_0x006e:
            java.lang.String r0 = "text/rtf"
            goto L_0x0076
        L_0x0071:
            java.lang.String r0 = "application/vnd.ms-excel"
            goto L_0x0087
        L_0x0074:
            java.lang.String r0 = "application/msword"
        L_0x0076:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232955(0x7f0808bb, float:1.8082034E38)
            if (r7 == 0) goto L_0x0095
            r0 = 2131232956(0x7f0808bc, float:1.8082036E38)
            goto L_0x0095
        L_0x0085:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        L_0x0087:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232963(0x7f0808c3, float:1.808205E38)
            if (r7 == 0) goto L_0x0095
            r0 = 2131232964(0x7f0808c4, float:1.8082052E38)
        L_0x0095:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r4, r0)
            return r0
        L_0x009a:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r6.toUpperCase(r0)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MS.A01(android.content.Context, java.lang.String, java.lang.String, boolean):android.graphics.drawable.Drawable");
    }
}
