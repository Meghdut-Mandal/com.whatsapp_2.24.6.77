package com.whatsapp.payments.ui;

import X.AE9;
import X.AF3;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass16S;
import X.AnonymousClass16T;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1C4;
import X.AnonymousClass1EV;
import X.AnonymousClass1XA;
import X.AnonymousClass1Z2;
import X.AnonymousClass3LW;
import X.AnonymousClass3U8;
import X.AnonymousClass60P;
import X.AnonymousClass627;
import X.AnonymousClass645;
import X.AnonymousClass646;
import X.AnonymousClass65A;
import X.AnonymousClass6C8;
import X.AnonymousClass6VG;
import X.AnonymousClass6VM;
import X.AnonymousClass6W0;
import X.AnonymousClass8b7;
import X.AnonymousClass97E;
import X.AnonymousClass9F4;
import X.AnonymousClass9I4;
import X.AnonymousClass9RT;
import X.AnonymousClass9SJ;
import X.AnonymousClass9SR;
import X.AnonymousClass9SX;
import X.AnonymousClass9UG;
import X.B7Y;
import X.B83;
import X.C1033354w;
import X.C105775Gc;
import X.C111495cN;
import X.C116645kv;
import X.C117705mh;
import X.C122285ub;
import X.C123925xJ;
import X.C1255560i;
import X.C1258161j;
import X.C1264363y;
import X.C1265064h;
import X.C1265764o;
import X.C1271267b;
import X.C147236wt;
import X.C158027fg;
import X.C159757js;
import X.C163297py;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C175798b4;
import X.C175858bB;
import X.C178368fp;
import X.C179158jJ;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C195219Sy;
import X.C196039Xk;
import X.C197619c0;
import X.C198129cx;
import X.C199109ei;
import X.C200049gU;
import X.C200959iX;
import X.C201219j5;
import X.C201269jE;
import X.C201649k3;
import X.C202199lE;
import X.C203449o2;
import X.C203559oI;
import X.C207249un;
import X.C21118A9d;
import X.C21162AAw;
import X.C21251AEh;
import X.C21256AEm;
import X.C21669AUm;
import X.C23147B7h;
import X.C23157B7r;
import X.C24631De;
import X.C25471Gl;
import X.C27111My;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C29231Vv;
import X.C32971eV;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C39001qm;
import X.C90484aE;
import X.C90504aG;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public class BrazilPayBloksActivity extends C179158jJ implements C159757js {
    public C1264363y A00;
    public AnonymousClass6C8 A01;
    public C1255560i A02;
    public AnonymousClass16T A03;
    public C207249un A04;
    public AnonymousClass16S A05;
    public AnonymousClass19A A06;
    public C201269jE A07;
    public C178368fp A08;
    public AE9 A09;
    public AnonymousClass6VM A0A;
    public AnonymousClass1EV A0B;
    public AnonymousClass645 A0C;
    public C1265764o A0D;
    public AnonymousClass9F4 A0E;
    public C195219Sy A0F;
    public AnonymousClass9I4 A0G;
    public AnonymousClass627 A0H;
    public C32971eV A0I;
    public C201219j5 A0J;
    public C105775Gc A0K;
    public C201649k3 A0L;
    public C199109ei A0M;
    public C202199lE A0N;
    public AnonymousClass9UG A0O;
    public String A0P;
    public boolean A0Q;

    public static int A07(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!((C21669AUm) list.get(i)).A0C) {
                return i;
            }
        }
        return -1;
    }

    public static void A0H(AnonymousClass6C8 r8, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        AnonymousClass17Y r3 = brazilPayBloksActivity.A05;
        new AnonymousClass9SX(brazilPayBloksActivity, brazilPayBloksActivity.A03, r3, brazilPayBloksActivity.A03, brazilPayBloksActivity.A06, brazilPayBloksActivity.A08, new C23147B7h(r8, brazilPayBloksActivity, 0), str).A00();
    }

    public static void A0I(AnonymousClass6C8 r11, BrazilPayBloksActivity brazilPayBloksActivity, String str, List list, List list2, int i) {
        List list3 = list;
        AnonymousClass6C8 r6 = r11;
        int i2 = i;
        if (i2 >= list.size()) {
            r6.A00("on_failure");
            return;
        }
        C1265764o r3 = brazilPayBloksActivity.A0D;
        File file = (File) list.get(i2);
        C25471Gl r1 = C25471Gl.A0a;
        C123925xJ r5 = new C123925xJ(r6, brazilPayBloksActivity, str, list2, list3, i2);
        Context context = r3.A01;
        AnonymousClass17Y r8 = r3.A02;
        C29121Vk r10 = r3.A05;
        C29221Vu r9 = r3.A04;
        C200049gU r112 = r3.A06;
        AnonymousClass9SR r62 = new AnonymousClass9SR(context, r8, r9, r10, r112, "DOC-UPLOAD");
        AF3 A012 = r112.A01("FB", "DOC-UPLOAD");
        if (A012 != null) {
            r3.A00(A012, r5, r1, file);
        } else {
            r62.A00(new C147236wt(r3, r5, r1, file), "FB");
        }
    }

    public static void A0J(AnonymousClass6C8 r23, BrazilPayBloksActivity brazilPayBloksActivity, Map map, int i) {
        String str;
        String str2;
        Map map2 = map;
        String A0M2 = C179158jJ.A0M("full_name", map2);
        String replaceAll = C179158jJ.A0O("tax_id", map2).replaceAll("[^\\d]", "");
        BrazilPayBloksActivity brazilPayBloksActivity2 = brazilPayBloksActivity;
        PhoneUserJid A0j = C36411kG.A0j(brazilPayBloksActivity2);
        if (A0j == null) {
            str = null;
        } else {
            str = A0j.user;
        }
        C18740tg.A06(str);
        String replaceAll2 = AnonymousClass3U8.A01(C203559oI.A00(), str).replaceAll("[^\\d]", "");
        String replaceAll3 = C179158jJ.A0M("address_postal_code", map2).replaceAll("[^\\d]", "");
        String A1A = C36431kI.A1A("address_street_name", map2);
        String A1A2 = C36431kI.A1A("address_city", map2);
        String A1A3 = C36431kI.A1A("address_state", map2);
        String A1A4 = C36431kI.A1A("address_houe_number", map2);
        String A1A5 = C36431kI.A1A("address_extra_line", map2);
        String A1A6 = C36431kI.A1A("address_neighborhood", map2);
        String A0l = C90504aG.A0l("fds_manager_id", C179158jJ.A0h(brazilPayBloksActivity2));
        String A022 = brazilPayBloksActivity2.A09.A02("onboarding_context");
        if (!brazilPayBloksActivity2.A0D.A0E(2928) || !"p2m_context".equals(A022)) {
            str2 = null;
        } else {
            str2 = "SAVE_KYC_DATA";
        }
        AnonymousClass17Y r7 = brazilPayBloksActivity2.A05;
        C29131Vl r11 = brazilPayBloksActivity2.A0T;
        C198129cx r5 = new C198129cx(brazilPayBloksActivity2, r7, brazilPayBloksActivity2.A08, brazilPayBloksActivity2.A0C, brazilPayBloksActivity2.A0J, r11, A0M2, replaceAll, replaceAll2, A1A, A1A4, A1A5, A1A6, A1A2, A1A3, replaceAll3);
        C21251AEh aEh = new C21251AEh(r23, brazilPayBloksActivity2, A022, A0l, map2, i);
        C200049gU r112 = r5.A05;
        AF3 A012 = r112.A01("FB", "KYC");
        if (A012 == null || !A012.A05.equalsIgnoreCase("FB")) {
            new AnonymousClass9SR(r5.A01, r5.A02, r5.A03, r5.A04, r112, "KYC").A00(new C21256AEm(r5, aEh, str2), "FB");
            return;
        }
        C198129cx.A00(r5, aEh, A012, str2);
    }

    public static void A0L(C21669AUm aUm, Map map) {
        String str;
        String str2;
        map.put("card_verify_identifier", aUm.A03);
        String str3 = aUm.A0B;
        map.put("card_verify_type", str3);
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1302107194:
                    if (!str3.equals("customer-service")) {
                        return;
                    }
                    break;
                case -119226117:
                    if (str3.equals("app-to-app")) {
                        map.put("app_to_app_partner_app_name", aUm.A06);
                        map.put("app_to_app_partner_app_package", aUm.A07);
                        map.put("app_to_app_partner_intent_action", aUm.A08);
                        map.put("app_to_app_request_payload", aUm.A09);
                        break;
                    } else {
                        return;
                    }
                case 110379:
                    if (str3.equals("otp")) {
                        map.put("card_verify_otp_type", aUm.A05);
                        map.put("card_verify_otp_resend_interval_sec", String.valueOf(aUm.A01));
                        map.put("card_verify_otp_receiver_info", aUm.A04);
                        int i = aUm.A00;
                        map.put("otp_length", String.valueOf(i));
                        map.put("remaining_validates", String.valueOf(1));
                        StringBuilder A0u = AnonymousClass000.A0u();
                        for (int i2 = 0; i2 < i; i2++) {
                            A0u.append("#  ");
                        }
                        str = A0u.toString().trim();
                        str2 = "otp_mask";
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            str = aUm.A0A;
            str2 = "support_phone_number";
            map.put(str2, str);
        }
    }

    public void A2F() {
        if (!this.A0Q) {
            this.A0Q = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r3 = A0L2.A5g;
            C165567td.A11(r3, this);
            C18830tt r1 = r3.A00;
            C165567td.A0v(r3, r1, this, C36321k7.A05(r3, r1, this));
            this.A07 = C36351kA.A0g(r3);
            this.A01 = (C1258161j) r3.ACA.get();
            this.A02 = (AnonymousClass6W0) r1.A8y.get();
            this.A06 = r3.A3f();
            this.A00 = (AnonymousClass60P) A0L2.A3V.get();
            this.A04 = C27111My.A0J(A0L2);
            this.A08 = C27111My.A02(A0L2);
            this.A05 = (AnonymousClass1C4) r3.A7e.get();
            this.A0X = C90484aE.A0a(r3);
            this.A0G = (AnonymousClass9SJ) r1.AAu.get();
            this.A0U = (C117705mh) r3.Acz.get();
            this.A0W = C36331k8.A0I(r3);
            this.A0F = C36381kD.A0f(r3);
            this.A0T = C165587tf.A0Z(r3);
            this.A04 = C36371kC.A0Z(r3);
            this.A0Q = (C200959iX) r1.AAc.get();
            this.A00 = (C1033354w) r1.A5C.get();
            this.A01 = (C122285ub) r1.A5D.get();
            this.A0O = C165587tf.A0Y(r3);
            this.A0L = (C1271267b) r3.AVg.get();
            this.A0I = (AnonymousClass9RT) r1.AAk.get();
            this.A0A = C165587tf.A0S(r3);
            this.A0V = (C111495cN) r3.AfH.get();
            this.A07 = C165607th.A0Y(r3);
            this.A03 = C165587tf.A0N(r3);
            this.A0S = new AnonymousClass97E();
            this.A0C = C165587tf.A0T(r3);
            this.A0R = (C196039Xk) r1.AAd.get();
            this.A02 = (AnonymousClass3U8) r1.AD6.get();
            this.A0N = (AnonymousClass646) r3.ATw.get();
            this.A0D = (C24631De) C165577te.A0f(r3);
            this.A0K = C165607th.A0Z(r3);
            this.A0E = (AnonymousClass1XA) r3.A6L.get();
            this.A0H = C165587tf.A0U(r1);
            this.A08 = (C29221Vu) r3.A6A.get();
            this.A0P = (AnonymousClass6VG) r1.AAa.get();
            this.A0J = (C200049gU) r3.AW3.get();
            this.A09 = (C29231Vv) r3.AVn.get();
            this.A0B = (AnonymousClass1Z2) r3.AVu.get();
            this.A05 = (AnonymousClass16S) r3.A6x.get();
            this.A06 = C36361kB.A0c(r3);
            this.A02 = (C1255560i) r3.ABz.get();
            this.A07 = (C201269jE) r1.A5H.get();
            this.A0K = (C105775Gc) r1.A5N.get();
            this.A00 = (C1264363y) r3.ABv.get();
            this.A0H = (AnonymousClass627) r1.AAl.get();
            this.A0F = (C195219Sy) r1.A5P.get();
            this.A0J = (C201219j5) r1.A5I.get();
            this.A0B = C36371kC.A0h(r3);
            this.A0C = (AnonymousClass645) r1.AA0.get();
            this.A03 = C165587tf.A0Q(r3);
            this.A0O = (AnonymousClass9UG) r1.A5J.get();
            this.A0A = (AnonymousClass6VM) r3.ACd.get();
            this.A09 = C27111My.A2m(A0L2);
            this.A0I = (C32971eV) r3.ARQ.get();
            this.A0E = (AnonymousClass9F4) r1.A5O.get();
            this.A0N = (C202199lE) r1.A5G.get();
            this.A0L = (C201649k3) r1.A5T.get();
            this.A0M = C27111My.A2x(A0L2);
            this.A0D = (C1265764o) r1.AAj.get();
            this.A08 = (C178368fp) r1.A5L.get();
            this.A0G = (AnonymousClass9I4) r1.A5Q.get();
        }
    }

    public C158027fg A3i() {
        return new C21118A9d(this);
    }

    public AnonymousClass65A BJB() {
        return this.A00.A00(this, getSupportFragmentManager(), new C116645kv(this.A08));
    }

    public boolean BJa(int i) {
        if (i != 442) {
            return super.BJa(i);
        }
        BrazilReTosFragment brazilReTosFragment = new BrazilReTosFragment();
        brazilReTosFragment.A1p();
        Btm(brazilReTosFragment);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r10v27, types: [X.8g3] */
    /* JADX WARNING: type inference failed for: r10v28, types: [X.8g2] */
    /* JADX WARNING: type inference failed for: r8v66, types: [X.8g5] */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0384, code lost:
        X.AnonymousClass3SJ.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0387, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03a2, code lost:
        if (r6.equals(r5) == false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0a33, code lost:
        r3.A0A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0a36, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0c17, code lost:
        r0 = new java.lang.Void[0];
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0c1a, code lost:
        r3.Box(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0c1d, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlT(X.AnonymousClass6C8 r36, java.lang.String r37, java.util.Map r38) {
        /*
            r35 = this;
            r5 = r37
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r4 = ""
            r2 = r36
            if (r0 == 0) goto L_0x000f
            r2.A00(r4)
        L_0x000f:
            r8 = -1
            int r0 = r5.hashCode()
            r3 = 1
            switch(r0) {
                case -1828362259: goto L_0x020e;
                case -1789788977: goto L_0x0216;
                case -1579572125: goto L_0x021e;
                case -1326006358: goto L_0x0226;
                case -1290918873: goto L_0x0231;
                case -1265267765: goto L_0x023c;
                case -1264881022: goto L_0x0247;
                case -1236338706: goto L_0x0252;
                case -1157449815: goto L_0x025d;
                case -1017011091: goto L_0x0269;
                case -981053487: goto L_0x0275;
                case -857462632: goto L_0x0281;
                case -803962306: goto L_0x028d;
                case -641808715: goto L_0x0299;
                case -553110595: goto L_0x02a5;
                case -524241064: goto L_0x02b1;
                case -491008410: goto L_0x02bd;
                case -468036698: goto L_0x02c9;
                case -438460728: goto L_0x02d5;
                case 159220715: goto L_0x02e1;
                case 243254635: goto L_0x02ed;
                case 580608584: goto L_0x02f9;
                case 1043595284: goto L_0x0305;
                case 1410504463: goto L_0x0311;
                case 1564995942: goto L_0x031d;
                case 1684922085: goto L_0x0329;
                case 1760388972: goto L_0x0335;
                case 2069491034: goto L_0x0341;
                case 2124929861: goto L_0x034d;
                case 2146747614: goto L_0x0359;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r7 = "referral_screen"
            java.lang.String r6 = "on_success"
            r0 = r35
            r1 = r38
            switch(r8) {
                case 0: goto L_0x0365;
                case 1: goto L_0x0370;
                case 2: goto L_0x0422;
                case 3: goto L_0x0475;
                case 4: goto L_0x0a65;
                case 5: goto L_0x050f;
                case 6: goto L_0x0514;
                case 7: goto L_0x0027;
                case 8: goto L_0x042a;
                case 9: goto L_0x0632;
                case 10: goto L_0x0a9a;
                case 11: goto L_0x06a2;
                case 12: goto L_0x044f;
                case 13: goto L_0x06f3;
                case 14: goto L_0x0373;
                case 15: goto L_0x0381;
                case 16: goto L_0x07b0;
                case 17: goto L_0x0388;
                case 18: goto L_0x07f6;
                case 19: goto L_0x03ba;
                case 20: goto L_0x089a;
                case 21: goto L_0x0942;
                case 22: goto L_0x0b62;
                case 23: goto L_0x03c1;
                case 24: goto L_0x0a14;
                case 25: goto L_0x0a37;
                case 26: goto L_0x0bba;
                case 27: goto L_0x03d0;
                case 28: goto L_0x03dc;
                case 29: goto L_0x00da;
                default: goto L_0x0023;
            }
        L_0x0023:
            super.BlT(r2, r5, r1)
        L_0x0026:
            return
        L_0x0027:
            java.lang.String r4 = "cvv"
            java.lang.String r29 = X.C36431kI.A1A(r4, r1)
            java.lang.String r4 = "expiry_date"
            java.lang.String r4 = X.C179158jJ.A0M(r4, r1)
            int[] r16 = X.C179158jJ.A0l(r4)
            java.lang.String r4 = "card_number"
            java.lang.String r28 = X.C36431kI.A1A(r4, r1)
            X.0yC r4 = r0.A0D
            r1 = 1482(0x5ca, float:2.077E-42)
            boolean r1 = r4.A0E(r1)
            if (r1 == 0) goto L_0x00c2
            X.9k3 r4 = r0.A0L
            java.lang.String r1 = "generic_context"
            boolean r1 = r4.A06(r1)
            r1 = r1 ^ 1
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r1)
        L_0x0055:
            X.0wo r1 = r0.A07
            r34 = r1
            X.17Y r1 = r0.A05
            r33 = r1
            X.0wQ r1 = r0.A02
            r32 = r1
            X.0wU r1 = r0.A04
            r26 = r1
            X.19A r1 = r0.A06
            r17 = r1
            X.5mh r15 = r0.A0U
            X.1Vl r14 = r0.A0T
            X.1EU r13 = r0.A0F
            X.1Db r12 = r0.A0A
            X.5cN r11 = r0.A0V
            X.9j5 r10 = r0.A0J
            X.9Sy r9 = r0.A0F
            X.16T r8 = r0.A03
            X.1Vk r7 = r0.A0C
            X.0wD r6 = r0.A07
            X.1Vu r5 = r0.A08
            r1 = 0
            r30 = r16[r1]
            r31 = r16[r3]
            X.9Qs r4 = new X.9Qs
            r4.<init>(r2, r0)
            X.8g5 r1 = new X.8g5
            r18 = r7
            r19 = r13
            r20 = r9
            r21 = r10
            r22 = r4
            r23 = r14
            r24 = r15
            r25 = r11
            r13 = r34
            r14 = r8
            r15 = r17
            r16 = r5
            r17 = r12
            r8 = r1
            r9 = r0
            r10 = r33
            r11 = r32
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.9Sy r5 = r0.A0F
            X.9I2 r4 = new X.9I2
            r4.<init>(r1, r5)
            X.8fp r2 = r5.A0A
            r2.unregisterObserver(r4)
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00c5
            r2.registerObserver(r4)
            return
        L_0x00c2:
            r27 = 0
            goto L_0x0055
        L_0x00c5:
            X.9Ng r2 = r5.A00
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0026
            r5.A02 = r3
            r5.A00 = r2
            X.1Dc r2 = r1.A0D
            java.lang.String r0 = "sendAddCard"
            r2.A06(r0)
            X.0wU r3 = r1.A0K
            goto L_0x0c17
        L_0x00da:
            java.lang.String r3 = "card_verify_type"
            java.lang.String r4 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r3 = "app-to-app"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x01a8
            java.lang.String r3 = "otp"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = "credential_id"
            java.lang.String r17 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r3 = "card_verify_identifier"
            java.lang.String r18 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r16 = X.C165607th.A0p(r0)
            java.lang.String r3 = "card_verify_otp_resend_interval_sec"
            java.lang.String r8 = X.C36431kI.A1A(r3, r1)
            X.17Y r7 = r0.A05
            X.19A r6 = r0.A06
            X.9Sy r5 = r0.A0F
            X.16T r4 = r0.A03
            X.1Vu r3 = r0.A08
            X.9O8 r1 = new X.9O8
            r14 = r3
            r15 = r5
            r9 = r1
            r10 = r0
            r11 = r7
            r12 = r4
            r13 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.9RY r5 = new X.9RY
            r5.<init>(r2, r0, r8)
            X.19A r7 = r1.A03
            java.lang.String r6 = r7.A09()
            java.lang.String r10 = r1.A06
            java.lang.String r11 = r1.A07
            java.lang.String r4 = r1.A08
            X.9Sy r3 = r1.A05
            X.16S r0 = r3.A08
            X.9un r0 = r0.A07(r10)
            X.8b4 r0 = (X.C175798b4) r0
            if (r0 == 0) goto L_0x01a6
            int r0 = r0.A01
            r2 = 5
            if (r0 != r2) goto L_0x01a6
            X.646 r0 = r3.A0G
            java.lang.String r2 = r0.A00(r2)
            r0 = 2
            X.8uZ r3 = new X.8uZ
            r3.<init>((java.lang.String) r2, (int) r0)
        L_0x014a:
            X.6QB r2 = X.C36421kH.A0T()
            X.C165567td.A1D(r2)
            X.C203539oF.A0E(r2, r6)
            X.6QB r0 = X.C165587tf.A0a()
            java.lang.String r9 = "action"
            java.lang.String r8 = "br-select-otp-verification-method"
            X.C36331k8.A1D(r0, r9, r8)
            r12 = 1
            X.C203539oF.A0D(r0, r10)
            r14 = 1000(0x3e8, double:4.94E-321)
            r16 = 0
            boolean r8 = X.C203539oF.A0P(r11, r12, r14, r16)
            if (r8 == 0) goto L_0x0173
            java.lang.String r8 = "identifier"
            X.C36331k8.A1D(r0, r8, r11)
        L_0x0173:
            r9 = 1
            r11 = 1000(0x3e8, double:4.94E-321)
            r13 = 0
            r8 = r4
            boolean r8 = X.C203539oF.A0P(r8, r9, r11, r13)
            if (r8 == 0) goto L_0x0184
            java.lang.String r8 = "nonce"
            X.C36331k8.A1D(r0, r8, r4)
        L_0x0184:
            X.C165587tf.A1C(r0, r3)
            X.9nx r15 = X.C165567td.A0I(r0, r2)
            android.content.Context r9 = r1.A00
            X.17Y r11 = r1.A01
            X.1Vu r10 = r1.A04
            r14 = 8
            X.B7J r8 = new X.B7J
            r12 = r1
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r17 = 204(0xcc, float:2.86E-43)
            r18 = 30000(0x7530, double:1.4822E-319)
            r13 = r7
            r14 = r8
            r16 = r6
            r13.A0E(r14, r15, r16, r17, r18)
            return
        L_0x01a6:
            r3 = 0
            goto L_0x014a
        L_0x01a8:
            r0.A01 = r2
            java.lang.String r3 = "credential_id"
            java.lang.String r3 = X.C179158jJ.A0O(r3, r1)
            r0.A0P = r3
            java.lang.String r3 = "app_to_app_partner_app_package"
            java.lang.String r5 = X.C36431kI.A1A(r3, r1)
            java.lang.String r3 = "app_to_app_partner_intent_action"
            java.lang.String r4 = X.C36431kI.A1A(r3, r1)
            java.lang.String r3 = "app_to_app_request_payload"
            java.lang.String r6 = X.C36431kI.A1A(r3, r1)
            X.00I r3 = X.AnonymousClass3RH.A00(r5, r4)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0c1e
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x0c1e
            if (r3 == 0) goto L_0x0c1e
            java.lang.Object r5 = r3.A00
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r3.A01
            java.lang.String r4 = (java.lang.String) r4
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = "android.intent.extra.TEXT"
            r3.putExtra(r1, r6)
            r3.setPackage(r5)
            r3.setAction(r4)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "PAY: BrazilPayBloksActivity appToApp package: "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " action "
            X.C36321k7.A1Q(r1, r4, r2)
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            android.content.ComponentName r1 = r3.resolveActivity(r1)
            if (r1 == 0) goto L_0x0026
            r1 = 100
            r0.startActivityForResult(r3, r1)
            return
        L_0x020e:
            java.lang.String r0 = "get_compliance_status"
            short r8 = X.C90504aG.A0y(r0, r5)
            goto L_0x0018
        L_0x0216:
            java.lang.String r0 = "show_account_removal_dialog"
            short r8 = X.C90514aH.A1B(r0, r5)
            goto L_0x0018
        L_0x021e:
            java.lang.String r0 = "get_merchant_reg_data"
            short r8 = X.C90514aH.A1C(r0, r5)
            goto L_0x0018
        L_0x0226:
            java.lang.String r0 = "get_filtered_card_verification_options"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 3
            goto L_0x0018
        L_0x0231:
            java.lang.String r0 = "get_payout_banks"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 4
            goto L_0x0018
        L_0x023c:
            java.lang.String r0 = "send_kyc_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 5
            goto L_0x0018
        L_0x0247:
            java.lang.String r0 = "verify_card_otp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 6
            goto L_0x0018
        L_0x0252:
            java.lang.String r0 = "add_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 7
            goto L_0x0018
        L_0x025d:
            java.lang.String r0 = "dial_phone_number"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 8
            goto L_0x0018
        L_0x0269:
            java.lang.String r0 = "link_merchant"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 9
            goto L_0x0018
        L_0x0275:
            java.lang.String r0 = "pre_link_merchant"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 10
            goto L_0x0018
        L_0x0281:
            java.lang.String r0 = "bind_device"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 11
            goto L_0x0018
        L_0x028d:
            java.lang.String r0 = "add_card_phoenix"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 12
            goto L_0x0018
        L_0x0299:
            java.lang.String r0 = "add_credential"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 13
            goto L_0x0018
        L_0x02a5:
            java.lang.String r0 = "open_fbpay_pin_bottom_sheet"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 14
            goto L_0x0018
        L_0x02b1:
            java.lang.String r0 = "show_confirm_cancel_add_card_alert_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 15
            goto L_0x0018
        L_0x02bd:
            java.lang.String r0 = "refetch_verification_methods"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 16
            goto L_0x0018
        L_0x02c9:
            java.lang.String r0 = "open_setup_payments_warning_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 17
            goto L_0x0018
        L_0x02d5:
            java.lang.String r0 = "document_upload_submit_document"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 18
            goto L_0x0018
        L_0x02e1:
            java.lang.String r0 = "dismiss_confirm_cancel_add_card_alert_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 19
            goto L_0x0018
        L_0x02ed:
            java.lang.String r0 = "reset_pin_from_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 20
            goto L_0x0018
        L_0x02f9:
            java.lang.String r0 = "get_card_network"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 21
            goto L_0x0018
        L_0x0305:
            java.lang.String r0 = "tokenize_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 22
            goto L_0x0018
        L_0x0311:
            java.lang.String r0 = "show_contact_picker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 23
            goto L_0x0018
        L_0x031d:
            java.lang.String r0 = "verify_card_phoenix"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 24
            goto L_0x0018
        L_0x0329:
            java.lang.String r0 = "handle_error_native"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 25
            goto L_0x0018
        L_0x0335:
            java.lang.String r0 = "update_merchant_account"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 26
            goto L_0x0018
        L_0x0341:
            java.lang.String r0 = "set_onboarding_started"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 27
            goto L_0x0018
        L_0x034d:
            java.lang.String r0 = "get_kyc_status"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 28
            goto L_0x0018
        L_0x0359:
            java.lang.String r0 = "submit_verification_method"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 29
            goto L_0x0018
        L_0x0365:
            X.645 r4 = r0.A0C
            X.6wu r1 = new X.6wu
            r1.<init>(r2, r0)
            r4.A00(r1, r3)
            return
        L_0x0370:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x0384
        L_0x0373:
            X.9lE r4 = r0.A0N
            X.645 r2 = r4.A0G
            X.AEs r1 = new X.AEs
            r1.<init>(r0, r4, r3)
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0381:
            r1 = 2131887135(0x7f12041f, float:1.9408869E38)
        L_0x0384:
            X.AnonymousClass3SJ.A01(r0, r1)
            return
        L_0x0388:
            java.lang.String r2 = "onboarding_context"
            java.lang.String r6 = X.C36431kI.A1A(r2, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r5 = "p2p_context"
            java.lang.String r4 = "p2m_context"
            if (r2 != 0) goto L_0x03a4
            boolean r2 = r6.equals(r4)
            if (r2 != 0) goto L_0x03b8
            boolean r2 = r6.equals(r5)
            if (r2 != 0) goto L_0x03a6
        L_0x03a4:
            java.lang.String r5 = "generic_context"
        L_0x03a6:
            java.lang.String r2 = X.C36431kI.A1A(r7, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x03b2
            java.lang.String r2 = "payment_home"
        L_0x03b2:
            X.9lE r1 = r0.A0N
            r1.A03(r0, r2, r5, r3)
            return
        L_0x03b8:
            r5 = r4
            goto L_0x03a6
        L_0x03ba:
            r1 = 2131887135(0x7f12041f, float:1.9408869E38)
            X.AnonymousClass3SJ.A00(r0, r1)
            return
        L_0x03c1:
            java.lang.Class<com.whatsapp.payments.ui.PaymentContactPicker> r1 = com.whatsapp.payments.ui.PaymentContactPicker.class
            android.content.Intent r2 = X.C36441kJ.A0H(r0, r1)
            java.lang.String r1 = "for_payments"
            r2.putExtra(r1, r3)
            r0.startActivity(r2)
            return
        L_0x03d0:
            X.0v0 r0 = r0.A09
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "payments_onboarding_banner_registration_started"
            X.C36331k8.A0w(r1, r0, r3)
            return
        L_0x03dc:
            java.lang.String r11 = "FB"
            X.17Y r7 = r0.A05
            X.1Vl r6 = r0.A0T
            X.1Vk r5 = r0.A0C
            X.1Vu r4 = r0.A08
            X.9gU r1 = r0.A0J
            X.9Nf r8 = new X.9Nf
            r12 = r8
            r13 = r0
            r14 = r7
            r15 = r4
            r16 = r5
            r17 = r1
            r18 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.AEg r7 = new X.AEg
            r7.<init>(r2, r0)
            X.1Vk r2 = r8.A03
            r0 = 2
            X.1AL[] r1 = new X.AnonymousClass1AL[r0]
            java.lang.String r0 = "action"
            java.lang.String r10 = "get-kyc-state"
            X.C36381kD.A1N(r0, r10, r1)
            java.lang.String r0 = "provider"
            X.C36341k9.A1L(r0, r11, r1, r3)
            java.lang.String r0 = "account"
            X.9nx r0 = X.C203399nx.A04(r0, r1)
            android.content.Context r5 = r8.A00
            X.17Y r9 = r8.A01
            X.1Vu r6 = r8.A02
            X.8fx r4 = new X.8fx
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.C165597tg.A1C(r2, r4, r0)
            return
        L_0x0422:
            X.9F4 r0 = r0.A0E
            java.util.Map r0 = r0.A00
            r2.A01(r6, r0)
            return
        L_0x042a:
            java.lang.String r2 = "phone_number"
            java.lang.Object r1 = r1.get(r2)
            r2 = r4
            if (r1 == 0) goto L_0x0437
            java.lang.String r2 = r1.toString()
        L_0x0437:
            java.lang.String r1 = "[^\\d+]"
            java.lang.String r3 = r2.replaceAll(r1, r4)
            r2 = 0
            java.lang.String r1 = "tel"
            android.net.Uri r3 = android.net.Uri.fromParts(r1, r3, r2)
            java.lang.String r2 = "android.intent.action.DIAL"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L_0x044f:
            java.lang.String r3 = X.C36431kI.A1A(r7, r1)
            X.9UG r6 = r0.A0O
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x045c
            r4 = r3
        L_0x045c:
            r1 = 0
            X.B8r r5 = new X.B8r
            r5.<init>(r2, r0, r1)
            X.9oU r3 = new X.9oU
            r3.<init>(r2, r0, r1)
            X.AHY r1 = X.AHY.A00
            X.3ty r3 = r6.A00(r3, r1, r5, r4)
            r1 = 5
            X.B9p r2 = new X.B9p
            r2.<init>(r0, r1)
            goto L_0x0a33
        L_0x0475:
            java.lang.String r0 = "verify_methods"
            java.lang.String r3 = X.C36431kI.A1A(r0, r1)
            java.lang.String r0 = "keys"
            java.lang.String r1 = X.C36431kI.A1A(r0, r1)
            if (r3 == 0) goto L_0x0509
            if (r1 == 0) goto L_0x0509
            java.util.HashMap r7 = X.AnonymousClass001.A0J()
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            java.util.List r8 = java.util.Arrays.asList(r0)
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            android.util.JsonWriter r4 = new android.util.JsonWriter
            r4.<init>(r5)
            android.util.JsonReader r3 = X.C90484aE.A0Q(r3)     // Catch:{ IOException -> 0x0509 }
            r4.beginObject()     // Catch:{ all -> 0x04ff }
            java.lang.String r0 = "verification_options"
            r4.name(r0)     // Catch:{ all -> 0x04ff }
        L_0x04a9:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x04ff }
            if (r0 == 0) goto L_0x04ec
            r3.beginArray()     // Catch:{ all -> 0x04ff }
            r4.beginArray()     // Catch:{ all -> 0x04ff }
        L_0x04b5:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x04ff }
            if (r0 == 0) goto L_0x04e8
            r3.beginObject()     // Catch:{ all -> 0x04ff }
            r4.beginObject()     // Catch:{ all -> 0x04ff }
        L_0x04c1:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x04ff }
            if (r0 == 0) goto L_0x04e1
            java.lang.String r1 = r3.nextName()     // Catch:{ all -> 0x04ff }
            boolean r0 = r8.contains(r1)     // Catch:{ all -> 0x04ff }
            if (r0 == 0) goto L_0x04dd
            android.util.JsonWriter r1 = r4.name(r1)     // Catch:{ all -> 0x04ff }
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x04ff }
            r1.value(r0)     // Catch:{ all -> 0x04ff }
            goto L_0x04c1
        L_0x04dd:
            r3.skipValue()     // Catch:{ all -> 0x04ff }
            goto L_0x04c1
        L_0x04e1:
            r3.endObject()     // Catch:{ all -> 0x04ff }
            r4.endObject()     // Catch:{ all -> 0x04ff }
            goto L_0x04b5
        L_0x04e8:
            r4.endArray()     // Catch:{ all -> 0x04ff }
            goto L_0x04a9
        L_0x04ec:
            r4.endObject()     // Catch:{ all -> 0x04ff }
            r3.close()     // Catch:{ IOException -> 0x0509 }
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "payload"
            r7.put(r0, r1)
            r2.A02(r6, r7)
            return
        L_0x04ff:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0504 }
            goto L_0x0508
        L_0x0504:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0509 }
        L_0x0508:
            throw r1     // Catch:{ IOException -> 0x0509 }
        L_0x0509:
            java.lang.String r0 = "on_failure"
            r2.A00(r0)
            return
        L_0x050f:
            r3 = 0
            A0J(r2, r0, r1, r3)
            return
        L_0x0514:
            java.lang.String r5 = "otp"
            java.lang.String r6 = X.C179158jJ.A0O(r5, r1)
            java.lang.String r5 = " "
            java.lang.String r27 = r6.replace(r5, r4)
            java.lang.String r4 = "card_verify_type"
            r1.get(r4)
            java.lang.String r4 = "credential_id"
            java.lang.String r29 = X.C36431kI.A1A(r4, r1)
            java.lang.String r4 = "card_verify_identifier"
            java.lang.String r30 = X.C36431kI.A1A(r4, r1)
            java.lang.String r4 = "card_verify_otp_resend_interval_sec"
            java.lang.String r1 = X.C36431kI.A1A(r4, r1)
            java.lang.String r28 = X.C165607th.A0p(r0)
            X.0wo r4 = r0.A07
            r32 = r4
            X.17Y r4 = r0.A05
            r31 = r4
            X.0wQ r15 = r0.A02
            X.16S r14 = r0.A05
            X.19A r13 = r0.A06
            X.1EU r12 = r0.A0F
            X.9Sy r11 = r0.A0F
            X.1Vk r10 = r0.A0C
            X.16T r9 = r0.A03
            X.646 r8 = r0.A0N
            X.6VM r7 = r0.A0A
            X.1Vu r6 = r0.A08
            X.9gU r5 = r0.A0J
            X.9RZ r4 = new X.9RZ
            r4.<init>(r2, r0, r1)
            X.8g7 r1 = new X.8g7
            r21 = r10
            r22 = r12
            r23 = r5
            r24 = r11
            r25 = r8
            r26 = r4
            r16 = r9
            r17 = r14
            r18 = r13
            r19 = r7
            r20 = r6
            r11 = r1
            r12 = r0
            r13 = r31
            r14 = r15
            r15 = r32
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r5 = r1.A05
            X.16S r4 = r1.A04
            X.9un r0 = r4.A07(r5)
            if (r0 == 0) goto L_0x05a3
            X.8bF r0 = r0.A08
            X.8b7 r0 = (X.AnonymousClass8b7) r0
            if (r0 == 0) goto L_0x05a3
            java.lang.String r2 = r0.A02
            java.lang.String r0 = "VISA"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x05a3
            java.lang.String r0 = "PAY: BrazilVerifyCardOTPSendAction sendRequestCardVerification with encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A01()
            return
        L_0x05a3:
            X.9un r0 = r4.A07(r5)
            X.8b4 r0 = (X.C175798b4) r0
            if (r0 == 0) goto L_0x0627
            int r2 = r0.A01
            r0 = 5
            if (r2 != r0) goto L_0x0627
            java.lang.String r0 = "PAY: BrazilStepUpVerificationBase getProviderEncryptionKeyAsync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9Sy r0 = r1.A09
            X.9Ng r4 = r0.A00
            r2 = 0
            if (r4 == 0) goto L_0x05c6
            java.lang.String r0 = r4.A02
            r4.A02 = r2
            if (r0 == 0) goto L_0x05c6
            r1.A03(r2, r0)
            return
        L_0x05c6:
            X.0wo r4 = r1.A03
            android.content.Context r8 = r1.A00
            X.17Y r9 = r1.A01
            X.0wQ r10 = r1.A02
            X.1Vk r2 = r1.A06
            X.1Vu r0 = r1.A05
            X.9NF r7 = new X.9NF
            r11 = r4
            r12 = r0
            r13 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.9F2 r8 = new X.9F2
            r8.<init>(r1)
            java.lang.String r5 = "ADD_CARD"
            java.lang.String r6 = "elo"
            X.0wo r1 = r7.A03
            X.0wQ r0 = r7.A02
            java.lang.String r4 = X.C237919w.A00(r0, r1)
            X.1Vk r10 = r7.A05
            r0 = 4
            X.1AL[] r2 = new X.AnonymousClass1AL[r0]
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-request-new-challenge"
            X.C36381kD.A1N(r1, r0, r2)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r6.toUpperCase(r0)
            java.lang.String r0 = "network_type"
            X.C36341k9.A1L(r0, r1, r2, r3)
            java.lang.String r0 = "scope"
            X.C36351kA.A1N(r0, r5, r2)
            java.lang.String r0 = "nonce"
            X.C36361kB.A1Q(r0, r4, r2)
            java.lang.String r0 = "account"
            X.9nx r12 = X.C203399nx.A04(r0, r2)
            android.content.Context r4 = r7.A00
            X.17Y r6 = r7.A01
            X.1Vu r5 = r7.A04
            r9 = 7
            X.B7J r3 = new X.B7J
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r13 = "set"
            r14 = 30000(0x7530, double:1.4822E-319)
            r11 = r3
            r10.A0H(r11, r12, r13, r14)
            return
        L_0x0627:
            java.lang.String r0 = "PAY: BrazilVerifyCardOTPSendAction sendRequestCardVerification without encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r1.A06
            X.AnonymousClass8g7.A00(r1, r0)
            return
        L_0x0632:
            java.lang.String r3 = "credential_id"
            java.lang.String r14 = X.C179158jJ.A0O(r3, r1)
            X.17Y r8 = r0.A05
            X.1Vl r7 = r0.A0T
            X.1EU r6 = r0.A0F
            X.1Vk r5 = r0.A0C
            X.16T r4 = r0.A03
            X.1Vu r3 = r0.A08
            X.9Pu r1 = new X.9Pu
            r1.<init>(r2)
            X.9O7 r15 = new X.9O7
            r10 = r5
            r11 = r6
            r12 = r1
            r13 = r7
            r5 = r15
            r6 = r0
            r7 = r8
            r8 = r4
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = "PAY: BrazilMerchantLinkAction linkMerchant"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = r15.A08
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-link-merchant"
            X.C36381kD.A1M(r1, r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x069b
            java.lang.String r0 = "credential-id"
            X.C36381kD.A1M(r0, r3, r2)
            X.1Vl r0 = r15.A07
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = "device-id"
            X.C36381kD.A1M(r0, r1, r2)
            X.1Vk r0 = r15.A04
            X.9nx r2 = X.C203399nx.A06(r2)
            android.content.Context r12 = r15.A00
            X.17Y r14 = r15.A01
            X.1Vu r13 = r15.A03
            r16 = 4
            X.B7H r11 = new X.B7H
            r11.<init>(r12, r13, r14, r15, r16)
            r4 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r3 = "set"
            r1 = r11
            r0.A0H(r1, r2, r3, r4)
            return
        L_0x069b:
            java.lang.String r0 = "Credential id missing"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x06a2:
            java.lang.String r3 = "credential_id"
            java.lang.String r3 = X.C179158jJ.A0O(r3, r1)
            X.1EU r1 = r0.A0F
            X.16S r1 = X.C165617ti.A0O(r1)
            X.9un r14 = r1.A07(r3)
            X.C18740tg.A06(r14)
            X.8b4 r14 = (X.C175798b4) r14
            X.0wo r13 = r0.A07
            X.17Y r12 = r0.A05
            X.0wQ r11 = r0.A02
            X.19A r10 = r0.A06
            X.1EU r9 = r0.A0F
            X.1Vk r8 = r0.A0C
            X.646 r7 = r0.A0N
            X.16T r6 = r0.A03
            X.6VM r5 = r0.A0A
            X.1Vu r4 = r0.A08
            r1 = 1
            X.B7g r3 = new X.B7g
            r3.<init>(r2, r0, r1)
            X.9eZ r1 = new X.9eZ
            r25 = r9
            r26 = r3
            r27 = r7
            r20 = r6
            r21 = r10
            r22 = r5
            r23 = r4
            r24 = r8
            r15 = r1
            r16 = r0
            r17 = r12
            r18 = r11
            r19 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.A01(r14)
            return
        L_0x06f3:
            java.lang.String r3 = "credential_push_data"
            java.lang.String r26 = X.C36431kI.A1A(r3, r1)
            java.lang.String r3 = "credential_card_network"
            java.lang.String r27 = X.C36431kI.A1A(r3, r1)
            com.whatsapp.jid.PhoneUserJid r1 = X.C36411kG.A0j(r0)
            if (r1 != 0) goto L_0x0790
            r3 = 0
        L_0x0706:
            X.C18740tg.A06(r3)
            X.9oI r1 = X.C203559oI.A00()
            java.lang.String r3 = X.AnonymousClass3U8.A01(r1, r3)
            java.lang.String r1 = "[^\\d]"
            java.lang.String r28 = r3.replaceAll(r1, r4)
            X.0yC r3 = r0.A0D
            r1 = 1482(0x5ca, float:2.077E-42)
            boolean r1 = r3.A0E(r1)
            if (r1 == 0) goto L_0x078d
            X.9k3 r3 = r0.A0L
            java.lang.String r1 = "generic_context"
            boolean r1 = r3.A06(r1)
            r1 = r1 ^ 1
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r1)
        L_0x072f:
            X.0wo r12 = r0.A07
            X.17Y r11 = r0.A05
            X.0wQ r10 = r0.A02
            X.19A r9 = r0.A06
            X.1EU r8 = r0.A0F
            X.9j5 r7 = r0.A0J
            X.1Vk r6 = r0.A0C
            X.16T r5 = r0.A03
            X.1Vu r4 = r0.A08
            X.9gU r3 = r0.A0J
            X.9d9 r1 = new X.9d9
            r23 = r3
            r24 = r7
            r18 = r5
            r19 = r9
            r20 = r4
            r21 = r6
            r22 = r8
            r13 = r1
            r14 = r0
            r15 = r11
            r16 = r10
            r17 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.1Vl r3 = r0.A0T
            java.lang.String r29 = r3.A01()
            X.9I8 r4 = new X.9I8
            r4.<init>(r2, r0)
            X.9gU r8 = r1.A06
            java.lang.String r2 = "FB"
            java.lang.String r9 = "KYC"
            X.AF3 r3 = r8.A01(r2, r9)
            if (r3 == 0) goto L_0x0794
            java.lang.String r0 = r3.A05
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0794
            r0 = r1
            r1 = r3
            r2 = r4
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            X.C198249d9.A00(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x078d:
            r25 = 0
            goto L_0x072f
        L_0x0790:
            java.lang.String r3 = r1.user
            goto L_0x0706
        L_0x0794:
            X.AEp r0 = new X.AEp
            r23 = r1
            r24 = r4
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            android.content.Context r4 = r1.A00
            X.17Y r5 = r1.A01
            X.1Vk r7 = r1.A04
            X.1Vu r6 = r1.A03
            X.9SR r3 = new X.9SR
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.A00(r0, r2)
            return
        L_0x07b0:
            java.lang.String r3 = "credential_id"
            java.lang.String r13 = X.C36431kI.A1A(r3, r1)
            X.0wo r14 = r0.A07
            X.17Y r12 = r0.A05
            X.0wQ r11 = r0.A02
            X.19A r10 = r0.A06
            X.1Vl r9 = r0.A0T
            X.1EU r8 = r0.A0F
            X.1Vk r7 = r0.A0C
            X.646 r6 = r0.A0N
            X.16T r5 = r0.A03
            X.6VM r3 = r0.A0A
            X.1Vu r1 = r0.A08
            X.9Ss r4 = new X.9Ss
            r25 = r8
            r26 = r6
            r27 = r9
            r28 = r13
            r20 = r5
            r21 = r10
            r22 = r3
            r23 = r1
            r24 = r7
            r15 = r4
            r16 = r0
            r17 = r12
            r18 = r11
            r19 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3 = 1
            X.B9j r1 = new X.B9j
            r1.<init>(r2, r0, r13, r3)
            r4.A00(r1)
            return
        L_0x07f6:
            java.lang.String r4 = "on_failure"
            java.lang.String r3 = "document_type"
            java.lang.String r8 = X.C179158jJ.A0M(r3, r1)
            java.lang.String r3 = "doc_file_name_list"
            java.lang.String r1 = X.C179158jJ.A0M(r3, r1)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            org.json.JSONObject r6 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x0890 }
            X.60i r3 = r0.A02     // Catch:{ JSONException -> 0x0890 }
            java.lang.String r1 = "front"
            java.lang.String r1 = r6.getString(r1)     // Catch:{ JSONException -> 0x0890 }
            java.io.File r7 = r3.A00(r1)     // Catch:{ JSONException -> 0x0890 }
            X.60i r3 = r0.A02     // Catch:{ JSONException -> 0x0890 }
            java.lang.String r1 = "back"
            java.lang.String r1 = r6.getString(r1)     // Catch:{ JSONException -> 0x0890 }
            java.io.File r6 = r3.A00(r1)     // Catch:{ JSONException -> 0x0890 }
            if (r7 == 0) goto L_0x0881
            if (r6 == 0) goto L_0x0881
            boolean r1 = r7.exists()     // Catch:{ JSONException -> 0x0890 }
            if (r1 == 0) goto L_0x0881
            boolean r1 = r6.exists()     // Catch:{ JSONException -> 0x0890 }
            if (r1 == 0) goto L_0x0881
            java.lang.String r1 = r7.getPath()     // Catch:{ JSONException -> 0x0890 }
            java.lang.String r3 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r1)     // Catch:{ JSONException -> 0x0890 }
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ JSONException -> 0x0890 }
            java.lang.String r1 = r1.getMimeTypeFromExtension(r3)     // Catch:{ JSONException -> 0x0890 }
            boolean r1 = X.C25571Gv.A05(r1)     // Catch:{ JSONException -> 0x0890 }
            if (r1 == 0) goto L_0x0887
            java.lang.String r1 = r6.getPath()     // Catch:{ JSONException -> 0x0890 }
            java.lang.String r3 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r1)     // Catch:{ JSONException -> 0x0890 }
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ JSONException -> 0x0890 }
            java.lang.String r1 = r1.getMimeTypeFromExtension(r3)     // Catch:{ JSONException -> 0x0890 }
            boolean r1 = X.C25571Gv.A05(r1)     // Catch:{ JSONException -> 0x0890 }
            if (r1 == 0) goto L_0x0887
            r5.add(r7)     // Catch:{ JSONException -> 0x0890 }
            r5.add(r6)     // Catch:{ JSONException -> 0x0890 }
            int r1 = r5.size()
            if (r1 != 0) goto L_0x0875
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload no file to upload"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2.A00(r4)
            return
        L_0x0875:
            r11 = 0
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            r6 = r2
            r7 = r0
            r9 = r5
            A0I(r6, r7, r8, r9, r10, r11)
            return
        L_0x0881:
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0890 }
            goto L_0x088c
        L_0x0887:
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload format not allowed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0890 }
        L_0x088c:
            r2.A00(r4)     // Catch:{ JSONException -> 0x0890 }
            return
        L_0x0890:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload threw exception "
            com.whatsapp.util.Log.e(r0, r1)
            r2.A00(r4)
            return
        L_0x089a:
            java.lang.String r3 = "credential_id"
            java.lang.String r12 = X.C179158jJ.A0M(r3, r1)
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.lang.String r3 = "card_num"
            java.lang.String r5 = X.C179158jJ.A0M(r3, r1)
            java.lang.String r3 = "\\s"
            java.lang.String r4 = r5.replace(r3, r4)
            java.lang.String r3 = "creditCardNumber"
            X.C36341k9.A1H(r3, r4, r11)
            X.0wo r13 = r0.A07
            X.17Y r10 = r0.A05
            X.0wQ r9 = r0.A02
            X.9SJ r8 = r0.A0G
            X.1Vl r7 = r0.A0T
            X.9Xk r6 = r0.A0R
            X.1Vk r5 = r0.A0C
            X.1Vu r4 = r0.A08
            X.9gU r3 = r0.A0J
            java.lang.String r14 = "pin"
            java.lang.String r26 = X.C36431kI.A1A(r14, r1)
            java.lang.String r14 = "provider"
            java.lang.String r27 = X.C36431kI.A1A(r14, r1)
            X.9dC r1 = new X.9dC
            r24 = r7
            r25 = r12
            r28 = r11
            r19 = r4
            r20 = r5
            r21 = r8
            r22 = r3
            r23 = r6
            r14 = r1
            r15 = r0
            r16 = r10
            r17 = r9
            r18 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.9Ra r4 = new X.9Ra
            r4.<init>(r2, r0, r12)
            java.lang.String r3 = r1.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0921
            java.lang.String r5 = r1.A0C
            X.C18740tg.A06(r5)
            X.9gU r2 = r1.A06
            java.lang.String r0 = "PIN"
            X.AF3 r2 = r2.A01(r5, r0)
            if (r2 != 0) goto L_0x0918
            X.9SR r3 = r1.A05
            r2 = 0
            X.B9d r0 = new X.B9d
            r0.<init>(r4, r1, r2)
            r3.A00(r0, r5)
            return
        L_0x0918:
            X.9Pt r0 = new X.9Pt
            r0.<init>(r2)
            X.C198279dC.A00(r1, r0, r4, r3)
            return
        L_0x0921:
            X.9SJ r2 = r1.A04
            java.util.List r9 = r1.A0D
            r0 = 1
            X.9ob r6 = new X.9ob
            r6.<init>(r4, r1, r0)
            X.0wU r0 = r2.A05
            X.5mh r7 = r2.A03
            X.1Db r3 = r2.A01
            X.5cN r8 = r2.A04
            X.1Vk r4 = r2.A02
            X.0wD r2 = r2.A00
            r10 = -1
            r5 = 0
            X.8g1 r1 = new X.8g1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.C36331k8.A1F(r1, r0)
            return
        L_0x0942:
            java.lang.String r5 = "card_number"
            java.lang.String r5 = X.C36431kI.A1A(r5, r1)
            java.lang.String r1 = "\\s"
            java.lang.String r7 = r5.replaceAll(r1, r4)
            java.util.HashMap r10 = X.AnonymousClass001.A0J()
            int r5 = r7.length()
            r4 = 0
            r1 = 6
            if (r5 >= r1) goto L_0x0965
            java.lang.String r1 = "unknown"
            java.lang.String r0 = "network_name"
            r10.put(r0, r1)
        L_0x0961:
            r2.A01(r6, r10)
            return
        L_0x0965:
            java.lang.String r20 = r7.substring(r4, r1)
            X.9Sy r4 = r0.A0F
            boolean r1 = r4.A03
            if (r1 != 0) goto L_0x0961
            r4.A03 = r3
            X.0wo r9 = r0.A07
            X.17Y r8 = r0.A05
            X.0wQ r7 = r0.A02
            X.19A r6 = r0.A06
            X.646 r5 = r0.A0N
            X.1Vu r4 = r0.A08
            X.9gU r3 = r0.A0J
            X.9O5 r1 = new X.9O5
            r16 = r6
            r17 = r4
            r18 = r3
            r19 = r5
            r11 = r1
            r12 = r0
            r13 = r8
            r14 = r7
            r15 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.9RX r3 = new X.9RX
            r3.<init>(r2, r0, r10)
            X.646 r2 = r1.A07
            r0 = 5
            java.lang.String r9 = r2.A00(r0)
            X.0wo r2 = r1.A03
            X.0wQ r0 = r1.A02
            java.lang.String r8 = X.C237919w.A00(r0, r2)
            X.19A r2 = r1.A04
            java.lang.String r0 = r2.A09()
            java.lang.String r10 = r1.A08
            java.lang.String r4 = "elo"
            X.6QB r7 = X.C36441kJ.A0q(r4)
            r6 = 0
            r4 = 1
            boolean r4 = X.C203539oF.A0T(r9, r4, r6)
            if (r4 == 0) goto L_0x09c1
            java.lang.String r4 = "network_device_id"
            X.C36331k8.A1D(r7, r4, r9)
        L_0x09c1:
            X.C203539oF.A0F(r7, r8)
            X.9nx r7 = r7.A03()
            X.6QB r6 = X.C36421kH.A0T()
            X.C165567td.A1E(r6)
            java.lang.String r5 = "type"
            java.lang.String r4 = "get"
            X.C36331k8.A1D(r6, r5, r4)
            X.C203539oF.A0E(r6, r0)
            X.6QB r5 = X.C165587tf.A0a()
            java.lang.String r8 = "action"
            java.lang.String r4 = "br-fetch-network-info"
            X.C36331k8.A1D(r5, r8, r4)
            r11 = 6
            r13 = 6
            r15 = 0
            boolean r4 = X.C203539oF.A0P(r10, r11, r13, r15)
            if (r4 == 0) goto L_0x09f4
            java.lang.String r4 = "bin"
            X.C36331k8.A1D(r5, r4, r10)
        L_0x09f4:
            r5.A05(r7)
            X.9nx r11 = X.C165567td.A0I(r5, r6)
            android.content.Context r5 = r1.A00
            X.17Y r7 = r1.A01
            X.1Vu r6 = r1.A05
            r10 = 3
            X.B7J r4 = new X.B7J
            r8 = r1
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13 = 204(0xcc, float:2.86E-43)
            r14 = 30000(0x7530, double:1.4822E-319)
            r9 = r2
            r10 = r4
            r12 = r0
            r9.A0E(r10, r11, r12, r13, r14)
            return
        L_0x0a14:
            java.lang.String r4 = "credential_id"
            java.lang.String r8 = X.C179158jJ.A0O(r4, r1)
            X.9UG r4 = r0.A0O
            X.B8r r7 = new X.B8r
            r7.<init>(r2, r0, r3)
            X.9oU r5 = new X.9oU
            r5.<init>(r2, r0, r3)
            java.lang.String r9 = "add_card"
            r6 = 0
            X.3ty r3 = r4.A01(r5, r6, r7, r8, r9)
            r1 = 0
            X.B9s r2 = new X.B9s
            r2.<init>(r1, r8, r0)
        L_0x0a33:
            r3.A0A(r2)
            return
        L_0x0a37:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = X.C36431kI.A1A(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0a4e
            int r4 = java.lang.Integer.parseInt(r2)
            boolean r1 = r0.BJa(r4)
            if (r1 == 0) goto L_0x0a4f
            return
        L_0x0a4e:
            r4 = -1
        L_0x0a4f:
            X.AE9 r3 = r0.A09
            X.0yC r2 = r0.A0D
            r10 = 2131892408(0x7f1218b8, float:1.9419563E38)
            X.6PS r1 = r0.A0K
            r5 = r3
            r6 = r0
            r7 = r2
            r8 = r1
            r9 = r4
            X.0FM r0 = r5.A01(r6, r7, r8, r9, r10)
            r0.show()
            return
        L_0x0a65:
            X.9gU r1 = r0.A0J
            java.lang.String r8 = "FB"
            java.lang.String r7 = "KYC"
            X.AF3 r1 = r1.A01(r8, r7)
            if (r1 == 0) goto L_0x0a7d
            java.lang.String r4 = r1.A05
            boolean r1 = r4.equalsIgnoreCase(r8)
            if (r1 == 0) goto L_0x0a7d
            A0H(r2, r0, r4)
            return
        L_0x0a7d:
            X.B9d r6 = new X.B9d
            r6.<init>(r2, r0, r3)
            X.17Y r5 = r0.A05
            X.1Vk r4 = r0.A0C
            X.1Vu r3 = r0.A08
            X.9gU r2 = r0.A0J
            X.9SR r1 = new X.9SR
            r14 = r2
            r15 = r7
            r9 = r1
            r10 = r0
            r11 = r5
            r12 = r3
            r13 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.A00(r6, r8)
            return
        L_0x0a9a:
            java.lang.String r3 = "verify_type"
            java.lang.String r8 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r3 = "verify_id"
            java.lang.String r26 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r7 = "BANK"
            boolean r3 = r8.equals(r7)
            r4 = 0
            if (r3 == 0) goto L_0x0b31
            java.lang.String r3 = "bank_code"
            java.lang.String r27 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r3 = "branch_name"
            java.lang.String r28 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r3 = "bank_account_type"
            java.lang.String r29 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r3 = "bank_account_number"
            java.lang.String r30 = X.C179158jJ.A0O(r3, r1)
            r31 = r4
        L_0x0ac9:
            X.0wo r1 = r0.A07
            r16 = r1
            X.17Y r15 = r0.A05
            X.0wQ r14 = r0.A02
            X.0wU r13 = r0.A04
            X.5mh r12 = r0.A0U
            X.1Vl r11 = r0.A0T
            X.1Db r10 = r0.A0A
            X.5cN r9 = r0.A0V
            X.1Vk r6 = r0.A0C
            X.0wD r5 = r0.A07
            X.1Vu r4 = r0.A08
            X.9Pv r3 = new X.9Pv
            r3.<init>(r2)
            X.8g4 r1 = new X.8g4
            r21 = r11
            r22 = r12
            r23 = r9
            r24 = r13
            r25 = r8
            r17 = r4
            r18 = r10
            r19 = r6
            r20 = r3
            r11 = r1
            r12 = r0
            r13 = r15
            r15 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: BrazilMerchantLinkAction preLinkMerchant: "
            r2.append(r0)
            java.lang.String r4 = r1.A0D
            X.C36321k7.A1a(r2, r4)
            int r3 = r4.hashCode()
            r0 = -1136784465(0xffffffffbc3e0baf, float:-0.011599465)
            r2 = 0
            if (r3 == r0) goto L_0x0b54
            r0 = 2031164(0x1efe3c, float:2.846267E-39)
            if (r3 == r0) goto L_0x0b25
            r0 = 399611855(0x17d197cf, float:1.354463E-24)
            if (r3 != r0) goto L_0x0b54
            java.lang.String r7 = "PREPAID"
        L_0x0b25:
            boolean r0 = r4.equals(r7)
            if (r0 == 0) goto L_0x0b54
            X.0wU r3 = r1.A08
            java.lang.Void[] r0 = new java.lang.Void[r2]
            goto L_0x0c1a
        L_0x0b31:
            java.lang.String r3 = "PREPAID"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0b48
            java.lang.String r3 = "serial_number"
            java.lang.String r31 = X.C179158jJ.A0O(r3, r1)
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            goto L_0x0ac9
        L_0x0b48:
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            r31 = r4
            goto L_0x0ac9
        L_0x0b54:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid Verify Type: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r4, r1)
            throw r0
        L_0x0b62:
            java.lang.String r4 = "cvv"
            java.lang.String r24 = X.C36431kI.A1A(r4, r1)
            java.lang.String r4 = "expiry_date"
            java.lang.String r4 = X.C179158jJ.A0M(r4, r1)
            int[] r15 = X.C179158jJ.A0l(r4)
            java.lang.String r4 = "credential_id"
            java.lang.String r26 = X.C36431kI.A1A(r4, r1)
            java.lang.String r25 = X.C165607th.A0p(r0)
            X.17Y r14 = r0.A05
            X.0wU r13 = r0.A04
            X.5mh r12 = r0.A0U
            X.1EU r11 = r0.A0F
            X.1Db r10 = r0.A0A
            X.5cN r9 = r0.A0V
            X.9j5 r8 = r0.A0J
            X.1Vk r7 = r0.A0C
            X.16T r6 = r0.A03
            X.0wD r5 = r0.A07
            X.1Vu r4 = r0.A08
            r27 = r15[r3]
            r1 = 0
            r28 = r15[r1]
            X.9Qt r3 = new X.9Qt
            r3.<init>(r2, r0)
            X.8g2 r1 = new X.8g2
            r20 = r3
            r21 = r12
            r22 = r9
            r23 = r13
            r15 = r4
            r16 = r10
            r17 = r7
            r18 = r11
            r19 = r8
            r10 = r1
            r11 = r0
            r12 = r14
            r13 = r5
            r14 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.0wU r3 = r1.A0A
            goto L_0x0c17
        L_0x0bba:
            java.lang.String r3 = "bank_account_number"
            java.lang.String r24 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r3 = "bank_code"
            java.lang.String r25 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r3 = "bank_branch_number"
            java.lang.String r26 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r3 = "bank_account_type"
            java.lang.String r1 = X.C179158jJ.A0O(r3, r1)
            java.lang.String r27 = X.C165607th.A0p(r0)
            X.17Y r14 = r0.A05
            X.0wU r13 = r0.A04
            X.5mh r12 = r0.A0U
            X.1Vl r11 = r0.A0T
            X.1EU r10 = r0.A0F
            X.1Db r9 = r0.A0A
            X.5cN r8 = r0.A0V
            X.1Vk r7 = r0.A0C
            X.16T r6 = r0.A03
            X.0wD r5 = r0.A07
            X.1Vu r4 = r0.A08
            int r28 = java.lang.Integer.parseInt(r1)
            X.9Pw r3 = new X.9Pw
            r3.<init>(r2)
            X.8g3 r1 = new X.8g3
            r20 = r11
            r21 = r12
            r22 = r8
            r23 = r13
            r15 = r4
            r16 = r9
            r17 = r7
            r18 = r10
            r19 = r3
            r10 = r1
            r11 = r0
            r12 = r14
            r13 = r5
            r14 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r0 = "PAY: BrazilUpdateMerchantAccountAction updateMerchant"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wU r3 = r1.A09
        L_0x0c17:
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
        L_0x0c1a:
            r3.Box(r1, r0)
            return
        L_0x0c1e:
            java.util.HashMap r1 = X.AnonymousClass001.A0J()
            java.lang.String r0 = "on_failure"
            r2.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.BlT(X.6C8, java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0276, code lost:
        return "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0277, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String BlW(java.lang.String r9, java.util.Map r10) {
        /*
            r8 = this;
            java.lang.String r3 = "case"
            java.lang.Object r2 = r10.remove(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0278
            r7 = -1
            int r0 = r2.hashCode()
            switch(r0) {
                case -1618032200: goto L_0x0156;
                case -1539179277: goto L_0x015e;
                case -1333887770: goto L_0x0166;
                case -1067148390: goto L_0x016e;
                case -450144912: goto L_0x0179;
                case 96330030: goto L_0x0184;
                case 493597816: goto L_0x018f;
                case 595125212: goto L_0x019a;
                case 1867705314: goto L_0x01a5;
                case 2027790727: goto L_0x01b1;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r5 = "1"
            java.lang.String r4 = "0"
            r6 = 0
            switch(r7) {
                case 0: goto L_0x01cf;
                case 1: goto L_0x0223;
                case 2: goto L_0x021e;
                case 3: goto L_0x01bd;
                case 4: goto L_0x01c5;
                case 5: goto L_0x0028;
                case 6: goto L_0x0234;
                case 7: goto L_0x0243;
                case 8: goto L_0x026d;
                case 9: goto L_0x0118;
                default: goto L_0x0020;
            }
        L_0x0020:
            r10.put(r3, r2)
            java.lang.String r6 = super.BlW(r9, r10)
        L_0x0027:
            return r6
        L_0x0028:
            X.9F4 r0 = r8.A0E
            java.util.Map r0 = r0.A00
            r0.putAll(r10)
            java.util.Iterator r5 = X.AnonymousClass000.A0y(r10)
        L_0x0033:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0027
            java.util.Map$Entry r4 = X.AnonymousClass000.A11(r5)
            java.lang.String r2 = X.C90494aF.A0f(r4)
            r3 = -1
            int r0 = r2.hashCode()
            switch(r0) {
                case -1823090409: goto L_0x0110;
                case -1787697648: goto L_0x0108;
                case -1422091778: goto L_0x0100;
                case -1057402635: goto L_0x00f5;
                case -554367363: goto L_0x00ea;
                case -97971314: goto L_0x00df;
                case -13138338: goto L_0x00d4;
                case 17961485: goto L_0x00c9;
                case 17962411: goto L_0x00be;
                case 82874128: goto L_0x00b3;
                case 180337583: goto L_0x00a8;
                case 552892207: goto L_0x009d;
                case 629885866: goto L_0x0092;
                case 672839619: goto L_0x0087;
                case 1287484568: goto L_0x007c;
                case 1595342407: goto L_0x0071;
                case 2069092435: goto L_0x0066;
                default: goto L_0x0049;
            }
        L_0x0049:
            java.lang.String r2 = "[^\\d]"
            switch(r3) {
                case 0: goto L_0x005e;
                case 1: goto L_0x004f;
                case 2: goto L_0x004f;
                case 3: goto L_0x004f;
                case 4: goto L_0x004f;
                case 5: goto L_0x005e;
                case 6: goto L_0x004f;
                case 7: goto L_0x005e;
                case 8: goto L_0x0053;
                case 9: goto L_0x004f;
                case 10: goto L_0x004f;
                case 11: goto L_0x004f;
                case 12: goto L_0x004f;
                case 13: goto L_0x004f;
                case 14: goto L_0x004f;
                case 15: goto L_0x004f;
                case 16: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0033
        L_0x004f:
            r4.getValue()
            goto L_0x0033
        L_0x0053:
            java.lang.String r0 = X.C90514aH.A10(r4)
            X.C18740tg.A05(r0)
            X.C131826Qu.A02(r0)
            goto L_0x0033
        L_0x005e:
            java.lang.String r0 = X.C90514aH.A10(r4)
            r0.replaceAll(r2, r1)
            goto L_0x0033
        L_0x0066:
            java.lang.String r0 = "business_address_number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 16
            goto L_0x0049
        L_0x0071:
            java.lang.String r0 = "business_address_state"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 15
            goto L_0x0049
        L_0x007c:
            java.lang.String r0 = "business_address_neighborhood"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 14
            goto L_0x0049
        L_0x0087:
            java.lang.String r0 = "bank_branch_number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 13
            goto L_0x0049
        L_0x0092:
            java.lang.String r0 = "business_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 12
            goto L_0x0049
        L_0x009d:
            java.lang.String r0 = "bank_account_type"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 11
            goto L_0x0049
        L_0x00a8:
            java.lang.String r0 = "owner_full_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 10
            goto L_0x0049
        L_0x00b3:
            java.lang.String r0 = "owner_email"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 9
            goto L_0x0049
        L_0x00be:
            java.lang.String r0 = "owner_dob"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 8
            goto L_0x0049
        L_0x00c9:
            java.lang.String r0 = "owner_cpf"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 7
            goto L_0x0049
        L_0x00d4:
            java.lang.String r0 = "business_address_street_extra"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 6
            goto L_0x0049
        L_0x00df:
            java.lang.String r0 = "business_tax_id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 5
            goto L_0x0049
        L_0x00ea:
            java.lang.String r0 = "business_address_street_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 4
            goto L_0x0049
        L_0x00f5:
            java.lang.String r0 = "business_address_city"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0049
            r3 = 3
            goto L_0x0049
        L_0x0100:
            java.lang.String r0 = "bank_account_number"
            short r3 = X.C90514aH.A1C(r0, r2)
            goto L_0x0049
        L_0x0108:
            java.lang.String r0 = "bank_code"
            short r3 = X.C90514aH.A1B(r0, r2)
            goto L_0x0049
        L_0x0110:
            java.lang.String r0 = "business_address_postcode"
            short r3 = X.C90504aG.A0y(r0, r2)
            goto L_0x0049
        L_0x0118:
            java.lang.String r0 = "credential_id"
            java.lang.String r2 = X.C36431kI.A1A(r0, r10)
            java.lang.String r0 = "payment_method_field_name"
            java.lang.String r3 = X.C36431kI.A1A(r0, r10)
            X.9un r1 = r8.A04
            if (r1 == 0) goto L_0x0130
            java.lang.String r0 = r1.A0A
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0138
        L_0x0130:
            X.16S r0 = r8.A05
            X.9un r1 = r0.A07(r2)
            r8.A04 = r1
        L_0x0138:
            X.8bF r2 = r1.A08
            X.8bB r2 = (X.C175858bB) r2
            java.lang.String r0 = "p2p_receive"
            boolean r0 = r3.equals(r0)
            java.lang.String r1 = "DISABLED"
            if (r0 != 0) goto L_0x0153
            java.lang.String r0 = "p2p_send"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.A0N
        L_0x0150:
            if (r0 == 0) goto L_0x0277
            return r0
        L_0x0153:
            java.lang.String r0 = r2.A0M
            goto L_0x0150
        L_0x0156:
            java.lang.String r0 = "get_consumer_next_screen"
            short r7 = X.C90504aG.A0y(r0, r2)
            goto L_0x0018
        L_0x015e:
            java.lang.String r0 = "smb_business_name"
            short r7 = X.C90514aH.A1B(r0, r2)
            goto L_0x0018
        L_0x0166:
            java.lang.String r0 = "get_formatted_phone_number"
            short r7 = X.C90514aH.A1C(r0, r2)
            goto L_0x0018
        L_0x016e:
            java.lang.String r0 = "clear_merchant_reg_data"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 3
            goto L_0x0018
        L_0x0179:
            java.lang.String r0 = "open_fb_pay_hub"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 4
            goto L_0x0018
        L_0x0184:
            java.lang.String r0 = "store_merchant_reg_data"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 5
            goto L_0x0018
        L_0x018f:
            java.lang.String r0 = "is_purchase_enabled"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 6
            goto L_0x0018
        L_0x019a:
            java.lang.String r0 = "is_p2p_eligible_card_available"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 7
            goto L_0x0018
        L_0x01a5:
            java.lang.String r0 = "is_smb_build"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 8
            goto L_0x0018
        L_0x01b1:
            java.lang.String r0 = "get_card_method_field_data"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 9
            goto L_0x0018
        L_0x01bd:
            X.9F4 r0 = r8.A0E
            java.util.Map r0 = r0.A00
            r0.clear()
            return r6
        L_0x01c5:
            java.lang.Class<com.whatsapp.payments.ui.BrazilFbPayHubActivity> r0 = com.whatsapp.payments.ui.BrazilFbPayHubActivity.class
            android.content.Intent r0 = X.C36441kJ.A0H(r8, r0)
            r8.startActivity(r0)
            return r6
        L_0x01cf:
            java.lang.String r0 = "payment_flow"
            java.lang.String r4 = X.C36431kI.A1A(r0, r10)
            X.9k3 r3 = r8.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x01df
            java.lang.String r4 = "p2p_context"
        L_0x01df:
            r2 = 0
            java.lang.String r0 = "merchant_account_linking_context"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0219
            java.lang.String r2 = X.C201649k3.A00(r3)
        L_0x01ec:
            if (r2 == 0) goto L_0x0277
            int r0 = r2.hashCode()
            switch(r0) {
                case -1412891550: goto L_0x01f8;
                case 823631114: goto L_0x0203;
                case 1027588136: goto L_0x020e;
                default: goto L_0x01f5;
            }
        L_0x01f5:
            java.lang.String r6 = "p_add_card"
            return r6
        L_0x01f8:
            java.lang.String r0 = "brpay_p_tos"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r6 = "p_tos"
            return r6
        L_0x0203:
            java.lang.String r0 = "brpay_p_pin_nux_create"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r6 = "p_pin_nux_create"
            return r6
        L_0x020e:
            java.lang.String r0 = "brpay_p_compliance_kyc_next_screen_router"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r6 = "p_compliance_kyc"
            return r6
        L_0x0219:
            java.lang.String r2 = X.C201649k3.A01(r3, r4, r2)
            goto L_0x01ec
        L_0x021e:
            java.lang.String r6 = X.AnonymousClass97L.A00(r9)
            return r6
        L_0x0223:
            X.1EV r0 = r8.A0B
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0278
            X.0wQ r0 = r8.A02
            X.0wh r0 = r0.A0A
            java.lang.String r1 = r0.A02()
            return r1
        L_0x0234:
            X.1EV r0 = r8.A0B
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x0276
            X.1EV r0 = r8.A0B
            boolean r0 = r0.A0B()
            goto L_0x0273
        L_0x0243:
            X.16S r0 = r8.A05
            java.util.ArrayList r0 = r0.A0A()
            java.util.Iterator r2 = r0.iterator()
        L_0x024d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x026c
            X.9un r1 = X.C165607th.A0S(r2)
            boolean r0 = X.C203449o2.A08(r1)
            if (r0 == 0) goto L_0x024d
            X.8bF r1 = r1.A08
            if (r1 == 0) goto L_0x024d
            boolean r0 = r1 instanceof X.C175858bB
            if (r0 == 0) goto L_0x024d
            X.8bB r1 = (X.C175858bB) r1
            boolean r0 = r1.A0X
            if (r0 == 0) goto L_0x024d
            return r5
        L_0x026c:
            return r4
        L_0x026d:
            X.1EV r0 = r8.A0B
            boolean r0 = r0.A01()
        L_0x0273:
            if (r0 != 0) goto L_0x0276
            return r4
        L_0x0276:
            return r5
        L_0x0277:
            return r1
        L_0x0278:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.BlW(java.lang.String, java.util.Map):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        X.C179158jJ.A0j(r14.A01, (java.util.Map) null, -232);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r32, int r33, android.content.Intent r34) {
        /*
            r31 = this;
            r14 = r31
            r1 = r32
            r2 = r33
            r5 = r34
            super.onActivityResult(r1, r2, r5)
            r0 = 100
            if (r1 != r0) goto L_0x0036
            X.6C8 r1 = r14.A01
            if (r1 == 0) goto L_0x0036
            r4 = -232(0xffffffffffffff18, float:NaN)
            r0 = -1
            r3 = 0
            if (r2 != r0) goto L_0x00f2
            java.lang.String r2 = "on_success"
            if (r34 == 0) goto L_0x00ee
            android.os.Bundle r1 = r5.getExtras()
            java.lang.String r0 = "STEP_UP_RESPONSE"
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "issuerMobileAppAuthResponse"
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "PAY: BrazilPayBloksActivity onActivityResult - response is NULL"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return
        L_0x0037:
            java.lang.String r1 = X.C90514aH.A0y(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1086574198: goto L_0x00c9;
                case 568196142: goto L_0x00d2;
                case 1185244855: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            return
        L_0x0043:
            java.lang.String r0 = "approved"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r1 = "STEP_UP_AUTH_CODE"
            boolean r0 = r5.hasExtra(r1)
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "TAV"
        L_0x0055:
            java.lang.String r13 = r5.getStringExtra(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r29 = X.C165607th.A0p(r14)
            X.0wo r0 = r14.A07
            r16 = r0
            X.17Y r15 = r14.A05
            X.0wQ r12 = r14.A02
            X.16S r11 = r14.A05
            X.19A r10 = r14.A06
            X.1EU r9 = r14.A0F
            X.9Sy r8 = r14.A0F
            X.1Vk r7 = r14.A0C
            X.16T r6 = r14.A03
            X.6VM r5 = r14.A0A
            X.1Vu r4 = r14.A08
            X.9gU r3 = r14.A0J
            java.lang.String r2 = r14.A0P
            X.9Qu r1 = new X.9Qu
            r1.<init>(r14, r13)
            X.8g6 r0 = new X.8g6
            r25 = r3
            r26 = r8
            r27 = r1
            r28 = r13
            r30 = r2
            r24 = r9
            r23 = r7
            r22 = r4
            r21 = r5
            r20 = r10
            r19 = r11
            r18 = r6
            r17 = r16
            r16 = r12
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r2 = r0.A04
            X.16S r1 = r0.A04
            X.9un r1 = r1.A07(r2)
            if (r1 == 0) goto L_0x00e1
            X.8bF r1 = r1.A08
            X.8b7 r1 = (X.AnonymousClass8b7) r1
            if (r1 == 0) goto L_0x00e1
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "VISA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e1
            java.lang.String r1 = "PAY: BrazilVerifyCardSendAuthCodeAction sendRequestCardVerification with encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r0.A01()
            return
        L_0x00c9:
            java.lang.String r0 = "failure"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00db
            return
        L_0x00d2:
            java.lang.String r0 = "declined"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00db
            return
        L_0x00db:
            X.6C8 r0 = r14.A01
            X.C179158jJ.A0j(r0, r3, r4)
            return
        L_0x00e1:
            java.lang.String r1 = "PAY: BrazilVerifyCardSendAuthCodeAction sendRequestCardVerification without encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = r0.A03
            X.AnonymousClass8g6.A00(r0, r1)
            return
        L_0x00ec:
            X.6C8 r1 = r14.A01
        L_0x00ee:
            r1.A00(r2)
            return
        L_0x00f2:
            X.C179158jJ.A0j(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public BrazilPayBloksActivity(int i) {
        this.A0Q = false;
        B7Y.A00(this, 37);
    }

    public static void A0F(AnonymousClass6C8 r9, C175798b4 r10, BrazilPayBloksActivity brazilPayBloksActivity, String str, List list, boolean z) {
        C21669AUm aUm;
        HashMap A0J2 = AnonymousClass001.A0J();
        AnonymousClass8b7 r8 = (AnonymousClass8b7) r10.A08;
        A0K(r10, brazilPayBloksActivity, str, A0J2);
        if (z) {
            A0J2.put("verified_state", "1");
        } else {
            if (list == null || list.isEmpty()) {
                if (r8 != null && r8.A07) {
                    A0J2.put("verified_state", "0");
                    A0J2.put("card_need_device_binding", "1");
                }
            } else if (!C201269jE.A01(list)) {
                int A042 = C165587tf.A04(brazilPayBloksActivity, list);
                JSONArray A022 = brazilPayBloksActivity.A07.A02(list);
                if (A022 != null) {
                    int A072 = A07(list);
                    if (!(!brazilPayBloksActivity.A0D.A0E(A042) || A072 == -1 || (aUm = (C21669AUm) list.get(A072)) == null)) {
                        A0J2.put("default_selected_position", String.valueOf(A072));
                        A0L(aUm, A0J2);
                    }
                    A0J2.put("verify_methods", A022.toString());
                }
                A0J2.put("verified_state", "0");
            }
            C179158jJ.A0j(r9, (Map) null, -233);
            return;
        }
        r9.A01("on_success", A0J2);
    }

    public static void A0G(AnonymousClass6C8 r4, BrazilPayBloksActivity brazilPayBloksActivity) {
        C39001qm A002 = AnonymousClass3LW.A00(brazilPayBloksActivity);
        A002.A0q(brazilPayBloksActivity.getString(R.string.f12nameremoved));
        C39001qm.A02(brazilPayBloksActivity, A002, R.string.f12nameremoved);
        A002.A0i(new B83(r4, 19), brazilPayBloksActivity.getString(R.string.f12nameremoved));
        A002.A0b();
    }

    public static void A0K(C175798b4 r4, BrazilPayBloksActivity brazilPayBloksActivity, String str, Map map) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            map.put("callback_url", str);
        }
        map.put("credential_id", r4.A0A);
        int i = r4.A00;
        boolean z = true;
        map.put("is_combo_card", String.valueOf(AnonymousClass000.A1S(i, 6)));
        if (i != 4) {
            z = false;
        }
        map.put("is_credit_card", String.valueOf(z));
        map.put("readable_name", C203449o2.A02(brazilPayBloksActivity, r4));
        C175858bB r2 = (C175858bB) r4.A08;
        if (r2 != null && ((str2 = r2.A0N) == null || !(!"DISABLED".equals(str2)))) {
            map.put("p2p_ineligible", "1");
        }
        map.put("network_name", C175798b4.A02(r4.A01));
        if (r2 != null && !TextUtils.isEmpty(r2.A0E)) {
            map.put("card_image_url", r2.A0E);
        }
    }

    public C1265064h B8t() {
        return this.A06;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.bloks_background_layout).setBackgroundResource(R.drawable.round_rectangle);
        if (getIntent().getIntExtra("extra_setup_mode", 0) != 0) {
            getIntent().putExtra("screen_name", C201649k3.A01(this.A0L, "p2p_context", false));
        }
        String stringExtra = getIntent().getStringExtra("screen_name");
        C18740tg.A05(stringExtra);
        if ("brpay_p_tos".equalsIgnoreCase(stringExtra) || "brpay_p_compliance_kyc_next_screen_router".equalsIgnoreCase(stringExtra)) {
            C197619c0 r7 = this.A0G.A00;
            Intent intent = getIntent();
            if (intent == null || !intent.hasExtra("perf_origin")) {
                r7.A01.A0D("unknown", -1);
            } else {
                long longExtra = intent.getLongExtra("perf_start_time_ns", -1);
                String stringExtra2 = intent.getStringExtra("perf_origin");
                if (stringExtra2 != null) {
                    r7.A01.A0D(stringExtra2, longExtra);
                }
            }
        }
        this.A00.A00 = this.A0K.A00();
        if (!this.A00.A0G() || !this.A00.A0H()) {
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.bloks_progress_bar);
            progressBar.setVisibility(0);
            this.A00.A0F(new C21162AAw(progressBar, this), "on_demand", false);
        } else {
            this.A0Y = true;
        }
        Toolbar A0R = C36411kG.A0R(this);
        if (A0R != null) {
            A0R.setLogo((Drawable) null);
            A0R.setTitle((CharSequence) null);
        }
        this.A0B.A02(new C23157B7r(this, 0));
    }

    public Dialog onCreateDialog(int i) {
        if (i == R.string.f12nameremoved) {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0d(R.string.f12nameremoved);
            A002.A0c(R.string.f12nameremoved);
            A002.A0h(new C163297py(this, 38), R.string.f12nameremoved);
            A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            return A002.create();
        }
        AnonymousClass0FM A012 = this.A0M.A01((Bundle) null, this, i);
        if (A012 == null) {
            return super.onCreateDialog(i);
        }
        return A012;
    }

    public void onDestroy() {
        super.onDestroy();
        C195219Sy r1 = this.A0F;
        r1.A00 = null;
        r1.A03 = false;
        r1.A02 = false;
    }

    public BrazilPayBloksActivity() {
        this(0);
        this.A01 = null;
        this.A0P = null;
        this.A04 = null;
    }
}
