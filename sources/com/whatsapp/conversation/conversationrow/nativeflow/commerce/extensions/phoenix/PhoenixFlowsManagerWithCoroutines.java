package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass185;
import X.AnonymousClass1K9;
import X.AnonymousClass1KK;
import X.AnonymousClass1KT;
import X.AnonymousClass1KW;
import X.AnonymousClass1VZ;
import X.AnonymousClass3L0;
import X.AnonymousClass3T1;
import X.AnonymousClass5SG;
import X.AnonymousClass691;
import X.AnonymousClass6CM;
import X.AnonymousClass6E7;
import X.AnonymousClass6MJ;
import X.AnonymousClass6NP;
import X.AnonymousClass6OE;
import X.AnonymousClass6PG;
import X.AnonymousClass6UH;
import X.AnonymousClass7hO;
import X.AnonymousClass9Xu;
import X.C005502l;
import X.C1037856y;
import X.C110465ai;
import X.C117105li;
import X.C121585tN;
import X.C1268565x;
import X.C128716Di;
import X.C131376Ou;
import X.C132586Uj;
import X.C132826Vk;
import X.C134906bn;
import X.C159657ji;
import X.C165387tL;
import X.C18820ts;
import X.C19600wD;
import X.C19630wG;
import X.C19970wo;
import X.C20310xM;
import X.C203639oR;
import X.C206569tc;
import X.C207089uX;
import X.C207219uk;
import X.C20810yC;
import X.C23043B1o;
import X.C25851Hx;
import X.C26451Kf;
import X.C26461Kg;
import X.C26491Kj;
import X.C26501Kk;
import X.C26551Kp;
import X.C27761Ps;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C64933Qa;
import X.C66013Ui;
import X.C90464aC;
import X.C90494aF;
import X.C90504aG;
import X.C90514aH;
import X.C90524aI;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class PhoenixFlowsManagerWithCoroutines {
    public int A00;
    public C203639oR A01;
    public final AnonymousClass1K9 A02;
    public final AnonymousClass1KK A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass185 A05;
    public final C27761Ps A06;
    public final AnonymousClass6OE A07;
    public final C117105li A08;
    public final C19970wo A09;
    public final C19630wG A0A;
    public final AnonymousClass1KW A0B;
    public final AnonymousClass6NP A0C;
    public final C26461Kg A0D;
    public final C26501Kk A0E;
    public final C26491Kj A0F;
    public final AnonymousClass1KT A0G;
    public final C1037856y A0H;
    public final C26451Kf A0I;
    public final C26551Kp A0J;
    public final C20810yC A0K;
    public final C1268565x A0L;
    public final C131376Ou A0M;
    public final AnonymousClass005 A0N;
    public final AtomicBoolean A0O = C36431kI.A1H();
    public final C005502l A0P;
    public final AnonymousClass040 A0Q;
    public final C19600wD A0R;
    public final C18820ts A0S;
    public final C25851Hx A0T;
    public final C20310xM A0U;
    public final AnonymousClass1VZ A0V;
    public final AnonymousClass6MJ A0W;
    public final C005502l A0X;

    public static final boolean A0A(String str, String str2) {
        try {
            if (Long.parseLong(str) >= 3) {
                if (str2 == null || str2.length() == 0 || "navigate".equals(str2)) {
                    return true;
                }
                return false;
            }
        } catch (NumberFormatException e) {
            Log.w(C36331k8.A0i("SExtensionsLogger/PhoenixExtensionsFlowManager/isExtensionInitWithoutDataChannel()/Error - ", AnonymousClass000.A0u(), e));
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: X.7hO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass6E7 r24, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r25, X.C128716Di r26, X.AnonymousClass7hO r27, X.C159657ji r28, java.lang.String r29, X.C023509x r30) {
        /*
            r7 = r30
            r4 = r25
            r5 = r24
            r18 = r29
            r19 = r27
            r3 = r28
            boolean r0 = r7 instanceof X.AnonymousClass7BB
            if (r0 == 0) goto L_0x0265
            r6 = r7
            X.7BB r6 = (X.AnonymousClass7BB) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0265
            int r2 = r2 - r1
            r6.label = r2
        L_0x001e:
            java.lang.Object r1 = r6.result
            X.0AO r20 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0077
            if (r0 == r8) goto L_0x0073
            if (r0 != r7) goto L_0x026c
            boolean r12 = r6.Z$0
            java.lang.Object r11 = r6.L$6
            X.691 r11 = (X.AnonymousClass691) r11
            java.lang.Object r10 = r6.L$5
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r3 = r6.L$4
            X.7ji r3 = (X.C159657ji) r3
            java.lang.Object r0 = r6.L$3
            r19 = r0
            r0 = r19
            X.7hO r0 = (X.AnonymousClass7hO) r0
            r19 = r0
            java.lang.Object r0 = r6.L$2
            r18 = r0
            r0 = r18
            java.lang.String r0 = (java.lang.String) r0
            r18 = r0
            java.lang.Object r5 = r6.L$1
            X.6E7 r5 = (X.AnonymousClass6E7) r5
            java.lang.Object r4 = r6.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines) r4
            X.AnonymousClass0AN.A00(r1)
        L_0x0059:
            X.011 r1 = (X.AnonymousClass011) r1
            java.lang.Object r0 = r1.first
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x0253
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "UNKNOWN"
        L_0x006b:
            java.lang.String r0 = r5.A05
            A08(r4, r3, r1, r0)
        L_0x0070:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0073:
            X.AnonymousClass0AN.A00(r1)
            goto L_0x0070
        L_0x0077:
            X.AnonymousClass0AN.A00(r1)
            java.lang.String r0 = r5.A05
            r23 = r0
            X.5li r10 = r4.A08
            X.011[] r9 = new X.AnonymousClass011[r7]
            com.whatsapp.jid.UserJid r0 = r5.A02
            r22 = r0
            java.lang.String r1 = "chat_jid"
            X.011 r0 = X.C36441kJ.A19(r1, r0)
            r11 = 0
            r9[r11] = r0
            java.lang.String r2 = r5.A08
            java.lang.String r0 = "key_msg_id"
            X.C36341k9.A1J(r0, r2, r9, r8)
            java.util.LinkedHashMap r1 = X.C000400e.A07(r9)
            X.AnonymousClass00C.A0D(r1, r11)
            java.util.HashMap r0 = r10.A00
            r0.clear()
            r0.putAll(r1)
            r0 = 17
            X.011[] r10 = new X.AnonymousClass011[r0]
            java.lang.String r9 = r5.A06
            java.lang.String r1 = r5.A04
            boolean r0 = A0A(r9, r1)
            if (r0 == 0) goto L_0x021d
            java.lang.String r0 = "navigate"
        L_0x00b5:
            java.lang.String r12 = "action"
            X.C36341k9.A1J(r12, r0, r10, r11)
            boolean r0 = A0A(r9, r1)
            if (r0 == 0) goto L_0x020f
            java.util.Map r12 = r5.A0A
            java.lang.String r17 = "screen"
            r16 = 0
            if (r12 == 0) goto L_0x020b
            r0 = r17
            java.lang.Object r15 = r12.get(r0)
        L_0x00ce:
            java.lang.String r13 = "data"
            if (r12 == 0) goto L_0x00d6
            java.lang.Object r16 = r12.get(r13)
        L_0x00d6:
            X.011[] r12 = new X.AnonymousClass011[r7]
            X.011[] r14 = new X.AnonymousClass011[r7]
            java.lang.String r0 = "name"
            X.C36341k9.A1J(r0, r15, r14, r11)
            java.lang.String r15 = "type"
            r0 = r17
            X.C36341k9.A1J(r15, r0, r14, r8)
            java.util.LinkedHashMap r14 = X.C000400e.A07(r14)
            java.lang.String r0 = "next"
            X.C36341k9.A1J(r0, r14, r12, r11)
            r0 = r16
            X.C36341k9.A1J(r13, r0, r12, r8)
            java.util.LinkedHashMap r12 = X.C000400e.A07(r12)
        L_0x00f8:
            java.lang.String r0 = "action_payload"
            X.C36341k9.A1J(r0, r12, r10, r8)
            java.lang.String r0 = "message_id"
            X.C36341k9.A1J(r0, r2, r10, r7)
            r13 = 3
            java.lang.String r0 = r5.A09
            r16 = r0
            java.lang.String r12 = "session_id"
            X.C36341k9.A1J(r12, r0, r10, r13)
            r13 = 4
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            java.lang.String r12 = "wae"
            java.lang.String r0 = X.AnonymousClass000.A0p(r12, r0, r14)
            java.lang.String r12 = X.C132586Uj.A00(r0)
            java.lang.String r0 = "product_qpl_session_id"
            X.C36341k9.A1J(r0, r12, r10, r13)
            r13 = 5
            java.lang.String r12 = r5.A07
            java.lang.String r0 = "flow_token"
            X.C36341k9.A1J(r0, r12, r10, r13)
            r12 = 6
            java.lang.String r0 = "flow_message_version"
            X.C36341k9.A1J(r0, r9, r10, r12)
            r13 = 7
            java.lang.String r12 = "extension_id"
            r0 = r23
            X.C36341k9.A1J(r12, r0, r10, r13)
            r13 = 8
            java.lang.String r12 = r22.getRawString()
            java.lang.String r0 = "business_jid"
            X.C36341k9.A1J(r0, r12, r10, r13)
            r13 = 9
            java.lang.String r12 = r5.A00
            java.lang.String r0 = "version"
            X.C36341k9.A1J(r0, r12, r10, r13)
            r13 = 10
            boolean r0 = r5.A0B
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_draft"
            X.C36341k9.A1J(r0, r12, r10, r13)
            r13 = 11
            r17 = r26
            r0 = r17
            java.lang.String r12 = r0.A00
            java.lang.String r0 = "extension_status"
            X.C36341k9.A1J(r0, r12, r10, r13)
            r14 = 12
            X.0ts r0 = r4.A0S
            java.lang.String r13 = r0.A07()
            java.lang.String r0 = "user_locale"
            X.C36341k9.A1J(r0, r13, r10, r14)
            r13 = 13
            X.011[] r14 = new X.AnonymousClass011[r7]
            java.lang.String r15 = "type"
            java.lang.String r0 = "modal"
            X.C36341k9.A1J(r15, r0, r14, r11)
            java.lang.String r11 = "modal_type"
            java.lang.String r0 = "bottom_sheet"
            X.C36341k9.A1J(r11, r0, r14, r8)
            java.util.LinkedHashMap r11 = X.C000400e.A07(r14)
            java.lang.String r0 = "style"
            java.util.Map r11 = X.C36391kE.A11(r0, r11)
            java.lang.String r0 = "overwrite_first_screen_presentation"
            X.C36341k9.A1J(r0, r11, r10, r13)
            r13 = 14
            java.lang.String r11 = "galaxy_message"
            java.lang.String r0 = "action_name"
            X.C36341k9.A1J(r0, r11, r10, r13)
            r13 = 15
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "is_modal_on_screen"
            X.C36341k9.A1J(r0, r11, r10, r13)
            r13 = 16
            r0 = r17
            int r0 = r0.A01
            java.lang.Integer r11 = X.C90524aI.A0a(r0)
            java.lang.String r0 = "flow_json_version"
            X.C36341k9.A1J(r0, r11, r10, r13)
            java.util.LinkedHashMap r10 = X.C000400e.A07(r10)
            java.lang.String r0 = "DRAFT"
            boolean r12 = X.AnonymousClass00C.A0J(r12, r0)
            r0 = r23
            X.691 r11 = X.C110485ak.A00(r2, r0)
            X.65x r14 = r4.A0L
            java.lang.String r13 = r11.A00
            X.9XM r0 = r14.A00(r13)
            if (r12 == 0) goto L_0x0224
            if (r0 == 0) goto L_0x0224
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto L_0x0224
            X.0yC r15 = r4.A0K
            r0 = 4819(0x12d3, float:6.753E-42)
            boolean r0 = r15.A0E(r0)
            if (r0 == 0) goto L_0x0221
            java.lang.String r2 = r5.A03
            X.02l r1 = r4.A0X
            r30 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$startExtensionsFlow$2$1 r0 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$startExtensionsFlow$2$1
            r23 = r4
            r24 = r19
            r25 = r3
            r26 = r11
            r27 = r2
            r28 = r18
            r29 = r10
            r22 = r5
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r6.L$0 = r2
            r6.label = r8
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r6, r1, r0)
            r0 = r20
            if (r1 != r0) goto L_0x0070
            return r20
        L_0x020b:
            r15 = r16
            goto L_0x00ce
        L_0x020f:
            java.lang.String r0 = "INIT"
            java.util.Map r12 = X.C36391kE.A11(r12, r0)
            java.lang.String r0 = "business_payload"
            java.util.Map r12 = X.C36391kE.A11(r0, r12)
            goto L_0x00f8
        L_0x021d:
            java.lang.String r0 = "INIT"
            goto L_0x00b5
        L_0x0221:
            r14.A01(r13)
        L_0x0224:
            boolean r0 = A0A(r9, r1)
            if (r0 == 0) goto L_0x0253
            X.1Kg r1 = r4.A0D
            r6.L$0 = r4
            r6.L$1 = r5
            r0 = r18
            r6.L$2 = r0
            r0 = r19
            r6.L$3 = r0
            r6.L$4 = r3
            r6.L$5 = r10
            r6.L$6 = r11
            r6.Z$0 = r12
            r6.label = r7
            r21 = r1
            r24 = r2
            r25 = r16
            r26 = r6
            java.lang.Object r1 = r21.A06(r22, r23, r24, r25, r26)
            r0 = r20
            if (r1 != r0) goto L_0x0059
            return r20
        L_0x0253:
            r13 = r4
            r14 = r19
            r15 = r3
            r16 = r11
            r17 = r18
            r18 = r10
            r19 = r12
            r12 = r5
            A06(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0070
        L_0x0265:
            X.7BB r6 = new X.7BB
            r6.<init>(r4, r7)
            goto L_0x001e
        L_0x026c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A00(X.6E7, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines, X.6Di, X.7hO, X.7ji, java.lang.String, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        if (r1 == r5) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.AnonymousClass6E7 r18, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r19, X.C128716Di r20, X.AnonymousClass7hO r21, X.C159657ji r22, X.C023509x r23) {
        /*
            r3 = r23
            r10 = r19
            r11 = r18
            r9 = r20
            r8 = r21
            r7 = r22
            boolean r0 = r3 instanceof X.AnonymousClass7B2
            if (r0 == 0) goto L_0x0037
            r6 = r3
            X.7B2 r6 = (X.AnonymousClass7B2) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r6.label = r2
        L_0x001e:
            java.lang.Object r1 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r13 = 4
            r12 = 3
            r4 = 1
            r3 = 2
            if (r0 == 0) goto L_0x003d
            if (r0 == r4) goto L_0x0086
            if (r0 == r3) goto L_0x0110
            if (r0 == r12) goto L_0x0110
            if (r0 == r13) goto L_0x0110
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0037:
            X.7B2 r6 = new X.7B2
            r6.<init>(r10, r3)
            goto L_0x001e
        L_0x003d:
            X.AnonymousClass0AN.A00(r1)
            X.1Kp r0 = r10.A0J
            r23 = r0
            java.lang.String r2 = r11.A05
            int r1 = r2.hashCode()
            X.5TS r16 = X.AnonymousClass5TS.USER_INTERACTION
            java.lang.String r15 = r11.A08
            java.lang.String r14 = r11.A09
            boolean r0 = r11.A0B
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r0)
            com.whatsapp.jid.UserJid r0 = r11.A02
            r21 = r14
            r22 = r1
            r17 = r0
            r19 = r2
            r20 = r15
            r15 = r23
            r15.A0C(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r14 = r9.A00
            java.lang.String r0 = "DRAFT"
            boolean r0 = X.AnonymousClass00C.A0J(r14, r0)
            if (r0 != 0) goto L_0x00e6
            X.1Kk r0 = r10.A0E
            r6.L$0 = r10
            r6.L$1 = r11
            r6.L$2 = r9
            r6.L$3 = r8
            r6.L$4 = r7
            r6.label = r4
            java.lang.Object r1 = r0.A01(r2, r6, r1)
            if (r1 != r5) goto L_0x009d
        L_0x0085:
            return r5
        L_0x0086:
            java.lang.Object r7 = r6.L$4
            X.7ji r7 = (X.C159657ji) r7
            java.lang.Object r8 = r6.L$3
            X.7hO r8 = (X.AnonymousClass7hO) r8
            java.lang.Object r9 = r6.L$2
            X.6Di r9 = (X.C128716Di) r9
            java.lang.Object r11 = r6.L$1
            X.6E7 r11 = (X.AnonymousClass6E7) r11
            java.lang.Object r10 = r6.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r10 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines) r10
            X.AnonymousClass0AN.A00(r1)
        L_0x009d:
            X.011 r1 = (X.AnonymousClass011) r1
            java.lang.Object r0 = r1.first
            boolean r13 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r4 = r1.second
            java.lang.String r4 = (java.lang.String) r4
            X.1KT r1 = r10.A0G
            java.lang.String r0 = r11.A05
            int r2 = r0.hashCode()
            java.lang.String r0 = "psl_cache_hit"
            r1.A04(r2, r0, r13)
            r1 = 0
            if (r13 == 0) goto L_0x00d9
            X.1Kp r0 = r10.A0J
            r0.A05(r2, r3)
            if (r4 == 0) goto L_0x010b
            r6.L$0 = r1
            r6.L$1 = r1
            r6.L$2 = r1
            r6.L$3 = r1
            r6.L$4 = r1
            r6.label = r3
            r13 = r9
            r14 = r8
            r15 = r7
            r16 = r4
            r17 = r6
            r12 = r10
            java.lang.Object r0 = A00(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0108
        L_0x00d9:
            r6.L$0 = r1
            r6.L$1 = r1
            r6.L$2 = r1
            r6.L$3 = r1
            r6.L$4 = r1
            r6.label = r12
            goto L_0x00f0
        L_0x00e6:
            X.1KT r3 = r10.A0G
            r2 = 0
            java.lang.String r0 = "psl_cache_hit"
            r3.A04(r1, r0, r2)
            r6.label = r13
        L_0x00f0:
            X.02l r0 = r10.A0P
            r18 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2 r12 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2
            r15 = r9
            r16 = r8
            r17 = r7
            r13 = r11
            r14 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r6, r0, r12)
            if (r0 == r5) goto L_0x0085
            X.0AJ r0 = X.AnonymousClass0AJ.A00
        L_0x0108:
            if (r0 != r5) goto L_0x0113
            return r5
        L_0x010b:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        L_0x0110:
            X.AnonymousClass0AN.A00(r1)
        L_0x0113:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A01(X.6E7, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines, X.6Di, X.7hO, X.7ji, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.AnonymousClass6E7 r12, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r13, X.AnonymousClass7hO r14, X.C159657ji r15, X.C023509x r16, int r17) {
        /*
            r9 = r16
            r5 = r13
            r6 = r12
            r4 = r14
            r3 = r15
            r7 = r17
            boolean r0 = r9 instanceof X.AnonymousClass7B1
            if (r0 == 0) goto L_0x00cf
            r2 = r9
            X.7B1 r2 = (X.AnonymousClass7B1) r2
            int r8 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r8 & r1
            if (r0 == 0) goto L_0x00cf
            int r8 = r8 - r1
            r2.label = r8
        L_0x001a:
            java.lang.Object r12 = r2.result
            X.0AO r1 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r9 = r2.label
            r0 = 2
            r8 = 1
            if (r9 == 0) goto L_0x002e
            if (r9 == r8) goto L_0x005d
            if (r9 != r0) goto L_0x00d6
            X.AnonymousClass0AN.A00(r12)
        L_0x002b:
            X.0AJ r1 = X.AnonymousClass0AJ.A00
            return r1
        L_0x002e:
            X.AnonymousClass0AN.A00(r12)
            java.lang.String r13 = r6.A05
            X.1Kg r10 = r5.A0D
            java.lang.Integer r12 = X.C90524aI.A0a(r7)
            com.whatsapp.jid.UserJid r11 = r6.A02
            java.lang.String r14 = r6.A08
            java.lang.String r15 = r6.A09
            r2.L$0 = r5
            r2.L$1 = r6
            r2.L$2 = r4
            r2.L$3 = r3
            r2.I$0 = r7
            r2.label = r8
            r17 = 0
            X.02l r8 = r10.A05
            r16 = 0
            com.whatsapp.extensions.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2 r9 = new com.whatsapp.extensions.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r12 = X.AnonymousClass0A2.A00(r2, r8, r9)
            if (r12 != r1) goto L_0x0072
            return r1
        L_0x005d:
            int r7 = r2.I$0
            java.lang.Object r3 = r2.L$3
            X.7ji r3 = (X.C159657ji) r3
            java.lang.Object r4 = r2.L$2
            X.7hO r4 = (X.AnonymousClass7hO) r4
            java.lang.Object r6 = r2.L$1
            X.6E7 r6 = (X.AnonymousClass6E7) r6
            java.lang.Object r5 = r2.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r5 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines) r5
            X.AnonymousClass0AN.A00(r12)
        L_0x0072:
            X.6CM r12 = (X.AnonymousClass6CM) r12
            A05(r6, r5, r12, r7)
            X.5tN r11 = r12.A00
            r10 = 0
            if (r11 == 0) goto L_0x00bf
            java.util.List r7 = r11.A02
            java.util.Iterator r12 = r7.iterator()
        L_0x0082:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x00bd
            java.lang.Object r9 = r12.next()
            r7 = r9
            X.6Di r7 = (X.C128716Di) r7
            java.lang.String r8 = r7.A03
            java.lang.String r7 = r6.A05
            boolean r7 = X.AnonymousClass00C.A0J(r8, r7)
            if (r7 == 0) goto L_0x0082
        L_0x0099:
            X.6Di r9 = (X.C128716Di) r9
            if (r9 == 0) goto L_0x00c6
            java.lang.String r7 = r9.A02
            r6.A00 = r7
            boolean r7 = A09(r6, r5, r9, r11, r3)
            if (r7 != 0) goto L_0x002b
            r2.L$0 = r10
            r2.L$1 = r10
            r2.L$2 = r10
            r2.L$3 = r10
            r2.label = r0
            r10 = r3
            r11 = r2
            r7 = r5
            r8 = r9
            r9 = r4
            java.lang.Object r0 = A01(r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L_0x002b
            return r1
        L_0x00bd:
            r9 = r10
            goto L_0x0099
        L_0x00bf:
            java.lang.String r1 = r12.A02
            if (r1 != 0) goto L_0x00c8
            java.lang.String r1 = "failure"
            goto L_0x00c8
        L_0x00c6:
            java.lang.String r1 = "extensions-invalid-extensions-id"
        L_0x00c8:
            java.lang.String r0 = r6.A05
            A08(r5, r3, r1, r0)
            goto L_0x002b
        L_0x00cf:
            X.7B1 r2 = new X.7B1
            r2.<init>(r13, r9)
            goto L_0x001a
        L_0x00d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A02(X.6E7, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines, X.7hO, X.7ji, X.09x, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ed A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.AnonymousClass6E7 r16, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r17, X.AnonymousClass7hO r18, X.C159657ji r19, X.C023509x r20, int r21) {
        /*
            r6 = r20
            r1 = r17
            r0 = r16
            r9 = r18
            r4 = r19
            r8 = r21
            boolean r2 = r6 instanceof X.AnonymousClass7B3
            if (r2 == 0) goto L_0x012c
            r7 = r6
            X.7B3 r7 = (X.AnonymousClass7B3) r7
            int r5 = r7.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r5 & r3
            if (r2 == 0) goto L_0x012c
            int r5 = r5 - r3
            r7.label = r5
        L_0x001e:
            java.lang.Object r11 = r7.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r12 = r7.label
            r5 = 3
            r10 = 2
            r2 = 1
            r3 = 0
            if (r12 == 0) goto L_0x0036
            if (r12 == r2) goto L_0x006b
            if (r12 == r10) goto L_0x00ce
            if (r12 != r5) goto L_0x0133
            X.AnonymousClass0AN.A00(r11)
        L_0x0033:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0036:
            X.AnonymousClass0AN.A00(r11)
            java.lang.String r12 = r0.A05
            X.1Kg r14 = r1.A0D
            java.lang.Integer r16 = X.C90524aI.A0a(r8)
            com.whatsapp.jid.UserJid r15 = r0.A02
            java.lang.String r11 = r0.A08
            java.lang.String r10 = r0.A09
            r7.L$0 = r1
            r7.L$1 = r0
            r7.L$2 = r9
            r7.L$3 = r4
            r7.I$0 = r8
            r7.label = r2
            r21 = 0
            X.02l r2 = r14.A05
            r20 = 0
            com.whatsapp.extensions.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2 r13 = new com.whatsapp.extensions.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2
            r19 = r10
            r18 = r11
            r17 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r11 = X.AnonymousClass0A2.A00(r7, r2, r13)
            if (r11 != r6) goto L_0x0080
            return r6
        L_0x006b:
            int r8 = r7.I$0
            java.lang.Object r4 = r7.L$3
            X.7ji r4 = (X.C159657ji) r4
            java.lang.Object r9 = r7.L$2
            X.7hO r9 = (X.AnonymousClass7hO) r9
            java.lang.Object r0 = r7.L$1
            X.6E7 r0 = (X.AnonymousClass6E7) r0
            java.lang.Object r1 = r7.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r1 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines) r1
            X.AnonymousClass0AN.A00(r11)
        L_0x0080:
            X.6CM r11 = (X.AnonymousClass6CM) r11
            A05(r0, r1, r11, r8)
            X.5tN r10 = r11.A00
            if (r10 == 0) goto L_0x00ee
            java.util.List r2 = r10.A02
            java.util.Iterator r13 = r2.iterator()
        L_0x008f:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x00cc
            java.lang.Object r8 = r13.next()
            r2 = r8
            X.6Di r2 = (X.C128716Di) r2
            java.lang.String r12 = r2.A03
            java.lang.String r2 = r0.A05
            boolean r2 = X.AnonymousClass00C.A0J(r12, r2)
            if (r2 == 0) goto L_0x008f
        L_0x00a6:
            X.6Di r8 = (X.C128716Di) r8
            if (r8 == 0) goto L_0x00ee
            java.lang.String r2 = r8.A02
            r0.A00 = r2
            boolean r2 = A09(r0, r1, r8, r10, r4)
            if (r2 != 0) goto L_0x0033
            r7.L$0 = r1
            r7.L$1 = r0
            r7.L$2 = r3
            r7.L$3 = r3
            r2 = 2
            r7.label = r2
            r12 = r9
            r13 = r4
            r14 = r7
            r9 = r0
            r10 = r1
            r11 = r8
            java.lang.Object r2 = A01(r9, r10, r11, r12, r13, r14)
            if (r2 != r6) goto L_0x00d9
            return r6
        L_0x00cc:
            r8 = r3
            goto L_0x00a6
        L_0x00ce:
            java.lang.Object r0 = r7.L$1
            X.6E7 r0 = (X.AnonymousClass6E7) r0
            java.lang.Object r1 = r7.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r1 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines) r1
            X.AnonymousClass0AN.A00(r11)
        L_0x00d9:
            r7.L$0 = r3
            r7.L$1 = r3
            r7.label = r5
            X.02l r4 = r1.A0P
            r3 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2 r2 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2
            r2.<init>(r0, r1, r3)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r7, r4, r2)
            if (r0 != r6) goto L_0x0033
            return r6
        L_0x00ee:
            r12 = 0
            java.lang.String r11 = r11.A02
            if (r11 != 0) goto L_0x00f5
            java.lang.String r11 = "failure"
        L_0x00f5:
            if (r10 == 0) goto L_0x010e
            java.lang.String r11 = "extensions-invalid-extensions-id"
            boolean r2 = r0.A0B
            if (r2 != 0) goto L_0x010e
            X.1KW r7 = r1.A0B
            com.whatsapp.jid.UserJid r2 = r0.A02
            java.lang.String r6 = r2.user
            java.lang.String r5 = r0.A05
            X.0wo r2 = r1.A09
            long r2 = X.C19970wo.A00(r2)
            r7.A02(r2, r6, r5)
        L_0x010e:
            java.lang.String r8 = r0.A05
            A08(r1, r4, r11, r8)
            X.6OE r2 = r1.A07
            com.whatsapp.jid.UserJid r5 = r0.A02
            java.lang.String r9 = r0.A08
            java.lang.String r10 = r0.A09
            X.185 r3 = r1.A05
            X.6NP r4 = r1.A0C
            boolean r0 = r0.A0C
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.String r7 = "galaxy_message"
            r2.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0033
        L_0x012c:
            X.7B3 r7 = new X.7B3
            r7.<init>(r1, r6)
            goto L_0x001e
        L_0x0133:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A03(X.6E7, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines, X.7hO, X.7ji, X.09x, int):java.lang.Object");
    }

    public static final void A04(AnonymousClass6E7 r16, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, int i, boolean z) {
        int i2;
        String str;
        AnonymousClass6E7 r4 = r16;
        UserJid userJid = r4.A02;
        String str2 = r4.A08;
        int i3 = 0;
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines2 = phoenixFlowsManagerWithCoroutines;
        AnonymousClass3T1 A022 = phoenixFlowsManagerWithCoroutines2.A0V.A02(new C64933Qa(userJid, str2, false));
        JSONObject A1B = C36441kJ.A1B();
        String A023 = C132586Uj.A00.A02(phoenixFlowsManagerWithCoroutines2.A0B, str2, false);
        String A0b = C90464aC.A0b(r4.A09);
        AnonymousClass00C.A08(A0b);
        try {
            A1B.put("cta", "galaxy_message");
            A1B.put("flow_id", r4.A05);
            A1B.put("extensions_message_id", A023);
            A1B.put("session_id", A0b);
            A1B.put("data_channel_navigation", z);
            if (r4.A0C) {
                i3 = 1;
            }
            A1B.put("extension_restored_from_cache", i3);
        } catch (JSONException e) {
            Log.w(C36331k8.A0i("SExtensionsLogger/PhoenixExtensionsFlowMessage/reportWamEvent()/Error - ", AnonymousClass000.A0u(), e));
        }
        int A002 = C110465ai.A00(phoenixFlowsManagerWithCoroutines2.A05.A01(userJid));
        AnonymousClass9Xu A012 = phoenixFlowsManagerWithCoroutines2.A0T.A01.A01(userJid);
        if (A022 != null) {
            i2 = AnonymousClass6UH.A01(A022.A1I, A022.A09, C66013Ui.A0q(A022));
        } else {
            i2 = 1;
        }
        AnonymousClass6NP r11 = phoenixFlowsManagerWithCoroutines2.A0C;
        String A0y = C36381kD.A0y(A1B);
        Integer valueOf = Integer.valueOf(A002);
        String str3 = null;
        if (A012 != null) {
            str3 = A012.A06;
            str = A012.A05;
        } else {
            str = null;
        }
        r11.A01(userJid, A022, valueOf, A0y, str3, str, str2, i);
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put("business_jid", userJid.user);
        A0J2.put("ext_session_id", A0b);
        A0J2.put("ext_message_id", A023);
        A0J2.put("message_media_type", C90514aH.A0l("biz_platform", valueOf, A0J2, i2));
        C203639oR r0 = phoenixFlowsManagerWithCoroutines2.A01;
        if (r0 == null) {
            throw C36331k8.A0d("fdsManager");
        }
        r0.A0F(A0J2);
    }

    public static void A05(AnonymousClass6E7 r3, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, AnonymousClass6CM r5, int i) {
        if (r5.A03) {
            phoenixFlowsManagerWithCoroutines.A0G.A07(new Integer(r3.A05.hashCode()));
            phoenixFlowsManagerWithCoroutines.A0H.A07(new Integer(phoenixFlowsManagerWithCoroutines.A00));
            return;
        }
        phoenixFlowsManagerWithCoroutines.A0I.A0D(new Integer(i), r5.A01);
    }

    public static final void A06(AnonymousClass6E7 r10, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, AnonymousClass7hO r12, C159657ji r13, AnonymousClass691 r14, String str, Map map, boolean z) {
        Bitmap bitmap;
        String str2;
        phoenixFlowsManagerWithCoroutines.A01 = phoenixFlowsManagerWithCoroutines.A02.A00(r14);
        UserJid userJid = r10.A02;
        HashMap A0J2 = AnonymousClass001.A0J();
        AnonymousClass3L0 A012 = phoenixFlowsManagerWithCoroutines.A05.A01(userJid);
        if (!(A012 == null || (str2 = A012.A08) == null)) {
            A0J2.put("business_name", str2);
        }
        if (phoenixFlowsManagerWithCoroutines.A0K.A0E(4078)) {
            AnonymousClass141 A082 = phoenixFlowsManagerWithCoroutines.A04.A08(userJid);
            Context context = phoenixFlowsManagerWithCoroutines.A0A.A00;
            float A042 = C90494aF.A04(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            if (A082 != null) {
                bitmap = phoenixFlowsManagerWithCoroutines.A06.A05(context, A082, A042, dimensionPixelSize);
            } else {
                bitmap = null;
            }
            ByteArrayOutputStream A0Q2 = C90524aI.A0Q();
            if (bitmap != null) {
                C90514aH.A1F(bitmap, A0Q2);
            }
            String encodeToString = Base64.encodeToString(A0Q2.toByteArray(), 0);
            if (encodeToString != null) {
                A0J2.put("business_profile_logo", encodeToString);
            }
        }
        C203639oR r0 = phoenixFlowsManagerWithCoroutines.A01;
        if (r0 == null) {
            throw C36331k8.A0d("fdsManager");
        }
        r0.A0F(A0J2);
        A04(r10, phoenixFlowsManagerWithCoroutines, 0, !A0A(r10.A06, r10.A04));
        phoenixFlowsManagerWithCoroutines.A0H.A08(Integer.valueOf(phoenixFlowsManagerWithCoroutines.A00), "startFlow");
        C134906bn r4 = null;
        boolean z2 = z;
        if (z) {
            r4 = new C134906bn(1000, "PHOENIX", false);
        }
        C203639oR r1 = phoenixFlowsManagerWithCoroutines.A01;
        if (r1 == null) {
            throw C36331k8.A0d("fdsManager");
        }
        r1.A0C(new C165387tL(phoenixFlowsManagerWithCoroutines, r12, 1), new C132826Vk(r10, r13, phoenixFlowsManagerWithCoroutines, 2), r4, r10.A05, str, r10.A03, map, z2);
    }

    public static final void A07(AnonymousClass6E7 r6, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, boolean z) {
        C23043B1o b1o;
        C207219uk BA8;
        C207089uX r0;
        AnonymousClass3T1 A022 = phoenixFlowsManagerWithCoroutines.A0V.A02(C90504aG.A0T(r6.A02, r6.A08));
        Object obj = null;
        if ((A022 instanceof C23043B1o) && (b1o = (C23043B1o) A022) != null && (BA8 = b1o.BA8()) != null && BA8.A00 == 5 && (r0 = BA8.A04) != null) {
            Iterator it = r0.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C90504aG.A1X(next, "galaxy_message")) {
                    obj = next;
                    break;
                }
            }
            C206569tc r3 = (C206569tc) obj;
            if (r3 != null) {
                r3.A00 = z;
            }
            phoenixFlowsManagerWithCoroutines.A0U.A0k(A022);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r6, X.C159657ji r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r3 = "extensions-features-disabled"
            boolean r0 = r8.equals(r3)
            X.56y r4 = r6.A0H
            if (r0 == 0) goto L_0x006c
            int r0 = r6.A00
            X.C90504aG.A1D(r4, r0)
            X.1KT r4 = r6.A0G
            int r0 = r9.hashCode()
            X.C90504aG.A1D(r4, r0)
        L_0x0018:
            X.0wG r1 = r6.A0A
            r0 = 2131889639(0x7f120de7, float:1.9413947E38)
            java.lang.String r5 = X.C36371kC.A0v(r1, r0)
            X.0wD r0 = r6.A0R
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0052
            r0 = 2131889638(0x7f120de6, float:1.9413945E38)
        L_0x002c:
            java.lang.String r5 = X.C36371kC.A0v(r1, r0)
        L_0x0030:
            if (r7 == 0) goto L_0x004c
            X.2ov r0 = X.C52122ov.A02
            java.lang.String r1 = r0.key
            X.6Bf r0 = X.C128176Bf.A00(r5)
            java.util.Map r3 = X.C36391kE.A11(r1, r0)
            java.lang.Integer r2 = X.C90494aF.A0U()
            java.lang.String r1 = "ExtensionError"
            X.6PH r0 = new X.6PH
            r0.<init>(r2, r1, r5)
            r7.BXS(r0, r3)
        L_0x004c:
            X.0zE r0 = r4.A04
            r0.BpN()
            return
        L_0x0052:
            java.lang.String r0 = "extensions-banned-id-error"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0068
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "extensions-integrity-check-failed"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0030
        L_0x0068:
            r0 = 2131889644(0x7f120dec, float:1.9413957E38)
            goto L_0x002c
        L_0x006c:
            int r1 = r6.A00
            java.lang.String r0 = "error_message"
            r4.A03(r1, r0, r8)
            int r0 = r6.A00
            r2 = 3
            r4.A05(r0, r2)
            X.1KT r4 = r6.A0G
            int r1 = r9.hashCode()
            r0 = 0
            r4.A0B(r1, r8, r0)
            r4.A0C(r1, r2)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A08(com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines, X.7ji, java.lang.String, java.lang.String):void");
    }

    public static final boolean A09(AnonymousClass6E7 r13, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C128716Di r15, C121585tN r16, C159657ji r17) {
        AnonymousClass6PG r1;
        String str;
        AnonymousClass6MJ r2 = phoenixFlowsManagerWithCoroutines.A0W;
        C121585tN r0 = r16;
        if (r16 != null) {
            r1 = r0.A01;
        } else {
            r1 = null;
        }
        AnonymousClass5SG A012 = r2.A01(r15, r1, r13.A06);
        if (A012.ordinal() == 0) {
            return false;
        }
        if (A012 == AnonymousClass5SG.UNKNOWN_VERSION) {
            str = "extensions-metadata-unknown-version";
        } else {
            str = "extensions-metadata-not-compatible";
        }
        String str2 = r13.A05;
        A08(phoenixFlowsManagerWithCoroutines, r17, str, str2);
        phoenixFlowsManagerWithCoroutines.A07.A02(phoenixFlowsManagerWithCoroutines.A05, phoenixFlowsManagerWithCoroutines.A0C, r13.A02, Boolean.valueOf(r13.A0C), "galaxy_message", str2, r13.A08, r13.A09, str, (String) null);
        return true;
    }

    public PhoenixFlowsManagerWithCoroutines(AnonymousClass1K9 r24, AnonymousClass1KK r25, C19600wD r26, AnonymousClass16D r27, AnonymousClass185 r28, C27761Ps r29, AnonymousClass6OE r30, C117105li r31, C19970wo r32, C19630wG r33, AnonymousClass1KW r34, C18820ts r35, C25851Hx r36, C20310xM r37, AnonymousClass1VZ r38, AnonymousClass6NP r39, C26461Kg r40, AnonymousClass6MJ r41, C26501Kk r42, C26491Kj r43, AnonymousClass1KT r44, C1037856y r45, C26451Kf r46, C26551Kp r47, C20810yC r48, C1268565x r49, C131376Ou r50, AnonymousClass005 r51, C005502l r52, C005502l r53, AnonymousClass040 r54) {
        C20810yC r0 = r48;
        AnonymousClass005 r5 = r51;
        C19970wo r15 = r32;
        C19630wG r14 = r33;
        AnonymousClass1K9 r22 = r24;
        C36321k7.A1B(r15, r0, r14, r22, r5);
        C20310xM r13 = r37;
        AnonymousClass00C.A0D(r13, 6);
        AnonymousClass1VZ r9 = r38;
        C131376Ou r6 = r50;
        AnonymousClass185 r18 = r28;
        C36321k7.A14(r6, r9, r18);
        AnonymousClass1KK r21 = r25;
        C19600wD r20 = r26;
        C90494aF.A11(r21, 11, r20);
        AnonymousClass6NP r8 = r39;
        C117105li r16 = r31;
        AnonymousClass1KW r12 = r34;
        C90494aF.A12(r16, r12, r8, 15);
        C18820ts r11 = r35;
        AnonymousClass00C.A0D(r11, 20);
        C1268565x r7 = r49;
        AnonymousClass00C.A0D(r7, 21);
        C27761Ps r17 = r29;
        AnonymousClass00C.A0D(r17, 24);
        AnonymousClass16D r19 = r27;
        AnonymousClass00C.A0D(r19, 25);
        C005502l r4 = r52;
        AnonymousClass00C.A0D(r4, 28);
        C005502l r3 = r53;
        AnonymousClass00C.A0D(r3, 29);
        AnonymousClass040 r2 = r54;
        AnonymousClass00C.A0D(r2, 30);
        C25851Hx r10 = r36;
        AnonymousClass00C.A0D(r10, 31);
        this.A09 = r15;
        this.A0K = r0;
        this.A0A = r14;
        this.A02 = r22;
        this.A0N = r5;
        this.A0U = r13;
        this.A07 = r30;
        this.A0M = r6;
        this.A0V = r9;
        this.A05 = r18;
        this.A03 = r21;
        this.A0D = r40;
        this.A0R = r20;
        this.A0E = r42;
        this.A08 = r16;
        this.A0H = r45;
        this.A0F = r43;
        this.A0B = r12;
        this.A0C = r8;
        this.A0S = r11;
        this.A0L = r7;
        this.A0I = r46;
        this.A0G = r44;
        this.A06 = r17;
        this.A04 = r19;
        this.A0J = r47;
        this.A0W = r41;
        this.A0P = r4;
        this.A0X = r3;
        this.A0Q = r2;
        this.A0T = r10;
    }
}
