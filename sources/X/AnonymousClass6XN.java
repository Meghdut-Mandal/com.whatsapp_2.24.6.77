package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6XN  reason: invalid class name */
public class AnonymousClass6XN {
    public float A00;
    public int A01;
    public C106565Kj A02;
    public AnonymousClass6Q0 A03;
    public boolean A04;
    public final Activity A05;
    public final HandlerThread A06;
    public final View A07;
    public final View A08;
    public final ViewGroup A09;
    public final AnonymousClass012 A0A;
    public final C18820ts A0B;
    public final AnonymousClass1H2 A0C;
    public final C20810yC A0D;
    public final MediaComposerFragment A0E;
    public final C104655Aq A0F;
    public final AnonymousClass6vC A0G;
    public final C158457gx A0H;
    public final C96184mv A0I;
    public final C91634cM A0J;
    public final C91674cQ A0K;
    public final C96434nK A0L;
    public final AnonymousClass6SU A0M;
    public final C95464l7 A0N;
    public final C95514le A0O;
    public final ShapePickerRecyclerView A0P;
    public final ShapePickerView A0Q;
    public final C104635An A0R;
    public final C104995Cw A0S;
    public final AnonymousClass5Cv A0T;
    public final C129156Fn A0U = new C162897pK(this, 0);
    public final AnonymousClass1BB A0V;
    public final AnonymousClass1N2 A0W;
    public final C34831hi A0X = C36441kJ.A0s(C36381kD.A0j());
    public final C19770wU A0Y;
    public final Map A0Z = AnonymousClass001.A0J();
    public final Map A0a = AnonymousClass001.A0J();
    public final Set A0b = C36441kJ.A17();
    public final ConcurrentHashMap A0c = C90524aI.A0s();
    public final ConcurrentHashMap A0d = C90524aI.A0s();
    public final ConcurrentHashMap A0e;
    public final C117475mK A0f = new C117475mK(this);
    public final AnonymousClass1HA A0g;

    public static ArrayList A00(AnonymousClass6XN r5, AnonymousClass68B r6) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = r6.A05.iterator();
        while (it.hasNext()) {
            A0I2.add(new C146796wB(C90504aG.A0U(it), r5.A0g));
        }
        return A0I2;
    }

    public static void A01(AnonymousClass6XN r5, Collection collection, boolean z) {
        LinkedHashSet A17 = C36441kJ.A17();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C146796wB r2 = new C146796wB(C90504aG.A0U(it), r5.A0g);
            r5.A0e.put(r2.BIB(), r2);
            A17.add(r2);
        }
        if (z) {
            Set set = r5.A0b;
            A17.addAll(set);
            set.clear();
        }
        Set<C161307mX> set2 = r5.A0b;
        set2.addAll(A17);
        AnonymousClass6vC r3 = r5.A0G;
        synchronized (r3) {
            Map map = r3.A00;
            map.clear();
            for (C161307mX A002 : set2) {
                AnonymousClass6vC.A00(A002, map);
            }
        }
    }

    public static void A02(AnonymousClass6XN r4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C146796wB r2 = (C146796wB) it.next();
            r4.A0e.put(r2.BIB(), r2);
        }
    }

    public AnonymousClass6XN(Activity activity, ViewGroup viewGroup, AnonymousClass012 r28, AnonymousClass016 r29, C18820ts r30, AnonymousClass1H2 r31, C20810yC r32, MediaComposerFragment mediaComposerFragment, C104655Aq r34, AnonymousClass6vC r35, C158457gx r36, ShapePickerView shapePickerView, C104635An r38, AnonymousClass1HA r39, AnonymousClass1BB r40, AnonymousClass1AP r41, AnonymousClass1N2 r42, C19770wU r43) {
        Activity activity2 = activity;
        this.A05 = activity2;
        this.A0D = r32;
        AnonymousClass1N2 r22 = r42;
        this.A0W = r22;
        C19770wU r3 = r43;
        this.A0Y = r3;
        this.A0C = r31;
        C104655Aq r20 = r34;
        this.A0F = r20;
        C18820ts r24 = r30;
        this.A0B = r24;
        AnonymousClass1BB r9 = r40;
        this.A0V = r9;
        C104635An r23 = r38;
        this.A0R = r23;
        this.A0G = r35;
        this.A0g = r39;
        AnonymousClass012 r11 = r28;
        this.A0A = r11;
        this.A0H = r36;
        this.A09 = viewGroup;
        this.A0E = mediaComposerFragment;
        AnonymousClass016 r12 = r29;
        this.A0O = (C95514le) new AnonymousClass04H(new C138486iB(), r12).A00(C95514le.class);
        this.A0N = (C95464l7) new AnonymousClass04H(new C138486iB(), r12).A00(C95464l7.class);
        C96184mv r1 = new C96184mv(this);
        this.A0I = r1;
        ShapePickerView shapePickerView2 = shapePickerView;
        this.A0Q = shapePickerView2;
        this.A08 = C012005e.A02(shapePickerView2, R.id.shape_picker_gradient);
        this.A07 = C012005e.A02(shapePickerView2, R.id.shape_picker_header);
        ShapePickerRecyclerView shapePickerRecyclerView = (ShapePickerRecyclerView) C012005e.A02(shapePickerView2, R.id.shapes);
        this.A0P = shapePickerRecyclerView;
        shapePickerRecyclerView.setAdapter(r1);
        ArrayList A002 = C129866It.A00();
        this.A0e = C90524aI.A0s();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            C161307mX r4 = (C161307mX) it.next();
            this.A0e.put(r4.BIB(), r4);
        }
        this.A0S = new C104995Cw((RecyclerView) shapePickerView2.findViewById(R.id.emoji_shape_subcategories_recyclerview), this.A0f, this.A0P);
        AnonymousClass1AP r15 = r41;
        AnonymousClass5Cv r0 = new AnonymousClass5Cv((RecyclerView) shapePickerView2.findViewById(R.id.sticker_shape_subcategories_recyclerview), this.A0f, this.A0P, r15);
        this.A0T = r0;
        this.A03 = r0;
        r0.A01 = true;
        AnonymousClass6Q0.A00(r0);
        C96434nK r13 = new C96434nK(this.A05, this);
        this.A0L = r13;
        this.A0P.A0v(r13);
        this.A0P.setItemAnimator((C02800By) null);
        C165177t0.A00(r11, this.A0O.A00, this, 46);
        C165177t0.A00(r11, this.A0O.A02, this, 43);
        C165187t1.A01(r11, this.A0O.A01, this, 0);
        C95514le r02 = this.A0O;
        C106565Kj r16 = new C106565Kj(r02.A00, r02.A01, r02.A02, r20, r15);
        this.A02 = r16;
        r16.A00 = this.A0O;
        C36391kE.A1Q(r16, r3);
        C165177t0.A00(r11, this.A0N.A03, this, 49);
        C165177t0.A00(r11, this.A0N.A01, this, 45);
        C165187t1.A01(r11, this.A0N.A02, this, 1);
        C165177t0.A00(r11, this.A0N.A00, this, 48);
        this.A0M = new AnonymousClass6SU(activity2, this.A07, r11, r12, r24, r23, r22, this.A0X);
        C165177t0.A00(r11, this.A0X, this, 47);
        C36341k9.A10(shapePickerView2, R.id.shape_picker_header_background, 0);
        this.A08.setVisibility(8);
        this.A0P.setClipToPadding(true);
        this.A0P.A0t(new C96294n6(this, this.A05.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), this.A05.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), C36401kF.A1X(r24)));
        r9.registerObserver(this.A0U);
        HandlerThread handlerThread = new HandlerThread("Shapes Thread", 1);
        this.A06 = handlerThread;
        handlerThread.start();
        this.A0K = new C91674cQ(activity2, handlerThread.getLooper(), this);
        this.A0J = new C91634cM(activity2.getMainLooper(), this);
        int A022 = C36361kB.A02(this.A05, R.dimen.f7nameremoved);
        for (int min = Math.min(((AnonymousClass000.A0X(this.A05).widthPixels * AnonymousClass000.A0X(this.A05).heightPixels) / (A022 * A022)) + 1, A002.size() - 1); min >= 0; min--) {
            Message obtain = Message.obtain(this.A0K, 0, 0, 0, (Object) null);
            String BIB = ((C161307mX) A002.get(min)).BIB();
            Bundle A072 = AnonymousClass001.A07();
            A072.putString("tag_bundle_key", BIB);
            obtain.setData(A072);
            obtain.sendToTarget();
        }
    }
}
