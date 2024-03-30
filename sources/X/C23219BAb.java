package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.BAb  reason: case insensitive filesystem */
public class C23219BAb implements C236119d {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23219BAb(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void BVN(String str) {
        switch (this.A02) {
            case 0:
                Log.e("EmailVerificationXmppMethods/sendRequestForEmail/onDeliveryFailure/delivery failure");
                ((B10) this.A00).BXN((Integer) null);
                return;
            case 1:
                Log.e("EmailVerificationXmppMethods/sendRequestForEmailOtp/onDeliveryFailure/delivery failure");
                ((B11) this.A01).BXO((Integer) null, (Long) null);
                return;
            case 2:
                Log.e("EmailVerificationXmppMethods/sendRequestToSetEmail/onDeliveryFailure/delivery failure");
                ((B12) this.A01).BXN((Integer) null);
                return;
            case 3:
                Log.e("EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/onDeliveryFailure/delivery failure");
                ((B13) this.A01).BXO((Integer) null, (Long) null);
                return;
            default:
                ((AnonymousClass9Nc) this.A01).A00 = false;
                return;
        }
    }

    public void BWw(C203399nx r7, String str) {
        Long l;
        Long l2;
        switch (this.A02) {
            case 0:
                int A05 = C165597tg.A05(r7);
                C36321k7.A1S("EmailVerificationXmppMethods/sendRequestForEmail/onError/", AnonymousClass000.A0u(), A05);
                ((B10) this.A00).BXN(Integer.valueOf(A05));
                return;
            case 1:
                AnonymousClass00C.A0D(r7, 1);
                int A002 = AnonymousClass3ME.A00(r7);
                C36321k7.A1S("EmailVerificationXmppMethods/sendRequestForEmailOtp/onError/", AnonymousClass000.A0u(), A002);
                try {
                    C203539oF.A0B(r7, new C23212B9u(C90514aH.A0e(r7, (C592133b) this.A00), 1));
                    C22993Azj[] azjArr = new C22993Azj[4];
                    azjArr[0] = AIF.A00;
                    azjArr[1] = AIG.A00;
                    azjArr[2] = AIH.A00;
                    C22834Awj awj = (C22834Awj) C203379ns.A06(r7, "IQErrorEmailTooMany|IQErrorEmailTooRecent|IQErrorInternalServerError|IQErrorForbidden", C165567td.A0d(AII.A00, azjArr, 3), C165607th.A1a());
                    if (awj instanceof C185078tT) {
                        C185078tT r1 = (C185078tT) awj;
                        if (r1.A01 == 0) {
                            AnonymousClass00C.A0E(awj, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailTooManyMixin");
                            l2 = (Long) r1.A00;
                        } else {
                            AnonymousClass00C.A0E(awj, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailTooRecentMixin");
                            l2 = (Long) r1.A00;
                        }
                    } else {
                        l2 = null;
                    }
                    ((B11) this.A01).BXO(Integer.valueOf(A002), l2);
                    return;
                } catch (C235919b e) {
                    C36321k7.A1J(e, "EmailVerificationXmppMethods/sendRequestForEmailOtp/CorruptStreamException: ", AnonymousClass000.A0u());
                    ((B11) this.A01).BXO((Integer) null, (Long) null);
                    throw C165617ti.A0Q(AnonymousClass000.A0l(e, "EmailVerificationXmppMethods: ", AnonymousClass000.A0u()));
                }
            case 2:
                int A052 = C165597tg.A05(r7);
                C36321k7.A1S("EmailVerificationXmppMethods/sendRequestToSetEmail/onError/", AnonymousClass000.A0u(), A052);
                ((B12) this.A01).BXN(Integer.valueOf(A052));
                return;
            case 3:
                AnonymousClass00C.A0D(r7, 1);
                int A003 = AnonymousClass3ME.A00(r7);
                C36321k7.A1S("EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/onError/", AnonymousClass000.A0u(), A003);
                try {
                    C203539oF.A0B(r7, new C23212B9u(C90514aH.A0e(r7, (C592133b) this.A00), 5));
                    C22993Azj[] azjArr2 = new C22993Azj[4];
                    azjArr2[0] = AIK.A00;
                    azjArr2[1] = AIL.A00;
                    azjArr2[2] = AIM.A00;
                    C22835Awk awk = (C22835Awk) C203379ns.A06(r7, "IQErrorEmailOTPStale|IQErrorEmailGuessTooRecent|IQErrorInternalServerError|IQErrorForbidden", C165567td.A0d(AIN.A00, azjArr2, 3), C165607th.A1a());
                    if (awk instanceof AnonymousClass8tV) {
                        AnonymousClass8tV r12 = (AnonymousClass8tV) awk;
                        if (r12.A01 == 1) {
                            AnonymousClass00C.A0E(awk, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailOTPStaleMixin");
                            l = (Long) r12.A00;
                        } else {
                            AnonymousClass00C.A0E(awk, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailGuessTooRecentMixin");
                            l = (Long) r12.A00;
                        }
                    } else {
                        l = null;
                    }
                    ((B13) this.A01).BXO(Integer.valueOf(A003), l);
                    return;
                } catch (C235919b e2) {
                    C36321k7.A1J(e2, "EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/CorruptStreamException: ", AnonymousClass000.A0u());
                    ((B13) this.A01).BXO((Integer) null, (Long) null);
                    throw C165617ti.A0Q(AnonymousClass000.A0l(e2, "EmailVerificationXmppMethods: ", AnonymousClass000.A0u()));
                }
            default:
                C36341k9.A0u(C19420v0.A00(((AnonymousClass9Nc) this.A01).A02), "1on1_invite_code_from_referrer");
                return;
        }
    }

    public void BiM(C203399nx r16, String str) {
        String str2;
        C203399nx r8 = r16;
        switch (this.A02) {
            case 0:
                AnonymousClass00C.A0D(r8, 1);
                Log.i("EmailVerificationXmppMethods/sendRequestForEmail/success");
                try {
                    ArrayList arrayList = C186028vI.A00;
                    C203399nx A0e = C90514aH.A0e(r8, (C592133b) this.A01);
                    String A0A = C203379ns.A0A(r8, C186028vI.A00, new String[]{"email", "verified", "#elementValue"});
                    C203539oF.A0B(r8, new C23212B9u(A0e, 0));
                    C183998rj r1 = (C183998rj) C203379ns.A02(r8, AIE.A00, new String[]{"email", "email_address"});
                    B10 b10 = (B10) this.A00;
                    if (r1 != null) {
                        str2 = r1.A00;
                    } else {
                        str2 = null;
                    }
                    b10.BiF(str2, AnonymousClass00C.A0J(A0A, "true"));
                    return;
                } catch (C235919b e) {
                    C36321k7.A1J(e, "EmailVerificationXmppMethods/sendRequestForEmail/CorruptStreamException: ", AnonymousClass000.A0u());
                    ((B10) this.A00).BXN((Integer) null);
                    throw C165617ti.A0Q(AnonymousClass000.A0l(e, "EmailVerificationXmppMethods: ", AnonymousClass000.A0u()));
                }
            case 1:
                AnonymousClass00C.A0D(r8, 1);
                Log.i("EmailVerificationXmppMethods/sendRequestForEmailOtp/success");
                try {
                    C203399nx A0e2 = C90514aH.A0e(r8, (C592133b) this.A00);
                    Long A0t = C36411kG.A0t();
                    Long A0Q = C165567td.A0Q();
                    Number number = (Number) C203379ns.A00.A0Z(r8, Long.class, A0t, A0Q, (Object) null, new String[]{"verify_email", "wait_time", "#elementValue"}, false);
                    C203539oF.A0A(A0e2, r8, 2);
                    AnonymousClass00C.A08(number);
                    ((B11) this.A01).Bi1(number.longValue());
                    return;
                } catch (C235919b e2) {
                    C36321k7.A1J(e2, "EmailVerificationXmppMethods/sendRequestForEmailOtp/CorruptStreamException: ", AnonymousClass000.A0u());
                    ((B11) this.A01).BXO((Integer) null, (Long) null);
                    throw C165617ti.A0Q(AnonymousClass000.A0l(e2, "EmailVerificationXmppMethods: ", AnonymousClass000.A0u()));
                }
            case 2:
                AnonymousClass00C.A0D(r8, 1);
                Log.i("EmailVerificationXmppMethods/sendRequestToSetEmail/success");
                try {
                    ArrayList arrayList2 = C186038vJ.A00;
                    C203399nx A0e3 = C90514aH.A0e(r8, (C592133b) this.A00);
                    String A0A2 = C203379ns.A0A(r8, C186038vJ.A00, new String[]{"email", "do_verify", "#elementValue"});
                    C203539oF.A0C(r8, new C23212B9u(A0e3, 3));
                    ((B12) this.A01).BiJ(AnonymousClass00C.A0J(A0A2, "true"));
                    return;
                } catch (C235919b e3) {
                    C36321k7.A1J(e3, "EmailVerificationXmppMethods/sendRequestToSetEmail/CorruptStreamException: ", AnonymousClass000.A0u());
                    ((B12) this.A01).BXN((Integer) null);
                    throw C165617ti.A0Q(AnonymousClass000.A0l(e3, "EmailVerificationXmppMethods: ", AnonymousClass000.A0u()));
                }
            case 3:
                AnonymousClass00C.A0D(r8, 1);
                Log.i("EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/success");
                try {
                    ArrayList arrayList3 = C186048vK.A00;
                    C203399nx A0e4 = C90514aH.A0e(r8, (C592133b) this.A00);
                    Long A0t2 = C36411kG.A0t();
                    Long A0Q2 = C165567td.A0Q();
                    Number number2 = (Number) C203379ns.A00.A0Z(r8, Long.class, A0t2, A0Q2, (Object) null, new String[]{"verify_email", "wait_time", "#elementValue"}, false);
                    String A0A3 = C203379ns.A0A(r8, C186048vK.A00, new String[]{"verify_email", "code_match", "#elementValue"});
                    C203539oF.A0A(A0e4, r8, 6);
                    boolean A0J = AnonymousClass00C.A0J(A0A3, "true");
                    AnonymousClass00C.A08(number2);
                    ((B13) this.A01).BiQ(number2.longValue(), A0J);
                    return;
                } catch (C235919b e4) {
                    C36321k7.A1J(e4, "EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/CorruptStreamException: ", AnonymousClass000.A0u());
                    ((B13) this.A01).BXO((Integer) null, (Long) null);
                    throw C165617ti.A0Q(AnonymousClass000.A0l(e4, "EmailVerificationXmppMethods: ", AnonymousClass000.A0u()));
                }
            default:
                AnonymousClass00C.A0D(r8, 1);
                C203399nx A0e5 = C90514aH.A0e(r8, (C592133b) this.A00);
                AnonymousClass11F r6 = (AnonymousClass11F) C203539oF.A07(r8, UserJid.class, C165567td.A0P(), C165567td.A0Q(), (Object) null, new String[]{"invite", "sender", PublicKeyCredentialControllerUtility.JSON_KEY_USER}, false);
                C203539oF.A0B(r8, C23213B9v.A00(A0e5, 4));
                if (r6 != null) {
                    AnonymousClass9Nc r5 = (AnonymousClass9Nc) this.A01;
                    if (!r5.A03.A0M(r6)) {
                        r5.A04.A0h(new C181068ms(C36411kG.A0o(r6, r5.A06.A01), C19970wo.A00(r5.A01)));
                        C36341k9.A0x(C19420v0.A00(r5.A02), "1on1_invite_sender", r6.getRawString());
                    }
                }
                C36341k9.A0u(C19420v0.A00(((AnonymousClass9Nc) this.A01).A02), "1on1_invite_code_from_referrer");
                return;
        }
    }
}
