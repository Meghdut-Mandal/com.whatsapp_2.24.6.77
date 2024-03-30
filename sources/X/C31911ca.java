package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1ca  reason: invalid class name and case insensitive filesystem */
public final class C31911ca extends Handler implements C31901cZ {
    public final /* synthetic */ AnonymousClass1WK A00;

    public boolean BK2() {
        if (!hasMessages(4)) {
            C29291Wb r1 = (C29291Wb) this.A00.A05;
            if (r1.hasMessages(2) || !r1.A00.A05.isEmpty()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void Bpn(boolean z, int i) {
        int i2 = 1;
        if (z) {
            i2 = 2;
        }
        hasMessages(0);
        hasMessages(i2);
        removeMessages(i2);
        removeMessages(0);
        Message obtainMessage = obtainMessage(i2);
        Bundle data = obtainMessage.getData();
        data.putLong("requestTime", SystemClock.uptimeMillis());
        data.putInt("disconnectReason", i);
        obtainMessage.sendToTarget();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31911ca(AnonymousClass1WK r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    public void Bpk(UserJid userJid, AnonymousClass1VM r6, String str, boolean z, boolean z2) {
        String str2;
        String rawString;
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionThread/sendConnect/ forcePassiveMode=");
        sb.append(z2);
        if (z2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" reg=");
            sb2.append(this.A00.A17.A00());
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        Log.i(sb.toString());
        removeMessages(0);
        removeMessages(9);
        Message obtainMessage = obtainMessage(0);
        Bundle data = obtainMessage.getData();
        if (userJid == null) {
            rawString = null;
        } else {
            rawString = userJid.getRawString();
        }
        data.putString("jid", rawString);
        data.putString("ipaddress", str);
        data.putBoolean("available", z);
        data.putBoolean("forcePassiveMode", z2);
        obtainMessage.obj = r6;
        obtainMessage.sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0.A00.isClosed() != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.what
            r6 = -1
            java.lang.String r5 = "disconnectReason"
            java.lang.String r1 = "requestTime"
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x0074;
                case 2: goto L_0x0078;
                case 3: goto L_0x008f;
                case 4: goto L_0x0097;
                case 5: goto L_0x000a;
                case 6: goto L_0x009d;
                case 7: goto L_0x00a3;
                case 8: goto L_0x00a9;
                case 9: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            return
        L_0x000b:
            X.1WK r2 = r7.A00
            X.9gp r0 = r2.A01
            r4 = 1
            if (r0 == 0) goto L_0x001d
            java.net.Socket r0 = r0.A00
            boolean r0 = r0.isClosed()
            r1 = 0
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r1 = 1
        L_0x001e:
            X.1Md r0 = r2.A0m
            boolean r0 = r0.A00
            if (r1 != 0) goto L_0x00af
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = "ConnectionThread/handleNetworkBlocked/try start logout worker"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19O r3 = r2.A1F
            X.0yC r2 = r3.A0B
            r1 = 3206(0xc86, float:4.493E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x000a
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r0 = r3.A0C
            r0.A03(r4)
            return
        L_0x0043:
            java.lang.String r0 = "ConnectionThread/MessageServiceHandler/recv/connect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Bundle r2 = r8.getData()
            java.lang.String r0 = "jid"
            java.lang.String r1 = r2.getString(r0)
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = r0.A02(r1)
            X.1WK r3 = r7.A00
            java.lang.String r0 = "ipaddress"
            java.lang.String r4 = r2.getString(r0)
            java.lang.String r0 = "available"
            boolean r5 = r2.getBoolean(r0)
            java.lang.String r0 = "forcePassiveMode"
            boolean r6 = r2.getBoolean(r0)
            java.lang.Object r2 = r8.obj
            X.1VM r2 = (X.AnonymousClass1VM) r2
            r3.A0g(r1, r2, r4, r5, r6)
            return
        L_0x0074:
            X.1WK r4 = r7.A00
            r3 = 0
            goto L_0x007b
        L_0x0078:
            X.1WK r4 = r7.A00
            r3 = 1
        L_0x007b:
            android.os.Bundle r0 = r8.getData()
            long r1 = r0.getLong(r1)
            android.os.Bundle r0 = r8.getData()
            int r0 = r0.getInt(r5, r6)
            r4.A0U(r0, r1, r3)
            return
        L_0x008f:
            X.1WK r1 = r7.A00
            int r0 = r8.arg1
            r1.A0S(r0)
            return
        L_0x0097:
            X.1WK r0 = r7.A00
            r0.A0Z(r8)
            return
        L_0x009d:
            X.1WK r0 = r7.A00
            r0.A0P()
            return
        L_0x00a3:
            X.1WK r0 = r7.A00
            r0.A0O()
            return
        L_0x00a9:
            X.1WK r0 = r7.A00
            r0.A0N()
            return
        L_0x00af:
            java.lang.String r0 = "ConnectionThread/handleNetworkBlocked/socket already closed or disconnecting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.005 r0 = r2.A1G
            java.lang.Object r0 = r0.get()
            X.1W5 r0 = (X.AnonymousClass1W5) r0
            r0.A02(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31911ca.handleMessage(android.os.Message):void");
    }
}
