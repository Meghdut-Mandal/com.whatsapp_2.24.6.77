package X;

import java.io.OutputStream;
import java.util.List;
import javax.net.ssl.SSLException;

/* renamed from: X.8xz  reason: invalid class name and case insensitive filesystem */
public class C187508xz extends OutputStream {
    public boolean A00 = false;
    public final C22823AwY A01;

    public void close() {
        this.A00 = true;
    }

    public void write(byte[] bArr, int i, int i2) {
        List list;
        if (!this.A00) {
            C21914Ack ack = (C21914Ack) this.A01;
            try {
                int i3 = i2;
                AnonymousClass9RQ r6 = new AnonymousClass9RQ(bArr, i, i3);
                if (ack.A0C && !ack.A0B) {
                    C21224ADg aDg = ack.A03;
                    if (!(!aDg.A0Z || aDg.A0T == null || (list = aDg.A0U) == null)) {
                        aDg.A0a = true;
                        long j = (long) i3;
                        long j2 = aDg.A0E.A01.maxEarlyDataSize;
                        if (aDg.A06 + j > j2) {
                            aDg.A06 = j2;
                            long j3 = aDg.A07 + j;
                            long j4 = aDg.A08;
                            if (j3 <= j4) {
                                aDg.A07 = j3;
                                list.add(r6);
                                return;
                            }
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("Client request exceeded the max spillover limit ");
                            A0u.append(j3);
                            A0u.append(" > ");
                            A0u.append(j4);
                            throw C165567td.A0D(A0u, (byte) 80);
                        }
                        ack.A06.A00(new C178148ex(r6));
                        ack.A03.A0T.add(r6);
                        ack.A03.A06 += j;
                        return;
                    }
                }
                ack.A06.A00(new C178098es(r6));
            } catch (C21240yt e) {
                C21914Ack.A06(ack, e.ex, (byte) 2, e.description, e.errorTransient);
            } catch (Exception e2) {
                C21914Ack.A06(ack, new SSLException(C165587tf.A0m(e2)), (byte) 2, (byte) 80, false);
            }
        } else {
            throw C90524aI.A0X("Stream is closed.");
        }
    }

    public C187508xz(C22823AwY awY) {
        this.A01 = awY;
    }

    public void write(int i) {
        if (!this.A00) {
            write(new byte[]{(byte) (i & 255)}, 0, 1);
            return;
        }
        throw C90524aI.A0X("Stream is closed.");
    }

    public void write(byte[] bArr) {
        if (!this.A00) {
            write(bArr, 0, bArr.length);
            return;
        }
        throw C90524aI.A0X("Stream is closed.");
    }
}
