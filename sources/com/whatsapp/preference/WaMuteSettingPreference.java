package com.whatsapp.preference;

import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass3FH;
import X.AnonymousClass4PX;
import X.AnonymousClass80G;
import X.AnonymousClass96N;
import X.C05250Oz;
import X.C187898yi;
import X.C18800tq;
import X.C191639Dt;
import X.C19970wo;
import X.C220412q;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36441kJ;
import X.C43102Dw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;

public final class WaMuteSettingPreference extends SwitchPreference {
    public CompoundButton.OnCheckedChangeListener A00;
    public C191639Dt A01;
    public ListItemWithLeftIcon A02;
    public AnonymousClass4PX A03;
    public AnonymousClass3FH A04;
    public AnonymousClass11F A05;
    public C187898yi A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaMuteSettingPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        this.A06 = C187898yi.MUTE_MESSAGES;
    }

    public void A0G(AnonymousClass80G r4) {
        AnonymousClass00C.A0D(r4, 0);
        super.A0G(r4);
        View view = r4.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
        AnonymousClass00C.A0E(view, "null cannot be cast to non-null type com.whatsapp.ListItemWithLeftIcon");
        this.A02 = (ListItemWithLeftIcon) view;
        C36351kA.A19(view, R.id.list_item_icon);
        AnonymousClass11F r2 = this.A05;
        A00(this.A00, this.A02, r2, this);
    }

    public static final void A00(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, ListItemWithLeftIcon listItemWithLeftIcon, AnonymousClass11F r16, WaMuteSettingPreference waMuteSettingPreference) {
        WaMuteSettingPreference waMuteSettingPreference2 = waMuteSettingPreference;
        if (waMuteSettingPreference2.A04 == null) {
            AnonymousClass11F r13 = r16;
            if (r16 != null) {
                ListItemWithLeftIcon listItemWithLeftIcon2 = listItemWithLeftIcon;
                if (listItemWithLeftIcon != null) {
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = onCheckedChangeListener;
                    if (onCheckedChangeListener != null) {
                        int ordinal = waMuteSettingPreference2.A06.ordinal();
                        AnonymousClass3FH r3 = null;
                        if (ordinal == 0) {
                            AnonymousClass4PX r7 = waMuteSettingPreference2.A03;
                            if (r7 != null) {
                                Context context = waMuteSettingPreference2.A05;
                                AnonymousClass00C.A08(context);
                                r3 = r7.B4G(context, onCheckedChangeListener, listItemWithLeftIcon, r13, new AnonymousClass96N(waMuteSettingPreference2, 10));
                            }
                        } else if (ordinal == 1) {
                            C191639Dt r2 = waMuteSettingPreference2.A01;
                            if (r2 != null) {
                                Context context2 = waMuteSettingPreference2.A05;
                                AnonymousClass00C.A08(context2);
                                AnonymousClass96N r15 = new AnonymousClass96N(waMuteSettingPreference2, 11);
                                C18800tq r1 = r2.A00.A02;
                                C19970wo A0V = C36351kA.A0V(r1);
                                C220412q A0a = C36351kA.A0a(r1);
                                r3 = new C43102Dw(context2, onCheckedChangeListener2, listItemWithLeftIcon2, C36361kB.A0T(r1), A0V, C36351kA.A0Y(r1), C36341k9.A0T(r1), A0a, C36351kA.A0b(r1), r13, C36371kC.A0j(r1), r15);
                            }
                        } else {
                            throw C36441kJ.A18();
                        }
                        waMuteSettingPreference2.A04 = r3;
                        if (r3 != null) {
                            r3.A00();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WaMuteSettingPreference(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaMuteSettingPreference(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }
}
