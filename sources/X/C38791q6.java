package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;

/* renamed from: X.1q6  reason: invalid class name and case insensitive filesystem */
public final class C38791q6 extends LinearLayout implements C18700tb {
    public AnonymousClass17Y A00;
    public C32691e2 A01;
    public C21060yb A02;
    public C19970wo A03;
    public C18820ts A04;
    public AnonymousClass1DW A05;
    public C29541Xa A06;
    public C29581Xe A07;
    public AnonymousClass2XH A08;
    public AnonymousClass1QZ A09;
    public boolean A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final AnonymousClass1RJ A0D;
    public final AnonymousClass1RJ A0E;

    public C38791q6(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0A) {
            this.A0A = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A03 = C36351kA.A0V(A0W);
            this.A00 = C36351kA.A0M(A0W);
            this.A07 = (C29581Xe) A0W.A36.get();
            this.A01 = C36371kC.A0R(A0W);
            this.A08 = C36411kG.A0m(A0W);
            this.A05 = C36431kI.A0b(A0W);
            this.A04 = C36341k9.A0T(A0W);
            this.A02 = C36351kA.A0U(A0W);
            this.A06 = C36421kH.A0M(A0W);
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A0C = C36341k9.A0Q(this, R.id.event_info_date);
        this.A0B = C36341k9.A0Q(this, R.id.event_add_to_calendar);
        this.A0E = C36341k9.A0X(this, R.id.event_info_location_container);
        this.A0D = C36341k9.A0X(this, R.id.event_info_call_container);
    }

    public static final void setUpCallLink$lambda$3$lambda$1(C38791q6 r2, String str, View view) {
        AnonymousClass00C.A0D(r2, 0);
        C36331k8.A0t(C36371kC.A0B(r2), r2.getLinkLauncher(), str);
    }

    public final void setDeepLinkHelper(AnonymousClass1DW r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setEventMessageManager(C29541Xa r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setEventUtils(C29581Xe r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setLinkLauncher(C32691e2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setLocationUtils(AnonymousClass2XH r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r8.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setUpCallLink(X.AnonymousClass2bT r18) {
        /*
            r17 = this;
            r12 = r18
            java.lang.String r8 = r12.A04
            r13 = 1
            r7 = 0
            if (r8 == 0) goto L_0x000f
            int r1 = r8.length()
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r2 = 8
            r6 = r17
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r12.A06
            if (r0 != 0) goto L_0x00cc
            X.1RJ r5 = r6.A0D
            android.view.View r1 = r5.A01()
            r0 = 2131430082(0x7f0b0ac2, float:1.8481855E38)
            android.widget.TextView r11 = X.C36341k9.A0M(r1, r0)
            android.view.View r1 = r5.A01()
            r0 = 2131430081(0x7f0b0ac1, float:1.8481853E38)
            android.widget.ImageView r10 = X.C36341k9.A0L(r1, r0)
            android.view.View r1 = r5.A01()
            r0 = 2131430080(0x7f0b0ac0, float:1.848185E38)
            android.view.View r9 = X.C36361kB.A0G(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r9 = (com.whatsapp.wds.components.button.WDSButton) r9
            android.view.View r1 = r5.A01()
            r0 = 2131430052(0x7f0b0aa4, float:1.8481794E38)
            android.view.View r4 = X.C36361kB.A0G(r1, r0)
            X.1DW r1 = r6.getDeepLinkHelper()
            java.lang.String r0 = r12.A04
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x00ad
            X.1Xe r0 = r6.getEventUtils()
            boolean r0 = r0.A01(r12)
            if (r0 == 0) goto L_0x0061
            r2 = 0
        L_0x0061:
            r9.setVisibility(r2)
            X.1Xe r0 = r6.getEventUtils()
            X.0wo r1 = r0.A01
            long r15 = X.C19970wo.A00(r1)
            long r2 = r12.A0I
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.DAYS
            X.0yC r1 = r0.A02
            r0 = 6265(0x1879, float:8.779E-42)
            long r0 = X.C36441kJ.A0B(r1, r0)
            long r0 = r14.toMillis(r0)
            long r2 = r2 + r0
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00c1
            r9.setEnabled(r7)
            r1 = 0
        L_0x0087:
            r9.setOnClickListener(r1)
            X.1DW r1 = r6.getDeepLinkHelper()
            java.lang.String r0 = r12.A04
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x00b1
            r0 = 2131896205(0x7f12278d, float:1.9427265E38)
            r11.setText(r0)
            r0 = 2131233878(0x7f080c56, float:1.8083906E38)
            r10.setImageResource(r0)
            r0 = 2131231867(0x7f08047b, float:1.8079827E38)
        L_0x00a5:
            r9.setIcon((int) r0)
            r0 = 12
            X.C36421kH.A14(r4, r6, r8, r0)
        L_0x00ad:
            r5.A03(r7)
            return
        L_0x00b1:
            r0 = 2131896206(0x7f12278e, float:1.9427267E38)
            r11.setText(r0)
            r0 = 2131233880(0x7f080c58, float:1.808391E38)
            r10.setImageResource(r0)
            r0 = 2131231779(0x7f080423, float:1.8079649E38)
            goto L_0x00a5
        L_0x00c1:
            r9.setEnabled(r13)
            r0 = 11
            X.9v1 r1 = new X.9v1
            r1.<init>(r0, r8, r6)
            goto L_0x0087
        L_0x00cc:
            X.1RJ r0 = r6.A0D
            r0.A03(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38791q6.setUpCallLink(X.2bT):void");
    }

    public static final void setUpCallLink$lambda$3$lambda$2(C38791q6 r5, String str, View view) {
        AnonymousClass00C.A0D(r5, 0);
        try {
            ClipboardManager A092 = r5.getSystemServices().A09();
            if (A092 != null) {
                A092.setPrimaryClip(ClipData.newRawUri((CharSequence) null, Uri.parse(str)));
            }
            r5.getGlobalUI().A06(R.string.f12nameremoved, 0);
        } catch (NullPointerException | SecurityException e) {
            Log.e("EventAdditionalInfoView/copyCallLink", e);
            r5.getGlobalUI().A06(R.string.f12nameremoved, 0);
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

    public final AnonymousClass1DW getDeepLinkHelper() {
        AnonymousClass1DW r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("deepLinkHelper");
    }

    public final C29541Xa getEventMessageManager() {
        C29541Xa r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("eventMessageManager");
    }

    public final C29581Xe getEventUtils() {
        C29581Xe r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("eventUtils");
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final C32691e2 getLinkLauncher() {
        C32691e2 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("linkLauncher");
    }

    public final AnonymousClass2XH getLocationUtils() {
        AnonymousClass2XH r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("locationUtils");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    private final void setUpDate(AnonymousClass2bT r8) {
        String A022 = AnonymousClass3UY.A02(getTime(), getWhatsAppLocale(), r8.A00);
        AnonymousClass00C.A08(A022);
        String A002 = AnonymousClass3UM.A00(getWhatsAppLocale(), r8.A00);
        WaTextView waTextView = this.A0C;
        C18820ts whatsAppLocale = getWhatsAppLocale();
        Context context = getContext();
        Object[] A0M = AnonymousClass001.A0M();
        C36331k8.A1N(A022, A002, A0M);
        String string = context.getString(R.string.f12nameremoved, A0M);
        AnonymousClass00C.A08(string);
        waTextView.setText(AnonymousClass3UM.A01(whatsAppLocale, string, r8.A00));
        boolean z = r8.A06;
        WaTextView waTextView2 = this.A0B;
        if (z) {
            waTextView2.setVisibility(8);
        } else {
            C48902iF.A00(waTextView2, r8, this, 5);
        }
    }

    private final void setUpLocation(AnonymousClass2bT r7) {
        AnonymousClass3IM r1;
        String A022 = getEventMessageManager().A02(r7);
        if (A022 != null) {
            AnonymousClass1RJ r4 = this.A0E;
            TextView A0M = C36341k9.A0M(r4.A01(), R.id.event_info_location);
            View A0G = C36361kB.A0G(r4.A01(), R.id.event_view_on_maps);
            A0M.setText(A022);
            r4.A03(0);
            AnonymousClass3J7 r0 = r7.A01;
            if (r0 == null || (r1 = r0.A00) == null) {
                A0G.setVisibility(8);
            } else {
                C48932iI.A00(A0G, r7, r1, this, 20);
            }
        }
    }

    public final void A00(AnonymousClass2bT r1) {
        setUpDate(r1);
        setUpLocation(r1);
        setUpCallLink(r1);
    }
}
