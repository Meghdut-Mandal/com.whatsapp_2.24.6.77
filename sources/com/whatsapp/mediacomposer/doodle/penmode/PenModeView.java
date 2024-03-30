package com.whatsapp.mediacomposer.doodle.penmode;

import X.AnonymousClass001;
import X.AnonymousClass3YG;
import X.AnonymousClass4OG;
import X.AnonymousClass4R4;
import X.C012005e;
import X.C146726w4;
import X.C146736w5;
import X.C146746w6;
import X.C146756w7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.List;

public class PenModeView extends FrameLayout {
    public AnonymousClass4OG A00;
    public final List A01 = AnonymousClass001.A0I();

    public PenModeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        A01(C146756w7.A00, R.id.pen_mode_thin);
        A01(C146736w5.A00, R.id.pen_mode_medium);
        A01(C146746w6.A00, R.id.pen_mode_thick);
        A01(C146726w4.A00, R.id.pen_mode_blur);
    }

    private void A01(AnonymousClass4R4 r3, int i) {
        View A02 = C012005e.A02(this, i);
        this.A01.add(A02);
        AnonymousClass3YG.A00(A02, this, r3, 41);
    }

    public void setOnSelectedListener(AnonymousClass4OG r1) {
        this.A00 = r1;
    }

    public PenModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PenModeView(Context context) {
        super(context);
        A00();
    }
}
