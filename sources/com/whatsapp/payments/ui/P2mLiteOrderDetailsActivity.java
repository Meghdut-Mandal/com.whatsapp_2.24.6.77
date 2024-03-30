package com.whatsapp.payments.ui;

import X.AF6;
import X.AVY;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16J;
import X.AnonymousClass16V;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1A1;
import X.AnonymousClass1A5;
import X.AnonymousClass1CF;
import X.AnonymousClass1DR;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1VZ;
import X.AnonymousClass1XC;
import X.AnonymousClass2bZ;
import X.AnonymousClass3DY;
import X.AnonymousClass3LW;
import X.AnonymousClass3UJ;
import X.AnonymousClass61B;
import X.AnonymousClass627;
import X.AnonymousClass6EW;
import X.AnonymousClass736;
import X.AnonymousClass9RT;
import X.AnonymousClass9SC;
import X.AnonymousClass9UH;
import X.AnonymousClass9UZ;
import X.AnonymousClass9ZG;
import X.B3K;
import X.B7Z;
import X.C000400e;
import X.C007103b;
import X.C128166Be;
import X.C131376Ou;
import X.C131606Ps;
import X.C147616xV;
import X.C147626xW;
import X.C162097o1;
import X.C165567td;
import X.C165587tf;
import X.C165617ti;
import X.C167747yk;
import X.C180398lj;
import X.C188008yt;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C1900996w;
import X.C193649Mh;
import X.C194219Oo;
import X.C194509Pz;
import X.C195389Uc;
import X.C19770wU;
import X.C19970wo;
import X.C199969gL;
import X.C20310xM;
import X.C203619oP;
import X.C203639oR;
import X.C206319t7;
import X.C207119ua;
import X.C207199ui;
import X.C207219uk;
import X.C207959xO;
import X.C20810yC;
import X.C21060yb;
import X.C21302AGg;
import X.C222813r;
import X.C22533AoF;
import X.C23043B1o;
import X.C24601Db;
import X.C24881Ed;
import X.C27111My;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C64933Qa;
import X.C89794Xx;
import X.C90484aE;
import X.C90494aF;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class P2mLiteOrderDetailsActivity extends AnonymousClass155 implements B3K {
    public AnonymousClass3DY A00;
    public AnonymousClass16D A01;
    public AnonymousClass185 A02;
    public AnonymousClass171 A03;
    public AnonymousClass1A5 A04;
    public C20310xM A05;
    public AnonymousClass16J A06;
    public AnonymousClass1VZ A07;
    public C24881Ed A08;
    public AnonymousClass1CF A09;
    public C24601Db A0A;
    public AnonymousClass1DR A0B;
    public AnonymousClass1EV A0C;
    public AnonymousClass1EU A0D;
    public AnonymousClass1XC A0E;
    public C195389Uc A0F;
    public AnonymousClass9RT A0G;
    public AF6 A0H;
    public AnonymousClass61B A0I;
    public C21302AGg A0J;
    public AnonymousClass9UZ A0K;
    public C180398lj A0L;
    public AnonymousClass9UH A0M;
    public AnonymousClass1FR A0N;
    public C199969gL A0O;
    public AnonymousClass1A1 A0P;
    public C32681e1 A0Q;
    public AnonymousClass6EW A0R;
    public C131376Ou A0S;
    public Integer A0T;
    public WeakReference A0U;
    public List A0V;
    public AnonymousClass004 A0W;
    public AnonymousClass141 A0X;
    public boolean A0Y;
    public final C194509Pz A0Z;

    public static final void A0G(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, AnonymousClass2bZ r9, String str) {
        C39001qm A002 = AnonymousClass3LW.A00(p2mLiteOrderDetailsActivity);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        A002.A0r(false);
        AnonymousClass2bZ r6 = r9;
        A002.A0g(new C89794Xx(p2mLiteOrderDetailsActivity, r6, str, 1), R.string.f12nameremoved);
        A002.A0h(new C89794Xx(p2mLiteOrderDetailsActivity, r6, str, 2), R.string.f12nameremoved);
        String A0m = C36361kB.A0m(p2mLiteOrderDetailsActivity, R.string.f12nameremoved);
        C131606Ps A003 = AnonymousClass9ZG.A00();
        A003.A03("payments_error_code", "10755");
        A003.A03("payments_error_text", A0m);
        A07(A003, p2mLiteOrderDetailsActivity, r6, (Integer) null, "error_dialog", str, 0);
        A002.A0b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0.intValue() != 1) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0H(com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r8, X.AnonymousClass2bZ r9, boolean r10) {
        /*
            r2 = r9
            if (r9 == 0) goto L_0x0032
            X.9uk r0 = r9.A00
            if (r0 == 0) goto L_0x0023
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0023
            X.9uP r0 = r0.A09
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r0.A01
            int r0 = X.C207199ui.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0023
            int r0 = r0.intValue()
            r6 = 4
            if (r0 == r1) goto L_0x0025
        L_0x0023:
            r6 = 11
        L_0x0025:
            X.9gL r1 = r8.A0O
            if (r1 == 0) goto L_0x0033
            r7 = 1
            r3 = 0
            r9 = 0
            r5 = r3
            r8 = r10
            r4 = r3
            r1.A02(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0032:
            return
        L_0x0033:
            java.lang.String r0 = "orderDetailsMessageLogging"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A0H(com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity, X.2bZ, boolean):void");
    }

    public final void A3l(String str, String str2, String str3) {
        C162097o1 r2;
        C203619oP r1;
        AnonymousClass61B r0 = this.A0I;
        if (r0 != null) {
            C203639oR A002 = r0.A00(str);
            if (A002 == null || (r1 = A002.A00) == null) {
                r2 = null;
            } else {
                r2 = (C162097o1) r1.A0A("native_p2m_lite_compliance");
            }
            AnonymousClass011[] r12 = new AnonymousClass011[2];
            C36341k9.A1J("account_compliance_status", str2, r12, 0);
            C36341k9.A1J("last_screen", str3, r12, 1);
            LinkedHashMap A072 = C000400e.A07(r12);
            if (r2 != null) {
                r2.B7N(A072);
                return;
            }
            return;
        }
        throw C36331k8.A0d("phoenixManagerRegistry");
    }

    public boolean BMo() {
        return false;
    }

    public void BUH(C207119ua r1, AnonymousClass11F r2, AnonymousClass9SC r3, C23043B1o b1o) {
    }

    public void Bbz(C188008yt r12, C194219Oo r13) {
        C1900996w.A00(this);
        this.A04.Bp1(new AnonymousClass736(this, r12, r13, 28));
        A3j().A05.A02(this, this.A02, r12, r13, A3j().A08, (List) null, 4, r13.A00);
    }

    public void Bc0(C188008yt r1, C194219Oo r2) {
    }

    public void BgH(C207119ua r11) {
        String str;
        String str2;
        Integer num;
        List<C206319t7> list;
        AnonymousClass11F r0;
        AnonymousClass00C.A0D(r11, 0);
        LinkedHashMap A1G = C36431kI.A1G();
        String str3 = A3j().A0B;
        String str4 = A3j().A0C;
        AnonymousClass141 r02 = this.A0X;
        if (r02 == null || (r0 = r02.A0H) == null) {
            str = null;
        } else {
            str = r0.getRawString();
        }
        if (str3 != null && str4 != null && str != null) {
            A1G.put("action", "start");
            A1G.put("order_id", str3);
            A1G.put("order_message_id", A3j().A07.A01);
            double doubleValue = r11.A02.A00.doubleValue();
            int i = r11.A00;
            A1G.put("order_amount", Long.valueOf((long) (doubleValue * ((double) i))));
            A1G.put("order_amount_offset", Integer.valueOf(i));
            A1G.put("order_currency", ((AnonymousClass16V) r11.A01).A02);
            if (A3j().A00 != 0) {
                A1G.put("order_expiration_timestamp", Long.valueOf(A3j().A00));
            }
            A1G.put("order_payment_config", str4);
            A1G.put("seller_jid", str);
            A1G.put("request_id", C36361kB.A0l());
            A1G.put("referral", "order_details");
            Integer num2 = this.A0T;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (1 == intValue) {
                    str2 = "digital-goods";
                } else if (2 == intValue) {
                    str2 = "physical-goods";
                } else {
                    str2 = "unknown";
                }
            } else {
                str2 = "unknown";
            }
            A1G.put("order_type", str2);
            if (this.A0D.A0E(3012) && (num = this.A0T) != null && 2 == num.intValue() && (list = this.A0V) != null) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (C206319t7 r5 : list) {
                    JSONObject A1B = C36441kJ.A1B();
                    A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r5.A04);
                    A1B.put("address_line1", r5.A00);
                    String str5 = r5.A01;
                    if (str5.length() != 0) {
                        A1B.put("address_line2", str5);
                    }
                    String str6 = r5.A02;
                    if (str6.length() != 0) {
                        A1B.put("city", str6);
                    }
                    String str7 = r5.A06;
                    if (str7.length() != 0) {
                        A1B.put("state", str7);
                    }
                    A1B.put("country", r5.A03);
                    A1B.put("postal_code", r5.A05);
                    A0I2.add(A1B);
                }
                A1G.put("order_beneficiaries", C007103b.A0Q(", ", "", "", C36371kC.A11(A0I2), C22533AoF.A00));
            }
            C128166Be r7 = new C128166Be("p2m_lite_checkout", (String) null, A1G);
            Bu1(R.string.f12nameremoved);
            C24601Db r03 = this.A0A;
            if (r03 != null) {
                C36331k8.A0w(C90494aF.A0E(r03), "has_p2mlite_account", true);
                AnonymousClass004 r04 = this.A0W;
                if (r04 != null) {
                    ((AnonymousClass627) r04.get()).A00(new C147616xV(this), new C147626xW(this), r7, "order_details", (Map) null);
                    return;
                }
                throw C36331k8.A0d("paymentsPhoenixManager");
            }
            throw C36331k8.A0d("paymentSharedPrefs");
        }
    }

    public static final void A01(WaFragment waFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2, AnonymousClass2bZ r6, String str, String str2, int i) {
        if (i == 10755) {
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A1b();
            }
            A0G(p2mLiteOrderDetailsActivity, r6, str2);
            p2mLiteOrderDetailsActivity.A3l(str, "BLOCKED", "enter_dob");
        } else if (i != 10756) {
            if (waFragment instanceof P2mLiteConfirmLegalNameBottomSheetFragment) {
                ((ConfirmLegalNameBottomSheetFragment) waFragment).A1c(true);
            } else if (waFragment instanceof P2mLiteConfirmDateOfBirthBottomSheetFragment) {
                ((ConfirmDateOfBirthBottomSheetFragment) waFragment).A1b(true);
            }
            C39001qm A002 = AnonymousClass3LW.A00(p2mLiteOrderDetailsActivity);
            A002.A0r(false);
            A002.A0c(R.string.f12nameremoved);
            C165587tf.A17(A002);
            C36341k9.A11(A002);
        } else {
            A0F(p2mLiteOrderDetailsActivity, paymentBottomSheet2, r6, str, str2);
        }
    }

    public static final void A07(C131606Ps r8, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, AnonymousClass2bZ r10, Integer num, String str, String str2, int i) {
        Integer num2;
        C207219uk r0;
        C207199ui r02;
        C207219uk r03;
        C207199ui r04;
        AF6 af6 = p2mLiteOrderDetailsActivity.A0H;
        if (af6 != null) {
            String str3 = null;
            if (r10 == null || (r03 = r10.A00) == null || (r04 = r03.A01) == null) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(r04.A02());
            }
            String A012 = AnonymousClass9ZG.A01(num2);
            if (!(r10 == null || (r0 = r10.A00) == null || (r02 = r0.A01) == null)) {
                str3 = r02.A05();
            }
            af6.A01(r8, num, str, str2, A012, str3, i, true);
            return;
        }
        throw C36331k8.A0d("p2mLiteEventLogger");
    }

    public void A2F() {
        if (!this.A0Y) {
            this.A0Y = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C165567td.A11(r2, this);
            C18830tt r3 = r2.A00;
            C165567td.A0v(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A0Q = C36351kA.A0p(r3);
            this.A00 = (AnonymousClass3DY) r2.A7b.get();
            this.A0N = C36431kI.A0p(r2);
            this.A0M = (AnonymousClass9UH) r3.AAb.get();
            this.A01 = C36341k9.A0R(r2);
            this.A03 = C36341k9.A0S(r2);
            this.A0D = C36381kD.A0f(r2);
            this.A05 = C36371kC.A0Z(r2);
            this.A0P = C36351kA.A0n(r2);
            this.A06 = C36361kB.A0Z(r2);
            this.A0I = C165587tf.A0Y(r2);
            this.A0A = C165587tf.A0S(r2);
            this.A0H = (AF6) r3.AAT.get();
            this.A0S = C90484aE.A0a(r2);
            this.A09 = (AnonymousClass1CF) r2.A8K.get();
            this.A0G = (AnonymousClass9RT) r3.AAk.get();
            this.A0W = r3.AAl;
            this.A0C = C36371kC.A0h(r2);
            this.A07 = (AnonymousClass1VZ) r2.A6B.get();
            this.A02 = C36371kC.A0U(r2);
            this.A08 = (C24881Ed) r2.A6H.get();
            this.A0F = C165587tf.A0U(r3);
            this.A0E = (AnonymousClass1XC) r2.A6F.get();
            this.A04 = (AnonymousClass1A5) r2.A2K.get();
            this.A0O = (C199969gL) r2.AUu.get();
            this.A0B = (AnonymousClass1DR) r2.A6G.get();
            this.A0K = C27111My.A2w(A0L2);
        }
    }

    public final AnonymousClass1EU A3i() {
        AnonymousClass1EU r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("paymentsManager");
    }

    public final C21302AGg A3j() {
        C21302AGg aGg = this.A0J;
        if (aGg != null) {
            return aGg;
        }
        throw C36331k8.A0d("orderDetailsCoordinator");
    }

    public final AnonymousClass9UZ A3k() {
        AnonymousClass9UZ r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("paymentCheckoutOrderRepository");
    }

    public String BGY() {
        AnonymousClass141 r1 = this.A0X;
        if (r1 != null) {
            AnonymousClass171 r0 = this.A03;
            if (r0 != null) {
                String A0H2 = r0.A0H(r1);
                if (A0H2 == null) {
                    return "";
                }
                return A0H2;
            }
            throw C36331k8.A0d("waContactNames");
        }
        return "";
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass141 r1;
        super.onCreate(bundle);
        C19970wo r4 = this.A07;
        AnonymousClass00C.A07(r4);
        C20810yC r7 = this.A0D;
        AnonymousClass00C.A07(r7);
        C32681e1 r11 = this.A0Q;
        if (r11 != null) {
            Resources resources = getResources();
            AnonymousClass00C.A08(resources);
            AnonymousClass1FR r10 = this.A0N;
            if (r10 != null) {
                C18820ts r5 = this.A00;
                AnonymousClass00C.A07(r5);
                AnonymousClass1EU A3i = A3i();
                AnonymousClass185 r3 = this.A02;
                if (r3 != null) {
                    AnonymousClass1EV r8 = this.A0C;
                    if (r8 != null) {
                        AnonymousClass1A5 r6 = this.A04;
                        if (r6 != null) {
                            this.A0L = new C180398lj(resources, r3, r4, r5, r6, r7, r8, A3i, r10, r11);
                            C19970wo r33 = this.A07;
                            C20810yC r18 = this.A0D;
                            AnonymousClass17Y r32 = this.A05;
                            C32681e1 r15 = this.A0Q;
                            if (r15 != null) {
                                C19770wU r17 = this.A04;
                                AnonymousClass1FR r14 = this.A0N;
                                if (r14 != null) {
                                    C18820ts r16 = this.A00;
                                    AnonymousClass9UH r13 = this.A0M;
                                    if (r13 != null) {
                                        AnonymousClass16D r12 = this.A01;
                                        if (r12 != null) {
                                            AnonymousClass1EU A3i2 = A3i();
                                            C20310xM r112 = this.A05;
                                            if (r112 != null) {
                                                AnonymousClass16J r102 = this.A06;
                                                if (r102 != null) {
                                                    AnonymousClass185 r9 = this.A02;
                                                    if (r9 != null) {
                                                        AnonymousClass1EV r82 = this.A0C;
                                                        if (r82 != null) {
                                                            C24881Ed r72 = this.A08;
                                                            if (r72 != null) {
                                                                AnonymousClass1XC r62 = this.A0E;
                                                                if (r62 != null) {
                                                                    AnonymousClass1A5 r52 = this.A04;
                                                                    if (r52 != null) {
                                                                        C199969gL r42 = this.A0O;
                                                                        if (r42 != null) {
                                                                            AnonymousClass1DR r34 = this.A0B;
                                                                            if (r34 != null) {
                                                                                AnonymousClass9UZ A3k = A3k();
                                                                                C180398lj r2 = this.A0L;
                                                                                if (r2 != null) {
                                                                                    C32681e1 r30 = r15;
                                                                                    C19770wU r31 = r17;
                                                                                    C19970wo r142 = r33;
                                                                                    C18820ts r152 = r16;
                                                                                    AnonymousClass1A5 r162 = r52;
                                                                                    C20310xM r172 = r112;
                                                                                    AnonymousClass16J r182 = r102;
                                                                                    AnonymousClass17Y r113 = r32;
                                                                                    AnonymousClass185 r132 = r9;
                                                                                    this.A0J = new C21302AGg(r113, r12, r132, r142, r152, r162, r172, r182, r72, r18, r34, r82, A3i2, r62, A3k, r2, r13, r14, r42, r30, r31);
                                                                                    A3j().A08 = "p2m_lite";
                                                                                    C19970wo r43 = this.A07;
                                                                                    AnonymousClass00C.A07(r43);
                                                                                    C20810yC r63 = this.A0D;
                                                                                    AnonymousClass00C.A07(r63);
                                                                                    C19770wU r133 = this.A04;
                                                                                    AnonymousClass00C.A07(r133);
                                                                                    C21060yb r35 = this.A08;
                                                                                    AnonymousClass00C.A07(r35);
                                                                                    AnonymousClass16J r53 = this.A06;
                                                                                    if (r53 != null) {
                                                                                        AnonymousClass185 r22 = this.A02;
                                                                                        if (r22 != null) {
                                                                                            AnonymousClass1DR r83 = this.A0B;
                                                                                            if (r83 != null) {
                                                                                                AnonymousClass9UZ A3k2 = A3k();
                                                                                                C64933Qa A022 = AnonymousClass3UJ.A02(getIntent());
                                                                                                Objects.requireNonNull(A022);
                                                                                                AnonymousClass1FR r114 = this.A0N;
                                                                                                if (r114 != null) {
                                                                                                    A3j().A00(this, this, (C167747yk) C165617ti.A0A(new C207959xO(r22, r35, r43, r53, r63, (UserJid) null, r83, A3i(), A3k2, r114, A022, r133, false, false), this).A00(C167747yk.class));
                                                                                                    C222813r r19 = UserJid.Companion;
                                                                                                    UserJid A002 = C222813r.A00(A3j().A07.A00);
                                                                                                    if (A002 != null) {
                                                                                                        AnonymousClass1A5 r110 = this.A04;
                                                                                                        if (r110 != null) {
                                                                                                            r1 = r110.A01(A002);
                                                                                                        } else {
                                                                                                            throw C36331k8.A0d("conversationContactManager");
                                                                                                        }
                                                                                                    } else {
                                                                                                        r1 = null;
                                                                                                    }
                                                                                                    this.A0X = r1;
                                                                                                    C36321k7.A0P(this);
                                                                                                    setContentView((View) A3j().A05);
                                                                                                    return;
                                                                                                }
                                                                                                throw C36331k8.A0d("paymentsUtils");
                                                                                            }
                                                                                            throw C36331k8.A0d("paymentTransactionObservers");
                                                                                        }
                                                                                        throw C36331k8.A0d("verifiedNameManager");
                                                                                    }
                                                                                    throw C36331k8.A0d("messageObservers");
                                                                                }
                                                                                throw C36331k8.A0d("viewConfigurationFactory");
                                                                            }
                                                                            throw C36331k8.A0d("paymentTransactionObservers");
                                                                        }
                                                                        throw C36331k8.A0d("orderDetailsMessageLogging");
                                                                    }
                                                                    throw C36331k8.A0d("conversationContactManager");
                                                                }
                                                                throw C36331k8.A0d("paymentTransactionActions");
                                                            }
                                                            throw C36331k8.A0d("paymentTransactionStore");
                                                        }
                                                        throw C36331k8.A0d("paymentsGatingManager");
                                                    }
                                                    throw C36331k8.A0d("verifiedNameManager");
                                                }
                                                throw C36331k8.A0d("messageObservers");
                                            }
                                            throw C36331k8.A0d("coreMessageStore");
                                        }
                                        throw C36331k8.A0d("contactManager");
                                    }
                                    throw C36331k8.A0d("paymentIntents");
                                }
                                throw C36331k8.A0d("paymentsUtils");
                            }
                            throw C36331k8.A0b();
                        }
                        throw C36331k8.A0d("conversationContactManager");
                    }
                    throw C36331k8.A0d("paymentsGatingManager");
                }
                throw C36331k8.A0d("verifiedNameManager");
            }
            throw C36331k8.A0d("paymentsUtils");
        }
        throw C36331k8.A0b();
    }

    public P2mLiteOrderDetailsActivity(int i) {
        this.A0Y = false;
        B7Z.A00(this, 45);
    }

    public static final void A0F(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, AnonymousClass2bZ r12, String str, String str2) {
        C207219uk r0;
        C207199ui r02;
        C207219uk r03;
        C207199ui r04;
        Integer num = null;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity2 = p2mLiteOrderDetailsActivity;
        A07(AnonymousClass9ZG.A00(), p2mLiteOrderDetailsActivity2, r12, (Integer) null, "enter_dob", str2, 0);
        String str3 = null;
        if (!(r12 == null || (r03 = r12.A00) == null || (r04 = r03.A01) == null)) {
            num = Integer.valueOf(r04.A02());
        }
        String A012 = AnonymousClass9ZG.A01(num);
        if (!(r12 == null || (r0 = r12.A00) == null || (r02 = r0.A01) == null)) {
            str3 = r02.A05();
        }
        P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = new P2mLiteConfirmDateOfBirthBottomSheetFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("extra_payment_config_id", str3);
        A072.putString("extra_order_type", A012);
        p2mLiteConfirmDateOfBirthBottomSheetFragment.A17(A072);
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        p2mLiteConfirmDateOfBirthBottomSheetFragment.A07 = new C193649Mh(p2mLiteConfirmDateOfBirthBottomSheetFragment, p2mLiteOrderDetailsActivity, paymentBottomSheet2, r12, str);
        if (paymentBottomSheet2 == null) {
            PaymentBottomSheet paymentBottomSheet3 = new PaymentBottomSheet();
            p2mLiteOrderDetailsActivity2.A0U = AnonymousClass001.A0F(paymentBottomSheet3);
            paymentBottomSheet3.A02 = p2mLiteConfirmDateOfBirthBottomSheetFragment;
            p2mLiteOrderDetailsActivity2.Btm(paymentBottomSheet3);
            return;
        }
        paymentBottomSheet2.A1n(p2mLiteConfirmDateOfBirthBottomSheetFragment);
    }

    public /* synthetic */ boolean BLF() {
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass6EW r0 = this.A0R;
        if (r0 != null) {
            r0.A04(this);
        }
        this.A0R = null;
    }

    public void onResume() {
        super.onResume();
        this.A04.Bp1(new AVY(this, 29));
    }

    public P2mLiteOrderDetailsActivity() {
        this(0);
        this.A0Z = new C194509Pz(this);
    }
}
