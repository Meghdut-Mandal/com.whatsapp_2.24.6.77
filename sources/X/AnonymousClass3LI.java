package X;

import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import java.util.Locale;

/* renamed from: X.3LI  reason: invalid class name */
public class AnonymousClass3LI {
    public long A00;
    public long A01;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public long A05;
    public long A06;
    public AnonymousClass37Q A07;
    public AnonymousClass37Q A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final C19970wo A0M;
    public final C21060yb A0N;
    public final C20830yE A0O;
    public final AnonymousClass1CR A0P;

    public long A01() {
        long j = this.A01;
        if (j == -1) {
            return j;
        }
        if (j > C19970wo.A00(this.A0M)) {
            return this.A01;
        }
        return 0;
    }

    public AnonymousClass3LI A02() {
        String str = this.A0F;
        if ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str) || "channel_notification".equals(str)) {
            return this;
        }
        if (GroupJid.Companion.A02(str) != null) {
            return this.A0P.A0Q();
        }
        C28981Uw A012 = C28981Uw.A03.A01(this.A0F);
        AnonymousClass1CR r0 = this.A0P;
        if (A012 == null) {
            return r0.A0R();
        }
        AnonymousClass3LI A013 = AnonymousClass1CR.A01(r0);
        if (A013.A0D == null) {
            A013.A0D = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A013.A0E)) {
            A013.A0E = "1";
        }
        if (TextUtils.isEmpty(A013.A0C)) {
            A013.A0C = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A013.A0B)) {
            A013.A0B = "FFFFFF";
        }
        A013.A03 = 1;
        return A013;
    }

    public String A03() {
        String str;
        if ((this.A0L && (str = this.A09) != null) || (str = A02().A09) != null) {
            if (AnonymousClass6YY.A0L(Uri.parse(str), this.A0N, this.A0O, false)) {
                return str;
            }
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI.toString();
    }

    public String A04() {
        if (!this.A0L || TextUtils.isEmpty(this.A0A)) {
            return A02().A0A;
        }
        return this.A0A;
    }

    public String A05() {
        if (!this.A0L || TextUtils.isEmpty(this.A0B)) {
            return A02().A0B;
        }
        return this.A0B;
    }

    public String A06() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Integer.toString(0);
        }
        if (!this.A0L || TextUtils.isEmpty(this.A0C)) {
            return A02().A0C;
        }
        return this.A0C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (X.AnonymousClass6YY.A0L(android.net.Uri.parse(r4), r5.A0N, r5.A0O, false) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A07() {
        /*
            r5 = this;
            boolean r0 = r5.A0L
            if (r0 == 0) goto L_0x0008
            java.lang.String r4 = r5.A0D
            if (r4 != 0) goto L_0x0010
        L_0x0008:
            X.3LI r0 = r5.A02()
            java.lang.String r4 = r0.A0D
            if (r4 == 0) goto L_0x0026
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 >= r0) goto L_0x0025
            X.0yb r3 = r5.A0N
            X.0yE r2 = r5.A0O
            android.net.Uri r1 = android.net.Uri.parse(r4)
            r0 = 0
            boolean r0 = X.AnonymousClass6YY.A0L(r1, r3, r2, r0)
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LI.A07():java.lang.String");
    }

    public String A08() {
        if (!this.A0L || TextUtils.isEmpty(this.A0E)) {
            return A02().A0E;
        }
        return this.A0E;
    }

    public boolean A09() {
        long j = this.A05;
        if (j != -1) {
            if (j > C19970wo.A00(this.A0M)) {
                j = this.A05;
            }
            return false;
        }
        if (j == 0) {
            return false;
        }
        return true;
    }

    public boolean A0B() {
        if (this.A0J || !A0A()) {
            return true;
        }
        return false;
    }

    public boolean A0C() {
        if (!this.A0L) {
            return A02().A0G;
        }
        return this.A0G;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[19];
        objArr[0] = AnonymousClass143.A04(this.A0F);
        C36421kH.A1P(objArr, this.A00);
        C36361kB.A1W(objArr, this.A01);
        objArr[3] = Boolean.valueOf(this.A0J);
        objArr[4] = Boolean.valueOf(this.A0L);
        objArr[5] = this.A0D;
        objArr[6] = this.A0E;
        objArr[7] = this.A0C;
        objArr[8] = this.A0B;
        objArr[9] = this.A09;
        objArr[10] = this.A0A;
        objArr[11] = Boolean.valueOf(this.A0K);
        objArr[12] = Boolean.valueOf(this.A0I);
        objArr[13] = Long.valueOf(this.A06);
        objArr[14] = Boolean.valueOf(this.A0G);
        objArr[15] = Integer.valueOf(this.A03);
        objArr[16] = Boolean.valueOf(this.A0H);
        objArr[17] = Integer.valueOf(this.A02);
        objArr[18] = Integer.valueOf(this.A04);
        return String.format(locale, "jid: %s deleted:%d muteEndTime:%d showNotificationWhenMuted:%b useCustomNotification:%b messageTone:%s messageVibrate:%s messagePopup:%s messageLight:%s callTone:%s callVibrate:%s statusMuted:%b pinned:%b pinned_time:%d lowPriorityNotifications:%b mediaVisibility:%d muteReactions:%b autoMutedStatus: %d pushRecordingButtonMode: %d", objArr);
    }

    public AnonymousClass3LI(C21060yb r2, C19970wo r3, C20830yE r4, AnonymousClass1CR r5) {
        this.A0M = r3;
        this.A0N = r2;
        this.A0P = r5;
        this.A0O = r4;
    }

    public long A00() {
        return A01();
    }

    public boolean A0A() {
        return AnonymousClass000.A1P((A00() > 0 ? 1 : (A00() == 0 ? 0 : -1)));
    }
}
