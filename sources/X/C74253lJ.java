package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.3lJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C74253lJ implements AnonymousClass4QU {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ ImageView A03;
    public final /* synthetic */ WaTextView A04;
    public final /* synthetic */ MessageReplyActivity A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C74253lJ(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, WaTextView waTextView, MessageReplyActivity messageReplyActivity, boolean z) {
        this.A05 = messageReplyActivity;
        this.A06 = z;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A03 = imageView;
        this.A00 = resources;
        this.A04 = waTextView;
    }

    public final void Bgo(int[] iArr) {
        MessageReplyActivity messageReplyActivity = this.A05;
        boolean z = this.A06;
        ViewGroup viewGroup = this.A02;
        messageReplyActivity.A3j(this.A00, this.A01, viewGroup, this.A03, this.A04, iArr, z);
    }
}
