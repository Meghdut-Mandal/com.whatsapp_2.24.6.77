package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;

/* renamed from: X.1Zr  reason: invalid class name and case insensitive filesystem */
public class C30221Zr implements C236319f {
    public final AnonymousClass189 A00;
    public final AnonymousClass1P5 A01;
    public final AnonymousClass1PA A02;
    public final C19700wN A03;
    public final AnonymousClass187 A04;
    public final C19770wU A05;

    public int[] BCF() {
        return new int[]{117, 206};
    }

    public void A00(UserJid userJid, AnonymousClass630 r10, long j) {
        StringBuilder sb;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LiveLocationXmppMessageHandler/on-location-update; jid=");
        UserJid userJid2 = userJid;
        sb2.append(userJid);
        sb2.append("; elapsed=");
        long j2 = j;
        sb2.append(j);
        Log.i(sb2.toString());
        AnonymousClass630 r4 = r10;
        int i = r10.A01;
        if (i != 2) {
            sb = new StringBuilder();
            str = "LiveLocationXmppMessageHandler/invalid ciphertext version; ciphertextVersion=";
        } else {
            i = r10.A00;
            if (i != 3) {
                sb = new StringBuilder();
                str = "LiveLocationXmppMessageHandler/invalid ciphertext type; ciphertextType=";
            } else {
                if (this.A00.A0X()) {
                    this.A05.Boy(new C35331iW(this, userJid2, r4, 2, j2));
                    return;
                }
                AnonymousClass187 r0 = this.A04;
                r0.A00.execute(new C35331iW(this, userJid2, r4, 3, j2));
                return;
            }
        }
        sb.append(str);
        sb.append(i);
        Log.w(sb.toString());
    }

    public boolean BJl(Message message, int i) {
        if (i == 117) {
            Bundle data = message.getData();
            String string = data.getString("jid");
            A00((UserJid) Jid.Companion.A02(string), (AnonymousClass630) message.obj, data.getLong("elapsed"));
            return true;
        } else if (i != 206) {
            return false;
        } else {
            C203399nx r2 = (C203399nx) message.obj;
            String A0i = r2.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            int i2 = 0;
            C203399nx A0b = r2.A0b(0);
            Jid A0X = r2.A0X(Jid.class, "from");
            C18740tg.A06(A0X);
            if (C203399nx.A0I(A0b, "start")) {
                String A0i2 = A0b.A0i("duration", (String) null);
                long j = 0;
                if (A0i2 != null) {
                    j = Long.parseLong(A0i2);
                }
                AnonymousClass1P5 r7 = this.A01;
                C222713q r0 = AnonymousClass11F.A00;
                AnonymousClass11F A002 = C222713q.A00(A0X);
                C18740tg.A06(A002);
                long j2 = j * 1000;
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingManager/onStartLocationReporting; jid=");
                sb.append(A002);
                sb.append("; duration=");
                sb.append(j2);
                Log.i(sb.toString());
                if (r7.A0f(A002)) {
                    Context context = r7.A0E.A00;
                    LocationSharingService.A01(context, new Intent(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_LOCATION_REPORTING").putExtra("duration", j2));
                    synchronized (r7.A0P) {
                        r7.A00 = 2 | r7.A00;
                    }
                    i2 = 0;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("LocationSharingManager/onStartLocationReporting/sharing not enabled; jid=");
                    sb2.append(A002);
                    Log.w(sb2.toString());
                    i2 = 401;
                }
            } else if (C203399nx.A0I(A0b, "stop")) {
                this.A01.A0R();
            } else if (!C203399nx.A0I(A0b, "enable")) {
                this.A02.A01(A0X, A0i, 501);
                return true;
            }
            this.A02.A01(A0X, A0i, i2);
            return true;
        }
    }

    public C30221Zr(C19700wN r1, AnonymousClass189 r2, AnonymousClass187 r3, AnonymousClass1P5 r4, AnonymousClass1PA r5, C19770wU r6) {
        this.A03 = r1;
        this.A05 = r6;
        this.A04 = r3;
        this.A00 = r2;
        this.A02 = r5;
        this.A01 = r4;
    }
}
