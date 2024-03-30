package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.community.suspend.CommunitySuspendDialogFragment;
import com.whatsapp.group.SuggestGroupRouter;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: X.1Sq  reason: invalid class name and case insensitive filesystem */
public final class C28431Sq implements C20230xE {
    public final C19460v5 A00;
    public final C24801Dv A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass1LV A03;
    public final C28391Sm A04;
    public final AnonymousClass1Sk A05;
    public final AnonymousClass171 A06;
    public final C21060yb A07;
    public final AnonymousClass17X A08;
    public final C19890wg A09;
    public final C28421Sp A0A;
    public final C19600wD A0B;
    public final AnonymousClass16D A0C;
    public final C19970wo A0D;
    public final C220412q A0E;
    public final C20810yC A0F;
    public final AnonymousClass1EL A0G;
    public final C28441Sr A0H;
    public final C19770wU A0I;

    public C28431Sq(C19460v5 r21, C24801Dv r22, AnonymousClass17Y r23, AnonymousClass1LV r24, C28391Sm r25, C28421Sp r26, AnonymousClass1Sk r27, C19600wD r28, AnonymousClass16D r29, AnonymousClass171 r30, C21060yb r31, C19970wo r32, C220412q r33, AnonymousClass17X r34, C20810yC r35, AnonymousClass1EL r36, C28441Sr r37, C19890wg r38, C19770wU r39) {
        C19970wo r15 = r32;
        AnonymousClass00C.A0D(r15, 1);
        C20810yC r0 = r35;
        AnonymousClass00C.A0D(r0, 2);
        AnonymousClass17Y r17 = r23;
        AnonymousClass00C.A0D(r17, 3);
        C19770wU r2 = r39;
        AnonymousClass00C.A0D(r2, 4);
        C220412q r14 = r33;
        AnonymousClass00C.A0D(r14, 5);
        C24801Dv r18 = r22;
        AnonymousClass00C.A0D(r18, 6);
        C19460v5 r19 = r21;
        AnonymousClass00C.A0D(r19, 7);
        C21060yb r7 = r31;
        AnonymousClass00C.A0D(r7, 8);
        AnonymousClass16D r13 = r29;
        AnonymousClass00C.A0D(r13, 9);
        AnonymousClass171 r8 = r30;
        AnonymousClass00C.A0D(r8, 10);
        C28441Sr r4 = r37;
        AnonymousClass00C.A0D(r4, 11);
        AnonymousClass1EL r5 = r36;
        AnonymousClass00C.A0D(r5, 12);
        AnonymousClass1LV r16 = r24;
        AnonymousClass00C.A0D(r16, 13);
        C28391Sm r12 = r25;
        AnonymousClass00C.A0D(r12, 14);
        AnonymousClass1Sk r10 = r27;
        AnonymousClass00C.A0D(r10, 15);
        C28421Sp r11 = r26;
        AnonymousClass00C.A0D(r11, 16);
        AnonymousClass17X r6 = r34;
        AnonymousClass00C.A0D(r6, 17);
        C19890wg r3 = r38;
        AnonymousClass00C.A0D(r3, 18);
        C19600wD r9 = r28;
        AnonymousClass00C.A0D(r9, 19);
        this.A0D = r15;
        this.A0F = r0;
        this.A02 = r17;
        this.A0I = r2;
        this.A0E = r14;
        this.A01 = r18;
        this.A00 = r19;
        this.A07 = r7;
        this.A0C = r13;
        this.A06 = r8;
        this.A0H = r4;
        this.A0G = r5;
        this.A03 = r16;
        this.A04 = r12;
        this.A05 = r10;
        this.A0A = r11;
        this.A08 = r6;
        this.A09 = r3;
        this.A0B = r9;
    }

    public void A02(AnonymousClass01L r10, AnonymousClass147 r11, Integer num) {
        Intent A0c;
        AnonymousClass00C.A0D(r10, 0);
        AnonymousClass00C.A0D(r11, 1);
        Resources resources = r10.getResources();
        AnonymousClass00C.A08(resources);
        AnonymousClass1LV r7 = this.A03;
        int size = r7.A08.A02(r11).size();
        C20810yC r1 = r7.A06;
        C21000yV r2 = C21000yV.A02;
        int A002 = C20800yB.A00(r2, r1, 1238) + 1;
        if (size >= A002) {
            this.A02.A0K(resources.getQuantityString(R.plurals.f10nameremoved, A002, new Object[]{Integer.valueOf(A002)}), 1);
        } else if (r7.A05.A0D(r11) || C20800yB.A01(r2, this.A0F, 5077)) {
            if (num != null) {
                A0c = AnonymousClass190.A0c(r10, r11).putExtra("group_create_entry_point", num.intValue());
            } else {
                A0c = AnonymousClass190.A0c(r10, r11);
            }
            AnonymousClass00C.A0B(A0c);
            C05290Pd.A00(r10, A0c, (Bundle) null);
        } else {
            A03(r10, r11, num);
        }
    }

    public final void A03(AnonymousClass01L r8, AnonymousClass147 r9, Integer num) {
        int i;
        AnonymousClass02E A002;
        AnonymousClass00C.A0D(r9, 1);
        AnonymousClass1LV r3 = this.A03;
        boolean z = false;
        C20810yC r1 = r3.A06;
        C21000yV r6 = C21000yV.A02;
        if (C20800yB.A01(r6, r1, 4184) && !r3.A0J(r9)) {
            z = true;
            if (!this.A0B.A09()) {
                C39001qm A003 = AnonymousClass3LW.A00(r8);
                A003.A0p(r8.getString(R.string.f12nameremoved));
                A003.A0m(r8, (AnonymousClass04S) null, R.string.f12nameremoved);
                A003.A0b();
                return;
            }
        }
        AnonymousClass09Y r5 = new AnonymousClass09Y(r8.getSupportFragmentManager());
        int i2 = -1;
        if (z) {
            if (num != null) {
                i2 = num.intValue();
            }
            A002 = new SuggestGroupRouter();
            Bundle bundle = new Bundle();
            bundle.putString("parent_group", r9.getRawString());
            bundle.putInt("entry_point", i2);
            A002.A17(bundle);
        } else {
            ArrayList arrayList = new ArrayList();
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            A002 = AnonymousClass3OQ.A00(r9, arrayList, i, C20800yB.A01(r6, this.A0F, 3966));
        }
        r5.A0D(A002, (String) null);
        r5.A04();
    }

    public void BNz(Context context, String str) {
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00C.A0D(str, 1);
        C24801Dv r2 = this.A01;
        Intent A032 = AnonymousClass190.A03(context);
        A032.putExtra("snackbar_message", str);
        A032.setFlags(67108864);
        r2.A06(context, A032);
    }

    public void Bkv(Context context, View view, GroupJid groupJid) {
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00C.A0D(groupJid, 1);
        AnonymousClass00C.A0D(view, 2);
        AnonymousClass01I r4 = (AnonymousClass01I) C24801Dv.A01(context, AnonymousClass01L.class);
        A01(view, r4.getSupportFragmentManager(), r4, groupJid, new C35321iV(this, view, groupJid, 20));
    }

    public void Bkw(View view, AnonymousClass02E r9, GroupJid groupJid) {
        AnonymousClass00C.A0D(groupJid, 1);
        AnonymousClass01z A0k = r9.A0k();
        View view2 = view;
        A01(view2, A0k, r9, groupJid, new C35321iV(this, view, groupJid, 24));
    }

    public void Bkx(Context context, View view, GroupJid groupJid) {
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00C.A0D(groupJid, 1);
        AnonymousClass00C.A0D(view, 2);
        AnonymousClass01I r4 = (AnonymousClass01I) C24801Dv.A01(context, AnonymousClass01L.class);
        A01(view, r4.getSupportFragmentManager(), r4, groupJid, new C35321iV(this, view, groupJid, 23));
    }

    public void Bky(Context context, View view, AnonymousClass147 r10) {
        AnonymousClass00C.A0D(context, 0);
        View view2 = view;
        AnonymousClass00C.A0D(view, 2);
        if (r10 != null) {
            AnonymousClass01I r4 = (AnonymousClass01I) C24801Dv.A01(context, AnonymousClass01L.class);
            AnonymousClass147 A022 = this.A03.A02(r10);
            if (A022 != null) {
                A01(view2, r4.getSupportFragmentManager(), r4, A022, new C35321iV(this, view, A022, 21));
            }
        }
    }

    public boolean Bkz(Context context, View view, GroupJid groupJid) {
        AnonymousClass00C.A0D(view, 2);
        int A002 = A00(groupJid);
        if (A002 == 0 || A002 == 1 || A002 == 2) {
            return false;
        }
        Context context2 = view.getContext();
        AnonymousClass00C.A08(context2);
        this.A01.A06(context2, AnonymousClass190.A0d(context2, groupJid, 1));
        return true;
    }

    public void Bl1(View view, AnonymousClass02E r9, GroupJid groupJid) {
        AnonymousClass00C.A0D(groupJid, 1);
        AnonymousClass01z A0k = r9.A0k();
        View view2 = view;
        A01(view2, A0k, r9, groupJid, new C35321iV(this, view, groupJid, 19));
    }

    public void Bl2(Context context, AnonymousClass11F r6, int i) {
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00C.A0D(r6, 1);
        Intent putExtra = AnonymousClass190.A0F(context, 0).putExtra("jid", r6.getRawString()).putExtra("start_t", SystemClock.uptimeMillis());
        AnonymousClass00C.A08(putExtra);
        if (i == 5) {
            putExtra.setFlags(67108864);
        }
        AnonymousClass3M9.A01(putExtra, "CommunityHomeActivity:onClickConversation");
        this.A0H.A00();
        if (context instanceof AnonymousClass158) {
            ((AnonymousClass158) context).BNy(putExtra);
        } else {
            context.startActivity(putExtra);
        }
        Parcelable.Creator creator = AnonymousClass147.CREATOR;
        AnonymousClass147 A032 = C65533Sl.A03(r6);
        if (A032 != null) {
            this.A0I.Boy(new C35261iP((Object) this, i, 8, (Object) A032));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r1 == false) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bl4(X.AnonymousClass11F r10, X.AnonymousClass4SI r11, java.lang.String r12, int r13) {
        /*
            r9 = this;
            r3 = 0
            r5 = 0
            r0 = 1
            X.AnonymousClass00C.A0D(r10, r0)
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.147 r4 = X.C65533Sl.A03(r10)
            if (r4 == 0) goto L_0x001e
            X.1LV r6 = r9.A03
            X.147 r2 = r6.A02(r4)
            if (r2 != 0) goto L_0x001f
            X.17Y r1 = r9.A02
            r0 = 2131894704(0x7f1221b0, float:1.942422E38)
            r1.A04(r0, r5)
        L_0x001e:
            return
        L_0x001f:
            X.0wU r5 = r9.A0I
            r1 = 7
            X.1iP r0 = new X.1iP
            r0.<init>((java.lang.Object) r9, (int) r13, (int) r1, (java.lang.Object) r4)
            r5.Boy(r0)
            X.147 r7 = X.C65533Sl.A03(r2)
            X.147 r5 = X.C65533Sl.A03(r4)
            if (r7 == 0) goto L_0x00b2
            X.17d r0 = r6.A08
            X.3QK r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x0096
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r1 = X.AnonymousClass00C.A0J(r0, r5)
        L_0x0042:
            if (r5 == 0) goto L_0x004b
            X.12q r0 = r6.A02
            boolean r0 = r0.A0O(r5)
            r1 = r1 | r0
        L_0x004b:
            if (r1 == 0) goto L_0x0060
            r5 = 3
        L_0x004e:
            java.lang.Integer r0 = X.AnonymousClass1Sk.A00(r13)
            if (r0 == 0) goto L_0x001e
            int r0 = r0.intValue()
            com.whatsapp.community.JoinGroupBottomSheetFragment r0 = com.whatsapp.community.JoinGroupBottomSheetFragment.A03(r2, r4, r0, r5)
            r11.B04(r0, r3)
            return
        L_0x0060:
            X.0yC r8 = r6.A06
            r1 = 5021(0x139d, float:7.036E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r8, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0094
            if (r7 == 0) goto L_0x0088
            X.17d r0 = r6.A08
            r0.A03()
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = r0.get(r7)
            X.3Nc r0 = (X.C64213Nc) r0
            if (r0 == 0) goto L_0x0088
            X.3QK r0 = r0.A01
            if (r0 == 0) goto L_0x0088
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r1 = X.AnonymousClass00C.A0J(r0, r5)
        L_0x0088:
            if (r5 == 0) goto L_0x0091
            X.12q r0 = r6.A02
            boolean r0 = r0.A0S(r5)
            r1 = r1 | r0
        L_0x0091:
            r5 = 6
            if (r1 != 0) goto L_0x004e
        L_0x0094:
            r5 = 2
            goto L_0x004e
        L_0x0096:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CommunityChatManager/attempting to check SubgroupCache for missing CAG, gid:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; parent: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00b2:
            r1 = 0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28431Sq.Bl4(X.11F, X.4SI, java.lang.String, int):void");
    }

    public void Bu8(AnonymousClass01z r5, AnonymousClass147 r6, Callable callable) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass1Sk r2 = this.A05;
        AnonymousClass2PP r1 = new AnonymousClass2PP();
        r1.A02 = r6.user;
        r1.A01 = 1;
        r1.A00 = 1;
        r2.A05.Bly(r1);
        try {
            AnonymousClass09Y r22 = new AnonymousClass09Y(r5);
            r22.A0D((AnonymousClass02E) callable.call(), "SUBGROUP_PICKER_TAG");
            r22.A02();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommunityNavigator/showSwitchSubGroupBottomSheet ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public void BuY(Context context, int i, int i2) {
        AnonymousClass00C.A0D(context, 0);
        BuZ(context, (AnonymousClass147) null, i, i2);
    }

    private final int A00(GroupJid groupJid) {
        if (this.A0E.A0R(groupJid)) {
            return 1;
        }
        Parcelable.Creator creator = AnonymousClass147.CREATOR;
        AnonymousClass147 A032 = C65533Sl.A03(groupJid);
        if (A032 == null) {
            return 0;
        }
        if (this.A0G.A00(this.A0C.A0D(A032))) {
            return 4;
        }
        C26831Lr r3 = this.A03.A09;
        if (r3.A01.A01(new C65893Tw(r3, 4), A032).size() > 0) {
            return 3;
        }
        return 2;
    }

    public CommunitySuspendDialogFragment B9v() {
        return new CommunitySuspendDialogFragment();
    }

    public void Bl0(Context context, View view, GroupJid groupJid) {
        AnonymousClass01I r4 = (AnonymousClass01I) C24801Dv.A01(context, AnonymousClass01L.class);
        A01(view, r4.getSupportFragmentManager(), r4, groupJid, new C35321iV(this, view, groupJid, 22));
    }

    public void BuZ(Context context, AnonymousClass147 r10, int i, int i2) {
        C28421Sp r1 = this.A0A;
        Integer valueOf = Integer.valueOf(i2);
        r1.A01 = null;
        r1.A00 = null;
        r1.A00 = valueOf;
        String obj = UUID.randomUUID().toString();
        r1.A01 = obj;
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.String");
        this.A05.A08(valueOf, (Long) null, obj, (String) null, 1, i);
        Integer valueOf2 = Integer.valueOf(i);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.NewCommunityActivity");
        if (r10 != null) {
            intent.putExtra("NewCommunityActivity_group_to_be_added", r10.getRawString());
        }
        if (valueOf2 != null) {
            intent.putExtra("NewCommunityActivity_current_screen", valueOf2);
        }
        C24801Dv.A00(context).startActivity(intent);
    }

    private final void A01(View view, AnonymousClass01z r10, AnonymousClass012 r11, GroupJid groupJid, Runnable runnable) {
        String string;
        int A002 = A00(groupJid);
        if (A002 == 0) {
            return;
        }
        if (A002 == 1) {
            String string2 = view.getContext().getString(R.string.f12nameremoved);
            AnonymousClass00C.A08(string2);
            C99304t3 A012 = C99304t3.A01(view, string2, 0);
            A012.A0X(AnonymousClass00F.A00(view.getContext(), C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
            List emptyList = Collections.emptyList();
            AnonymousClass00C.A08(emptyList);
            new AnonymousClass3ZU(r11, A012, this.A07, emptyList, false).A02();
        } else if (A002 == 2) {
            Context context = view.getContext();
            AnonymousClass00C.A0B(context);
            AnonymousClass00C.A0D(context, 0);
            String A0U = this.A06.A0U(groupJid);
            if (A0U != null) {
                string = context.getString(R.string.f12nameremoved, new Object[]{A0U});
            } else {
                string = context.getString(R.string.f12nameremoved);
            }
            AnonymousClass00C.A0B(string);
            CharSequence A082 = AnonymousClass6YV.A08(this.A07, this.A09, string);
            if (A082 != null) {
                AnonymousClass3P9 r0 = new AnonymousClass3P9();
                r0.A08 = A082;
                r0.A02().A1f(r10, (String) null);
            }
            if (C20800yB.A01(C21000yV.A02, this.A0F, 6774)) {
                Log.e("CommunityNavigator/checkIfStillParticipatingInCommunity/Not participating");
                this.A0I.Boy(new C35651j2(this, groupJid, 23));
            }
        } else if (A002 != 3) {
            Context context2 = view.getContext();
            AnonymousClass00C.A08(context2);
            this.A01.A06(context2, AnonymousClass190.A0i(context2, groupJid, false));
        } else {
            runnable.run();
        }
    }
}
