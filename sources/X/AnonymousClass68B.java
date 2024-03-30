package X;

import java.util.List;

/* renamed from: X.68B  reason: invalid class name */
public class AnonymousClass68B {
    public int A00;
    public long A01;
    public long A02;
    public String A03;
    public List A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C135066c4 A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final String A0U;
    public final String A0V;

    public boolean A01() {
        String str;
        String str2 = this.A03;
        if (str2 == null || (str = this.A0G) == null || str2.equals(str)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("StickerPack{");
        stringBuffer.append("id='");
        stringBuffer.append(this.A0F);
        stringBuffer.append('\'');
        stringBuffer.append(", name='");
        stringBuffer.append(this.A0H);
        stringBuffer.append('\'');
        stringBuffer.append(", publisher='");
        stringBuffer.append(this.A0J);
        stringBuffer.append('\'');
        stringBuffer.append(", description='");
        stringBuffer.append(this.A0B);
        stringBuffer.append('\'');
        stringBuffer.append(", size=");
        stringBuffer.append(this.A02);
        stringBuffer.append(", isDownloading=");
        stringBuffer.append(this.A06);
        stringBuffer.append(", trayImageId='");
        stringBuffer.append(this.A0L);
        stringBuffer.append('\'');
        stringBuffer.append(", trayImagePreviewId='");
        stringBuffer.append(this.A0M);
        stringBuffer.append('\'');
        stringBuffer.append(", previewImageIds=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", stickers=");
        stringBuffer.append(this.A05);
        stringBuffer.append(", order=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isThirdParty=");
        stringBuffer.append(this.A0S);
        stringBuffer.append(", imageDataHash='");
        stringBuffer.append(this.A0G);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedSize=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", downloadedImageDataHash='");
        stringBuffer.append(this.A03);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedTrayImageId='");
        stringBuffer.append(this.A0U);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedTrayImagePreviewId='");
        stringBuffer.append(this.A0V);
        stringBuffer.append('\'');
        stringBuffer.append(", isUnseen=");
        stringBuffer.append(this.A09);
        stringBuffer.append(", isNew=");
        stringBuffer.append(this.A07);
        stringBuffer.append(", avoidCaching=");
        stringBuffer.append(this.A0O);
        stringBuffer.append(", playLink='");
        stringBuffer.append(this.A0I);
        stringBuffer.append('\'');
        stringBuffer.append(", iOSLink='");
        stringBuffer.append(this.A0E);
        stringBuffer.append('\'');
        stringBuffer.append(", animatedPack=");
        stringBuffer.append(this.A0N);
        stringBuffer.append(", downloadedAnimatedPack=");
        stringBuffer.append(this.A0P);
        stringBuffer.append(", isAvatarStickerPack=");
        stringBuffer.append(this.A0R);
        stringBuffer.append(", trayIconAvatarStickerTemplateId=");
        stringBuffer.append(this.A0K);
        stringBuffer.append(", emptyFavoritesAvatarStickerTemplateId=");
        stringBuffer.append(this.A0C);
        stringBuffer.append(", emptyRecentsAvatarStickerTemplateId=");
        stringBuffer.append(this.A0D);
        stringBuffer.append(", avatarStickerPackDynamicIcon=");
        stringBuffer.append(this.A0A);
        stringBuffer.append(", lottieStickerPack=");
        stringBuffer.append(this.A0T);
        stringBuffer.append(", downloadedLottieStickerPack=");
        stringBuffer.append(this.A0Q);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public AnonymousClass68B(AnonymousClass65S r3) {
        String str = r3.A0E;
        C18740tg.A06(str);
        this.A0F = str;
        String str2 = r3.A0G;
        C18740tg.A06(str2);
        this.A0H = str2;
        String str3 = r3.A0I;
        C18740tg.A06(str3);
        this.A0J = str3;
        this.A0B = r3.A03;
        this.A02 = r3.A01;
        this.A06 = r3.A0T;
        this.A0L = r3.A0K;
        this.A0M = r3.A0L;
        List list = r3.A0M;
        C18740tg.A06(list);
        this.A04 = list;
        this.A0S = r3.A0V;
        List list2 = r3.A0N;
        C18740tg.A06(list2);
        this.A05 = list2;
        this.A0G = r3.A0F;
        this.A01 = r3.A00;
        this.A03 = r3.A06;
        this.A0U = r3.A09;
        this.A0V = r3.A0A;
        this.A0O = r3.A0P;
        this.A0I = r3.A0H;
        this.A0E = r3.A0D;
        this.A0N = r3.A0O;
        this.A0T = r3.A0U;
        this.A0Q = r3.A0S;
        this.A0P = r3.A0Q;
        this.A0R = r3.A0R;
        this.A0K = r3.A0J;
        this.A0C = r3.A0B;
        this.A0D = r3.A0C;
        this.A0A = r3.A02;
    }

    public static boolean A00(Object obj, List list, int i) {
        return ((AnonymousClass68B) list.get(i)).A0F.equals(obj);
    }
}
