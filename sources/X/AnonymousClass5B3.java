package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5B3  reason: invalid class name */
public class AnonymousClass5B3 extends AnonymousClass6R4 {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final AnonymousClass32G A03;
    public final AnonymousClass3G0 A04;
    public final C132696Uw A05;
    public final C21430zE A06;
    public final AnonymousClass004 A07;
    public final AnonymousClass004 A08;

    public AnonymousClass5B3(C19730wQ r1, AnonymousClass16D r2, AnonymousClass171 r3, AnonymousClass32G r4, AnonymousClass3G0 r5, C132696Uw r6, C21430zE r7, AnonymousClass004 r8, AnonymousClass004 r9) {
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }

    public static String A00(CallState callState) {
        switch (callState.ordinal()) {
            case 1:
            case 2:
                return "outgoing_ringing";
            case 3:
                return "incoming_ringing";
            case 4:
            case 5:
            case 6:
            case 10:
                return "active";
            default:
                return "idle";
        }
    }

    public static JSONObject A01(C19730wQ r22, AnonymousClass16D r23, AnonymousClass171 r24, AnonymousClass32G r25, AnonymousClass3G0 r26, C132696Uw r27, C21430zE r28, C128946Ef r29, CallInfo callInfo, CallState callState) {
        AnonymousClass6EE infoByJid;
        C21430zE r10 = r28;
        r10.markerPoint(494341755, "make_call_state_start");
        C20810yC r7 = r25.A00;
        r10.markerAnnotate(494341755, "extended_state", r7.A0E(6408));
        String A002 = A00(callState);
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("call_state", A002);
        if (!"idle".equals(A002)) {
            CallInfo callInfo2 = callInfo;
            if (callInfo != null) {
                C18740tg.A06(callInfo2.getPeerJid());
                AnonymousClass3G0 r20 = r26;
                C128946Ef r9 = r29;
                A1B.put("caller_contact_id", r20.A01(callInfo2.getPeerJid(), r9));
                r10.markerPoint(494341755, "caller_id_resolved");
                AnonymousClass16D r21 = r23;
                AnonymousClass171 r12 = r24;
                A1B.put("caller_name", r12.A0F(r21.A0D(callInfo2.getPeerJid()), false).A01);
                r10.markerPoint(494341755, "caller_name_resolved");
                GroupJid groupJid = callInfo2.groupJid;
                if (groupJid != null) {
                    A1B.put("group_name", C36381kD.A0u(r21, r12, groupJid));
                    r10.markerPoint(494341755, "caller_group_name_resolved");
                }
                Set keySet = callInfo2.participants.keySet();
                if (!keySet.isEmpty()) {
                    JSONArray A0u = C90524aI.A0u();
                    JSONArray A0u2 = C90524aI.A0u();
                    JSONArray A0u3 = C90524aI.A0u();
                    Iterator it = keySet.iterator();
                    String str = null;
                    String str2 = null;
                    int i = 0;
                    while (it.hasNext()) {
                        UserJid A0o = C36441kJ.A0o(it);
                        String str3 = "on";
                        if (!r22.A0M(A0o)) {
                            JSONObject A1B2 = C36441kJ.A1B();
                            String str4 = r12.A0F(r21.A0D(A0o), false).A01;
                            String A012 = r20.A01(A0o, r9);
                            if (r7.A0E(6408)) {
                                A1B2.put("call_participant_name", str4);
                                A1B2.put("call_participant_id", A012);
                                AnonymousClass6EE infoByJid2 = callInfo2.getInfoByJid(A0o);
                                if (infoByJid2 != null) {
                                    if (infoByJid2.A06 != 1) {
                                        str3 = "off";
                                    }
                                    A1B2.put("call_participant_video_status", str3);
                                }
                                A0u3.put(A1B2);
                            }
                            if (TextUtils.isEmpty(str4)) {
                                i++;
                            } else {
                                A0u.put(A012);
                                A0u2.put(str4);
                            }
                        } else if (r7.A0E(6408) && (infoByJid = callInfo2.getInfoByJid(A0o)) != null) {
                            if (infoByJid.A0F) {
                                str = "muted";
                            } else {
                                str = str3;
                            }
                            str2 = "off";
                            if (infoByJid.A06 == 1) {
                                str2 = str3;
                            }
                        }
                    }
                    A1B.put("call_participant_contact_ids", A0u);
                    A1B.put("call_participant_names", A0u2);
                    A1B.put("unnamed_call_participant_count", i);
                    if (r7.A0E(6408)) {
                        if (str != null) {
                            A1B.put("mic_status", str);
                        }
                        if (str2 != null) {
                            A1B.put("video_status", str2);
                        }
                        A1B.put("call_participant_list", A0u3);
                    }
                    r10.markerPoint(494341755, "caller_participant_info_resolved");
                }
                A1B.put("call_id", r27.A04(r9, callInfo2.callId));
                A1B.put("video_call", callInfo2.videoEnabled);
                if (r7.A0E(6408)) {
                    A1B.put("call_active_time", callInfo2.callActiveTime);
                }
                r10.markerPoint(494341755, "make_call_state_end");
                return A1B;
            }
        }
        r10.markerAnnotate(494341755, "early_end", "idle_call");
        return A1B;
    }
}
