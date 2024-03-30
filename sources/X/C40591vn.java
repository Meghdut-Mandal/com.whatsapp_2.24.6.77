package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1vn  reason: invalid class name and case insensitive filesystem */
public final class C40591vn extends AnonymousClass0CZ {
    public ArrayList A00;
    public List A01 = AnonymousClass001.A0I();
    public final /* synthetic */ GroupChangedParticipantsBottomSheet A02;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        List list = AnonymousClass0D3.A0I;
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = this.A02;
        return new C42351yg(C36371kC.A0J(groupChangedParticipantsBottomSheet.A0c(), viewGroup, R.layout.f9nameremoved, false), groupChangedParticipantsBottomSheet);
    }

    public C40591vn(GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet) {
        this.A02 = groupChangedParticipantsBottomSheet;
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        C42351yg r82 = (C42351yg) r8;
        AnonymousClass00C.A0D(r82, 0);
        AnonymousClass141 r3 = (AnonymousClass141) this.A01.get(i);
        r82.A01.setVisibility(8);
        AnonymousClass3SF r1 = r82.A03;
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            throw C36331k8.A0d("filterTerms");
        }
        r1.A08(r3, arrayList);
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = this.A02;
        AnonymousClass1RY r12 = groupChangedParticipantsBottomSheet.A07;
        if (r12 != null) {
            r12.A08(r82.A00, r3);
        }
        AnonymousClass171 r13 = groupChangedParticipantsBottomSheet.A06;
        if (r13 != null) {
            if (!r13.A0g(r3, -1) || r3.A0a == null) {
                r82.A02.setVisibility(8);
            } else {
                TextEmojiLabel textEmojiLabel = r82.A02;
                textEmojiLabel.getLayoutParams().width = -1;
                C18820ts r0 = groupChangedParticipantsBottomSheet.A09;
                if (r0 != null) {
                    boolean A1X = C36401kF.A1X(r0);
                    int i2 = 2;
                    if (A1X) {
                        i2 = 3;
                    }
                    textEmojiLabel.setTextAlignment(i2);
                    textEmojiLabel.setVisibility(0);
                    AnonymousClass171 r14 = groupChangedParticipantsBottomSheet.A06;
                    if (r14 != null) {
                        String A03 = AnonymousClass171.A03(r14, r3, R.string.f12nameremoved);
                        ArrayList arrayList2 = this.A00;
                        if (arrayList2 == null) {
                            throw C36331k8.A0d("filterTerms");
                        }
                        textEmojiLabel.A0J(A03, arrayList2, 0, false);
                    } else {
                        throw C36331k8.A0c();
                    }
                } else {
                    throw C36321k7.A09();
                }
            }
            r82.A0H.setTag(C36431kI.A0h(r3));
            return;
        }
        throw C36331k8.A0c();
    }
}
