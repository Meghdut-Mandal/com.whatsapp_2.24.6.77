package X;

import android.view.View;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

/* renamed from: X.4Ec  reason: invalid class name and case insensitive filesystem */
public final class C84664Ec extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ WDSTextLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84664Ec(WDSTextLayout wDSTextLayout) {
        super(0);
        this.this$0 = wDSTextLayout;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C51372ni r3;
        C63013Ik r32;
        C63013Ik r0;
        C56012va r7;
        C51372ni r33;
        C63013Ik r8;
        C63013Ik r9;
        WDSTextLayout wDSTextLayout = this.this$0;
        C51122nJ layoutStyle = wDSTextLayout.getLayoutStyle();
        if (layoutStyle != null) {
            int ordinal = layoutStyle.ordinal();
            if (ordinal == 0) {
                C51392nk layoutSize = wDSTextLayout.getLayoutSize();
                if (layoutSize == null) {
                    layoutSize = C51392nk.MEDIUM;
                }
                int ordinal2 = layoutSize.ordinal();
                if (ordinal2 == 0) {
                    r3 = C51372ni.SMALL;
                } else if (ordinal2 == 1) {
                    r3 = C51372ni.MEDIUM;
                } else {
                    throw C36441kJ.A18();
                }
                C63323Jp r6 = new C63323Jp(wDSTextLayout.getHeaderImage(), r3, wDSTextLayout.getHeadlineText(), wDSTextLayout.getDescriptionText());
                CharSequence footnoteText = wDSTextLayout.getFootnoteText();
                String primaryButtonText = wDSTextLayout.getPrimaryButtonText();
                View.OnClickListener primaryButtonClickListener = wDSTextLayout.getPrimaryButtonClickListener();
                if (primaryButtonText != null) {
                    r32 = new C63013Ik(primaryButtonClickListener, primaryButtonText);
                } else {
                    r32 = null;
                }
                String secondaryButtonText = wDSTextLayout.getSecondaryButtonText();
                View.OnClickListener secondaryButtonClickListener = wDSTextLayout.getSecondaryButtonClickListener();
                if (secondaryButtonText != null) {
                    r0 = new C63013Ik(secondaryButtonClickListener, secondaryButtonText);
                } else {
                    r0 = null;
                }
                r7 = new C50992my(r32, r0, r6, footnoteText);
            } else if (ordinal == 1) {
                C51392nk layoutSize2 = wDSTextLayout.getLayoutSize();
                if (layoutSize2 == null) {
                    layoutSize2 = C51392nk.MEDIUM;
                }
                int ordinal3 = layoutSize2.ordinal();
                if (ordinal3 == 0) {
                    r33 = C51372ni.SMALL;
                } else if (ordinal3 == 1) {
                    r33 = C51372ni.MEDIUM;
                } else {
                    throw C36441kJ.A18();
                }
                C63323Jp r10 = new C63323Jp(wDSTextLayout.getHeaderImage(), r33, wDSTextLayout.getHeadlineText(), wDSTextLayout.getDescriptionText());
                C51382nj footnotePosition = wDSTextLayout.getFootnotePosition();
                if (footnotePosition == null) {
                    footnotePosition = C51382nj.CONTENT_END;
                }
                AnonymousClass2vZ content = wDSTextLayout.getContent();
                CharSequence footnoteText2 = wDSTextLayout.getFootnoteText();
                String primaryButtonText2 = wDSTextLayout.getPrimaryButtonText();
                View.OnClickListener primaryButtonClickListener2 = wDSTextLayout.getPrimaryButtonClickListener();
                if (primaryButtonText2 != null) {
                    r8 = new C63013Ik(primaryButtonClickListener2, primaryButtonText2);
                } else {
                    r8 = null;
                }
                String secondaryButtonText2 = wDSTextLayout.getSecondaryButtonText();
                View.OnClickListener secondaryButtonClickListener2 = wDSTextLayout.getSecondaryButtonClickListener();
                if (secondaryButtonText2 != null) {
                    r9 = new C63013Ik(secondaryButtonClickListener2, secondaryButtonText2);
                } else {
                    r9 = null;
                }
                r7 = new C51002mz(r8, r9, r10, footnotePosition, content, footnoteText2);
            } else {
                throw C36441kJ.A18();
            }
            wDSTextLayout.setTextLayoutViewState(r7);
        }
        return AnonymousClass0AJ.A00;
    }
}
