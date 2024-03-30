package X;

import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0zK  reason: invalid class name and case insensitive filesystem */
public class C21490zK implements C21470zI {
    public final C21010yW A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public void B11(int i, String str) {
        A00("markerId:%d, annotationKey:%s", new Object[]{Integer.valueOf(i), str}, 13);
    }

    public void B12(int i, String str) {
        A00("markerId:%d, key:%s", new Object[]{Integer.valueOf(i), str}, 23);
    }

    public void B13(int i, String str, int i2) {
        A00("markerId:%d, annotationKey:%s", new Object[]{Integer.valueOf(i), str}, 1);
    }

    public void B1g() {
        A00((String) null, new Object[0], 17);
    }

    public void B6l(String str) {
        A00("errorString:%s", new Object[]{str}, 16);
    }

    public void B6m(String str) {
        A00("errorString:%s", new Object[]{str}, 11);
    }

    public void B6n(String str) {
        A00("errorString:%s", new Object[]{str}, 15);
    }

    public void B6o(String str) {
        if (str != null && str.length() > 200) {
            str = str.substring(0, 200);
        }
        A00("errorString:%s", new Object[]{str}, 10);
    }

    public void B6p(String str) {
        A00("errorString:%s", new Object[]{str}, 8);
    }

    public void B6w(int i) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i)}, 22);
    }

    public void BKG(int i, String str, double d) {
        A00("markerId:%d, annotationKey:%s, value:%s", new Object[]{Integer.valueOf(i), str, Double.toString(d)}, 7);
    }

    public void BNs(int i, String str) {
        A00("markerId:%d, errorString:%s", new Object[]{Integer.valueOf(i), str}, 6);
    }

    public void BPT() {
        A00((String) null, new Object[0], 9);
    }

    public void BPV(int i) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i)}, 3);
    }

    public void BPW(int i) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i)}, 2);
    }

    public void BQF(int i) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i)}, 20);
    }

    public void Blf(int i, String str) {
        A00("markerId:%d, data:%s", new Object[]{Integer.valueOf(i), str}, 14);
    }

    public void Blg(int i, String str) {
        A00("markerId:%d, pointName:%s", new Object[]{Integer.valueOf(i), str}, 12);
    }

    public void Blh(int i, String str) {
        A00("markerId:%d, pointName:%s", new Object[]{Integer.valueOf(i), str}, 5);
    }

    public void BoH(String str) {
        A00("msg: %s", new Object[]{str}, 24);
    }

    public void Bvx(Collection collection) {
        Object[] objArr = new Object[1];
        String str = "null";
        if (collection != null) {
            str = collection.toString();
        }
        objArr[0] = str;
        A00("allOpenMarkerIds:%s", objArr, 4);
    }

    public void BwI() {
        A00((String) null, new Object[0], 18);
    }

    private void A00(String str, Object[] objArr, int i) {
        if (this.A01.getAndIncrement() < 5) {
            C44692Om r1 = new C44692Om();
            r1.A00 = Integer.valueOf(i);
            if (str != null) {
                r1.A01 = String.format(Locale.US, str, objArr);
            }
            this.A00.Bly(r1);
        }
    }

    public C21490zK(C21010yW r2) {
        this.A00 = r2;
    }
}
