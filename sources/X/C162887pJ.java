package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7pJ  reason: invalid class name and case insensitive filesystem */
public class C162887pJ extends AIB {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162887pJ(Context context, C29221Vu r2, C19640wH r3, Object obj, Object obj2, int i) {
        super(context, r2, r3);
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public ArrayList A04(C203399nx r8) {
        if (1 - this.A02 != 0) {
            return super.A04(r8);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = r8.A0j("error").iterator();
        while (it.hasNext()) {
            C203399nx A0s = C36431kI.A0s(it);
            if (A0s != null) {
                String A0i = A0s.A0i("code", (String) null);
                String A0i2 = A0s.A0i("text", (String) null);
                String A0i3 = A0s.A0i("auth-ticket-fp", (String) null);
                if (A0i != null) {
                    int parseInt = Integer.parseInt(A0i);
                    C202059ky r0 = new C202059ky();
                    r0.A00 = parseInt;
                    r0.A07 = A0i2;
                    r0.A05 = A0i3;
                    A0I.add(r0);
                }
            }
        }
        return A0I;
    }

    public void A05(C202059ky r3) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass644) this.A01).A00();
                return;
            case 1:
                StringBuilder A0i = C36341k9.A0i(r3);
                A0i.append("PAY: MFAAction/onRequestError - ");
                A0i.append("CREATE_AUTH_TICKET_BASED_FACTOR");
                C36321k7.A1L(r3, ": ", A0i);
                ((C119915qf) this.A00).A00.BWi(new C130696Mb(r3));
                return;
            default:
                BrazilPayBloksActivity.A0G((AnonymousClass6C8) this.A01, (BrazilPayBloksActivity) this.A00);
                return;
        }
    }

    public void A06(C202059ky r3) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass644) this.A01).A00();
                return;
            case 1:
                StringBuilder A0i = C36341k9.A0i(r3);
                A0i.append("PAY: MFAAction/onResponseError - ");
                A0i.append("CREATE_AUTH_TICKET_BASED_FACTOR");
                C36321k7.A1J(r3, ": ", A0i);
                ((C119915qf) this.A00).A00.BWi(new C130696Mb(r3));
                return;
            default:
                BrazilPayBloksActivity.A0G((AnonymousClass6C8) this.A01, (BrazilPayBloksActivity) this.A00);
                return;
        }
    }

    public void A07(C203399nx r15) {
        AnonymousClass00I r1;
        switch (this.A02) {
            case 0:
                C203399nx A0c = r15.A0c("account");
                if (A0c == null || !"1".equals(C36391kE.A0x(A0c, "cancel-status"))) {
                    ((AnonymousClass644) this.A01).A00();
                    return;
                }
                AnonymousClass644 r12 = (AnonymousClass644) this.A01;
                C202629mK r0 = r12.A03;
                C19770wU r2 = r0.A08;
                C19970wo r4 = r0.A01;
                AnonymousClass1DQ r5 = r0.A02;
                AnonymousClass1EU r10 = r0.A06;
                C237919w r11 = r0.A07;
                AnonymousClass1VZ r6 = r0.A03;
                C29121Vk r9 = r0.A05;
                C202319lY r7 = r12.A01;
                UserJid userJid = r12.A02;
                C22956Az8 az8 = r12.A04;
                Objects.requireNonNull(az8);
                C36331k8.A1F(new C183708rE(r4, r5, r6, r7, userJid, r9, r10, r11, new AVX(az8, 1), 18), r2);
                return;
            case 1:
                AnonymousClass00C.A0D(r15, 0);
                C119915qf r42 = (C119915qf) this.A00;
                AnonymousClass00C.A0D(r42, 1);
                C203399nx A0c2 = r15.A0c("account");
                if (A0c2 != null) {
                    try {
                        C202059ky A012 = C202059ky.A01(A0c2);
                        if (A012 != null) {
                            r1 = C36441kJ.A0W((Object) null, A012);
                        } else {
                            C203399nx A0c3 = A0c2.A0c("auth-ticket");
                            if (A0c3 == null) {
                                r1 = C36441kJ.A0W((Object) null, new C202059ky(9));
                            } else {
                                A0c3.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                A0c3.A0U("issued-at");
                                A0c3.A0U("ttl");
                                C117645mb r102 = new C117645mb();
                                C203399nx[] r92 = A0c3.A0d("capabilities").A02;
                                if (r92 != null) {
                                    for (C203399nx r13 : r92) {
                                        r13.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                        r13.A0U("ttl");
                                        r102.A00.add(new C111215bv());
                                    }
                                }
                                r1 = C36441kJ.A0W(r102, (Object) null);
                            }
                        }
                    } catch (C235919b e) {
                        Log.e("PAY: parseResult corruptStreamException", e);
                        r1 = C36441kJ.A0W((Object) null, new C202059ky(9));
                    }
                } else {
                    r1 = C36441kJ.A0W((Object) null, new C202059ky(9));
                }
                if (r1.A00 != null) {
                    try {
                        C24601Db r52 = r42.A01.A03.A00;
                        String A06 = r52.A06();
                        if (!TextUtils.isEmpty(A06)) {
                            JSONObject A1C = C36441kJ.A1C(A06);
                            JSONObject A0t = C90474aD.A0t("td", A1C);
                            A0t.put("td_is_committed", true);
                            r52.A0K(C90484aE.A0l(A0t, "td", A1C));
                        }
                        r42.A00.onResult(C36441kJ.A11());
                        return;
                    } catch (JSONException e2) {
                        Log.e("PAY: TrustedDeviceKeyStore markCommitted failed", e2);
                        throw e2;
                    } catch (JSONException e3) {
                        C36321k7.A1J(e3, "PAY: MultiFactorAuthFactors/createTrustedDevice/error while marking trusted device as commited: ", AnonymousClass000.A0u());
                        r42.A00.BWi(new C130696Mb(0));
                        return;
                    }
                } else {
                    C159617je r22 = r42.A00;
                    Object obj = r1.A01;
                    C18740tg.A06(obj);
                    r22.BWi(new C130696Mb((C202059ky) obj));
                    return;
                }
            default:
                HashMap A0J = AnonymousClass001.A0J();
                try {
                    C203399nx A0d = r15.A0d("account");
                    if (C202059ky.A01(A0d) != null) {
                        BrazilPayBloksActivity.A0G((AnonymousClass6C8) this.A01, (BrazilPayBloksActivity) this.A00);
                        return;
                    }
                    if ("1".equals(C36391kE.A0x(A0d.A0d("result"), "upload_status"))) {
                        A0J.put("is_doc_upload_completed", "1");
                        ((AnonymousClass6C8) this.A01).A01("on_success", A0J);
                        return;
                    }
                    BrazilPayBloksActivity.A0G((AnonymousClass6C8) this.A01, (BrazilPayBloksActivity) this.A00);
                    return;
                } catch (C235919b e4) {
                    ((C179158jJ) this.A00).A0M.A0A("PAY: performAnswerDocUploadStepUp : invalid response", e4);
                }
        }
    }
}
