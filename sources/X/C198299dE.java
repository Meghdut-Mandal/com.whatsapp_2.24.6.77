package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.9dE  reason: invalid class name and case insensitive filesystem */
public class C198299dE {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C207119ua A07;
    public final C199359fB A08;
    public final C197219bK A09;
    public final C197609bz A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public C198299dE(AnonymousClass16T r5, C199359fB r6, C186248ve r7, String str) {
        int i;
        this.A08 = r6;
        this.A0D = str;
        this.A0F = r7.A0B;
        this.A04 = r7.A03.longValue();
        this.A0E = r7.A0A;
        this.A06 = r7.A05.longValue();
        this.A0B = r7.A06;
        this.A0C = r7.A08;
        this.A05 = r7.A04.longValue();
        String str2 = r7.A09;
        if (str2.equalsIgnoreCase("active")) {
            i = 0;
        } else if (str2.equalsIgnoreCase("inactive")) {
            i = 1;
        } else if (str2.equalsIgnoreCase("archived")) {
            i = 2;
        } else {
            throw C165567td.A0G("invalid state for offer: ", str2, AnonymousClass000.A0u());
        }
        this.A03 = i;
        C184308sE r3 = r7.A00;
        C199449fK r2 = new C199449fK();
        r2.A02 = r5.A01(r3.A01);
        r2.A01 = Long.parseLong(r3.A03);
        r2.A00 = Integer.parseInt(r3.A02);
        this.A07 = r2.A01();
        C184038rn r0 = r7.A01;
        C18740tg.A06(r0);
        this.A09 = new C197219bK(r5, (C184308sE) r0.A00);
        this.A0A = new C197609bz(r7.A07, r7.A02);
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = false;
    }

    public C198299dE(String str) {
        JSONObject A1C = C36441kJ.A1C(str);
        this.A03 = A1C.getInt("state");
        this.A04 = A1C.getLong("end_ts");
        this.A0F = A1C.getString("title");
        this.A0D = A1C.getString("locale");
        this.A06 = A1C.getLong("start_ts");
        this.A0E = A1C.getString("terms_url");
        this.A05 = (long) A1C.getInt("redeem_limit");
        this.A0B = A1C.getString("description");
        this.A0C = A1C.getString("fine_print_url");
        this.A02 = A1C.getBoolean("interactive_sync_done");
        this.A00 = A1C.getInt("kill_switch_info_viewed");
        this.A01 = A1C.getInt("sender_maxed_info_viewed");
        this.A08 = new C199359fB(A1C.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        C199449fK r1 = new C199449fK();
        r1.A02 = AnonymousClass16W.A06;
        r1.A01();
        this.A07 = new C199449fK(C36441kJ.A1C(A1C.getString("offer_amount"))).A01();
        this.A09 = new C197219bK(A1C.getString("payment"));
        this.A0A = new C197609bz(A1C.getString("receiver"));
    }
}
