package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1ec  reason: invalid class name and case insensitive filesystem */
public class C33041ec {
    public final C32691e2 A00;
    public final C20810yC A01;
    public final C29341Wg A02;

    public void A00(Context context, String str, Map map) {
        String str2;
        if (!str.equals("open-modal")) {
            if (!str.equals("open-link")) {
                StringBuilder sb = new StringBuilder();
                sb.append("UserNoticeLinkActionHandler/handleAction unknown action: ");
                sb.append(str);
                sb.append(" with params: ");
                sb.append(map);
                str2 = sb.toString();
            } else {
                String str3 = (String) map.get("link");
                if (str3 == null) {
                    str2 = "UserNoticeLinkActionHandler/handleOpenLink null url";
                } else {
                    this.A00.Bp7(context, Uri.parse(str3), (AnonymousClass3T1) null);
                    return;
                }
            }
            Log.e(str2);
            return;
        }
        A01(context, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r10, boolean r11) {
        /*
            r9 = this;
            X.1Wg r5 = r9.A02
            r8 = 0
            X.1Wi r4 = r5.A03
            X.3Su r7 = r4.A01()
            if (r7 == 0) goto L_0x0015
            r3 = 3
            if (r11 != 0) goto L_0x001b
            int r1 = r7.A00
            if (r1 == r3) goto L_0x001b
            r0 = 4
            if (r1 == r0) goto L_0x001b
        L_0x0015:
            java.lang.String r0 = "UserNoticeLinkActionHandler/handleOpenModal/no modal"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x001b:
            int r2 = r7.A01
            X.0yC r6 = r5.A01
            boolean r0 = X.AnonymousClass3RI.A00(r6, r2)
            if (r0 == 0) goto L_0x003a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeManager/getModal/green alert disabled, notice: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
        L_0x0036:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0015
        L_0x003a:
            X.1Wh r0 = r5.A02
            X.6Db r1 = r0.A06(r7)
            if (r1 == 0) goto L_0x0015
            r2 = 1
            if (r11 != 0) goto L_0x005a
            int r0 = r7.A00
            if (r0 == r3) goto L_0x005a
            X.5HO r3 = r1.A03
            if (r3 != 0) goto L_0x0068
            java.lang.String r0 = "UserNoticeManager/getModal/no content for stage 4"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0wN r1 = r5.A00
            java.lang.String r0 = "UserNoticeManager/getModal/blockingModal/noContent"
        L_0x0056:
            r1.A0E(r0, r8, r2)
            goto L_0x0015
        L_0x005a:
            X.5HO r3 = r1.A04
            if (r3 != 0) goto L_0x0073
            java.lang.String r0 = "UserNoticeManager/getModal/no content for stage 3"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0wN r1 = r5.A00
            java.lang.String r0 = "UserNoticeManager/getModal/modal/noContent"
            goto L_0x0056
        L_0x0068:
            X.6Pi r1 = r3.A00
            boolean r0 = X.C29341Wg.A06(r1, r5)
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "UserNoticeManager/getModal/blocking modal not shown as per timing"
            goto L_0x0036
        L_0x0073:
            if (r11 != 0) goto L_0x0096
            X.6Pi r1 = r3.A00
            boolean r0 = X.C29341Wg.A06(r1, r5)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "UserNoticeManager/getModal/modal not shown as per timing"
            goto L_0x0036
        L_0x0080:
            boolean r0 = X.AnonymousClass3RI.A01(r6, r7)
            X.C29341Wg.A02(r1, r5, r0)
            java.lang.String r0 = "UserNoticeManager/getModal/has blocking modal"
            goto L_0x0093
        L_0x008a:
            boolean r0 = X.AnonymousClass3RI.A01(r6, r7)
            X.C29341Wg.A02(r1, r5, r0)
            java.lang.String r0 = "UserNoticeManager/getModal/has modal"
        L_0x0093:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0096:
            X.3Su r0 = r4.A01()
            if (r0 == 0) goto L_0x00c5
            X.0yC r1 = r9.A01
            X.3Su r0 = r4.A01()
            boolean r0 = X.AnonymousClass3RI.A01(r1, r0)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "GreenAlert/launchModal"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 0
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "com.whatsapp.greenalert.GreenAlertActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "page"
            r2.putExtra(r0, r3)
            r10.startActivity(r2)
            return
        L_0x00c5:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = r3.A06
            java.lang.String r0 = "icon_light_url"
            r2.putString(r0, r1)
            java.lang.String r1 = r3.A05
            java.lang.String r0 = "icon_dark_url"
            r2.putString(r0, r1)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "icon_description"
            r2.putString(r0, r1)
            java.lang.String r1 = r3.A07
            java.lang.String r0 = "title"
            r2.putString(r0, r1)
            java.util.List r5 = r3.A08
            int r1 = r5.size()
            java.lang.String r0 = "bullets_size"
            r2.putInt(r0, r1)
            r4 = 0
        L_0x00f2:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x0143
            java.lang.Object r6 = r5.get(r4)
            X.6Bc r6 = (X.C128156Bc) r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "bullet_text_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r6.A02
            r2.putString(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "bullet_icon_light_url_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r6.A01
            r2.putString(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "bullet_icon_dark_url_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r6.A00
            r2.putString(r1, r0)
            int r4 = r4 + 1
            goto L_0x00f2
        L_0x0143:
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "agree_button_text"
            r2.putString(r0, r1)
            X.6Pi r6 = r3.A00
            X.68z r0 = r6.A02
            if (r0 == 0) goto L_0x0157
            long r0 = r0.A00
            java.lang.String r4 = "start_time_millis"
            r2.putLong(r4, r0)
        L_0x0157:
            X.6AX r5 = r6.A00
            if (r5 == 0) goto L_0x0169
            long r0 = r5.A00
            java.lang.String r4 = "duration_static"
            r2.putLong(r4, r0)
            long[] r1 = r5.A01
            java.lang.String r0 = "duration_repeat"
            r2.putLongArray(r0, r1)
        L_0x0169:
            X.68z r0 = r6.A01
            if (r0 == 0) goto L_0x0174
            long r0 = r0.A00
            java.lang.String r4 = "end_time_millis"
            r2.putLong(r4, r0)
        L_0x0174:
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "body"
            r2.putString(r0, r1)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "footer"
            r2.putString(r0, r1)
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "dismiss_button_text"
            r2.putString(r0, r1)
            X.5TI r0 = r3.A02
            if (r0 == 0) goto L_0x0194
            java.lang.String r1 = r0.id
            java.lang.String r0 = "icon_role"
            r2.putString(r0, r1)
        L_0x0194:
            X.5TJ r0 = r3.A03
            if (r0 == 0) goto L_0x019f
            java.lang.String r1 = r0.id
            java.lang.String r0 = "icon_style"
            r2.putString(r0, r1)
        L_0x019f:
            java.io.File r0 = r3.A01
            java.lang.String r1 = "light_icon_path"
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = r0.getAbsolutePath()
            r2.putString(r1, r0)
        L_0x01ac:
            java.io.File r0 = r3.A00
            java.lang.String r1 = "dark_icon_path"
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = r0.getAbsolutePath()
            r2.putString(r1, r0)
        L_0x01b9:
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r1 = new com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment
            r1.<init>()
            r1.A17(r2)
            java.lang.Class<X.14u> r0 = X.C225314u.class
            android.app.Activity r0 = X.C24801Dv.A01(r10, r0)
            X.14u r0 = (X.C225314u) r0
            r0.Btm(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33041ec.A01(android.content.Context, boolean):void");
    }

    public C33041ec(C32691e2 r1, C20810yC r2, C29341Wg r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
