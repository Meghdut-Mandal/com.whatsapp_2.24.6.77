package X;

import android.util.Pair;
import java.util.Locale;

/* renamed from: X.9Ug  reason: invalid class name and case insensitive filesystem */
public class C195429Ug {
    public int A00;
    public int A01;
    public long A02 = -1;
    public long A03 = Long.MAX_VALUE;
    public Pair A04;
    public Long A05;
    public Long A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final C201379jQ A0A;
    public final String A0B;

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        C165577te.A1V(objArr, this.A09);
        AnonymousClass000.A1K(objArr, this.A01);
        C36331k8.A1V(objArr, this.A00);
        objArr[3] = this.A06;
        objArr[4] = this.A05;
        objArr[5] = Pair.create(Long.valueOf(this.A03), Long.valueOf(this.A02));
        return String.format(locale, "isKeyCached=%s, mNetworkRequests=%d, mCacheRequests=%d, mRequestedRange=[%d,%d], mDynamicRange=%s", objArr);
    }

    public C195429Ug(C201379jQ r3, String str) {
        this.A0A = r3;
        this.A0B = str;
    }
}
