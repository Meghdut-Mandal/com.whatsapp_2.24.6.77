package X;

import androidx.preference.ListPreference;
import androidx.preference.Preference;

public class B8C implements C22847Aww {
    public Object A00;
    public final int A01;

    public static void A00(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        preference.A0H(listPreference.A01[listPreference.A0S((String) obj)].toString());
    }

    public B8C(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A01(Preference preference, Object obj, int i) {
        preference.A0A = new B8C(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015d, code lost:
        X.AnonymousClass1CR.A07(r2, r0.getRawString(), r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017e, code lost:
        r1 = r0.equals(r9);
        r2 = X.C36361kB.A0d(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0188, code lost:
        if (r1 == r2.A0G) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x018a, code lost:
        r2.A0G = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018c, code lost:
        X.AnonymousClass1CR.A06(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b5, code lost:
        X.AnonymousClass1CR.A08(r2, r0.getRawString(), r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean BdG(androidx.preference.Preference r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0053;
                case 2: goto L_0x0060;
                case 3: goto L_0x0095;
                case 4: goto L_0x00a1;
                case 5: goto L_0x00c0;
                case 6: goto L_0x010e;
                case 7: goto L_0x016a;
                case 8: goto L_0x0191;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r0 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r0
            r1 = 1
            X.C36321k7.A0v(r8, r1, r9)
            X.00T r0 = r0.A0D
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r2 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r2
            java.lang.String r4 = r8.A0J
            X.AnonymousClass00C.A08(r4)
            java.lang.String r5 = r9.toString()
            X.AnonymousClass00C.A0D(r5, r1)
            X.11F r3 = r2.A00
            if (r3 == 0) goto L_0x003a
            X.0wU r0 = r2.A06
            r6 = 9
            X.3vV r1 = new X.3vV
            r1.<init>(r2, r3, r4, r5, r6)
            r0.Boy(r1)
            X.1Rs r1 = r2.A05
            X.011 r0 = X.C36441kJ.A19(r4, r5)
            r1.A0D(r0)
        L_0x003a:
            r0 = 1
            return r0
        L_0x003c:
            java.lang.Object r0 = r7.A00
            com.whatsapp.settings.SettingsJidNotificationFragment r0 = (com.whatsapp.settings.SettingsJidNotificationFragment) r0
            A00(r8, r9)
            X.1CR r2 = r0.A06
            X.11F r0 = r0.A05
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = r0.getRawString()
            X.AnonymousClass1CR.A0A(r2, r0, r1)
            goto L_0x003a
        L_0x0053:
            java.lang.Object r0 = r7.A00
            com.whatsapp.settings.SettingsJidNotificationFragment r0 = (com.whatsapp.settings.SettingsJidNotificationFragment) r0
            A00(r8, r9)
            X.1CR r2 = r0.A06
            X.11F r0 = r0.A05
            goto L_0x01b5
        L_0x0060:
            java.lang.Object r3 = r7.A00
            com.whatsapp.settings.SettingsJidNotificationFragment r3 = (com.whatsapp.settings.SettingsJidNotificationFragment) r3
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Desire"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "Wildfire"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x008c
        L_0x0076:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "00FF00"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008c
            r1 = 2131890689(0x7f121201, float:1.9416077E38)
            X.4vr r0 = r3.A00
            if (r0 == 0) goto L_0x008c
            r0.BO5(r1)
        L_0x008c:
            A00(r8, r9)
            X.1CR r2 = r3.A06
            X.11F r0 = r3.A05
            goto L_0x015d
        L_0x0095:
            java.lang.Object r0 = r7.A00
            com.whatsapp.settings.SettingsJidNotificationFragment r0 = (com.whatsapp.settings.SettingsJidNotificationFragment) r0
            X.1CR r3 = r0.A06
            X.11F r2 = r0.A05
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x017e
        L_0x00a1:
            java.lang.Object r0 = r7.A00
            com.whatsapp.settings.SettingsJidNotificationFragment r0 = (com.whatsapp.settings.SettingsJidNotificationFragment) r0
            A00(r8, r9)
            X.1CR r3 = r0.A06
            X.11F r0 = r0.A05
            java.lang.String r1 = r9.toString()
            X.3LI r2 = X.C36361kB.A0d(r0, r3)
            java.lang.String r0 = r2.A0A
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x003a
            r2.A0A = r1
            goto L_0x018c
        L_0x00c0:
            java.lang.Object r5 = r7.A00
            com.whatsapp.settings.SettingsJidNotificationFragment r5 = (com.whatsapp.settings.SettingsJidNotificationFragment) r5
            X.1CR r1 = r5.A06
            X.11F r0 = r5.A05
            X.3LI r0 = X.C36361kB.A0d(r0, r1)
            boolean r3 = r0.A0L
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r4 = r0.equals(r9)
            X.1CR r2 = r5.A06
            X.11F r0 = r5.A05
            X.3LI r1 = X.C36361kB.A0d(r0, r2)
            boolean r0 = r1.A0L
            if (r4 == r0) goto L_0x00ed
            if (r4 == 0) goto L_0x00e8
            boolean r0 = r1.A0C()
            r1.A0G = r0
        L_0x00e8:
            r1.A0L = r4
            X.AnonymousClass1CR.A06(r1, r2)
        L_0x00ed:
            if (r3 == r4) goto L_0x0105
            X.11F r1 = r5.A05
            X.1Wn r3 = r5.A01
            if (r4 == 0) goto L_0x010a
            X.16D r0 = r5.A02
            X.141 r2 = r0.A08(r1)
            if (r2 == 0) goto L_0x0105
            android.content.Context r1 = r5.A0a()
            r0 = 0
            r3.A04(r1, r2, r0)
        L_0x0105:
            com.whatsapp.settings.SettingsJidNotificationFragment.A03(r5)
            goto L_0x003a
        L_0x010a:
            r3.A07(r1)
            goto L_0x0105
        L_0x010e:
            java.lang.Object r3 = r7.A00
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r3 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r3
            X.C36321k7.A0x(r8, r9)
            java.lang.String r1 = android.os.Build.MODEL
            X.AnonymousClass00C.A09(r1)
            java.lang.String r0 = "Desire"
            boolean r0 = X.C90494aF.A1Z(r1, r0)
            if (r0 != 0) goto L_0x012a
            java.lang.String r0 = "Wildfire"
            boolean r0 = X.C90494aF.A1Z(r1, r0)
            if (r0 == 0) goto L_0x0140
        L_0x012a:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "00FF00"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x0140
            r1 = 2131890689(0x7f121201, float:1.9416077E38)
            X.4vr r0 = r3.A00
            if (r0 == 0) goto L_0x0140
            r0.BO5(r1)
        L_0x0140:
            r2 = r8
            androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r2.A0S(r0)
            java.lang.CharSequence[] r0 = r2.A01
            r0 = r0[r1]
            java.lang.String r0 = r0.toString()
            r8.A0H(r0)
            X.11F r0 = r3.A02
            if (r0 == 0) goto L_0x003a
            X.1CR r2 = r3.A1c()
        L_0x015d:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = r0.getRawString()
            X.AnonymousClass1CR.A07(r2, r0, r1)
            goto L_0x003a
        L_0x016a:
            java.lang.Object r1 = r7.A00
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r1 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r1
            boolean r0 = X.C90514aH.A1Y(r9)
            X.11F r2 = r1.A02
            if (r2 == 0) goto L_0x003a
            X.1CR r3 = r1.A1c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x017e:
            boolean r1 = r0.equals(r9)
            X.3LI r2 = X.C36361kB.A0d(r2, r3)
            boolean r0 = r2.A0G
            if (r1 == r0) goto L_0x003a
            r2.A0G = r1
        L_0x018c:
            X.AnonymousClass1CR.A06(r2, r3)
            goto L_0x003a
        L_0x0191:
            java.lang.Object r3 = r7.A00
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r3 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r3
            X.C36321k7.A0x(r8, r9)
            r2 = r8
            androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r2.A0S(r0)
            java.lang.CharSequence[] r0 = r2.A01
            r0 = r0[r1]
            java.lang.String r0 = r0.toString()
            r8.A0H(r0)
            X.11F r0 = r3.A02
            if (r0 == 0) goto L_0x003a
            X.1CR r2 = r3.A1c()
        L_0x01b5:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = r0.getRawString()
            X.AnonymousClass1CR.A08(r2, r0, r1)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8C.BdG(androidx.preference.Preference, java.lang.Object):boolean");
    }
}
