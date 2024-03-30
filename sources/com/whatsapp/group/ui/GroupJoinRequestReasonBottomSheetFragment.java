package com.whatsapp.group.ui;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1H2;
import X.AnonymousClass1N0;
import X.AnonymousClass1X4;
import X.AnonymousClass3TE;
import X.AnonymousClass3Y2;
import X.AnonymousClass3YG;
import X.AnonymousClass4GV;
import X.AnonymousClass4GW;
import X.AnonymousClass4WJ;
import X.C000800j;
import X.C001400p;
import X.C110945bU;
import X.C18820ts;
import X.C19890wg;
import X.C21060yb;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;

public final class GroupJoinRequestReasonBottomSheetFragment extends Hilt_GroupJoinRequestReasonBottomSheetFragment {
    public AnonymousClass1X4 A00;
    public AnonymousClass16D A01;
    public AnonymousClass171 A02;
    public C21060yb A03;
    public C18820ts A04;
    public AnonymousClass1N0 A05;
    public AnonymousClass1H2 A06;
    public C19890wg A07;
    public WDSButton A08;
    public String A09 = "";
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C = AnonymousClass3TE.A01(this, "group_subject");
    public final AnonymousClass00T A0D = AnonymousClass3TE.A01(this, "raw_parent_jid");
    public final AnonymousClass00T A0E = AnonymousClass3TE.A01(this, "message");

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        AnonymousClass00C.A08(inflate);
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        String A0o;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        TextView A0P = C36391kE.A0P(view2, R.id.request_counter);
        ScrollView scrollView = (ScrollView) view2.findViewById(R.id.scrollView);
        WaEditText waEditText = (WaEditText) view2.findViewById(R.id.join_request_input);
        TextView A0E2 = C36351kA.A0E(view2);
        TextView A0P2 = C36391kE.A0P(view2, R.id.request_disclaimer);
        TextView A0P3 = C36391kE.A0P(view2, R.id.request_hint);
        View findViewById = view2.findViewById(R.id.back_btn);
        this.A08 = C36441kJ.A0u(view2, R.id.request_btn);
        Context A0a = A0a();
        AnonymousClass1H2 r14 = this.A06;
        if (r14 != null) {
            C21060yb r11 = this.A03;
            if (r11 != null) {
                C18820ts r12 = this.A04;
                if (r12 != null) {
                    C19890wg r15 = this.A07;
                    if (r15 != null) {
                        AnonymousClass1N0 r13 = this.A05;
                        if (r13 != null) {
                            C110945bU.A00(A0a, scrollView, A0P, A0P3, waEditText, r11, r12, r13, r14, r15, 65536);
                            AnonymousClass4WJ.A00(waEditText, this, 11);
                            C36401kF.A1A(waEditText, this.A0E);
                            WDSButton wDSButton = this.A08;
                            if (wDSButton != null) {
                                AnonymousClass3YG.A00(wDSButton, this, view2, 32);
                            }
                            C36401kF.A1A(A0E2, this.A0C);
                            AnonymousClass16D r5 = this.A01;
                            if (r5 != null) {
                                AnonymousClass141 A082 = r5.A08(C36421kH.A0O(this.A0A));
                                if (A082 == null) {
                                    A0o = A0n(R.string.f12nameremoved);
                                } else {
                                    Object[] A0L = AnonymousClass001.A0L();
                                    AnonymousClass171 r4 = this.A02;
                                    if (r4 != null) {
                                        C36361kB.A1F(r4, A082, A0L, 0);
                                        A0o = A0o(R.string.f12nameremoved, A0L);
                                    } else {
                                        throw C36331k8.A0c();
                                    }
                                }
                                A0P2.setText(A0o);
                                AnonymousClass3Y2.A00(findViewById, this, 47);
                                return;
                            }
                            throw C36331k8.A0Z();
                        }
                        throw C36331k8.A0d("emojiRichFormatterStaticCaller");
                    }
                    throw C36331k8.A0d("sharedPreferencesFactory");
                }
                throw C36321k7.A09();
            }
            throw C36331k8.A0W();
        }
        throw C36331k8.A0d("emojiLoader");
    }

    public GroupJoinRequestReasonBottomSheetFragment() {
        C000800j r1 = C000800j.NONE;
        this.A0A = C001400p.A00(r1, new AnonymousClass4GV(this));
        this.A0B = C001400p.A00(r1, new AnonymousClass4GW(this));
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }
}
