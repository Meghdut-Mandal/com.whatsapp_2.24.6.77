package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.1yI  reason: invalid class name and case insensitive filesystem */
public final class C42111yI extends AnonymousClass0D3 {
    public final WaImageView A00;
    public final WaTextView A01;
    public final WaTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42111yI(View view) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A02 = C36351kA.A0Q(view, R.id.description_text);
        this.A01 = C36351kA.A0Q(view, R.id.command_text);
        this.A00 = (WaImageView) C36361kB.A0F(view, R.id.command_image);
    }
}
