package X;

import android.text.InputFilter;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.polls.PollCreatorViewModel;

/* renamed from: X.5HC  reason: invalid class name */
public class AnonymousClass5HC extends C96544nV {
    public final WaEditText A00;
    public final WaTextView A01;
    public final boolean A02;

    public AnonymousClass5HC(View view, C21060yb r13, AnonymousClass1N0 r14, AnonymousClass1H2 r15, C20810yC r16, PollCreatorViewModel pollCreatorViewModel, C19890wg r18) {
        super(view);
        C20810yC r4 = r16;
        this.A02 = C55752v8.A00(r4);
        this.A01 = C36401kF.A0Q(view, R.id.poll_question_label);
        WaEditText waEditText = (WaEditText) C012005e.A02(view, R.id.poll_question_edit_text);
        this.A00 = waEditText;
        waEditText.setRawInputType(16385);
        waEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5000), new C66763Xf(r4.A07(1406))});
        waEditText.setOnFocusChangeListener(new C163247pt(view, this, 3));
        waEditText.addTextChangedListener(new C135216cL(r13, r14, r15, this, pollCreatorViewModel, r18));
        waEditText.requestFocus();
    }
}
