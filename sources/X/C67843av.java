package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3av  reason: invalid class name and case insensitive filesystem */
public final class C67843av implements AnonymousClass04S {
    public View A00;
    public final ViewGroup A01;
    public final AnonymousClass012 A02;
    public final C224914p A03;
    public final C18820ts A04;
    public final AnonymousClass1K4 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r5 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2 = r7.A02;
        r3 = r7.A04;
        r0 = r7.A03;
        r5 = new X.C42731zI(r0);
        r1 = (com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel) X.C36441kJ.A0b(r0).A00(com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel.class);
        X.AnonymousClass00C.A0D(r1, 2);
        r5.getContext();
        X.C36351kA.A1F(r5, 0);
        r5.setAdapter(new X.C40481vc(r2, r1));
        r2 = r5.getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f7nameremoved);
        r5.A0t(new X.C41221wr(r3, r2));
        r5.setPadding(r2, 0, r2, r5.getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f7nameremoved));
        r5.setClipToPadding(false);
        r7.A01.addView(r5, 0, new android.widget.FrameLayout.LayoutParams(-1, -2, 80));
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006f, code lost:
        r5.setVisibility(0);
        r7.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0074, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BTH(java.lang.Object r8) {
        /*
            r7 = this;
            java.util.List r8 = (java.util.List) r8
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)
            android.view.View r5 = r7.A00
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0012
            X.C36341k9.A0y(r5)
            return
        L_0x0012:
            if (r5 != 0) goto L_0x006f
            X.012 r2 = r7.A02
            X.0ts r3 = r7.A04
            X.14p r0 = r7.A03
            X.1zI r5 = new X.1zI
            r5.<init>(r0)
            X.04H r1 = X.C36441kJ.A0b(r0)
            java.lang.Class<com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel> r0 = com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel.class
            X.04R r1 = r1.A00(r0)
            com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel r1 = (com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            r5.getContext()
            X.C36351kA.A1F(r5, r6)
            X.1vc r0 = new X.1vc
            r0.<init>(r2, r1)
            r5.setAdapter(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168374(0x7f070c76, float:1.7951048E38)
            int r2 = r1.getDimensionPixelSize(r0)
            X.1wr r0 = new X.1wr
            r0.<init>(r3, r2)
            r5.A0t(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168380(0x7f070c7c, float:1.795106E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.setPadding(r2, r6, r2, r0)
            r5.setClipToPadding(r6)
            android.view.ViewGroup r4 = r7.A01
            r3 = -1
            r2 = -2
            r1 = 80
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r3, r2, r1)
            r4.addView(r5, r6, r0)
        L_0x006f:
            r5.setVisibility(r6)
            r7.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67843av.BTH(java.lang.Object):void");
    }

    public C67843av(ViewGroup viewGroup, AnonymousClass012 r2, C224914p r3, AnonymousClass1K4 r4, C18820ts r5) {
        this.A02 = r2;
        this.A04 = r5;
        this.A01 = viewGroup;
        this.A05 = r4;
        this.A03 = r3;
    }
}
