package com.whatsapp.calling.callrating.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass6XP;
import X.C001700s;
import X.C1028652i;
import X.C116995lX;
import X.C130806Mm;
import X.C18740tg;
import X.C20810yC;
import X.C27631Pa;
import X.C34831hi;
import X.C36321k7;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C90474aD;
import X.C90494aF;
import android.os.Bundle;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.extension.WamCallExtended;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public final class CallRatingViewModel extends AnonymousClass04R {
    public C27631Pa A00;
    public C130806Mm A01;
    public AnonymousClass6XP A02;
    public C20810yC A03;
    public WamCall A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final C001700s A08 = C36441kJ.A0Z(C1028652i.A00);
    public final C001700s A09 = C36431kI.A0S();
    public final C001700s A0A = C36441kJ.A0Z(C36381kD.A0j());
    public final C116995lX A0B = new C116995lX();
    public final C34831hi A0C = C36441kJ.A0s(C90494aF.A0U());
    public final ArrayList A0D = AnonymousClass001.A0I();
    public final HashSet A0E = C36441kJ.A16();

    public final boolean A0S(Bundle bundle) {
        WamCall wamCall;
        String str;
        if (this.A03.A0E(1939)) {
            wamCall = new WamCallExtended();
        } else {
            wamCall = new WamCall();
        }
        Bundle bundle2 = bundle.getBundle("event");
        Class<?> cls = wamCall.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList A0I = AnonymousClass001.A0I();
        if (WamCallExtended.class == cls && cls.getSuperclass() != null) {
            Collections.addAll(A0I, cls.getSuperclass().getDeclaredFields());
        }
        Collections.addAll(A0I, declaredFields);
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && !Modifier.isFinal(modifiers)) {
                String name = field.getName();
                C18740tg.A06(bundle2);
                try {
                    field.set(wamCall, bundle2.get(name));
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        }
        wamCall.newEndCallSurveyVersion = C90474aD.A0Y();
        this.A04 = wamCall;
        String A0t = C36371kC.A0t(C27631Pa.A00(this.A00), "call_rating_last_call");
        WamCall wamCall2 = this.A04;
        if (wamCall2 != null) {
            str = wamCall2.callRandomId;
        } else {
            str = null;
        }
        if (str == null || !str.equals(A0t)) {
            this.A05 = bundle.getString("timeSeriesDir");
            this.A07 = bundle.getBoolean("uploadFieldStat", false);
            WamCall wamCall3 = this.A04;
            if (wamCall3 != null) {
                wamCall3.userRating = C36411kG.A0t();
            }
            return true;
        }
        Log.i("{CallRatingViewModel}/ignore duplicate ratings");
        return false;
    }

    public CallRatingViewModel(C27631Pa r2, C130806Mm r3, AnonymousClass6XP r4, C20810yC r5) {
        C36321k7.A0x(r5, r4);
        AnonymousClass00C.A0D(r2, 4);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
