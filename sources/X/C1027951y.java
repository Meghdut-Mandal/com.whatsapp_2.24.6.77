package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.51y  reason: invalid class name and case insensitive filesystem */
public abstract class C1027951y extends C1043059c {
    public C226815j A00;
    public AnonymousClass141 A01;
    public C106435Jr A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final AnonymousClass16I A05;
    public final AnonymousClass1RY A06;
    public final C20430xY A07;
    public final C18820ts A08;
    public final C20810yC A09;
    public final WDSProfilePhoto A0A;
    public final AnonymousClass652 A0B;

    public void A0D() {
        AnonymousClass16I r1 = this.A05;
        C226815j r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("contactObserver");
        }
        r1.unregisterObserver(r0);
    }

    public void A0G(C106435Jr r15, List list) {
        Double d;
        Double d2;
        Double d3;
        Double d4;
        int i;
        this.A02 = r15;
        C222713q r1 = AnonymousClass11F.A00;
        AnonymousClass6E6 r2 = r15.A02;
        this.A01 = new AnonymousClass141(r1.A02(r2.A07));
        TextEmojiLabel textEmojiLabel = this.A03;
        String str = r2.A0A;
        List<C1277569n> list2 = r2.A0B;
        SpannableStringBuilder A0P = C36441kJ.A0P(str);
        for (C1277569n r0 : list2) {
            int i2 = r0.A01;
            if (i2 >= 0 && (i = r0.A00) < str.length()) {
                A0P.setSpan(new ForegroundColorSpan(AnonymousClass00F.A00(textEmojiLabel.getContext(), R.color.f6nameremoved)), i2, i + 1, 33);
            }
        }
        textEmojiLabel.setText(A0P);
        Integer num = r2.A04;
        if (num == null || num.intValue() != 2) {
            textEmojiLabel.A0E();
        } else {
            textEmojiLabel.A0F(C55832vG.A00(this.A09), R.dimen.f7nameremoved);
        }
        String str2 = r2.A09;
        if (str2 == null || str2.length() == 0) {
            this.A04.setVisibility(8);
        } else {
            TextEmojiLabel textEmojiLabel2 = this.A04;
            textEmojiLabel2.setVisibility(0);
            C18740tg.A06(str2);
            AnonymousClass00C.A0B(str2);
            if (AnonymousClass099.A0O(str2, "{distance}", false)) {
                AnonymousClass6QG r7 = r15.A01;
                if (!(!r7.A06() || (d = r2.A00) == null || (d2 = r2.A01) == null)) {
                    double doubleValue = d.doubleValue();
                    if (!Double.isNaN(doubleValue)) {
                        double doubleValue2 = d2.doubleValue();
                        if (!(Double.isNaN(doubleValue2) || doubleValue == 0.0d || doubleValue2 == 0.0d || (d3 = r7.A03) == null || (d4 = r7.A04) == null)) {
                            C18740tg.A06(d3);
                            double doubleValue3 = d3.doubleValue();
                            C18740tg.A06(d4);
                            LatLng A0S = C90484aE.A0S(d4, doubleValue3);
                            C18740tg.A06(d);
                            double doubleValue4 = d.doubleValue();
                            C18740tg.A06(d2);
                            String A002 = C110165aE.A00(C36441kJ.A0F(this), C36401kF.A0x(this.A08), C90474aD.A0J(A0S, "origin").distanceTo(C90474aD.A0J(C90484aE.A0S(d2, doubleValue4), "destination")));
                            AnonymousClass00C.A0B(str2);
                            AnonymousClass00C.A0B(A002);
                            str2 = AnonymousClass098.A05(str2, "{distance}", A002, false);
                        }
                    }
                }
            }
            textEmojiLabel2.setText(str2);
        }
        C36411kG.A1C(this.A0H, this, r15, 32);
        AnonymousClass652 r22 = this.A0B;
        AnonymousClass141 r12 = this.A01;
        if (r12 == null) {
            throw C36331k8.A0d("waContact");
        }
        WDSProfilePhoto wDSProfilePhoto = this.A0A;
        AnonymousClass00C.A0D(wDSProfilePhoto, 1);
        this.A00 = new AnonymousClass545(wDSProfilePhoto, r22, r12);
        AnonymousClass16I r3 = this.A05;
        Iterable observers = r3.getObservers();
        AnonymousClass00C.A08(observers);
        C226815j r02 = this.A00;
        if (r02 == null) {
            throw C36331k8.A0d("contactObserver");
        }
        if (!C007103b.A0j(observers, r02)) {
            C226815j r03 = this.A00;
            if (r03 == null) {
                throw C36331k8.A0d("contactObserver");
            }
            r3.registerObserver(r03);
        }
        AnonymousClass1RY r13 = this.A06;
        AnonymousClass141 r04 = this.A01;
        if (r04 == null) {
            throw C36331k8.A0d("waContact");
        }
        r13.A08(wDSProfilePhoto, r04);
    }

    public C1027951y(View view, AnonymousClass652 r3, AnonymousClass16I r4, AnonymousClass1RY r5, C20430xY r6, C18820ts r7, C20810yC r8) {
        super(view);
        this.A09 = r8;
        this.A08 = r7;
        this.A05 = r4;
        this.A07 = r6;
        this.A06 = r5;
        this.A0B = r3;
        this.A03 = C36351kA.A0O(view, R.id.business_header);
        this.A0A = (WDSProfilePhoto) C36361kB.A0G(view, R.id.profile_photo);
        this.A04 = C36351kA.A0O(view, R.id.business_sub_text);
    }
}
