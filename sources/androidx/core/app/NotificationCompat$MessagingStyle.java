package androidx.core.app;

import X.AnonymousClass001;
import X.AnonymousClass046;
import X.AnonymousClass048;
import X.AnonymousClass0UW;
import X.AnonymousClass0YE;
import X.C07210Wt;
import android.app.Notification;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.List;

public class NotificationCompat$MessagingStyle extends AnonymousClass0YE {
    public Boolean A00;
    public CharSequence A01;
    public AnonymousClass0UW A02;
    public final List A03 = AnonymousClass001.A0I();
    public final List A04 = AnonymousClass001.A0I();

    public static Notification.BigTextStyle A00(Notification.BigTextStyle bigTextStyle) {
        return bigTextStyle.setBigContentTitle((CharSequence) null);
    }

    public String A09() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public static Notification.BigTextStyle A01(Notification.Builder builder) {
        return new Notification.BigTextStyle(builder);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        if (r3 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C15690np r9) {
        /*
            r8 = this;
            X.0Yy r0 = r8.A00
            r2 = 0
            if (r0 == 0) goto L_0x0055
            android.content.Context r0 = r0.A0F
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 28
            if (r1 >= r0) goto L_0x0055
            java.lang.Boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0055
            java.lang.CharSequence r0 = r8.A01
            if (r0 == 0) goto L_0x001a
            r2 = 1
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r8.A00 = r0
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r4 < r0) goto L_0x00a0
            r3 = 28
            X.0UW r0 = r8.A02
            if (r4 < r3) goto L_0x004e
            android.app.Person r0 = r0.A00()
            android.app.Notification$MessagingStyle r2 = X.AnonymousClass0VC.A00(r0)
        L_0x0034:
            java.util.List r0 = r8.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            X.0Wt r0 = (X.C07210Wt) r0
            android.app.Notification$MessagingStyle$Message r0 = r0.A01()
            X.AnonymousClass0XT.A01(r0, r2)
            goto L_0x003a
        L_0x004e:
            java.lang.CharSequence r0 = r0.A01
            android.app.Notification$MessagingStyle r2 = X.AnonymousClass0XT.A00(r0)
            goto L_0x0034
        L_0x0055:
            java.lang.Boolean r0 = r8.A00
            if (r0 == 0) goto L_0x001a
            boolean r2 = r0.booleanValue()
            goto L_0x001a
        L_0x005e:
            r0 = 26
            if (r4 < r0) goto L_0x007c
            java.util.List r0 = r8.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0068:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r1.next()
            X.0Wt r0 = (X.C07210Wt) r0
            android.app.Notification$MessagingStyle$Message r0 = r0.A01()
            X.AnonymousClass0PT.A00(r0, r2)
            goto L_0x0068
        L_0x007c:
            java.lang.Boolean r0 = r8.A00
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0086
            if (r4 < r3) goto L_0x0096
        L_0x0086:
            java.lang.CharSequence r0 = r8.A01
            X.AnonymousClass0XT.A02(r2, r0)
            if (r4 < r3) goto L_0x0096
            java.lang.Boolean r0 = r8.A00
            boolean r0 = r0.booleanValue()
            X.AnonymousClass0VC.A01(r2, r0)
        L_0x0096:
            android.app.Notification$Style r2 = (android.app.Notification.Style) r2
            X.0cb r9 = (X.C09580cb) r9
            android.app.Notification$Builder r0 = r9.A02
            A04(r0, r2)
            return
        L_0x00a0:
            java.util.List r4 = r8.A03
            int r1 = r4.size()
        L_0x00a6:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0148
            java.lang.Object r3 = r4.get(r1)
            X.0Wt r3 = (X.C07210Wt) r3
            X.0UW r0 = r3.A04
            if (r0 == 0) goto L_0x00a6
            X.0UW r0 = r3.A04
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a6
        L_0x00be:
            java.lang.CharSequence r2 = r8.A01
            if (r2 == 0) goto L_0x0132
            java.lang.Boolean r0 = r8.A00
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0132
            r0 = r9
            X.0cb r0 = (X.C09580cb) r0
            android.app.Notification$Builder r1 = r0.A02
            r1.setContentTitle(r2)
            if (r3 == 0) goto L_0x00df
        L_0x00d4:
            java.lang.CharSequence r0 = r8.A01
            if (r0 == 0) goto L_0x012f
            android.text.SpannableStringBuilder r0 = r8.A02(r3)
        L_0x00dc:
            r1.setContentText(r0)
        L_0x00df:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            java.lang.CharSequence r0 = r8.A01
            r6 = 0
            r7 = 1
            if (r0 != 0) goto L_0x0101
            int r2 = r4.size()
            int r2 = r2 - r7
        L_0x00ef:
            if (r2 < 0) goto L_0x012d
            java.lang.Object r1 = r4.get(r2)
            X.0Wt r1 = (X.C07210Wt) r1
            X.0UW r0 = r1.A04
            if (r0 == 0) goto L_0x012a
            X.0UW r0 = r1.A04
            java.lang.CharSequence r0 = r0.A01
            if (r0 != 0) goto L_0x012a
        L_0x0101:
            r3 = 1
        L_0x0102:
            int r2 = r4.size()
            int r2 = r2 - r7
        L_0x0107:
            if (r2 < 0) goto L_0x015f
            java.lang.Object r0 = r4.get(r2)
            X.0Wt r0 = (X.C07210Wt) r0
            if (r3 == 0) goto L_0x0127
            android.text.SpannableStringBuilder r1 = r8.A02(r0)
        L_0x0115:
            int r0 = r4.size()
            int r0 = r0 - r7
            if (r2 == r0) goto L_0x0121
            java.lang.String r0 = "\n"
            r5.insert(r6, r0)
        L_0x0121:
            r5.insert(r6, r1)
            int r2 = r2 + -1
            goto L_0x0107
        L_0x0127:
            java.lang.CharSequence r1 = r0.A05
            goto L_0x0115
        L_0x012a:
            int r2 = r2 + -1
            goto L_0x00ef
        L_0x012d:
            r3 = 0
            goto L_0x0102
        L_0x012f:
            java.lang.CharSequence r0 = r3.A05
            goto L_0x00dc
        L_0x0132:
            if (r3 == 0) goto L_0x00df
            r0 = r9
            X.0cb r0 = (X.C09580cb) r0
            android.app.Notification$Builder r1 = r0.A02
            java.lang.String r0 = ""
            r1.setContentTitle(r0)
            X.0UW r0 = r3.A04
            if (r0 == 0) goto L_0x00d4
            java.lang.CharSequence r0 = r0.A01
            r1.setContentTitle(r0)
            goto L_0x00d4
        L_0x0148:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x015c
            int r0 = r4.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r4.get(r0)
            X.0Wt r3 = (X.C07210Wt) r3
            goto L_0x00be
        L_0x015c:
            r3 = 0
            goto L_0x00be
        L_0x015f:
            X.0cb r9 = (X.C09580cb) r9
            android.app.Notification$Builder r0 = r9.A02
            android.app.Notification$BigTextStyle r0 = A01(r0)
            android.app.Notification$BigTextStyle r0 = A00(r0)
            A03(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$MessagingStyle.A0B(X.0np):void");
    }

    public void A0C(C07210Wt r4) {
        List list = this.A03;
        list.add(r4);
        if (list.size() > 25) {
            list.remove(0);
        }
    }

    public NotificationCompat$MessagingStyle(AnonymousClass0UW r2) {
        if (!TextUtils.isEmpty(r2.A01)) {
            this.A02 = r2;
            return;
        }
        throw AnonymousClass001.A08("User's name must not be empty.");
    }

    private SpannableStringBuilder A02(C07210Wt r14) {
        CharSequence charSequence;
        AnonymousClass046 A022 = AnonymousClass046.A02();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = -16777216;
        AnonymousClass0UW r0 = r14.A04;
        CharSequence charSequence2 = "";
        if (r0 == null) {
            charSequence = charSequence2;
        } else {
            charSequence = r0.A01;
        }
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.A02.A01;
            int i2 = this.A00.A06;
            if (i2 != 0) {
                i = i2;
            }
        }
        AnonymousClass048 r2 = A022.A00;
        SpannableStringBuilder A032 = A022.A03(r2, charSequence);
        spannableStringBuilder.append(A032);
        spannableStringBuilder.setSpan(new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i), (ColorStateList) null), spannableStringBuilder.length() - A032.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = r14.A05;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append("  ").append(A022.A03(r2, charSequence2));
        return spannableStringBuilder;
    }

    public void A0A(Bundle bundle) {
        super.A0A(bundle);
        AnonymousClass0UW r2 = this.A02;
        bundle.putCharSequence("android.selfDisplayName", r2.A01);
        bundle.putBundle("android.messagingStyleUser", r2.A01());
        bundle.putCharSequence("android.hiddenConversationTitle", this.A01);
        CharSequence charSequence = this.A01;
        if (charSequence != null && this.A00.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", charSequence);
        }
        List list = this.A03;
        if (!list.isEmpty()) {
            bundle.putParcelableArray("android.messages", C07210Wt.A00(list));
        }
        List list2 = this.A04;
        if (!list2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C07210Wt.A00(list2));
        }
        Boolean bool = this.A00;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    public static void A03(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        bigTextStyle.bigText(charSequence);
    }

    public static void A04(Notification.Builder builder, Notification.Style style) {
        style.setBuilder(builder);
    }

    public NotificationCompat$MessagingStyle() {
    }
}
