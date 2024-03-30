package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8oX  reason: invalid class name and case insensitive filesystem */
public class C182098oX extends C195969Wz {
    public final C199709fp A00;
    public final AnonymousClass1VO A01;
    public final AnonymousClass1VT A02;
    public final List A03;

    public C182098oX(C19700wN r7, C20810yC r8, C21010yW r9, C199709fp r10, AnonymousClass1VO r11, AnonymousClass1VT r12, List list, Map map) {
        super(r7, r8, r9, r10, map);
        this.A01 = r11;
        this.A02 = r12;
        this.A03 = list;
        this.A00 = r10;
    }

    public void A01(C203399nx r14) {
        C22947Ayz ayz;
        AnonymousClass9Kk r4;
        Handler handler;
        int i;
        Message obtain;
        AnonymousClass9Kk r42;
        C203399nx[] r43;
        int i2 = 0;
        C203399nx A0b = r14.A0b(0);
        if (C203399nx.A0I(A0b, "offline_preview")) {
            int A0S = A0b.A0S("message", 0);
            int A0S2 = A0b.A0S("receipt", 0);
            int A0S3 = A0b.A0S("notification", 0);
            C199709fp r2 = this.A00;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ConnectionThreadRequestsImpl/offline-preview messages=");
            A0u.append(A0S);
            A0u.append("; receipts = ");
            A0u.append(A0S2);
            C36321k7.A1T("; notifications = ", A0u, A0S3);
            ayz = r2.A00;
            Bundle A07 = AnonymousClass001.A07();
            A07.putInt("messageCount", A0S);
            A07.putInt("receiptCount", A0S2);
            A07.putInt("notificationCount", A0S3);
            obtain = Message.obtain((Handler) null, 0, 259, 0, A07);
        } else if (C203399nx.A0I(A0b, "offline")) {
            String A0x = C36391kE.A0x(A0b, "count");
            if (A0x != null) {
                try {
                    C199709fp r22 = this.A00;
                    int parseInt = Integer.parseInt(A0x);
                    C36321k7.A1T("ConnectionThreadRequestsImpl/offline-complete count=", AnonymousClass000.A0u(), parseInt);
                    C22947Ayz ayz2 = r22.A00;
                    Bundle A072 = AnonymousClass001.A07();
                    A072.putInt("messageCount", parseInt);
                    C165577te.A18(ayz2, A072, 15);
                    Iterator it = this.A03.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass001.A0A("onOfflineCompleteReceived");
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (C203399nx.A0I(A0b, "dirty")) {
                C199709fp r5 = this.A00;
                C203399nx[] r1 = r14.A02;
                C18740tg.A06(r1);
                C18740tg.A0B(AnonymousClass000.A1O(r1.length));
                C203399nx r12 = r1[0];
                C18740tg.A0B(C203399nx.A0I(r12, "dirty"));
                String A0x2 = C36391kE.A0x(r12, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                C18740tg.A06(A0x2);
                if ("account_sync".equals(A0x2) && (r43 = r12.A02) != null) {
                    HashSet A16 = C36441kJ.A16();
                    for (C203399nx r0 : r43) {
                        A16.add(r0.A00);
                    }
                    r42 = new AnonymousClass9Kk((Long) null, A0x2, A16);
                } else if ("syncd_app_state".equals(A0x2)) {
                    String A0x3 = C36391kE.A0x(r12, "timestamp");
                    Long l = null;
                    if (A0x3 != null) {
                        try {
                            l = Long.valueOf(Long.parseLong(A0x3));
                        } catch (Exception unused2) {
                            C36321k7.A1P("Timestamp is not a number: ", A0x3, AnonymousClass000.A0u());
                        }
                    }
                    r42 = new AnonymousClass9Kk(l, A0x2, Collections.emptySet());
                } else {
                    r42 = new AnonymousClass9Kk((Long) null, A0x2, Collections.emptySet());
                }
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("onDirty/category=");
                C36321k7.A1a(A0u2, r42.A01);
                ayz = r5.A00;
                handler = null;
                i = 8;
                r4 = r42;
            } else if (C203399nx.A0I(A0b, "streamdebug")) {
                String A0i = A0b.A0i("ip", (String) null);
                String A0i2 = A0b.A0i("reconnect", (String) null);
                String A0i3 = A0b.A0i("stanzalogcount", (String) null);
                if (A0i3 != null) {
                    i2 = Integer.parseInt(A0i3);
                }
                boolean equals = "1".equals(A0i2);
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("ConnectionThreadRequestsImpl/stream/debug host=");
                A0u3.append(A0i);
                A0u3.append(" reconnect=");
                A0u3.append(equals);
                C36321k7.A1T(" size=", A0u3, i2);
                return;
            } else if (C203399nx.A0I(A0b, "location")) {
                Jid A0X = r14.A0X(UserJid.class, "from");
                if (A0b != null) {
                    C203399nx A0b2 = A0b.A0b(0);
                    if (A0b2 == null || !"enc".equals(A0b2.A00)) {
                        throw C165617ti.A0Q("invalid location node");
                    }
                    AnonymousClass630 A002 = C111475cL.A00(A0b2);
                    String A0x4 = C36391kE.A0x(A0b, "elapsed");
                    long j = 0;
                    if (A0x4 != null) {
                        j = (long) Integer.parseInt(A0x4);
                    }
                    C199709fp r23 = this.A00;
                    C36321k7.A1K(A0X, "ConnectionThreadRequestsImpl/on-location-update jid=", AnonymousClass000.A0u());
                    C22947Ayz ayz3 = r23.A00;
                    Message obtain2 = Message.obtain((Handler) null, 0, 117, 0, A002);
                    Bundle data = obtain2.getData();
                    C1900296p.A00(data, A0X, "jid");
                    data.putLong("elapsed", j);
                    ayz3.Bkm(obtain2);
                    return;
                }
                throw C165617ti.A0Q("Missing location node");
            } else if (C203399nx.A0I(A0b, "sonar")) {
                String A0h = A0b.A0h("url");
                C199709fp r24 = this.A00;
                C36321k7.A1Q("ConnectionThreadRequestsImpl/sonar url=", A0h, AnonymousClass000.A0u());
                ayz = r24.A00;
                handler = null;
                i = 101;
                r4 = A0h;
            } else if (C203399nx.A0I(A0b, "edge_routing")) {
                C203399nx A0c = A0b.A0c("routing_info");
                if (A0c != null && !TextUtils.isEmpty(A0c.A0e())) {
                    this.A02.A00(A0c.A01);
                    return;
                }
                return;
            } else if (C203399nx.A0I(A0b, "fbip")) {
                String A0e = A0b.A0e();
                if (A0e != null) {
                    this.A01.A02(A0e.split(","));
                    return;
                }
                return;
            } else if (C203399nx.A0I(A0b, "client_expiration")) {
                long A0V = A0b.A0V("t", -1);
                C199709fp r44 = this.A00;
                if (A0V != -1) {
                    A0V *= 1000;
                }
                Log.i("ConnectionThreadRequestsImpl/on-expiration-change");
                C22947Ayz ayz4 = r44.A00;
                Bundle A073 = AnonymousClass001.A07();
                A073.putLong("timestampMs", A0V);
                C165577te.A18(ayz4, A073, 159);
                return;
            } else if (C203399nx.A0I(A0b, PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION)) {
                this.A00.A02(A0b.A0h("nonce"), A0b.A0h("key"));
                return;
            } else if (C203399nx.A0I(A0b, "gpia")) {
                C203399nx[] r52 = A0b.A02;
                if (r52 != null) {
                    int length = r52.length;
                    while (i2 < length) {
                        C203399nx r13 = r52[i2];
                        if (C203399nx.A0I(r13, "request")) {
                            C165577te.A18(this.A00.A00, r13.A0h("nonce"), 254);
                        }
                        i2++;
                    }
                    return;
                }
                return;
            } else if (C203399nx.A0I(A0b, "safetynet")) {
                C203399nx[] r11 = A0b.A02;
                if (r11 != null) {
                    int length2 = r11.length;
                    while (i2 < length2) {
                        C203399nx r15 = r11[i2];
                        if (C203399nx.A0I(r15, PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION)) {
                            this.A00.A02(r15.A0h("nonce"), r15.A0h("key"));
                        } else if (C203399nx.A0I(r15, "verify_apps")) {
                            int A003 = C203399nx.A00(r15, "count");
                            C199709fp r16 = this.A00;
                            Log.i("ConnectionThreadRequestsImpl/on-safetynet-verifyapps-request");
                            C22947Ayz ayz5 = r16.A00;
                            Message obtain3 = Message.obtain((Handler) null, 0, 223, 0);
                            obtain3.getData().putInt("maxAppsCount", A003);
                            ayz5.Bkm(obtain3);
                        }
                        i2++;
                    }
                    return;
                }
                return;
            } else if (C203399nx.A0I(A0b, "peer_device_presence")) {
                C199709fp r45 = this.A00;
                boolean equalsIgnoreCase = "true".equalsIgnoreCase(A0b.A0h("presence"));
                C36321k7.A1X("ConnectionThreadRequestsImpl/on-peer-device-presence=", AnonymousClass000.A0u(), equalsIgnoreCase);
                ayz = r45.A00;
                obtain = Message.obtain((Handler) null, 0, 215, equalsIgnoreCase ? 1 : 0);
            } else if (C203399nx.A0I(A0b, "thread_metadata")) {
                this.A00.A01(r14, (C207209uj) null, 257);
                return;
            } else {
                C20810yC r25 = this.A02;
                if (!r25.A0E(366) && C203399nx.A0I(A0b, "notice")) {
                    List A0j = r14.A0j("notice");
                    ArrayList A0I = AnonymousClass001.A0I();
                    Iterator it2 = A0j.iterator();
                    while (it2.hasNext()) {
                        C203399nx A0s = C36431kI.A0s(it2);
                        int A004 = C203399nx.A00(A0s, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        int A005 = C203399nx.A00(A0s, "stage");
                        long A0W = 1000 * A0s.A0W(A0s.A0h("t"), "t");
                        int A006 = C203399nx.A00(A0s, "version");
                        int A0S4 = A0s.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 0);
                        if (A0S4 < 0 || A0S4 > 2 || A005 <= -1 || A005 >= 1000) {
                            C36321k7.A1U("ibstanzahandler/parseusernoticemetadatalist invalid user notice meta data id = ", AnonymousClass000.A0u(), A004);
                        } else {
                            A0I.add(new C65613Su(A004, A005, A006, A0W, A0S4));
                        }
                    }
                    C199709fp r17 = this.A00;
                    Log.i("ConnectionThreadRequestsImpl/on-user-notice-received");
                    C165577te.A18(r17.A00, A0I, 216);
                    return;
                } else if (r25.A0E(877) && C203399nx.A0I(A0b, "tos")) {
                    this.A00.A01(A0b, (C207209uj) null, 249);
                    return;
                } else {
                    return;
                }
            }
            obtain = Message.obtain(handler, 0, i, 0, r4);
        }
        ayz.Bkm(obtain);
    }
}
