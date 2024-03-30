package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0cn  reason: invalid class name and case insensitive filesystem */
public final class C09700cn implements C17280r1 {
    public final ContentInfo.Builder A00;

    public AnonymousClass0X6 B20() {
        return new AnonymousClass0X6(new C09720cp(this.A00.build()));
    }

    public void BqR(ClipData clipData) {
        this.A00.setClip(clipData);
    }

    public void Bqs(int i) {
        this.A00.setFlags(i);
    }

    public void Br8(Uri uri) {
        this.A00.setLinkUri(uri);
    }

    public void setExtras(Bundle bundle) {
        this.A00.setExtras(bundle);
    }

    public C09700cn(ClipData clipData, int i) {
        this.A00 = new ContentInfo.Builder(clipData, i);
    }

    public C09700cn(AnonymousClass0X6 r3) {
        this.A00 = new ContentInfo.Builder(r3.A02());
    }
}
