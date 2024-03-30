package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.ui.media.MediaCard;
import java.util.HashSet;

/* renamed from: X.3HB  reason: invalid class name */
public final class AnonymousClass3HB {
    public AnonymousClass2bU A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final AnonymousClass155 A03;
    public final AnonymousClass9XI A04;
    public final C29461Ws A05;
    public final AnonymousClass9Y1 A06;
    public final C199439fJ A07;
    public final C20830yE A08;
    public final AnonymousClass11F A09;
    public final MediaCard A0A;
    public final AnonymousClass1SV A0B;
    public final HashSet A0C = C36441kJ.A16();
    public final C18820ts A0D;
    public final AnonymousClass4SB A0E;

    public final void A00(View view) {
        Intent intent;
        AnonymousClass2bU r0 = this.A00;
        if (r0 != null) {
            C64933Qa r2 = r0.A1J;
            if (r2 != null) {
                AnonymousClass3FI r1 = new AnonymousClass3FI(this.A03);
                AnonymousClass11F r02 = this.A09;
                C18740tg.A06(r02);
                r1.A05 = r02;
                r1.A06 = r2;
                r1.A00 = 34;
                intent = r1.A00();
            } else {
                intent = null;
            }
            if (view != null) {
                if (intent != null) {
                    AnonymousClass155 r22 = this.A03;
                    AnonymousClass3U9.A09(r22, intent, view, new AnonymousClass3CG(r22), AnonymousClass3RL.A01(this.A00));
                }
            } else if (intent != null) {
                this.A03.startActivity(intent);
            }
        }
    }

    public AnonymousClass3HB(AnonymousClass17Y r3, C19730wQ r4, AnonymousClass155 r5, AnonymousClass9XI r6, C29461Ws r7, AnonymousClass9Y1 r8, C199439fJ r9, C20830yE r10, C18820ts r11, AnonymousClass11F r12, MediaCard mediaCard, AnonymousClass1SV r14) {
        C36321k7.A1B(r3, r11, r8, r4, r7);
        C36321k7.A1C(r14, r6, r9, r10, r12);
        C36341k9.A1G(mediaCard, r5);
        this.A01 = r3;
        this.A0D = r11;
        this.A06 = r8;
        this.A02 = r4;
        this.A05 = r7;
        this.A0B = r14;
        this.A04 = r6;
        this.A07 = r9;
        this.A08 = r10;
        this.A09 = r12;
        this.A0A = mediaCard;
        this.A03 = r5;
        C89804Xy r0 = new C89804Xy(this, 2);
        this.A0E = r0;
        mediaCard.setSeeMoreClickListener(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r9 != 13) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.List r21) {
        /*
            r20 = this;
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r3 = 1
            r2 = r20
            if (r21 == 0) goto L_0x00d7
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x00d7
            java.util.Iterator r12 = r21.iterator()
        L_0x0013:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d7
            X.2bU r6 = X.C36441kJ.A0r(r12)
            java.lang.String r19 = X.AnonymousClass3RL.A01(r6)
            int r9 = r6.A1I
            r11 = 23
            r1 = 9
            r10 = 28
            java.lang.String r17 = " "
            r8 = 2
            r0 = 29
            r5 = 3
            r18 = 0
            r7 = 13
            if (r9 == r5) goto L_0x0073
            if (r9 == r8) goto L_0x0073
            if (r9 == r7) goto L_0x00af
            if (r9 == r10) goto L_0x0073
            if (r9 == r0) goto L_0x00af
            if (r9 == r1) goto L_0x008e
            r0 = 26
            if (r9 == r0) goto L_0x008e
            if (r9 != r11) goto L_0x00a5
            X.155 r0 = r2.A03
            android.content.Context r7 = r0.getBaseContext()
            r1 = 2131233264(0x7f0809f0, float:1.808266E38)
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            android.graphics.drawable.Drawable r14 = X.AnonymousClass3UF.A02(r7, r1, r0)
        L_0x0055:
            r1 = 2131888486(0x7f120966, float:1.9411609E38)
        L_0x0058:
            X.155 r0 = r2.A03
            java.lang.String r18 = r0.getString(r1)
        L_0x005e:
            X.4XJ r15 = new X.4XJ
            r15.<init>(r2, r6, r3)
            X.4ZA r0 = new X.4ZA
            r0.<init>(r2, r6, r5)
            X.3A6 r13 = new X.3A6
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r4.add(r13)
            goto L_0x0013
        L_0x0073:
            int r0 = r6.A0B
            X.0ts r11 = r2.A0D
            if (r0 == 0) goto L_0x0087
            int r0 = r6.A0B
            long r0 = (long) r0
            java.lang.String r17 = X.AnonymousClass3UY.A07(r11, r0)
        L_0x0080:
            if (r9 == r5) goto L_0x00b5
            if (r9 == r10) goto L_0x00b5
            if (r9 == r7) goto L_0x00af
            goto L_0x009d
        L_0x0087:
            long r0 = r6.A00
            java.lang.String r17 = X.AnonymousClass3TF.A02(r11, r0)
            goto L_0x0080
        L_0x008e:
            r0 = r6
            X.2by r0 = (X.C46972by) r0
            int r10 = r0.A00
            if (r10 == 0) goto L_0x00a5
            X.0ts r1 = r2.A0D
            java.lang.String r0 = r0.A05
            java.lang.String r17 = X.C25571Gv.A03(r1, r0, r10)
        L_0x009d:
            r14 = r18
        L_0x009f:
            if (r9 != r8) goto L_0x00be
            r1 = 2131888471(0x7f120957, float:1.9411578E38)
            goto L_0x0058
        L_0x00a5:
            r14 = r18
            r17 = r14
            if (r9 != r3) goto L_0x009f
            r1 = 2131888481(0x7f120961, float:1.9411599E38)
            goto L_0x0058
        L_0x00af:
            X.155 r1 = r2.A03
            r0 = 2131233137(0x7f080971, float:1.8082403E38)
            goto L_0x00ba
        L_0x00b5:
            X.155 r1 = r2.A03
            r0 = 2131233139(0x7f080973, float:1.8082407E38)
        L_0x00ba:
            android.graphics.drawable.Drawable r14 = X.AnonymousClass00E.A00(r1, r0)
        L_0x00be:
            if (r9 == r5) goto L_0x00d3
            r0 = 9
            if (r9 == r0) goto L_0x00cf
            if (r9 == r7) goto L_0x00cb
            r0 = 23
            if (r9 == r0) goto L_0x0055
            goto L_0x005e
        L_0x00cb:
            r1 = 2131888477(0x7f12095d, float:1.941159E38)
            goto L_0x0058
        L_0x00cf:
            r1 = 2131888476(0x7f12095c, float:1.9411588E38)
            goto L_0x0058
        L_0x00d3:
            r1 = 2131888491(0x7f12096b, float:1.9411619E38)
            goto L_0x0058
        L_0x00d7:
            com.whatsapp.ui.media.MediaCard r1 = r2.A0A
            X.4SB r0 = r2.A0E
            r1.setSeeMoreClickListener(r0)
            r0 = 12
            r1.A08(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HB.A01(java.util.List):void");
    }
}
