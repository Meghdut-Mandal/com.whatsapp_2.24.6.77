package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.events.EventNameAndDescriptionView$setUpGroupInfoSection$1;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.1q7  reason: invalid class name and case insensitive filesystem */
public final class C38801q7 extends LinearLayout implements C18700tb {
    public C24801Dv A00;
    public AnonymousClass16D A01;
    public C21060yb A02;
    public C18820ts A03;
    public AnonymousClass1H2 A04;
    public AnonymousClass190 A05;
    public C19890wg A06;
    public C32681e1 A07;
    public AnonymousClass1RJ A08;
    public AnonymousClass1QZ A09;
    public C005502l A0A;
    public C005502l A0B;
    public boolean A0C;
    public WaTextView A0D;
    public AnonymousClass1RJ A0E;
    public AnonymousClass1RJ A0F;

    public C38801q7(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A07 = C36351kA.A0p(A0W.A00);
            this.A05 = C36351kA.A0h(A0W);
            this.A04 = C36351kA.A0e(A0W);
            this.A00 = C36351kA.A0J(A0W);
            this.A01 = C36341k9.A0R(A0W);
            this.A02 = C36351kA.A0U(A0W);
            this.A03 = C36341k9.A0T(A0W);
            this.A06 = C36351kA.A0m(A0W);
            this.A0A = C25141Fd.A00();
            this.A0B = C24291Bw.A00();
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A0D = C36341k9.A0Q(this, R.id.event_info_name);
        this.A0F = C36341k9.A0X(this, R.id.event_info_description);
        this.A0E = C36341k9.A0X(this, R.id.event_info_canceled_label);
        this.A08 = C36341k9.A0X(this, R.id.event_info_group);
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setActivityUtils(C24801Dv r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setContactManager(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setEmojiLoader(AnonymousClass1H2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setIoDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public final void setLinkifier(C32681e1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setMainDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setSharedPreferencesFactory(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setWaIntents(AnonymousClass190 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    private final void setUpCanceledEvent(AnonymousClass2bT r8) {
        if (r8.A06) {
            this.A0E.A03(0);
            WaTextView waTextView = this.A0D;
            ViewGroup.LayoutParams layoutParams = waTextView.getLayoutParams();
            AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(waTextView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), waTextView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), C36371kC.A03(waTextView, R.dimen.f7nameremoved), 0);
            waTextView.setLayoutParams(marginLayoutParams);
        }
    }

    private final void setUpDescription(AnonymousClass2bT r7) {
        String str = r7.A03;
        if (str != null && str.length() != 0) {
            ReadMoreTextView readMoreTextView = (ReadMoreTextView) this.A0F.A01();
            readMoreTextView.setLinesLimit(5);
            Rect rect = AnonymousClass0BN.A0A;
            C36331k8.A16(readMoreTextView, getSystemServices());
            SpannableStringBuilder A0D2 = C36401kF.A0D(readMoreTextView, getSystemServices(), getSharedPreferencesFactory(), r7.A03);
            getLinkifier().A04(readMoreTextView.getContext(), A0D2);
            readMoreTextView.setText(AnonymousClass3UG.A03(readMoreTextView.getContext(), readMoreTextView.getPaint(), getEmojiLoader(), A0D2));
            readMoreTextView.setVisibility(0);
        }
    }

    private final void setUpGroupInfoSection(AnonymousClass2bT r4, AnonymousClass1RY r5, C51282nZ r6) {
        if (r6 != C51282nZ.COMMUNITY_NAVIGATION) {
            this.A08.A03(8);
            return;
        }
        C36331k8.A1T(new EventNameAndDescriptionView$setUpGroupInfoSection$1(r5, r4, this, (C023509x) null), C009403z.A02(getIoDispatcher()));
    }

    private final void setUpName(AnonymousClass2bT r6) {
        WaTextView waTextView = this.A0D;
        waTextView.setText(AnonymousClass3UG.A03(waTextView.getContext(), waTextView.getPaint(), getEmojiLoader(), C36441kJ.A0P(r6.A05)));
        if (r6.A06) {
            waTextView.setPaintFlags(waTextView.getPaintFlags() | 16);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public final C24801Dv getActivityUtils() {
        C24801Dv r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("activityUtils");
    }

    public final AnonymousClass16D getContactManager() {
        AnonymousClass16D r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0Z();
    }

    public final AnonymousClass1H2 getEmojiLoader() {
        AnonymousClass1H2 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emojiLoader");
    }

    public final C005502l getIoDispatcher() {
        C005502l r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("ioDispatcher");
    }

    public final C32681e1 getLinkifier() {
        C32681e1 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0b();
    }

    public final C005502l getMainDispatcher() {
        C005502l r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mainDispatcher");
    }

    public final C19890wg getSharedPreferencesFactory() {
        C19890wg r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("sharedPreferencesFactory");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final AnonymousClass190 getWaIntents() {
        AnonymousClass190 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0X();
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public final void A00(AnonymousClass2bT r1, AnonymousClass1RY r2, C51282nZ r3) {
        setUpName(r1);
        setUpDescription(r1);
        setUpCanceledEvent(r1);
        setUpGroupInfoSection(r1, r2, r3);
    }
}
