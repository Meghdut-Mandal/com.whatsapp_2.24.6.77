package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader;

/* renamed from: X.3Sk  reason: invalid class name and case insensitive filesystem */
public final class C65523Sk {
    public C22927Ayd A00;
    public C22928Aye A01;
    public C22929Ayf A02;
    public C22930Ayg A03;
    public C22931Ayh A04;
    public final Context A05;
    public final C27731Pn A06;
    public final C89004Uw A07;
    public final AnonymousClass2bI A08;
    public final AnonymousClass3OV A09;
    public final AnonymousClass3OW A0A;
    public final AnonymousClass3OX A0B;
    public final C57112xi A0C;
    public final C57122xj A0D;
    public final C61353Bn A0E;
    public final C57132xk A0F;
    public final C57142xl A0G;
    public final C61363Bo A0H;
    public final C57202xr A0I;
    public final AnonymousClass3OY A0J;
    public final AnonymousClass1T1 A0K;
    public final AnonymousClass1LV A0L;
    public final C20230xE A0M;
    public final AnonymousClass16D A0N;
    public final AnonymousClass1RY A0O;
    public final AnonymousClass1A5 A0P;

    public static final CommunityPhotoHeader A00(Context context, AnonymousClass1RY r5, AnonymousClass141 r6) {
        AnonymousClass00C.A0D(r5, 1);
        CommunityPhotoHeader communityPhotoHeader = new CommunityPhotoHeader(context, (AttributeSet) null, 0);
        r5.A04(communityPhotoHeader, new C53982sD(communityPhotoHeader, 5), r6, C36391kE.A06(communityPhotoHeader));
        return communityPhotoHeader;
    }

    public static final C38831qD A01(Context context, AnonymousClass1RY r6, AnonymousClass141 r7, AnonymousClass141 r8) {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        AnonymousClass00C.A0D(r6, 3);
        C38831qD r4 = new C38831qD(context);
        GroupPhotoHeader groupPhotoHeader = r4.A02;
        if (groupPhotoHeader != null) {
            if (C36401kF.A1X(r4.getWhatsAppLocale())) {
                scaleType2 = ImageView.ScaleType.FIT_START;
            } else {
                scaleType2 = ImageView.ScaleType.FIT_END;
            }
            groupPhotoHeader.setScaleType(scaleType2);
            groupPhotoHeader.A04(r7, r6);
        }
        WaImageView waImageView = r4.A00;
        if (waImageView != null) {
            C36321k7.A0L(r4.getContext(), waImageView, r4.getWhatsAppLocale(), R.drawable.ic_arrow);
        }
        CommunityPhotoHeader communityPhotoHeader = r4.A01;
        if (communityPhotoHeader != null) {
            if (C36401kF.A1X(r4.getWhatsAppLocale())) {
                scaleType = ImageView.ScaleType.FIT_END;
            } else {
                scaleType = ImageView.ScaleType.FIT_START;
            }
            communityPhotoHeader.setScaleType(scaleType);
            r6.A04(communityPhotoHeader, new C53982sD(communityPhotoHeader, 5), r8, C36391kE.A06(communityPhotoHeader));
        }
        return r4;
    }

    public static final GroupPhotoHeader A02(Context context, AnonymousClass1RY r4, AnonymousClass141 r5) {
        AnonymousClass00C.A0D(r4, 2);
        GroupPhotoHeader groupPhotoHeader = new GroupPhotoHeader(context, (AttributeSet) null, 0);
        groupPhotoHeader.A04(r5, r4);
        return groupPhotoHeader;
    }

    public static void A03(Context context, AnonymousClass3OX r3, C22929Ayf ayf, C65523Sk r5, AnonymousClass2bI r6) {
        r5.A02 = ayf;
        C27121Mz r0 = r3.A00;
        C27111My A022 = r0.A00;
        AnonymousClass24E A002 = AnonymousClass3OX.A00(context, (AnonymousClass1T1) r0.A01.A8V.get(), r6);
        A022.AAT(A002);
        r5.A04 = A002;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.2ml} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.Aye} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.Aye} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: X.3YF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: X.2mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: X.2mn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: X.2mk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: X.2mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: X.3YT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: X.2mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: X.3YT} */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.2mh] */
    /* JADX WARNING: type inference failed for: r1v34, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: type inference failed for: r3v8, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r3v11, types: [X.2mh] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65523Sk(android.content.Context r25, X.AnonymousClass3OV r26, X.AnonymousClass3OW r27, X.AnonymousClass3OX r28, X.C57112xi r29, X.C57122xj r30, X.C61353Bn r31, X.C57132xk r32, X.C57142xl r33, X.C61363Bo r34, X.C57202xr r35, X.AnonymousClass3OY r36, X.AnonymousClass1T1 r37, X.AnonymousClass1LV r38, X.C20230xE r39, X.AnonymousClass16D r40, X.C27731Pn r41, X.C89004Uw r42, X.AnonymousClass1A5 r43, X.AnonymousClass2bI r44) {
        /*
            r24 = this;
            r8 = 1
            r7 = r37
            r6 = r39
            int r16 = X.C36361kB.A04(r6, r7, r8)
            r1 = 3
            r5 = r41
            r0 = r40
            r15 = r38
            X.C36321k7.A17(r15, r5, r0, r1)
            r2 = r43
            r22 = r29
            r13 = r28
            r14 = r27
            r23 = r26
            r3 = r22
            r1 = r23
            X.C36321k7.A1C(r2, r1, r14, r13, r3)
            r3 = 11
            r21 = r30
            r1 = r21
            X.AnonymousClass00C.A0D(r1, r3)
            r18 = r35
            r11 = r34
            r19 = r33
            r20 = r32
            r12 = r31
            r4 = r20
            r3 = r19
            r1 = r18
            X.C36321k7.A1D(r12, r4, r3, r11, r1)
            r10 = r36
            r9 = r25
            X.C36361kB.A1M(r10, r9)
            r1 = 20
            r3 = r42
            X.AnonymousClass00C.A0D(r3, r1)
            r4 = r24
            r4.<init>()
            r4.A0M = r6
            r4.A0K = r7
            r4.A0L = r15
            r4.A06 = r5
            r4.A0N = r0
            r4.A0P = r2
            r1 = r23
            r4.A09 = r1
            r4.A0A = r14
            r4.A0B = r13
            r1 = r22
            r4.A0C = r1
            r1 = r21
            r4.A0D = r1
            r4.A0E = r12
            r1 = r20
            r4.A0F = r1
            r1 = r19
            r4.A0G = r1
            r4.A0H = r11
            r1 = r18
            r4.A0I = r1
            r4.A0J = r10
            r4.A05 = r9
            r5 = r44
            r4.A08 = r5
            r4.A07 = r3
            android.app.Activity r2 = X.C18860tw.A00(r9)
            boolean r1 = r2 instanceof X.C87434Ou
            if (r1 == 0) goto L_0x031b
            X.4Ou r2 = (X.C87434Ou) r2
            X.1RY r7 = r2.getContactPhotosLoader()
        L_0x0097:
            X.AnonymousClass00C.A0B(r7)
            r4.A0O = r7
            int r2 = r5.A00
            r1 = 139(0x8b, float:1.95E-43)
            if (r2 != r1) goto L_0x0313
            r2 = r5
            X.8ny r2 = (X.C181748ny) r2
            X.3Sl r1 = X.AnonymousClass147.A01
            r1 = r16
            com.whatsapp.jid.GroupJid r1 = r2.A1b(r1)
        L_0x00ad:
            X.147 r6 = X.C65533Sl.A03(r1)
            boolean r1 = r5 instanceof X.C181738nx
            r3 = 0
            if (r1 == 0) goto L_0x030b
            r1 = r5
            X.8ny r1 = (X.C181748ny) r1
            com.whatsapp.jid.GroupJid r1 = r1.A1b(r8)
            X.147 r2 = X.C65533Sl.A03(r1)
            if (r2 == 0) goto L_0x030c
            if (r6 == 0) goto L_0x030c
            X.147 r17 = r15.A02(r6)
        L_0x00c9:
            X.141 r1 = r0.A0D(r2)
        L_0x00cd:
            if (r6 == 0) goto L_0x0308
            X.141 r0 = r0.A0D(r6)
        L_0x00d3:
            boolean r15 = r5 instanceof X.C181298nF
            if (r15 == 0) goto L_0x00f7
            com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader r0 = A00(r9, r7, r1)
            A03(r9, r13, r0, r4, r5)
            X.24C r0 = r14.A01(r9, r5)
            r4.A00 = r0
            if (r6 == 0) goto L_0x00f2
            r12 = 6
            r13 = 1
            r7 = r23
            r8 = r9
            r9 = r6
            r10 = r2
            r11 = r5
            X.2mh r3 = r7.A01(r8, r9, r10, r11, r12, r13)
        L_0x00f2:
            X.Aye r3 = (X.C22928Aye) r3
            r4.A01 = r3
        L_0x00f6:
            return
        L_0x00f7:
            boolean r15 = r5 instanceof X.C181318nH
            if (r15 != 0) goto L_0x020d
            boolean r15 = r5 instanceof X.C181338nJ
            if (r15 != 0) goto L_0x020d
            boolean r15 = r5 instanceof X.C181328nI
            if (r15 != 0) goto L_0x020d
            boolean r15 = r5 instanceof X.C181308nG
            if (r15 == 0) goto L_0x0135
            com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader r0 = A00(r9, r7, r1)
            A03(r9, r13, r0, r4, r5)
            X.1pG r0 = r12.A00(r9, r5)
            r4.A00 = r0
            if (r1 == 0) goto L_0x011c
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r3 = r1.A06(r0)
        L_0x011c:
            X.2ml r7 = new X.2ml
            r7.<init>(r9)
            if (r3 == 0) goto L_0x0130
            r10 = 6
            X.3YT r0 = new X.3YT
            r8 = r3
            r9 = r5
            r5 = r0
            r6 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r7.setOnClickListener(r0)
        L_0x0130:
            X.Aye r7 = (X.C22928Aye) r7
            r4.A01 = r7
            return
        L_0x0135:
            boolean r15 = r5 instanceof X.C181268nC
            if (r15 != 0) goto L_0x0201
            boolean r15 = r5 instanceof X.C181278nD
            if (r15 != 0) goto L_0x0201
            boolean r15 = r5 instanceof X.C181258nB
            if (r15 == 0) goto L_0x017b
            X.1qD r0 = A01(r9, r7, r0, r1)
            A03(r9, r13, r0, r4, r5)
            X.1pG r0 = r12.A00(r9, r5)
            r4.A00 = r0
            X.2mn r7 = new X.2mn
            r7.<init>(r9)
            X.0wQ r1 = r7.getMeManager()
            X.11F r0 = r5.A0J()
            boolean r1 = r1.A0M(r0)
            r0 = 2131893752(0x7f121df8, float:1.942229E38)
            if (r1 == 0) goto L_0x0167
            r0 = 2131893750(0x7f121df6, float:1.9422285E38)
        L_0x0167:
            r7.setText(r0)
            if (r2 == 0) goto L_0x0130
            r13 = 5
            X.3YT r1 = new X.3YT
            r12 = r2
            r8 = r1
            r9 = r2
            r10 = r7
            r11 = r5
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0177:
            r7.setOnClickListener(r1)
            goto L_0x0130
        L_0x017b:
            boolean r1 = r5 instanceof X.C181288nE
            if (r1 == 0) goto L_0x0193
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r0 = A02(r9, r7, r0)
            A03(r9, r13, r0, r4, r5)
            X.2mm r7 = new X.2mm
            r7.<init>(r9)
            r0 = 45
            X.3YF r1 = new X.3YF
            r1.<init>(r5, r7, r0)
            goto L_0x0177
        L_0x0193:
            boolean r1 = r5 instanceof X.C181358nL
            if (r1 == 0) goto L_0x01cf
            if (r0 == 0) goto L_0x01cd
            X.AnonymousClass00C.A0D(r7, r8)
            X.2F0 r2 = new X.2F0
            r2.<init>(r9)
            r1 = r16
            r2.setSubgroupProfilePhoto(r0, r1, r7)
        L_0x01a6:
            A03(r9, r13, r2, r4, r5)
            X.24C r0 = r14.A01(r9, r5)
            r4.A00 = r0
            if (r6 == 0) goto L_0x00f2
            r0 = r21
            X.1Mz r0 = r0.A00
            X.1My r0 = r0.A00
            X.004 r0 = r0.A0r
            java.lang.Object r0 = r0.get()
            X.3OV r0 = (X.AnonymousClass3OV) r0
            X.3fD r3 = new X.3fD
            r7 = r3
            r8 = r9
            r9 = r0
            r10 = r6
            r11 = r17
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x00f2
        L_0x01cd:
            r2 = r3
            goto L_0x01a6
        L_0x01cf:
            boolean r1 = r5 instanceof X.C181498nZ
            if (r1 == 0) goto L_0x0223
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r0 = A02(r9, r7, r0)
            A03(r9, r13, r0, r4, r5)
            r0 = r5
            X.8ny r0 = (X.C181748ny) r0
            int r0 = r0.A1a()
            if (r0 != r8) goto L_0x01fc
            X.24C r0 = r14.A01(r9, r5)
        L_0x01e7:
            r4.A00 = r0
            if (r6 == 0) goto L_0x00f2
            r20 = 0
            r19 = 6
            r14 = r23
            r15 = r9
            r16 = r6
            r18 = r5
            X.2mh r3 = r14.A01(r15, r16, r17, r18, r19, r20)
            goto L_0x00f2
        L_0x01fc:
            X.1pG r0 = r12.A00(r9, r5)
            goto L_0x01e7
        L_0x0201:
            X.1qD r0 = A01(r9, r7, r0, r1)
            A03(r9, r13, r0, r4, r5)
            X.1pG r0 = r12.A00(r9, r5)
            goto L_0x023d
        L_0x020d:
            com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader r0 = A00(r9, r7, r1)
            A03(r9, r13, r0, r4, r5)
            X.1pG r0 = r12.A00(r9, r5)
            r4.A00 = r0
            X.2ml r7 = new X.2ml
            r7.<init>(r9)
            if (r2 == 0) goto L_0x0130
            r13 = 6
            goto L_0x0247
        L_0x0223:
            boolean r1 = r5 instanceof X.C181488nY
            if (r1 == 0) goto L_0x025a
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r0 = A02(r9, r7, r0)
            A03(r9, r13, r0, r4, r5)
            r0 = r5
            X.8ny r0 = (X.C181748ny) r0
            int r0 = r0.A1a()
            if (r0 != 0) goto L_0x0255
            X.1pG r0 = r12.A00(r9, r5)
        L_0x023b:
            X.Ayd r0 = (X.C22927Ayd) r0
        L_0x023d:
            r4.A00 = r0
            X.2mk r7 = new X.2mk
            r7.<init>(r9)
            if (r2 == 0) goto L_0x0130
            r13 = 4
        L_0x0247:
            X.3YT r8 = new X.3YT
            r11 = r2
            r9 = r2
            r10 = r7
            r12 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r7.setOnClickListener(r8)
            goto L_0x0130
        L_0x0255:
            X.24C r0 = r14.A01(r9, r5)
            goto L_0x023b
        L_0x025a:
            boolean r1 = r5 instanceof X.AnonymousClass2cQ
            if (r1 == 0) goto L_0x029a
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r0 = A02(r9, r7, r0)
            A03(r9, r13, r0, r4, r5)
            if (r6 == 0) goto L_0x00f6
            r0 = r19
            X.1Mz r0 = r0.A00
            X.1My r2 = r0.A00
            X.004 r0 = r2.A0y
            java.lang.Object r1 = r0.get()
            X.2xm r1 = (X.C57152xm) r1
            X.2Is r0 = new X.2Is
            r0.<init>(r9, r1, r6)
            X.AnonymousClass3LU.A00(r2, r0)
            r4.A03 = r0
            X.1pH r0 = r11.A00(r9, r6)
            r4.A00 = r0
            r0 = r22
            X.1Mz r0 = r0.A00
            X.1My r0 = r0.A00
            X.004 r0 = r0.A0r
            java.lang.Object r0 = r0.get()
            X.3OV r0 = (X.AnonymousClass3OV) r0
            X.3fB r7 = new X.3fB
            r7.<init>(r9, r0, r6, r5)
            goto L_0x0130
        L_0x029a:
            boolean r1 = r5 instanceof X.C181428nS
            if (r1 == 0) goto L_0x02d6
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r0 = A02(r9, r7, r0)
            A03(r9, r13, r0, r4, r5)
            if (r6 == 0) goto L_0x00f6
            X.11F r0 = r5.A0J()
            X.2It r0 = r10.A01(r9, r0, r6)
            r4.A03 = r0
            X.1pH r0 = r11.A00(r9, r6)
            r4.A00 = r0
            r0 = r20
            X.1Mz r2 = r0.A00
            X.1My r0 = r2.A00
            X.004 r0 = r0.A0r
            java.lang.Object r1 = r0.get()
            X.3OV r1 = (X.AnonymousClass3OV) r1
            X.0tq r0 = r2.A01
            X.1A5 r10 = X.C36371kC.A0X(r0)
            X.3fE r7 = new X.3fE
            r8 = r9
            r9 = r1
            r11 = r6
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0130
        L_0x02d6:
            boolean r1 = r5 instanceof X.C181448nU
            if (r1 == 0) goto L_0x00f6
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r0 = A02(r9, r7, r0)
            A03(r9, r13, r0, r4, r5)
            if (r6 == 0) goto L_0x00f6
            X.11F r0 = r5.A0J()
            X.2It r0 = r10.A01(r9, r0, r6)
            r4.A03 = r0
            X.1pH r0 = r11.A00(r9, r6)
            r4.A00 = r0
            r0 = r18
            X.1Mz r0 = r0.A00
            X.1My r0 = r0.A00
            X.004 r0 = r0.A0r
            java.lang.Object r0 = r0.get()
            X.3OV r0 = (X.AnonymousClass3OV) r0
            X.3fC r7 = new X.3fC
            r7.<init>(r9, r0, r6, r5)
            goto L_0x0130
        L_0x0308:
            r0 = r3
            goto L_0x00d3
        L_0x030b:
            r2 = r3
        L_0x030c:
            r17 = r3
            if (r2 != 0) goto L_0x00c9
            r1 = r3
            goto L_0x00cd
        L_0x0313:
            X.3Sl r1 = X.AnonymousClass147.A01
            X.3Qa r1 = r5.A1J
            X.11F r1 = r1.A00
            goto L_0x00ad
        L_0x031b:
            X.1Pn r2 = r4.A06
            java.lang.String r1 = "context-card"
            X.1RY r7 = r2.A05(r9, r1)
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65523Sk.<init>(android.content.Context, X.3OV, X.3OW, X.3OX, X.2xi, X.2xj, X.3Bn, X.2xk, X.2xl, X.3Bo, X.2xr, X.3OY, X.1T1, X.1LV, X.0xE, X.16D, X.1Pn, X.4Uw, X.1A5, X.2bI):void");
    }
}
