package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.0co  reason: invalid class name and case insensitive filesystem */
public final class C09710co implements C17280r1 {
    public int A00;
    public int A01;
    public ClipData A02;
    public Uri A03;
    public Bundle A04;

    public AnonymousClass0X6 B20() {
        return new AnonymousClass0X6(new C09730cq(this));
    }

    public C09710co(ClipData clipData, int i) {
        this.A02 = clipData;
        this.A01 = i;
    }

    public void BqR(ClipData clipData) {
        this.A02 = clipData;
    }

    public void Bqs(int i) {
        this.A00 = i;
    }

    public void Br8(Uri uri) {
        this.A03 = uri;
    }

    public void setExtras(Bundle bundle) {
        this.A04 = bundle;
    }

    public C09710co(AnonymousClass0X6 r3) {
        C17310r4 r1 = r3.A00;
        this.A02 = r1.B9k();
        this.A01 = r1.BHk();
        this.A00 = r1.BBx();
        this.A03 = r1.getLinkUri();
        this.A04 = r1.getExtras();
    }
}
