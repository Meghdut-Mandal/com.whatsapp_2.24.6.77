package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;

/* renamed from: X.52p  reason: invalid class name and case insensitive filesystem */
public class C1029352p extends C97014oG {
    public final TextEmojiLabel A00;
    public final WaTextView A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass171 A03;
    public final C20350xQ A04;
    public final AnonymousClass1C6 A05;

    public C1029352p(View view, ParticipantsListViewModel participantsListViewModel, AnonymousClass16D r4, AnonymousClass171 r5, C20350xQ r6, AnonymousClass1C6 r7) {
        super(view, participantsListViewModel);
        this.A00 = C36401kF.A0O(view, R.id.group_name);
        this.A01 = C36401kF.A0Q(view, R.id.participant_count);
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }
}
