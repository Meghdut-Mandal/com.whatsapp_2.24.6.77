package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1vz  reason: invalid class name and case insensitive filesystem */
public final class C40711vz extends AnonymousClass0CZ {
    public final AnonymousClass0TU A00 = new AnonymousClass0TU(new C42751zQ(this), AnonymousClass3QK.class);
    public final C19730wQ A01;
    public final AnonymousClass1LI A02;
    public final C586930r A03;
    public final AnonymousClass1Pp A04;
    public final AnonymousClass16D A05;
    public final AnonymousClass171 A06;
    public final AnonymousClass1RY A07;
    public final C220412q A08;
    public final AnonymousClass17X A09;
    public final C20810yC A0A;
    public final boolean A0B;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        List list = AnonymousClass0D3.A0I;
        C20810yC r10 = this.A0A;
        C19730wQ r3 = this.A01;
        C220412q r8 = this.A08;
        AnonymousClass1Pp r5 = this.A04;
        AnonymousClass16D r6 = this.A05;
        AnonymousClass171 r7 = this.A06;
        AnonymousClass17X r9 = this.A09;
        return new C42461yr(C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false), r3, this.A02, r5, r6, r7, r8, r9, r10);
    }

    public int A0J() {
        return this.A00.A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r12, int r13) {
        /*
            r11 = this;
            X.1yr r12 = (X.C42461yr) r12
            r6 = 0
            X.AnonymousClass00C.A0D(r12, r6)
            X.0TU r3 = r11.A00
            int r2 = r3.A03
            if (r13 >= r2) goto L_0x0129
            if (r13 < 0) goto L_0x0129
            java.lang.Object[] r1 = r3.A07
            if (r1 == 0) goto L_0x0125
            int r0 = r3.A00
            if (r13 < r0) goto L_0x0125
            int r13 = r13 - r0
            int r0 = r3.A02
            int r13 = r13 + r0
        L_0x001a:
            r7 = r1[r13]
            X.AnonymousClass00C.A08(r7)
            X.3QK r7 = (X.AnonymousClass3QK) r7
            X.1RY r9 = r11.A07
            X.30r r5 = r11.A03
            X.AnonymousClass00C.A0D(r7, r6)
            r4 = 1
            X.C36321k7.A0v(r9, r4, r5)
            X.16D r0 = r12.A06
            com.whatsapp.jid.GroupJid r3 = r7.A02
            X.141 r8 = r0.A0D(r3)
            X.12q r2 = r12.A08
            int r1 = r2.A05(r3)
            r0 = 3
            if (r1 != r0) goto L_0x00f5
            X.1Pp r10 = r12.A05
            com.whatsapp.components.button.ThumbnailButton r9 = r12.A04
            boolean r0 = X.C222013h.A05
            r8 = 2131231030(0x7f080136, float:1.807813E38)
            if (r0 == 0) goto L_0x004b
            r8 = 2131231031(0x7f080137, float:1.8078132E38)
        L_0x004b:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168345(0x7f070c59, float:1.795099E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
        L_0x0058:
            r10.A05(r9, r0, r8, r1)
        L_0x005b:
            int r8 = r2.A05(r3)
            r1 = 3
            X.3SF r0 = r12.A02
            if (r8 != r1) goto L_0x00ec
            r1 = 2131888046(0x7f1207ae, float:1.9410716E38)
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setText(r1)
        L_0x006c:
            int r1 = r2.A05(r3)
            r0 = 3
            if (r1 == r0) goto L_0x00e4
            X.17X r0 = r12.A09
            X.17r r0 = r0.A07
            X.6X6 r1 = r0.A0C(r3)
            X.0wQ r0 = r12.A00
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x00d6
            X.171 r0 = r12.A07
            java.lang.String r1 = X.AnonymousClass171.A04(r0, r3, r4, r4)
        L_0x0089:
            if (r1 == 0) goto L_0x00e4
            com.whatsapp.TextEmojiLabel r0 = r12.A01
            r0.setVisibility(r6)
            r0.A0I(r1)
        L_0x0093:
            com.whatsapp.WaImageButton r8 = r12.A03
            android.content.Context r1 = r8.getContext()
            r0 = 2131893503(0x7f121cff, float:1.9421784E38)
            X.C36331k8.A0q(r1, r8, r0)
            android.content.Context r10 = r8.getContext()
            r9 = 2131886225(0x7f120091, float:1.9407023E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r7.A04
            java.lang.String r0 = X.C36391kE.A0v(r10, r0, r1, r6, r9)
            X.C33521fV.A06(r8, r0)
            int r1 = r2.A05(r3)
            r0 = 3
            if (r1 == r0) goto L_0x00cd
            r0 = 20
            X.AnonymousClass3YE.A00(r8, r5, r7, r0)
            r8.setVisibility(r6)
        L_0x00c0:
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x00cc
            r0 = 0
            r8.setOnClickListener(r0)
            r0 = 4
            r8.setVisibility(r0)
        L_0x00cc:
            return
        L_0x00cd:
            r0 = 0
            r8.setOnClickListener(r0)
            r0 = 4
            r8.setVisibility(r0)
            goto L_0x00c0
        L_0x00d6:
            com.whatsapp.TextEmojiLabel r0 = r12.A01
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131888130(0x7f120802, float:1.9410887E38)
            java.lang.String r1 = r1.getString(r0)
            goto L_0x0089
        L_0x00e4:
            com.whatsapp.TextEmojiLabel r1 = r12.A01
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0093
        L_0x00ec:
            java.lang.String r1 = r7.A04
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setText(r1)
            goto L_0x006c
        L_0x00f5:
            int r1 = r7.A00
            r0 = 6
            if (r1 != r0) goto L_0x011e
            boolean r0 = r8.A0f
            if (r0 != 0) goto L_0x011e
            X.0yC r1 = r12.A0A
            r0 = 5021(0x139d, float:7.036E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x011e
            X.1Pp r10 = r12.A05
            com.whatsapp.components.button.ThumbnailButton r9 = r12.A04
            r8 = 2131231044(0x7f080144, float:1.8078158E38)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168345(0x7f070c59, float:1.795099E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0058
        L_0x011e:
            com.whatsapp.components.button.ThumbnailButton r0 = r12.A04
            r9.A08(r0, r8)
            goto L_0x005b
        L_0x0125:
            java.lang.Object[] r1 = r3.A06
            goto L_0x001a
        L_0x0129:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Asked to get item at "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " but size is "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r2)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40711vz.BSE(X.0D3, int):void");
    }

    public C40711vz(C19730wQ r4, AnonymousClass1LI r5, C586930r r6, AnonymousClass1Pp r7, AnonymousClass16D r8, AnonymousClass171 r9, AnonymousClass1RY r10, C220412q r11, AnonymousClass17X r12, C20810yC r13, boolean z) {
        C36321k7.A1B(r13, r4, r11, r7, r8);
        C36321k7.A13(r9, r12, r5);
        AnonymousClass00C.A0D(r6, 11);
        this.A0A = r13;
        this.A01 = r4;
        this.A08 = r11;
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r9;
        this.A09 = r12;
        this.A02 = r5;
        this.A07 = r10;
        this.A0B = z;
        this.A03 = r6;
    }
}
