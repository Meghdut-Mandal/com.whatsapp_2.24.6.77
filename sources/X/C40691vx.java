package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1vx  reason: invalid class name and case insensitive filesystem */
public final class C40691vx extends AnonymousClass0CZ {
    public String A00;
    public String A01;
    public final AnonymousClass1H2 A02;
    public final AnonymousClass33B A03;
    public final AnonymousClass33C A04;
    public final AnonymousClass33D A05;
    public final List A06 = AnonymousClass001.A0I();
    public final List A07;

    public C40691vx(AnonymousClass1H2 r4, AnonymousClass33B r5, AnonymousClass33C r6, List list) {
        C36331k8.A1G(r6, 3, r5);
        this.A07 = list;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        for (Object add : C007103b.A0a(list, 5)) {
            this.A06.add(add);
        }
        this.A05 = new AnonymousClass33D(this);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42301yb(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false), this.A04, this.A05, this);
    }

    public int A0J() {
        return this.A06.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (X.AnonymousClass00C.A0J(r5, r7.A00) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r8, int r9) {
        /*
            r7 = this;
            X.1yb r8 = (X.C42301yb) r8
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            java.util.List r0 = r7.A06
            java.lang.Object r1 = r0.get(r9)
            X.3Jg r1 = (X.C63233Jg) r1
            com.whatsapp.TextEmojiLabel r0 = r8.A00
            java.lang.String r6 = r1.A03
            r0.A0I(r6)
            java.lang.String r5 = r1.A02
            r4 = 0
            if (r5 == 0) goto L_0x0044
            com.whatsapp.WaImageView r2 = r8.A02
            android.content.res.Resources r1 = X.C36441kJ.A0J(r0)
            X.1H2 r0 = r7.A02
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3SX.A00(r1, r0, r5)
            r2.setImageDrawable(r0)
            r8.A03 = r5
        L_0x002b:
            com.whatsapp.WaImageView r2 = r8.A01
            java.lang.String r0 = r7.A01
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r7.A00
            boolean r1 = X.AnonymousClass00C.A0J(r5, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0040
        L_0x003e:
            r0 = 8
        L_0x0040:
            r2.setVisibility(r0)
            return
        L_0x0044:
            com.whatsapp.WaImageView r3 = r8.A02
            android.content.Context r2 = r3.getContext()
            r1 = 2131231746(0x7f080402, float:1.8079582E38)
            r0 = 2131101055(0x7f06057f, float:1.7814509E38)
            X.AnonymousClass3UF.A0B(r2, r3, r1, r0)
            r8.A03 = r4
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40691vx.BSE(X.0D3, int):void");
    }
}
