package com.whatsapp.companiondevice;

import X.AnonymousClass001;
import X.AnonymousClass1MX;
import X.AnonymousClass2ZQ;
import X.AnonymousClass3A2;
import X.AnonymousClass3LZ;
import X.AnonymousClass3SB;
import X.AnonymousClass3UM;
import X.AnonymousClass9ZV;
import X.C07700Yy;
import X.C18740tg;
import X.C18830tt;
import X.C19420v0;
import X.C236419g;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C52782qA;
import X.C56042vd;
import X.C65743Th;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CompanionDeviceVerificationReceiver extends AnonymousClass1MX {
    public AnonymousClass2ZQ A00;
    public C19420v0 A01;
    public C236419g A02;
    public final Object A03;
    public volatile boolean A04;

    public void A00(Context context) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    C18830tt.APH(C56042vd.A00(context), this);
                    this.A04 = true;
                }
            }
        }
    }

    public void A01(Context context, Intent intent) {
        List asList;
        String str;
        String A0t = C36371kC.A0t(C36341k9.A0E(this.A01), "companion_device_verification_ids");
        if (A0t != null && (asList = Arrays.asList(A0t.split(","))) != null) {
            Iterator it = asList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String A0C = AnonymousClass001.A0C(it);
                C236419g r1 = this.A02;
                DeviceJid nullable = DeviceJid.getNullable(A0C);
                C18740tg.A06(nullable);
                AnonymousClass3SB A002 = C236419g.A00(r1, nullable);
                if (A002 != null) {
                    Iterator A0s = C36361kB.A0s(this.A00);
                    while (A0s.hasNext()) {
                        AnonymousClass3A2 r2 = (AnonymousClass3A2) A0s.next();
                        Context context2 = r2.A01.A00;
                        String string = context2.getString(R.string.f12nameremoved);
                        String A003 = AnonymousClass3UM.A00(r2.A03, A002.A05);
                        Object[] A0M = AnonymousClass001.A0M();
                        if (A002.A08 == C52782qA.VR) {
                            str = context2.getString(R.string.f12nameremoved);
                        } else {
                            str = A002.A09;
                        }
                        A0M[0] = str;
                        String A0v = C36391kE.A0v(context2, A003, A0M, 1, R.string.f12nameremoved);
                        C07700Yy A0F = C36421kH.A0F(context2);
                        A0F.A0G(string);
                        A0F.A0F(string);
                        A0F.A0E(A0v);
                        AnonymousClass9ZV.A00(A002.A07);
                        A0F.A0D = C65743Th.A00(context2, 0, AnonymousClass3LZ.A01(context2, 4), 0);
                        C36341k9.A14(A0F, A0v);
                        A0F.A0I(true);
                        A0F.A0B.icon = R.drawable.notify_web_client_connected;
                        r2.A02.A02(21, A0F.A05());
                    }
                }
            }
        } else {
            Log.e("CompanionDeviceVerificationReceiver/onReceive/ deviceIds are missing from prefs");
        }
        C36341k9.A0u(C19420v0.A00(this.A01), "companion_device_verification_ids");
        PendingIntent A012 = C65743Th.A01(context, 0, intent, 536870912);
        if (A012 != null) {
            A012.cancel();
        }
    }

    public CompanionDeviceVerificationReceiver(int i) {
        this.A04 = false;
        this.A03 = C36441kJ.A11();
    }

    public void onReceive(Context context, Intent intent) {
        A00(context);
        super.onReceive(context, intent);
    }

    public CompanionDeviceVerificationReceiver() {
        this(0);
    }
}
