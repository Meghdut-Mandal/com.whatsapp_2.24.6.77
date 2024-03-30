package X;

import android.content.Context;
import android.net.Uri;
import java.util.List;
import java.util.Objects;

public class A0N implements B39 {
    public B39 A00;
    public B39 A01;
    public B39 A02;
    public B39 A03;
    public B39 A04;
    public B39 A05;
    public B39 A06;
    public B39 A07;
    public final Context A08;
    public final B39 A09;
    public final List A0A = AnonymousClass001.A0I();

    private void A00(B39 b39) {
        int i = 0;
        while (true) {
            List list = this.A0A;
            if (i < list.size()) {
                b39.B0p((B2E) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ void cancel() {
        throw null;
    }

    public A0N(Context context, B2E b2e, String str) {
        AnonymousClass83J r1 = new AnonymousClass83J((AnonymousClass9GM) null, b2e, str, 8000, 8000);
        this.A08 = context.getApplicationContext();
        Objects.requireNonNull(r1);
        this.A09 = r1;
        if (b2e != null) {
            B0p(b2e);
        }
    }

    public Uri BIj() {
        B39 b39 = this.A07;
        if (b39 == null) {
            return null;
        }
        return b39.BIj();
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bks(X.C202189lD r5) {
        /*
            r4 = this;
            X.B39 r0 = r4.A07
            boolean r0 = X.AnonymousClass000.A1W(r0)
            X.C200319h9.A02(r0)
            android.net.Uri r3 = r5.A04
            java.lang.String r1 = r3.getScheme()
            java.lang.String r2 = r3.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "asset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            X.B39 r0 = r4.A01
            if (r0 != 0) goto L_0x0041
            android.content.Context r1 = r4.A08
            X.83G r0 = new X.83G
            r0.<init>(r1)
            r4.A01 = r0
            r4.A00(r0)
        L_0x0041:
            X.B39 r0 = r4.A01
        L_0x0043:
            r4.A07 = r0
            long r0 = r0.Bks(r5)
            return r0
        L_0x004a:
            java.lang.String r0 = "rtmp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0078
            X.B39 r0 = r4.A05
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "com.facebook.android.exoplayer2.ext.rtmp.RtmpDataSource"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fc }
            java.lang.Object r0 = X.C165607th.A0m(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fc }
            X.B39 r0 = (X.B39) r0     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fc }
            r4.A05 = r0     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fc }
            r4.A00(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fc }
            goto L_0x006f
        L_0x0068:
            java.lang.String r1 = "DefaultDataSource"
            java.lang.String r0 = "Attempting to play RTMP stream without depending on the RTMP extension"
            android.util.Log.w(r1, r0)
        L_0x006f:
            X.B39 r0 = r4.A05
            if (r0 != 0) goto L_0x0043
            X.B39 r0 = r4.A09
            r4.A05 = r0
            goto L_0x0043
        L_0x0078:
            java.lang.String r0 = "udp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0091
            X.B39 r0 = r4.A06
            if (r0 != 0) goto L_0x008e
            X.83I r0 = new X.83I
            r0.<init>()
            r4.A06 = r0
            r4.A00(r0)
        L_0x008e:
            X.B39 r0 = r4.A06
            goto L_0x0043
        L_0x0091:
            java.lang.String r0 = "data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00aa
            X.B39 r0 = r4.A02
            if (r0 != 0) goto L_0x00a7
            X.83C r0 = new X.83C
            r0.<init>()
            r4.A02 = r0
            r4.A00(r0)
        L_0x00a7:
            X.B39 r0 = r4.A02
            goto L_0x0043
        L_0x00aa:
            java.lang.String r0 = "rawresource"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c6
            X.B39 r0 = r4.A04
            if (r0 != 0) goto L_0x00c2
            android.content.Context r1 = r4.A08
            X.83H r0 = new X.83H
            r0.<init>(r1)
            r4.A04 = r0
            r4.A00(r0)
        L_0x00c2:
            X.B39 r0 = r4.A04
            goto L_0x0043
        L_0x00c6:
            X.B39 r0 = r4.A09
            goto L_0x0043
        L_0x00ca:
            java.lang.String r1 = r3.getPath()
            java.lang.String r0 = "/android_asset/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00e8
            X.B39 r0 = r4.A03
            if (r0 != 0) goto L_0x00e4
            X.83D r0 = new X.83D
            r0.<init>()
            r4.A03 = r0
            r4.A00(r0)
        L_0x00e4:
            X.B39 r0 = r4.A03
            goto L_0x0043
        L_0x00e8:
            X.B39 r0 = r4.A00
            if (r0 != 0) goto L_0x00f8
            android.content.Context r1 = r4.A08
            X.83E r0 = new X.83E
            r0.<init>(r1)
            r4.A00 = r0
            r4.A00(r0)
        L_0x00f8:
            X.B39 r0 = r4.A00
            goto L_0x0043
        L_0x00fc:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating RTMP extension"
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0N.Bks(X.9lD):long");
    }

    public void close() {
        B39 b39 = this.A07;
        if (b39 != null) {
            try {
                b39.close();
            } finally {
                this.A07 = null;
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A07.read(bArr, i, i2);
    }

    public void B0p(B2E b2e) {
        Objects.requireNonNull(b2e);
        this.A0A.add(b2e);
        B39 b39 = this.A03;
        if (b39 != null) {
            b39.B0p(b2e);
        }
        B39 b392 = this.A00;
        if (b392 != null) {
            b392.B0p(b2e);
        }
        B39 b393 = this.A01;
        if (b393 != null) {
            b393.B0p(b2e);
        }
        B39 b394 = this.A04;
        if (b394 != null) {
            b394.B0p(b2e);
        }
    }
}
