package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4mf  reason: invalid class name and case insensitive filesystem */
public final class C96024mf extends AnonymousClass0CZ {
    public boolean A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass1PM A03;
    public final C18820ts A04;
    public final C1032954s A05;
    public final AnonymousClass1H2 A06;
    public final C132366Tg A07;
    public final AnonymousClass3K8 A08;
    public final C25491Gn A09;
    public final AnonymousClass6VT A0A;
    public final C124985z8 A0B;
    public final AnonymousClass4R3 A0C;
    public final AnonymousClass1HA A0D;
    public final AnonymousClass1GX A0E;
    public final HashSet A0F;
    public final Set A0G = C36441kJ.A17();

    public long A0E(int i) {
        return (long) C36401kF.A0w(this.A0A.A04).get(i).hashCode();
    }

    public int A0J() {
        return C36401kF.A00(this.A0A.A04);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.4TB} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r17, int r18) {
        /*
            r16 = this;
            r5 = r17
            X.4nU r5 = (X.C96534nU) r5
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            android.view.View r12 = r5.A0H
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.mediacomposer.bottombar.thumbnails.ThumbnailView"
            X.AnonymousClass00C.A0E(r12, r0)
            X.5CN r12 = (X.AnonymousClass5CN) r12
            r3 = r16
            X.6VT r7 = r3.A0A
            X.00s r0 = r7.A03
            int r0 = X.C36341k9.A07(r0)
            r8 = 0
            r4 = r18
            boolean r0 = X.AnonymousClass000.A1S(r0, r4)
            r12.setSelected(r0)
            if (r0 == 0) goto L_0x002c
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x002c
            r8 = 1
        L_0x002c:
            r6 = 0
            if (r8 == 0) goto L_0x00f8
            android.content.Context r1 = r3.A02
            r0 = 2131232114(0x7f080572, float:1.8080328E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r1, r0)
        L_0x0038:
            r12.setOverlayIcon(r0)
            r0 = r6
            if (r8 == 0) goto L_0x0045
            r0 = 2131429487(0x7f0b086f, float:1.8480648E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0045:
            r12.setCustomId(r0)
            X.3K8 r2 = r3.A08
            java.lang.Object r1 = r12.getTag()
            boolean r0 = r1 instanceof X.AnonymousClass4TB
            if (r0 == 0) goto L_0x0055
            r6 = r1
            X.4TB r6 = (X.AnonymousClass4TB) r6
        L_0x0055:
            r2.A01(r6)
            X.00s r0 = r7.A04
            java.util.List r0 = X.C36401kF.A0w(r0)
            java.lang.Object r6 = r0.get(r4)
            android.net.Uri r6 = (android.net.Uri) r6
            X.6Tg r0 = r3.A07
            X.6QO r10 = r0.A03(r6)
            r12.setItem(r10)
            r12.A05 = r5
            X.1Gn r11 = r3.A09
            int r1 = X.AnonymousClass6QO.A00(r10, r11)
            r0 = 3
            if (r1 == r0) goto L_0x00e3
            r0 = 13
            if (r1 == r0) goto L_0x00ce
            r0 = 0
            r12.A03 = r0
            android.content.Context r1 = r12.getContext()
            r0 = 2131888481(0x7f120961, float:1.9411599E38)
        L_0x0086:
            X.C36331k8.A0q(r1, r12, r0)
            if (r8 == 0) goto L_0x0091
            r0 = 2131893964(0x7f121ecc, float:1.942272E38)
            X.C33521fV.A03(r12, r0)
        L_0x0091:
            r0 = 17
            X.C67143Yr.A00(r12, r3, r4, r0)
            r0 = 7
            X.AnonymousClass6UI.A00(r12, r3, r0)
            X.0ts r7 = r3.A04
            X.1H2 r9 = r3.A06
            X.1GX r14 = r3.A0E
            X.1HA r13 = r3.A0D
            X.AnonymousClass00C.A0B(r6)
            X.54s r8 = r3.A05
            int r15 = r3.A01
            r1 = 1
            X.6uO r5 = new X.6uO
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.util.Set r0 = r3.A0G
            r0.add(r5)
            r12.setTag(r5)
            X.1PM r4 = r3.A03
            X.6uQ r3 = new X.6uQ
            r3.<init>(r4, r5, r12)
            java.lang.String r0 = r5.BIB()
            java.lang.Object r0 = r4.A09(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L_0x00fb
            r2.A02(r5, r3)
            return
        L_0x00ce:
            android.content.Context r1 = r12.getContext()
            r0 = 2131233137(0x7f080971, float:1.8082403E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r1, r0)
            r12.A03 = r0
            android.content.Context r1 = r12.getContext()
            r0 = 2131888477(0x7f12095d, float:1.941159E38)
            goto L_0x0086
        L_0x00e3:
            android.content.Context r1 = r12.getContext()
            r0 = 2131233139(0x7f080973, float:1.8082407E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r1, r0)
            r12.A03 = r0
            android.content.Context r1 = r12.getContext()
            r0 = 2131888491(0x7f12096b, float:1.9411619E38)
            goto L_0x0086
        L_0x00f8:
            r0 = r6
            goto L_0x0038
        L_0x00fb:
            r3.Bi2(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96024mf.BSE(X.0D3, int):void");
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass5CN r1;
        List list = AnonymousClass0D3.A0I;
        boolean A002 = C111075bh.A00(this.A0A.A01);
        Context context = this.A02;
        C124985z8 r3 = this.A0B;
        HashSet hashSet = this.A0F;
        int i2 = this.A01;
        if (A002) {
            r1 = new AnonymousClass5CM(context, r3, hashSet, i2);
        } else {
            r1 = new AnonymousClass5CN(context, r3, hashSet, i2);
        }
        return new C96534nU(r1);
    }

    public C96024mf(Context context, AnonymousClass1PM r3, C18820ts r4, C1032954s r5, AnonymousClass1H2 r6, C132366Tg r7, AnonymousClass3K8 r8, C25491Gn r9, AnonymousClass6VT r10, C124985z8 r11, AnonymousClass4R3 r12, AnonymousClass1HA r13, AnonymousClass1GX r14, HashSet hashSet, int i) {
        this.A02 = context;
        this.A04 = r4;
        this.A06 = r6;
        this.A0D = r13;
        this.A0C = r12;
        this.A0B = r11;
        this.A0E = r14;
        this.A09 = r9;
        this.A08 = r8;
        this.A07 = r7;
        this.A0F = hashSet;
        this.A03 = r3;
        this.A0A = r10;
        this.A05 = r5;
        this.A01 = i;
        this.A00 = !C111075bh.A00(r10.A01);
    }
}
