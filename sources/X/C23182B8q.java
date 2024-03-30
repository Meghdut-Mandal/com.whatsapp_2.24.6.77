package X;

import com.whatsapp.conversation.ui.AudioPlayerMetadataView;

/* renamed from: X.B8q  reason: case insensitive filesystem */
public class C23182B8q implements C22932Ayi {
    public Object A00;
    public final int A01;

    public C23182B8q(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BWJ(int i) {
        AudioPlayerMetadataView audioPlayerMetadataView;
        C18820ts whatsAppLocale;
        switch (this.A01) {
            case 0:
                C175058Zm r3 = (C175058Zm) this.A00;
                r3.setDuration(AnonymousClass3UY.A07(r3.A0E, (long) i));
                return;
            case 1:
                C182508pC r0 = (C182508pC) this.A00;
                r0.A00.setDuration(AnonymousClass3UY.A07(r0.A02, (long) i));
                return;
            case 2:
                C182528pE r02 = (C182528pE) this.A00;
                audioPlayerMetadataView = r02.A04;
                if (audioPlayerMetadataView != null) {
                    whatsAppLocale = r02.getWhatsAppLocale();
                    break;
                } else {
                    throw C36331k8.A0d("audioPlayerMetadataView");
                }
            default:
                C182518pD r03 = (C182518pD) this.A00;
                audioPlayerMetadataView = r03.A04;
                whatsAppLocale = r03.A05;
                break;
        }
        audioPlayerMetadataView.setDescription(AnonymousClass3UY.A07(whatsAppLocale, (long) i));
    }
}
