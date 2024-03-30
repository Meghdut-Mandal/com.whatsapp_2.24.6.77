package X;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.9lD  reason: invalid class name and case insensitive filesystem */
public final class C202189lD {
    public static final C202189lD A09 = new C202189lD(Uri.parse("www.facebook.com"), new C199149em(), (String) null, (byte[]) null, 0, 0, 0, -1);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final C199149em A05;
    public final String A06;
    public final Map A07;
    public final byte[] A08;

    public C202189lD(Uri uri, long j, long j2) {
        this(uri, new C199149em(), (String) null, (byte[]) null, 0, j, j, j2);
    }

    public void A00(Map map) {
        Map map2 = this.A05.A0N;
        map2.clear();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            map2.put(A11.getKey(), A11.getValue());
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DataSpec[");
        C36351kA.A1K(this.A04, A0u);
        A0u.append(", ");
        C90474aD.A1O(A0u, this.A08);
        A0u.append(", ");
        A0u.append(this.A01);
        A0u.append(", ");
        A0u.append(this.A03);
        A0u.append(", ");
        A0u.append(this.A02);
        A0u.append(", ");
        A0u.append(this.A06);
        A0u.append(", ");
        A0u.append(this.A00);
        A0u.append(", ");
        C199149em r0 = this.A05;
        C36351kA.A1K(r0, A0u);
        A0u.append(", ");
        return C165567td.A0Y(r0.A0N.toString(), A0u);
    }

    public C202189lD(Uri uri) {
        this(uri, new C199149em(), (String) null, (byte[]) null, 0, 0, 0, -1);
    }

    public C202189lD(Uri uri, C199149em r4, String str, byte[] bArr, int i, long j, long j2, long j3) {
        Map emptyMap = Collections.emptyMap();
        Objects.requireNonNull(r4);
        this.A04 = uri;
        this.A08 = bArr;
        this.A07 = Collections.unmodifiableMap(new HashMap(emptyMap));
        this.A03 = j2;
        this.A01 = (j - j2) + j2;
        this.A02 = j3;
        this.A06 = str;
        this.A00 = i;
        this.A05 = r4;
    }
}
