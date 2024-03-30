package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass1EM;
import X.AnonymousClass1EU;
import X.AnonymousClass1FI;
import X.AnonymousClass1NG;
import X.AnonymousClass1NZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass2Fw;
import X.AnonymousClass310;
import X.AnonymousClass34A;
import X.AnonymousClass4A4;
import X.AnonymousClass4ZP;
import X.AnonymousClass6O7;
import X.AnonymousClass6W1;
import X.AnonymousClass755;
import X.C001700s;
import X.C004602b;
import X.C1502474n;
import X.C18820ts;
import X.C19700wN;
import X.C19760wT;
import X.C20810yC;
import X.C21010yW;
import X.C21430zE;
import X.C222013h;
import X.C230116v;
import X.C232317r;
import X.C26141Ja;
import X.C29411Wn;
import X.C30531aM;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C49032iS;
import X.C61143As;
import X.C68733cN;
import X.C80213v2;
import X.C81283wl;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Map;

public final class VoipContactPickerFragment extends Hilt_VoipContactPickerFragment {
    public AnonymousClass6O7 A00;
    public C30531aM A01;
    public AnonymousClass6W1 A02;
    public CallSuggestionsViewModel A03;
    public C19760wT A04;
    public AnonymousClass1RJ A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(new AnonymousClass4A4(this));

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        if (this.A1g.A07(4833) >= 1) {
            this.A03 = (CallSuggestionsViewModel) C36381kD.A0P(this).A00(CallSuggestionsViewModel.class);
        }
        if (C36331k8.A1b(this.A06)) {
            AnonymousClass1RJ r1 = new AnonymousClass1RJ(C36361kB.A0G(view, R.id.add_to_call_button_stub));
            r1.A07(new AnonymousClass4ZP((Object) this, 0));
            this.A05 = r1;
        }
    }

    public void A1r(View view, AnonymousClass141 r9) {
        AnonymousClass00C.A0D(view, 1);
        super.A1r(view, r9);
        A00(this);
        Jid A0h = C36431kI.A0h(r9);
        boolean A20 = A20();
        AnonymousClass6W1 A26 = A26();
        A26.A03.execute(new AnonymousClass755(A0h, A26, this.A00, 9, A20));
    }

    public void A1t(AnonymousClass34A r7) {
        Long l;
        AnonymousClass00C.A0D(r7, 0);
        super.A1t(r7);
        CallSuggestionsViewModel callSuggestionsViewModel = this.A03;
        Long l2 = null;
        if (callSuggestionsViewModel != null) {
            l = Long.valueOf(callSuggestionsViewModel.A00);
        } else {
            l = null;
        }
        Long A0y = C36441kJ.A0y(this.A2p.size());
        if (this.A03 != null) {
            l2 = A0y;
        }
        AnonymousClass6W1 A26 = A26();
        A26.A03.execute(new C1502474n(A26, l2, l, 42));
    }

    public void A1u(C61143As r2) {
        AnonymousClass00C.A0D(r2, 0);
        super.A1u(r2);
        this.A00 = r2.A00;
    }

    public void A1v(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        AnonymousClass6W1 A26 = A26();
        boolean A20 = A20();
        A26.A03.execute(new AnonymousClass755(A26, userJid, this.A00, 10, A20));
        super.A1v(userJid);
    }

    public void A1w(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        super.A1w(userJid);
        boolean A20 = A20();
        AnonymousClass6W1 A26 = A26();
        A26.A03.execute(new AnonymousClass755(userJid, A26, this.A00, 9, A20));
    }

    public static final void A00(VoipContactPickerFragment voipContactPickerFragment) {
        int i;
        long size;
        Object[] A0M;
        if (C36331k8.A1b(voipContactPickerFragment.A06)) {
            Map map = voipContactPickerFragment.A3o;
            boolean isEmpty = map.isEmpty();
            C18820ts r5 = voipContactPickerFragment.A1D;
            if (isEmpty) {
                i = R.plurals.f10nameremoved;
                size = (long) voipContactPickerFragment.A2l.size();
                A0M = new Object[1];
                AnonymousClass000.A1L(A0M, voipContactPickerFragment.A2l.size(), 0);
            } else {
                i = R.plurals.f10nameremoved;
                size = (long) map.size();
                A0M = AnonymousClass001.A0M();
                AnonymousClass000.A1L(A0M, map.size(), 0);
                AnonymousClass000.A1L(A0M, voipContactPickerFragment.A00, 1);
            }
            C68733cN.A00(voipContactPickerFragment).A0P(r5.A0L(A0M, i, size));
        }
    }

    public C49032iS A1d() {
        AnonymousClass6O7 r0;
        C001700s r02;
        HashSet hashSet = this.A3l;
        AnonymousClass00C.A07(hashSet);
        boolean z = this.A31;
        boolean z2 = this.A33;
        C20810yC r19 = this.A1g;
        AnonymousClass00C.A07(r19);
        C19700wN r18 = this.A0M;
        AnonymousClass00C.A07(r18);
        C21010yW r17 = this.A1i;
        AnonymousClass00C.A07(r17);
        AnonymousClass16D r15 = this.A0j;
        AnonymousClass00C.A07(r15);
        AnonymousClass1EM r14 = this.A2H;
        AnonymousClass00C.A07(r14);
        AnonymousClass1EU r13 = this.A1z;
        AnonymousClass00C.A07(r13);
        AnonymousClass1NG r12 = this.A0Z;
        AnonymousClass00C.A07(r12);
        C29411Wn r11 = this.A0Y;
        AnonymousClass00C.A07(r11);
        AnonymousClass005 r10 = this.A2U;
        AnonymousClass00C.A07(r10);
        AnonymousClass1FI r9 = this.A1P;
        AnonymousClass00C.A07(r9);
        CallSuggestionsViewModel callSuggestionsViewModel = this.A03;
        if (callSuggestionsViewModel == null || (r02 = callSuggestionsViewModel.A03) == null) {
            r0 = null;
        } else {
            r0 = (AnonymousClass6O7) r02.A04();
        }
        C230116v r8 = this.A2I;
        AnonymousClass00C.A07(r8);
        C21430zE r7 = this.A21;
        AnonymousClass00C.A07(r7);
        AnonymousClass17X r6 = this.A1Q;
        AnonymousClass00C.A07(r6);
        AnonymousClass310 r5 = this.A0m;
        AnonymousClass00C.A07(r5);
        AnonymousClass1NZ r4 = this.A1V;
        AnonymousClass00C.A07(r4);
        C232317r r3 = this.A1T;
        AnonymousClass00C.A07(r3);
        C26141Ja r2 = this.A1S;
        AnonymousClass00C.A07(r2);
        HashSet hashSet2 = hashSet;
        boolean z3 = z;
        boolean z4 = z2;
        C20810yC r29 = r19;
        C21010yW r30 = r17;
        return new AnonymousClass2Fw(r18, r11, r12, r0, r15, r5, this, r9, r6, r2, r3, r4, r29, r30, (AnonymousClass11F) null, r13, r7, r14, r8, r10, hashSet2, false, false, false, false, false, false, z3, z4, false, false, false, false, false, false);
    }

    public final AnonymousClass6W1 A26() {
        AnonymousClass6W1 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("searchUserJourneyLogger");
    }

    public LayoutInflater A1E(Bundle bundle) {
        LayoutInflater A1E = super.A1E(bundle);
        AnonymousClass00C.A08(A1E);
        if (this.A1g.A07(4833) < 1) {
            return A1E;
        }
        C004602b r2 = new C004602b(A1D(), (int) R.style.f13nameremoved);
        Resources.Theme theme = r2.getTheme();
        AnonymousClass00C.A08(theme);
        AnonymousClass00C.A07(this.A1g);
        AnonymousClass00C.A07(this.A2K);
        if (C222013h.A05) {
            theme.applyStyle(R.style.f13nameremoved, true);
            if (C222013h.A06) {
                theme.applyStyle(R.style.f13nameremoved, true);
            }
        }
        LayoutInflater cloneInContext = A1E.cloneInContext(r2);
        AnonymousClass00C.A08(cloneInContext);
        return cloneInContext;
    }

    public void A1H() {
        super.A1H();
        AnonymousClass6W1 A26 = A26();
        A26.A03.execute(C80213v2.A00(A26, 48));
        this.A05 = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        AnonymousClass6W1 A26 = A26();
        A26.A03.execute(C80213v2.A00(A26, 49));
    }

    public void A1f() {
        int i;
        super.A1f();
        AnonymousClass00T r3 = this.A06;
        if (C36331k8.A1b(r3)) {
            this.A3C = true;
            this.A00 = A1Z().getInt("custom_multiselect_limit", 32);
            this.A01 = R.plurals.f10nameremoved;
        }
        Resources A0G = C36341k9.A0G(this);
        if (C36331k8.A1b(r3)) {
            i = this.A00;
        } else {
            i = 1;
        }
        C68733cN.A00(this).A0Q(A0G.getQuantityText(R.plurals.f10nameremoved, i));
    }

    public void A1x(String str) {
        AnonymousClass6W1 A26 = A26();
        A26.A03.execute(new C81283wl((Object) A26, str.length(), 23));
        super.A1x(str);
    }
}
