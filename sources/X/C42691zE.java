package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.emoji.EmojiContainerView;

/* renamed from: X.1zE  reason: invalid class name and case insensitive filesystem */
public class C42691zE extends AnonymousClass0D3 {
    public int A00;
    public AnonymousClass1XQ A01;
    public final ImageView A02;
    public final EmojiContainerView A03;
    public final AnonymousClass1H2 A04;
    public final AnonymousClass4QX A05;
    public final C19890wg A06;

    public static void A00(C42691zE r7) {
        r7.A02.setImageDrawable(r7.A04.A06(r7.A0H.getResources(), new AnonymousClass2M9(r7.A01.A00), 0.75f, -1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r1 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r5 = this;
            X.1XQ r0 = r5.A01
            r4 = 0
            if (r0 != 0) goto L_0x000b
            com.whatsapp.emoji.EmojiContainerView r0 = r5.A03
            r0.setOnClickListener(r4)
            return
        L_0x000b:
            android.view.View r2 = r5.A0H
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r1.height
            r1.width = r0
            r2.setLayoutParams(r1)
            com.whatsapp.emoji.EmojiContainerView r2 = r5.A03
            r0 = 34
            X.AnonymousClass3Y0.A01(r2, r5, r0)
            X.1XQ r0 = r5.A01
            int[] r0 = r0.A00
            boolean r3 = X.AnonymousClass3UO.A03(r0)
            boolean r1 = X.AnonymousClass3UO.A02(r0)
            if (r3 != 0) goto L_0x0030
            r0 = 0
            if (r1 == 0) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            r2.A02 = r0
            if (r1 == 0) goto L_0x0064
            X.0wg r1 = r5.A06
            X.1XQ r0 = r5.A01
            int[] r0 = r0.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r1 = X.AnonymousClass3TY.A04(r1, r0)
            X.1XQ r0 = new X.1XQ
            r0.<init>((int[]) r1)
            r5.A01 = r0
            r0 = 7
            X.4Xa r4 = new X.4Xa
            r4.<init>(r5, r0)
        L_0x0052:
            r2.setOnLongClickListener(r4)
        L_0x0055:
            android.widget.ImageView r1 = r5.A02
            X.1XQ r0 = r5.A01
            java.lang.String r0 = r0.toString()
            r1.setContentDescription(r0)
            A00(r5)
            return
        L_0x0064:
            if (r3 == 0) goto L_0x0052
            X.0wg r1 = r5.A06
            X.1XQ r0 = r5.A01
            int[] r0 = r0.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r1 = X.AnonymousClass3TY.A05(r1, r0)
            X.1XQ r0 = new X.1XQ
            r0.<init>((int[]) r1)
            r5.A01 = r0
            r0 = 1
            X.2sk r1 = new X.2sk
            r1.<init>(r5, r0)
            r0 = 8
            X.AnonymousClass4Y7.A00(r2, r5, r1, r0)
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42691zE.A0B():void");
    }

    public C42691zE(LayoutInflater layoutInflater, ViewGroup viewGroup, AnonymousClass1H2 r7, AnonymousClass4QX r8, C19890wg r9, int i) {
        super(layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false));
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r9;
        View view = this.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        EmojiContainerView emojiContainerView = (EmojiContainerView) view.findViewById(R.id.emoji_preview_container);
        this.A03 = emojiContainerView;
        this.A02 = C36391kE.A0N(view, R.id.emoji);
        emojiContainerView.setVisibility(0);
    }
}
