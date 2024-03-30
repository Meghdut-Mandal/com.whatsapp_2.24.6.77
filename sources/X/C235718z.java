package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment;
import com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment;
import com.whatsapp.chatlock.dialogs.helperflow.ChatLockHelperBottomSheet;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.18z  reason: invalid class name and case insensitive filesystem */
public final class C235718z {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass1J4 A04;
    public final AnonymousClass196 A05;
    public final C220412q A06;
    public final C236419g A07;
    public final C20810yC A08;
    public final C19770wU A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;
    public final AnonymousClass005 A0C;
    public final AnonymousClass005 A0D;
    public final AnonymousClass005 A0E;
    public final AnonymousClass005 A0F;
    public final AnonymousClass005 A0G;
    public final AnonymousClass005 A0H;
    public final C19730wQ A0I;
    public final C19630wG A0J;
    public final AnonymousClass190 A0K;
    public final AnonymousClass13J A0L;
    public final AnonymousClass005 A0M;
    public final AnonymousClass005 A0N;
    public final AnonymousClass005 A0O;
    public final AnonymousClass004 A0P;
    public final AnonymousClass004 A0Q;
    public final boolean A0R = C19550w8.A01();

    public static final Set A00(C235718z r4, AnonymousClass11F r5) {
        r4.A0F(r5, false);
        ((C20310xM) r4.A0P.get()).A0d(r5, (Long) null, false, true);
        if (C20800yB.A01(C21000yV.A02, r4.A08, 7279)) {
            return r4.A05.A07(r5, false);
        }
        return C004702c.A00;
    }

    public static final void A01(Resources resources, View view, int i) {
        AnonymousClass00C.A0D(view, 0);
        C99304t3 A002 = C99304t3.A00(view, i, 0);
        AnonymousClass0Eq r4 = A002.A0J;
        ViewGroup.LayoutParams layoutParams = r4.getLayoutParams();
        AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        marginLayoutParams.setMargins(dimensionPixelSize, marginLayoutParams.topMargin, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.f7nameremoved));
        r4.setLayoutParams(marginLayoutParams);
        A002.A0Y(new C35161iF((Object) A002, 29), R.string.f12nameremoved);
        A002.A0P();
    }

    public static final void A03(Bundle bundle, AnonymousClass155 r3, C53502rQ r4, C32061ct r5, C235718z r6, int i) {
        AnonymousClass00C.A0D(bundle, 6);
        if (bundle.getBoolean("UnarchiveForQuickLockDialogFragment_result_key")) {
            r6.A09.Boy(new C35651j2(r6, r4, 14));
            r6.A0A(r3, r4, r5, i);
            return;
        }
        r5.Bf7(new C63093Is(C51832oS.FAILURE, (Integer) null, (Integer) null));
    }

    public static final void A04(Bundle bundle, AnonymousClass155 r7, C63093Is r8, C235718z r9, C88484Sw r10, AnonymousClass11F r11) {
        int i;
        int i2;
        AnonymousClass00C.A0D(bundle, 6);
        AnonymousClass155 r4 = r7;
        C88484Sw r72 = r10;
        if (bundle.getBoolean("result")) {
            C235718z r6 = r9;
            AnonymousClass3L5 r3 = (AnonymousClass3L5) r9.A0A.get();
            C63093Is r5 = r8;
            Integer num = r8.A00;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 5;
            }
            Integer num2 = r8.A01;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 1;
            }
            r3.A04(r11, Integer.valueOf(i), Integer.valueOf(i2), 7);
            r4.getSupportFragmentManager().A0l(new AnonymousClass3RC(r4, r5, r6, r72, r11, 1), r4, "ClearLockedChatsDialogFragment_request_key");
            r4.Btl(new ClearLockedChatsDialogFragment(), "ClearLockedChatsDialogFragment");
        } else if (r10 != null) {
            r10.BT0();
        }
        r4.getSupportFragmentManager().A0m("request_key");
    }

    public static final void A05(Bundle bundle, AnonymousClass155 r4, C63093Is r5, C235718z r6, C88484Sw r7, AnonymousClass11F r8) {
        int i;
        int i2;
        AnonymousClass00C.A0D(bundle, 6);
        if (bundle.getBoolean("ClearLockedChatsDialogFragment_result_key")) {
            if (r8 == null) {
                r6.A08();
            } else {
                r6.A09.Boy(new C35651j2(r6, r8, 15));
            }
            if (r7 != null) {
                r7.BTZ();
            }
            AnonymousClass3L5 r3 = (AnonymousClass3L5) r6.A0A.get();
            Integer num = r5.A00;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 5;
            }
            Integer num2 = r5.A01;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 1;
            }
            r3.A04(r8, Integer.valueOf(i), Integer.valueOf(i2), 8);
        } else if (r7 != null) {
            r7.BT0();
        }
        r4.getSupportFragmentManager().A0m("ClearLockedChatsDialogFragment_request_key");
    }

    public final C009904e A06(Resources resources, AnonymousClass018 r4, AnonymousClass00S r5) {
        AnonymousClass00C.A0D(resources, 1);
        return r4.BnD(new C33441fK(resources, this, r5), new C009504a());
    }

    public final void A08() {
        A0H(false);
        ((C63603Kr) this.A0O.get()).A02(C86924Mu.A00);
        this.A09.Boy(new C35671j4(this, 19));
    }

    public final void A09(C009904e r5, AnonymousClass11F r6, int i) {
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass00C.A0D(r5, 2);
        this.A00 = true;
        Context context = this.A0J.A00;
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity");
        intent.putExtra("extra_chat_jid", r6.getRawString());
        intent.putExtra("extra_open_chat_directly", true);
        intent.putExtra("extra_unlock_entry_point", i);
        r5.A02(intent);
    }

    public final void A0A(AnonymousClass155 r15, C53502rQ r16, C32061ct r17, int i) {
        AnonymousClass155 r3 = r15;
        AnonymousClass00C.A0D(r15, 0);
        C32061ct r1 = r17;
        AnonymousClass00C.A0D(r1, 2);
        if (!this.A0R) {
            Log.e("ChatLockManager/authenticate: Unsupported Version");
        } else if (A0J() || !A0M()) {
            C69873eE r5 = new C69873eE(r15, r1);
            C53502rQ r4 = r16;
            int i2 = i;
            A07(r4).B1b(r15, r4, r5, new C606938z(r3, r4, r5, this, i2), i2);
        } else {
            AnonymousClass21S r12 = new AnonymousClass21S(r15, R.style.f13nameremoved);
            r12.A0e(R.string.f12nameremoved);
            r12.A0d(R.string.f12nameremoved);
            r12.A0c();
            r12.A0g((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            r12.create().show();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0.A0i == true) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass155 r11, X.C53502rQ r12, X.C32061ct r13, int r14) {
        /*
            r10 = this;
            r6 = r12
            boolean r0 = r12 instanceof X.AnonymousClass2EM
            r3 = 1
            r4 = 0
            r8 = r10
            r5 = r11
            r7 = r13
            r9 = r14
            if (r0 == 0) goto L_0x0035
            X.12q r1 = r10.A06
            r0 = r6
            X.2EM r0 = (X.AnonymousClass2EM) r0
            X.11F r0 = r0.A00
            X.3Qp r0 = r1.A09(r0, r4)
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.A0i
            if (r0 != r3) goto L_0x005b
        L_0x001c:
            X.01z r1 = r11.getSupportFragmentManager()
            X.3aS r4 = new X.3aS
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r0 = "UnarchiveForQuickLockDialogFragment_request_key"
            r1.A0l(r4, r11, r0)
            com.whatsapp.chatlock.dialogs.UnarchiveForQuickLockDialogFragment r1 = new com.whatsapp.chatlock.dialogs.UnarchiveForQuickLockDialogFragment
            r1.<init>()
            java.lang.String r0 = "UnarchiveForQuickLockDialogFragment"
            r11.Btl(r1, r0)
            return
        L_0x0035:
            boolean r0 = r12 instanceof X.AnonymousClass2EN
            if (r0 == 0) goto L_0x005b
            r0 = r6
            X.2EN r0 = (X.AnonymousClass2EN) r0
            java.util.Collection r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            X.12q r0 = r10.A06
            X.3Qp r0 = r0.A09(r1, r4)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.A0i
            if (r0 != r3) goto L_0x0042
            goto L_0x001c
        L_0x005b:
            r10.A0A(r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235718z.A0B(X.155, X.2rQ, X.1ct, int):void");
    }

    public final void A0C(AnonymousClass155 r3, C53502rQ r4, C32061ct r5, AnonymousClass11F r6, int i) {
        AnonymousClass00C.A0D(r3, 0);
        AnonymousClass00C.A0D(r5, 4);
        if (!this.A06.A01.isEmpty()) {
            A0B(r3, r4, r5, i);
            return;
        }
        ChatLockHelperBottomSheet chatLockHelperBottomSheet = new ChatLockHelperBottomSheet();
        chatLockHelperBottomSheet.A07 = r6;
        chatLockHelperBottomSheet.A02 = r5;
        chatLockHelperBottomSheet.A01 = r4;
        chatLockHelperBottomSheet.A00 = i;
        r3.Btl(chatLockHelperBottomSheet, "ChatLockQuickAddHelperBottomSheet");
    }

    public final void A0D(AnonymousClass155 r10, C63093Is r11, C88484Sw r12, AnonymousClass11F r13) {
        r10.getSupportFragmentManager().A0l(new AnonymousClass3RC(r10, r11, this, r12, r13, 0), r10, "request_key");
        r10.Btl(new ChatsAreLockedDialogFragment(), "ChatsAreLockedDialogFragment");
    }

    public final void A0E(AnonymousClass155 r6, AnonymousClass11F r7) {
        AnonymousClass00C.A0D(r6, 0);
        C39001qm A002 = AnonymousClass3LW.A00(r6);
        boolean A052 = ((AnonymousClass18U) this.A0M.get()).A05();
        int i = R.string.f12nameremoved;
        if (A052) {
            i = R.string.f12nameremoved;
        }
        A002.A0d(i);
        A002.A0r(true);
        A002.A0m(r6, (AnonymousClass04S) null, R.string.f12nameremoved);
        A002.create().show();
        AnonymousClass3L5 r2 = (AnonymousClass3L5) this.A0A.get();
        AnonymousClass00C.A0B(r2);
        r2.A04(r7, 0, (Integer) null, 4);
    }

    public final void A0F(AnonymousClass11F r4, boolean z) {
        AnonymousClass00C.A0D(r4, 1);
        C220412q r2 = this.A06;
        C65073Qp A092 = r2.A09(r4, false);
        if (A092 != null) {
            A092.A0j = z;
            ((AnonymousClass163) this.A0C.get()).A06(A092);
            AnonymousClass11F A062 = A092.A06();
            HashSet hashSet = r2.A01;
            if (z) {
                hashSet.add(A062);
            } else {
                hashSet.remove(A062);
            }
        }
    }

    public final void A0G(Collection collection, boolean z) {
        AnonymousClass00C.A0D(collection, 1);
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r0 = (AnonymousClass11F) it.next();
            AnonymousClass00C.A0B(r0);
            A0F(r0, z);
        }
        ((C29411Wn) this.A0Q.get()).A03();
        ((C24381Cf) this.A0D.get()).A00();
        this.A09.Boy(new C35291iS(this, arrayList, 3, z));
    }

    public final boolean A0P(AnonymousClass11F r3) {
        return r3 != null && this.A06.A0Q(r3) && !this.A03;
    }

    public final void A0H(boolean z) {
        ((C25731Hl) this.A0B.get()).A01(z);
        this.A09.Boy(new C35671j4(this, 20));
    }

    public final void A0I(boolean z) {
        ((SharedPreferences) ((C25731Hl) this.A0B.get()).A01.getValue()).edit().putBoolean("should_warn_leaky_companion", z).apply();
    }

    public final boolean A0J() {
        if (!C20800yB.A01(C21000yV.A02, this.A08, 5854) || !((C63603Kr) this.A0O.get()).A03()) {
            return false;
        }
        return true;
    }

    public final boolean A0K() {
        if (!C20800yB.A01(C21000yV.A02, this.A08, 5854) || this.A0I.A0L()) {
            return false;
        }
        return true;
    }

    public final boolean A0L() {
        C20810yC r2 = this.A08;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 5854) || !C20800yB.A01(r1, r2, 6243)) {
            return false;
        }
        return true;
    }

    public final boolean A0M() {
        if (!C20800yB.A01(C21000yV.A02, this.A08, 7280) || !this.A0I.A0L()) {
            return false;
        }
        return true;
    }

    public final boolean A0N() {
        if (((C63603Kr) this.A0O.get()).A03()) {
            if (!C20800yB.A01(C21000yV.A02, this.A08, 5854) || !((C25731Hl) this.A0B.get()).A03() || !A0L()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0O() {
        if (!this.A0R) {
            return false;
        }
        if (!this.A0I.A0L() || A0M()) {
            return true;
        }
        return false;
    }

    public static final void A02(Resources resources, View view, boolean z) {
        int i = R.string.f12nameremoved;
        if (!z) {
            i = R.string.f12nameremoved;
        }
        C99304t3 A002 = C99304t3.A00(view, i, 0);
        AnonymousClass0Eq r4 = A002.A0J;
        ViewGroup.LayoutParams layoutParams = r4.getLayoutParams();
        AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        marginLayoutParams.setMargins(dimensionPixelSize, marginLayoutParams.topMargin, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.f7nameremoved));
        r4.setLayoutParams(marginLayoutParams);
        A002.A0Y(new C35161iF((Object) A002, 28), R.string.f12nameremoved);
        A002.A0P();
    }

    public final C88494Sx A07(C53502rQ r5) {
        Object obj;
        if (A0M()) {
            obj = this.A0G.get();
        } else {
            AnonymousClass005 r3 = this.A0N;
            if (!((C69933eK) r3.get()).A00(r5)) {
                AnonymousClass005 r2 = this.A0G;
                C69923eJ r1 = (C69923eJ) r2.get();
                if (!(r5 instanceof AnonymousClass2EP) && ((C63603Kr) r1.A03.get()).A03()) {
                    obj = r2.get();
                }
            }
            obj = r3.get();
        }
        C88494Sx r0 = (C88494Sx) obj;
        AnonymousClass00C.A0B(r0);
        return r0;
    }

    public C235718z(C19730wQ r26, AnonymousClass1J4 r27, AnonymousClass196 r28, C19630wG r29, C220412q r30, C236419g r31, C20810yC r32, AnonymousClass190 r33, AnonymousClass13J r34, C19770wU r35, AnonymousClass005 r36, AnonymousClass005 r37, AnonymousClass005 r38, AnonymousClass005 r39, AnonymousClass005 r40, AnonymousClass005 r41, AnonymousClass005 r42, AnonymousClass005 r43, AnonymousClass005 r44, AnonymousClass005 r45, AnonymousClass005 r46, AnonymousClass004 r47, AnonymousClass004 r48) {
        C20810yC r18 = r32;
        AnonymousClass00C.A0D(r18, 1);
        C220412q r20 = r30;
        AnonymousClass00C.A0D(r20, 2);
        C19730wQ r24 = r26;
        AnonymousClass00C.A0D(r24, 3);
        C19630wG r21 = r29;
        AnonymousClass00C.A0D(r21, 4);
        AnonymousClass190 r17 = r33;
        AnonymousClass00C.A0D(r17, 5);
        C19770wU r15 = r35;
        AnonymousClass00C.A0D(r15, 6);
        AnonymousClass196 r22 = r28;
        AnonymousClass00C.A0D(r22, 7);
        AnonymousClass005 r14 = r36;
        AnonymousClass00C.A0D(r14, 8);
        AnonymousClass13J r16 = r34;
        AnonymousClass00C.A0D(r16, 9);
        AnonymousClass005 r13 = r37;
        AnonymousClass00C.A0D(r13, 10);
        AnonymousClass005 r12 = r38;
        AnonymousClass00C.A0D(r12, 11);
        AnonymousClass005 r11 = r39;
        AnonymousClass00C.A0D(r11, 12);
        AnonymousClass005 r10 = r40;
        AnonymousClass00C.A0D(r10, 13);
        AnonymousClass005 r9 = r41;
        AnonymousClass00C.A0D(r9, 14);
        C236419g r19 = r31;
        AnonymousClass00C.A0D(r19, 15);
        AnonymousClass005 r8 = r42;
        AnonymousClass00C.A0D(r8, 16);
        AnonymousClass1J4 r23 = r27;
        AnonymousClass00C.A0D(r23, 17);
        AnonymousClass005 r7 = r43;
        AnonymousClass00C.A0D(r7, 18);
        AnonymousClass005 r6 = r44;
        AnonymousClass00C.A0D(r6, 19);
        AnonymousClass005 r5 = r45;
        AnonymousClass00C.A0D(r5, 20);
        AnonymousClass005 r4 = r46;
        AnonymousClass00C.A0D(r4, 21);
        AnonymousClass004 r3 = r47;
        AnonymousClass00C.A0D(r3, 22);
        AnonymousClass004 r2 = r48;
        AnonymousClass00C.A0D(r2, 23);
        this.A08 = r18;
        this.A06 = r20;
        this.A0I = r24;
        this.A0J = r21;
        this.A0K = r17;
        this.A09 = r15;
        this.A05 = r22;
        this.A0C = r14;
        this.A0L = r16;
        this.A0E = r13;
        this.A0M = r12;
        this.A0A = r11;
        this.A0F = r10;
        this.A0H = r9;
        this.A07 = r19;
        this.A0O = r8;
        this.A04 = r23;
        this.A0D = r7;
        this.A0B = r6;
        this.A0G = r5;
        this.A0N = r4;
        this.A0P = r3;
        this.A0Q = r2;
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
