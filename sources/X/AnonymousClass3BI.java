package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.status.playback.widget.AudioVolumeView;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;

/* renamed from: X.3BI  reason: invalid class name */
public final class AnonymousClass3BI {
    public Button A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final ViewStub A08;
    public final FrameLayout A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final AudioVolumeView A0E;
    public final StatusPlaybackProgressView A0F;

    public AnonymousClass3BI(View view) {
        AnonymousClass00C.A0D(view, 1);
        this.A09 = (FrameLayout) C36361kB.A0G(view, R.id.root_view);
        this.A07 = (ViewGroup) C36361kB.A0G(view, R.id.status_container);
        this.A0F = (StatusPlaybackProgressView) C36361kB.A0G(view, R.id.playback_progress);
        this.A0D = C36341k9.A0M(view, R.id.date);
        this.A0C = C36341k9.A0M(view, R.id.cta);
        this.A0A = C36341k9.A0L(view, R.id.back);
        this.A0E = (AudioVolumeView) C36361kB.A0G(view, R.id.volume);
        this.A06 = C36361kB.A0G(view, R.id.title_bar);
        this.A05 = C36361kB.A0G(view, R.id.title_protection);
        this.A01 = C36361kB.A0G(view, R.id.header);
        this.A04 = C36361kB.A0G(view, R.id.status_header);
        this.A03 = C36361kB.A0G(view, R.id.menu);
        this.A02 = C36361kB.A0G(view, R.id.progress);
        this.A0B = C36341k9.A0L(view, R.id.profile_picture);
        ViewStub viewStub = (ViewStub) C36361kB.A0G(view, R.id.action_link_button_view_stub);
        this.A08 = viewStub;
        viewStub.setVisibility(8);
    }
}
