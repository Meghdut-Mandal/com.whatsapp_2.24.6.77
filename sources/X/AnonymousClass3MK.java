package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3MK  reason: invalid class name */
public class AnonymousClass3MK implements C226515g {
    public Object A00;
    public final int A01;

    public AnonymousClass3MK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A02() {
        Activity activity = (Activity) this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f12nameremoved;
        if (i >= 30) {
            i2 = R.string.f12nameremoved;
            if (i < 33) {
                i2 = R.string.f12nameremoved;
            }
        }
        RequestPermissionActivity.A07(activity, R.string.f12nameremoved, i2);
    }

    public void A03() {
        Activity activity = (Activity) this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f12nameremoved;
        if (i >= 30) {
            i2 = R.string.f12nameremoved;
            if (i < 33) {
                i2 = R.string.f12nameremoved;
            }
        }
        RequestPermissionActivity.A07(activity, R.string.f12nameremoved, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        com.whatsapp.util.Log.i(r0);
        r3 = (X.C225314u) r5.A00;
        r2 = com.whatsapp.R.string.f12nameremoved;
        r0 = X.C20060wx.A00();
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        if (r0 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        X.C36401kF.A1D(r3, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r2 = A01();
        r1 = A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Be9(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x007e;
                case 2: goto L_0x0077;
                case 3: goto L_0x0070;
                case 4: goto L_0x003f;
                case 5: goto L_0x003c;
                case 6: goto L_0x0020;
                case 7: goto L_0x0011;
                case 8: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "must not be called"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x000c:
            java.lang.Object r3 = r5.A00
            X.14u r3 = (X.C225314u) r3
            goto L_0x0017
        L_0x0011:
            java.lang.Object r3 = r5.A00
            X.14u r3 = (X.C225314u) r3
            java.util.HashMap r0 = com.whatsapp.status.playback.MessageReplyActivity.A1g
        L_0x0017:
            int r2 = A01()
            int r1 = A00()
            goto L_0x006c
        L_0x0020:
            java.lang.Object r4 = r5.A00
            X.02E r4 = (X.AnonymousClass02E) r4
            int r3 = A01()
            int r2 = A00()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.01I r0 = r4.A0h()
            X.C18740tg.A06(r0)
            X.14r r0 = (X.C225014r) r0
            r0.BO9(r1, r3, r2)
            return
        L_0x003c:
            java.lang.String r0 = "settings-chat/readonly-external-storage-readonly"
            goto L_0x0056
        L_0x003f:
            java.lang.Object r4 = r5.A00
            X.3UB r4 = (X.AnonymousClass3UB) r4
            int r3 = A01()
            int r2 = A00()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.14u r0 = r4.A0R
            r0.BO9(r1, r3, r2)
            return
        L_0x0054:
            java.lang.String r0 = "settings-gdrive/readonly-external-storage-readonly"
        L_0x0056:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r5.A00
            X.14u r3 = (X.C225314u) r3
            r2 = 2131891165(0x7f1213dd, float:1.9417042E38)
            boolean r0 = X.C20060wx.A00()
            r1 = 2131893352(0x7f121c68, float:1.9421478E38)
            if (r0 == 0) goto L_0x006c
            r1 = 2131893351(0x7f121c67, float:1.9421476E38)
        L_0x006c:
            X.C36401kF.A1D(r3, r2, r1)
            return
        L_0x0070:
            java.lang.String r0 = "must not be called"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0077:
            java.lang.String r0 = "ContactUsDebugInfoRepository/must not be called/external-storage-readonly/must not be called"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x007e:
            java.lang.String r0 = "inAppBugReporting/external-storage-readonly"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MK.Be9(java.lang.String):void");
    }

    public void BeA() {
        switch (this.A01) {
            case 0:
                Log.i("settings-gdrive/readonly-external-storage-readonly-permission");
                A02();
                return;
            case 1:
                throw AnonymousClass001.A09("inAppBugReporting/external-storage-readonly/permission denied");
            case 2:
                throw AnonymousClass001.A09("ContactUsDebugInfoRepository/must not be called/external-storage-readonly/permission denied/");
            case 3:
                throw AnonymousClass001.A09("must not be called");
            case 4:
                ((AnonymousClass3UB) this.A00).A0R.BO9(new Object[0], R.string.f12nameremoved, R.string.f12nameremoved);
                return;
            case 5:
                Log.i("settings-chat/readonly-external-storage-readonly-permission");
                A03();
                return;
            case 6:
                AnonymousClass01I A0h = ((AnonymousClass02E) this.A00).A0h();
                C18740tg.A06(A0h);
                ((C225014r) A0h).BO9(new Object[0], R.string.f12nameremoved, R.string.f12nameremoved);
                return;
            case 9:
                throw AnonymousClass001.A09("must not be called");
            default:
                C36401kF.A1D((C225314u) this.A00, R.string.f12nameremoved, R.string.f12nameremoved);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0063, code lost:
        X.C36401kF.A1D(r2, A01(), A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a5, code lost:
        com.whatsapp.util.Log.i(r0);
        X.AnonymousClass3SJ.A01((android.app.Activity) r5.A00, 602);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        X.C36321k7.A1a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bjm(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x0044;
                case 2: goto L_0x0030;
                case 3: goto L_0x001c;
                case 4: goto L_0x008e;
                case 5: goto L_0x008b;
                case 6: goto L_0x006f;
                case 7: goto L_0x005d;
                case 8: goto L_0x0058;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A00
            X.2kC r2 = (X.C50092kC) r2
            r0 = -2
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contactsupporttask/externalstorage/avail external storage not calculated, state="
            r1.append(r0)
            java.lang.String r0 = r2.A01
        L_0x0018:
            X.C36321k7.A1a(r1, r0)
            return
        L_0x001c:
            java.lang.Object r2 = r5.A00
            X.2kG r2 = (X.C50132kG) r2
            r0 = -2
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "searchSupportTask/externalStorage/avail external storage not calculated, state="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            goto L_0x0018
        L_0x0030:
            java.lang.Object r2 = r5.A00
            X.3AY r2 = (X.AnonymousClass3AY) r2
            r0 = -2
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ContactUsDebugInfoRepository/error-external-storage-unavailable/state="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            goto L_0x0018
        L_0x0044:
            java.lang.Object r2 = r5.A00
            X.3Au r2 = (X.C61163Au) r2
            r0 = -2
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "inAppBugReporting/error-external-storage-unavailable/state="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            goto L_0x0018
        L_0x0058:
            java.lang.Object r2 = r5.A00
            X.14u r2 = (X.C225314u) r2
            goto L_0x0063
        L_0x005d:
            java.lang.Object r2 = r5.A00
            X.14u r2 = (X.C225314u) r2
            java.util.HashMap r0 = com.whatsapp.status.playback.MessageReplyActivity.A1g
        L_0x0063:
            int r1 = A01()
            int r0 = A00()
            X.C36401kF.A1D(r2, r1, r0)
            return
        L_0x006f:
            java.lang.Object r4 = r5.A00
            X.02E r4 = (X.AnonymousClass02E) r4
            int r3 = A01()
            int r2 = A00()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.01I r0 = r4.A0h()
            X.C18740tg.A06(r0)
            X.14r r0 = (X.C225014r) r0
            r0.BO9(r1, r3, r2)
            return
        L_0x008b:
            java.lang.String r0 = "settings-chat/external-storage-unavailable"
            goto L_0x00a5
        L_0x008e:
            java.lang.Object r4 = r5.A00
            X.3UB r4 = (X.AnonymousClass3UB) r4
            int r3 = A01()
            int r2 = A00()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.14u r0 = r4.A0R
            r0.BO9(r1, r3, r2)
            return
        L_0x00a3:
            java.lang.String r0 = "settings-gdrive/external-storage-unavailable"
        L_0x00a5:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r5.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 602(0x25a, float:8.44E-43)
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MK.Bjm(java.lang.String):void");
    }

    public void Bjn() {
        String str;
        switch (this.A01) {
            case 0:
                Log.i("settings-gdrive/external-storage-unavailable-permission");
                A02();
                return;
            case 1:
                ((C61163Au) this.A00).A00 = -2;
                str = "inAppBugReporting/error-external-storage-unavailable/permission denied";
                break;
            case 2:
                ((AnonymousClass3AY) this.A00).A00 = -2;
                str = "ContactUsDebugInfoRepository/error-external-storage-unavailable/permission denied";
                break;
            case 3:
                ((C50132kG) this.A00).A00 = -2;
                str = "searchSupportTask/externalStorage/avail external storage not calculated, permission denied";
                break;
            case 4:
                ((AnonymousClass3UB) this.A00).A0R.BO9(new Object[0], R.string.f12nameremoved, R.string.f12nameremoved);
                return;
            case 5:
                Log.i("settings-chat/external-storage-unavailable-permission");
                A03();
                return;
            case 6:
                AnonymousClass01I A0h = ((AnonymousClass02E) this.A00).A0h();
                C18740tg.A06(A0h);
                ((C225014r) A0h).BO9(new Object[0], R.string.f12nameremoved, R.string.f12nameremoved);
                return;
            case 9:
                ((C50092kC) this.A00).A00 = -2;
                str = "contactsupporttask/externalstorage/avail external storage not calculated, permission denied";
                break;
            default:
                C36401kF.A1D((C225314u) this.A00, R.string.f12nameremoved, R.string.f12nameremoved);
                return;
        }
        Log.i(str);
    }

    public static int A00() {
        if (C20060wx.A00()) {
            return R.string.f12nameremoved;
        }
        return R.string.f12nameremoved;
    }

    public static int A01() {
        if (C20060wx.A00()) {
            return R.string.f12nameremoved;
        }
        return R.string.f12nameremoved;
    }
}
