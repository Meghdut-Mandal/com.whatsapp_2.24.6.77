package com.whatsapp.voicetranscription;

import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.C05250Oz;
import X.C18700tb;
import X.C36341k9;
import X.C36381kD;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class AudioTranscriptionView extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final WaTextView A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AudioTranscriptionView(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AudioTranscriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public /* synthetic */ AudioTranscriptionView(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioTranscriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A02 = C36341k9.A0Q(this, R.id.transcription_text_view);
    }
}
