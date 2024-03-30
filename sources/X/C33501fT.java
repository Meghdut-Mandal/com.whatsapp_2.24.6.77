package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;

/* renamed from: X.1fT  reason: invalid class name and case insensitive filesystem */
public class C33501fT extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final WaImageView A04;
    public final WaImageView A05;
    public final WaTextView A06;
    public final WaTextView A07;

    public C33501fT(Context context, int i) {
        super(context, (AttributeSet) null, 0);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, false);
        this.A02 = inflate;
        WaImageView waImageView = (WaImageView) C012005e.A02(inflate, R.id.archived_row_image);
        this.A04 = waImageView;
        WaTextView waTextView = (WaTextView) C012005e.A02(inflate, R.id.archived_row);
        this.A07 = waTextView;
        this.A06 = (WaTextView) C012005e.A02(inflate, R.id.archive_row_counter);
        this.A03 = C012005e.A02(inflate, R.id.content_indicator_container);
        WaImageView waImageView2 = (WaImageView) C012005e.A02(inflate, R.id.archive_row_important_chat_indicator);
        this.A05 = waImageView2;
        C33511fU.A03(waTextView);
        C33521fV.A02(inflate);
        AnonymousClass06T.A00(AnonymousClass00F.A04(context, R.color.f6nameremoved), waImageView);
        AnonymousClass06T.A00(AnonymousClass00F.A04(context, R.color.f6nameremoved), waImageView2);
        waTextView.setTextColor(AnonymousClass00F.A04(context, R.color.f6nameremoved));
        this.A06.setTextColor(AnonymousClass00F.A04(context, i != 1 ? R.color.f6nameremoved : R.color.f6nameremoved));
        addView(inflate);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass1QZ(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setEnableState(boolean z) {
        this.A02.setClickable(z);
        this.A07.setEnabled(z);
        this.A04.setEnabled(z);
        this.A06.setEnabled(z);
        this.A05.setEnabled(z);
    }

    public void setImportantMessageTag(int i) {
        this.A05.setTag(Integer.valueOf(i));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setVisibility(boolean z) {
        View view = this.A02;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public void setContentIndicatorText(String str) {
        View view;
        if (TextUtils.isEmpty(str)) {
            Log.i("archive/set-content-indicator-to-empty");
            view = this.A03;
        } else {
            this.A03.setVisibility(0);
            boolean equals = "@".equals(str);
            WaImageView waImageView = this.A05;
            if (equals) {
                waImageView.setVisibility(0);
                view = this.A06;
            } else {
                waImageView.setVisibility(8);
                WaTextView waTextView = this.A06;
                waTextView.setText(str);
                waTextView.setVisibility(0);
                return;
            }
        }
        view.setVisibility(8);
    }
}
