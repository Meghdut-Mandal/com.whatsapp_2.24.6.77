package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: X.0cp  reason: invalid class name and case insensitive filesystem */
public final class C09720cp implements C17310r4 {
    public final ContentInfo A00;

    public ClipData B9k() {
        return this.A00.getClip();
    }

    public int BBx() {
        return this.A00.getFlags();
    }

    public int BHk() {
        return this.A00.getSource();
    }

    public Bundle getExtras() {
        return this.A00.getExtras();
    }

    public Uri getLinkUri() {
        return this.A00.getLinkUri();
    }

    public C09720cp(ContentInfo contentInfo) {
        Objects.requireNonNull(contentInfo);
        this.A00 = contentInfo;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContentInfoCompat{");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("}", A0u);
    }

    public ContentInfo BJJ() {
        return this.A00;
    }
}
