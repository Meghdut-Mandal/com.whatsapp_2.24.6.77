package X;

import android.text.TextUtils;
import com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9lr  reason: invalid class name and case insensitive filesystem */
public abstract class C202449lr {
    public static final Set A00;
    public static final Set A01;

    static {
        Integer[] numArr = new Integer[5];
        boolean A1b = C36361kB.A1b(numArr, 401);
        numArr[1] = 402;
        numArr[2] = 403;
        numArr[3] = 419;
        A01 = C165567td.A0g(420, numArr, 4);
        Integer[] numArr2 = new Integer[5];
        AnonymousClass000.A1L(numArr2, 405, A1b ? 1 : 0);
        AnonymousClass000.A1L(numArr2, 416, 1);
        AnonymousClass000.A1L(numArr2, 417, 2);
        AnonymousClass000.A1L(numArr2, 418, 3);
        A00 = C165567td.A0g(421, numArr2, 4);
    }

    public static C23043B1o A00(C20310xM r9, AnonymousClass11F r10, AnonymousClass1DL r11, AnonymousClass8SX r12, AnonymousClass3T1 r13, boolean z) {
        C207199ui r1;
        String str;
        try {
            String A04 = C203219nY.A04(r12);
            if (A04 != null) {
                JSONObject A1C = C36441kJ.A1C(A04);
                String string = A1C.getString("reference_id");
                String A02 = C202869mo.A02(A04);
                if (A02 != null) {
                    String optString = A1C.getJSONObject("order").optString("description");
                    Iterator it = AnonymousClass1FF.A00(r9.A0d, r10, 4).iterator();
                    while (it.hasNext()) {
                        AnonymousClass3T1 A0l = C36391kE.A0l(it);
                        if (A0l instanceof C23043B1o) {
                            C23043B1o b1o = (C23043B1o) A0l;
                            C207219uk BA8 = b1o.BA8();
                            if (!(BA8 == null || (r1 = BA8.A01) == null || !string.equals(r1.A0F))) {
                                int A002 = C207199ui.A00(r1.A09.A01);
                                int A003 = C207199ui.A00(A02);
                                Set set = (Set) C36371kC.A0r(C207199ui.A0P, A002);
                                if ((set == null || !AnonymousClass000.A1Z(set, A003)) && A002 != A003) {
                                    AnonymousClass164 r3 = r11.A01;
                                    C64933Qa r0 = r13.A1J;
                                    AnonymousClass11F r2 = r0.A00;
                                    C18740tg.A06(r2);
                                    r3.A01(new SendOrderStatusUpdateFailureReceiptJob(r2, r0.A01));
                                    throw C165567td.A0J(0);
                                }
                                C207199ui r5 = BA8.A01;
                                r5.A09.A01 = A02;
                                if (z && A02.equals("payment_requested") && (str = r5.A05) != null && str.equals("captured")) {
                                    r5.A05 = "pending";
                                    r5.A01 = System.currentTimeMillis();
                                }
                                if (!TextUtils.isEmpty(optString)) {
                                    BA8.A01.A09.A00 = optString;
                                }
                                r9.A0k((AnonymousClass3T1) b1o);
                                return b1o;
                            }
                        } else {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("InteractiveMessageCheckoutInfoConverter/updateOrderStatusInCheckoutInfoMessage: Checkout message should use InteractiveMessage interface. Message row id = ");
                            A0u.append(A0l.A1N);
                            C90504aG.A1G(A0u);
                        }
                    }
                    C36321k7.A1P("InteractiveMessageCheckoutInfoConverter/updateOrderStatusInCheckoutInfoMessage can not find origin checkout NFM with reference id: ", string, AnonymousClass000.A0u());
                }
            }
            return null;
        } catch (JSONException e) {
            Log.e("InteractiveMessageCheckoutInfoConverter/updateOrderStatusInCheckoutInfoMessage failed to parse parameters json", e);
            return null;
        }
    }

    public static C23043B1o A01(C20310xM r12, AnonymousClass11F r13, AnonymousClass8SX r14, boolean z) {
        C207199ui r0;
        try {
            String A04 = C203219nY.A04(r14);
            if (A04 != null) {
                String string = C36441kJ.A1C(A04).getString("reference_id");
                JSONObject A1C = C36441kJ.A1C(A04);
                long optLong = A1C.optLong("payment_timestamp", 0);
                String optString = A1C.optString("payment_status");
                String optString2 = A1C.optString("payment_method");
                Iterator it = AnonymousClass1FF.A00(r12.A0d, r13, 4).iterator();
                while (it.hasNext()) {
                    AnonymousClass3T1 A0l = C36391kE.A0l(it);
                    if (A0l instanceof C23043B1o) {
                        C23043B1o b1o = (C23043B1o) A0l;
                        C207219uk BA8 = b1o.BA8();
                        if (!(BA8 == null || (r0 = BA8.A01) == null || !string.equals(r0.A0F))) {
                            if (!TextUtils.isEmpty(optString)) {
                                C207199ui r10 = BA8.A01;
                                r10.A05 = optString;
                                if (z) {
                                    if (optString.equals("captured")) {
                                        C207009uP r3 = r10.A09;
                                        if (r3.A01.equals("payment_requested")) {
                                            r3.A01 = "preparing_to_ship";
                                        }
                                    }
                                    if (optString.equals("pending")) {
                                        C207009uP r32 = r10.A09;
                                        if (r32.A01.equals("preparing_to_ship")) {
                                            r32.A01 = "payment_requested";
                                        }
                                    }
                                }
                            }
                            if (optLong > 0) {
                                BA8.A01.A01 = optLong;
                            }
                            if (!TextUtils.isEmpty(optString2)) {
                                BA8.A01.A04 = optString2;
                            }
                            r12.A0k((AnonymousClass3T1) b1o);
                            return b1o;
                        }
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("InteractiveMessageCheckoutInfoConverter/updateOrderPaymentMethodInCheckoutInfoMessage: Checkout message should use InteractiveMessage interface. Message row id = ");
                        A0u.append(A0l.A1N);
                        C90504aG.A1G(A0u);
                    }
                }
                C36321k7.A1P("InteractiveMessageCheckoutInfoConverter/updateOrderPaymentMethodInCheckoutInfoMessage can not find origin checkout NFM with reference id: ", string, AnonymousClass000.A0u());
            }
            return null;
        } catch (JSONException e) {
            Log.e("InteractiveMessageCheckoutInfoConverter/updateOrderPaymentMethodInCheckoutInfoMessage failed to parse parameters json", e);
            return null;
        }
    }

    public static void A02(AnonymousClass17Y r11, C20310xM r12, C24881Ed r13, AnonymousClass4T4 r14, AnonymousClass1XC r15, C23043B1o b1o, C19770wU r17) {
        C207199ui r0;
        Set set;
        C23043B1o b1o2 = b1o;
        C207219uk BA8 = b1o2.BA8();
        AnonymousClass4T4 r6 = r14;
        if (!(BA8 == null || (r0 = BA8.A01) == null)) {
            C207009uP r02 = r0.A09;
            C206899uB r1 = r02.A02;
            int A002 = C207199ui.A00(r02.A01);
            if (r1 != null && r1.A00 <= C36391kE.A0B(System.currentTimeMillis()) && (((set = (Set) C36371kC.A0r(C207199ui.A0P, A002)) != null && AnonymousClass000.A1Z(set, 4)) || A002 == 4)) {
                String str = b1o2.BA8().A01.A06;
                C20310xM r4 = r12;
                C19770wU r9 = r17;
                if (TextUtils.isEmpty(str)) {
                    C81193wc.A01(r9, b1o2, r12, 24);
                    r14.Bha();
                    return;
                }
                r9.Boy(new AnonymousClass750(r11, r4, r13, r6, r15, b1o2, r9, str));
                return;
            }
        }
        r14.BhX();
    }
}
