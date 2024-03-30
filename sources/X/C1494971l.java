package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.71l  reason: invalid class name and case insensitive filesystem */
public final class C1494971l implements Closeable {
    public final InputStream[] A00;
    public final /* synthetic */ C1496071z A01;

    public C1494971l(C1496071z r1, InputStream[] inputStreamArr) {
        this.A01 = r1;
        this.A00 = inputStreamArr;
    }

    public void close() {
        InputStream[] inputStreamArr = this.A00;
        int length = inputStreamArr.length;
        for (int i = 0; i < length; i = 1) {
            C1496071z.A06(inputStreamArr[i]);
        }
    }
}
