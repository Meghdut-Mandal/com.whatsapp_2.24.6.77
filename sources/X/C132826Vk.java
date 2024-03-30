package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.6Vk  reason: invalid class name and case insensitive filesystem */
public class C132826Vk implements C159657ji {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C132826Vk(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A02 = obj3;
        this.A01 = obj2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r6.containsKey(X.C52122ov.A02.key) == false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXS(X.AnonymousClass6PH r5, java.util.Map r6) {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x004c;
                case 1: goto L_0x00a9;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            if (r6 == 0) goto L_0x0022
            java.lang.Object r3 = r4.A02
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r3 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines) r3
            java.lang.Object r2 = r4.A00
            X.6E7 r2 = (X.AnonymousClass6E7) r2
            java.lang.String r1 = "disable_nfm_cta"
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x0022
            boolean r0 = X.C90464aC.A1a(r6, r1)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A07(r2, r3, r0)
        L_0x0022:
            java.lang.Object r0 = r4.A01
            X.7ji r0 = (X.C159657ji) r0
            if (r0 == 0) goto L_0x002b
            r0.BXS(r5, r6)
        L_0x002b:
            java.lang.Object r3 = r4.A02
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r3 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines) r3
            X.5li r0 = r3.A08
            java.util.HashMap r0 = r0.A00
            r0.clear()
            X.56y r2 = r3.A0H
            int r1 = r3.A00
            r0 = 3
            r2.A05(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A0O
            r0 = 0
            r1.set(r0)
            X.1KT r0 = r3.A0G
        L_0x0046:
            X.0zE r0 = r0.A04
            r0.BpN()
        L_0x004b:
            return
        L_0x004c:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsV2Action/execute()/onFailure() - Flow terminated with failure. Error present: "
            r3.append(r0)
            r2 = 0
            if (r6 == 0) goto L_0x0063
            X.2ov r0 = X.C52122ov.A02
            java.lang.String r0 = r0.key
            boolean r1 = r6.containsKey(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            X.C36331k8.A1S(r3, r0)
            java.lang.Object r0 = r4.A02
            X.54F r0 = (X.AnonymousClass54F) r0
            X.6PZ r1 = r0.A02
            java.lang.String r0 = "flow_error"
            r1.A03(r0, r2)
            if (r6 == 0) goto L_0x00a7
            X.2ov r0 = X.C52122ov.A02
            java.lang.String r0 = r0.key
            java.lang.Object r0 = r6.get(r0)
        L_0x007c:
            boolean r0 = r0 instanceof X.C128176Bf
            if (r0 == 0) goto L_0x004b
            X.2ov r0 = X.C52122ov.A02
            java.lang.String r0 = r0.key
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.productinfra.phoenix.api.error.FdsError"
            X.AnonymousClass00C.A0E(r1, r0)
            X.6Bf r1 = (X.C128176Bf) r1
            java.lang.Object r0 = r4.A01
            android.content.Intent r0 = (android.content.Intent) r0
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = r1.A01
            java.lang.String r0 = "extra_error_message"
            r2.putExtra(r0, r1)
            java.lang.Object r0 = r4.A00
            android.content.Context r0 = (android.content.Context) r0
            r0.startActivity(r2)
            return
        L_0x00a7:
            r0 = 0
            goto L_0x007c
        L_0x00a9:
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            if (r6 == 0) goto L_0x00c6
            java.lang.Object r3 = r4.A02
            X.6Xv r3 = (X.C133316Xv) r3
            java.lang.Object r2 = r4.A00
            X.6E7 r2 = (X.AnonymousClass6E7) r2
            java.lang.String r1 = "disable_nfm_cta"
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x00c6
            boolean r0 = X.C90464aC.A1a(r6, r1)
            X.C133316Xv.A04(r3, r2, r0)
        L_0x00c6:
            java.lang.Object r0 = r4.A01
            X.7ji r0 = (X.C159657ji) r0
            if (r0 == 0) goto L_0x00cf
            r0.BXS(r5, r6)
        L_0x00cf:
            java.lang.Object r3 = r4.A02
            X.6Xv r3 = (X.C133316Xv) r3
            X.5li r0 = r3.A09
            java.util.HashMap r0 = r0.A00
            r0.clear()
            X.56y r2 = r3.A0I
            int r1 = r3.A00
            r0 = 3
            r2.A05(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A0Q
            r0 = 0
            r1.set(r0)
            X.1KT r0 = r3.A0H
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132826Vk.BXS(X.6PH, java.util.Map):void");
    }

    public void BiH(Map map) {
        boolean z;
        short s;
        AnonymousClass1KT r2;
        String str;
        AnonymousClass1KT r22;
        AtomicBoolean atomicBoolean;
        Map map2;
        Object obj;
        Map map3;
        Object obj2;
        String str2;
        Object obj3;
        Boolean bool;
        short s2;
        String str3;
        Map map4;
        Object obj4;
        Map map5;
        Object obj5;
        String str4;
        Object obj6;
        Boolean bool2;
        switch (this.A03) {
            case 0:
                Log.i("ExtensionsLogger/ExtensionsV2Action/execute()/onSuccess() - Flow terminated successfully");
                if (map == null) {
                    ((AnonymousClass54F) this.A02).A02.A03("user_interrupted", true);
                    return;
                }
                return;
            case 1:
                C159657ji r0 = (C159657ji) this.A01;
                if (r0 != null) {
                    r0.BiH(map);
                }
                C133316Xv r4 = (C133316Xv) this.A02;
                r4.A09.A00.clear();
                z = false;
                boolean z2 = true;
                if (map != null && !map.isEmpty() && map.containsKey("data")) {
                    Object obj7 = map.get("data");
                    if ((obj7 instanceof Map) && (map2 = (Map) obj7) != null && map2.containsKey("extension_message_response") && (map2.get("extension_message_response") instanceof Map)) {
                        Object obj8 = map2.get("extension_message_response");
                        AnonymousClass00C.A0E(obj8, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        if (((Map) obj8).containsKey("params")) {
                            Object obj9 = map.get("data_channel_navigation");
                            if ((obj9 instanceof Boolean) && (bool = (Boolean) obj9) != null) {
                                z2 = bool.booleanValue();
                            }
                            AnonymousClass6E7 r3 = (AnonymousClass6E7) this.A00;
                            Map A15 = C90514aH.A15("data", map);
                            Map map6 = null;
                            if (A15 != null) {
                                obj = A15.get("extension_message_response");
                            } else {
                                obj = null;
                            }
                            if (obj instanceof Map) {
                                map3 = (Map) obj;
                                if (map3 != null) {
                                    obj2 = map3.get("body");
                                }
                                obj2 = null;
                            } else {
                                map3 = null;
                                obj2 = null;
                            }
                            if (obj2 instanceof String) {
                                str2 = (String) obj2;
                            } else {
                                str2 = null;
                            }
                            if (map3 != null) {
                                obj3 = map3.get("params");
                            } else {
                                obj3 = null;
                            }
                            if (obj3 instanceof Map) {
                                map6 = (Map) obj3;
                            }
                            JSONObject jSONObject = new JSONObject(map6);
                            AnonymousClass1X4 r6 = (AnonymousClass1X4) r4.A0P.get();
                            UserJid userJid = r3.A02;
                            long j = r3.A01;
                            if (str2 == null) {
                                str2 = "";
                            }
                            r6.A0O(userJid, str2, "galaxy_message", jSONObject.toString(), r3.A06, j);
                            r4.A0O.Boy(new AnonymousClass752(r4, r3, 18, z2));
                            s = 2;
                            r4.A0I.A05(r4.A00, 2);
                            r2 = r4.A0H;
                            str = r3.A05;
                            r22.A0C(str.hashCode(), s);
                            atomicBoolean = r4.A0Q;
                            break;
                        }
                    }
                }
                s = 22;
                r4.A0I.A05(r4.A00, 22);
                r2 = r4.A0H;
                str = ((AnonymousClass6E7) this.A00).A05;
                r22.A0C(str.hashCode(), s);
                atomicBoolean = r4.A0Q;
            default:
                C159657ji r02 = (C159657ji) this.A01;
                if (r02 != null) {
                    r02.BiH(map);
                }
                PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = (PhoenixFlowsManagerWithCoroutines) this.A02;
                phoenixFlowsManagerWithCoroutines.A08.A00.clear();
                z = false;
                boolean z3 = true;
                if (map != null && !map.isEmpty() && map.containsKey("data")) {
                    Object obj10 = map.get("data");
                    if ((obj10 instanceof Map) && (map4 = (Map) obj10) != null && map4.containsKey("extension_message_response") && (map4.get("extension_message_response") instanceof Map)) {
                        Object obj11 = map4.get("extension_message_response");
                        AnonymousClass00C.A0E(obj11, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        if (((Map) obj11).containsKey("params")) {
                            Object obj12 = map.get("data_channel_navigation");
                            if ((obj12 instanceof Boolean) && (bool2 = (Boolean) obj12) != null) {
                                z3 = bool2.booleanValue();
                            }
                            AnonymousClass6E7 r32 = (AnonymousClass6E7) this.A00;
                            Map A152 = C90514aH.A15("data", map);
                            Map map7 = null;
                            if (A152 != null) {
                                obj4 = A152.get("extension_message_response");
                            } else {
                                obj4 = null;
                            }
                            if (obj4 instanceof Map) {
                                map5 = (Map) obj4;
                                if (map5 != null) {
                                    obj5 = map5.get("body");
                                }
                                obj5 = null;
                            } else {
                                map5 = null;
                                obj5 = null;
                            }
                            if (obj5 instanceof String) {
                                str4 = (String) obj5;
                            } else {
                                str4 = null;
                            }
                            if (map5 != null) {
                                obj6 = map5.get("params");
                            } else {
                                obj6 = null;
                            }
                            if (obj6 instanceof Map) {
                                map7 = (Map) obj6;
                            }
                            JSONObject jSONObject2 = new JSONObject(map7);
                            AnonymousClass1X4 r62 = (AnonymousClass1X4) phoenixFlowsManagerWithCoroutines.A0N.get();
                            UserJid userJid2 = r32.A02;
                            long j2 = r32.A01;
                            if (str4 == null) {
                                str4 = "";
                            }
                            r62.A0O(userJid2, str4, "galaxy_message", jSONObject2.toString(), r32.A06, j2);
                            PhoenixFlowsManagerWithCoroutines.A04(r32, phoenixFlowsManagerWithCoroutines, 2, z3);
                            PhoenixFlowsManagerWithCoroutines.A07(r32, phoenixFlowsManagerWithCoroutines, true);
                            s2 = 2;
                            phoenixFlowsManagerWithCoroutines.A0H.A05(phoenixFlowsManagerWithCoroutines.A00, 2);
                            r22 = phoenixFlowsManagerWithCoroutines.A0G;
                            str3 = r32.A05;
                            r22.A0C(str3.hashCode(), s2);
                            atomicBoolean = phoenixFlowsManagerWithCoroutines.A0O;
                            break;
                        }
                    }
                }
                s2 = 22;
                phoenixFlowsManagerWithCoroutines.A0H.A05(phoenixFlowsManagerWithCoroutines.A00, 22);
                r22 = phoenixFlowsManagerWithCoroutines.A0G;
                str3 = ((AnonymousClass6E7) this.A00).A05;
                r22.A0C(str3.hashCode(), s2);
                atomicBoolean = phoenixFlowsManagerWithCoroutines.A0O;
        }
        atomicBoolean.set(z);
        r22.A04.BpN();
    }
}
