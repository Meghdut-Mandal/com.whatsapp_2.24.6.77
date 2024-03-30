package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.WrapIconTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;

/* renamed from: X.2hN  reason: invalid class name and case insensitive filesystem */
public final class C48472hN extends C42581z3 {
    public ImageView A00;
    public WaTextView A01;
    public final View A02;
    public final ViewStub A03;
    public final ViewStub A04;
    public final AnonymousClass3SF A05;
    public final WaTextView A06;
    public final WrapIconTextView A07;
    public final ThumbnailButton A08;
    public final AnonymousClass1RY A09;
    public final AnonymousClass1GQ A0A;
    public final AnonymousClass3G9 A0B;
    public final UpdatesAdapter A0C;
    public final AnonymousClass3KS A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48472hN(View view, AnonymousClass1LI r3, AnonymousClass1RY r4, AnonymousClass1GQ r5, AnonymousClass3G9 r6, UpdatesAdapter updatesAdapter, AnonymousClass3KS r8) {
        super(view);
        C36331k8.A1G(r4, 3, r3);
        AnonymousClass00C.A0D(r5, 7);
        this.A0C = updatesAdapter;
        this.A09 = r4;
        this.A0B = r6;
        this.A0D = r8;
        this.A0A = r5;
        this.A07 = (WrapIconTextView) C36361kB.A0F(view, R.id.newsletter_message);
        this.A08 = (ThumbnailButton) C36361kB.A0F(view, R.id.contact_thumbnail);
        this.A05 = AnonymousClass3SF.A01(view, r3, R.id.newsletter_contact_name);
        this.A04 = (ViewStub) C36361kB.A0F(view, R.id.unread_indicator_view_stub);
        this.A03 = (ViewStub) C36361kB.A0F(view, R.id.media_preview_view_stub);
        this.A06 = C36351kA.A0Q(view, R.id.post_time_text);
        this.A02 = C36361kB.A0F(view, R.id.metadata_container);
    }
}
