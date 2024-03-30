package X;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.5c2  reason: invalid class name and case insensitive filesystem */
public abstract class C111285c2 {
    public static final Notification A00(Context context) {
        IconCompat A02;
        String str;
        int i;
        AnonymousClass00C.A0D(context, 0);
        Icon createWithResource = Icon.createWithResource(context, R.drawable.notifybar);
        Objects.requireNonNull(createWithResource);
        int A01 = C07630Yq.A01(createWithResource);
        if (A01 != 2) {
            if (A01 == 4) {
                Uri A04 = C07630Yq.A04(createWithResource);
                Objects.requireNonNull(A04);
                str = A04.toString();
                Objects.requireNonNull(str);
                i = 4;
            } else if (A01 != 6) {
                A02 = new IconCompat(-1);
                A02.A06 = createWithResource;
            } else {
                Uri A042 = C07630Yq.A04(createWithResource);
                Objects.requireNonNull(A042);
                str = A042.toString();
                Objects.requireNonNull(str);
                i = 6;
            }
            A02 = new IconCompat(i);
            A02.A06 = str;
        } else {
            String A05 = C07630Yq.A05(createWithResource);
            try {
                A02 = IconCompat.A02(IconCompat.A00(context, A05), A05, C07630Yq.A00(createWithResource));
            } catch (Resources.NotFoundException unused) {
                throw AnonymousClass001.A08("Icon resource cannot be found");
            }
        }
        C07700Yy r0 = new C07700Yy(context, "other_notifications@1");
        r0.A0D(A02);
        return r0.A05();
    }
}
