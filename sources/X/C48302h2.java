package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.status.ContactStatusThumbnail;

/* renamed from: X.2h2  reason: invalid class name and case insensitive filesystem */
public final class C48302h2 extends C48492hP {
    public ImageView A00;
    public final View A01;
    public final ViewStub A02;
    public final TextEmojiLabel A03;
    public final ContactStatusThumbnail A04;
    public final C32111cz A05;
    public final AnonymousClass13J A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48302h2(View view, AnonymousClass1Pp r14, AnonymousClass1RY r15, C70143ef r16, C28331Sf r17, C32111cz r18, AnonymousClass13J r19) {
        super(view, r14, r15, r16, (C55662uz) null, (AnonymousClass39Z) null, (AnonymousClass3O2) null);
        AnonymousClass00C.A0D(view, 1);
        C28331Sf r3 = r17;
        AnonymousClass13J r1 = r19;
        C36321k7.A1A(r15, r14, r3, r1, 2);
        this.A06 = r1;
        this.A05 = r18;
        ContactStatusThumbnail contactStatusThumbnail = (ContactStatusThumbnail) view.findViewById(R.id.contact_thumbnail);
        this.A04 = contactStatusThumbnail;
        this.A02 = C36431kI.A0M(view, R.id.status_badge_stub);
        this.A03 = C36401kF.A0P(view, R.id.contact_name);
        this.A07 = r3.A00.A0E(6512);
        AnonymousClass3Y9.A00(contactStatusThumbnail, this, 28);
        this.A01 = C36361kB.A0F(view, R.id.badge_click_surface);
    }
}
