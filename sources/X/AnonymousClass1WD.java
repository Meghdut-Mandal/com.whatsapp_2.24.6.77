package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;

/* renamed from: X.1WD  reason: invalid class name */
public class AnonymousClass1WD {
    public final AnonymousClass1WB A00;
    public final C21080yd A01;
    public final Random A02;

    public static InputStream A00(C200189gp r1, AnonymousClass6L6 r2) {
        boolean z = r2.A01;
        InputStream inputStream = r1.A00.getInputStream();
        if (z) {
            return new C107785Qw(inputStream);
        }
        return inputStream;
    }

    public static OutputStream A01(C200189gp r1, AnonymousClass6L6 r2) {
        boolean z = r2.A01;
        OutputStream outputStream = r1.A00.getOutputStream();
        if (z) {
            return new AnonymousClass5R0(outputStream);
        }
        return outputStream;
    }

    public C200189gp A02(AnonymousClass6L6 r18) {
        C183228qQ r5;
        ReentrantLock reentrantLock;
        Object obj;
        ReentrantLock reentrantLock2;
        C183228qQ r2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass6L6 r22 = r18;
        InetAddress[] inetAddressArr = r22.A04;
        for (InetAddress inetAddress : inetAddressArr) {
            if (inetAddress.getAddress().length > 4) {
                arrayList2.add(inetAddress);
            } else {
                arrayList.add(inetAddress);
            }
        }
        C21080yd r4 = this.A01;
        synchronized (r4) {
            r5 = r4.A00;
            if (r5 == null) {
                r5 = new C183228qQ(r4.A06.A00, r4.A08);
                r4.A00 = r5;
            }
        }
        if (arrayList.size() <= 0 || arrayList2.size() <= 0) {
            arrayList.size();
            arrayList2.size();
            C18740tg.A06(inetAddressArr);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddressArr[this.A02.nextInt(r10)], r22.A00);
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectionSocketFactory/try_connect/");
            sb.append(inetSocketAddress);
            sb.append(" (secureSocket? ");
            boolean z = r22.A03;
            sb.append(z);
            sb.append(')');
            Log.i(sb.toString());
            Socket socket = AnonymousClass1WB.A05;
            Socket createSocket = SocketFactory.getDefault().createSocket();
            createSocket.connect(inetSocketAddress, 30000);
            if (z) {
                createSocket = r5.createSocket(createSocket, inetSocketAddress.getHostName(), inetSocketAddress.getPort(), true);
                ((SSLSocket) createSocket).startHandshake();
            }
            return new C200189gp(createSocket);
        }
        Random random = this.A02;
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress((InetAddress) arrayList.get(random.nextInt(arrayList.size())), r22.A00);
        InetSocketAddress inetSocketAddress3 = new InetSocketAddress((InetAddress) arrayList2.get(random.nextInt(arrayList2.size())), r22.A00);
        Log.i("ConnectionSocketFactory/try_connect/using-happyEyeball");
        AnonymousClass1WB r6 = this.A00;
        boolean z2 = r22.A03;
        AnonymousClass635 r7 = new AnonymousClass635();
        synchronized (r6) {
            r6.A01 = false;
            if (r6.A00 == null) {
                C21080yd r3 = r6.A03;
                synchronized (r3) {
                    r2 = r3.A00;
                    if (r2 == null) {
                        r2 = new C183228qQ(r3.A06.A00, r3.A08);
                        r3.A00 = r2;
                    }
                }
                r6.A00 = r2;
            }
        }
        AnonymousClass1WB.A00(r6).execute(new C35361iZ(r6, r7, inetSocketAddress3, 2, z2));
        try {
            reentrantLock2 = r7.A02;
            reentrantLock2.lockInterruptibly();
            for (long nanos = TimeUnit.MILLISECONDS.toNanos(250); nanos > 0; nanos = r7.A01.awaitNanos(nanos)) {
                if (r7.A00 != null) {
                    break;
                }
            }
            Object obj2 = r7.A00;
            reentrantLock2.unlock();
            Socket socket2 = (Socket) obj2;
            if (socket2 != null) {
                return new C200189gp(socket2);
            }
            Log.i("happyEyeball/couldn't connect to ipv6 in 250 ms");
            AnonymousClass1WB.A00(r6).execute(new C35361iZ(r6, r7, inetSocketAddress2, 3, z2));
            try {
                reentrantLock = r7.A02;
                reentrantLock.lockInterruptibly();
                while (true) {
                    obj = r7.A00;
                    if (obj != null) {
                        break;
                    }
                    r7.A01.await();
                }
                reentrantLock.unlock();
                Socket socket3 = (Socket) obj;
                if (!(socket3 == null || !socket3.isConnected() || socket3 == AnonymousClass1WB.A05)) {
                    return new C200189gp(socket3);
                }
            } catch (InterruptedException e) {
                Log.w("HappyEyeball", e);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
            throw new IOException("HappyEyeball/couldn't connect to neither of ips");
        } catch (InterruptedException e2) {
            Log.e("HappyEyeball/try_connect exception short wait for ipv6", e2);
        } catch (Throwable th2) {
            reentrantLock2.unlock();
            throw th2;
        }
    }

    public AnonymousClass1WD(AnonymousClass1WB r1, C21080yd r2, Random random) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = random;
    }
}
