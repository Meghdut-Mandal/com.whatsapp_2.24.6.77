package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import java.io.File;

/* renamed from: X.6XC  reason: invalid class name */
public abstract class AnonymousClass6XC {
    public static void A04(C18820ts r4, C46812bi r5, AnonymousClass7hV r6, AudioPlayerView audioPlayerView) {
        int intValue;
        long j;
        Number A10 = C36441kJ.A10(r5.A1J, C148826zU.A13);
        if (A10 == null) {
            intValue = 0;
        } else {
            intValue = A10.intValue();
        }
        Integer valueOf = Integer.valueOf(intValue);
        int i = 0;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(r5.A0B * 1000);
        if (valueOf != null) {
            i = intValue;
        }
        audioPlayerView.setSeekbarProgress(i);
        if (valueOf != null) {
            j = (long) intValue;
        } else {
            j = 0;
        }
        audioPlayerView.setSeekbarContentDescription(j);
        r6.Bcq(1, AnonymousClass3UY.A07(r4, (long) r5.A0B));
    }

    public static String A00(C18820ts r2, C46812bi r3) {
        if (C66013Ui.A0z(r3) || C66013Ui.A10(r3) || r3.A0B != 0) {
            return AnonymousClass3UY.A07(r2, (long) r3.A0B);
        }
        return AnonymousClass3TF.A02(r2, r3.A00);
    }

    public static void A01(Activity activity, boolean z) {
        View findViewById = activity.findViewById(R.id.proximity_overlay);
        if (findViewById != null) {
            findViewById.setVisibility(C90514aH.A0A(z ? 1 : 0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r1.A0I == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.view.View.OnClickListener r4, android.view.View.OnClickListener r5, android.view.View.OnClickListener r6, android.view.View.OnClickListener r7, X.C46812bi r8, X.AnonymousClass7hX r9, com.whatsapp.search.views.itemviews.AudioPlayerView r10) {
        /*
            X.3Qj r1 = X.AnonymousClass2bU.A00(r8)
            boolean r0 = X.C66013Ui.A0z(r8)
            r3 = 0
            if (r0 == 0) goto L_0x001a
            r0 = 4
            r10.setPlayButtonState(r0)
            r10.setOnControlButtonClickListener(r4)
            r10.setSeekbarProgress(r3)
            r0 = 1
            r9.BhL(r0)
            return
        L_0x001a:
            boolean r0 = X.C66013Ui.A10(r8)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r8.A1b()
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 == 0) goto L_0x0034
            java.io.File r0 = r1.A0I
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.getName()
            r8.A06 = r0
        L_0x0034:
            android.content.Context r1 = r10.getContext()
            r0 = 2131101755(0x7f06083b, float:1.7815929E38)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r10.setSeekbarColor(r0)
            r10.setOnControlButtonClickListener(r7)
        L_0x0045:
            r9.BhL(r3)
            return
        L_0x0049:
            X.3Qj r1 = r8.A01
            X.3Qa r0 = r8.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x0058
            java.io.File r1 = r1.A0I
            r0 = 1
            if (r1 != 0) goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            r2 = 2
            r3 = 3
            if (r0 == 0) goto L_0x0072
            r10.setPlayButtonState(r2)
            r10.setOnControlButtonClickListener(r5)
            android.content.Context r1 = r10.getContext()
            r0 = 2131101755(0x7f06083b, float:1.7815929E38)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r10.setSeekbarColor(r0)
            goto L_0x0045
        L_0x0072:
            r10.setPlayButtonState(r3)
            r10.setOnControlButtonClickListener(r6)
            android.content.Context r1 = r10.getContext()
            r0 = 2131101755(0x7f06083b, float:1.7815929E38)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r10.setSeekbarColor(r0)
            r9.BhL(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XC.A02(android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, X.2bi, X.7hX, com.whatsapp.search.views.itemviews.AudioPlayerView):void");
    }

    public static void A03(C160817ld r4, AnonymousClass1V6 r5, C18820ts r6, C46812bi r7, AnonymousClass7hV r8, AudioPlayerView audioPlayerView) {
        if (!r5.A0D(r7) || r5.A0C()) {
            A04(r6, r7, r8, audioPlayerView);
            return;
        }
        C148826zU A00 = r5.A00();
        if (A00 != null) {
            if (!A00.A0I()) {
                A04(r6, r7, r8, audioPlayerView);
            } else {
                audioPlayerView.setPlayButtonState(1);
                r8.Bcq(0, AnonymousClass3UY.A07(r6, (long) (A00.A0A() / 1000)));
            }
            audioPlayerView.setSeekbarContentDescription((long) A00.A0A());
            A00.A0G = r4;
        }
    }

    public static boolean A05(Context context, AnonymousClass17Y r6, C46812bi r7, AnonymousClass7hW r8, AnonymousClass1X7 r9, AnonymousClass1SV r10) {
        char c;
        File file;
        C65013Qj r0;
        C65013Qj A00 = AnonymousClass2bU.A00(r7);
        C18740tg.A06(A00);
        if (A00.A0f) {
            c = 0;
        } else {
            c = 1;
            if (A00.A09 != 1) {
                if (A00.A0V && (file = A00.A0I) != null) {
                    File A0c = C90484aE.A0c(Uri.fromFile(file));
                    if (!A0c.exists() || !A0c.canRead()) {
                        c = 2;
                    }
                }
                c = 3;
            }
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    File A0c2 = C90484aE.A0c(Uri.fromFile(A00.A0I));
                    if (!A0c2.exists() || !A0c2.canRead()) {
                        if (r7.A1J.A02 || (r0 = r7.A01) == null) {
                            C225314u r02 = (C225314u) C18860tw.A01(context, C225314u.class);
                            if (r02 != null) {
                                r9.A03(r02);
                                return false;
                            }
                        } else {
                            r0.A0c = true;
                            r10.A0H(r7);
                            r8.BXu();
                        }
                    }
                }
                return true;
            }
            r6.A04(R.string.f12nameremoved, 1);
            return false;
        }
        return false;
    }
}
