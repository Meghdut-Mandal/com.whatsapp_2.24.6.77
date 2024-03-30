package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.AddScreenshotImageView;

/* renamed from: X.1qW  reason: invalid class name and case insensitive filesystem */
public final class C38941qW extends RelativeLayout implements C18700tb {
    public FrameLayout A00;
    public C20810yC A01;
    public C21010yW A02;
    public AnonymousClass4OB A03;
    public AnonymousClass4OC A04;
    public AddScreenshotImageView A05;
    public AnonymousClass1RJ A06;
    public AnonymousClass1RJ A07;
    public AnonymousClass1QZ A08;
    public boolean A09;

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setAddScreenshotImageView(AddScreenshotImageView addScreenshotImageView) {
        AnonymousClass00C.A0D(addScreenshotImageView, 0);
        this.A05 = addScreenshotImageView;
    }

    public final void setOnRemoveScreenshotListener(AnonymousClass4OB r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setOnRetryListener(AnonymousClass4OC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setRemoveButton(FrameLayout frameLayout) {
        AnonymousClass00C.A0D(frameLayout, 0);
        this.A00 = frameLayout;
    }

    public final void setScreenshot(Bitmap bitmap) {
        AnonymousClass00C.A0D(bitmap, 0);
        getAddScreenshotImageView().setScreenshot(bitmap);
        setRemoveButtonVisibility(true);
    }

    public final void setWamRuntime(C21010yW r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A08;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final AddScreenshotImageView getAddScreenshotImageView() {
        AddScreenshotImageView addScreenshotImageView = this.A05;
        if (addScreenshotImageView != null) {
            return addScreenshotImageView;
        }
        throw C36331k8.A0d("addScreenshotImageView");
    }

    public final FrameLayout getRemoveButton() {
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw C36331k8.A0d("removeButton");
    }

    public final C21010yW getWamRuntime() {
        C21010yW r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("wamRuntime");
    }

    public final void setRetryLayoutVisibility(boolean z) {
        AnonymousClass1RJ r1 = this.A07;
        if (r1 == null) {
            throw C36331k8.A0d("mediaUploadRetryViewStubHolder");
        }
        r1.A03(C36351kA.A00(z ? 1 : 0));
    }

    public final void setUploadProgressBarVisibility(boolean z) {
        AnonymousClass1RJ r1 = this.A06;
        if (r1 == null) {
            throw C36331k8.A0d("mediaUploadProgressViewStubHolder");
        }
        r1.A03(C36351kA.A00(z ? 1 : 0));
    }

    public C38941qW(Context context) {
        super(context);
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A02 = C36351kA.A0g(A0W);
            this.A01 = C36341k9.A0V(A0W);
        }
        View inflate = View.inflate(getContext(), R.layout.f9nameremoved, this);
        setAddScreenshotImageView((AddScreenshotImageView) C36361kB.A0F(inflate, R.id.screenshot_imageview));
        setRemoveButton((FrameLayout) C36361kB.A0F(inflate, R.id.remove_button));
        this.A06 = C36341k9.A0Y(inflate, R.id.media_upload_progress_bar_stub);
        this.A07 = C36341k9.A0Y(inflate, R.id.media_upload_retry_stub);
        setRemoveButtonVisibility(false);
        AnonymousClass3Y3.A00(getRemoveButton(), this, 11);
        AnonymousClass1RJ r2 = this.A07;
        if (r2 == null) {
            throw C36331k8.A0d("mediaUploadRetryViewStubHolder");
        }
        r2.A05(new AnonymousClass3Y3(this, 12));
    }

    public final void setRemoveButtonVisibility(boolean z) {
        getRemoveButton().setVisibility(C36351kA.A00(z ? 1 : 0));
    }
}
