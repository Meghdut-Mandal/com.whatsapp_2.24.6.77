package X;

import android.view.View;

/* renamed from: X.4HQ  reason: invalid class name */
public final class AnonymousClass4HQ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ View $view;
    public final /* synthetic */ AnonymousClass21S this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HQ(View view, AnonymousClass21S r3) {
        super(0);
        this.$view = view;
        this.this$0 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = r1.getContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            android.view.View r1 = r10.$view
            r0 = 2131432319(0x7f0b137f, float:1.8486392E38)
            android.view.View r3 = r1.findViewById(r0)
            if (r3 == 0) goto L_0x00b7
            X.21S r1 = r10.this$0
            int r0 = r1.A00
            if (r0 == 0) goto L_0x00b7
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r2 = r0.getResources()
            int r1 = r1.A00
            android.content.res.Resources$Theme r0 = r0.getTheme()
            android.graphics.drawable.Drawable r8 = X.AnonymousClass0BT.A00(r0, r2, r1)
            if (r8 == 0) goto L_0x00b7
            X.21S r5 = r10.this$0
            r0 = 2131434785(0x7f0b1d21, float:1.8491394E38)
            android.view.View r6 = X.C36361kB.A0F(r3, r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r9 = 0
            r6.setVisibility(r9)
            r0 = 2131434749(0x7f0b1cfd, float:1.849132E38)
            android.widget.LinearLayout r4 = X.C36441kJ.A0U(r6, r0)
            int r0 = r4.getPaddingLeft()
            X.C36341k9.A0z(r4, r0, r9)
            r3 = 17
            r4.setGravity(r3)
            r0 = 2131427681(0x7f0b0161, float:1.8476985E38)
            android.widget.TextView r2 = X.C36391kE.A0P(r4, r0)
            r2.setGravity(r3)
            r0 = 1
            r2.setTextAlignment(r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            java.util.Objects.requireNonNull(r1, r0)
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r1.gravity = r3
            r2.setLayoutParams(r1)
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x006c
            r9 = 1
        L_0x006c:
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626578(0x7f0e0a52, float:1.8880396E38)
            android.view.View r5 = X.C36381kD.A0K(r1, r0)
            r0 = 2131430837(0x7f0b0db5, float:1.8483386E38)
            android.view.View r7 = r5.findViewById(r0)
            int r4 = r7.getPaddingLeft()
            int r3 = r7.getPaddingTop()
            int r2 = r7.getPaddingRight()
            android.content.Context r0 = X.C36371kC.A0B(r7)
            if (r9 == 0) goto L_0x00ba
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131169057(0x7f070f21, float:1.7952433E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x009f:
            r7.setPadding(r4, r3, r2, r0)
            r0 = 2131427694(0x7f0b016e, float:1.8477011E38)
            android.widget.ImageView r0 = X.C36391kE.A0N(r5, r0)
            r0.setImageDrawable(r8)
            r2 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r2, r0)
            r0 = 0
            r6.addView(r5, r0, r1)
        L_0x00b7:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00ba:
            r0 = 0
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4HQ.invoke():java.lang.Object");
    }
}
