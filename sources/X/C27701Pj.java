package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Pj  reason: invalid class name and case insensitive filesystem */
public final class C27701Pj {
    public C27691Pi A00;
    public final C20810yC A01;
    public final AnonymousClass1MN A02;
    public final Set A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final AnonymousClass19J A05;

    public C27701Pj(AnonymousClass19J r2, C27691Pi r3, C20810yC r4, AnonymousClass1MN r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r3, 4);
        this.A01 = r4;
        this.A05 = r2;
        this.A02 = r5;
        this.A00 = r3;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        AnonymousClass00C.A08(newSetFromMap);
        this.A03 = newSetFromMap;
    }

    public static final void A00(C27701Pj r7, String str, int i) {
        StringBuilder sb;
        String str2;
        AnonymousClass19J r1 = r7.A05;
        if (!r1.A06 || r1.A04 != 2) {
            sb = new StringBuilder();
            str2 = "VoiceChatAcceptPingManager/sendPing: XMPP connection state is not connected: callId = ";
        } else if (!r7.A03.add(str)) {
            sb = new StringBuilder();
            str2 = "VoiceChatAcceptPingManager/sendPing: already sent ping for the call: callId = ";
        } else {
            C20810yC r3 = r7.A01;
            C21000yV r12 = C21000yV.A02;
            if ((C20800yB.A00(r12, r3, 6008) & i) == 0) {
                sb = new StringBuilder();
                sb.append("VoiceChatAcceptPingManager/sendPing: ping is not enabled: callId = ");
                sb.append(str);
                sb.append(", settings = ");
                sb.append(C20800yB.A00(r12, r3, 6008));
                sb.append(", flag = ");
                sb.append(i);
                Log.w(sb.toString());
            }
            AnonymousClass1MN r6 = r7.A02;
            C147706xe r5 = new C147706xe(r7, str);
            long A002 = (long) C20800yB.A00(r12, r3, 6009);
            if (1000 > A002 || A002 >= 32001) {
                A002 = 8000;
            }
            r6.A0A(r5, A002);
            return;
        }
        sb.append(str2);
        sb.append(str);
        Log.w(sb.toString());
    }
}
