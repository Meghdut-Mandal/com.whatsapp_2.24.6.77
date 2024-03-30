package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.EmojiContainerView;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.4XT  reason: invalid class name */
public class AnonymousClass4XT implements View.OnLongClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public AnonymousClass4XT(Resources resources, ImageView imageView, WaTextView waTextView, AnonymousClass1XQ r4, EmojiContainerView emojiContainerView, MessageReplyActivity messageReplyActivity, int i) {
        this.A06 = i;
        this.A00 = messageReplyActivity;
        this.A01 = r4;
        this.A02 = emojiContainerView;
        this.A03 = imageView;
        this.A04 = resources;
        this.A05 = waTextView;
    }

    public final boolean onLongClick(View view) {
        PopupWindow r6;
        int i = this.A06;
        MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
        AnonymousClass1XQ r0 = (AnonymousClass1XQ) this.A01;
        View view2 = (View) this.A02;
        ImageView imageView = (ImageView) this.A03;
        Resources resources = (Resources) this.A04;
        WaTextView waTextView = (WaTextView) this.A05;
        GridLayout gridLayout = messageReplyActivity.A06;
        if (i != 0) {
            r6 = new C38851qK(imageView, new C74253lJ(resources, view2, gridLayout, imageView, waTextView, messageReplyActivity, false), messageReplyActivity.A0C, r0.A00, C36401kF.A1V(messageReplyActivity));
        } else {
            r6 = new C38881qN(imageView, new C74253lJ(resources, view2, gridLayout, imageView, waTextView, messageReplyActivity, true), messageReplyActivity.A0C, r0.A00, C36401kF.A1V(messageReplyActivity));
        }
        AnonymousClass3TC.A01(imageView, view2.getRootView(), r6);
        return true;
    }
}
