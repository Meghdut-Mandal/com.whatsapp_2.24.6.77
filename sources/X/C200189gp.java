package X;

import android.system.OsConstants;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/* renamed from: X.9gp  reason: invalid class name and case insensitive filesystem */
public class C200189gp {
    public final Socket A00;

    public void A03() {
        this.A00.setKeepAlive(true);
    }

    public void A04() {
        this.A00.setSoLinger(true, 0);
    }

    public InetAddress A01() {
        return this.A00.getInetAddress();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|(1:3)|4|5|(1:7)|8|9|(2:11|12)(1:16)) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        com.whatsapp.util.Log.i("ConnectionSocketDefault/closeSocket ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e A[Catch:{ Exception -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[Catch:{ Exception -> 0x0016 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r2 = this;
            java.net.Socket r1 = r2.A00     // Catch:{ Exception -> 0x000b }
            boolean r0 = r1.isOutputShutdown()     // Catch:{ Exception -> 0x000b }
            if (r0 != 0) goto L_0x000b
            r1.shutdownOutput()     // Catch:{ Exception -> 0x000b }
        L_0x000b:
            java.net.Socket r1 = r2.A00     // Catch:{ Exception -> 0x0016 }
            boolean r0 = r1.isInputShutdown()     // Catch:{ Exception -> 0x0016 }
            if (r0 != 0) goto L_0x0016
            r1.shutdownInput()     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            java.net.Socket r1 = r2.A00     // Catch:{ Exception -> 0x0022 }
            boolean r0 = r1.isClosed()     // Catch:{ Exception -> 0x0022 }
            if (r0 != 0) goto L_0x0028
            r1.close()     // Catch:{ Exception -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            java.lang.String r0 = "ConnectionSocketDefault/closeSocket "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200189gp.A02():void");
    }

    public void A05(int i) {
        this.A00.setSoTimeout(i);
    }

    public void A06(int i) {
        A00(OsConstants.IPPROTO_TCP, 6, i);
    }

    public void A07(int i) {
        A00(OsConstants.IPPROTO_TCP, 4, i);
    }

    public void A08(int i) {
        A00(OsConstants.IPPROTO_TCP, 5, i);
    }

    public boolean A09() {
        return this.A00.isClosed();
    }

    public C200189gp(Socket socket) {
        this.A00 = socket;
    }

    private void A00(int i, int i2, int i3) {
        if (C19550w8.A03()) {
            C1900096n.A00(this.A00, i, i2, i3);
            return;
        }
        throw AnonymousClass001.A0D();
    }

    public boolean A0A() {
        if (!C19550w8.A03() || (this.A00 instanceof SSLSocket)) {
            return false;
        }
        return true;
    }
}
