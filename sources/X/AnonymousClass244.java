package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellContextCardBodyViewModel;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellContextCardBodyViewModel$setDescriptionNewValue$1;

/* renamed from: X.244  reason: invalid class name */
public final class AnonymousClass244 extends TextEmojiLabel {
    public final Context A00;
    public final C61373Bp A01;
    public final C57172xo A02;
    public final AnonymousClass17Y A03;
    public final C61493Cc A04;
    public final AnonymousClass147 A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(new C83664Ag(this));

    public static final void A06(AnonymousClass244 r2) {
        AnonymousClass00C.A0D(r2, 0);
        GroupDescriptionAddUpsellContextCardBodyViewModel viewModel = r2.getViewModel();
        viewModel.A04.Boy(C80233v4.A00(viewModel, 31));
    }

    private final GroupDescriptionAddUpsellContextCardBodyViewModel getViewModel() {
        return (GroupDescriptionAddUpsellContextCardBodyViewModel) this.A06.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass244(Context context, C61373Bp r6, C57172xo r7, AnonymousClass17Y r8, C61493Cc r9, AnonymousClass147 r10) {
        super(context);
        C36321k7.A1B(r8, r9, r6, r7, context);
        AnonymousClass00C.A0D(r10, 6);
        this.A03 = r8;
        this.A04 = r9;
        this.A01 = r6;
        this.A02 = r7;
        this.A00 = context;
        this.A05 = r10;
        AnonymousClass088.A06(this, R.style.f13nameremoved);
        C36351kA.A15(getResources(), this, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
        setText(R.string.f12nameremoved);
        setGravity(17);
        setVisibility(8);
        AnonymousClass014 r3 = (AnonymousClass014) C24801Dv.A01(context, AnonymousClass155.class);
        C88554Td.A00(r3, getViewModel().A00, new C86074Jn(this), 43);
        C88554Td.A00(r3, getViewModel().A01, new C86084Jo(this), 44);
        setOnClickListener(new C66963Xz(this, 8));
    }

    /* access modifiers changed from: private */
    public final void setNewDescription(String str) {
        GroupDescriptionAddUpsellContextCardBodyViewModel viewModel = getViewModel();
        if (str == null) {
            str = "";
        }
        C36381kD.A1R(viewModel.A05, new GroupDescriptionAddUpsellContextCardBodyViewModel$setDescriptionNewValue$1(viewModel, str, (C023509x) null), C109325Xd.A00(viewModel));
    }
}
