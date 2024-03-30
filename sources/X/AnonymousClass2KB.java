package X;

import android.app.Activity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.2KB  reason: invalid class name */
public final class AnonymousClass2KB extends AnonymousClass2KD {
    public final C25791Hr A00;
    public final C19970wo A01;
    public final C20310xM A02;
    public final C25121Fb A03;
    public final AnonymousClass1JN A04;
    public final C194729Qz A05;
    public final C237919w A06;
    public final AnonymousClass1FO A07;
    public final AnonymousClass3DP A08;
    public final AnonymousClass1A1 A09;
    public final C19770wU A0A;

    public void A08(Activity activity, AnonymousClass3T1 r15, C206969uL r16, int i) {
        JSONObject jSONObject;
        AnonymousClass00C.A0D(activity, 0);
        AnonymousClass3T1 r12 = r15;
        C206969uL r2 = r16;
        C36341k9.A1E(r15, 2, r2);
        if (AnonymousClass000.A1S(r15.A0A & 2097152, 2097152)) {
            C39001qm A012 = C39001qm.A01(activity, C36361kB.A0m(activity, R.string.f12nameremoved));
            A012.A0m((AnonymousClass012) activity, C67893b0.A00, R.string.f12nameremoved);
            C36341k9.A11(A012);
            return;
        }
        String str = r2.A01;
        if (str != null) {
            jSONObject = C36441kJ.A1C(str);
        } else {
            jSONObject = null;
        }
        C18740tg.A06(jSONObject);
        AnonymousClass00C.A08(jSONObject);
        int i2 = i;
        if (jSONObject.has("display_text")) {
            AnonymousClass4V7 A013 = AnonymousClass3SS.A01(activity);
            if (A013 == null) {
                Log.e("QuickReplyAction/executeTemplateAction/error: not clicked in Conversation activity");
            } else if (r15 instanceof C23043B1o) {
                AnonymousClass3P8 r22 = new AnonymousClass3P8(C203369nr.A03(r15), jSONObject.optString("display_text"), jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), "", (String) null, 1, i2, 0, false);
                A013.Bpv(r15, r22);
                A00(r15, i2);
                this.A0A.Boy(new C80513vW(r12, this, r22, i2, 7));
            }
        } else {
            AnonymousClass2cT r4 = new AnonymousClass2cT(C36411kG.A0o(r15.A1J.A00, this.A06), C19970wo.A00(this.A01));
            this.A07.A00(r4, r15);
            JSONObject put = C36441kJ.A1B().put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
            r4.A00 = new C207149ud((AnonymousClass90O) null, new C206919uD("menu_options", put.toString()), jSONObject.getString("title"));
            this.A02.A0h(r4);
            A00(r15, i2);
        }
    }

    public AnonymousClass2KB(C25791Hr r2, C19970wo r3, C20310xM r4, C25121Fb r5, AnonymousClass1JN r6, C194729Qz r7, C237919w r8, AnonymousClass1FO r9, AnonymousClass3DP r10, AnonymousClass1A1 r11, C19770wU r12) {
        C36321k7.A1B(r3, r12, r10, r4, r11);
        C36361kB.A1J(r8, 6, r5);
        C36361kB.A1K(r6, r2);
        this.A01 = r3;
        this.A0A = r12;
        this.A08 = r10;
        this.A02 = r4;
        this.A09 = r11;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = r2;
    }

    private final void A00(AnonymousClass3T1 r3, int i) {
        C207089uX r0;
        C206569tc r1;
        if (C203369nr.A08(r3)) {
            C81333wq.A00(this.A0A, r3, this, i, 20);
            return;
        }
        C207219uk BA8 = ((C23043B1o) r3).BA8();
        if (BA8 != null && (r0 = BA8.A04) != null && (r1 = (C206569tc) C007103b.A0P(r0.A03, i)) != null) {
            r1.A00 = true;
            this.A02.A0k(r3);
        }
    }

    public int A03() {
        return R.drawable.ic_action_reply;
    }

    public boolean A0C(C20810yC r2, AnonymousClass8SX r3) {
        return C36351kA.A1Z(r2);
    }
}
