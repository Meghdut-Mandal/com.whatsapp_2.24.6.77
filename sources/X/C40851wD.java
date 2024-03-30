package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1wD  reason: invalid class name and case insensitive filesystem */
public final class C40851wD extends AnonymousClass0CZ {
    public List A00 = C023409w.A00;
    public final C24801Dv A01;
    public final C18820ts A02;
    public final C28981Uw A03;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00eb, code lost:
        if (r1 == r0) goto L_0x00ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r12, int r13) {
        /*
            r11 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            boolean r0 = r12 instanceof X.C41881xv
            if (r0 == 0) goto L_0x002a
            r0 = r12
            X.1xv r0 = (X.C41881xv) r0
            com.whatsapp.WaTextView r2 = r0.A00
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.alerts.HeaderDataItem"
            X.AnonymousClass00C.A0E(r1, r0)
            X.2al r1 = (X.C46682al) r1
            int r0 = r1.A00
            r2.setText(r0)
            android.content.Context r1 = X.C36441kJ.A0F(r12)
            r0 = 2131102763(0x7f060c2b, float:1.7817973E38)
            X.C36331k8.A0r(r1, r2, r0)
        L_0x0029:
            return
        L_0x002a:
            boolean r0 = r12 instanceof X.C42181yP
            if (r0 == 0) goto L_0x0029
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            boolean r0 = r1 instanceof X.C46672ak
            if (r0 == 0) goto L_0x00be
            X.1yP r12 = (X.C42181yP) r12
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.alerts.AlertDataItem"
            X.AnonymousClass00C.A0E(r1, r0)
            X.2ak r1 = (X.C46672ak) r1
            X.2u2 r6 = r1.A00
            android.view.View r5 = r12.A0H
            android.content.Context r4 = r5.getContext()
            boolean r0 = r6 instanceof X.AnonymousClass2ai
            if (r0 == 0) goto L_0x007a
            com.whatsapp.WaTextView r1 = r12.A02
            r0 = 2131890354(0x7f1210b2, float:1.9415397E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r12.A01
            r0 = 2131890353(0x7f1210b1, float:1.9415395E38)
            r1.setText(r0)
            r0 = 18
        L_0x0065:
            X.3YH r1 = new X.3YH
            r1.<init>(r11, r4, r0)
        L_0x006a:
            r5.setOnClickListener(r1)
        L_0x006d:
            com.whatsapp.WaImageView r1 = r12.A00
            r0 = 2131234363(0x7f080e3b, float:1.808489E38)
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r4, r0)
            r1.setImageDrawable(r0)
            return
        L_0x007a:
            boolean r0 = r6 instanceof X.C46662aj
            if (r0 == 0) goto L_0x0091
            com.whatsapp.WaTextView r1 = r12.A02
            r0 = 2131894753(0x7f1221e1, float:1.942432E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r12.A01
            r0 = 2131894752(0x7f1221e0, float:1.9424318E38)
            r1.setText(r0)
            r0 = 17
            goto L_0x0065
        L_0x0091:
            boolean r0 = r6 instanceof X.AnonymousClass2ah
            if (r0 == 0) goto L_0x006d
            com.whatsapp.WaTextView r1 = r12.A02
            r0 = 2131889930(0x7f120f0a, float:1.9414537E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r3 = r12.A01
            X.0ts r0 = r11.A02
            java.lang.String r2 = r0.A07()
            r0 = r6
            X.2ah r0 = (X.AnonymousClass2ah) r0
            java.lang.String r1 = r0.A00
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r2, r1)
            java.lang.String r0 = r0.getDisplayCountry()
            r3.setText(r0)
            r0 = 21
            X.3YM r1 = new X.3YM
            r1.<init>(r11, r4, r6, r0)
            goto L_0x006a
        L_0x00be:
            boolean r0 = r1 instanceof X.C46692am
            if (r0 == 0) goto L_0x0029
            X.1yP r12 = (X.C42181yP) r12
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.alerts.ReviewDataItem"
            X.AnonymousClass00C.A0E(r1, r0)
            X.2am r1 = (X.C46692am) r1
            X.3X9 r7 = r1.A00
            android.view.View r6 = r12.A0H
            android.content.Context r5 = r6.getContext()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = r7.A00()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.REJECT
            if (r1 == r0) goto L_0x00ed
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.SUCCESS
            if (r1 == r0) goto L_0x00ed
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.CONTENT_UNAVAILABLE
            r10 = 0
            r8 = 2131234250(0x7f080dca, float:1.808466E38)
            if (r1 != r0) goto L_0x00f1
        L_0x00ed:
            r10 = 1
            r8 = 2131234101(0x7f080d35, float:1.8084358E38)
        L_0x00f1:
            boolean r0 = r7 instanceof X.AnonymousClass2Z2
            r9 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0141
            r1 = 2131891333(0x7f121485, float:1.9417383E38)
            if (r10 == 0) goto L_0x00ff
            r1 = 2131891323(0x7f12147b, float:1.9417363E38)
        L_0x00ff:
            com.whatsapp.WaTextView r0 = r12.A02
            r0.setText(r1)
        L_0x0104:
            com.whatsapp.WaImageView r2 = r12.A00
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r5, r8)
            r2.setImageDrawable(r0)
            r0 = 2131102763(0x7f060c2b, float:1.7817973E38)
            int r1 = X.AnonymousClass00F.A00(r5, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            java.lang.String r0 = r7.A01()
            if (r0 == 0) goto L_0x013b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r2.toMillis(r0)
            X.0ts r2 = r11.A02
            java.lang.String r3 = X.C20040wv.A05(r2, r0)
            com.whatsapp.WaTextView r2 = r12.A01
            r1 = 2131891339(0x7f12148b, float:1.9417395E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r9] = r3
            X.C36341k9.A0s(r5, r2, r0, r1)
        L_0x013b:
            r0 = 20
            X.AnonymousClass3YM.A00(r6, r11, r5, r7, r0)
            return
        L_0x0141:
            boolean r0 = r7 instanceof X.AnonymousClass2Z0
            if (r0 == 0) goto L_0x014e
            r1 = 2131891334(0x7f121486, float:1.9417385E38)
            if (r10 == 0) goto L_0x00ff
            r1 = 2131891324(0x7f12147c, float:1.9417365E38)
            goto L_0x00ff
        L_0x014e:
            boolean r0 = r7 instanceof X.AnonymousClass2Z1
            if (r0 == 0) goto L_0x0104
            X.0ts r0 = r11.A02
            java.lang.String r2 = r0.A07()
            r0 = r7
            X.2Z1 r0 = (X.AnonymousClass2Z1) r0
            java.lang.String r1 = r0.A01
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r2, r1)
            java.lang.String r3 = r0.getDisplayCountry()
            r2 = 2131891326(0x7f12147e, float:1.9417369E38)
            if (r10 == 0) goto L_0x016e
            r2 = 2131891325(0x7f12147d, float:1.9417367E38)
        L_0x016e:
            com.whatsapp.WaTextView r1 = r12.A02
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r9] = r3
            X.C36341k9.A0s(r5, r1, r0, r2)
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40851wD.BSE(X.0D3, int):void");
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            return new C41881xv(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false));
        }
        if (i == 1) {
            View inflate = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
            ImageView A0N = C36391kE.A0N(inflate, R.id.right_arrow_icon);
            C36321k7.A0L(A0N.getContext(), A0N, this.A02, R.drawable.ic_fab_next);
            return new C42181yP(inflate);
        }
        throw AnonymousClass001.A08("Invalid view type");
    }

    public int A0J() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        return (this.A00.get(i) instanceof C46682al) ^ true ? 1 : 0;
    }

    public C40851wD(C24801Dv r2, C18820ts r3, C28981Uw r4) {
        C36321k7.A0x(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
