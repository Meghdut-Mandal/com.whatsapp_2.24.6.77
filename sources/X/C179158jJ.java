package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.8jJ  reason: invalid class name and case insensitive filesystem */
public abstract class C179158jJ extends C179168jK implements AnonymousClass15P {
    public C1033354w A00;
    public C122285ub A01;
    public AnonymousClass3U8 A02;
    public C20830yE A03;
    public C20310xM A04;
    public AnonymousClass1C4 A05;
    public C111205bu A06;
    public AnonymousClass1EZ A07;
    public C29221Vu A08;
    public C29231Vv A09;
    public C24601Db A0A;
    public AnonymousClass1Z2 A0B;
    public C29121Vk A0C;
    public C24631De A0D;
    public AnonymousClass1XA A0E;
    public AnonymousClass1EU A0F;
    public AnonymousClass9SJ A0G;
    public C195389Uc A0H;
    public AnonymousClass9RT A0I;
    public C200049gU A0J;
    public AnonymousClass6PS A0K;
    public C1271267b A0L;
    public C24611Dc A0M = C165607th.A0c("PayBloksActivity", "bloks");
    public AnonymousClass646 A0N;
    public AnonymousClass61B A0O;
    public AnonymousClass6VG A0P;
    public C200959iX A0Q;
    public C196039Xk A0R;
    public AnonymousClass97E A0S;
    public C29131Vl A0T;
    public C117705mh A0U;
    public C111495cN A0V;
    public C20380xT A0W;
    public C131376Ou A0X;
    public boolean A0Y = false;
    public PaymentIncentiveViewModel A0Z;
    public AnonymousClass6EW A0a;

    public static int[] A0l(String str) {
        String[] split = str.split("/");
        return new int[]{AnonymousClass6R8.A00(split[0], 0), AnonymousClass6R8.A00(split[1], -2000) + 2000};
    }

    public static String A0Q(String str, Map map) {
        String replaceAll = str.replaceAll("\\s", "");
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            if (C165587tf.A1a(replaceAll, Pattern.compile(C90514aH.A10(A11)))) {
                return C90494aF.A0f(A11);
            }
        }
        return "";
    }

    public static void A0j(AnonymousClass6C8 r2, Map map, int i) {
        if (map == null) {
            map = AnonymousClass001.A0J();
        }
        map.put("error_code", String.valueOf(i));
        r2.A01("on_failure", map);
    }

    public static void A0k(C179158jJ r4) {
        if (!(!r4.A0E)) {
            Bundle A0H2 = C36371kC.A0H(r4);
            C18740tg.A06(A0H2);
            String string = A0H2.getString("screen_name");
            HashMap hashMap = (HashMap) A0H2.getSerializable("screen_params");
            AnonymousClass01z supportFragmentManager = r4.getSupportFragmentManager();
            r4.A05 = BloksDialogFragment.A03(string, hashMap);
            if (hashMap != null) {
                r4.A09.A03(hashMap);
            }
            if (supportFragmentManager.A0I() == 0) {
                AnonymousClass09Y r2 = new AnonymousClass09Y(supportFragmentManager);
                r2.A0B(r4.A05, R.id.bloks_fragment_container);
                r2.A0J(string);
                r2.A02();
                return;
            }
            r4.A3j();
            return;
        }
        r4.A0Y = true;
    }

    public void A3m(AnonymousClass6C8 r13) {
        C195389Uc r2 = this.A0H;
        AnonymousClass9IA r1 = new AnonymousClass9IA(r13, this);
        r2.A00 = "PENDING";
        Context context = r2.A02.A00;
        AnonymousClass17Y r8 = r2.A01;
        AnonymousClass9RT r11 = r2.A05;
        AnonymousClass9NG r6 = new AnonymousClass9NG(context, r8, r2.A03, r2.A04, r11);
        C194649Qo r7 = new C194649Qo(r2, r1);
        AnonymousClass1AL[] A0k = C165617ti.A0k();
        C36381kD.A1N("action", "get-account-eligibility-state", A0k);
        C203399nx A042 = C203399nx.A04("account", A0k);
        C165597tg.A1C(r6.A03, new B7J(r6.A00, r6.A02, r6.A01, r6, r7, 12), A042);
    }

    public void A3n(String str, String str2, HashMap hashMap) {
        String str3;
        if (str2 == null) {
            str3 = "PayBloksActivity/fdsPostProcessing invalid fdsManagerId";
        } else {
            C203639oR A002 = this.A0O.A00(str2);
            if (A002 == null) {
                str3 = "PayBloksActivity/fdsPostProcessing invalid phoenixManager";
            } else {
                C203619oP r0 = A002.A00;
                if (r0 == null) {
                    str3 = "PayBloksActivity/fdsPostProcessing statemachine is null";
                } else {
                    C162097o1 r02 = (C162097o1) r0.A0A(str);
                    if (r02 != null) {
                        r02.B7N(hashMap);
                        return;
                    }
                    return;
                }
            }
        }
        Log.e(str3);
    }

    public boolean BJa(int i) {
        if (i != 404 && i != 440 && i != 449) {
            return false;
        }
        this.A0M.A06(AnonymousClass000.A0r("handleError/error=", AnonymousClass000.A0u(), i));
        this.A0E.A01(true, false);
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0c(R.string.f12nameremoved);
        A002.A0r(false);
        B84.A00(A002, this, 43, R.string.f12nameremoved);
        A002.A0b();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x031b, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x031e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03b9, code lost:
        X.C200959iX.A00(new X.C23197B9f(r4, r7, r3, r2), r4, r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03d6, code lost:
        r1.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03d9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlT(X.AnonymousClass6C8 r24, java.lang.String r25, java.util.Map r26) {
        /*
            r23 = this;
            r5 = r25
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = r24
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = ""
            r1.A00(r0)
        L_0x000f:
            r12 = -1
            int r0 = r5.hashCode()
            r2 = 2
            r4 = 0
            r3 = 1
            switch(r0) {
                case -2131583866: goto L_0x0050;
                case -1828362259: goto L_0x0057;
                case -1432382994: goto L_0x005e;
                case -1371677349: goto L_0x0065;
                case -1032682289: goto L_0x006f;
                case -457979232: goto L_0x0079;
                case -214858504: goto L_0x0083;
                case 20864489: goto L_0x008d;
                case 205988285: goto L_0x0097;
                case 254954716: goto L_0x00a3;
                case 391773106: goto L_0x00af;
                case 641482247: goto L_0x00bb;
                case 711972942: goto L_0x00c7;
                case 761629426: goto L_0x00d3;
                case 927713295: goto L_0x00df;
                case 928063522: goto L_0x00eb;
                case 1032047561: goto L_0x00f7;
                case 1369547730: goto L_0x0103;
                case 1853333482: goto L_0x010f;
                case 1877943783: goto L_0x011b;
                case 1985308587: goto L_0x0127;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.String r6 = "on_success"
            java.lang.String r11 = "is_merchant"
            java.lang.String r10 = "completed_step"
            java.lang.String r8 = "compliance_reason"
            java.lang.String r9 = "pin"
            java.lang.String r0 = "provider"
            java.lang.String r7 = "1"
            r13 = r23
            r5 = r26
            switch(r12) {
                case 0: goto L_0x0133;
                case 1: goto L_0x0155;
                case 2: goto L_0x03c2;
                case 3: goto L_0x0159;
                case 4: goto L_0x0174;
                case 5: goto L_0x0030;
                case 6: goto L_0x0186;
                case 7: goto L_0x019b;
                case 8: goto L_0x01ab;
                case 9: goto L_0x01db;
                case 10: goto L_0x03cf;
                case 11: goto L_0x020d;
                case 12: goto L_0x026a;
                case 13: goto L_0x026f;
                case 14: goto L_0x02b6;
                case 15: goto L_0x031f;
                case 16: goto L_0x0339;
                case 17: goto L_0x0345;
                case 18: goto L_0x0356;
                case 19: goto L_0x0366;
                case 20: goto L_0x03a9;
                default: goto L_0x002f;
            }
        L_0x002f:
            return
        L_0x0030:
            X.07B r1 = r13.getSupportActionBar()
            if (r1 == 0) goto L_0x002f
            com.whatsapp.bloks.ui.BloksDialogFragment r0 = r13.A05
            if (r0 == 0) goto L_0x002f
            java.lang.Boolean r0 = r0.A06
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "action_bar_title"
            java.lang.Object r0 = r5.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.A0Q(r0)
            return
        L_0x0050:
            java.lang.String r0 = "change_pin"
            short r12 = X.C90504aG.A0y(r0, r5)
            goto L_0x001a
        L_0x0057:
            java.lang.String r0 = "get_compliance_status"
            short r12 = X.C90514aH.A1B(r0, r5)
            goto L_0x001a
        L_0x005e:
            java.lang.String r0 = "get_oldest_credential"
            short r12 = X.C90514aH.A1C(r0, r5)
            goto L_0x001a
        L_0x0065:
            java.lang.String r0 = "remove_completed_step"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 3
            goto L_0x001a
        L_0x006f:
            java.lang.String r0 = "verify_pin"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 4
            goto L_0x001a
        L_0x0079:
            java.lang.String r0 = "set_action_bar_title"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 5
            goto L_0x001a
        L_0x0083:
            java.lang.String r0 = "compliance_name_check"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 6
            goto L_0x001a
        L_0x008d:
            java.lang.String r0 = "reinitialize_payments"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 7
            goto L_0x001a
        L_0x0097:
            java.lang.String r0 = "set_completed_step"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 8
            goto L_0x001a
        L_0x00a3:
            java.lang.String r0 = "compliance_dob_check"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 9
            goto L_0x001a
        L_0x00af:
            java.lang.String r0 = "check_camera_permission"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 10
            goto L_0x001a
        L_0x00bb:
            java.lang.String r0 = "get_incentive_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 11
            goto L_0x001a
        L_0x00c7:
            java.lang.String r0 = "fcs_navigate_back_and_finish"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 12
            goto L_0x001a
        L_0x00d3:
            java.lang.String r0 = "remove_credential"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 13
            goto L_0x001a
        L_0x00df:
            java.lang.String r0 = "forward_to_payment_screen"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 14
            goto L_0x001a
        L_0x00eb:
            java.lang.String r0 = "sync_incentive_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 15
            goto L_0x001a
        L_0x00f7:
            java.lang.String r0 = "get_methods"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 16
            goto L_0x001a
        L_0x0103:
            java.lang.String r0 = "create_pin"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 17
            goto L_0x001a
        L_0x010f:
            java.lang.String r0 = "set_sandbox"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 18
            goto L_0x001a
        L_0x011b:
            java.lang.String r0 = "set_navigation_icon"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 19
            goto L_0x001a
        L_0x0127:
            java.lang.String r0 = "set_bio"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 20
            goto L_0x001a
        L_0x0133:
            X.9iX r6 = r13.A0Q
            java.lang.String r2 = A0M(r0, r5)
            java.lang.String r0 = "old_pin"
            java.lang.String r7 = A0M(r0, r5)
            java.lang.String r0 = "new_pin"
            java.lang.String r8 = A0M(r0, r5)
            r0 = 3
            X.BAF r5 = new X.BAF
            r5.<init>(r1, r13, r0)
            r9 = 0
            X.B9c r4 = new X.B9c
            r4.<init>(r5, r6, r7, r8, r9)
            X.C200959iX.A00(r4, r5, r6, r2)
            return
        L_0x0155:
            r13.A3m(r1)
            return
        L_0x0159:
            java.lang.String r2 = X.C36431kI.A1A(r10, r5)
            java.lang.Object r0 = r5.get(r11)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0171
            X.1Vv r1 = r13.A09
        L_0x0169:
            X.1Ea r0 = r1.A04(r2)
            r1.A09(r0)
            return
        L_0x0171:
            X.1EZ r1 = r13.A07
            goto L_0x0169
        L_0x0174:
            X.9iX r7 = r13.A0Q
            java.lang.String r6 = A0M(r0, r5)
            java.lang.String r3 = A0M(r9, r5)
            X.BAF r4 = new X.BAF
            r4.<init>(r1, r13, r2)
            r2 = 3
            goto L_0x03b9
        L_0x0186:
            java.lang.String r0 = "full_name"
            java.lang.String r4 = A0O(r0, r5)
            java.lang.String r3 = A0O(r8, r5)
            X.9Uc r2 = r13.A0H
            X.AEy r0 = new X.AEy
            r0.<init>(r1, r13)
            r2.A01(r0, r4, r3)
            return
        L_0x019b:
            java.lang.String r0 = "remove_tos"
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r7.equals(r0)
            X.1XA r0 = r13.A0E
            r0.A01(r1, r4)
            return
        L_0x01ab:
            java.lang.String r3 = X.C36431kI.A1A(r10, r5)
            java.lang.Object r0 = r5.get(r11)
            boolean r2 = r7.equals(r0)
            java.lang.String r0 = "payment_flow"
            java.lang.String r1 = X.C36431kI.A1A(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01c7
            if (r2 == 0) goto L_0x01d8
            java.lang.String r1 = "merchant_account_linking_context"
        L_0x01c7:
            X.1EU r0 = r13.A0F
            X.1EY r1 = r0.A02(r1)
            X.C18740tg.A06(r1)
            X.1Ea r0 = r1.A04(r3)
            r1.A0A(r0)
            return
        L_0x01d8:
            java.lang.String r1 = "p2p_context"
            goto L_0x01c7
        L_0x01db:
            java.lang.String r0 = "dob"
            java.lang.String r0 = A0M(r0, r5)
            int[] r0 = X.C131826Qu.A02(r0)
            r11 = r0[r4]
            r10 = r0[r3]
            r9 = r0[r2]
            java.lang.String r7 = A0O(r8, r5)
            java.util.AbstractMap r2 = A0h(r13)
            java.lang.String r0 = "fds_manager_id"
            java.lang.String r3 = X.C90504aG.A0l(r0, r2)
            X.6Q3 r2 = r13.A09
            java.lang.String r0 = "onboarding_context"
            java.lang.String r0 = r2.A02(r0)
            X.9Uc r5 = r13.A0H
            r8 = 0
            X.AEv r6 = new X.AEv
            r6.<init>(r1, r13, r0, r3)
            r5.A00(r6, r7, r8, r9, r10, r11)
            return
        L_0x020d:
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = r13.A0Z
            X.00s r0 = r0.A01
            java.lang.Object r2 = r0.A04()
            X.5tn r2 = (X.C121835tn) r2
            if (r2 == 0) goto L_0x0261
            int r0 = r2.A00
            if (r0 == r3) goto L_0x0261
            java.lang.Object r5 = r2.A01
            X.6O3 r5 = (X.AnonymousClass6O3) r5
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            if (r5 == 0) goto L_0x025d
            X.9dE r0 = r5.A01
            if (r0 == 0) goto L_0x0238
            X.9fB r0 = r0.A08
            long r2 = r0.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "param_incentive_offer_id"
            r4.put(r0, r2)
        L_0x0238:
            X.9cl r3 = r5.A02
            if (r3 == 0) goto L_0x025d
            boolean r0 = r3.A04
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_is_eligible"
            r4.put(r0, r2)
            int r0 = r3.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_pending_count"
            r4.put(r0, r2)
            int r0 = r3.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_redeemed_count"
            r4.put(r0, r2)
        L_0x025d:
            r1.A02(r6, r4)
            return
        L_0x0261:
            java.lang.String r0 = "PAY: PayBloksActivity/performAsyncRequest/get incentive data returned an error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r6 = "on_failure"
            goto L_0x03d6
        L_0x026a:
            r13.A0i()
            goto L_0x031b
        L_0x026f:
            X.B8j r6 = new X.B8j
            r6.<init>(r13, r1, r2)
            java.lang.String r0 = "remaining_cards"
            java.lang.String r0 = X.C36431kI.A1A(r0, r5)
            int r0 = X.AnonymousClass6R8.A00(r0, r4)
            if (r0 > r3) goto L_0x02a9
            X.17Y r14 = r13.A05
            X.0wU r7 = r13.A04
            X.1Vl r5 = r13.A0T
            X.1EU r4 = r13.A0F
            X.0xM r15 = r13.A04
            X.1Db r3 = r13.A0A
            X.1Vk r2 = r13.A0C
            X.1XA r1 = r13.A0E
            X.1Vu r0 = r13.A08
            X.9XR r12 = new X.9XR
            r18 = r2
            r19 = r1
            r20 = r4
            r21 = r5
            r22 = r7
            r16 = r0
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r12.A00(r6)
            return
        L_0x02a9:
            X.1Vk r2 = r13.A0C
            java.lang.String r0 = "credential_id"
            java.lang.String r1 = X.C36431kI.A1A(r0, r5)
            r0 = 0
            r2.A0D(r6, r0, r1, r0)
            return
        L_0x02b6:
            android.content.Context r1 = r13.getApplicationContext()
            X.1EU r0 = r13.A0F
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BHH()
            android.content.Intent r2 = X.C36441kJ.A0H(r1, r0)
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r1 = "extra_conversation_message_type"
            int r0 = r3.getIntExtra(r1, r4)
            r2.putExtra(r1, r0)
            java.lang.String r0 = "extra_jid"
            X.C165597tg.A0y(r3, r2, r0)
            java.lang.String r0 = "extra_receiver_jid"
            X.C165597tg.A0y(r3, r2, r0)
            java.lang.String r4 = "extra_quoted_msg_row_id"
            r0 = 0
            long r0 = r3.getLongExtra(r4, r0)
            r2.putExtra(r4, r0)
            java.lang.String r0 = "extra_payment_preset_amount"
            X.C165597tg.A0y(r3, r2, r0)
            java.lang.String r0 = "extra_transaction_id"
            X.C165597tg.A0y(r3, r2, r0)
            java.lang.String r0 = "extra_payment_preset_min_amount"
            X.C165597tg.A0y(r3, r2, r0)
            java.lang.String r0 = "extra_request_message_key"
            X.C165597tg.A0y(r3, r2, r0)
            java.lang.String r1 = "extra_is_pay_money_only"
            r0 = 1
            boolean r0 = r3.getBooleanExtra(r1, r0)
            r2.putExtra(r1, r0)
            java.lang.String r0 = "extra_payment_note"
            X.C165597tg.A0y(r3, r2, r0)
            java.lang.String r0 = "extra_mentioned_jids"
            X.C165597tg.A0y(r3, r2, r0)
            java.lang.String r0 = "extra_inviter_jid"
            X.C165597tg.A0y(r3, r2, r0)
            r0 = 0
            r13.A33(r2, r0)
        L_0x031b:
            r13.finish()
            return
        L_0x031f:
            java.lang.String r0 = "param_force_incentive_claim_info_sync"
            java.lang.Object r0 = r5.get(r0)
            boolean r0 = r7.equals(r0)
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r2 = r13.A0Z
            if (r0 == 0) goto L_0x0335
            X.0wU r1 = r2.A07
            r0 = 8
            X.C165597tg.A1E(r1, r2, r0)
            return
        L_0x0335:
            r2.A0T(r3)
            return
        L_0x0339:
            r0 = 3
            X.B8j r2 = new X.B8j
            r2.<init>(r13, r1, r0)
            X.1Vk r0 = r13.A0C
            r0.A09(r2)
            return
        L_0x0345:
            X.9iX r7 = r13.A0Q
            java.lang.String r6 = A0M(r0, r5)
            java.lang.String r3 = A0M(r9, r5)
            r2 = 0
            X.BAF r4 = new X.BAF
            r4.<init>(r1, r13, r2)
            goto L_0x03b9
        L_0x0356:
            java.lang.String r0 = "is_sandbox"
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r7.equals(r0)
            X.1Db r0 = r13.A0A
            r0.A0P(r1)
            return
        L_0x0366:
            java.lang.String r0 = "navigation_icon"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "close"
            boolean r2 = r0.equals(r1)
            java.lang.String r0 = "icon_color_filter"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "white"
            boolean r3 = r0.equals(r1)
            X.0ts r1 = r13.A00
            r0 = 2131231957(0x7f0804d5, float:1.808001E38)
            if (r2 == 0) goto L_0x0388
            r0 = 2131232176(0x7f0805b0, float:1.8080454E38)
        L_0x0388:
            X.4vb r2 = X.C91364bt.A00(r13, r1, r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131100250(0x7f06025a, float:1.7812876E38)
            if (r3 == 0) goto L_0x0398
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
        L_0x0398:
            int r1 = r1.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r1, r0)
            androidx.appcompat.widget.Toolbar r0 = X.C36411kG.A0R(r13)
            r0.setNavigationIcon((android.graphics.drawable.Drawable) r2)
            return
        L_0x03a9:
            X.9iX r7 = r13.A0Q
            java.lang.String r6 = A0M(r0, r5)
            java.lang.String r3 = A0M(r9, r5)
            r0 = 1
            X.BAF r4 = new X.BAF
            r4.<init>(r1, r13, r0)
        L_0x03b9:
            X.B9f r0 = new X.B9f
            r0.<init>(r4, r7, r3, r2)
            X.C200959iX.A00(r0, r4, r7, r6)
            return
        L_0x03c2:
            X.0wU r3 = r13.A04
            X.1EU r2 = r13.A0F
            X.8qw r0 = new X.8qw
            r0.<init>(r1, r2)
            X.C36391kE.A1Q(r0, r3)
            return
        L_0x03cf:
            X.0yE r2 = r13.A03
            r0 = 30
            com.whatsapp.RequestPermissionActivity.A0I(r13, r2, r0)
        L_0x03d6:
            r1.A00(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179158jJ.BlT(X.6C8, java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0238, code lost:
        if (r0 == false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x023a, code lost:
        return "1";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String BlW(java.lang.String r22, java.util.Map r23) {
        /*
            r21 = this;
            java.lang.String r0 = "case"
            r7 = r23
            java.lang.Object r1 = r7.remove(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r15 = ""
            if (r0 != 0) goto L_0x0032
            r14 = -1
            int r0 = r1.hashCode()
            r2 = 8
            r9 = 2
            r17 = 0
            r8 = 1
            switch(r0) {
                case -2090067461: goto L_0x0157;
                case -1486928264: goto L_0x014f;
                case -1347269146: goto L_0x0147;
                case -1344002586: goto L_0x013c;
                case -1145142119: goto L_0x0131;
                case -1060255204: goto L_0x0126;
                case -1003060006: goto L_0x011b;
                case -985374640: goto L_0x0110;
                case -975395056: goto L_0x0104;
                case -919584206: goto L_0x00f8;
                case -848949171: goto L_0x00ec;
                case -840371252: goto L_0x00e0;
                case -594428356: goto L_0x00d4;
                case -314691285: goto L_0x00c8;
                case 1809539: goto L_0x00bc;
                case 329749850: goto L_0x00b0;
                case 425265908: goto L_0x00a4;
                case 540049915: goto L_0x0098;
                case 580608584: goto L_0x008d;
                case 674867313: goto L_0x0082;
                case 1518694893: goto L_0x0077;
                case 1785060649: goto L_0x006c;
                case 1976375430: goto L_0x0061;
                case 1999013019: goto L_0x0056;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.String r13 = "on_success"
            java.lang.String r12 = "is_hide"
            java.lang.String r11 = "on_failure"
            java.lang.String r10 = "0"
            r5 = 0
            java.lang.String r6 = "1"
            r4 = r21
            r3 = r22
            switch(r14) {
                case 0: goto L_0x0304;
                case 1: goto L_0x0175;
                case 2: goto L_0x015f;
                case 3: goto L_0x02a7;
                case 4: goto L_0x0273;
                case 5: goto L_0x02e1;
                case 6: goto L_0x0254;
                case 7: goto L_0x003e;
                case 8: goto L_0x023c;
                case 9: goto L_0x0033;
                case 10: goto L_0x021e;
                case 11: goto L_0x0206;
                case 12: goto L_0x01f5;
                case 13: goto L_0x02e8;
                case 14: goto L_0x01ea;
                case 15: goto L_0x01d4;
                case 16: goto L_0x01c9;
                case 17: goto L_0x01c2;
                case 18: goto L_0x01bd;
                case 19: goto L_0x0311;
                case 20: goto L_0x017f;
                case 21: goto L_0x01b2;
                case 22: goto L_0x0197;
                case 23: goto L_0x0182;
                default: goto L_0x0032;
            }
        L_0x0032:
            return r15
        L_0x0033:
            java.lang.String r1 = X.C36431kI.A1A(r3, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0032
            return r1
        L_0x003e:
            androidx.appcompat.widget.Toolbar r1 = X.C36411kG.A0R(r4)
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.widget.PayToolbar
            if (r0 == 0) goto L_0x0032
            com.whatsapp.payments.ui.widget.PayToolbar r1 = (com.whatsapp.payments.ui.widget.PayToolbar) r1
            java.lang.Object r0 = r7.get(r12)
            boolean r0 = r6.equals(r0)
            r0 = r0 ^ 1
            r1.setLockIconVisibility(r0)
            return r15
        L_0x0056:
            java.lang.String r0 = "get_merchant_fees"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 23
            goto L_0x0020
        L_0x0061:
            java.lang.String r0 = "string_replace"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 22
            goto L_0x0020
        L_0x006c:
            java.lang.String r0 = "get_pin_retry_ts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 21
            goto L_0x0020
        L_0x0077:
            java.lang.String r0 = "is_debug_build"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 20
            goto L_0x0020
        L_0x0082:
            java.lang.String r0 = "get_error_string"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 19
            goto L_0x0020
        L_0x008d:
            java.lang.String r0 = "get_card_network"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 18
            goto L_0x0020
        L_0x0098:
            java.lang.String r0 = "get_device_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 17
            goto L_0x0020
        L_0x00a4:
            java.lang.String r0 = "string_upper"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 16
            goto L_0x0020
        L_0x00b0:
            java.lang.String r0 = "get_formatted_date"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 15
            goto L_0x0020
        L_0x00bc:
            java.lang.String r0 = "current_server_time"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 14
            goto L_0x0020
        L_0x00c8:
            java.lang.String r0 = "get_screen_density_bucket"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 13
            goto L_0x0020
        L_0x00d4:
            java.lang.String r0 = "can_set_bio"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 12
            goto L_0x0020
        L_0x00e0:
            java.lang.String r0 = "show_action_bar_icon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 11
            goto L_0x0020
        L_0x00ec:
            java.lang.String r0 = "is_step_completed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 10
            goto L_0x0020
        L_0x00f8:
            java.lang.String r0 = "get_button_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 9
            goto L_0x0020
        L_0x0104:
            java.lang.String r0 = "regex_check"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 8
            goto L_0x0020
        L_0x0110:
            java.lang.String r0 = "hide_lock_icon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 7
            goto L_0x0020
        L_0x011b:
            java.lang.String r0 = "get_faq_uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 6
            goto L_0x0020
        L_0x0126:
            java.lang.String r0 = "get_tos_uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 5
            goto L_0x0020
        L_0x0131:
            java.lang.String r0 = "exp_date_check"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 4
            goto L_0x0020
        L_0x013c:
            java.lang.String r0 = "get_phone_last_n_digits"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r14 = 3
            goto L_0x0020
        L_0x0147:
            java.lang.String r0 = "hide_toolbar_bottom_divider"
            short r14 = X.C90514aH.A1C(r0, r1)
            goto L_0x0020
        L_0x014f:
            java.lang.String r0 = "enable_secure_flag"
            short r14 = X.C90514aH.A1B(r0, r1)
            goto L_0x0020
        L_0x0157:
            java.lang.String r0 = "hide_toolbar_title_and_logo"
            short r14 = X.C90504aG.A0y(r0, r1)
            goto L_0x0020
        L_0x015f:
            r0 = 2131434773(0x7f0b1d15, float:1.849137E38)
            android.view.View r1 = r4.findViewById(r0)
            java.lang.Object r0 = r7.get(r12)
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0171
            r2 = 0
        L_0x0171:
            r1.setVisibility(r2)
            return r15
        L_0x0175:
            android.view.Window r1 = r4.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
            return r15
        L_0x017f:
            r0 = 0
            goto L_0x0238
        L_0x0182:
            X.1De r0 = r4.A0D
            r0.A01()
            X.5bu r0 = r4.A06
            if (r0 != 0) goto L_0x0192
            X.5bu r0 = new X.5bu
            r0.<init>()
            r4.A06 = r0
        L_0x0192:
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0D()
            throw r0
        L_0x0197:
            if (r22 == 0) goto L_0x0337
            java.lang.String r0 = "string_to_replace"
            java.lang.String r2 = X.C36431kI.A1A(r0, r7)
            java.lang.String r0 = "string_replacement"
            java.lang.String r1 = X.C36431kI.A1A(r0, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x02e0
            if (r1 == 0) goto L_0x02e0
            java.lang.String r5 = r3.replaceAll(r2, r1)
            return r5
        L_0x01b2:
            X.9Xk r0 = r4.A0R
            long r0 = r0.A00()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            return r5
        L_0x01bd:
            java.lang.String r5 = A0Q(r3, r7)
            return r5
        L_0x01c2:
            X.1Vl r0 = r4.A0T
            java.lang.String r5 = r0.A01()
            return r5
        L_0x01c9:
            X.0ts r0 = r4.A00
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            java.lang.String r5 = r3.toUpperCase(r0)
            return r5
        L_0x01d4:
            java.lang.String r0 = "date"
            java.lang.String r0 = A0M(r0, r7)
            java.util.Date r1 = X.C131826Qu.A01(r0)
            if (r1 == 0) goto L_0x01e9
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r8)
            java.lang.String r5 = r0.format(r1)
            return r5
        L_0x01e9:
            return r15
        L_0x01ea:
            X.0wo r0 = r4.A07
            long r0 = X.C19970wo.A00(r0)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            return r5
        L_0x01f5:
            X.6VG r0 = r4.A0P
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x023b
            X.6VG r0 = r4.A0P
            int r0 = r0.A02()
            if (r0 == r8) goto L_0x023b
            return r6
        L_0x0206:
            X.07B r1 = r4.getSupportActionBar()
            if (r1 == 0) goto L_0x0337
            com.whatsapp.bloks.ui.BloksDialogFragment r0 = r4.A05
            if (r0 == 0) goto L_0x0337
            java.lang.Boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0337
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0337
            r1.A0M(r5)
            return r5
        L_0x021e:
            java.lang.String r0 = "completed_step"
            java.lang.String r2 = X.C36431kI.A1A(r0, r7)
            java.lang.String r0 = "is_merchant"
            java.lang.Object r0 = r7.get(r0)
            boolean r1 = r6.equals(r0)
            X.1EZ r0 = r4.A07
            if (r1 == 0) goto L_0x0234
            X.1Vv r0 = r4.A09
        L_0x0234:
            boolean r0 = r0.A0G(r2)
        L_0x0238:
            if (r0 == 0) goto L_0x023b
            return r6
        L_0x023b:
            return r10
        L_0x023c:
            java.lang.String r0 = "regex"
            java.lang.String r0 = X.C36431kI.A1A(r0, r7)
            X.C18740tg.A06(r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r9)     // Catch:{ PatternSyntaxException -> 0x0251 }
            boolean r0 = X.C165587tf.A1a(r3, r0)     // Catch:{ PatternSyntaxException -> 0x0251 }
            if (r0 != 0) goto L_0x0250
            return r11
        L_0x0250:
            return r13
        L_0x0251:
            java.lang.String r0 = "on_exception"
            return r0
        L_0x0254:
            java.lang.String r0 = "platform"
            java.lang.String r2 = X.C36431kI.A1A(r0, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0262
            java.lang.String r2 = "payments"
        L_0x0262:
            X.0xT r1 = r4.A0W
            java.lang.String r0 = "article_id"
            java.lang.String r0 = X.C36431kI.A1A(r0, r7)
            android.net.Uri r0 = X.C20380xT.A00(r5, r1, r2, r0, r5)
            java.lang.String r5 = r0.toString()
            return r5
        L_0x0273:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = "MM/yy"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r1, r2)
            java.util.Calendar r14 = java.util.Calendar.getInstance()
            int r15 = r14.get(r8)
            int r16 = r14.get(r9)
            r18 = 23
            r19 = 59
            r20 = 59
            r14.set(r15, r16, r17, r18, r19, r20)
            java.util.Date r1 = r0.parse(r3)     // Catch:{ ParseException -> 0x02a6 }
            if (r1 == 0) goto L_0x02a3
            java.util.Date r0 = r14.getTime()     // Catch:{ ParseException -> 0x02a6 }
            boolean r0 = r1.before(r0)     // Catch:{ ParseException -> 0x02a6 }
            if (r0 != 0) goto L_0x02a3
            r17 = 1
        L_0x02a3:
            if (r17 == 0) goto L_0x02a6
            return r13
        L_0x02a6:
            return r11
        L_0x02a7:
            java.lang.String r0 = "num_of_digits"
            java.lang.String r1 = X.C36431kI.A1A(r0, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02e0
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02d8 }
            X.0wQ r0 = r4.A02     // Catch:{ NumberFormatException -> 0x02d8 }
            r0.A0G()     // Catch:{ NumberFormatException -> 0x02d8 }
            X.142 r0 = r0.A0E     // Catch:{ NumberFormatException -> 0x02d8 }
            X.11F r0 = X.C36351kA.A0j(r0)     // Catch:{ NumberFormatException -> 0x02d8 }
            java.lang.String r5 = X.AnonymousClass3U8.A05(r0)     // Catch:{ NumberFormatException -> 0x02d8 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ NumberFormatException -> 0x02d8 }
            if (r0 != 0) goto L_0x0337
            int r0 = r5.length()     // Catch:{ NumberFormatException -> 0x02d8 }
            if (r0 <= r1) goto L_0x0337
            int r0 = r0 - r1
            java.lang.String r5 = r5.substring(r0)     // Catch:{ NumberFormatException -> 0x02d8 }
            return r5
        L_0x02d8:
            r2 = move-exception
            X.1Dc r1 = r4.A0M
            java.lang.String r0 = "performDataProcessingAction: REQUESTED_CASE_GET_PHONE_LAST_N_DIGITS: illegal num_of_digits"
            r1.A0A(r0, r2)
        L_0x02e0:
            return r22
        L_0x02e1:
            X.1N3 r0 = r4.A04
            java.lang.String r5 = X.C165597tg.A0k(r0, r3)
            return r5
        L_0x02e8:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.WindowManager r0 = r4.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r1 = r1.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x0301
            java.lang.String r5 = "hdpi_or_smaller"
            return r5
        L_0x0301:
            java.lang.String r5 = "larger_than_hdpi"
            return r5
        L_0x0304:
            androidx.appcompat.widget.Toolbar r0 = X.C36411kG.A0R(r4)
            if (r0 == 0) goto L_0x0337
            r0.setLogo((android.graphics.drawable.Drawable) r5)
            r0.setTitle((java.lang.CharSequence) r5)
            return r5
        L_0x0311:
            X.0yC r1 = r4.A0D
            r0 = 698(0x2ba, float:9.78E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0321
            X.6PS r0 = r4.A0K
            java.lang.String r5 = r0.A03(r3)
        L_0x0321:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0337
            java.lang.String r5 = X.C36431kI.A1A(r3, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0337
            java.lang.String r0 = "100"
            java.lang.String r5 = X.C36431kI.A1A(r0, r7)
        L_0x0337:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179158jJ.BlW(java.lang.String, java.util.Map):java.lang.String");
    }

    public void onDestroy() {
        AnonymousClass6EW r0 = this.A0a;
        if (r0 != null) {
            r0.A04(this);
            this.A0a = null;
        }
        super.onDestroy();
    }

    public static String A0M(Object obj, Map map) {
        Object obj2 = map.get(obj);
        C18740tg.A06(obj2);
        return (String) obj2;
    }

    public static String A0O(Object obj, Map map) {
        String str = (String) map.get(obj);
        C18740tg.A05(str);
        return str;
    }

    public static AbstractMap A0h(Activity activity) {
        return (AbstractMap) activity.getIntent().getSerializableExtra("screen_params");
    }

    private void A0i() {
        String str;
        AbstractMap A0h = A0h(this);
        if (A0h != null) {
            str = C90504aG.A0l("fds_resource_id", A0h);
        } else {
            str = null;
        }
        AbstractMap A0h2 = A0h(this);
        if (A0h2 != null) {
            String A0l = C90504aG.A0l("fds_manager_id", A0h2);
            if (str != null && A0l != null) {
                HashMap A0J2 = AnonymousClass001.A0J();
                A0J2.put("action", "on_back_pressed");
                A3n(str, A0l, A0J2);
            }
        }
    }

    public AnonymousClass7fJ A3k() {
        return super.A3i().B7z();
    }

    public void A3l(AnonymousClass6C8 r4) {
        String A0l;
        AbstractMap A0h = A0h(this);
        if (A0h != null && (A0l = C90504aG.A0l("fds_observer_id", A0h)) != null) {
            AnonymousClass6EW A022 = this.A0X.A02(A0l);
            this.A0a = A022;
            A022.A01(new C148976zj(r4, this), AnonymousClass709.class, this);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 30) {
            return;
        }
        if (i2 == -1) {
            A3j();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        A0i();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0Z = C165597tg.A0T(this);
        getWindow().setSoftInputMode(16);
    }

    public void onResume() {
        super.onResume();
        if (this.A0Y) {
            A0k(this);
            this.A0Y = false;
        }
    }

    public void Bgm(int i, int i2) {
    }
}
