package X;

import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$1;
import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$2;
import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$3;
import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$createStickersFlow$1;
import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$createStickersFlow$2;
import com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1;
import com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$1;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Lt  reason: invalid class name and case insensitive filesystem */
public final class C130616Lt {
    public List A00;
    public final AnonymousClass6W5 A01;
    public final C20810yC A02;
    public final C23871Ae A03;
    public final C104645Ao A04;
    public final C124575yQ A05;
    public final List A06;
    public final List A07;
    public final C005502l A08;
    public final C005502l A09;
    public final AnonymousClass05H A0A;
    public final AnonymousClass05H A0B;
    public final AnonymousClass05H A0C;
    public final C116335kQ A0D;
    public final C124215xm A0E;
    public final C24281Bv A0F;
    public final AnonymousClass6ST A0G;
    public final C130566Lo A0H;
    public final AnonymousClass040 A0I;
    public final AnonymousClass05K A0J;

    private final C13010j1 A00(boolean z) {
        Object r8;
        AnonymousClass05H r6;
        String str;
        Object obj;
        if (this.A0F.A00.A0E(5979)) {
            C124215xm r7 = this.A0E;
            AnonymousClass6OQ A002 = r7.A05.A00();
            if (A002 == null || (obj = A002.A04.A00) == null) {
                str = null;
            } else {
                str = String.valueOf(obj);
            }
            C15410nI A003 = C06830Vg.A00(new SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1(r7, str, (C023509x) null), C07430Xq.A01(r7.A00.A00));
            AnonymousClass05I r4 = r7.A06.A07;
            C156507a5 r3 = C156507a5.A00;
            C006302t r2 = C07430Xq.A00;
            AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
            C07710Yz.A03(r3, 2);
            AnonymousClass05H A004 = C07430Xq.A00(r2, r3, r4);
            SocialStickersDataFlow$observeSocialStickers$1 socialStickersDataFlow$observeSocialStickers$1 = new SocialStickersDataFlow$observeSocialStickers$1(r7, (C023509x) null);
            AnonymousClass05H[] r1 = new AnonymousClass05H[2];
            C36331k8.A1N(A003, A004, r1);
            r8 = new C15330nA(new AnonymousClass0l9((C023509x) null, socialStickersDataFlow$observeSocialStickers$1, r1));
        } else {
            r8 = new C18500tG(C1034655n.A00, 0);
        }
        AnonymousClass05I r72 = this.A05.A07;
        AnonymousClass6ST r0 = this.A0G;
        if (z) {
            r6 = r0.A04;
        } else {
            r6 = r0.A05;
        }
        AnonymousClass05H r5 = this.A0H.A05;
        AnonymousClass05H r22 = this.A0A;
        AvatarExpressionsDataFlow$createStickersFlow$1 avatarExpressionsDataFlow$createStickersFlow$1 = new AvatarExpressionsDataFlow$createStickersFlow$1(this, (C023509x) null);
        AnonymousClass05H[] r12 = new AnonymousClass05H[5];
        C36321k7.A1F(r8, r72, r6, r5, r12);
        r12[4] = r22;
        return C07360Xi.A01(C023409w.A00, this.A0I, new C18510tH((C009003v) new AvatarExpressionsDataFlow$createStickersFlow$2(this, (C023509x) null), (AnonymousClass05H) new C18510tH((Object) r12, (Object) avatarExpressionsDataFlow$createStickersFlow$1, 7), 5), new C13120jC(10000));
    }

    public C130616Lt(C116335kQ r12, AnonymousClass6W5 r13, C124215xm r14, C20810yC r15, C23871Ae r16, C24281Bv r17, C104645Ao r18, C124575yQ r19, AnonymousClass6ST r20, C130566Lo r21, C005502l r22, C005502l r23) {
        C130566Lo r3 = r21;
        AnonymousClass00C.A0D(r3, 1);
        C23871Ae r7 = r16;
        AnonymousClass6ST r5 = r20;
        C36321k7.A1A(r5, r15, r7, r13, 2);
        C104645Ao r8 = r18;
        C124575yQ r6 = r19;
        C36361kB.A1J(r6, 7, r8);
        C24281Bv r9 = r17;
        AnonymousClass00C.A0D(r9, 9);
        AnonymousClass00C.A0D(r12, 10);
        C005502l r1 = r22;
        C005502l r0 = r23;
        C36341k9.A1G(r1, r0);
        this.A0H = r3;
        this.A0G = r5;
        this.A0E = r14;
        this.A02 = r15;
        this.A03 = r7;
        this.A01 = r13;
        this.A05 = r6;
        this.A04 = r8;
        this.A0F = r9;
        this.A0D = r12;
        this.A09 = r1;
        this.A08 = r0;
        this.A0I = C90494aF.A0n(r0);
        C13540k2 r110 = new C13540k2();
        r110.add(AnonymousClass5I9.A00);
        r110.add(AnonymousClass5IA.A00);
        r110.add(AnonymousClass5ID.A00);
        r110.add(AnonymousClass5I8.A00);
        r110.add(AnonymousClass5IB.A00);
        r110.add(AnonymousClass5I7.A00);
        C13540k2 A002 = AnonymousClass03S.A00(r110);
        this.A00 = A002;
        ArrayList A0z = C36351kA.A0z(A002);
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            C125415zs r82 = (C125415zs) it.next();
            AnonymousClass565 r72 = new AnonymousClass565(r82, r82.toString());
            C13540k2 r32 = new C13540k2();
            r32.add(new C1035555x((C125385zp) r72, (Integer) null, this.A01.A04(r82), 10));
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("loading-");
            A0u.append(r82);
            C1035155t.A00(r72, AnonymousClass000.A0q("-1", A0u), r32);
            StringBuilder A0v = AnonymousClass000.A0v("loading-");
            A0v.append(r82);
            C1035155t.A00(r72, AnonymousClass000.A0q("-2", A0v), r32);
            StringBuilder A0v2 = AnonymousClass000.A0v("loading-");
            A0v2.append(r82);
            C1035155t.A00(r72, AnonymousClass000.A0q("-3", A0v2), r32);
            StringBuilder A0v3 = AnonymousClass000.A0v("loading-");
            A0v3.append(r82);
            C1035155t.A00(r72, AnonymousClass000.A0q("-4", A0v3), r32);
            A0z.add(AnonymousClass03S.A00(r32));
        }
        this.A07 = AnonymousClass03U.A07(A0z);
        List<C125415zs> list = this.A00;
        ArrayList A0z2 = C36351kA.A0z(list);
        for (C125415zs avatarOnDemandStickerCategory : list) {
            C116335kQ r111 = this.A0D;
            A0z2.add(new AvatarOnDemandStickerCategory(avatarOnDemandStickerCategory, AnonymousClass1U1.A2P(r111.A00.A01), (C23871Ae) r111.A00.A00.A0V.get(), AnonymousClass1BE.A00()));
        }
        this.A06 = A0z2;
        C15330nA r2 = new C15330nA(new AvatarExpressionsDataFlow$all$1(this, (C023509x) null));
        AvatarExpressionsDataFlow$all$2 avatarExpressionsDataFlow$all$2 = new AvatarExpressionsDataFlow$all$2(this, (C023509x) null);
        C06830Vg r02 = C06830Vg.$redex_init_class;
        this.A0A = new C18510tH((C009003v) new AvatarExpressionsDataFlow$all$3(this, (C023509x) null), (AnonymousClass05H) new C18500tG(new C18510tH((C009003v) avatarExpressionsDataFlow$all$2, (AnonymousClass05H) r2, 4), 1), 1);
        this.A0B = A00(false);
        this.A0C = A00(true);
        C164487rt r52 = new C164487rt(this, this.A05.A07, 4);
        this.A0J = C07360Xi.A01(C023409w.A00, this.A0I, r52, new C13120jC(0));
    }
}
