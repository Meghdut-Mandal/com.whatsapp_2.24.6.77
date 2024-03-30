package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass11F;
import X.AnonymousClass1QZ;
import X.AnonymousClass2IN;
import X.AnonymousClass2IR;
import X.AnonymousClass2bV;
import X.C012005e;
import X.C18700tb;
import X.C19730wQ;
import X.C19970wo;
import X.C237919w;
import X.C27851Qb;
import X.C27861Qc;
import X.C36391kE;
import X.C36441kJ;
import X.C64933Qa;
import X.C89004Uw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class WallpaperMockChatView extends LinearLayout implements C18700tb {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public C19730wQ A05;
    public AnonymousClass2IR A06;
    public AnonymousClass2IR A07;
    public C19970wo A08;
    public AnonymousClass1QZ A09;
    public boolean A0A;

    public WallpaperMockChatView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass2IR getOutgoingRow() {
        return this.A07;
    }

    public void setMessages(String str, String str2, C89004Uw r11) {
        Context context = getContext();
        AnonymousClass2bV r2 = new AnonymousClass2bV(new C64933Qa((AnonymousClass11F) null, C237919w.A00(this.A05, this.A08), false), C19970wo.A00(this.A08));
        r2.A16(str);
        C19970wo r5 = this.A08;
        C19730wQ r0 = this.A05;
        AnonymousClass2bV r52 = new AnonymousClass2bV(new C64933Qa(C36441kJ.A0n(r0), C237919w.A00(r0, r5), true), C19970wo.A00(this.A08));
        r52.A0I = C19970wo.A00(this.A08);
        r52.A0n(5);
        r52.A16(str2);
        setBackgroundResource(0);
        setOrientation(1);
        AnonymousClass2IN r02 = new AnonymousClass2IN(context, r11, r2);
        this.A06 = r02;
        r02.A24(true);
        this.A06.setEnabled(false);
        this.A00 = C012005e.A02(this.A06, R.id.date_wrapper);
        this.A03 = C36391kE.A0O(this.A06, R.id.message_text);
        this.A02 = C36391kE.A0O(this.A06, R.id.conversation_row_date_divider);
        AnonymousClass2IN r03 = new AnonymousClass2IN(context, r11, r52);
        this.A07 = r03;
        r03.A24(false);
        this.A07.setEnabled(false);
        this.A01 = C012005e.A02(this.A07, R.id.date_wrapper);
        this.A04 = C36391kE.A0O(this.A07, R.id.message_text);
        addView(this.A06);
        addView(this.A07);
    }

    public WallpaperMockChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0A) {
            this.A0A = true;
            C27861Qc.A0s((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    public WallpaperMockChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0A) {
            this.A0A = true;
            C27861Qc.A0s((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }
}
