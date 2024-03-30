package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.3w8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80893w8 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C65013Qj A02;
    public final /* synthetic */ AnonymousClass4UL A03;
    public final /* synthetic */ AnonymousClass1XY A04;
    public final /* synthetic */ AnonymousClass3XT A05;
    public final /* synthetic */ AnonymousClass3T1 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ byte[] A0A;

    public /* synthetic */ C80893w8(C65013Qj r1, AnonymousClass4UL r2, AnonymousClass1XY r3, AnonymousClass3XT r4, AnonymousClass3T1 r5, String str, List list, byte[] bArr, int i, int i2, boolean z) {
        this.A04 = r3;
        this.A08 = list;
        this.A02 = r1;
        this.A01 = i;
        this.A09 = z;
        this.A07 = str;
        this.A06 = r5;
        this.A05 = r4;
        this.A00 = i2;
        this.A0A = bArr;
        this.A03 = r2;
    }

    public final void run() {
        int i;
        AnonymousClass1XY r4 = this.A04;
        List list = this.A08;
        C65013Qj r8 = this.A02;
        int i2 = this.A01;
        boolean z = this.A09;
        String str = this.A07;
        AnonymousClass3T1 r10 = this.A06;
        AnonymousClass3XT r9 = this.A05;
        int i3 = this.A00;
        byte[] bArr = this.A0A;
        AnonymousClass1D5 r6 = r4.A08;
        if (i2 == 1) {
            i = 81;
        } else {
            i = 3;
            if (z) {
                i = 13;
            }
        }
        AnonymousClass3SC A042 = r6.A04((Uri) null, r8, r9, r10, str, list, (List) null, (List) null, i, 0, 0, false);
        A042.A00 = i3;
        r4.A02.A0C(A042, (Integer) null, bArr, false, false);
    }
}
