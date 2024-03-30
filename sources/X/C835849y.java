package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;

/* renamed from: X.49y  reason: invalid class name and case insensitive filesystem */
public final class C835849y extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C835849y(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        FrameLayout frameLayout = new FrameLayout(this.this$0);
        AddGroupParticipantsSelector addGroupParticipantsSelector = this.this$0;
        View A00 = C63713Lc.A00(addGroupParticipantsSelector.getLayoutInflater(), (ViewGroup) null, R.drawable.ic_share, R.string.f12nameremoved);
        C66943Xx.A00(A00, addGroupParticipantsSelector, 32);
        C33521fV.A02(A00);
        frameLayout.addView(A00);
        return frameLayout;
    }
}
