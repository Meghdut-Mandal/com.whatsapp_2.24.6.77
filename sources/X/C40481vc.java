package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel;

/* renamed from: X.1vc  reason: invalid class name and case insensitive filesystem */
public final class C40481vc extends AnonymousClass0CZ {
    public final BonsaiPromptsViewModel A00;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        View inflate = C36331k8.A09(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
        return new C41921xz((TextEmojiLabel) inflate, this);
    }

    public int A0J() {
        return C36401kF.A00(this.A00.A05);
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        String A0w;
        C41921xz r82 = (C41921xz) r8;
        AnonymousClass00C.A0D(r82, 0);
        AnonymousClass69W r5 = (AnonymousClass69W) C36401kF.A0w(this.A00.A05).get(i);
        String str = r5.A00;
        if (str.length() == 0) {
            A0w = r5.A01;
        } else {
            A0w = C36411kG.A0w(r82.A0H.getResources(), r5.A01, C36411kG.A1b(str), 1, R.string.f12nameremoved);
            AnonymousClass00C.A0B(A0w);
        }
        C67143Yr r1 = new C67143Yr(this, i, 4);
        AnonymousClass00C.A0D(A0w, 0);
        TextEmojiLabel textEmojiLabel = r82.A00;
        textEmojiLabel.A0I(A0w);
        textEmojiLabel.setOnClickListener(r1);
    }

    public C40481vc(AnonymousClass012 r4, BonsaiPromptsViewModel bonsaiPromptsViewModel) {
        this.A00 = bonsaiPromptsViewModel;
        C55492ui.A01(r4, bonsaiPromptsViewModel.A05, new C85754Ih(this), 38);
    }
}
