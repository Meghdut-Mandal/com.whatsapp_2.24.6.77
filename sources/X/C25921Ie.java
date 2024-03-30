package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Ie  reason: invalid class name and case insensitive filesystem */
public class C25921Ie implements C236119d, AnonymousClass192 {
    public Runnable A00;
    public final C19730wQ A01;
    public final C25931If A02;
    public final AnonymousClass1AB A03;
    public final C237119n A04;
    public final C19970wo A05;
    public final C236419g A06;
    public final C20810yC A07;
    public final AnonymousClass19A A08;
    public final C19770wU A09;
    public final C21100yf A0A;

    public synchronized void A01() {
        boolean A042 = A04();
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataHandler/schedule isSyncdDirtyAndShouldRetry = ");
        sb.append(A042);
        Log.i(sb.toString());
        if (A042) {
            this.A00 = this.A09.BpM(new C35671j4(this, 24), "SyncdDeleteAllHandler/schedule", 1000);
        } else {
            C19770wU r3 = this.A09;
            C25931If r2 = this.A02;
            Objects.requireNonNull(r2);
            r3.Boy(new C35671j4(r2, 25));
        }
    }

    public /* synthetic */ void BUx(C63133Iw r1) {
    }

    public /* synthetic */ void BVT(C63133Iw r1) {
    }

    public /* synthetic */ void BVZ(C63133Iw r1) {
    }

    public /* synthetic */ void BVb(AnonymousClass3SB r1) {
    }

    public static boolean A00(C25921Ie r8) {
        long j = C237119n.A00(r8.A04).getLong("syncd_last_companion_dereg_time", 0);
        boolean z = false;
        if (j != 0) {
            if (j + TimeUnit.MINUTES.toMillis((long) r8.A0A.A04(C21100yf.A1U)) >= C19970wo.A00(r8.A05)) {
                z = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdDeleteAllDataApiHandler/isInKeepAliveMode: isInKeepAliveMode = ");
            sb.append(z);
            Log.i(sb.toString());
        }
        return z;
    }

    public void A02(int i) {
        C18740tg.A0F(!this.A01.A0L(), "Companion device should not call SyncdDeleteAllDataHandler.markSyncdDirty");
        Log.i("SyncdDeleteAllDataApiHandler/markSyncdDirty");
        C237119n r1 = this.A04;
        r1.A03(i);
        if (i == 1) {
            C237119n.A00(r1).edit().putLong("syncd_last_fatal_error_time", C19970wo.A00(this.A05)).apply();
        }
    }

    public void A03(boolean z) {
        String obj;
        C19730wQ r3 = this.A01;
        C18740tg.A0F(!r3.A0L(), "Companion device should not call SyncdDeleteAllDataHandler.handleDirtyState");
        synchronized (this) {
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A09.Bnx(runnable);
                this.A00 = null;
                Log.i("SyncdDeleteAllDataHandler/resetSchedule removed scheduled sync");
            }
        }
        AnonymousClass19A r6 = this.A08;
        if (!r6.A0I()) {
            obj = "SyncdDeleteAllDataApiHandler/handleDirtyState disconnected";
        } else {
            C237119n r4 = this.A04;
            if (!r4.A08()) {
                obj = "SyncdDeleteAllDataApiHandler/handleDirtyState clean in progress";
            } else {
                boolean z2 = z;
                if (z || C237119n.A00(r4).getInt("syncd_dirty", -1) < 4) {
                    r4.A05(C237119n.A00(r4).getInt("syncd_dirty", -1) + 1);
                    C236419g r2 = this.A06;
                    if (!r2.A0A().isEmpty()) {
                        Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: logoutAllCompanionDevices");
                        r2.A0D("syncd_failure", false);
                        return;
                    }
                    Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: sendDeleteAllDataIq");
                    r3.A0G();
                    if (r3.A02 != null) {
                        String A092 = r6.A09();
                        StringBuilder sb = new StringBuilder();
                        sb.append("SyncdDeleteAllDataApiHandler/sendIqWithCallback ");
                        sb.append(A092);
                        Log.i(sb.toString());
                        String str = new AnonymousClass390(A092).A01;
                        AnonymousClass6QB r22 = new AnonymousClass6QB("iq");
                        r22.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                        r22.A04(new AnonymousClass1AL("xmlns", "w:sync:app:state"));
                        r22.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
                        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
                            r22.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
                        }
                        r22.A05(new AnonymousClass6QB("delete_all_data").A03());
                        r6.A0K(this, r22.A03(), A092, 250, 32000);
                        return;
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SyncdDeleteAllDataApiHandler/handleDirtyState shouldn't retry force=");
                sb2.append(z2);
                obj = sb2.toString();
            }
        }
        Log.w(obj);
    }

    public boolean A04() {
        int i = C237119n.A00(this.A04).getInt("syncd_dirty", -1);
        if (i == -1 || i >= 4) {
            return false;
        }
        return true;
    }

    public void BVN(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataApiHandler/onDeliveryFailure ");
        sb.append(str);
        Log.e(sb.toString());
        A01();
    }

    public void BVW(C63133Iw r3) {
        if (!this.A01.A0L()) {
            C237119n r1 = this.A04;
            if (r1.A08()) {
                Log.e("SyncdDeleteAllDataApiHandler/onDeviceRegistered: This should be rare and suggested to check more logs.");
                return;
            }
            Log.i("SyncdDeleteAllDataApiHandler/onDeviceRegistered removeLastCompanionDeregTime");
            C237119n.A00(r1).edit().remove("syncd_last_companion_dereg_time").apply();
        }
    }

    public void BVX(C20760y7 r2, int i) {
        if (!this.A01.A0L() && this.A04.A08()) {
            Log.i("SyncdDeleteAllDataApiHandler/onDeviceLogoutError");
            A01();
        }
    }

    public void BVa(C20760y7 r7) {
        if (!this.A01.A0L()) {
            C237119n r4 = this.A04;
            if (r4.A08()) {
                Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved");
                if (!(!this.A06.A0A().isEmpty())) {
                    for (AnonymousClass193 Bec : this.A02.getObservers()) {
                        Bec.Bec();
                    }
                    AnonymousClass1AB r5 = this.A03;
                    C44312Na r1 = new C44312Na();
                    r1.A00 = Long.valueOf((long) (C237119n.A00(r4).getInt("syncd_dirty", -1) - 1));
                    r5.A06.Bly(r1);
                }
                r4.A05(0);
                A03(false);
            } else if (this.A0A.A04(C21100yf.A1U) > 0 && !(!this.A06.A0A().isEmpty())) {
                Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved setLastCompanionDeregTime");
                C237119n.A00(r4).edit().putLong("syncd_last_companion_dereg_time", C19970wo.A00(this.A05)).apply();
            }
        }
    }

    public void BiM(C203399nx r4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataApiHandler/onSuccess ");
        sb.append(str);
        sb.append(" response: ");
        sb.append(r4);
        Log.i(sb.toString());
        this.A09.Boy(new C35671j4(this, 23));
    }

    public C25921Ie(C19730wQ r1, C21100yf r2, C25931If r3, AnonymousClass1AB r4, C237119n r5, C19970wo r6, C236419g r7, C20810yC r8, AnonymousClass19A r9, C19770wU r10) {
        this.A05 = r6;
        this.A07 = r8;
        this.A01 = r1;
        this.A09 = r10;
        this.A0A = r2;
        this.A08 = r9;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r3;
    }

    public void BWw(C203399nx r4, String str) {
        Pair A012 = AnonymousClass3ME.A01(r4);
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataApiHandler/onError ");
        sb.append(A012);
        Log.e(sb.toString());
        A01();
    }
}
