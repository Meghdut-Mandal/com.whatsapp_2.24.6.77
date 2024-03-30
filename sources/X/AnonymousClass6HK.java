package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import java.io.File;

/* renamed from: X.6HK  reason: invalid class name */
public abstract class AnonymousClass6HK {
    public static void A00(WebpUtils webpUtils, File file, Boolean bool, String str) {
        long j;
        WebpInfo A01 = webpUtils.A01(file.getAbsolutePath());
        int length = (int) (file.length() / 1024);
        if (A01 == null) {
            throw new AnonymousClass1AU(AnonymousClass000.A0p("sticker file might be corrupted or invalid, sticker: ", str, AnonymousClass000.A0u()));
        } else if (A01.height != 512) {
            throw new AnonymousClass1AU(AnonymousClass000.A0p("sticker height should be 512, sticker: ", str, AnonymousClass000.A0u()));
        } else if (A01.width == 512) {
            int i = A01.numFrames;
            if (i > 1) {
                if (bool != null && !bool.booleanValue()) {
                    throw new AnonymousClass1AU(AnonymousClass000.A0p("pack is not marked as animated pack but contains animated stickers. sticker: ", str, AnonymousClass000.A0u()));
                } else if (A01.minFrameDurationMS < 8) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("frame duration for any frame should exceed ");
                    A0u.append(8);
                    throw new AnonymousClass1AU(AnonymousClass000.A0p(" ms. sticker: ", str, A0u));
                } else if (A01.totalAnimationDurationMS > ((long) SearchActionVerificationClientService.NOTIFICATION_ID)) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("total animation duration should be under ");
                    A0u2.append(SearchActionVerificationClientService.NOTIFICATION_ID);
                    throw new AnonymousClass1AU(AnonymousClass000.A0p(" ms. sticker: ", str, A0u2));
                }
            } else if (bool != null && bool.booleanValue()) {
                throw new AnonymousClass1AU(AnonymousClass000.A0p("pack is marked as animated pack but contains non animated stickers. All stickers in animated pack should be animated sticker. check sticker: ", str, AnonymousClass000.A0u()));
            }
            long j2 = (long) length;
            if (i > 1) {
                j = (long) 500;
            } else {
                j = 100;
            }
            if (j2 > j) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("sticker file should be less than ");
                A0u3.append(j);
                throw new AnonymousClass1AU(AnonymousClass000.A0p(" kB, file: ", str, A0u3));
            }
        } else {
            throw new AnonymousClass1AU(AnonymousClass000.A0p("sticker width should be  512, sticker: ", str, AnonymousClass000.A0u()));
        }
    }

    public static boolean A01(String str, String str2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("https://");
        A0u.append(str2);
        if (!str.startsWith(AnonymousClass000.A0q("/", A0u))) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            AnonymousClass000.A1D("http://", str2, "/", A0u2);
            if (str.startsWith(A0u2.toString())) {
                return true;
            }
            return false;
        }
        return true;
    }
}
