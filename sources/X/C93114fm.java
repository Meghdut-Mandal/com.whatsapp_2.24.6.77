package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4fm  reason: invalid class name and case insensitive filesystem */
public final class C93114fm extends RelativeLayout {
    public WaTextView A00 = C36341k9.A0Q(this, R.id.category_thumbnail_text);

    public C93114fm(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
    }

    public final void setText(String str) {
        AnonymousClass00C.A0D(str, 0);
        WaTextView waTextView = this.A00;
        if (waTextView == null) {
            throw C36331k8.A0d("thumbnailText");
        }
        waTextView.setText(str);
    }
}
