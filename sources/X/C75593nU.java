package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3nU  reason: invalid class name and case insensitive filesystem */
public class C75593nU implements C160107kT {
    public WeakReference A00;
    public AnonymousClass141 A01;
    public final AnonymousClass17Y A02;
    public final C24341Cb A03;
    public final C20060wx A04;
    public final AnonymousClass171 A05;
    public final C21010yW A06;

    public /* synthetic */ void BW4(long j) {
    }

    public void BW6(boolean z) {
        this.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d5, code lost:
        if (r0 == false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C133136Wx r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass2XK
            if (r0 == 0) goto L_0x005e
            r4 = 2131893239(0x7f121bf7, float:1.9421249E38)
            java.lang.ref.WeakReference r0 = r7.A00
            if (r0 == 0) goto L_0x00db
            android.app.Activity r6 = X.C36441kJ.A0D(r0)
            if (r6 == 0) goto L_0x00db
            boolean r0 = X.AnonymousClass3SJ.A04(r6)
            if (r0 != 0) goto L_0x00db
            X.17Y r0 = r7.A02
            X.14r r0 = r0.A00
            if (r0 != r6) goto L_0x00db
            int r5 = r8.A01
            r0 = 9
            r3 = 0
            if (r5 != r0) goto L_0x003c
            X.1Cb r2 = r7.A03
            X.0wx r1 = r7.A04
            X.3g9 r0 = new X.3g9
            r0.<init>(r6, r1)
            boolean r0 = r2.A04(r0)
            if (r0 == 0) goto L_0x003b
        L_0x0033:
            r1 = 2131895151(0x7f12236f, float:1.9425127E38)
        L_0x0036:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r7.A01(r0, r5, r4, r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = 4
            if (r5 != r0) goto L_0x004c
            boolean r0 = X.C20060wx.A00()
            r1 = 2131890528(0x7f121160, float:1.941575E38)
            if (r0 == 0) goto L_0x0036
            r1 = 2131890527(0x7f12115f, float:1.9415748E38)
            goto L_0x0036
        L_0x004c:
            r0 = 5
            if (r5 != r0) goto L_0x0053
            r1 = 2131893240(0x7f121bf8, float:1.942125E38)
            goto L_0x0036
        L_0x0053:
            r0 = 8
            if (r5 == r0) goto L_0x005a
            r0 = -1
            if (r5 != r0) goto L_0x0033
        L_0x005a:
            r1 = 2131890552(0x7f121178, float:1.94158E38)
            goto L_0x0036
        L_0x005e:
            java.lang.ref.WeakReference r0 = r7.A00
            if (r0 == 0) goto L_0x00de
            android.app.Activity r3 = X.C36441kJ.A0D(r0)
            if (r3 == 0) goto L_0x00de
            boolean r0 = X.AnonymousClass3SJ.A04(r3)
            if (r0 != 0) goto L_0x00de
            X.17Y r0 = r7.A02
            X.14r r0 = r0.A00
            if (r0 != r3) goto L_0x00de
            int r5 = r8.A01
            r0 = 9
            r4 = 0
            if (r5 != r0) goto L_0x0096
            X.1Cb r2 = r7.A03
            X.0wx r1 = r7.A04
            X.3g9 r0 = new X.3g9
            r0.<init>(r3, r1)
            boolean r0 = r2.A04(r0)
            if (r0 == 0) goto L_0x003b
        L_0x008a:
            r6 = 2131888941(0x7f120b2d, float:1.9412532E38)
            r3 = 2131895150(0x7f12236e, float:1.9425125E38)
        L_0x0090:
            java.lang.Object[] r2 = new java.lang.Object[r4]
        L_0x0092:
            r7.A01(r2, r5, r6, r3)
            return
        L_0x0096:
            r0 = 4
            if (r5 != r0) goto L_0x00a0
            r6 = 2131888941(0x7f120b2d, float:1.9412532E38)
            r3 = 2131890530(0x7f121162, float:1.9415754E38)
            goto L_0x0090
        L_0x00a0:
            r0 = 5
            if (r5 != r0) goto L_0x00c0
            X.141 r1 = r7.A01
            r6 = 2131888941(0x7f120b2d, float:1.9412532E38)
            if (r1 == 0) goto L_0x00d7
            X.11F r0 = r1.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            r3 = 2131894941(0x7f12229d, float:1.94247E38)
            if (r0 == 0) goto L_0x00b6
            r3 = 2131891563(0x7f12156b, float:1.941785E38)
        L_0x00b6:
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            X.171 r0 = r7.A05
            X.C36361kB.A1F(r0, r1, r2, r4)
            goto L_0x0092
        L_0x00c0:
            r0 = 8
            if (r5 == r0) goto L_0x00c7
            r0 = -1
            if (r5 != r0) goto L_0x008a
        L_0x00c7:
            r6 = 2131888941(0x7f120b2d, float:1.9412532E38)
            X.141 r0 = r7.A01
            if (r0 == 0) goto L_0x00d7
            X.11F r0 = r0.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            r3 = 2131891563(0x7f12156b, float:1.941785E38)
            if (r0 != 0) goto L_0x0090
        L_0x00d7:
            r3 = 2131890551(0x7f121177, float:1.9415797E38)
            goto L_0x0090
        L_0x00db:
            java.lang.String r0 = "productdownloadlistener/notifyuser/skip"
            goto L_0x00e0
        L_0x00de:
            java.lang.String r0 = "basemediadownloadlistener/notifyuser/skip"
        L_0x00e0:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75593nU.A00(X.6Wx):void");
    }

    public void A01(Object[] objArr, int i, int i2, int i3) {
        Activity A0D;
        WeakReference weakReference = this.A00;
        if (weakReference == null || (A0D = C36441kJ.A0D(weakReference)) == null || AnonymousClass3SJ.A04(A0D) || this.A02.A00 != A0D) {
            Log.i("basemediadownloadlistener/notifyuser/skip");
            return;
        }
        C18740tg.A06(A0D);
        C225014r r3 = (C225014r) A0D;
        Object[] objArr2 = objArr;
        int i4 = i2;
        int i5 = i3;
        if (i == 4) {
            r3.BO8(new C68673cH(A0D, C55582ur.A00(this.A06, 4), 4), objArr2, i4, i5, R.string.f12nameremoved);
        } else {
            r3.BO9(objArr, i2, i3);
        }
    }

    public void BW7(C133136Wx r7, C129166Fp r8) {
        C74173lB r1;
        if (this instanceof AnonymousClass2XL) {
            AnonymousClass2XL r3 = (AnonymousClass2XL) this;
            if (r7.A03()) {
                r1 = r3.A00;
                synchronized (r1) {
                    Log.i("gdpr/on-report-downloaded");
                    r1.A0B(C52472pU.DOWNLOADED.value);
                }
            } else {
                int i = r7.A01;
                if (i == 5 || i == 8) {
                    r3.A01(new Object[0], i, R.string.f12nameremoved, R.string.f12nameremoved);
                    r3.A00.A08();
                } else if (i == 4) {
                    r3.A01(new Object[0], i, R.string.f12nameremoved, R.string.f12nameremoved);
                } else {
                    r3.A00(r7);
                    r1 = r3.A00;
                    synchronized (r1) {
                        Log.i("gdpr/on-report-download-failed");
                        r1.A0B(C52472pU.DOWNLOAD_FAILED.value);
                    }
                }
            }
            r3.A00 = null;
        } else if (this instanceof AnonymousClass2XM) {
            AnonymousClass2XM r32 = (AnonymousClass2XM) this;
            if (!r7.A03()) {
                int i2 = r7.A01;
                if (i2 == 9) {
                    if (!r32.A02) {
                        r32.A00(r7);
                        r32.A02 = true;
                    }
                } else if (i2 == 4) {
                    if (!r32.A00) {
                        r32.A00(r7);
                        r32.A00 = true;
                    }
                } else if (i2 != 2 && i2 != 3 && i2 != 11) {
                    r32.A00(r7);
                } else if (!r32.A01) {
                    r32.A00(r7);
                    r32.A01 = true;
                }
            }
        } else if (!r7.A03()) {
            A00(r7);
            this.A00 = null;
        }
    }

    public C75593nU(Activity activity, AnonymousClass17Y r3, AnonymousClass171 r4, C24341Cb r5, C20060wx r6, AnonymousClass141 r7, C21010yW r8) {
        this.A02 = r3;
        this.A06 = r8;
        this.A04 = r6;
        this.A05 = r4;
        this.A03 = r5;
        this.A00 = AnonymousClass001.A0F(activity);
        this.A01 = r7;
    }
}
