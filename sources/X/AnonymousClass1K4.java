package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bonsai.BonsaiSystemMessageBottomSheet;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1K4  reason: invalid class name */
public final class AnonymousClass1K4 implements AnonymousClass1K3 {
    public final AnonymousClass1LH A00;
    public final AnonymousClass1K5 A01;
    public final C25681Hg A02;
    public final AnonymousClass1KD A03;
    public final AnonymousClass1K6 A04;
    public final AnonymousClass1KF A05;
    public final AnonymousClass1LF A06;
    public final C20810yC A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass00T A09 = new AnonymousClass00U(AnonymousClass1LK.A00);
    public final AnonymousClass1LI A0A;
    public final AnonymousClass1HY A0B;
    public final AnonymousClass1HX A0C;
    public final AnonymousClass1KD A0D;
    public final C18820ts A0E;
    public final C25841Hw A0F;
    public final AnonymousClass005 A0G;
    public final AnonymousClass005 A0H;

    public AnonymousClass1K4(AnonymousClass1LH r18, AnonymousClass1LI r19, AnonymousClass1K5 r20, AnonymousClass1HY r21, AnonymousClass1HX r22, C25681Hg r23, AnonymousClass1KD r24, AnonymousClass1KD r25, AnonymousClass1K6 r26, AnonymousClass1KF r27, AnonymousClass1LF r28, C18820ts r29, C25841Hw r30, C20810yC r31, AnonymousClass005 r32, AnonymousClass005 r33, AnonymousClass005 r34) {
        C20810yC r4 = r31;
        AnonymousClass00C.A0D(r4, 1);
        C25681Hg r11 = r23;
        AnonymousClass00C.A0D(r11, 2);
        AnonymousClass1HX r12 = r22;
        AnonymousClass00C.A0D(r12, 3);
        AnonymousClass1K5 r15 = r20;
        AnonymousClass00C.A0D(r15, 5);
        AnonymousClass1KD r10 = r24;
        AnonymousClass00C.A0D(r10, 6);
        C18820ts r5 = r29;
        AnonymousClass00C.A0D(r5, 7);
        AnonymousClass1KD r9 = r25;
        AnonymousClass00C.A0D(r9, 8);
        AnonymousClass005 r3 = r32;
        AnonymousClass00C.A0D(r3, 9);
        AnonymousClass1KF r7 = r27;
        AnonymousClass00C.A0D(r7, 10);
        AnonymousClass1HY r13 = r21;
        AnonymousClass00C.A0D(r13, 11);
        AnonymousClass005 r0 = r33;
        AnonymousClass00C.A0D(r0, 12);
        AnonymousClass1LF r6 = r28;
        AnonymousClass00C.A0D(r6, 13);
        AnonymousClass1K6 r8 = r26;
        AnonymousClass00C.A0D(r8, 14);
        AnonymousClass1LH r16 = r18;
        AnonymousClass00C.A0D(r16, 15);
        AnonymousClass005 r2 = r34;
        AnonymousClass00C.A0D(r2, 16);
        AnonymousClass1LI r14 = r19;
        AnonymousClass00C.A0D(r14, 17);
        this.A07 = r4;
        this.A02 = r11;
        this.A0C = r12;
        this.A0F = r30;
        this.A01 = r15;
        this.A03 = r10;
        this.A0E = r5;
        this.A0D = r9;
        this.A08 = r3;
        this.A05 = r7;
        this.A0B = r13;
        this.A0H = r0;
        this.A06 = r6;
        this.A04 = r8;
        this.A00 = r16;
        this.A0G = r2;
        this.A0A = r14;
    }

    public void B1X(TextView textView, int i, boolean z) {
        AnonymousClass00C.A0D(textView, 0);
        if (!C222013h.A07) {
            int i2 = R.drawable.vec_bonsai_stardust_large;
            if (z) {
                i2 = R.drawable.vec_bonsai_stardust_small;
            }
            AnonymousClass1JZ.A0B(textView, this.A0E, i2);
        } else if (z) {
            Context context = textView.getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            Drawable A002 = AnonymousClass00E.A00(context, R.drawable.vec_bonsai_stardust_small);
            if (A002 != null) {
                A002.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                C18820ts r2 = this.A0E;
                if (C18820ts.A00(r2).A06) {
                    textView.setCompoundDrawables(new C100744vb(A002, r2), (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    textView.setCompoundDrawables((Drawable) null, (Drawable) null, A002, (Drawable) null);
                }
            }
        } else {
            AnonymousClass1JZ.A0B(textView, this.A0E, R.drawable.vec_bonsai_stardust_large);
        }
        C18820ts r1 = this.A0E;
        int A003 = AnonymousClass00F.A00(textView.getContext(), i);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        char c = 2;
        if (C18820ts.A00(r1).A06) {
            c = 0;
        }
        compoundDrawables[c].setColorFilter(A003, PorterDuff.Mode.SRC_IN);
    }

    public boolean B5k(AnonymousClass3T1 r5) {
        C52132ow r1;
        if ((r5 instanceof AnonymousClass2bV) && r5.A0N() != null && C63903Lw.A00(r5) && !r5.A1R(256)) {
            AnonymousClass3JM A0a = r5.A0a();
            if (A0a != null) {
                r1 = A0a.A01;
            } else {
                r1 = null;
            }
            if (r1 != C52132ow.A02 && this.A02.A00()) {
                if (C20800yB.A01(C21000yV.A02, this.A07, 5283)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void BmA(Configuration configuration, Window window, ListView listView, AnonymousClass141 r7) {
        AnonymousClass00C.A0D(listView, 0);
        AnonymousClass00C.A0D(r7, 1);
        AnonymousClass00C.A0D(configuration, 2);
        AnonymousClass00C.A0D(window, 3);
        AnonymousClass5ND r0 = (AnonymousClass5ND) window.getDecorView().findViewById(R.id.bot_embodiment_draggable_container);
        if (r0 != null) {
            r0.A0F();
            r0.setConfiguration(configuration);
        }
        View findViewById = listView.findViewById(R.id.bonsai_list_view_header);
        if (configuration.orientation == 2 || !BLC(r7.A0H)) {
            listView.removeHeaderView(findViewById);
        } else if (findViewById == null) {
            A01(listView, this, r7);
        }
    }

    public void Bu9(C225314u r5, boolean z) {
        C51152nM r0;
        AnonymousClass00C.A0D(r5, 0);
        BonsaiSystemMessageBottomSheet bonsaiSystemMessageBottomSheet = new BonsaiSystemMessageBottomSheet();
        Bundle bundle = new Bundle();
        if (z) {
            r0 = C51152nM.USER_AGENT;
        } else {
            r0 = C51152nM.INVOKE;
        }
        bundle.putInt("ARG_TYPE_ORDINAL", r0.ordinal());
        bonsaiSystemMessageBottomSheet.A17(bundle);
        r5.Btm(bonsaiSystemMessageBottomSheet);
    }

    public boolean BLB(AnonymousClass11F r3) {
        if (r3 == null || !C197029b1.A00(r3) || !this.A02.A00()) {
            return false;
        }
        return true;
    }

    public boolean BLD(AnonymousClass11F r5) {
        String str;
        C20810yC r3 = this.A07;
        C21000yV r2 = C21000yV.A02;
        if ((C20800yB.A01(r2, r3, 4532) || C20800yB.A01(r2, r3, 5259)) && !this.A0F.A02() && BLB(r5) && this.A02.A00() && (r5 instanceof UserJid)) {
            AnonymousClass6BB r0 = (AnonymousClass6BB) this.A0H.get();
            UserJid userJid = (UserJid) r5;
            AnonymousClass00C.A0D(userJid, 0);
            AnonymousClass6E1 A002 = r0.A00(userJid);
            if (A002 == null || (str = A002.A04) == null || str.length() == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean BLO() {
        C25681Hg r1 = this.A02;
        if (!r1.A02()) {
            return false;
        }
        if (C20800yB.A01(C21000yV.A01, r1.A01, 8002)) {
            return true;
        }
        return ((SharedPreferences) this.A0B.A02.getValue()).getBoolean("bonsai_meta_ai_button_setting_enabled", true);
    }

    public boolean BtP() {
        C25681Hg r1 = this.A02;
        if (!r1.A00() || !r1.A01()) {
            return false;
        }
        if (!C20800yB.A01(C21000yV.A02, r1.A01, 6252)) {
            return false;
        }
        AnonymousClass368 r5 = (AnonymousClass368) this.A0G.get();
        boolean z = false;
        if (AnonymousClass00C.A0J(r5.A00, false)) {
            return false;
        }
        C25681Hg r12 = r5.A02.A00;
        if (r12.A00() && r12.A00.A03()) {
            r5.A00 = false;
            return false;
        } else if (AnonymousClass00C.A0J(r5.A00, true)) {
            return true;
        } else {
            AnonymousClass00T r4 = r5.A01.A02;
            int i = ((SharedPreferences) r4.getValue()).getInt("bonsai_fab_tooltip_shown_count", 0);
            SharedPreferences.Editor edit = ((SharedPreferences) r4.getValue()).edit();
            edit.putInt("bonsai_fab_tooltip_shown_count", i + 1);
            edit.apply();
            if (i < 3) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            r5.A00 = valueOf;
            C18740tg.A06(valueOf);
            if (valueOf.booleanValue()) {
                return true;
            }
            return false;
        }
    }

    public static final AnonymousClass5NC A00(ViewGroup viewGroup, Window window, AnonymousClass01L r11, BotEmbodimentViewModel botEmbodimentViewModel, AnonymousClass11F r13) {
        ViewGroup viewGroup2;
        botEmbodimentViewModel.A0S(r13);
        AnonymousClass5NC r3 = new AnonymousClass5NC(r11, viewGroup, r13);
        viewGroup.addOnLayoutChangeListener(new AnonymousClass4XW(r3, 0));
        C92924f8 r4 = new C92924f8(r11);
        r4.A04(r11, r13);
        r3.A0G(r4, (View) null, r11.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), r11.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), r11.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), r11.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        View decorView = window.getDecorView();
        if ((decorView instanceof ViewGroup) && (viewGroup2 = (ViewGroup) decorView) != null) {
            viewGroup2.addView(r3, new ViewGroup.LayoutParams(-1, -1));
        }
        return r3;
    }

    public static final void A01(ListView listView, AnonymousClass1K4 r4, AnonymousClass141 r5) {
        View findViewById = listView.findViewById(R.id.bonsai_list_view_header);
        if (findViewById == null) {
            findViewById = LayoutInflater.from(listView.getContext()).inflate(R.layout.f9nameremoved, listView, false);
            listView.addHeaderView(findViewById);
            if (findViewById == null) {
                return;
            }
        }
        AnonymousClass3SF.A01(findViewById, r4.A0A, R.id.bonsai_list_view_header_contact_name).A05(r5);
    }

    public static final boolean A02(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            int[] iArr = new int[2];
            childAt.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            viewGroup.getLocationInWindow(iArr2);
            float f = (float) (iArr[1] - iArr2[1]);
            if (i != 0 || Math.min(1.0f, (((float) viewGroup.getPaddingTop()) - f) / ((float) viewGroup.getPaddingTop())) >= 1.0f) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean BLC(AnonymousClass11F r3) {
        if (!BLB(r3) || r3 == null) {
            return false;
        }
        AnonymousClass2LZ r0 = (AnonymousClass2LZ) this.A0D.A06.get(r3);
        if (r0 == null || r0.A00) {
            return true;
        }
        return false;
    }
}
