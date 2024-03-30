package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.8pH  reason: invalid class name and case insensitive filesystem */
public class C182558pH extends C182608pM {
    public C182518pD A00;
    public boolean A01;

    public /* bridge */ /* synthetic */ void A08(AnonymousClass141 r7, AnonymousClass141 r8, AnonymousClass3T1 r9, List list) {
        C46812bi r5 = (C46812bi) r9;
        super.A08(r7, r8, r5, list);
        setContentDescription(AnonymousClass3R0.A01(getContext(), this.A02, this.A03, this.A05, this.A06, r5));
    }

    public C182558pH(Context context, C33301f4 r2) {
        super(context, r2);
        A04();
    }

    public void A0A(C46812bi r2, List list) {
        super.A09(r2, list);
        this.A00.setAudioMessage(r2);
    }

    public void setVoiceNoteAttachmentView(C182518pD r1) {
        this.A00 = r1;
    }
}
