package X;

import com.whatsapp.conversation.ui.AudioPlayerMetadataView;

public class B7T extends C136176dt {
    public Object A00;
    public final int A01;

    public B7T(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(int i) {
        AudioPlayerMetadataView audioPlayerMetadataView;
        C18820ts whatsAppLocale;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                C182508pC r0 = (C182508pC) obj;
                r0.A00.setDuration(AnonymousClass3UY.A07(r0.A02, (long) i));
                return;
            case 1:
                C182528pE r02 = (C182528pE) obj;
                audioPlayerMetadataView = r02.A04;
                if (audioPlayerMetadataView != null) {
                    whatsAppLocale = r02.getWhatsAppLocale();
                    break;
                } else {
                    throw C36331k8.A0d("audioPlayerMetadataView");
                }
            default:
                C182518pD r03 = (C182518pD) obj;
                audioPlayerMetadataView = r03.A04;
                whatsAppLocale = r03.A05;
                break;
        }
        audioPlayerMetadataView.setDescription(AnonymousClass3UY.A07(whatsAppLocale, (long) i));
    }
}
