package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.view.inputmethod.InputContentInfoCompat;

/* renamed from: X.0WI  reason: invalid class name */
public final class AnonymousClass0WI {
    public final C17280r1 A00;

    public static AnonymousClass0X6 A00(Bundle bundle, InputContentInfoCompat inputContentInfoCompat) {
        AnonymousClass0WI r2 = new AnonymousClass0WI(new ClipData(inputContentInfoCompat.mImpl.getDescription(), new ClipData.Item(inputContentInfoCompat.mImpl.getContentUri())), 2);
        Uri linkUri = inputContentInfoCompat.mImpl.getLinkUri();
        C17280r1 r0 = r2.A00;
        r0.Br8(linkUri);
        r0.setExtras(bundle);
        return r0.B20();
    }

    public AnonymousClass0WI(ClipData clipData, int i) {
        C17280r1 r0;
        if (Build.VERSION.SDK_INT >= 31) {
            r0 = new C09700cn(clipData, i);
        } else {
            r0 = new C09710co(clipData, i);
        }
        this.A00 = r0;
    }

    public AnonymousClass0WI(AnonymousClass0X6 r3) {
        C17280r1 r0;
        if (Build.VERSION.SDK_INT >= 31) {
            r0 = new C09700cn(r3);
        } else {
            r0 = new C09710co(r3);
        }
        this.A00 = r0;
    }
}
