package X;

import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.polls.PollCreatorViewModel;

/* renamed from: X.5HD  reason: invalid class name */
public class AnonymousClass5HD extends C96544nV {
    public int A00 = -1;
    public final Drawable A01;
    public final WaEditText A02;
    public final C21060yb A03;
    public final AnonymousClass1RJ A04;
    public final AnonymousClass1RJ A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5HD(View view, C21060yb r13, C18820ts r14, AnonymousClass1N0 r15, AnonymousClass1H2 r16, C20810yC r17, PollCreatorViewModel pollCreatorViewModel, C19890wg r19) {
        super(view);
        C21060yb r5 = r13;
        this.A03 = r13;
        this.A04 = C36341k9.A0X(view, R.id.duplicated_option);
        this.A05 = C36341k9.A0X(view, R.id.max_option_text_view);
        WaEditText waEditText = (WaEditText) C012005e.A02(view, R.id.poll_option_edit_text);
        this.A02 = waEditText;
        waEditText.setRawInputType(16385);
        PollCreatorViewModel pollCreatorViewModel2 = pollCreatorViewModel;
        waEditText.setOnFocusChangeListener(new C163247pt(pollCreatorViewModel2, this, 2));
        waEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2500), new C66763Xf(r17.A07(1407))});
        C33521fV.A05(waEditText, R.string.f12nameremoved);
        Drawable mutate = C36381kD.A0H(view.getContext(), R.drawable.sticker_store_reorder).mutate();
        this.A01 = mutate;
        mutate.setAlpha(0);
        if (C36401kF.A1X(r14)) {
            waEditText.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            waEditText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
        }
        waEditText.addTextChangedListener(new AnonymousClass5LG(r5, r15, r16, this, pollCreatorViewModel2, r19));
    }
}
