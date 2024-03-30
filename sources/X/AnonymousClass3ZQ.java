package X;

import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.group.GroupProfileEmojiEditor;

/* renamed from: X.3ZQ  reason: invalid class name */
public class AnonymousClass3ZQ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ GroupProfileEmojiEditor A04;

    public AnonymousClass3ZQ(GroupProfileEmojiEditor groupProfileEmojiEditor, int i, int i2, int i3, int i4) {
        this.A04 = groupProfileEmojiEditor;
        this.A02 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A01 = i4;
    }

    public void onGlobalLayout() {
        BottomSheetBehavior bottomSheetBehavior;
        int i;
        int A0S;
        int min;
        GroupProfileEmojiEditor groupProfileEmojiEditor = this.A04;
        C36351kA.A1C(groupProfileEmojiEditor.A02, this);
        int height = groupProfileEmojiEditor.A02.getHeight();
        int i2 = ((height - this.A02) - this.A00) - (this.A03 * 3);
        int i3 = height / 2;
        BottomSheetBehavior bottomSheetBehavior2 = groupProfileEmojiEditor.A05;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0D = Math.max(i3, i2);
            int i4 = this.A01;
            if (i2 < i4) {
                min = Math.max(i2, i3);
            } else {
                min = Math.min(i4, i3);
            }
            bottomSheetBehavior2.A0V(min);
        }
        if (groupProfileEmojiEditor.A01 != null && groupProfileEmojiEditor.A02 != null && (bottomSheetBehavior = groupProfileEmojiEditor.A05) != null && (i = bottomSheetBehavior.A0J) != 5) {
            if (i == 3) {
                A0S = bottomSheetBehavior.A0D;
            } else {
                A0S = bottomSheetBehavior.A0S();
            }
            GroupProfileEmojiEditor.A07(groupProfileEmojiEditor, A0S);
        }
    }
}
