package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.1yl  reason: invalid class name and case insensitive filesystem */
public class C42401yl extends AnonymousClass0D3 {
    public final TextView A00;
    public final AnonymousClass3SF A01;
    public final ThumbnailButton A02;
    public final AnonymousClass16D A03;
    public final C18820ts A04;
    public final C21010yW A05;
    public final C21100yf A06;
    public final AnonymousClass171 A07;

    public C42401yl(View view, C21100yf r3, AnonymousClass1LI r4, AnonymousClass16D r5, AnonymousClass171 r6, C18820ts r7, C21010yW r8) {
        super(view);
        this.A05 = r8;
        this.A06 = r3;
        this.A03 = r5;
        this.A07 = r6;
        this.A04 = r7;
        this.A02 = (ThumbnailButton) C012005e.A02(view, R.id.storage_usage_chat_contact_photo);
        this.A00 = C36391kE.A0O(view, R.id.storage_usage_chat_used_space);
        this.A01 = AnonymousClass3SF.A01(view, r4, R.id.storage_usage_chat_contact_name);
        C33521fV.A02(view);
    }
}
