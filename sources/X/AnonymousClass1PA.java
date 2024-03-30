package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1PA  reason: invalid class name */
public class AnonymousClass1PA {
    public static final AnonymousClass1AL[] A05 = new AnonymousClass1AL[0];
    public final C20810yC A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final C19700wN A04;

    public AnonymousClass777 A00(AnonymousClass11F r10, AnonymousClass11F r11, AnonymousClass630 r12, String str, int i) {
        AnonymousClass19A r3 = this.A01;
        String A0A = r3.A0A();
        C203399nx r2 = new C203399nx(new C203399nx(C132906Vt.A00(r12, i), "location", r11 == null ? new AnonymousClass1AL[]{new AnonymousClass1AL("final", str)} : new AnonymousClass1AL[]{new AnonymousClass1AL("final", str), new AnonymousClass1AL((Jid) r11, "context")}), "notification", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0A), new AnonymousClass1AL((Jid) r10, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location")});
        AnonymousClass9YT r0 = new AnonymousClass9YT();
        r0.A05 = "notification";
        r0.A08 = "location";
        r0.A02 = r10;
        r0.A07 = A0A;
        return r3.A07(r2, r0.A01(), 188);
    }

    public void A01(Jid jid, String str, int i) {
        C203399nx r2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass1AL(jid, "to"));
        arrayList.add(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        if (i == 0) {
            arrayList.add(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "result"));
            r2 = null;
        } else {
            arrayList.add(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "error"));
            r2 = new C203399nx("error", new AnonymousClass1AL[]{new AnonymousClass1AL("code", Integer.toString(i))});
        }
        C203399nx r3 = new C203399nx(r2, "iq", (AnonymousClass1AL[]) arrayList.toArray(A05));
        AnonymousClass19A r22 = this.A01;
        AnonymousClass19J r1 = r22.A01;
        if (r1.A06 && r1.A04 == 2) {
            AnonymousClass19A.A02(C54772tW.A00(r3, (Boolean) null, (String) null, 225, false, true), r22, false);
        }
    }

    public void A02(C1259561z r13) {
        AnonymousClass11F r1;
        AnonymousClass19A r5 = this.A01;
        String A09 = r5.A09();
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSubscriptionSendMethods/subscribe; iqId=");
        sb.append(A09);
        Log.i(sb.toString());
        C203399nx r3 = new C203399nx("subscribe", r13.A01 ? new AnonymousClass1AL[]{new AnonymousClass1AL("participants", "true")} : null);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09));
        arrayList.add(new AnonymousClass1AL("xmlns", "location"));
        arrayList.add(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
        String str = "to";
        if (C20800yB.A01(C21000yV.A02, this.A00, 4177)) {
            arrayList.add(new AnonymousClass1AL((Jid) C177588e2.A00, str));
            r1 = r13.A00;
            str = "target";
        } else {
            r1 = r13.A00;
        }
        arrayList.add(new AnonymousClass1AL((Jid) r1, str));
        r5.A0E(new C165467tT(this, r13, 1), new C203399nx(r3, "iq", (AnonymousClass1AL[]) arrayList.toArray(A05)), A09, 82, 32000);
    }

    public void A03(AnonymousClass630 r8, String str, long j) {
        AnonymousClass1AL[] r0;
        StringBuilder sb = new StringBuilder();
        sb.append("sendmethods/sendLocation elapsed=");
        sb.append(j);
        Log.i(sb.toString());
        C203399nx A002 = C132906Vt.A00(r8, 0);
        ArrayList arrayList = new ArrayList();
        if (j != 0) {
            arrayList.add(new AnonymousClass1AL("elapsed", Long.toString(j)));
        }
        if (str != null) {
            arrayList.add(new AnonymousClass1AL("liveloc_mode", str));
        }
        if (arrayList.isEmpty()) {
            r0 = A05;
        } else {
            r0 = (AnonymousClass1AL[]) arrayList.toArray(new AnonymousClass1AL[0]);
        }
        this.A01.A0G(new C203399nx(new C203399nx(A002, "location", r0), "ib", (AnonymousClass1AL[]) null), 84);
    }

    public AnonymousClass1PA(C19700wN r1, C20810yC r2, AnonymousClass19A r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        this.A00 = r2;
        this.A04 = r1;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
