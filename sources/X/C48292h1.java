package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.status.ContactStatusThumbnail;

/* renamed from: X.2h1  reason: invalid class name and case insensitive filesystem */
public final class C48292h1 extends C48492hP {
    public final View A00;
    public final ViewStub A01;
    public final AnonymousClass3SF A02;
    public final AnonymousClass171 A03;
    public final C18820ts A04;
    public final ContactStatusThumbnail A05;
    public final C32101cy A06;
    public final AnonymousClass1LI A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48292h1(View view, AnonymousClass1LI r11, AnonymousClass1Pp r12, AnonymousClass171 r13, AnonymousClass1RY r14, C18820ts r15, C70143ef r16, C32101cy r17) {
        super(view, r12, r14, r16, (C55662uz) null, (AnonymousClass39Z) null, (AnonymousClass3O2) null);
        AnonymousClass00C.A0D(r12, 1);
        C36321k7.A1A(r13, r15, r11, r14, 3);
        AnonymousClass00C.A0D(view, 7);
        this.A03 = r13;
        this.A04 = r15;
        this.A07 = r11;
        this.A00 = view;
        this.A06 = r17;
        this.A05 = (ContactStatusThumbnail) view.findViewById(R.id.contact_thumbnail);
        this.A01 = C36431kI.A0M(view, R.id.status_badge_stub);
        this.A02 = AnonymousClass3SF.A01(view, r11, R.id.contact_name);
    }
}
