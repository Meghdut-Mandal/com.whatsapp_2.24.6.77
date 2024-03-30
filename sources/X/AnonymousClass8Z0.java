package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.ArrayList;

/* renamed from: X.8Z0  reason: invalid class name */
public final class AnonymousClass8Z0 extends AnonymousClass2IR {
    public C19460v5 A00;
    public AnonymousClass16I A01;
    public C27731Pn A02;
    public AnonymousClass1GQ A03;
    public C32241dD A04;
    public AnonymousClass005 A05;
    public boolean A06;
    public C188088z1 A07 = C188088z1.EMPTY;
    public C187828yb A08 = C187828yb.UPDATED;
    public boolean A09;
    public boolean A0A;
    public final LinearLayout A0B = ((LinearLayout) C36361kB.A0G(this, R.id.newsletter_context_card));
    public final TextView A0C = C36341k9.A0M(this, R.id.newsletter_admin_context_card_body);
    public final TextView A0D = C36341k9.A0M(this, R.id.newsletter_admin_context_card_title);
    public final AnonymousClass2bI A0E;
    public final WDSButton A0F = ((WDSButton) C36361kB.A0G(this, R.id.add_newsletter_description));
    public final WDSButton A0G = ((WDSButton) C36361kB.A0G(this, R.id.add_verified_badge));
    public final WDSButton A0H = ((WDSButton) C36361kB.A0G(this, R.id.share_newsletter_link));
    public final WDSButton A0I = ((WDSButton) C36361kB.A0G(this, R.id.share_to_my_status));
    public final WDSProfilePhoto A0J = ((WDSProfilePhoto) C36361kB.A0G(this, R.id.newsletter_icon));
    public final Drawable A0K;
    public final C226815j A0L = new AnonymousClass8YT(this);
    public final AnonymousClass00T A0M = C36431kI.A1I(new C22156Ahf(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Z0(Context context, C89004Uw r5, AnonymousClass2bI r6) {
        super(context, r5, r6);
        AnonymousClass00C.A0D(context, 1);
        A16();
        this.A0E = r6;
        Drawable A002 = AnonymousClass00E.A00(context, R.drawable.balloon_centered_no_padding_normal);
        C18740tg.A06(A002);
        AnonymousClass00C.A08(A002);
        this.A0K = A002;
        setClickable(false);
        this.A2I = true;
        this.A2M = false;
        setOnClickListener((View.OnClickListener) null);
        A0C();
    }

    public static final void setupShareToMyStatusButton$lambda$10(AnonymousClass8Z0 r9, C44072La r10, View view) {
        int i;
        boolean A1a = C36341k9.A1a(r9, r10);
        r9.getNewsletterLogging().A08(r10.A0J(), (C52512pY) null, 2, A1a ? 1 : 0);
        if (r9.A0G.A0E(6445)) {
            r9.A21.Boy(new C80283v9(r10, r9, A1a));
            return;
        }
        String str = r10.A0I;
        if (str != null) {
            i = R.string.f12nameremoved;
        } else {
            str = r10.A0J;
            if (str != null) {
                i = R.string.f12nameremoved;
            } else {
                return;
            }
        }
        AnonymousClass155 baseActivity = r9.getBaseActivity();
        Object[] objArr = new Object[2];
        objArr[0] = r10.A0K;
        C05290Pd.A00(r9.getBaseActivity(), AnonymousClass190.A0V(r9.getBaseActivity(), (AnonymousClass3XT) null, C36431kI.A13(), C36351kA.A0x(baseActivity, str, objArr, A1a, i)), (Bundle) null);
    }

    public static final void setupShareToMyStatusButton$lambda$10$lambda$9(C44072La r11, AnonymousClass8Z0 r12) {
        C36331k8.A1I(r11, r12);
        C28981Uw A0J2 = r11.A0J();
        ArrayList A0I2 = AnonymousClass001.A0I();
        C132366Tg r3 = new C132366Tg();
        AnonymousClass141 A012 = r12.A1C.A01(A0J2);
        String A0H2 = r12.A0n.A0H(A012);
        if (A0H2 == null) {
            A0H2 = "";
        }
        AnonymousClass6QO A032 = ((C74183lC) r12.getNewsletterStatusMediaGenerator().get()).A03(C36371kC.A0B(r12), A012, new C63393Jw(A0J2, C52332pG.LINK_CARD, A0H2, A0H2, 0));
        if (!(A032 == null || A032.A08() == null)) {
            A0I2.add(A032.A0J);
            r3.A06(A032);
        }
        r12.A0R.A0H(new C80403vL(r12, A0I2, r3, 6));
    }

    public static final void setupShareToMyStatusButton$lambda$10$lambda$9$lambda$8(AnonymousClass8Z0 r3, ArrayList arrayList, C132366Tg r5) {
        AnonymousClass00C.A0D(r3, 0);
        C36321k7.A0v(arrayList, 1, r5);
        AnonymousClass3FR r1 = new AnonymousClass3FR(r3.getContext());
        r1.A02 = 3;
        r1.A0H = arrayList;
        Bundle A072 = AnonymousClass001.A07();
        C132366Tg.A02(A072, r5);
        r1.A09 = A072;
        r1.A0D = C177528dw.A00.getRawString();
        r1.A0N = true;
        r1.A0J = true;
        r1.A04 = 25;
        C05290Pd.A00(r3.getBaseActivity(), r1.A01(), (Bundle) null);
    }

    public Drawable A1A(int i, int i2, boolean z) {
        if (i == 1) {
            return this.A0K;
        }
        return super.A1A(i, i2, z);
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public final void setContactObservers(AnonymousClass16I r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setContactPhotos(C27731Pn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setNewsletterConfig(AnonymousClass1GQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setNewsletterLogging(C32241dD r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setNewsletterStatusMediaGenerator(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setSubscriptionManager(C19460v5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public static final void A0D(AnonymousClass8Z0 r4) {
        int i;
        int ordinal = r4.A07.ordinal();
        if (ordinal == 0) {
            i = R.string.f12nameremoved;
        } else if (ordinal == 1) {
            i = R.string.f12nameremoved;
        } else if (ordinal == 2) {
            i = R.string.f12nameremoved;
        } else if (ordinal == 3) {
            i = R.string.f12nameremoved;
        } else {
            throw C36441kJ.A18();
        }
        TextView textView = r4.A0C;
        StringBuilder A0u = AnonymousClass000.A0u();
        C165587tf.A1O(A0u, C36381kD.A0t(r4, i));
        textView.setText(AnonymousClass000.A0q(r4.getContext().getString(R.string.f12nameremoved), A0u));
    }

    private final C44072La getNewsletterInfo() {
        C65073Qp A0W = C36371kC.A0W(this.A0F, this.A0E.A1J.A00);
        if (A0W instanceof C44072La) {
            return (C44072La) A0W;
        }
        return null;
    }

    private final AnonymousClass3CG getTransitionNames() {
        return (AnonymousClass3CG) this.A0M.getValue();
    }

    public static /* synthetic */ void setupNewsletterIcon$default(AnonymousClass8Z0 r1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        r1.setupNewsletterIcon(z);
    }

    public void A16() {
        if (!this.A09) {
            this.A09 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
            this.A01 = C165587tf.A0M(r4);
            this.A04 = (C32241dD) r4.A5g.get();
            this.A02 = C165577te.A0Q(r4);
            this.A00 = A0k;
            this.A03 = (AnonymousClass1GQ) r4.A5a.get();
            this.A05 = C18840tu.A00(r2.AAG);
        }
    }

    public final AnonymousClass16I getContactObservers() {
        AnonymousClass16I r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactObservers");
    }

    public final C27731Pn getContactPhotos() {
        C27731Pn r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public final AnonymousClass1GQ getNewsletterConfig() {
        AnonymousClass1GQ r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterConfig");
    }

    public final C32241dD getNewsletterLogging() {
        C32241dD r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterLogging");
    }

    public final AnonymousClass005 getNewsletterStatusMediaGenerator() {
        AnonymousClass005 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterStatusMediaGenerator");
    }

    public final C19460v5 getSubscriptionManager() {
        C19460v5 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("subscriptionManager");
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0C() {
        /*
            r9 = this;
            X.2La r0 = r9.getNewsletterInfo()
            if (r0 == 0) goto L_0x019a
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x019a
            A0E(r9)
            r5 = 0
            r9.setupNewsletterIcon(r5)
            X.2La r0 = r9.getNewsletterInfo()
            if (r0 == 0) goto L_0x002d
            android.widget.TextView r4 = r9.A0D
            android.content.Context r3 = r9.getContext()
            r2 = 2131891321(0x7f121479, float:1.9417359E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            java.lang.String r0 = r0.A0K
            r1[r5] = r0
            X.C36341k9.A0s(r3, r4, r1, r2)
        L_0x002d:
            A0D(r9)
            X.2La r4 = r9.getNewsletterInfo()
            if (r4 == 0) goto L_0x0062
            android.content.Context r0 = r9.getContext()
            X.1Uw r2 = r4.A0J()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.NewsletterEditDescriptionActivity"
            X.C36331k8.A0u(r3, r2, r1, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r9.A0F
            java.lang.String r0 = r4.A0H
            r1 = 0
            if (r0 == 0) goto L_0x005a
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005a
            r1 = 8
        L_0x005a:
            r2.setVisibility(r1)
            r0 = 21
            X.AnonymousClass3YF.A00(r2, r9, r3, r0)
        L_0x0062:
            X.2La r0 = r9.getNewsletterInfo()
            if (r0 == 0) goto L_0x007f
            X.155 r2 = r9.getBaseActivity()
            X.1Uw r1 = r0.A0J()
            X.2pY r0 = X.C52512pY.CONTEXT_CARD
            int r0 = r0.value
            android.content.Intent r2 = X.AnonymousClass190.A0r(r2, r1, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A0H
            r0 = 20
            X.AnonymousClass3YF.A00(r1, r9, r2, r0)
        L_0x007f:
            X.2La r2 = r9.getNewsletterInfo()
            if (r2 == 0) goto L_0x008c
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A0I
            r0 = 23
            X.AnonymousClass3YF.A00(r1, r9, r2, r0)
        L_0x008c:
            X.2La r7 = r9.getNewsletterInfo()
            if (r7 == 0) goto L_0x0132
            X.0yC r1 = r9.A0G
            r0 = 6618(0x19da, float:9.274E-42)
            boolean r0 = r1.A0E(r0)
            r8 = 8
            if (r0 == 0) goto L_0x0194
            X.005 r0 = r9.A2B
            java.lang.Object r0 = r0.get()
            X.AnonymousClass00C.A08(r0)
            X.1GQ r0 = (X.AnonymousClass1GQ) r0
            boolean r0 = r7.A0R(r0)
            if (r0 != 0) goto L_0x0194
            X.005 r0 = r9.A2B
            java.lang.Object r0 = r0.get()
            X.AnonymousClass00C.A08(r0)
            X.1GQ r0 = (X.AnonymousClass1GQ) r0
            boolean r0 = r7.A0Q(r0)
            if (r0 != 0) goto L_0x0194
            boolean r0 = r7.A0o
            if (r0 != 0) goto L_0x0194
            boolean r0 = r7.A0O()
            if (r0 == 0) goto L_0x0194
            boolean r0 = r7.A0P()
            if (r0 != 0) goto L_0x0194
            X.12q r0 = r9.A0F
            java.util.Collection r0 = r0.A0F()
            if (r0 == 0) goto L_0x0120
            java.util.ArrayList r3 = X.C36321k7.A0J(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00e0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C44072La
            if (r0 != 0) goto L_0x00ef
            r1 = 0
        L_0x00ef:
            r3.add(r1)
            goto L_0x00e0
        L_0x00f3:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r3.iterator()
        L_0x00fb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.2La r2 = (X.C44072La) r2
            if (r2 == 0) goto L_0x00fb
            boolean r0 = r2.A0O()
            if (r0 == 0) goto L_0x00fb
            X.2p1 r1 = r2.A0F
            X.2p1 r0 = X.C52182p1.VERIFIED
            if (r1 != r0) goto L_0x00fb
            X.2pA r1 = r2.A0C
            X.2pA r0 = X.C52272pA.META_VERIFIED_SUBSCRIPTION
            if (r1 != r0) goto L_0x00fb
            r6.add(r3)
            goto L_0x00fb
        L_0x0120:
            X.09w r6 = X.C023409w.A00
        L_0x0122:
            boolean r0 = X.C36401kF.A1a(r6)
            if (r0 != 0) goto L_0x0194
            X.0wU r1 = r9.A21
            X.3v9 r0 = new X.3v9
            r0.<init>(r9, r7, r5)
            r1.Boy(r0)
        L_0x0132:
            boolean r0 = X.AnonymousClass3U9.A00
            if (r0 == 0) goto L_0x0193
            X.155 r6 = r9.getBaseActivity()
            android.view.Window r4 = r6.getWindow()
            X.AnonymousClass00C.A08(r4)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "circular_transition"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            r3 = 1
            if (r0 == 0) goto L_0x0172
            r0 = 12
            r4.requestFeature(r0)
            X.4d1 r2 = new X.4d1
            r2.<init>(r3, r5)
            X.3CG r1 = new X.3CG
            r1.<init>(r6)
            r0 = 2131897115(0x7f122b1b, float:1.942911E38)
            java.lang.String r0 = r1.A02(r0)
            r2.addTarget(r0)
            r4.setSharedElementEnterTransition(r2)
            X.8UR r0 = new X.8UR
            r0.<init>(r9)
            r2.addListener(r0)
        L_0x0172:
            android.transition.Fade r1 = new android.transition.Fade
            r1.<init>()
            r0 = 16908335(0x102002f, float:2.387736E-38)
            r1.excludeTarget(r0, r3)
            r0 = 16908336(0x1020030, float:2.3877364E-38)
            r1.excludeTarget(r0, r3)
            r4.setReturnTransition(r1)
            r4.setEnterTransition(r1)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.addFlags(r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r4.clearFlags(r0)
        L_0x0193:
            return
        L_0x0194:
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A0G
            r0.setVisibility(r8)
            goto L_0x0132
        L_0x019a:
            android.widget.TextView r0 = r9.A0D
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.A0C
            r0.setVisibility(r1)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r9.A0J
            r0.setVisibility(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A0F
            r0.setVisibility(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A0H
            r0.setVisibility(r1)
            android.widget.LinearLayout r2 = r9.A0B
            r2.setVisibility(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A0I
            r0.setVisibility(r1)
            r1 = 0
            r2.setPadding(r1, r1, r1, r1)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r1)
            r9.setLayoutParams(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Z0.A0C():void");
    }

    public static final void A0E(AnonymousClass8Z0 r2) {
        C188088z1 r0;
        C44072La newsletterInfo = r2.getNewsletterInfo();
        if (newsletterInfo != null) {
            String str = newsletterInfo.A0H;
            if (str == null || str.length() != 0) {
                if (newsletterInfo.A0M == null) {
                    r0 = C188088z1.NEEDS_ICON;
                } else {
                    r0 = C188088z1.PROFILE_COMPLETE;
                }
            } else if (newsletterInfo.A0M == null) {
                r0 = C188088z1.EMPTY;
            } else {
                r0 = C188088z1.NEEDS_DESCRIPTION;
            }
            r2.A07 = r0;
        }
    }

    /* access modifiers changed from: private */
    public final AnonymousClass155 getBaseActivity() {
        Activity A012 = C24801Dv.A01(getContext(), AnonymousClass01L.class);
        AnonymousClass00C.A0E(A012, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        return (AnonymousClass155) A012;
    }

    private final int getLayoutRes() {
        return R.layout.f9nameremoved;
    }

    public static final void setupAddNewsletterDescriptionButton$lambda$5(AnonymousClass8Z0 r3, Intent intent, View view) {
        C36321k7.A0w(r3, intent);
        AnonymousClass0XN.A02(r3.getBaseActivity(), intent, (Bundle) null, 1052);
        r3.A08 = C187828yb.NEEDS_UPDATE;
    }

    public static final void setupAddVerifiedBadgeButton$lambda$4(AnonymousClass8Z0 r1, C44072La r2) {
        C36321k7.A0w(r1, r2);
        if (r1.getSubscriptionManager().A05()) {
            r1.getSubscriptionManager().A02();
            throw AnonymousClass001.A0A("isMetaVerifiedSubscriptionActive");
        } else {
            r1.A0G.setVisibility(8);
        }
    }

    public static final void setupAddVerifiedBadgeButton$lambda$4$lambda$3(AnonymousClass8Z0 r5, C44072La r6, View view) {
        C36321k7.A0w(r5, r6);
        Context context = r5.getContext();
        C28981Uw A0J2 = r6.A0J();
        Intent A0D2 = C36431kI.A0D();
        C36331k8.A0u(A0D2, A0J2, context.getPackageName(), "com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity");
        C05290Pd.A00(r5.getBaseActivity(), A0D2, (Bundle) null);
    }

    private final void setupNewsletterIcon(boolean z) {
        C44072La newsletterInfo = getNewsletterInfo();
        if (newsletterInfo != null) {
            AnonymousClass1RY A052 = getContactPhotos().A05(getContext(), "newsletter-admin-context-card");
            AnonymousClass141 A012 = this.A1C.A01(newsletterInfo.A06());
            int i = R.dimen.f7nameremoved;
            if (z) {
                i = R.dimen.f7nameremoved;
            }
            int A032 = C36371kC.A03(this, i);
            WDSProfilePhoto wDSProfilePhoto = this.A0J;
            A052.A09(wDSProfilePhoto, A012, A032);
            if (!this.A0A) {
                this.A0A = true;
                getContactObservers().registerObserver(this.A0L);
            }
            C33521fV.A02(wDSProfilePhoto);
            C33521fV.A03(wDSProfilePhoto, R.string.f12nameremoved);
            C36331k8.A0q(getContext(), wDSProfilePhoto, R.string.f12nameremoved);
            if (newsletterInfo.A0M != null) {
                wDSProfilePhoto.setProfileBadge((AnonymousClass6K4) null);
                wDSProfilePhoto.setOnClickListener((View.OnClickListener) null);
                wDSProfilePhoto.setClickable(false);
                return;
            }
            if (wDSProfilePhoto.A03 == null) {
                wDSProfilePhoto.setProfileBadge(new AnonymousClass5QF());
            }
            wDSProfilePhoto.setClickable(true);
            AnonymousClass3YF.A00(wDSProfilePhoto, this, newsletterInfo, 22);
        }
    }

    public static final void setupNewsletterIcon$lambda$0(AnonymousClass8Z0 r10, C44072La r11, View view) {
        int i;
        C36321k7.A0w(r10, r11);
        AnonymousClass155 baseActivity = r10.getBaseActivity();
        if (!r10.A06) {
            int statusBarColor = baseActivity.getWindow().getStatusBarColor();
            if (C19550w8.A04()) {
                i = baseActivity.getWindow().getNavigationBarColor();
            } else {
                i = 0;
            }
            C28981Uw A0J2 = r11.A0J();
            AnonymousClass155 baseActivity2 = r10.getBaseActivity();
            Intent A0D2 = C36431kI.A0D();
            C36331k8.A0u(A0D2, A0J2, baseActivity2.getPackageName(), "com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto");
            A0D2.putExtra("circular_transition", true);
            A0D2.putExtra("start_transition_alpha", 0.0f);
            A0D2.putExtra("start_transition_status_bar_color", statusBarColor);
            A0D2.putExtra("return_transition_status_bar_color", 0);
            A0D2.putExtra("start_transition_navigation_bar_color", i);
            A0D2.putExtra("return_transition_navigation_bar_color", 0);
            A0D2.putExtra("open_pic_selection_sheet", true);
            View A0G2 = C36361kB.A0G(r10, R.id.transition_start);
            String A022 = r10.getTransitionNames().A02(R.string.f12nameremoved);
            AnonymousClass00C.A08(A022);
            AnonymousClass0XN.A02(baseActivity, A0D2, AnonymousClass3U9.A05(baseActivity, A0G2, A022), 1053);
        }
    }

    public static final void setupShareNewsletterLinkButton$lambda$6(AnonymousClass8Z0 r1, Intent intent, View view) {
        C36321k7.A0w(r1, intent);
        C05290Pd.A00(r1.getBaseActivity(), intent, (Bundle) null);
    }

    public void A22(AnonymousClass3T1 r3, boolean z) {
        super.A22(getFMessage(), z);
        if (z || this.A08 == C187828yb.NEEDS_UPDATE) {
            A0C();
            this.A08 = C187828yb.UPDATED;
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A0A) {
            getContactObservers().unregisterObserver(this.A0L);
        }
    }
}
