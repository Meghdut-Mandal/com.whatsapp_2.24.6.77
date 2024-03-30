package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.71m  reason: invalid class name and case insensitive filesystem */
public final class C1495071m implements Closeable {
    public final InputStream[] A00;
    public final long[] A01;
    public final /* synthetic */ C1495971y A02;

    public C1495071m(C1495971y r1, long[] jArr, InputStream[] inputStreamArr) {
        this.A02 = r1;
        this.A00 = inputStreamArr;
        this.A01 = jArr;
    }

    public void close() {
        InputStream[] inputStreamArr = this.A00;
        int length = inputStreamArr.length;
        for (int i = 0; i < length; i = 1) {
            C1495971y.A02(inputStreamArr[i]);
        }
    }
}
