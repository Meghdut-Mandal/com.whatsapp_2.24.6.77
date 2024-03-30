package X;

import android.net.TrafficStats;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1WB  reason: invalid class name */
public class AnonymousClass1WB {
    public static final Socket A05 = new Socket();
    public SSLSocketFactory A00;
    public boolean A01;
    public ThreadPoolExecutor A02;
    public final C21080yd A03;
    public final C19770wU A04;

    public static synchronized ThreadPoolExecutor A00(AnonymousClass1WB r11) {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (r11) {
            threadPoolExecutor = r11.A02;
            if (threadPoolExecutor == null) {
                C19770wU r2 = r11.A04;
                threadPoolExecutor = new C50342kb((C19780wV) r2, new ArrayBlockingQueue(2), new C19830wa(1, "happy-eyeball"), TimeUnit.SECONDS, 2, 2, 30, false);
                r11.A02 = threadPoolExecutor;
            }
        }
        return threadPoolExecutor;
    }

    public static void A01(AnonymousClass1WB r8, AnonymousClass635 r9, InetSocketAddress inetSocketAddress, boolean z) {
        try {
            TrafficStats.setThreadStatsTag(1);
            SSLSocketFactory sSLSocketFactory = r8.A00;
            Socket createSocket = SocketFactory.getDefault().createSocket();
            StringBuilder sb = new StringBuilder();
            sb.append("HappyEyeball");
            sb.append("/try_connect/");
            sb.append(inetSocketAddress);
            sb.append(" (secureSocket? ");
            sb.append(z);
            sb.append(')');
            Log.i(sb.toString());
            createSocket.connect(inetSocketAddress, 30000);
            if (z) {
                createSocket = sSLSocketFactory.createSocket(createSocket, inetSocketAddress.getHostName(), inetSocketAddress.getPort(), true);
                ((SSLSocket) createSocket).startHandshake();
            }
            C200189gp r1 = new C200189gp(createSocket);
            if (!r9.A00(r1.A00)) {
                Log.i("HappyEyeball/closeSocket");
                r1.A02();
            }
        } catch (IOException | ClassCastException e) {
            if (!(e instanceof ClassCastException) || Build.VERSION.SDK_INT == 26) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HappyEyeball/connectAndCountDown/");
                sb2.append(inetSocketAddress);
                sb2.append("/couldn't connect to ip");
                Log.e(sb2.toString(), e);
                synchronized (r8) {
                    if (r8.A01) {
                        r9.A00(A05);
                    } else {
                        r8.A01 = true;
                    }
                }
            } else {
                throw ((ClassCastException) e);
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
        TrafficStats.clearThreadStatsTag();
    }

    public AnonymousClass1WB(C21080yd r1, C19770wU r2) {
        this.A04 = r2;
        this.A03 = r1;
    }
}
