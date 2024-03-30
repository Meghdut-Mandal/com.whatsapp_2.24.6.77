package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5JX  reason: invalid class name */
public class AnonymousClass5JX extends AnonymousClass6Ej implements C160537lA {
    public static C36571kW A0G;
    public static final AtomicReference A0H = C90514aH.A18();
    public boolean A00;
    public final Activity A01;
    public final AnonymousClass17Y A02;
    public final C116455kc A03;
    public final C37111lp A04;
    public final AnonymousClass196 A05;
    public final AnonymousClass1CY A06;
    public final C220612s A07;
    public final AnonymousClass1QN A08;
    public final AnonymousClass005 A09;
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final boolean A0B;
    public final boolean A0C;
    public final C226515g A0D = new C111155bp(this, 0);
    public final C24341Cb A0E;
    public final C20060wx A0F;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5JX(android.app.Activity r12, X.AnonymousClass17Y r13, X.C116455kc r14, X.C29301Wc r15, X.AnonymousClass196 r16, X.C24341Cb r17, X.C20060wx r18, X.AnonymousClass1CY r19, X.C220612s r20, X.AnonymousClass1QN r21, X.C20720y3 r22, X.C20280xJ r23, X.AnonymousClass13I r24, X.AnonymousClass3HJ r25, X.C19770wU r26, X.AnonymousClass005 r27, X.AnonymousClass005 r28, boolean r29, boolean r30) {
        /*
            r11 = this;
            r4 = r11
            r10 = r27
            r9 = r26
            r5 = r15
            r6 = r22
            r7 = r23
            r8 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r11.A0A = r0
            X.5bp r0 = new X.5bp
            r0.<init>(r11, r1)
            r11.A0D = r0
            r11.A02 = r13
            r0 = r18
            r11.A0F = r0
            r0 = r19
            r11.A06 = r0
            r0 = r17
            r11.A0E = r0
            r0 = r20
            r11.A07 = r0
            r11.A01 = r12
            r11.A03 = r14
            r0 = r29
            r11.A0C = r0
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            java.lang.ref.WeakReference r1 = X.AnonymousClass001.A0F(r12)
            X.1lp r0 = new X.1lp
            r3 = r24
            r0.<init>(r2, r3, r1)
            r11.A04 = r0
            r0 = r16
            r11.A05 = r0
            r0 = r21
            r11.A08 = r0
            r0 = r30
            r11.A0B = r0
            r0 = r28
            r11.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5JX.<init>(android.app.Activity, X.17Y, X.5kc, X.1Wc, X.196, X.1Cb, X.0wx, X.1CY, X.12s, X.1QN, X.0y3, X.0xJ, X.13I, X.3HJ, X.0wU, X.005, X.005, boolean, boolean):void");
    }

    public final boolean B2j() {
        return this.A0E.A03(this.A0D);
    }

    public Dialog BUr(int i) {
        C39001qm r2;
        int i2;
        int i3;
        int i4;
        if (i != 100) {
            if (i != 101) {
                int i5 = 200;
                if (i != 200) {
                    i5 = 201;
                    if (i != 201) {
                        switch (i) {
                            case 103:
                                Log.i("restore>VerifyMessageStoreHelper/dialog/restore");
                                r2 = AnonymousClass3LW.A00(this.A01);
                                r2.A0d(R.string.f12nameremoved);
                                r2.A0c(R.string.f12nameremoved);
                                C163297py.A01(r2, this, 4, R.string.f12nameremoved);
                                i3 = R.string.f12nameremoved;
                                i4 = 5;
                                break;
                            case 104:
                                Log.i("restore>VerifyMessageStoreHelper/dialog/groupsync");
                                Activity activity = this.A01;
                                C36571kW r6 = new C36571kW(activity);
                                r6.setTitle(R.string.f12nameremoved);
                                C36391kE.A17(r6, activity, R.string.f12nameremoved);
                                r6.setIndeterminate(true);
                                r6.setCancelable(false);
                                return r6;
                            case 105:
                                Log.i("restore>VerifyMessageStoreHelper/dialog/restoreduetoerror");
                                StringBuilder A0u = AnonymousClass000.A0u();
                                Activity activity2 = this.A01;
                                C36351kA.A14(activity2, A0u, R.string.f12nameremoved);
                                A0u.append(" ");
                                C36351kA.A14(activity2, A0u, R.string.f12nameremoved);
                                String obj = A0u.toString();
                                r2 = AnonymousClass3LW.A00(activity2);
                                r2.A0d(R.string.f12nameremoved);
                                r2.A0p(obj);
                                C163297py.A01(r2, this, 6, R.string.f12nameremoved);
                                i3 = R.string.f12nameremoved;
                                i4 = 7;
                                break;
                            case 106:
                                r2 = AnonymousClass3LW.A00(this.A01);
                                r2.A0d(R.string.f12nameremoved);
                                r2.A0c(R.string.f12nameremoved);
                                C163297py.A01(r2, this, 8, R.string.f12nameremoved);
                                i3 = R.string.f12nameremoved;
                                i4 = 9;
                                break;
                            case 107:
                                Log.i("restore>VerifyMessageStoreHelper/dialog/restorefrombackupduetoerrorcardnotfoundaskretry");
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                Activity activity3 = this.A01;
                                C36351kA.A14(activity3, A0u2, R.string.f12nameremoved);
                                A0u2.append(" ");
                                boolean A002 = C20060wx.A00();
                                int i6 = R.string.f12nameremoved;
                                if (A002) {
                                    i6 = R.string.f12nameremoved;
                                }
                                C36351kA.A14(activity3, A0u2, i6);
                                String obj2 = A0u2.toString();
                                r2 = AnonymousClass3LW.A00(activity3);
                                r2.A0d(R.string.f12nameremoved);
                                r2.A0p(obj2);
                                C163297py.A01(r2, this, 2, R.string.f12nameremoved);
                                i3 = R.string.f12nameremoved;
                                i4 = 3;
                                break;
                            case C65953Uc.A03:
                                Log.i("restore>VerifyMessageStoreHelper/dialog/msgstorenotrestored");
                                r2 = AnonymousClass3LW.A00(this.A01);
                                r2.A0d(R.string.f12nameremoved);
                                r2.A0c(R.string.f12nameremoved);
                                r2.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
                                break;
                            default:
                                return null;
                        }
                        C163297py.A00(r2, this, i4, i3);
                        r2.A0r(false);
                    } else {
                        Log.i("restore>VerifyMessageStoreHelper/dialog/keyserviceunavailable");
                        i2 = R.string.f12nameremoved;
                    }
                } else {
                    Log.i("restore>VerifyMessageStoreHelper/dialog/cannot-connect");
                    i2 = R.string.f12nameremoved;
                }
                r2 = AnonymousClass3LW.A00(this.A01);
                r2.A0c(i2);
                r2.A0r(false);
                r2.A0h(new C163527qL(this, i5, 0), R.string.f12nameremoved);
                r2.A0f(new C163527qL(this, i5, 1), R.string.f12nameremoved);
            } else {
                Log.i("restore>VerifyMessageStoreHelper/dialog/msgstoreerror");
                r2 = AnonymousClass3LW.A00(this.A01);
                r2.A0d(R.string.f12nameremoved);
                r2.A0c(R.string.f12nameremoved);
                C163297py.A01(r2, this, 1, R.string.f12nameremoved);
            }
            return r2.create();
        }
        Log.i("restore>VerifyMessageStoreHelper/dialog/setup");
        Activity activity4 = this.A01;
        C36571kW r1 = new C36571kW(activity4);
        A0G = r1;
        r1.setTitle(activity4.getString(R.string.f12nameremoved));
        C36391kE.A17(A0G, activity4, R.string.f12nameremoved);
        A0G.setIndeterminate(false);
        A0G.setCancelable(false);
        A0G.setProgressStyle(1);
        return A0G;
    }

    public void Bp4(boolean z, boolean z2) {
        String str;
        this.A00 = z;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("restore>VerifyMessageStoreHelper/preparemsgstore isregname=");
        boolean z3 = this.A0C;
        A0u.append(z3);
        A0u.append(" restorefrombackup=");
        A0u.append(z);
        A0u.append(" skipdialog=");
        if (z2) {
            str = "true";
        } else {
            str = "false";
        }
        C36321k7.A1a(A0u, str);
        if (!z2) {
            Activity activity = this.A01;
            if (!activity.isFinishing() && (!z3 || this.A00)) {
                AnonymousClass3SJ.A01(activity, 100);
            }
        }
        A02();
    }

    public void BxC() {
        int A012 = this.A01.A01();
        C36321k7.A1T("restore>VerifyMessageStoreHelper/usehistoryifexists/backupfilesfound ", AnonymousClass000.A0u(), A012);
        if (A012 > 0) {
            AnonymousClass3SJ.A01(this.A01, 103);
        } else {
            Bp4(false, true);
        }
    }
}
