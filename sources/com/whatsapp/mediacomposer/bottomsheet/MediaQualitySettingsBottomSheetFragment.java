package com.whatsapp.mediacomposer.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass17Y;
import X.AnonymousClass1D1;
import X.AnonymousClass6AO;
import X.AnonymousClass7MQ;
import X.C05250Oz;
import X.C135466ck;
import X.C136116dn;
import X.C158427gu;
import X.C18820ts;
import X.C19770wU;
import X.C20810yC;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.radio.RadioButtonWithSubtitle;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

public abstract class MediaQualitySettingsBottomSheetFragment extends Hilt_MediaQualitySettingsBottomSheetFragment {
    public int A00;
    public RadioButton A01;
    public AnonymousClass17Y A02;
    public C18820ts A03;
    public C20810yC A04;
    public AnonymousClass1D1 A05;
    public C19770wU A06;
    public final C158427gu A07;
    public final AnonymousClass00T A08 = C36431kI.A1I(new AnonymousClass7MQ(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        SortedMap sortedMap;
        int A022;
        int A023;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        TextView A0P = C36391kE.A0P(view, R.id.media_quality_bottom_sheet_title);
        if (A0P != null) {
            if (this instanceof VideoQualitySettingsBottomSheetFragment) {
                A023 = C36331k8.A02(((VideoQualitySettingsBottomSheetFragment) this).A04);
            } else {
                A023 = C36331k8.A02(((ImageQualitySettingsBottomSheetFragment) this).A05);
            }
            A0P.setText(A023);
            A0P.setVisibility(0);
        }
        TextView A0P2 = C36391kE.A0P(view, R.id.media_bottom_sheet_description);
        if (A0P2 != null) {
            if (this instanceof VideoQualitySettingsBottomSheetFragment) {
                A022 = C36331k8.A02(((VideoQualitySettingsBottomSheetFragment) this).A03);
            } else {
                A022 = C36331k8.A02(((ImageQualitySettingsBottomSheetFragment) this).A04);
            }
            A0P2.setText(A022);
            A0P2.setVisibility(0);
        }
        if (this instanceof VideoQualitySettingsBottomSheetFragment) {
            sortedMap = ((VideoQualitySettingsBottomSheetFragment) this).A02;
        } else {
            sortedMap = ((ImageQualitySettingsBottomSheetFragment) this).A03;
        }
        Iterator A0y = AnonymousClass000.A0y(sortedMap);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            AnonymousClass6AO r1 = (AnonymousClass6AO) A11.getValue();
            CompoundButton compoundButton = (CompoundButton) view.findViewById(C36411kG.A07((Number) A11.getKey()));
            if (compoundButton != null) {
                compoundButton.setChecked(AnonymousClass000.A1S(r1.A00, this.A00));
            }
        }
        View findViewById = view.findViewById(R.id.done_btn);
        C20810yC r12 = this.A04;
        if (r12 != null) {
            if (r12.A0E(4244)) {
                AnonymousClass00C.A0B(findViewById);
                findViewById.setVisibility(8);
                View findViewById2 = view.findViewById(R.id.media_quality_bottom_sheet);
                if (findViewById2 != null) {
                    findViewById2.layout(findViewById2.getPaddingRight(), findViewById2.getPaddingTop(), findViewById2.getPaddingRight(), 0);
                }
            } else {
                C135466ck.A00(findViewById, this, 21);
            }
            RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.media_quality);
            if (radioGroup != null) {
                Iterator A0y2 = AnonymousClass000.A0y(sortedMap);
                while (A0y2.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A0y2);
                    AnonymousClass6AO r13 = (AnonymousClass6AO) A112.getValue();
                    RadioButtonWithSubtitle radioButtonWithSubtitle = new RadioButtonWithSubtitle(A0a(), (AttributeSet) null, 0, 6, (C05250Oz) null);
                    radioButtonWithSubtitle.setId(C36411kG.A07((Number) A112.getKey()));
                    radioButtonWithSubtitle.setTitle(A0n(r13.A01));
                    boolean z = true;
                    if (this.A00 != r13.A00) {
                        z = false;
                    }
                    radioButtonWithSubtitle.setChecked(z);
                    radioGroup.addView(radioButtonWithSubtitle);
                }
                radioGroup.setOnCheckedChangeListener(new C136116dn(this));
            }
            this.A01 = (RadioButton) view.findViewById(R.id.media_quality_default);
            return;
        }
        throw C36321k7.A07();
    }

    public final void A1m() {
        SortedMap sortedMap;
        RadioButtonWithSubtitle radioButtonWithSubtitle;
        Context A1D;
        int i;
        View view;
        if (this instanceof VideoQualitySettingsBottomSheetFragment) {
            sortedMap = ((VideoQualitySettingsBottomSheetFragment) this).A02;
        } else {
            sortedMap = ((ImageQualitySettingsBottomSheetFragment) this).A03;
        }
        Iterator A0y = AnonymousClass000.A0y(sortedMap);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            int i2 = ((AnonymousClass6AO) A11.getValue()).A00;
            String str = null;
            if (i2 == 0) {
                View view2 = this.A0F;
                if (view2 != null) {
                    Object key = A11.getKey();
                    AnonymousClass00C.A08(key);
                    radioButtonWithSubtitle = (RadioButtonWithSubtitle) view2.findViewById(AnonymousClass000.A0I(key));
                    if (radioButtonWithSubtitle != null) {
                        A1D = A1D();
                        if (A1D != null) {
                            i = R.string.f12nameremoved;
                        }
                        radioButtonWithSubtitle.setSubTitle(str);
                    }
                }
            } else if (i2 == 3 && (view = this.A0F) != null) {
                Object key2 = A11.getKey();
                AnonymousClass00C.A08(key2);
                radioButtonWithSubtitle = (RadioButtonWithSubtitle) view.findViewById(AnonymousClass000.A0I(key2));
                if (radioButtonWithSubtitle != null) {
                    A1D = A1D();
                    if (A1D != null) {
                        i = R.string.f12nameremoved;
                    }
                    radioButtonWithSubtitle.setSubTitle(str);
                }
            }
            str = A1D.getString(i);
            radioButtonWithSubtitle.setSubTitle(str);
        }
    }

    public MediaQualitySettingsBottomSheetFragment(C158427gu r2, int i) {
        this.A07 = r2;
        this.A00 = i;
    }

    public void A1J() {
        super.A1J();
        this.A01 = null;
    }
}
