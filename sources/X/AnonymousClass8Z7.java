package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationRowCatalogPreview;
import com.whatsapp.conversation.conversationrow.ConversationRowContactInfoBiz$setupCatalogPreview$1;
import com.whatsapp.conversation.conversationrow.ConversationRowContactInfoBiz$setupCatalogPreview$2;
import com.whatsapp.conversation.conversationrow.ConversationRowContactInfoBiz$setupCatalogPreview$3;
import com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: X.8Z7  reason: invalid class name */
public final class AnonymousClass8Z7 extends AnonymousClass2I1 {
    public AnonymousClass2ZL A00;
    public C202279lS A01;
    public C195809Wc A02;
    public C157317cl A03;
    public AnonymousClass1KV A04;
    public C589031m A05;
    public C196169Xz A06;
    public AnonymousClass9R0 A07;
    public boolean A08;
    public final View A09 = C36361kB.A0F(this, R.id.linked_account_separator);
    public final AnonymousClass155 A0A;
    public final ConversationRowCatalogPreview A0B;
    public final ConversationRowContactInfoLinkedAccount A0C = ((ConversationRowContactInfoLinkedAccount) C36361kB.A0F(this, R.id.linked_account_fb));
    public final ConversationRowContactInfoLinkedAccount A0D = ((ConversationRowContactInfoLinkedAccount) C36361kB.A0F(this, R.id.linked_account_ig));
    public final C194539Qd A0E;
    public final C18820ts A0F;
    public final WDSButton A0G;
    public final AnonymousClass2aJ A0H;
    public final AnonymousClass2bI A0I;

    public static final void A0F(AnonymousClass8Z7 r1, UserJid userJid, Boolean bool) {
        AnonymousClass00C.A0D(bool, 2);
        if (bool.booleanValue()) {
            r1.setupCatalogPreview(userJid);
        }
    }

    public final void setCatalogHomepageQplLogger(AnonymousClass9R0 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setCatalogManager(C202279lS r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setCatalogObservers(AnonymousClass2ZL r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setFlowsEntrypointMetadataCache(AnonymousClass1KV r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setFlowsPreloaderWrapper(C157317cl r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setImageLoader(C196169Xz r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setStartFlowPrototypeUtil(C589031m r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public static final C195809Wc A0B(AnonymousClass8Z7 r5) {
        AnonymousClass3II r0;
        UserJid A0l = C36351kA.A0l(r5.A03);
        if (A0l == null || (r0 = (AnonymousClass3II) r5.A0H.A01(A0l)) == null) {
            return null;
        }
        JSONObject jSONObject = r0.A01;
        return new C195809Wc(Long.valueOf(jSONObject.optLong("biz_creation_date")), jSONObject.optString("fb_follower_count"), jSONObject.optString("ig_follower_count"), jSONObject.optBoolean("show_catalog", false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(X.C134766bZ r9, X.AnonymousClass8Z7 r10, com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount r11, java.lang.String r12) {
        /*
            if (r12 == 0) goto L_0x009e
            int r0 = r12.length()
            if (r0 == 0) goto L_0x009e
            if (r9 == 0) goto L_0x0012
            int r0 = r9.A00
            if (r0 <= 0) goto L_0x0012
            java.lang.String r12 = java.lang.String.valueOf(r0)
        L_0x0012:
            X.0ts r1 = r10.A0F
            r7 = 1
            X.AnonymousClass00C.A0D(r1, r7)
            r6 = 0
            if (r12 == 0) goto L_0x0099
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0099
            r11.setVisibility(r6)
            long r3 = java.lang.Long.parseLong(r12)
            r5 = 2131755028(0x7f100014, float:1.9140924E38)
            java.lang.String r10 = X.AnonymousClass6HA.A01(r1, r3)
            X.AnonymousClass00C.A08(r10)
            java.lang.String r2 = X.AnonymousClass6HA.A00(r3)
            java.lang.String r9 = "info"
            if (r2 != 0) goto L_0x0043
            com.whatsapp.WaTextView r8 = r11.A00
            if (r8 != 0) goto L_0x0088
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r9)
            throw r0
        L_0x0043:
            int r1 = r2.hashCode()
            r0 = 66
            if (r1 == r0) goto L_0x007e
            r0 = 75
            if (r1 == r0) goto L_0x0074
            r0 = 77
            if (r1 != r0) goto L_0x005e
            java.lang.String r0 = "M"
            boolean r0 = r2.equals(r0)
            r2 = 2131888235(0x7f12086b, float:1.94111E38)
        L_0x005c:
            if (r0 != 0) goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r10)
            java.lang.String r0 = X.C36381kD.A0t(r11, r2)
            java.lang.String r10 = X.AnonymousClass000.A0q(r0, r1)
            com.whatsapp.WaTextView r8 = r11.A00
            if (r8 != 0) goto L_0x0088
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r9)
            throw r0
        L_0x0074:
            java.lang.String r0 = "K"
            boolean r0 = r2.equals(r0)
            r2 = 2131888234(0x7f12086a, float:1.9411098E38)
            goto L_0x005c
        L_0x007e:
            java.lang.String r0 = "B"
            boolean r0 = r2.equals(r0)
            r2 = 2131888233(0x7f120869, float:1.9411096E38)
            goto L_0x005c
        L_0x0088:
            android.content.res.Resources r2 = X.C36341k9.A0F(r11)
            int r1 = (int) r3
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r10
            java.lang.String r0 = r2.getQuantityString(r5, r1, r0)
            r8.setText(r0)
            return
        L_0x0099:
            r0 = 8
            r11.setVisibility(r0)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Z7.A0C(X.6bZ, X.8Z7, com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount, java.lang.String):void");
    }

    private final void setupCatalogPreview(UserJid userJid) {
        ConversationRowCatalogPreview conversationRowCatalogPreview = this.A0B;
        conversationRowCatalogPreview.setVisibility(0);
        this.A0E.A00(this.A02, userJid, 6);
        AnonymousClass155 r7 = this.A0A;
        C29461Ws r10 = this.A0d;
        AnonymousClass00C.A07(r10);
        C202279lS catalogManager = getCatalogManager();
        C39791tm r6 = (C39791tm) C165617ti.A0A(new C68153bQ(getCatalogObservers(), r10, catalogManager, userJid, getImageLoader()), r7).A00(C39791tm.class);
        LifecycleCoroutineScopeImpl A002 = C33311f5.A00(r7);
        ConversationRowContactInfoBiz$setupCatalogPreview$1 conversationRowContactInfoBiz$setupCatalogPreview$1 = new ConversationRowContactInfoBiz$setupCatalogPreview$1(this, r6, (C023509x) null);
        C008903u r3 = C008903u.A00;
        Integer num = C023109s.A00;
        AnonymousClass0A2.A02(num, r3, conversationRowContactInfoBiz$setupCatalogPreview$1, A002);
        AnonymousClass0A2.A02(num, r3, new ConversationRowContactInfoBiz$setupCatalogPreview$2(this, r6, (C023509x) null), C33311f5.A00(r7));
        AnonymousClass0A2.A02(num, r3, new ConversationRowContactInfoBiz$setupCatalogPreview$3(this, r6, (C023509x) null), C33311f5.A00(r7));
        conversationRowCatalogPreview.A00 = r6;
        r6.A01.A08(r6.A02, C36441kJ.A05(getResources(), R.dimen.f7nameremoved));
    }

    public void A16() {
        if (!this.A08) {
            this.A08 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r2 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r2, A0n, this);
            C18830tt r1 = r2.A00;
            C175108Zr.A0y(r2, r1, r1, this);
            C175108Zr.A11(r2, this);
            C175108Zr.A14(r2, this, C165597tg.A0h(r2));
            C175108Zr.A12(r2, this);
            C175108Zr.A10(r2, r1, this, C175108Zr.A0q(r2));
            C175108Zr.A13(r2, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r2, r1, this, C165577te.A0U(r2));
            C175108Zr.A0v(A0k, r2, r1, this, C175108Zr.A0o(r2, this));
            C175108Zr.A0w(A0m, r2, r1, this);
            C175108Zr.A0z(r2, r1, A0n, this, C175108Zr.A0p(r1));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r2, r1, A0n, this);
            AnonymousClass8YV.A0H(A0k, r2, this);
            AnonymousClass8YV.A0G(A0k, A0m, r2, A0n, this);
            AnonymousClass8YV.A0I(r2, r1, A0n, this);
            AnonymousClass3R1.A01(C165587tf.A0M(r2), this);
            AnonymousClass3R1.A00(C165587tf.A0L(r2), this);
            AnonymousClass3R1.A02(C165577te.A0Q(r2), this);
            this.A05 = C27111My.A26(A0m);
            this.A04 = (AnonymousClass1KV) r2.ANw.get();
            this.A01 = C165607th.A0Q(r2);
            this.A00 = (AnonymousClass2ZL) r2.ADO.get();
            this.A06 = (C196169Xz) r1.A9S.get();
            this.A07 = (AnonymousClass9R0) r2.A1U.get();
            this.A03 = r1.A3z();
        }
    }

    public final AnonymousClass9R0 getCatalogHomepageQplLogger() {
        AnonymousClass9R0 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("catalogHomepageQplLogger");
    }

    public final C202279lS getCatalogManager() {
        C202279lS r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("catalogManager");
    }

    public final AnonymousClass2ZL getCatalogObservers() {
        AnonymousClass2ZL r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("catalogObservers");
    }

    public final AnonymousClass1KV getFlowsEntrypointMetadataCache() {
        AnonymousClass1KV r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("flowsEntrypointMetadataCache");
    }

    public final C157317cl getFlowsPreloaderWrapper() {
        C157317cl r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("flowsPreloaderWrapper");
    }

    public final C196169Xz getImageLoader() {
        C196169Xz r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("imageLoader");
    }

    public final C589031m getStartFlowPrototypeUtil() {
        C589031m r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("startFlowPrototypeUtil");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Z7(Context context, C89004Uw r4, C194539Qd r5, C18820ts r6, AnonymousClass2aJ r7, AnonymousClass2bI r8) {
        super(context, r4, r8);
        C36321k7.A0x(r6, context);
        C36341k9.A1F(r7, r5);
        A16();
        this.A0F = r6;
        this.A0I = r8;
        this.A0H = r7;
        this.A0E = r5;
        Activity A012 = C24801Dv.A01(context, AnonymousClass01L.class);
        AnonymousClass00C.A0E(A012, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        this.A0A = (AnonymousClass155) A012;
        C66953Xy.A00(this.A05, this, 30);
        this.A0B = (ConversationRowCatalogPreview) C36361kB.A0F(this, R.id.catalog_preview_container);
        this.A0G = (WDSButton) C36361kB.A0F(this, R.id.flows_cta_button);
        AnonymousClass1JZ.A05(this, this.A0E, 0, 0);
        A2H();
    }

    public void A2H() {
        int i;
        String str;
        this.A02 = A0B(this);
        Class<UserJid> cls = UserJid.class;
        this.A0E.A00(this.A02, (UserJid) this.A03.A06(cls), 1);
        AnonymousClass3SF r1 = this.A06;
        r1.A05(this.A03);
        r1.A03(AnonymousClass000.A1O(this.A03.A0A() ? 1 : 0) ? 1 : 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A08.A09(this.A09, this.A03, dimensionPixelSize);
        AnonymousClass3L0 r0 = this.A03.A0E;
        WaTextView waTextView = this.A07;
        if (r0 != null) {
            waTextView.setText(getResources().getText(R.string.f12nameremoved));
            i = 0;
        } else {
            i = 8;
        }
        waTextView.setVisibility(i);
        C195809Wc r5 = this.A02;
        if (r5 != null) {
            TextView A0P = C36391kE.A0P(this, R.id.account_created_date);
            Long l = r5.A00;
            int i2 = 0;
            if (l != null) {
                long longValue = l.longValue();
                C18820ts r3 = this.A0F;
                String format = new SimpleDateFormat(r3.A0A(178), C36401kF.A0x(r3)).format(new Date(longValue));
                AnonymousClass00C.A08(format);
                Context context = getContext();
                Object[] A0L = AnonymousClass001.A0L();
                A0L[0] = format;
                C36341k9.A0s(context, A0P, A0L, R.string.f12nameremoved);
            } else {
                i2 = 8;
            }
            A0P.setVisibility(i2);
            String str2 = r5.A01;
            if (!((str2 == null || str2.length() == 0) && ((str = r5.A02) == null || str.length() == 0))) {
                A0C((C134766bZ) null, this, this.A0C, str2);
                A0C((C134766bZ) null, this, this.A0D, r5.A02);
                getBusinessProfileManager().A0C(new BAK(r5, this, 7), (UserJid) this.A03.A06(cls));
            }
            UserJid userJid = (UserJid) this.A03.A06(cls);
            if (userJid != null && r5.A03) {
                this.A0c.A02(userJid).A0A(new C23209B9r(userJid, this, 1));
            }
        }
        if (this.A03.A06(cls) != null) {
            getStartFlowPrototypeUtil();
            this.A0G.setVisibility(8);
        }
    }

    public int getLayout() {
        return R.layout.f9nameremoved;
    }
}
