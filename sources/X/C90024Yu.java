package X;

import android.app.Activity;
import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4Yu  reason: invalid class name and case insensitive filesystem */
public class C90024Yu implements AnonymousClass192 {
    public Object A00;
    public final int A01;

    public C90024Yu(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BUx(C63133Iw r4) {
        Activity activity;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                Log.w("LinkedDevicesEnterCodeActivity/companionDeviceObserver/onCriticalDataSyncFailed");
                activity = (Activity) this.A00;
                runnable = new C80263v7(this, r4, 33);
                break;
            case 3:
                activity = (Activity) this.A00;
                runnable = C80313vC.A00(this, r4, 6);
                break;
            default:
                return;
        }
        activity.runOnUiThread(runnable);
    }

    public void BVT(C63133Iw r4) {
        Activity activity;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                activity = (Activity) this.A00;
                runnable = new C80263v7(this, r4, 34);
                break;
            case 3:
                activity = (Activity) this.A00;
                runnable = C80313vC.A00(this, r4, 7);
                break;
            default:
                return;
        }
        activity.runOnUiThread(runnable);
    }

    public void BVW(C63133Iw r4) {
        Activity activity;
        Runnable r1;
        switch (this.A01) {
            case 0:
                Log.i("LinkedDevicesEnterCodeActivity/companionDeviceObserver/onDeviceLoginComplete");
                activity = (Activity) this.A00;
                r1 = new C80263v7(this, r4, 36);
                break;
            case 1:
                ((LinkedDevicesSharedViewModel) this.A00).A0T.A0C((Object) null);
                return;
            case 2:
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
                IdentityVerificationActivity.A0J(identityVerificationActivity, C36411kG.A0j(identityVerificationActivity));
                return;
            default:
                activity = (Activity) this.A00;
                r1 = C80313vC.A00(this, r4, 8);
                break;
        }
        activity.runOnUiThread(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r4 != null) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BVX(X.C20760y7 r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0069
            int r0 = r7.size()
            r4 = 1
            if (r0 != r4) goto L_0x003f
            java.lang.Object r5 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            X.19g r1 = r5.A0G
            X.14x r0 = r7.iterator()
            java.lang.Object r0 = r0.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r0 = r0.getRawString()
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            X.C18740tg.A06(r0)
            X.3SB r0 = X.C236419g.A00(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r3 = r0.A09
            if (r3 == 0) goto L_0x003f
            android.app.Application r2 = r5.A04
            r1 = 2131894387(0x7f122073, float:1.9423577E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = X.C36381kD.A0r(r2, r3, r0, r1)
            if (r4 != 0) goto L_0x004c
        L_0x003f:
            java.lang.Object r5 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            android.app.Application r2 = r5.A04
            r0 = 2131890739(0x7f121233, float:1.9416178E38)
            java.lang.String r4 = r2.getString(r0)
        L_0x004c:
            X.0wD r0 = r5.A0D
            boolean r1 = r0.A09()
            r0 = 2131891264(0x7f121440, float:1.9417243E38)
            if (r1 == 0) goto L_0x005a
            r0 = 2131890738(0x7f121232, float:1.9416176E38)
        L_0x005a:
            java.lang.String r3 = r2.getString(r0)
            X.17Y r2 = r5.A07
            r1 = 6
            X.3vK r0 = new X.3vK
            r0.<init>(r6, r4, r3, r1)
            r2.A0H(r0)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90024Yu.BVX(X.0y7, int):void");
    }

    public void BVZ(C63133Iw r4) {
        Activity activity;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                Log.i("LinkedDevicesEnterCodeActivity/companionDeviceObserver/onDeviceRegistered");
                activity = (Activity) this.A00;
                runnable = new C80263v7(this, r4, 37);
                break;
            case 3:
                activity = (Activity) this.A00;
                runnable = C80313vC.A00(this, r4, 9);
                break;
            default:
                return;
        }
        activity.runOnUiThread(runnable);
    }

    public /* synthetic */ void BVa(C20760y7 r3) {
        switch (this.A01) {
            case 1:
                C81093wS.A00(((LinkedDevicesSharedViewModel) this.A00).A07, this, 48);
                return;
            case 2:
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
                IdentityVerificationActivity.A0J(identityVerificationActivity, C36411kG.A0j(identityVerificationActivity));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BVb(AnonymousClass3SB r3) {
        if (1 - this.A01 == 0) {
            ((LinkedDevicesSharedViewModel) this.A00).A0T.A0C((Object) null);
        }
    }
}
