package X;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1hT  reason: invalid class name and case insensitive filesystem */
public abstract class C34681hT {
    public static String A07(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN_TELEPHONY_CALL_STATE" : "CALL_STATE_OFFHOOK" : "CALL_STATE_RINGING" : "CALL_STATE_IDLE";
    }

    public static VoipStanzaChildNode.Builder A01(VoipStanzaChildNode voipStanzaChildNode) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        return builder;
    }

    public static String A08(String str) {
        if (str.startsWith("call:")) {
            return str.replaceFirst("call:", "");
        }
        return str;
    }

    public static String A09(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("call:");
        sb.append(str);
        return sb.toString();
    }

    public static boolean A0A(C19730wQ r2, C20810yC r3) {
        if (C20800yB.A00(C21000yV.A02, r3, 3362) < 2 || r2.A0L()) {
            return false;
        }
        return true;
    }

    public static boolean A0C(C19730wQ r3, C20810yC r4, int i) {
        C21000yV r2 = C21000yV.A02;
        if (C20800yB.A00(r2, r4, 3362) < 2 || r3.A0L() || i > C20800yB.A00(r2, r4, 4676) || i < C20800yB.A00(r2, r4, 4675)) {
            return false;
        }
        return true;
    }

    public static boolean A0G(C20810yC r2) {
        if (C20800yB.A00(C21000yV.A02, r2, 4067) < 1) {
            return false;
        }
        return true;
    }

    public static boolean A0H(C20810yC r2) {
        int A00 = C20800yB.A00(C21000yV.A02, r2, 4708);
        if (A00 < 1 || A00 > 2) {
            return false;
        }
        return true;
    }

    public static boolean A0I(C20810yC r2) {
        if (C20800yB.A00(C21000yV.A02, r2, 6818) > 0) {
            return true;
        }
        return false;
    }

    public static boolean A0J(C20810yC r2) {
        if (Build.VERSION.SDK_INT < 29 || !C20800yB.A01(C21000yV.A02, r2, 6530)) {
            return false;
        }
        return true;
    }

    public static boolean A0K(C20810yC r2) {
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A01(r1, r2, 4800) || C20800yB.A01(r1, r2, 4896) || C20800yB.A01(r1, r2, 4895)) {
            return true;
        }
        return false;
    }

    public static boolean A0L(C20810yC r2) {
        if (C20800yB.A01(C21000yV.A02, r2, 3015)) {
            String str = Build.MANUFACTURER;
            if ("oculus".equalsIgnoreCase(str) || "meta".equalsIgnoreCase(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0M(C20810yC r2) {
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A01(r1, r2, 3015) || C20800yB.A01(r1, r2, 3459)) {
            String str = Build.MANUFACTURER;
            if ("oculus".equalsIgnoreCase(str) || "meta".equalsIgnoreCase(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0N(C20810yC r2) {
        if (C20800yB.A00(C21000yV.A02, r2, 6228) < 1) {
            return false;
        }
        return true;
    }

    public static boolean A0O(C20810yC r3, int i) {
        C21000yV r2 = C21000yV.A02;
        if (C20800yB.A00(r2, r3, 4907) < 3 || i < C20800yB.A00(r2, r3, 5254)) {
            return false;
        }
        return true;
    }

    public static boolean A0P(C20810yC r3, int i) {
        C21000yV r2 = C21000yV.A02;
        if (C20800yB.A00(r2, r3, 5429) >= 2) {
            return true;
        }
        if (i < C20800yB.A00(r2, r3, 6069) || i > C20800yB.A00(r2, r3, 6070)) {
            return false;
        }
        return true;
    }

    public static boolean A0Q(C20810yC r2, CallState callState, Boolean bool, boolean z) {
        if (callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY) {
            return true;
        }
        if (!C20800yB.A01(C21000yV.A02, r2, 5088)) {
            return false;
        }
        if (!z && (bool == null || !bool.booleanValue())) {
            return false;
        }
        if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED) {
            return true;
        }
        return false;
    }

    public static boolean A0R(C20810yC r2, boolean z) {
        C21000yV r1 = C21000yV.A02;
        boolean A01 = C20800yB.A01(r1, r2, 7891);
        if ((!z || A01) && C20800yB.A01(r1, r2, 7175)) {
            return true;
        }
        return false;
    }

    public static boolean A0S(GroupJid groupJid, CallInfo callInfo) {
        CallState callState;
        if (callInfo == null || (callState = callInfo.callState) == CallState.NONE || callState == CallState.RECEIVED_CALL || callState == CallState.ACTIVE_ELSEWHERE || !groupJid.equals(callInfo.groupJid)) {
            return false;
        }
        return true;
    }

    public static boolean A0T(CallInfo callInfo) {
        if (callInfo == null || callInfo.callState == CallState.NONE) {
            return false;
        }
        return true;
    }

    public static boolean A0U(CallState callState, CallState callState2, int i) {
        if (!((callState2 == CallState.CALLING || callState2 == CallState.PRE_ACCEPT_RECEIVED) && i == 5)) {
            if (!C131856Qx.A01(callState) || callState2 != CallState.NONE) {
                return false;
            }
            if (i == 2 || i == 17 || i == 4 || i == 10 || i == 25) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static int A00(Context context) {
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(context.getPackageName());
            sb.append("/");
            sb.append(R.raw.end_call_m4);
            mediaMetadataRetriever.setDataSource(context, Uri.parse(sb.toString()));
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (IllegalArgumentException | SecurityException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("VoipUtilV2/getEndCallToneDurationFromMedia/ ");
            sb2.append(e);
            Log.e(sb2.toString());
            C18740tg.A0A(e);
            i = -1;
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("VoipUtilV2/getEndCallToneDurationFromMedia/ ");
                sb3.append(e2);
                Log.e(sb3.toString());
                throw th;
            }
        }
        try {
            mediaMetadataRetriever.release();
            return i;
        } catch (IOException e3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("VoipUtilV2/getEndCallToneDurationFromMedia/ ");
            sb4.append(e3);
            Log.e(sb4.toString());
            return i;
        }
    }

    public static VoipStanzaChildNode A02(VoipStanzaChildNode voipStanzaChildNode, String str) {
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if (str.equals(voipStanzaChildNode2.tag)) {
                    return voipStanzaChildNode2;
                }
            }
        }
        return null;
    }

    public static CallInfo A03(C30531aM r1) {
        if (!Voip.A08()) {
            return r1.B9F();
        }
        CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
        if (callLinkInfo != null) {
            return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
        }
        return null;
    }

    public static C135006by A04(C30531aM r4) {
        CallInfo B9F = r4.B9F();
        if (B9F == null) {
            return null;
        }
        UserJid peerJid = B9F.getPeerJid();
        C18740tg.A06(peerJid);
        boolean z = B9F.isCaller;
        return new C135006by(B9F.initialGroupTransactionId, peerJid, A09(B9F.callId), z);
    }

    public static File A05(Context context) {
        File file = new File(context.getCacheDir(), "voip_time_series");
        if (!file.exists() || !file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
            if (!file.mkdirs()) {
                StringBuilder sb = new StringBuilder();
                sb.append("VoipUtil failed to create time series directory: ");
                sb.append(file.getAbsolutePath());
                Log.e(sb.toString());
                return null;
            }
        }
        return file;
    }

    public static Byte A06(VoipStanzaChildNode voipStanzaChildNode) {
        AnonymousClass1AL[] attributesCopy = voipStanzaChildNode.getAttributesCopy();
        byte b = 0;
        if (attributesCopy != null) {
            int length = attributesCopy.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AnonymousClass1AL r2 = attributesCopy[i];
                if ("count".equals(r2.A02)) {
                    try {
                        b = Byte.parseByte(r2.A03);
                        break;
                    } catch (NumberFormatException unused) {
                        return null;
                    }
                } else {
                    i++;
                }
            }
        }
        return Byte.valueOf(b);
    }

    public static boolean A0B(C19730wQ r1, C20810yC r2) {
        if (r1.A0L() || !C20800yB.A01(C21000yV.A02, r2, 4933)) {
            return false;
        }
        return true;
    }

    public static boolean A0D(C19730wQ r2, C20810yC r3, int i) {
        if (r2.A0L()) {
            return false;
        }
        C21000yV r22 = C21000yV.A02;
        if (C20800yB.A00(r22, r3, 3362) < 2 || i < C20800yB.A00(r22, r3, 4675)) {
            return false;
        }
        if (C20800yB.A01(r22, r3, 6610) || i <= C20800yB.A00(r22, r3, 4676)) {
            return true;
        }
        return false;
    }

    public static boolean A0E(C19730wQ r1, UserJid userJid) {
        r1.A0G();
        if (userJid.equals(r1.A03) || userJid.equals(r1.A08())) {
            return true;
        }
        return false;
    }

    public static boolean A0F(C21060yb r3) {
        ActivityManager A04 = r3.A04();
        try {
            if (Build.VERSION.SDK_INT >= 28 && A04 != null) {
                return A04.isBackgroundRestricted();
            }
        } catch (RuntimeException unused) {
            Log.e("System server dead, cannot get background restriction setting");
        }
        return false;
    }
}
